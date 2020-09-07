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

package org.eclipse.jetty.client;

import org.eclipse.jetty.util.Callback;
import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.eclipse.jetty.util.annotation.ManagedObject;

@ManagedObject
public class DuplexConnectionPool extends AbstractConnectionPool
{
    public DuplexConnectionPool(HttpDestination destination, int maxConnections, Callback requester)
    {
        this(destination, maxConnections, true, requester);
    }

    public DuplexConnectionPool(HttpDestination destination, int maxConnections, boolean cache, Callback requester)
    {
        super(destination, maxConnections, cache, requester);
    }

    @Override
    @ManagedAttribute(value = "The maximum amount of times a connection is used before it gets closed")
    public int getMaxUsageCount()
    {
        return super.getMaxUsageCount();
    }

    @Override
    public void setMaxUsageCount(int maxUsageCount)
    {
        super.setMaxUsageCount(maxUsageCount);
    }
}