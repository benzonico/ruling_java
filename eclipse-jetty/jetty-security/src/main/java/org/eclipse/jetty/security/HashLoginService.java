//
// ========================================================================
// Copyright (c) 1995-2020 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under
// the terms of the Eclipse Public License 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0
//
// This Source Code may also be made available under the following
// Secondary Licenses when the conditions for such availability set
// forth in the Eclipse Public License, v. 2.0 are satisfied:
// the Apache License v2.0 which is available at
// https://www.apache.org/licenses/LICENSE-2.0
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

package org.eclipse.jetty.security;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jetty.server.UserIdentity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Properties User Realm.
 * <p>
 * An implementation of UserRealm that stores users and roles in-memory in HashMaps.
 * <p>
 * Typically these maps are populated by calling the load() method or passing a properties resource to the constructor. The format of the properties file is:
 *
 * <pre>
 *  username: password [,rolename ...]
 * </pre>
 *
 * Passwords may be clear text, obfuscated or checksummed. The class com.eclipse.Util.Password should be used to generate obfuscated passwords or password
 * checksums.
 * <p>
 * If DIGEST Authentication is used, the password must be in a recoverable format, either plain text or OBF:.
 */
public class HashLoginService extends AbstractLoginService
{
    private static final Logger LOG = LoggerFactory.getLogger(HashLoginService.class);

    private String _config;
    private boolean hotReload = false; // default is not to reload
    private UserStore _userStore;
    private boolean _userStoreAutoCreate = false;

    public HashLoginService()
    {
    }

    public HashLoginService(String name)
    {
        setName(name);
    }

    public HashLoginService(String name, String config)
    {
        setName(name);
        setConfig(config);
    }

    public String getConfig()
    {
        return _config;
    }

    /**
     * Load realm users from properties file.
     * <p>
     * The property file maps usernames to password specs followed by an optional comma separated list of role names.
     * </p>
     *
     * @param config uri or url or path to realm properties file
     */
    public void setConfig(String config)
    {
        _config = config;
    }

    /**
     * Is hot reload enabled on this user store
     *
     * @return true if hot reload was enabled before startup
     */
    public boolean isHotReload()
    {
        return hotReload;
    }

    /**
     * Enable Hot Reload of the Property File
     *
     * @param enable true to enable, false to disable
     */
    public void setHotReload(boolean enable)
    {
        if (isRunning())
        {
            throw new IllegalStateException("Cannot set hot reload while user store is running");
        }
        this.hotReload = enable;
    }

    /**
     * Configure the {@link UserStore} implementation to use.
     * If none, for backward compat if none the {@link PropertyUserStore} will be used
     *
     * @param userStore the {@link UserStore} implementation to use
     */
    public void setUserStore(UserStore userStore)
    {
        updateBean(_userStore, userStore);
        _userStore = userStore;
    }

    @Override
    protected String[] loadRoleInfo(UserPrincipal user)
    {
        UserIdentity id = _userStore.getUserIdentity(user.getName());
        if (id == null)
            return null;

        Set<RolePrincipal> roles = id.getSubject().getPrincipals(RolePrincipal.class);
        if (roles == null)
            return null;

        List<String> list = roles.stream()
            .map(rolePrincipal -> rolePrincipal.getName())
            .collect(Collectors.toList());

        return list.toArray(new String[roles.size()]);
    }

    @Override
    protected UserPrincipal loadUserInfo(String userName)
    {
        UserIdentity id = _userStore.getUserIdentity(userName);
        if (id != null)
        {
            return (UserPrincipal)id.getUserPrincipal();
        }

        return null;
    }

    @Override
    protected void doStart() throws Exception
    {
        super.doStart();

        // can be null so we switch to previous behaviour using PropertyUserStore
        if (_userStore == null)
        {
            if (LOG.isDebugEnabled())
                LOG.debug("doStart: Starting new PropertyUserStore. PropertiesFile: {} hotReload: {}", _config, hotReload);
            PropertyUserStore propertyUserStore = new PropertyUserStore();
            propertyUserStore.setHotReload(hotReload);
            propertyUserStore.setConfig(_config);
            setUserStore(propertyUserStore);
            _userStoreAutoCreate = true;
        }
    }

    /**
     * To facilitate testing.
     *
     * @return the UserStore
     */
    UserStore getUserStore()
    {
        return _userStore;
    }

    /**
     * To facilitate testing.
     *
     * @return true if a UserStore has been created from a config, false if a UserStore was provided.
     */
    boolean isUserStoreAutoCreate()
    {
        return _userStoreAutoCreate;
    }

    @Override
    protected void doStop() throws Exception
    {
        super.doStop();
        if (_userStoreAutoCreate)
        {
            setUserStore(null);
            _userStoreAutoCreate = false;
        }
    }
}