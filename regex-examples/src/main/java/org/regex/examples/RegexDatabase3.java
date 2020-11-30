package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase3 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/linlurui/entityQueryable/blob/20298394a4f08bb7a3791569452898acb2a17b38/src/entity/query/core/DataSourceFactory.java#L320
    Pattern.compile("\\s*<![^<>]+>"),
    // https://github.com/linlurui/entityQueryable/blob/20298394a4f08bb7a3791569452898acb2a17b38/src/entity/query/core/DataSourceFactory.java#L34
    Pattern.compile("jdbc:(mysql|sqlserver|db2|oracle|couchbase|derby|hive2|postgresql|sybase|sqlite|microsoft:sqlserver)(:\\w+:)?@?:?(//|\\(|:)?([\\w+\\.\\-_]+|\\w:)(:\\d+)?(/|;\\s*DatabaseName=|:|[\\w=\\(\\)\\s]+)([\\w\\-_\\.]+)"),
    // https://github.com/caller79/rest-utils/blob/5637ffb17920977efc689beb461d3738619eb014/src/main/java/io/github/caller79/numericrange/NumericRangeFactory.java#L13
    Pattern.compile("(?<range>[\\[\\(](-?[0-9]+(\\.[0-9]+)?)?(,(-?[0-9]+(\\.[0-9]+)?)?)?[\\)\\]])"),
    // https://github.com/caller79/rest-utils/blob/5637ffb17920977efc689beb461d3738619eb014/src/main/java/io/github/caller79/numericrange/NumericRangeFactory.java#L15
    Pattern.compile("^(?<ranges>(?<range>[\\[\\(](-?[0-9]+(\\.[0-9]+)?)?(,(-?[0-9]+(\\.[0-9]+)?)?)?[\\)\\]]))+$"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/controller/multipart/validator/ItemMultipartValidator.java#L26
    Pattern.compile("[a-zA-Z0-9]{4,12}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/controller/multipart/validator/ItemMultipartValidator.java#L35
    Pattern.compile("[A-Z]{3,6}"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L39
    Pattern.compile("^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L45
    Pattern.compile("^(\\d{3,4}-)?\\d{6,8}$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L51
    Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L57
    Pattern.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L63
    Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L69
    Pattern.compile("[a-zA-z]+://[^\\s]*"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L75
    Pattern.compile("^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/text/TextValidator.java#L81
    Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/utils/src/main/java/org/springside/modules/utils/number/UnitConverter.java#L36
    Pattern.compile("(\\d+)([a-zA-Z]+)?"),
    // https://github.com/ctt-gob-es/integra/blob/76cadec0920ee3753996c8c265fa2090651f363c/Integra-parent/Integra-tsl/src/main/java/es/gob/afirma/tsl/utils/UtilsRFC2253.java#L78
    Pattern.compile("((\\\\([[\\,\\=\\+\\<\\>\\#\\;]\\\\\\'([0-9a-fA-F]{2})]){1}){1,})"),
    // https://github.com/ctt-gob-es/integra/blob/76cadec0920ee3753996c8c265fa2090651f363c/Integra-parent/Integra-tsl/src/main/java/es/gob/afirma/tsl/utils/UtilsRFC2253.java#L73
    Pattern.compile("(\\\\([[\\,\\=\\+\\<\\>\\#\\;]\\\\\\'([0-9a-fA-F]{2})]){1})"),
    // https://github.com/ctt-gob-es/integra/blob/76cadec0920ee3753996c8c265fa2090651f363c/Integra-parent/Integra-tsl/src/main/java/es/gob/afirma/tsl/utils/UtilsRFC2253.java#L68
    Pattern.compile("([0-9a-fA-F]{2})"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/utils/SlugUtils.java#L20
    Pattern.compile("[^\\w-]"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/utils/SlugUtils.java#L21
    Pattern.compile("[\\s]"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/utils/SlugUtils.java#L51
    Pattern.compile("[\\?\\\\/:|<>\\*\\[\\]\\(\\)\\$%\\{\\}@~\\.]"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/utils/SlugUtils.java#L50
    Pattern.compile("[^(a-zA-Z0-9\\u4e00-\\u9fa5\\.\\-)]"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/utils/MarkdownUtils.java#L70
    Pattern.compile("^---[\\s\\S]*?---"),
    // https://github.com/seafloorlao/blog/blob/99d34f0fe71387575434a5f31d53143b9e9ea24c/src/main/java/run/halo/app/service/impl/BasePostServiceImpl.java#L58
    Pattern.compile("\t|\r|\n"),
    // https://github.com/edsonmoreirajr/nosso-banco-digital-zup/blob/097136cc7d2ac032b537967cbd308c0197d3af0b/src/main/java/br/com/zup/nossobancodigitalzup/core/validation/CepValidator.java#L11
    Pattern.compile("[0-9]{5}-[0-9]{3}"),
    // https://github.com/pollishulya/test-project/blob/725b30d77210115a448df9100292c280dadccef2/src/com/company/validator/PhoneValidator.java#L12
    Pattern.compile("^(\\+375|80)(29|25|44|33)(\\d{3})(\\d{2})(\\d{2})$"),
    // https://github.com/lhh143400/design_mode/blob/61dbfe3c5d8250a41ec25d064485c6eb67487e32/design_mode_backend/dev_web/src/main/java/com/ylz/springboot/utils/IpUtil.java#L18
    Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})"),
    // https://github.com/207f20/L9102/blob/630ac191de16f03b24f2f2dcaba9b581c3f8fecd/Week10/src/fsm/FSMExercise3.java#L41
    Pattern.compile("^(ab){3}(.*):(2|3|4)+(end)+$"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/model/util/HTMLManager.java#L16
    Pattern.compile("\\$([a-zA-Z_]\\w*)"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/model/util/HTMLManager.java#L17
    Pattern.compile("<link rel=\"stylesheet\" href=\"(.*)\">"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/model/util/HTMLManager.java#L18
    Pattern.compile("url\\(\"(.*)\"\\)"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/model/util/HTMLManager.java#L19
    Pattern.compile("<script type=\"text/javascript\" src=\"(.*)\"></script>"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/model/quantity/UnitValue.java#L179
    Pattern.compile("\\d|\\."),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/controller/MainframeController.java#L476
    Pattern.compile("^(<|>|\\s)+|/(<|>|\\s)+$"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/controller/MainframeController.java#L481
    Pattern.compile("\\s*(emf|I|R|P)\\s*=\"\\s*([0-9]+(\\.[0-9]+)?)\\s*[a-zA-Z]+\\s*\"\\s*"),
    // https://github.com/ThePyProgrammer/phytonUI/blob/096e3dcc574b289fc3c3a54f735b39f5f92f85e1/src/application/controller/MainframeController.java#L482
    Pattern.compile("\\s*(x|y|angle)\\s*=\\s*\"\\s*([0-9]+(\\.[0-9]+)?)\\s*\"\\s*"),
    // https://github.com/leeshen64/lcmdemeter/blob/25229285bea2b5fdd6e8e88e28b0c2a65f6d40fc/demeter_commons_util/src/main/java/com/sercomm/commons/util/DateTime.java#L30
    Pattern.compile("(\\+|-)[0-9]{4}"),
    // https://github.com/leeshen64/lcmdemeter/blob/25229285bea2b5fdd6e8e88e28b0c2a65f6d40fc/demeter_commons_id/src/main/java/com/sercomm/commons/id/NameRule.java#L9
    Pattern.compile("[0-9a-zA-Z]{1,}-[0-9a-zA-Z]{12}", Pattern.CASE_INSENSITIVE),
    // https://github.com/theanasuddin/DimikOJ/blob/621217493884179f0d4cfcfd88a3a83caaed2c73/Problem52.java#L22
    Pattern.compile("\\s{2,}"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L39
    Pattern.compile("([^\\d.]*\\/)?((?<ip>(?:\\d{1,3}\\.){3}\\d{1,3})(:\\d{1,5})?(?!\\d|\\.))(\\/.*)?"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L43
    Pattern.compile("(?<ip>(\\p{XDigit}{1,4}::?){1,7}\\p{XDigit}{0,4}|::((\\p{XDigit}{1,4}:){0,6}\\p{XDigit}{1,4})?)"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L44
    Pattern.compile("\\[(?<ip>(\\p{XDigit}{1,4}::?){1,7}\\p{XDigit}{0,4}|::((\\p{XDigit}{1,4}:){0,6}\\p{XDigit}{1,4})?)\\]"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L45
    Pattern.compile("([^\\d.]*\\/)\\[(?<ip>(\\p{XDigit}{1,4}::?){1,7}\\p{XDigit}{0,4}|::((\\p{XDigit}{1,4}:){0,6}\\p{XDigit}{1,4})?)\\]((:\\d{1,5})?(?!\\d|\\.))(\\/.*)?"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L52
    Pattern.compile("[0:]++0*+1"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/HardcodedIpCheck.java#L53
    Pattern.compile("[0:]++"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/StorageManagerService.java#L458
    Pattern.compile("(?i)(^/storage/[^/]+/(?:([0-9]+)/)?Android/(?:data|media|obb|sandbox)/)([^/]+)(/.*)?"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/StatementService/src/com/android/statementservice/retriever/Relation.java#L37
    Pattern.compile("^[a-z0-9_.]+$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/StatementService/src/com/android/statementservice/retriever/Relation.java#L38
    Pattern.compile("^([a-z0-9_.]+)$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/StatementService/src/com/android/statementservice/IntentFilterVerificationReceiver.java#L65
    Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java#L2413
    Pattern.compile("[\\s]*name[\\s]*=[\\s]*\\?[\\s]*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java#L2416
    Pattern.compile("[\\s]*\\([\\s]*name[\\s]*=[\\s]*\\?[\\s]*\\)[\\s]*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java#L2419
    Pattern.compile("[\\s]*\\([\\s]*name[\\s]*=[\\s]*['\"].*['\"][\\s]*\\)[\\s]*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java#L2422
    Pattern.compile("[\\s]*name[\\s]*=[\\s]*['\"].*['\"][\\s]*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/utils/PowerUtilTest.java#L43
    Pattern.compile("Should last until about (\\d)+:?(\\d)* ((AM)*)|((PM)*) based on your usage \\(\\d?\\d%\\)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/utils/PowerUtilTest.java#L43
    Pattern.compile("Should last until about (\\d)+:?(\\d)* ((AM)*)|((PM)*) \\(\\d?\\d%\\)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/utils/PowerUtilTest.java#L43
    Pattern.compile("Should last until about (\\d)+:?(\\d)* ((AM)*)|((PM)*) based on your usage( \\(\\d?\\d%\\)){0}"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/utils/PowerUtilTest.java#L43
    Pattern.compile("Should last until about (\\d)+:?(\\d)* ((AM)*)|((PM)*)( \\(\\d?\\d%\\)){0}"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/utils/PowerUtilTest.java#L45
    Pattern.compile("Battery may run out by (\\d)+:?(\\d)* ((AM)*)|((PM)*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/SettingsLib/src/com/android/settingslib/DeviceInfoUtils.java#L82
    Pattern.compile("(#\\d+) (?:.*?)?((Sun|Mon|Tue|Wed|Thu|Fri|Sat).+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/packages/BackupEncryption/test/robolectric/src/com/android/server/backup/encryption/testing/DiffScriptProcessor.java#L54
    Pattern.compile("^\\d+(-\\d+)?$"),
    // https://github.com/flyway/flyway/blob/cbd761035eb8cd846652ea1f875eca4ad01bc478/flyway-core/src/main/java/org/flywaydb/core/internal/database/mysql/MySQLParser.java#L31
    Pattern.compile("^CREATE\\s(((DEFINER\\s@\\s)?(PROCEDURE|FUNCTION|EVENT))|TRIGGER)", Pattern.CASE_INSENSITIVE),
    // https://github.com/xwiki/xwiki-platform/blob/4b9e54a700baf31e4659ae8c3c1a22d261214d53/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/objects/BaseObjectReference.java#L70
    Pattern.compile("(\\\\*)\\[(\\d*)\\]$"),
    // https://github.com/xwiki/xwiki-platform/blob/4b9e54a700baf31e4659ae8c3c1a22d261214d53/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/doc/XWikiDocument.java#L281
    Pattern.compile("</?+(html|img|a|i|br?|embed|script|form|input|textarea|object|font|li|[dou]l|table|center|hr|p) ?([^>]*+)>"),
    // https://github.com/xwiki/xwiki-platform/blob/4b9e54a700baf31e4659ae8c3c1a22d261214d53/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/doc/XWikiDocument.java#L7927
    Pattern.compile("^[ \\t]*+(1(\\.1){0,1}+)[ \\t]++(.++)$", Pattern.MULTILINE),
    // https://github.com/artipie/management-api/blob/8c322cdac002fa2f078d7696a5b48711d6869eb5/src/main/java/com/artipie/management/api/ApiPermission.java#L44
    Pattern.compile("(?:/api/\\w+|/dashboard)?/(?<user>[^/.]+)(?:/.*)?"),
    // https://github.com/artipie/management-api/blob/8c322cdac002fa2f078d7696a5b48711d6869eb5/src/main/java/com/artipie/management/api/ApiChangeUserPassword.java#L60
    Pattern.compile("/api/users/(?<user>[^/.]+)/password"),
    // https://github.com/dmitriyermoshin19/job4j_pooh/blob/507f2537ab578ada2ebf9e6875a84bb02f5b517f/src/main/java/ru/job4j/Handler.java#L13
    Pattern.compile("^(POST /queue/)(.+)"),
    // https://github.com/dmitriyermoshin19/job4j_pooh/blob/507f2537ab578ada2ebf9e6875a84bb02f5b517f/src/main/java/ru/job4j/Handler.java#L14
    Pattern.compile("^(POST /topic/)(.+)"),
    // https://github.com/lmstestrat/testrepo/blob/4775b99fb828693959303da390e623fb51579437/app/src/main/java/org/moire/opensudoku/game/CellCollection.java#L65
    Pattern.compile("^\\d{81}$"),
    // https://github.com/lmstestrat/testrepo/blob/4775b99fb828693959303da390e623fb51579437/app/src/main/java/org/moire/opensudoku/game/CellCollection.java#L66
    Pattern.compile("^version: 1\\n((?#value)\\d\\|(?#note)((\\d,)+|-)\\|(?#editable)[01]\\|){0,81}$"),
    // https://github.com/lmstestrat/testrepo/blob/4775b99fb828693959303da390e623fb51579437/app/src/main/java/org/moire/opensudoku/game/CellCollection.java#L67
    Pattern.compile("^version: 2\\n((?#value)\\d\\|(?#note)(\\d){1,3}\\|{1,2}(?#editable)[01]\\|){0,81}$"),
    // https://github.com/lmstestrat/testrepo/blob/4775b99fb828693959303da390e623fb51579437/app/src/main/java/org/moire/opensudoku/game/CellCollection.java#L68
    Pattern.compile("^version: 3\\n((?#value)\\d\\|(?#note)(\\d){1,3}\\|(?#editable)[01]\\|){0,81}$"),
    // https://github.com/Vtal9/WeatherCurrencyPredictService/blob/1c66ca9ec92663b4d61b57cfe529ce4daea9f744/src/main/java/edu/phystech/weatherCurrencyPredictService/Services/CurrencyService.java#L42
    Pattern.compile("Доллар США</Name><Value>([0-9]*.[0-9]*)"),
    // https://github.com/eifow/opsBackup/blob/011c81b6128f417180c3cf8722e589ea7a58e2b7/src/ops/search/SearchDAO.java#L44
    Pattern.compile("([a-zA-Z\\s]+)"),
    // https://github.com/eifow/opsBackup/blob/011c81b6128f417180c3cf8722e589ea7a58e2b7/src/ops/search/SearchDAO.java#L45
    Pattern.compile("([가-힣\\s]+)"),
    // https://github.com/vaadin/flow/blob/9e2a67a8f1c32515cd2a6ede45a070c565d18dfd/flow-server/src/main/java/com/vaadin/flow/internal/ResponseWriter.java#L55
    Pattern.compile("^bytes=((\\d*-\\d*\\s*,\\s*)*\\d*-\\d*\\s*)$"),
    // https://github.com/vaadin/flow/blob/9e2a67a8f1c32515cd2a6ede45a070c565d18dfd/flow-server/src/main/java/com/vaadin/flow/internal/ResponseWriter.java#L57
    Pattern.compile("(\\d*)-(\\d*)"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L63
    Pattern.compile("\\| -+"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L64
    Pattern.compile("\\| "),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L65
    Pattern.compile(" \\|"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L68
    Pattern.compile("- "),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L70
    Pattern.compile("[*0-9]\\d*\\. "),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L77
    Pattern.compile("\\\\!\\[.*\\\\]\\(.+\\)"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L79
    Pattern.compile("\\[|\\]\\(.*?\\)"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L81
    Pattern.compile("`"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L91
    Pattern.compile("&nbsp;"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L117
    Pattern.compile("<html>|</html>"),
    // https://github.com/Darian1996/darian-lucene-file/blob/643ae772d06ebf2141d5d55bcb7bdd4c83ac38c1/src/main/java/com/darian/darianlucenefile/other/RegularExpressionsUtils.java#L125
    Pattern.compile("\\[|\\]\\(.*\\)"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/test/java/de/plushnikov/intellij/plugin/AbstractLombokParsingTestCase.java#L174
    Pattern.compile("lombok.*"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/thirdparty/LombokUtils.java#L25
    Pattern.compile("^(?:nonnull)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/thirdparty/LombokUtils.java#L26
    Pattern.compile("^(?:nullable|checkfornull)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/thirdparty/LombokUtils.java#L28
    Pattern.compile("^(?:deprecated)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/processor/clazz/log/CustomLogParser.java#L65
    Pattern.compile("(?:\\(([A-Z,]*)\\))"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/handler/OnXAnnotationHandler.java#L14
    Pattern.compile("__*"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/handler/OnXAnnotationHandler.java#L15
    Pattern.compile("Cannot resolve symbol '__*'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/handler/OnXAnnotationHandler.java#L16
    Pattern.compile("Cannot resolve method '(onMethod|onConstructor|onParam)_+'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L27
    Pattern.compile("Incompatible types\\. Found: '__*', required: 'lombok.*AnyAnnotation\\[\\]'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L103
    Pattern.compile("Unhandled exceptions?: .+"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L141
    Pattern.compile("Variable '.+' might not have been initialized"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L169
    Pattern.compile("Variable '.+' initializer '.+' is redundant"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L186
    Pattern.compile("Method invocation '.*' will produce 'NullPointerException'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L217
    Pattern.compile("'.+' can be simplified to '.+'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L218
    Pattern.compile("Condition '.+' is always '(true|false)'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/extension/LombokHighlightErrorFilter.java#L256
    Pattern.compile("Method invocation '.+' (may|will) produce 'NullPointerException'"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/src/main/java/de/plushnikov/intellij/plugin/Version.java#L32
    Pattern.compile("(.*:)([\\d.]+)(.*)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-release/maven-release-manager/src/main/java/org/apache/maven/shared/release/versions/DefaultVersionInfo.java#L95
    Pattern.compile("^((?:\\d+\\.)*\\d+)([-_])?([a-zA-Z]*)([-_])?(\\d*)(?:([-_])?(.*?))?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-release/maven-release-manager/src/main/java/org/apache/maven/shared/release/versions/DefaultVersionInfo.java#L111
    Pattern.compile("^(SNAPSHOT|[a-zA-Z]+[_-]SNAPSHOT)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-release/maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom/JDomModelETL.java#L91
    Pattern.compile("<([^!][^>]*?)\\s{2,}([^>]*?)>"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-release/maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom/JDomModelETL.java#L92
    Pattern.compile("(\\s{2,})/>"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-release/maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom/JDomModelETL.java#L133
    Pattern.compile("(?s)((?:(?:\\s++)|(?:<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>)|(?:<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]))*+>)|(?:<!--(?:[^-]|(?:-[^-]))*+-->)|(?:<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>))*)(.*?)((?:(?:\\s++)|(?:<!--(?:[^-]|(?:-[^-]))*+-->)|(?:<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>))*)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-plugin-tools/maven-plugin-tools-java/src/test/resources/MPLUGIN-290/Test.java#L25
    Pattern.compile("a"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-plugin-tools/maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java#L203
    Pattern.compile("\\{@(\\w+)\\s*([^\\}]*)\\}"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-plugin-tools/maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java#L217
    Pattern.compile("(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-plugin-tools/maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java#L65
    Pattern.compile("[^-]+\\.class"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-invoker-plugin/src/main/java/org/apache/maven/plugins/invoker/InvokerProperties.java#L46
    Pattern.compile("invoker\\.environmentVariables\\.([A-Za-z][^.]+)(\\.([0-9]+))?"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-invoker-plugin/src/main/java/org/apache/maven/plugins/invoker/InvokerProperties.java#L220
    Pattern.compile("invoker\\.toolchain\\.([^.]+)\\.(.+)"),
    // https://github.com/wujun728/jun_bigdata/blob/75db80a90e16a9dd8d3e41848a1aca47d092e866/jun_report/easyreport-engine/src/main/java/com/easytoolsoft/easyreport/engine/query/MySqlQueryer.java#L21
    Pattern.compile("limit.*?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/openjdk/aarch64-port/blob/8ddf5e172b5d3fcd0aafa50c9019ee16ef038825/src/jdk.compiler/share/classes/com/sun/tools/javac/processing/JavacProcessingEnvironment.java#L1754
    Pattern.compile("(\\P{all})+"),
    // https://github.com/czhd/lichuan_wxapp/blob/abc821ca87732835573c3282b0dd1eca5d906c15/api/src/main/java/io/github/talelin/common/interceptor/LoggerImpl.java#L31
    Pattern.compile("(?<=\\{)[^}]*(?=})"),
    // https://github.com/harshitchheda-savitar/jsp/blob/7e285856e0a72bf9e6fadcd7284c23a0096597fc/MyFirstServletProject/src/main/java/com/login/LoginServlet.java#L21
    Pattern.compile("^[A-Z]\\w{2,}$"),
    // https://github.com/harshitchheda-savitar/jsp/blob/7e285856e0a72bf9e6fadcd7284c23a0096597fc/MyFirstServletProject/src/main/java/com/login/LoginServlet.java#L22
    Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L14
    Pattern.compile("(?<!\\w)(THIS|T|S|R|K|V|RESULT|VALUE|SCOPE|EVENTOBJ|TYPE|DEFAULT)_[123](?!\\w)"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L15
    Pattern.compile(" => ([);])"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L16
    Pattern.compile("opt_(\\w+): "),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L40
    Pattern.compile("import IE_BUTTON_MAP = IEButtonMap;\r?\n\\s+export \\{ IE_BUTTON_MAP };"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L45
    Pattern.compile(" {4}([A-Z_]+)"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L49
    Pattern.compile("export ([^<]+)<T, R>\\((.*)string \\| TagName<T>(.*)\\): R( \\| null)?;"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L50
    Pattern.compile("export ([^<]+)<T, R>\\((.*)string \\| TagName<T>(.*)\\): (Array(?:Like)?)<R>( \\| null)?;"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L52
    Pattern.compile("(\\s{2,}[A-Z_]+): number;"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L53
    Pattern.compile("const ([A-Z_]+): number;"),
    // https://github.com/DreierF/closure-es6-converter/blob/ab9f1e96a66e3ac54173013c427c6b0553ddb556/es6-module-converter/src/main/java/eu/cqse/DeclarationFixer.java#L59
    Pattern.compile("Element\\(value: any\\): ([^;]+);"),
    // https://github.com/Despical/Commons-Box/blob/1fbe1edb0748d1c4eeffeb55ad933139073dfb28/src/main/java/me/despical/commonsbox/string/StringMatcher.java#L85
    Pattern.compile("&?#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})"),
    // https://github.com/ooojerryooo/fabric-java-sdk-gm/blob/8bd54816274b02ede1ad2b6ada356536740306ed/src/main/java/org/hyperledger/fabric/sdk/Channel.java#L1306
    Pattern.compile("^lscc$"),
    // https://github.com/ooojerryooo/fabric-java-sdk-gm/blob/8bd54816274b02ede1ad2b6ada356536740306ed/src/main/java/org/hyperledger/fabric/sdk/Channel.java#L1306
    Pattern.compile("^upgrade$"),
    // https://github.com/bewillcott/mdj/blob/9e5719404002f4d8e8cb1f2521ef6ce9af03ad4c/core/src/main/java/com/bewsoftware/mdj/core/TextEditor.java#L104
    Pattern.compile("(.*?)\\t"),
    // https://github.com/bewillcott/mdj/blob/9e5719404002f4d8e8cb1f2521ef6ce9af03ad4c/core/src/main/java/com/bewsoftware/mdj/core/TableRow.java#L54
    Pattern.compile("^(?:\\[#(?<id>\\w+)\\])?$"),
    // https://github.com/bewillcott/mdj/blob/9e5719404002f4d8e8cb1f2521ef6ce9af03ad4c/core/src/main/java/com/bewsoftware/mdj/core/TableRow.java#L62
    Pattern.compile("^(?:\\[#(?<id>\\w*)?\\])?\\[(?<border>(?<borderWidth>\\d+)(?:(?:[, ][ ]*)(?<cellPadding>\\d+))?)?\\]$"),
    // https://github.com/bewillcott/mdj/blob/9e5719404002f4d8e8cb1f2521ef6ce9af03ad4c/core/src/main/java/com/bewsoftware/mdj/core/TableRow.java#L89
    Pattern.compile("^(?:\\[#(?<id>\\w*)?\\])?\\[(?<classes>[^\\]]+)\\]$"),
    // https://github.com/ArgusYan/argus-frame/blob/ef2e631a6fa539e996d0a161024fbb4f7b4ac920/src/test/java/modules/webTestBase/BaseFunction.java#L91
    Pattern.compile("\\w*xpath=(.*?), using=\\w*"),
    // https://github.com/RafalWrzesniak/MyMovieManager/blob/3142cce3c3410b51a822bd4d128b88f85d034d3c/core/src/main/java/MoviesAndActors/Movie.java#L94
    Pattern.compile("^movie(\\d+)$"),
    // https://github.com/InkTeam/file-preview/blob/076124113929143c05da5209a40ae1b9534d6735/jodconverter-web/src/main/java/cn/keking/utils/ZipReader.java#L36
    Pattern.compile("^\\d+"),
    // https://github.com/InkTeam/file-preview/blob/076124113929143c05da5209a40ae1b9534d6735/jodconverter-core/src/main/java/org/artofsolving/jodconverter/process/LinuxProcessManager.java#L32
    Pattern.compile("^\\s*(\\d+)\\s+(.*)$"),
    // https://github.com/weispring/learn/blob/1ff1472355cc3bc44a812ce61a2b4f270eda7240/learn-interview/src/main/java/com/lxc/learn/doc/test/DemoB.java#L20
    Pattern.compile("\\d+\\.?\\d*"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L709
    Pattern.compile("(</b>|<b>|\\.html)"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L840
    Pattern.compile("<title>Watch ([^<>\"]+)</title>", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L1665
    Pattern.compile("\\$\\.post\\(\\s*\"/ddl\"", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L2069
    Pattern.compile(".+_t\\.[A-Za-z]{3,4}$"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L2220
    Pattern.compile("(https?://[^/]+[^\"]+[a-z0-9]{60}/v\\.mp4)", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L2223
    Pattern.compile("\"(https?://[^/]+/[a-z0-9]{60}/[^\"]+)\"", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L2922
    Pattern.compile(".*?(nlimited|Ilimitado).*?"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L3018
    Pattern.compile(">\\s*(\\d+ years?, )?(\\d+ days?, )?(\\d+ hours?, )?(\\d+ minutes?, )?\\d+ seconds\\s*<", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L3180
    Pattern.compile("/api/account/info\\?key=([a-z0-9]+)"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L3945
    Pattern.compile("\\d{4}\\-\\d{2}\\-\\d{2} \\d{2}:\\d{2}:\\d{2}"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/plugins/components/XFileSharingProBasic.java#L4285
    Pattern.compile("^[a-z0-9]{16,}$"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L324
    Pattern.compile("^\\-?\\d+\\\\\\. .+"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L364
    Pattern.compile("<jd:orgfilename\\s*/?\\s*>"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L379
    Pattern.compile("<jd:orgpackagename\\s*/?\\s*>"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L411
    Pattern.compile("<jd:orgfiletype/?>"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L430
    Pattern.compile("<jd:orgfilenamewithoutext/?>"),
    // https://github.com/mirror/jdownloader/blob/3d33814d424ad9526b9999a7750482401d2e3f55/src/org/jdownloader/controlling/packagizer/PackagizerController.java#L492
    Pattern.compile("<jd:append/?>"),
    // https://github.com/arbitre125/shogi/blob/76b7bff1074cbfcca1540fdb5d96b4aae69d499a/modules/compression/src/main/java/game/Encoder.java#L26
    Pattern.compile("([NBKRQ])?([a-h])?([1-8])?x?([a-h][1-8])(?:=([NBRQK]))?[\\+#]?"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L24
    Pattern.compile("Station +(.*)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L25
    Pattern.compile("(.*)\\. {5,}(https:[^ ]+) {3,}.*"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L26
    Pattern.compile("(?:(Station [^/:]+) / )?([A-Z]+\\s+(?:Adr:|adr:|Box:).*)", Pattern.DOTALL),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L27
    Pattern.compile("^([A-Z0-9 ]+): *([A-Z]+) *"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L28
    Pattern.compile("(?<!: ?)\\d\\d/\\d\\d/\\d\\d +\\d\\d:\\d\\d:\\d\\d\\b"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L29
    Pattern.compile("^(\\d\\d/\\d\\d/\\d\\d) +(\\d\\d:\\d\\d:\\d\\d) +~TO~ [A-Z0-9]+ FROM [A-Z0-9]+:\n?"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L30
    Pattern.compile("^([A-Z]+[0-9]+)[, ]"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L131
    Pattern.compile(",,+"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L132
    Pattern.compile(".*[-\\*].*|.*? .*? .*? .*? .*"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L133
    Pattern.compile("\\b(XSTRT:|low xst:|XSTS[,: ])", Pattern.CASE_INSENSITIVE),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L134
    Pattern.compile("(?<! )(?=#)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L135
    Pattern.compile("([^,]+),([^,]+)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L136
    Pattern.compile("(.*?)[- #;,'/]+(\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}|NO PHONE NUMBER)\\b(?: RESD?[:= ]| */)? *(.*)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L137
    Pattern.compile("(?:APT|UNIT|RM|LOT|SUITE) +(.*)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L138
    Pattern.compile("RESD?[:=; ]+(.*)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L139
    Pattern.compile("(.*) RESD?"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L140
    Pattern.compile("&.*|BY|EXIT.*|ON .*|CROSSING"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L141
    Pattern.compile("(.*) ([NSEW]|[NS][EW])"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L226
    Pattern.compile(" *,[ ,]*"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L227
    Pattern.compile(" *- *"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L228
    Pattern.compile("(?:XST(?:R[ST]?)?|XST|XCROSS|XSTREET|X)[-: ]+(.*)"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L229
    Pattern.compile("\\bCV +[A-Z]?(\\d)\\d\\d[A-Z]?\\b"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L345
    Pattern.compile("^[, ]+"),
    // https://github.com/cadpage/cadpage-parsers/blob/52759e28b5e396a7825164c69f589ed040fda2ac/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/PA/PABucksCountyAParser.java#L346
    Pattern.compile("[, ]+$"),
    // https://github.com/inkarnadin/cms-check-component/blob/a5dd08d50ca74c404d5d2e7f3d7d09c5855d8581/src/main/java/web/cms/wordpress/WordPressVersionProcessor.java#L39
    Pattern.compile("<meta name=\"generator\".*WordPress\\s(.*?)\" />"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/Disambiguator.java#L329
    Pattern.compile("\\[\\[(.*?)\\]\\]"),
    // https://github.com/folio-org/folio-spring-base/blob/761320b6c922a66861588fd14eaaefd5acc7ec4c/src/main/java/org/folio/spring/liquibase/FolioSpringLiquibase.java#L13
    Pattern.compile("[^a-zA-Z0-9_]"),
    // https://github.com/TBroski/AtMe/blob/d15d26fbd54f0e6fda5b479b09e83d4977394b22/jdk/jdk8_win_64/sample/nio/server/Request.java#L136
    Pattern.compile("\\A([A-Z]+) +([^ ]+) +HTTP/([0-9\\.]+)$.*^Host: ([^ ]+)$.*\r\n\r\n\\z", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/parendigo/Calculator-Java/blob/5c0f30237fd10ec674302ce94709989067848a77/src/DigitsAndSign.java#L8
    Pattern.compile("[0-9]+[0-9]?"),
    // https://github.com/m0nk3y2k4/thetvdb-java-api/blob/c2caa0ccfb4ce08c00866edc4bd81fc916f05c4c/src/main/java/com/github/m0nk3y2k4/thetvdb/internal/connection/APISession.java#L43
    Pattern.compile("^[A-Za-z0-9-_=]+\\.[A-Za-z0-9-_=]+\\.?[A-Za-z0-9-_.+/=]*$"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L73
    Pattern.compile("\\$\\{([\\w]+)\\.([\\w-.]+)}"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L109
    Pattern.compile("(nick|display|custom)[-_]?name"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L113
    Pattern.compile("role|rank|group"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L115
    Pattern.compile("next[_-]?(role|rank|group)"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L125
    Pattern.compile("rank|role|group"),
    // https://github.com/UltraVanilla/UltraVanilla/blob/72db3e1013ae57071d280a44e56d140f68d060df/src/main/java/com/akoot/plugins/ultravanilla/EventListener.java#L276
    Pattern.compile("@([a-zA-Z0-9_]{2,})"),
    // https://github.com/danielwahrn/Rideshare/blob/d96f5fd1182dc93a34b4f9ef1dc622d86bf7ed54/mobile/passenger/app/src/main/java/com/joiint/user/profile/EditProfile.java#L131
    Pattern.compile(".*[0-9].*"),
    // https://github.com/danielwahrn/Rideshare/blob/d96f5fd1182dc93a34b4f9ef1dc622d86bf7ed54/mobile/passenger/app/src/main/java/com/joiint/user/Utils/Utilities.java#L235
    Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{8,}"),
    // https://github.com/danielwahrn/Rideshare/blob/d96f5fd1182dc93a34b4f9ef1dc622d86bf7ed54/mobile/passenger/app/src/main/java/com/joiint/user/Activities/AddCard.java#L73
    Pattern.compile("([0-9]{0,4})|([0-9]{4}-)+|([0-9]{4}-[0-9]{0,4})+"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L238
    Pattern.compile("([^_A-Z])([A-Z])"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L266
    Pattern.compile("\\{0\\}"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L267
    Pattern.compile("\\{1\\}"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L362
    Pattern.compile(":WHERE_FIELDS"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L368
    Pattern.compile(":SORT_FIELDS"),
    // https://github.com/air-tech/spring-dynamicdq-lib/blob/a646216034a88f9172fbbd11700f87c9cce6d7b1/src/main/java/com/airtech/dynamicdq/service/DataService.java#L374
    Pattern.compile(":PAGEABLE"),
    // https://github.com/Melvout/newspaper-desktop-app/blob/9dc871fb01b839a4299b4f48b514437a1532f84e/src/application/utils/JsonArticle.java#L208
    Pattern.compile("<body[^>]*>(.*)</body>"),
    // https://github.com/liuliang0519/guli-parent0621/blob/ff61225bf26a1ec69fe05e9fbc5d062b31f1580e/service/service_ucenter/src/main/java/com/atguigu/ucenterservice/controller/MemberWxController.java#L127
    Pattern.compile("[a-zA-Z0-9\u4e00-\u9fa5]"),
    // https://github.com/AbuZaitoun/SportLand/blob/bb089d3c59f809cf80d910d63a746ba831d04c5c/app/src/main/java/com/anaszaitoun/sportlandgym/Activities/WorkoutDetailActivity.java#L100
    Pattern.compile("(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200C\u200B2F|youtu.be%2F|%2Fv%2F)[^#\\&\\?\\n]*"),
    // https://github.com/biasj/contador-palavra/blob/bd2d44f3eccf35fa1dd556666700301c9cd3f511/src/classes/FreqPalavra.java#L57
    Pattern.compile("[a-zA-ZÀ-ú]+"),
    // https://github.com/mattmalec/Pterodactyl4J/blob/797b6af6bef273f949cd02bc667c581b3badff2a/src/main/java/com/mattmalec/pterodactyl4j/requests/Route.java#L119
    Pattern.compile("\\{.*?\\}"),
    // https://github.com/miroslavuzunov/Inventory-Management-System/blob/fe199db0484b180c87a45aa3da26e84b0f1f7ad1/src/main/java/ims/services/UserRegistrationService.java#L134
    Pattern.compile("[\\(\\)]"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/test/org/wikipedia/miner/annotation/AnnotationExperiments.java#L97
    Pattern.compile("\\{\\{Featured article"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/test/org/wikipedia/miner/annotation/AnnotationExperiments.java#L99
    Pattern.compile("\\{\\{Exzellent"),
    // https://github.com/nrc-cnrc/java-utils/blob/048bb88ba3ce7c79b6d4a8882ed564f619b42c32/java-utils-core/src/main/java/ca/nrc/file/ResourceGetter.java#L58
    Pattern.compile("%20"),
    // https://github.com/nrc-cnrc/java-utils/blob/048bb88ba3ce7c79b6d4a8882ed564f619b42c32/java-utils-core/src/main/java/ca/nrc/file/ResourceGetter.java#L61
    Pattern.compile("^/([A-Z]\\:/)"),
    // https://github.com/nrc-cnrc/java-utils/blob/048bb88ba3ce7c79b6d4a8882ed564f619b42c32/java-utils-core/src/main/java/ca/nrc/file/ResourceGetter.java#L271
    Pattern.compile("\\.jar![\\s\\S]*$"),
    // https://github.com/nrc-cnrc/java-utils/blob/048bb88ba3ce7c79b6d4a8882ed564f619b42c32/java-utils-core/src/main/java/ca/nrc/debug/ExceptionHelpers.java#L16
    Pattern.compile("^([\\s\\S]+) \\(No such file or directory\\)"),
    // https://github.com/apache/camel/blob/45f9e4c0b5e55bdaf59208f5447d1baa3941a16a/core/camel-core-languages/src/main/java/org/apache/camel/language/simple/SimpleExpressionBuilder.java#L57
    Pattern.compile("([+-])([^+-]+)"),
    // https://github.com/apache/camel/blob/56ee00e8540a8383f125e53b9e612a7ff302ab71/core/camel-util/src/main/java/org/apache/camel/util/OgnlHelper.java#L30
    Pattern.compile("^(.*)\\[(.*)\\]$"),
    // https://github.com/Omkeshwari97/User-Registration/blob/6a89a5bda5ffe81f0c2d5734b27a1838b78b298f/UserRegistration.java#L8
    Pattern.compile("^[A-Z]{1}[a-zA-z]{2,}"),
    // https://github.com/Omkeshwari97/User-Registration/blob/6a89a5bda5ffe81f0c2d5734b27a1838b78b298f/UserRegistration.java#L20
    Pattern.compile("^[a-z0-9_-]+[.|+]?[a-z0-9_-]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$"),
    // https://github.com/Omkeshwari97/User-Registration/blob/6a89a5bda5ffe81f0c2d5734b27a1838b78b298f/UserRegistration.java#L33
    Pattern.compile("[0-9]{2}[ ][789][0-9]{9}"),
    // https://github.com/Omkeshwari97/User-Registration/blob/6a89a5bda5ffe81f0c2d5734b27a1838b78b298f/UserRegistration.java#L45
    Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/tests/AssertionsCompletenessCheck.java#L119
    Pattern.compile("as.*+|using.*+|with.*+|describedAs|overridingErrorMessage|extracting"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/spring/SpringAntMatcherOrderCheck.java#L43
    Pattern.compile("[?*{]"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/spring/SpringAntMatcherOrderCheck.java#L136
    Pattern.compile("([.(){}+|^$\\[\\]\\\\])"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/helpers/Javadoc.java#L50
    Pattern.compile("^@return(\\s++)?(?<descr>.+)?"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/helpers/Javadoc.java#L51
    Pattern.compile("^@param\\s++(?<name>\\S*)(\\s++)?(?<descr>.+)?"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/helpers/Javadoc.java#L52
    Pattern.compile("^(?:@throws|@exception)\\s++(?<name>\\S*)(\\s++)?(?<descr>.+)?"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/helpers/Javadoc.java#L104
    Pattern.compile("^@\\S+.*"),
    // https://github.com/SonarSource/sonar-java/blob/f0e8e99db61a359ff4ba0d50dd2085ec46bb8c60/java-checks/src/main/java/org/sonar/java/checks/helpers/Javadoc.java#L257
    Pattern.compile("(?m)^\\s*\\*"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/FXCssTests/src/test/css/utils/FXCSSCoverage.java#L250
    Pattern.compile("(-fx(-\\w+)+)"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/FXCssTests/src/test/css/utils/FXCSSCoverage.java#L251
    Pattern.compile(">(-fx[^<]*)<"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/FXCssTests/src/test/css/utils/FXCSSCoverage.java#L253
    Pattern.compile("/\\*[^*]*\\*+([^/*][^*]*\\*+)*/"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/FxmlTests/src/test/fxmltests/cover/SpecParser.java#L134
    Pattern.compile("\\<assert\\s+id=\"([^\"]+)\"\\s+group=\"([^\"]+)\"\\s*\\>(.+?)\\</assert\\>"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/common/src/java/org/apache/hadoop/hive/common/type/HiveIntervalYearMonth.java#L153
    Pattern.compile("([+|-])?(\\d+)-(\\d+)"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/contrib/src/java/org/apache/hadoop/hive/contrib/serde2/s3/S3LogDeserializer.java#L70
    Pattern.compile("(\\S+) (\\S+) \\[(.*?)\\] (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) \"(.+)\" (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) \"(.*)\" \"(.*)\""),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/appBundlerTestsJDK9/appBundlerTestsJDK9/src/com/oracle/appbundlers/utils/installers/MacAbstractBundlerUtils.java#L266
    Pattern.compile("\\n"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/tools/FxTestRunner/src/client/test/runner/RunUITestFinder.java#L190
    Pattern.compile("[\\/\\\\]"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/tools/HtmlTestRunner/src/htmltestrunner/ManualTest.java#L103
    Pattern.compile("<(Blanket|Session|Oneshot|No)>"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/core/src/main/java/org/apache/hive/hcatalog/mapreduce/HCatFileUtil.java#L34
    Pattern.compile("(\\$\\{)([^\\s/\\{\\}\\\\]+)(\\})"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/tools/SharedTestUtilsOpen/src/test/javaclient/shared/Utils.java#L119
    Pattern.compile("[\\.,: _()]"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/Server.java#L1071
    Pattern.compile("[a-zA-Z]\\w*"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/Server.java#L1073
    Pattern.compile("[a-zA-Z0-9][\\w\\.\\-]*(?<!\\-)(?<!\\.)(?<!\\_)$"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java#L60
    Pattern.compile("<a href=\"(taskdetails.jsp\\?.*?)\">"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java#L62
    Pattern.compile("Last 8KB</a><br/><a href=\"(.*?tasklog\\?attemptid=.*?)\">All</a>"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java#L64
    Pattern.compile("attemptid=(.*)?&"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java#L66
    Pattern.compile("<td>(\\d{1,2}-[A-Za-z]{3}-\\d{4} \\d{2}:\\d{2}:\\d{2})(<br/>)?</td>"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java#L68
    Pattern.compile("<td>(\\d{1,2}-[A-Za-z]{3}-\\d{4} \\d{2}:\\d{2}:\\d{2}) \\(.*\\)(<br/>)?</td>"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/itests/util/src/main/java/org/apache/hadoop/hive/scripts/extracturl.java#L33
    Pattern.compile("<a href=\"http://([\\w\\d]+\\.html)\">link</a>", Pattern.CASE_INSENSITIVE),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/equiv/generators/SongTitleTransform.java#L12
    Pattern.compile("(.*) \\(?((f|F)eat(|uring)|transcribed)\\.? ([^)]+)\\)?.*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L21
    Pattern.compile("(\\d+)-(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L55
    Pattern.compile("http://www.channel4.com/programmes/(\\d+)/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L56
    Pattern.compile("([a-zA-Z0-9-/]+?)(-series-\\d+)?(-episode-\\d+)?"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L58
    Pattern.compile("http://www.channel4.com/programmes/([^\\./&=]+)(?:/episode-guide/(series-\\d+)(?:/(episode-\\d+))?)?"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L59
    Pattern.compile("http://www.channel4.com/programmes/([^\\./&=]+)/4od#([^\\./&=]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L154
    Pattern.compile("https?://.*vimeo.com/([^\\./&=]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L167
    Pattern.compile("https?://.*dailymotion.com/video/([^\\./&=]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L188
    Pattern.compile("https?://.*hulu.com/watch/([^\\./&=]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L189
    Pattern.compile("https?://.*hulu.com/([a-z\\-]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L207
    Pattern.compile("https?://.*ted.com/talks/([^\\./&=]+).html"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L229
    Pattern.compile("https?://([a-z]{2})\\.wikipedia.org/([^/]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L243
    Pattern.compile("ws-b:(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L254
    Pattern.compile("http://wsarchive.bbc.co.uk/brands/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L269
    Pattern.compile("ws-e:(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L280
    Pattern.compile("http://wsarchive.bbc.co.uk/episodes/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L295
    Pattern.compile("redux:(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L306
    Pattern.compile("http://g.bbcredux.com/programme/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L320
    Pattern.compile("btfeatured:(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L321
    Pattern.compile("http://featured.bt.com/products/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L349
    Pattern.compile("pa:(b|s|f|e)-([\\d-]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L367
    Pattern.compile("http://pressassociation.com/(brands|series|films|episodes)/([\\d-]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/query/content/PerPublisherCurieExpander.java#L424
    Pattern.compile("http://www.channel4.com/programmes/atoz/([a-z]|0-9)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/bbc/BbcFeeds.java#L22
    Pattern.compile("/([a-z]\\d+[a-z0-9]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/bliptv/BlipTvAdapter.java#L39
    Pattern.compile("http://blip.tv/file/[\\d]+"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/bliptv/BlipTvAdapter.java#L40
    Pattern.compile("(http://blip.tv/file/[\\d]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/bt/channels/ChannelRestrictionGroupSaver.java#L144
    Pattern.compile("[^\\p{Alnum}]+"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtoZFeedIterator.java#L27
    Pattern.compile("https?://[^.]*\\.channel4\\.com/[^/]*/atoz/(.+/page-\\d+).atom.*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomApi.java#L38
    Pattern.compile("^http://.*/pmlsd/(.*)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomApi.java#L43
    Pattern.compile("^.*/pmlsd/([^/]+/episode-guide/series-\\d+/episode-\\d+).atom.*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomApi.java#L56
    Pattern.compile("https?://.+\\.channel4\\.com/(.+?)\\d+x\\d+(\\.[a-zA-Z]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomApi.java#L57
    Pattern.compile("https?://.+\\.channel4.com/bips/(\\d+x\\d+)/videos/.*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomEntryVersionExtractor.java#L38
    Pattern.compile("tag:pmlsc\\.channel4\\.com,\\d+:clip\\/(.+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomEntryVersionExtractor.java#L126
    Pattern.compile("start=(.*); end=(.*); scheme=W3C-DTF"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomEntryVersionExtractor.java#L35
    Pattern.compile("%VIDEOID%"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4AtomFeedUriExtractor.java#L36
    Pattern.compile("^\\d+-\\d+$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4BroadcastBuilder.java#L27
    Pattern.compile("tag:([^,]+),(\\d{4}):slot/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4BroadcastBuilder.java#L82
    Pattern.compile("tag:.*,\\d{4}:slot/(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/C4LinkBrandNameExtractor.java#L14
    Pattern.compile("https?://.+\\.channel4\\.com/[^/]+/([^./]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/channel4/pmlsd/epg/C4EpgEntryUriExtractor.java#L17
    Pattern.compile("https?://(.+).channel4.com/([^/]+)/([^./]+)(.atom|/4od.atom|/episode-guide/series-(\\d+)(.atom|/episode-(\\d+).atom))"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/dailymotion/DailyMotionItemAdapter.java#L40
    Pattern.compile("http://www.dailymotion.com/video/[^/\\s\\.]+"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/dailymotion/DailyMotionItemAdapter.java#L40
    Pattern.compile("http://www.dailymotion.com/(.*)/(video/[^/\\s\\.]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/facebook/FacebookAdapter.java#L26
    Pattern.compile("https?://graph.facebook.com/(.+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/facebook/FacebookBrandExtractor.java#L36
    Pattern.compile(" and |,|&|;"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/facebook/FacebookBrandExtractor.java#L128
    Pattern.compile("(.*) \\(([^)]+)\\)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/five/FiveBrandProcessor.java#L52
    Pattern.compile(".*\\((\\d{4})\\)$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hbo/HboItemAdapter.java#L18
    Pattern.compile("http://www.hbo.com/([a-z\\-A-Z0-9]+)/episodes/([0-9]+)/([0-9]+)\\-([a-z\\-A-Z0-9]+)/index.html"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/HuluFeed.java#L8
    Pattern.compile("(http://www.hulu.com/watch/\\d+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/HuluItemAdapter.java#L40
    Pattern.compile("(http://www.hulu.com/watch/\\d+)\\/?.*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/HuluItemContentExtractor.java#L34
    Pattern.compile("^.*Season\\s*(\\d+).*Ep\\.\\s*(\\d+)\\|(\\d+):(\\d+):?(\\d*)\\|.*$", Pattern.UNIX_LINES|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/HuluOembedGraphExtractor.java#L33
    Pattern.compile("value=\"(http://www.hulu.com/embed/.+?)\""),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/HuluRssAdapter.java#L26
    Pattern.compile("^(.*watch\\/\\d+)\\/.*$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/WritingHuluBrandAdapter.java#L41
    Pattern.compile("(http://www.hulu.com/).+?\\/([a-z\\-]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/WritingHuluBrandAdapter.java#L42
    Pattern.compile("(http://www.hulu.com/[a-z\\-]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/hulu/WritingHuluBrandAdapter.java#L40
    Pattern.compile("http://www.hulu.com/[a-z\\-]+"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itunes/ItunesEpfFileUpdater.java#L148
    Pattern.compile("itunes\\d{8}"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itunes/ItunesEpfFileUpdater.java#L149
    Pattern.compile("pricing\\d{8}"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itv/ItvMercuryBrandAdapter.java#L17
    Pattern.compile("http://www.itv.com/itvplayer/video.*Filter=(.+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itv/ItvMercuryBrandExtractor.java#L24
    Pattern.compile(".*\\d+x\\d+(/.+.jpg)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itv/ItvMercuryEpisodeAdapter.java#L15
    Pattern.compile("https?://www.itv.com/itvplayer/video/?.*Filter=(\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/itv/ItvMercuryEpisodeExtractor.java#L28
    Pattern.compile("/Date\\((\\d+)\\)/"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/knowledgemotion/KnowledgeMotionCsvTranslator.java#L54
    Pattern.compile("([^,]+)(, )?"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/msnvideo/MsnVideoItemAdapter.java#L28
    Pattern.compile("http://video.uk.msn.com/watch/video/([\\w\\-\\+%]+)/(\\w+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/music/musicbrainz/MusicBrainzProcessor.java#L34
    Pattern.compile("\\t"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/PaBaseProgrammeUpdater.java#L70
    Pattern.compile("^.*(\\d{8})_tvdata.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/PaChannelMap.java#L17
    Pattern.compile("^http://pressassociation.com/channels/(\\d+)$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/PaDeltaFileHelper.java#L22
    Pattern.compile("^(\\d{12})_\\d{8}_tvdata.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/archives/PaArchivesUpdater.java#L47
    Pattern.compile("^.*(\\d{12})_.+_tvarchive.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/channels/PaChannelsUpdater.java#L34
    Pattern.compile("^.*(\\d{12})_tv_channel_data.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/deletes/PaContentDeactivationPredicate.java#L21
    Pattern.compile(".*/([0-9]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/features/PaIdentifiedComparator.java#L18
    Pattern.compile("^http:\\/\\/pressassociation.com\\/\\d+$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/features/PaIdentifiedComparator.java#L19
    Pattern.compile("^http:\\/\\/pressassociation.com\\/films\\/\\d+$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/people/PaCompletePeopleUpdater.java#L35
    Pattern.compile("^.*(\\d{8})_profiles_full_dump.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/pa/people/PaCompletePeopleUpdater.java#L36
    Pattern.compile("^.*(\\d{8})_profiles.xml$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/rte/RteParser.java#L17
    Pattern.compile(".*:(\\d+)$"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/rte/RteParser.java#L23
    Pattern.compile("\\s+Season\\s+\\d+\\s*,\\s*Episode\\s+\\d+\\s*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/ted/TedTalkAdapter.java#L39
    Pattern.compile("http://www.ted.com/talks/([^\\s/]+).html"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/ted/TedTalkAdapter.java#L42
    Pattern.compile("http://www.ted.com/talks/lang/eng/([^\\s/]+).html"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/ted/TedTalkClient.java#L82
    Pattern.compile("hs:\\\"(.*?)\\.flv"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/tvblob/TVBlobDayAdapter.java#L17
    Pattern.compile("http://epgadmin.tvblob.com/api/(\\w+)/programmes/schedules/(.+)(\\.\\w*)?"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/vimeo/VimeoOembedGraphExtractor.java#L33
    Pattern.compile("data=\"(http://vimeo.com/moogaloop.swf\\?clip_id=\\d+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/film/FilmInfoboxScraper.java#L214
    Pattern.compile("(\\d{1,2}) ([A-Z]?[a-z]+),? (\\d{4})"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/film/FilmInfoboxScraper.java#L215
    Pattern.compile("([A-Z]?[a-z]+) (\\d{1,2}),? (\\d{4})"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/television/SeasonSectionScraper.java#L45
    Pattern.compile("\\s*((season|series) (\\d+)).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/wikiparsers/FetchMeister.java#L214
    Pattern.compile("^\\s*\\#REDIRECT\\s*\\[\\[([^\\]]*)\\]\\]\\n*.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/wikiparsers/SwebleHelper.java#L186
    Pattern.compile("\\[\\[|\\]\\]|\\|.+|File:"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/wikiparsers/SwebleHelper.java#L281
    Pattern.compile("\\s*\\{\\{\\s*(end)?plainlist\\s*(\\}\\}|\\|)\\s*", Pattern.CASE_INSENSITIVE),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/wikiparsers/SwebleHelper.java#L282
    Pattern.compile("\\s*\\}\\}\\s*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/wikipedia/wikiparsers/SwebleHelper.java#L283
    Pattern.compile("\\{\\{.*\\}\\}"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/youtube/YouTubeAdapter.java#L36
    Pattern.compile("http://www\\.youtube\\.com/watch\\?v=[^\\./&=]+"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/youtube/YouTubeGDataClient.java#L73
    Pattern.compile("v=([^&]*)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/youtube/YoutubeUriCanonicaliser.java#L28
    Pattern.compile("https?://.*\\.youtube.com.*v=([^\\./&=]+).*"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/youtube/YoutubeUriCanonicaliser.java#L29
    Pattern.compile("tag:youtube.com,\\d+:\\w+:([^\\./&=]+)"),
    // https://github.com/atlasapi/atlas/blob/e598084036b37a6bb3bf9026bb8a1a0c643a3987/src/main/java/org/atlasapi/remotesite/youview/YouViewContentExtractor.java#L42
    Pattern.compile("^New: "),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/errors/DataCorruptErrorHeuristic.java#L39
    Pattern.compile("split:\\s*([^\\s]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/errors/TaskLogProcessor.java#L204
    Pattern.compile("^\tat .*", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/errors/TaskLogProcessor.java#L206
    Pattern.compile("^\t... [0-9]+ more.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/mr/Throttle.java#L78
    Pattern.compile("<dogc>", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/mr/Throttle.java#L85
    Pattern.compile("</dogc>", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColLikeStringScalar.java#L61
    Pattern.compile("([^_%]+)%"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColLikeStringScalar.java#L76
    Pattern.compile("%([^_%]+)"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColLikeStringScalar.java#L91
    Pattern.compile("%([^_%]+)%"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColLikeStringScalar.java#L106
    Pattern.compile("[^%_]+"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColLikeStringScalar.java#L123
    Pattern.compile("(%?[^%_\\\\]+%?)+"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L36
    Pattern.compile("([^\\[\\]\\\\(){}*?+|$^.]+)\\.\\*"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L78
    Pattern.compile("\\.\\*([^\\[\\]\\\\(){}*?+|$^.]+)"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L93
    Pattern.compile("\\.\\*([^\\[\\]\\\\(){}*?+|$^.]+)\\.\\*"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L152
    Pattern.compile("(\\\\d|\\\\\\(|\\\\\\)|-| )+"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L153
    Pattern.compile("\\\\\\)"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L153
    Pattern.compile("\\\\\\("),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L153
    Pattern.compile("\\\\d"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/exec/vector/expressions/FilterStringColRegExpStringScalar.java#L36
    Pattern.compile("([^\\[\\]\\\\(){}*?+|$^.]+)"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/history/HiveHistoryUtil.java#L68
    Pattern.compile("(\\w+)=\"[[^\"]?]+\""),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/plan/BucketMapJoinContext.java#L103
    Pattern.compile("^[^=]+=[^=]+$"),
    // https://github.com/jruby/warbler/blob/31ada01b5a329e00181d702009400df1fa445bbb/ext/WarblerJar.java#L156
    Pattern.compile("^[a-z][a-z0-9]+:"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFJson.java#L62
    Pattern.compile("^([a-zA-Z0-9_\\-\\:\\s]+).*"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFJson.java#L63
    Pattern.compile("\\[([0-9]+|\\*)\\]"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/ql/src/test/org/apache/hadoop/hive/ql/exec/vector/util/FakeVectorRowBatchFromObjectIterables.java#L148
    Pattern.compile("decimal(?:\\((\\d+)(?:\\,(\\d+))?\\))?", Pattern.CASE_INSENSITIVE),
    // https://github.com/mheath/adbcj/blob/669b302c106551287cf2352101f3e131bb858015/postgresql/codec/src/main/java/org/adbcj/postgresql/codec/backend/BackendMessageDecoder.java#L174
    Pattern.compile("(\\w+)\\s*(\\d*)\\s*(\\d*)"),
    // https://github.com/iNPUTmice/Conversations/blob/464c79ac9e3b6a41d56055c36d575a2c79fa23d4/src/main/java/eu/siacs/conversations/http/AesGcmURLStreamHandler.java#L15
    Pattern.compile("([A-Fa-f0-9]{2}){48}|([A-Fa-f0-9]{2}){44}"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/onejar/com/simontuffs/onejar/JarClassLoader.java#L364
    Pattern.compile("\\.[^\\.]*$"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/onejar/com/simontuffs/onejar/JarClassLoader.java#L507
    Pattern.compile("\\$\\{([^\\}]*)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/onejar/com/simontuffs/onejar/JarClassLoader.java#L830
    Pattern.compile("/\\./"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/onejar/com/simontuffs/onejar/JarClassLoader.java#L835
    Pattern.compile("([^/]*/\\.\\./)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L71
    Pattern.compile("(?si).*paypal.*"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L100
    Pattern.compile("[0-9]+(\\.[0-9])?%"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L136
    Pattern.compile("([0-9]+\\.[0-9]+|(?i)free)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L382
    Pattern.compile("^(Purchased|Bid).*"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L383
    Pattern.compile("^Purchased.*"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L392
    Pattern.compile("([0-9]+)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/DeprecatedEbayAuction.java#L466
    Pattern.compile("([\\(\\s\\)])+"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/ebayBidder.java#L172
    Pattern.compile("%[A-F][A-F0-9]%A0"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/auction/server/ebay/ebayServer.java#L178
    Pattern.compile("Member Id: (.*)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L61
    Pattern.compile("<%que (\\w+)%>(.*)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L86
    Pattern.compile("<%pname%>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L85
    Pattern.compile("<%toc%>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L84
    Pattern.compile("<%body%>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L83
    Pattern.compile("<%que ([0-9]+)%>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/ui/JBHelp.java#L101
    Pattern.compile("<%res:([^%]+)%>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTML.java#L34
    Pattern.compile("(?i)href=\"([^\"#]*)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTML.java#L722
    Pattern.compile(".*img.*src=\"(.*?)\".*"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTML.java#L744
    Pattern.compile("^https?://[a-z]+.ebay.[a-z.]+/(?:itm/)?[A-Za-z0-9-]+/[0-9]+(\\?.*)?"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTMLParser.java#L169
    Pattern.compile("<title>(.*)</title>"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTMLParser.java#L222
    Pattern.compile("(<nobr>|</nobr>)"),
    // https://github.com/cyberfox/jbidwatcher/blob/2816fb9d78fec14cb18e012c22527320a8905e7e/src/com/jbidwatcher/util/html/JHTMLParser.java#L286
    Pattern.compile("&nbsp;?"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L151
    Pattern.compile("0\\s@\\S+?(\\d+)@\\sINDI"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L152
    Pattern.compile("0\\s@\\w+@\\sFAM"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L153
    Pattern.compile("1\\sNAME\\s(.+)"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L154
    Pattern.compile("1\\sSEX\\s(\\w)"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L155
    Pattern.compile("1\\sBIRT.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L156
    Pattern.compile("2\\sDATE\\s(.+)"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L157
    Pattern.compile("1\\sDEAT.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L158
    Pattern.compile("0.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L159
    Pattern.compile("1.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L160
    Pattern.compile("1\\sMARR.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L161
    Pattern.compile("1\\sDIV.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L162
    Pattern.compile("1\\sHUSB\\s@I(\\d+).*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L163
    Pattern.compile("1\\sWIFE\\s@I(\\d+).*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FamilyTreeImporter.java#L164
    Pattern.compile("1\\sCHIL\\s@I(\\d+).*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L190
    Pattern.compile("\\s*\"name\"\\s*:\\s*\"(.*)\",?\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L191
    Pattern.compile("\\s*\"id\"\\s*:\\s*\"(.*)\",?\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L192
    Pattern.compile("\\s*\"gender\"\\s*:\\s*\"Male\",?\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L193
    Pattern.compile("\\s*\"gender\"\\s*:\\s*\"Female\",?\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L194
    Pattern.compile("\\s*\"children\"\\s*:\\s*\\[\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L195
    Pattern.compile("\\s*\"parents\"\\s*:\\s*\\[\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L196
    Pattern.compile("\\s*\"date_of_birth\"\\s*:\\s*\"(.*)\",?\\s*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L197
    Pattern.compile(".*\\[.*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L198
    Pattern.compile(".*\\].*"),
    // https://github.com/roes/familytree/blob/0ff4ff662af2522e279c9d1311aef3533d48b06d/FreeBaseImporter.java#L199
    Pattern.compile(".*},?.*"),
    // https://github.com/myabc/nbgit/blob/fea0ed6ae1641664736a0775b1fe27db35ff77aa/src/org/nbgit/util/GitUtils.java#L95
    Pattern.compile("(https*://)(\\w+\\b):(\\b\\S*)@"),
    // https://github.com/myabc/nbgit/blob/fea0ed6ae1641664736a0775b1fe27db35ff77aa/src/org/nbgit/util/HtmlFormatter.java#L118
    Pattern.compile("\\{revision\\}"),
    // https://github.com/myabc/nbgit/blob/fea0ed6ae1641664736a0775b1fe27db35ff77aa/src/org/nbgit/util/HtmlFormatter.java#L119
    Pattern.compile("\\{status\\}"),
    // https://github.com/myabc/nbgit/blob/fea0ed6ae1641664736a0775b1fe27db35ff77aa/src/org/nbgit/util/HtmlFormatter.java#L120
    Pattern.compile("\\{folder\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/common/src/main/java/org/fao/geonet/utils/Xml.java#L450
    Pattern.compile("%5C"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/common/src/main/java/org/fao/geonet/utils/Xml.java#L1113
    Pattern.compile("<(\\S+?)(.*?)>(.*?)</\\1>", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/jeeves/config/springutil/JeevesContextLoaderListener.java#L81
    Pattern.compile("[a-zA-Z0-9_\\-]+"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/jeeves/server/overrides/ConfigurationOverrides.java#L181
    Pattern.compile("\\$\\{(.+?)\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/jeeves/server/overrides/ConfigurationOverrides.java#L843
    Pattern.compile("\\$\\{env:([^\\}]*)\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/org/fao/geonet/MetadataResourceDatabaseMigration.java#L86
    Pattern.compile("(.*)\\/([a-zA-Z0-9_\\-]+)\\/([a-z]{2,3})\\/{1,2}resources.get\\?.*fname=([\\p{L}\\w\\s\\.\\-]+)(&.*|$)"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/org/fao/geonet/kernel/metadata/DefaultStatusActions.java#L52
    Pattern.compile("\\{\\{index:([^\\}]+)\\}\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/org/fao/geonet/kernel/search/log/LuceneQueryParamType.java#L286
    Pattern.compile("_op.*|_isTemplate|_locale|_owner|_groupOwner|_dummy|type"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/main/java/org/fao/geonet/services/util/z3950/GNSearchSessionFactory.java#L107
    Pattern.compile(".*\\.1\\.([0-9]+)$"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/core/src/test/java/org/fao/geonet/kernel/xlink/ISO19139KeywordReplacerTest.java#L224
    Pattern.compile(".*thesaurus=(.+?)\\&.*id=.*%2F(.+?)\\&.*"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/domain/src/main/java/org/fao/geonet/domain/ISODate.java#L74
    Pattern.compile("([0-9]{4})(-([0-2][0-9]):([0-5][0-9])([A-Z]))?"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/domain/src/main/java/org/fao/geonet/domain/ISODate.java#L77
    Pattern.compile("([0-9]{4})-([0-1][0-9])(-([0-2][0-9]):([0-5][0-9])([A-Z]))?"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/domain/src/main/java/org/fao/geonet/domain/ISODate.java#L82
    Pattern.compile("([a-zA-Z]{3}) ([a-zA-Z]{3}) ([0-9]{2}) ([0-9]{4}) ([0-2][0-9]):([0-5][0-9]):([0-5][0-9]) (.+)"),
    // https://github.com/conanite/rainbow/blob/aa37d65548d5658aa3608cfe40a1a388d793b575/src/java/rainbow/types/Symbol.java#L14
    Pattern.compile(".*([\"'; \\t\\n\\)\\(]|([^\\\\]|^)\\|).*"),
    // https://github.com/conanite/rainbow/blob/aa37d65548d5658aa3608cfe40a1a388d793b575/src/java/rainbow/types/Symbol.java#L15
    Pattern.compile(".*\\\\\\|"),
    // https://github.com/conanite/rainbow/blob/aa37d65548d5658aa3608cfe40a1a388d793b575/src/java/rainbow/types/Symbol.java#L53
    Pattern.compile("\\\\\\|"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/schemas/iso19139.che/src/main/java/org/fao/geonet/api/gm03/ISO19139CHEtoGM03Base.java#L30
    Pattern.compile("^[\\s\n\r]*$"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/schemas/iso19139.che/src/main/java/org/fao/geonet/schema/iso19139che/ISO19139cheUtil.java#L350
    Pattern.compile("(mailto:|https://|http://|ftp://|ftps://)[^\\s<>]*\\w"),
    // https://github.com/jruby/activerecord-jdbc-adapter/blob/97f84e23add067f82d7fadb6e5c8347e73db9ca3/src/java/arjdbc/oracle/OracleRubyJdbcConnection.java#L439
    Pattern.compile("\\A(?:[A-Za-z][A-z0-9$#]{0,29}\\.)?[A-Za-z][A-z0-9$#]{0,29}(?:@[A-Za-z][A-z0-9$#\\.@]{0,127})?\\Z"),
    // https://github.com/salesforce/Argus/blob/8482e570d36170453762043b818fe9844921ebf6/ArgusCore/src/main/java/com/salesforce/dva/argus/service/auth/LDAPAuthService.java#L73
    Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*(@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*)?$"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/schemas/schema-core/src/main/java/org/fao/geonet/kernel/schema/SavedQuery.java#L48
    Pattern.compile("\\{\\{(\\w*)\\}\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/AllRequestsInterceptor.java#L49
    Pattern.compile(".*(bot|crawler|baiduspider|80legs|ia_archiver|voyager|yahoo! slurp|mediapartners-google).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/records/formatters/FormatterConstants.java#L36
    Pattern.compile("[\\w0-9\\-_/]+"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/records/formatters/groovy/template/TNodeFactoryRepeat.java#L44
    Pattern.compile("\\s*\\(\\s*(\\S+)\\s*,\\s*(\\S+)\\s*\\)"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/records/formatters/groovy/template/TextContentParser.java#L45
    Pattern.compile("\\{\\{(\\s*[^}]+\\s*)\\}\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/site/LoggingApi.java#L75
    Pattern.compile("log4j(-(.*?))?\\.xml", Pattern.CASE_INSENSITIVE),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/services/metadata/UpdateAdminOper.java#L131
    Pattern.compile("_([0-9]+)_([0-9]+)"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/test/java/org/fao/services/mef/ImportWebMapTest.java#L132
    Pattern.compile("<gco:Decimal xmlns:gco=\"http://www.isotc211.org/2005/gco\">(.*)</gco:Decimal>"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/cluster/tasks-src/cc/alcina/extras/cluster/BackupFile.java#L53
    Pattern.compile("(.+)(\\.\\d+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/dev/src/cc/alcina/extras/dev/console/DevConsoleCommandsReplay.java#L31
    Pattern.compile(" {60,}(\\S.+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/dev/src/cc/alcina/extras/dev/console/DevConsoleCommandsReplay.java#L52
    Pattern.compile("(.+?)\t(.+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/jsdom/src-regex/com/google/gwt/regexp/shared/RegExp_Jvm.java#L30
    Pattern.compile("((?:^|\\G|[^$])(?:\\$\\$)*)\\$&"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/jsdom/src-regex/com/google/gwt/regexp/shared/RegExp_Jvm.java#L42
    Pattern.compile("(?:^|[^$])(?:\\$\\$)*\\$[`']"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/extras/jsdom/src-regex/com/google/gwt/regexp/shared/RegExp_Jvm.java#L49
    Pattern.compile("\\$\\$"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/apps/frontend-taglib/frontend-taglib-form-navigator/src/main/java/com/liferay/frontend/taglib/form/navigator/internal/configuration/FormNavigatorEntryConfigurationParser.java#L110
    Pattern.compile("^(?:(?<key>.*)=)?(?<value>.*)$", Pattern.MULTILINE),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/common/FileTools.java#L365
    Pattern.compile("[^0-9a-zA-Z]"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/common/metadata/PageIdentifier.java#L55
    Pattern.compile("[a-zA-Z0-9]+(?:[_\\-][a-zA-Z0-9]+)*"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/produce/GenericRequest.java#L223
    Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9\\-_]*(?:;[a-zA-Z0-9][a-zA-Z0-9\\-_]*)*"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L124
    Pattern.compile("[,.;?!:]+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L132
    Pattern.compile("_+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L135
    Pattern.compile(" _"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L136
    Pattern.compile("_ "),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L150
    Pattern.compile("\\A-+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L151
    Pattern.compile("\\A_+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L154
    Pattern.compile("-+\\z"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L155
    Pattern.compile("_+\\z"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L164
    Pattern.compile("-_"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L165
    Pattern.compile("_-"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L168
    Pattern.compile("[^0-9a-zA-Z\\-\\_]+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L173
    Pattern.compile("[^0-9a-zA-Z]+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/java/org/novelang/rendering/RenderingTools.java#L182
    Pattern.compile(" ([0-9a-zA-Z]+(?:-[0-9a-zA-Z]+)*)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/entity/src/cc/alcina/framework/entity/util/JsonPropertyAccessor.java#L160
    Pattern.compile("(.+)\\[(\\d+)\\]"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/entity/src/com/totsp/gwittir/rebind/beans/IntrospectorFilter.java#L22
    Pattern.compile("(.+\\.[A-Z].+)(\\.)([A-Z].+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/gwt/src/cc/alcina/framework/gwt/appcache/linker/AppCacheManifestLinker.java#L65
    Pattern.compile("@filter (.*)$", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/gwt/src/cc/alcina/framework/gwt/appcache/linker/AppCacheManifestLinker.java#L143
    Pattern.compile(".*?(^|/)\\.[^/]+"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/main/version/org/novelang/Version.java#L103
    Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/test/java/org/novelang/daemon/HttpDaemonFixture.java#L81
    Pattern.compile("%.*\\n"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/test/java/org/novelang/rendering/XslParametersTest.java#L109
    Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}[+\\-]\\d{2}:\\d{2}"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/engine/src/test/java/org/novelang/rendering/javascript/TagInteractionTest.java#L289
    Pattern.compile("(H\\d\\.(?:\\d\\.)?)"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/parser-facade/src/main/java/org/novelang/parser/xpath/SyntacticTreeXpath.java#L73
    Pattern.compile("((?<![0-9a-zA-Z_\\-])n:(?=\\w))"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/parser-lexeme-plugin/src/main/java/org/novelang/build/antlr/LexemeDeclarationExtractor.java#L48
    Pattern.compile("([A-Z0-9_]+) *: *(?:'(.)'|'(\\\\.)'|'(\\\\u[a-fA-F0-9]{4})') *;(?: *//(?: *&([A-Za-z0-9]+);)?+(?: *\"([a-zA-Z0-9]+)\")?+)?"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/parser-supplement/src/main/java/org/novelang/parser/SourceUnescape.java#L102
    Pattern.compile("(\\&(\\w+);)"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/parser-token-plugin/src/main/java/org/novelang/build/antlr/TokenGenerator.java#L109
    Pattern.compile("tokens(?:\\s*)\\{[^\\}]*\\}"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/primer/src/main/java/org/novelang/common/Problem.java#L60
    Pattern.compile("line (\\d+):(\\d+) (.+)"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/primer/src/main/java/org/novelang/outfit/loader/ResourceName.java#L52
    Pattern.compile("((?:\\w|-|_)+(?:(?:\\/(?:\\w|-|_)+)*)(?:\\.(?:\\w|-|_)+))"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/primer/src/main/java/org/novelang/outfit/xml/DtdTools.java#L41
    Pattern.compile("\\<\\!ENTITY\\s+(\\w+)\\s+\\\"(&#(?:\\d|\\w|\\;)+)\\\"\\s*?\\>"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/source-plugin/src/main/java/org/novelang/maven/SourceAggregatorMojo.java#L70
    Pattern.compile("Novelang-(\\w+(?:-\\w+)*)"),
    // https://github.com/caillette/novelang/blob/e58fb81acf4918e19b6500c498fd827008ce8e31/modules/unicode-generator-plugin/src/main/java/org/novelang/build/unicode/UnicodeNamesTextReader.java#L53
    Pattern.compile("(\\w{4});((?:\\w| |-|/|,|<|>|\\(|\\))*);(?:(?:\\w| |-|/|,|<|>|\\(|\\))*;){8}((?:\\w| |-|/|,|<|>|\\(|\\))*);(?:(?:\\w| |-|/|,|<|>|\\(|\\))*;){3}(?:\\w*)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/servlet/src/cc/alcina/framework/servlet/JvmSerializationPolicyBuildHelper.java#L54
    Pattern.compile("\'([A-Z0-9]){32}\'"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/servlet/src/cc/alcina/framework/servlet/job/JobId.java#L23
    Pattern.compile("(.+)::(.+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/servlet/src/cc/alcina/framework/servlet/job/JobId.java#L25
    Pattern.compile("(.+)::(\\d+)"),
    // https://github.com/nevella/alcina/blob/bb846eb19895aa73b3baaac73d0de2617eea5eb4/framework/servlet/src/cc/alcina/framework/servlet/publication/EntityCleaner.java#L100
    Pattern.compile("<!ENTITY\\s+(\\S+)\\s+CDATA\\s+\"&#(\\d+).+?-->", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/andreyvit/yoursway-sadr/blob/d4d5728c9935ef995e3f08031f2cb4f5dd65dabb/com.yoursway.sadr.python.analysis/src/com/yoursway/sadr/python/analysis/unused/typeannotations/AnnotationParser.java#L14
    Pattern.compile("[A-Za-z]+[A-Za-z,0-9]*|[*]{1,2}|\\^"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/shims/0.23/src/main/java/org/apache/hadoop/mapred/WebHCatJTShim23.java#L144
    Pattern.compile("History file.*not found"),
    // https://github.com/davidyang/yappr/blob/9828ba2af5c383e749bac29abab4ff9551d6d087/yappr/MySessionListener.java#L164
    Pattern.compile("^\\s*/(\\w+)(\\s+([\\w\\.\\:\\-]+))?"),
    // https://github.com/davidyang/yappr/blob/9828ba2af5c383e749bac29abab4ff9551d6d087/yappr/MySessionListener.java#L444
    Pattern.compile("\\<[^\\>]*\\>"),
    // https://github.com/davidyang/yappr/blob/9828ba2af5c383e749bac29abab4ff9551d6d087/yappr/MySessionListener.java#L445
    Pattern.compile("\\033\\[.*[\\d;]+m"),
    // https://github.com/davidyang/yappr/blob/9828ba2af5c383e749bac29abab4ff9551d6d087/yappr/MySessionListener.java#L446
    Pattern.compile("mailto:"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/workers/wfsfeature-harvester/src/main/java/org/fao/geonet/harvester/wfsfeatures/worker/WFSFeatureUtils.java#L37
    Pattern.compile("\\{\\{([^}]*)\\}\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/workers/wfsfeature-harvester/src/main/java/org/fao/geonet/harvester/wfsfeatures/worker/WFSFeatureUtils.java#L41
    Pattern.compile(".*(TITLE|LABEL|NAME|TITRE|NOM|LIBELLE).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/wro4j/src/main/java/org/fao/geonet/wro4j/ClosureRequireDependencyManager.java#L146
    Pattern.compile("(goog\\s*\\.\\s*provide\\s*\\(\\s*(.*?)\\s*\\))|(goog\\s*\\.\\s*require\\s*\\(\\s*(.*?)\\s*\\))"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/wro4j/src/main/java/org/fao/geonet/wro4j/GeonetWroModelFactory.java#L82
    Pattern.compile("\\{\\{(.+?)\\}\\}"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/wro4j/src/main/java/org/fao/geonet/wro4j/GeonetWroModelFactory.java#L304
    Pattern.compile("/.:/.*"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/cmp/CmpServlet.java#L96
    Pattern.compile("^/server/usage/space(/[^/]+)?(/xml)?$"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/eim/schema/text/DurationFormat.java#L42
    Pattern.compile("^[+-]?P((\\d+W)|(\\d+D)|((\\d+D)?(T(\\d+H)?(\\d+M)?(\\d+S)?))){1}$"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/server/CollectionPath.java#L44
    Pattern.compile("^/collection/([^/]+)(/.*)?$"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/server/ItemPath.java#L44
    Pattern.compile("^/(item|expanded|detached)/([^/]+)(/.*)?$"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/server/UserPath.java#L42
    Pattern.compile("^/user/([^/]+)(/.*)?$"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/main/java/org/osaf/cosmo/wsse/WsseUtils.java#L72
    Pattern.compile("UsernameToken Username=\\\"(.*)\\\", PasswordDigest=\\\"(.*)\\\", Nonce=\\\"(.*)\\\", Created=\\\"(.*)\\\""),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/testutils/ptest2/src/main/java/org/apache/hive/ptest/execution/TestCheckPhase.java#L42
    Pattern.compile("[/][^\\s]*"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/testutils/ptest2/src/main/java/org/apache/hive/ptest/execution/TestCheckPhase.java#L43
    Pattern.compile("Test.*java"),
    // https://github.com/apache/hive/blob/f37c5de6c32b9395d1b34fa3c02ed06d1bfbf6eb/testutils/ptest2/src/main/java/org/apache/hive/ptest/execution/conf/TestParser.java#L220
    Pattern.compile("([^\\.]*)\\.\\$\\{([^}]*)}"),
    // https://github.com/travis/cosmo/blob/c99c1ea86a15ffb16edafd2d60819a7272b9df09/cosmo/src/test/unit/java/org/osaf/cosmo/model/mock/MockUser.java#L47
    Pattern.compile("^[\\u0020-\\ud7ff\\ue000-\\ufffd&&[^\\u007f\\u003a;/\\\\]]+$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/DBCS.java#L38
    Pattern.compile("(?:0x)?(\\p{XDigit}++)\\s++(?:0x)?(\\p{XDigit}++)(?:\\s++#.*)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/EUC_TW.java#L81
    Pattern.compile("(?:8ea)?(\\p{XDigit}++)\\s++(\\p{XDigit}++)?\\s*+.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/HKSCS.java#L43
    Pattern.compile("(?:0x)?+(\\p{XDigit}++)\\s++(?:0x|U\\+)?+(\\p{XDigit}++)?\\s*+(?:0x|U\\+)?(\\p{XDigit}++)?\\s*+.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/JIS0213.java#L36
    Pattern.compile("0x(\\p{XDigit}++)\\s++U\\+(\\p{XDigit}++)(?:\\+(\\p{XDigit}++))?\\s++#.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/Utils.java#L58
    Pattern.compile("(?:0x)?(\\p{XDigit}++)\\s++(?:0x)?(\\p{XDigit}++)?\\s*+.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/charsetmapping/Utils.java#L215
    Pattern.compile("^\\s\\*\\/$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/jdk/src/classes/build/tools/generatecharacter/CharacterScript.java#L34
    Pattern.compile("(\\p{XDigit}+)(?:\\.{2}(\\p{XDigit}+))?\\s+;\\s+(\\w+)\\s+#.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/langtools/tools/propertiesparser/parser/MessageLine.java#L36
    Pattern.compile("( *#.*)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/make/langtools/tools/propertiesparser/parser/MessageLine.java#L37
    Pattern.compile("[-\\\\'A-Z\\.a-z ]+( \\([-A-Za-z 0-9]+\\))?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/demo/share/jfc/Font2DTest/RangeMenu.java#L249
    Pattern.compile("(^|\\W)([a-z])"),
    // https://github.com/biblelamp/JavaExercises/blob/6625a4600663e78942bdce5c687a6ad8ced36104/Experiments/SearchUsingRegExp.java#L22
    Pattern.compile("���\\s.*����"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/apps/message-boards/message-boards-parser-bbcode/src/main/java/com/liferay/message/boards/parser/bbcode/internal/BBCodeLexer.java#L44
    Pattern.compile("(?:\\[((?:[a-z]|\\*){1,16})(?:[=\\s]([^\\x00-\\x1F'<>\\[\\]]{1,2083}))?\\])|(?:\\[\\/([a-z]{1,16})\\])", Pattern.CASE_INSENSITIVE),
    // https://github.com/dustin/java-memcached-client/blob/c232307ad8e0c7ccc926e495dd7d5aad2d713318/src/main/java/net/spy/memcached/util/StringUtils.java#L40
    Pattern.compile("^-?\\d+$"),
    // https://github.com/jruby/jruby-rack/blob/710c1a4cbde684f1d0bec5907ba3071d51de0a96/src/main/java/org/jruby/rack/DefaultRackConfig.java#L85
    Pattern.compile("([123])[._]([8901234567])"),
    // https://github.com/jruby/jruby-rack/blob/710c1a4cbde684f1d0bec5907ba3071d51de0a96/src/main/java/org/jruby/rack/util/IOHelpers.java#L59
    Pattern.compile("coding:\\s*(\\S+)"),
    // https://github.com/tkmr/ffm/blob/1ce38f4bc8194e34b05650854aae55298e67153b/java/src/ffm/upnp/SOAPController.java#L19
    Pattern.compile("urn:schemas-upnp-org:service:WANIPConnection:1|urn:schemas-upnp-org:service:WANPPPConnection:1"),
    // https://github.com/tkmr/ffm/blob/1ce38f4bc8194e34b05650854aae55298e67153b/java/src/ffm/upnp/UDPController.java#L81
    Pattern.compile("LOCATION: (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/DaveMielke/NBP/blob/3d5415ac66c096ba3ed258805553adb83cea6847/calculator/src/org/nbp/calculator/ComplexEvaluator.java#L11
    Pattern.compile("[0-9]*(\\.[0-9]+)?((?<!^)[Ee][-+]?[0-9]+)?"),
    // https://github.com/DaveMielke/NBP/blob/3d5415ac66c096ba3ed258805553adb83cea6847/calculator/src/org/nbp/calculator/ComplexEvaluator.java#L56
    Pattern.compile("[0-9A-Fa-f]*(\\.[0-9A-Fa-f]+)?((?<!^)[Pp][-+]?[0-9]+)?"),
    // https://github.com/DaveMielke/NBP/blob/3d5415ac66c096ba3ed258805553adb83cea6847/calculator/src/org/nbp/calculator/ComplexFormatter.java#L69
    Pattern.compile("^([-+])?0*([0-9]*?)(?:\\.([0-9]*?)0*)?(?:[Ee]([-+])?0*([0-9]+?))?$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/share/classes/sun/security/util/Debug.java#L270
    Pattern.compile("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]=[a-zA-Z_$][a-zA-Z0-9_$]*([.][a-zA-Z_$][a-zA-Z0-9_$]*)*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/share/classes/sun/security/util/Debug.java#L270
    Pattern.compile("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]="),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/unix/classes/sun/nio/fs/MimeTypesFileTypeDetector.java#L144
    Pattern.compile("\\s*#.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/unix/classes/sun/nio/fs/MimeTypesFileTypeDetector.java#L149
    Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/unix/classes/sun/nio/fs/MimeTypesFileTypeDetector.java#L161
    Pattern.compile("\\bexts=(\"[\\p{Graph}\\p{Blank}]+?\"|\\p{Graph}+\\b)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.desktop/macosx/classes/sun/lwawt/macosx/CDataTransferer.java#L170
    Pattern.compile("<string>(.*)</string>"),
    // https://github.com/agentcoops/gridsweeper/blob/53289d7abd0486d8aa9f6549b96f7961e743b6e5/trunk/src/edu/umich/lsa/cscs/gridsweeper/GridSweeperTool.java#L74
    Pattern.compile("\\A\\s*([^=]+?)\\s*=\\s*([^=]+?)\\s*\\z"),
    // https://github.com/agentcoops/gridsweeper/blob/53289d7abd0486d8aa9f6549b96f7961e743b6e5/trunk/src/edu/umich/lsa/cscs/gridsweeper/GridSweeperTool.java#L78
    Pattern.compile("\\A(-?\\d*\\.?\\d*)\\z"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/apps/wiki/wiki-api/src/main/java/com/liferay/wiki/processor/BaseWikiPageRenameContentProcessor.java#L63
    Pattern.compile("@old_title@"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/apps/wiki/wiki-api/src/main/java/com/liferay/wiki/processor/BaseWikiPageRenameContentProcessor.java#L67
    Pattern.compile("@new_title@"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/PassVaultView.java#L1363
    Pattern.compile("file:(/.+/)PassVault.jar"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/PassVaultView.java#L1366
    Pattern.compile("file:(/.+/)PasswordStore.class"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/PassVaultView.java#L1377
    Pattern.compile("file:/(.+)/PasswordStore.class"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/resources/PasswordCheck.java#L73
    Pattern.compile(".??[a-z]"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/resources/PasswordCheck.java#L83
    Pattern.compile(".??[A-Z]"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/resources/PasswordCheck.java#L94
    Pattern.compile(".??[0-9]"),
    // https://github.com/codeprimate/password-vault/blob/1859e095ca554c8b943d2429158dec529b319dec/src/passvault/resources/PasswordCheck.java#L113
    Pattern.compile(".??[:,!,@,#,$,%,^,&,*,?,_,~]"),
    // https://github.com/sapo/sapo-broker/blob/b1f550d905dc6db57c3d2d1bda84c77216508d68/client/java-nio/src/test/java/pt/com/broker/client/nio/tests/iptables/IpTables.java#L32
    Pattern.compile("Chain ([\\w-]+) .*"),
    // https://github.com/sapo/sapo-broker/blob/b1f550d905dc6db57c3d2d1bda84c77216508d68/client/java/src/main/java/pt/com/broker/client/sample/Consumer.java#L28
    Pattern.compile("[\\n\\r]"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/BuildSamplesList.java#L53
    Pattern.compile("\\/\\*\\*(.*?)\\*\\/\\s*", Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/BuildSamplesList.java#L54
    Pattern.compile("\"(/ensemble/samples/shared-resources/[^\"]+)\"", Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/BuildSamplesList.java#L326
    Pattern.compile("([\\p{Upper}\\d])"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L440
    Pattern.compile("(&nbsp;|\\s|[ ])+"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L441
    Pattern.compile("<.*?>"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L442
    Pattern.compile("&lt;"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L443
    Pattern.compile("&gt;"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L444
    Pattern.compile("&quot;"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L445
    Pattern.compile("&apos;"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L470
    Pattern.compile("<p\\s+class=\\\"fxblurblink\\\"\\s*>.*<a\\s*href=\\\"([^\\\"]+)"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L479
    Pattern.compile("<div\\s+id=\\\"bookTitle\\\"\\s*>\\s*<h1>([^<]+)"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L486
    Pattern.compile("<h1\\s+class=\\\"chapter\\\"\\s*>([^<]+)"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L493
    Pattern.compile("a\\s+href=\\\"([^\\\"]+)\\\""),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L504
    Pattern.compile("<div class=\"subTitle\">\\s*([^<]+)</div>\\s*<h2 title=\"(Class|Interface|Enum) ([^<&]+).*?\"\\sclass=\"title\">(Class|Interface|Enum) ([^<&]+).*?</h2>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L519
    Pattern.compile("<div class=\"description\">.*?<[pP]>(.*?)</div>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L528
    Pattern.compile("<h3>Property Summary</h3>.*?<table[^>]+>(.*?)</table>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L538
    Pattern.compile("<h3>Method Summary</h3>.*?<table[^>]+>(.*?)</table>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L548
    Pattern.compile("<h3>Enum Constant Summary</h3>.*?<table[^>]+>(.*?)</table>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L558
    Pattern.compile("<h3>Field Summary</h3>.*?<table[^>]+>(.*?)</table>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/search/BuildEnsembleSearchIndex.java#L566
    Pattern.compile("<td class=\"colFirst\">.*?<a href=\"([^\"]*)\">([^<]*)</a>(.*?)</td>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/JenkinsStopBuildUtil.java#L144
    Pattern.compile(".+://(?<hostName>[^.]+)(.liferay.com)?/job/(?<jobName>[^/]+).*/(?<buildNumber>\\d+)/"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/JenkinsStopBuildUtil.java#L147
    Pattern.compile("Build \\'.*\\' started at (?<url>.+)\\."),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/compat/jodatime/TimeZoneConverter.java#L48
    Pattern.compile("^[+-]?[0-9]{1,2}:[0-9]{2}(:[0-9]{2})?$"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/iter/RecurrenceIteratorFactory.java#L522
    Pattern.compile("(?:\\r\\n?|\\n)[ \t]"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/iter/RecurrenceIteratorFactory.java#L523
    Pattern.compile("[\\r\\n]+"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/iter/RecurrenceIteratorFactory.java#L525
    Pattern.compile("^(?:R|EX)RULE[:;]", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/iter/RecurrenceIteratorFactory.java#L527
    Pattern.compile("^(?:R|EX)DATE[:;]", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/util/TimeUtils.java#L288
    Pattern.compile("^GMT([+-]0(:00)?)?$|UTC|Zulu|Etc\\/GMT|Greenwich.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/AbstractIcalObject.java#L32
    Pattern.compile("^((?:[^:;\"]|\"[^\"]*\")+)(;(?:[^:\"]|\"[^\"]*\")+)?:(.*)$"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/AbstractIcalObject.java#L34
    Pattern.compile("^;([^=]+)=(?:\"([^\"]*)\"|([^\";:]*))"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/AbstractIcalObject.java#L35
    Pattern.compile("[:;]"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/IcalParseUtil.java#L32
    Pattern.compile("(\\d{4,})(\\d\\d)(\\d\\d)(?:T([0-1]\\d|2[0-3])([0-5]\\d)([0-5]\\d)(Z)?)?"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/IcalSchema.java#L49
    Pattern.compile("^X-[A-Z0-9\\-]+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/RRuleSchema.java#L38
    Pattern.compile("^X-", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/RRuleSchema.java#L40
    Pattern.compile("^(FREQ|UNTIL|COUNT|INTERVAL|BYSECOND|BYMINUTE|BYHOUR|BYDAY|BYMONTHDAY|BYYEARDAY|BYWEEKDAY|BYWEEKNO|BYMONTH|BYSETPOS|WKST|X-[A-Z0-9\\-]+)=(.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/RRuleSchema.java#L44
    Pattern.compile("^([+\\-]?\\d\\d?)?(SU|MO|TU|WE|TH|FR|SA)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/third-party/com-google-ical/src/main/java/com/google/ical/values/VcalRewriter.java#L127
    Pattern.compile("^((?:RRULE|EXRULE)(?:;[\\w-]+=(?:\"[^\"]*\"|[^;:\"]*))*:)(D|W|M[DP]|Y[DM])([0-9]*)((?:\\s+(?:MO|TU|WE|TH|FR|SA|SU|LD|(?:[0-9]{1,3}[+-]?)))*)(?:\\s+(?:#([0-9]+)|([0-9]{8,}(?:T[0-9]{6}Z?)?)))?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/portal-tools-soy-builder/src/main/java/com/liferay/portal/tools/soy/builder/commands/ReplaceSoyTranslationCommand.java#L139
    Pattern.compile("'[^:]+'\\s*:\\s*([\\d\\w\\._]+)+"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/portal-tools-soy-builder/src/main/java/com/liferay/portal/tools/soy/builder/commands/ReplaceSoyTranslationCommand.java#L141
    Pattern.compile("\\{\\$\\w+\\}"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/portal-tools-soy-builder/src/main/java/com/liferay/portal/tools/soy/builder/commands/ReplaceSoyTranslationCommand.java#L143
    Pattern.compile("var (MSG_EXTERNAL_\\d+(?:\\$\\$\\d+)?) = goog\\.getMsg\\(\\s*'([\\w-\\.,()\\{\\}\\$]+)'\\s*(?:,\\s*\\{([\\s\\S]+?)\\})?\\);"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/FTLImportsFormatter.java#L81
    Pattern.compile("(?m)^([ \t]*package .*;|</#.*>)\\s*^([ \t]*import)"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/FTLImportsFormatter.java#L84
    Pattern.compile("(?m)^([ \t]*(?:package|import) .*;)\\s*^([ \t]*/\\*\\*|@|<#)"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/FTLImportsFormatter.java#L91
    Pattern.compile("(^[ \t]*import\\s+[^$].*;\n+)+", Pattern.MULTILINE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/GradleImportsFormatter.java#L87
    Pattern.compile("import (.*)"),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/GradleImportsFormatter.java#L89
    Pattern.compile("(^[ \t]*import\\s+.*\n+)+", Pattern.MULTILINE),
    // https://github.com/liferay/liferay-portal/blob/65059440dfaf2b8b365a20f99e83e4cdb15478aa/portal-impl/src/com/liferay/portal/dao/sql/transformer/JPQLToHQLTransformerLogic.java#L46
    Pattern.compile("SELECT COUNT\\((\\S+)\\) FROM (\\S+) (\\S+)"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/filedata/DefaultFileData.java#L399
    Pattern.compile("[\\p{Cntrl}]"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/policies/DefaultUploadPolicy.java#L778
    Pattern.compile("%msg%"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/policies/DefaultUploadPolicy.java#L784
    Pattern.compile("%body%"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/policies/DefaultUploadPolicy.java#L788
    Pattern.compile("%success%"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/CookieJar.java#L44
    Pattern.compile("^\\s*([^=\\s]+)(\\s*=\\s*(.+))*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadFTP.java#L126
    Pattern.compile("^ftp://(([^:]+):([^\\@]+)\\@)?([^/:]+):?([0-9]+)?(/(.*))?$"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L65
    Pattern.compile("^Transfer-Encoding:\\s+chunked", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L68
    Pattern.compile("^Connection:\\s+close", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L71
    Pattern.compile("^Proxy-Connection:\\s+close", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L74
    Pattern.compile("^HTTP/\\d\\.\\d\\s+((\\d+)\\s+.*)$"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L77
    Pattern.compile("^Content-Length:\\s+(\\d+)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L80
    Pattern.compile("^Content-Type:\\s+.*;\\s*charset=([^;\\s]+).*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L84
    Pattern.compile("^Set-Cookie:\\s+(.*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/FileUploadThreadHTTP.java#L307
    Pattern.compile(";.*"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L99
    Pattern.compile("^HTTP/\\d\\.\\d\\s200\\s.*"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L297
    Pattern.compile("^(HTTP/\\d\\.\\d)\\s(.*)\\s.*"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L323
    Pattern.compile("^Location: (.*)$"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L328
    Pattern.compile("^Server: .*IIS"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L375
    Pattern.compile("http://([^/]*)/.*"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L376
    Pattern.compile("(.*)\\?(.*)"),
    // https://github.com/bmo/jupload/blob/0e9903ef2b09a8e8d8e73b1386b5ff39b161c87d/src/wjhk/jupload2/upload/HttpConnect.java#L412
    Pattern.compile("(.*)/([^/]*)$"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/io/Downloader.java#L21
    Pattern.compile("filename=\"?(.*)\"?"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/io/FileSystem.java#L21
    Pattern.compile("[A-Z]\\:(\\\\|/)"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/io/Templater.java#L16
    Pattern.compile("!-(\\w+)-!"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/modules/javafx.graphics/src/main/java/com/sun/javafx/tk/quantum/QuantumClipboard.java#L412
    Pattern.compile("IMG\\s+SRC=\\\"([^\\\"]+)\\\"", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/styles/compiling/PercentageAttributeCompiler.java#L15
    Pattern.compile("(\\d+(.\\d+)?)%?"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/ui/text/StyledTextParser.java#L17
    Pattern.compile("<(\\w+)(\\s*(?:\\w+\\s*=(?:\\s*\"[^\"]*?\"|'[^']*?'|[^>'\"\\s]+)\\s*)*)>(.*?)</(\\1)>", Pattern.DOTALL),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/ui/text/StyledTextParser.java#L18
    Pattern.compile("(\\w+)\\s*=\\s*(\"[^\"]*?\"|'[^']*?'|[^>'\"\\s]+)"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L17
    Pattern.compile("#?([0-9aAbBcCdDeEfF]{6})"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L18
    Pattern.compile("#?([0-9aAbBcCdDeEfF]{3})"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L19
    Pattern.compile("#?([0-9aAbBcCdDeEfF]{8})"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L20
    Pattern.compile("#?([0-9aAbBcCdDeEfF]{4})"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L21
    Pattern.compile("[a-z_]+"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/Colors.java#L251
    Pattern.compile("[a-z][A-Z]"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/StringUtil.java#L67
    Pattern.compile("[a-z0-9][A-Z]"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/StringUtil.java#L68
    Pattern.compile("[_| |\\-][a-z]"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/StringUtil.java#L69
    Pattern.compile("[_| |\\-][A-Za-z]"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/StringUtil.java#L70
    Pattern.compile("[ |\\-][A-Za-z]"),
    // https://github.com/slagyr/limelight/blob/2e8db684771587422d55a9329e895481e9b56a26/src/limelight/util/StringUtil.java#L71
    Pattern.compile("[ |_][A-Za-z]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.logging/share/classes/sun/net/www/protocol/http/logging/HttpLogFormatter.java#L45
    Pattern.compile("\\{[^\\}]*\\}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.logging/share/classes/sun/net/www/protocol/http/logging/HttpLogFormatter.java#L46
    Pattern.compile("[^,\\] ]{2,}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.net.http/share/classes/jdk/internal/net/http/ResponseBodyHandlers.java#L203
    Pattern.compile("filename\\s*=", Pattern.CASE_INSENSITIVE),
    // https://github.com/eml/java-mogilefs/blob/78b3dd25b9cae999147d7b523b626bf52a4f3a91/java/com/guba/mogilefs/Backend.java#L49
    Pattern.compile("^ERR\\s+(\\w+)\\s*(\\S*)"),
    // https://github.com/eml/java-mogilefs/blob/78b3dd25b9cae999147d7b523b626bf52a4f3a91/java/com/guba/mogilefs/Backend.java#L55
    Pattern.compile("^OK\\s+\\d*\\s*(\\S*)"),
    // https://github.com/eml/java-mogilefs/blob/78b3dd25b9cae999147d7b523b626bf52a4f3a91/java/com/guba/mogilefs/BaseMogileFSImpl.java#L50
    Pattern.compile("^(\\S+):(\\d+)$"),
    // https://github.com/eml/java-mogilefs/blob/78b3dd25b9cae999147d7b523b626bf52a4f3a91/java/com/guba/mogilefs/MogileOutputStream.java#L118
    Pattern.compile("^HTTP/\\d+\\.\\d+\\s+(\\d+)"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/modules/javafx.web/src/main/java/com/sun/webkit/network/DirectoryURLConnection.java#L66
    Pattern.compile("(\\p{Print}+) \\-\\> (\\p{Print}+)$"),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/EmitterImpl.java#L1150
    Pattern.compile("^![-\\w]*!$"),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/EmitterImpl.java#L1180
    Pattern.compile("^[-\\w]*$"),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/EmitterImpl.java#L1244
    Pattern.compile("^(---|\\.\\.\\.)"),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/EmitterImpl.java#L1245
    Pattern.compile("(^|\n) "),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/SafeConstructorImpl.java#L145
    Pattern.compile("^(-?[0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?)))?$"),
    // https://github.com/olabini/jvyamlb/blob/4730b5463e9dda32060e51dd02cd927ee43c4a5e/src/main/org/jvyamlb/SafeConstructorImpl.java#L146
    Pattern.compile("^(-?[0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.compiler/share/classes/com/sun/tools/javac/parser/JavadocTokenizer.java#L462
    Pattern.compile("(?sm).*^\\s*@deprecated( |$).*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.compiler/share/classes/com/sun/tools/sjavac/Package.java#L137
    Pattern.compile("(.*) -> (.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.compiler/share/classes/com/sun/tools/sjavac/options/Option.java#L146
    Pattern.compile("(?<suffix>\\.[a-zA-Z_][a-zA-Z0-9_]*)=(?<class>[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*)(?<extra>,.*)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.compiler/share/classes/com/sun/tools/sjavac/options/Option.java#L163
    Pattern.compile("\\.(class|java)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.compiler/share/classes/com/sun/tools/sjavac/options/Option.java#L193
    Pattern.compile("\\.[a-zA-Z_][a-zA-Z0-9_]*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.hotspot.agent/share/classes/sun/jvm/hotspot/utilities/CPPExpressions.java#L79
    Pattern.compile("\\s*\\(\\s*([0-9A-Za-z:_]*)\\s*\\*\\s*\\)\\s*([0-9a-zA-Z]*)\\s*"),
    // https://github.com/wireframe/shard/blob/7d915fe7edc44b5d6ff68aff1d24e5f6b1cb063d/shard-dice/src/main/java/com/codecrate/shard/dice/DiceExpression.java#L37
    Pattern.compile("\\[W\\]"),
    // https://github.com/wireframe/shard/blob/7d915fe7edc44b5d6ff68aff1d24e5f6b1cb063d/shard-dice/src/main/java/com/codecrate/shard/dice/DiceExpression.java#L102
    Pattern.compile("(\\d*)d(\\d*)"),
    // https://github.com/wireframe/shard/blob/7d915fe7edc44b5d6ff68aff1d24e5f6b1cb063d/shard-dice/src/main/java/com/codecrate/shard/dice/DiceExpression.java#L116
    Pattern.compile("\\(,"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/java/org/apache/nutch/util/URLUtil.java#L30
    Pattern.compile("(\\d{1,3}\\.){3}(\\d{1,3})"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/ontology/src/java/org/apache/nutch/ontology/jena/OwlParser.java#L142
    Pattern.compile("([a-z0-9])([A-Z])"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/parse-html/src/java/org/apache/nutch/parse/html/HtmlParser.java#L52
    Pattern.compile("<meta\\s+([^>]*http-equiv=\"?content-type\"?[^>]*)>", Pattern.CASE_INSENSITIVE),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/parse-html/src/java/org/apache/nutch/parse/html/HtmlParser.java#L55
    Pattern.compile("charset=\\s*([a-z][_\\-0-9a-z]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/toolkit/PropertyUtils.java#L64
    Pattern.compile("[sg]et\\p{Upper}.*||is\\p{Upper}.*"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/protocol-httpclient/src/java/org/apache/nutch/protocol/httpclient/HttpBasicAuthentication.java#L51
    Pattern.compile("[bB][aA][sS][iI][cC] [rR][eE][aA][lL][mM]=\"(\\w*)\""),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/query-more/src/java/org/apache/nutch/searcher/more/DateQueryFilter.java#L52
    Pattern.compile("^(\\d{8})-(\\d{8})$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L73
    Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L94
    Pattern.compile("^[a-zA-Z]+"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L97
    Pattern.compile("^([a-zA-Z\\d\\-\\.]*)(:\\d*)?(.*)?"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L109
    Pattern.compile("^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L111
    Pattern.compile("^(.*)$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L114
    Pattern.compile("^[\\x21-\\x7E]+$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L117
    Pattern.compile("^(\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L123
    Pattern.compile("^:(\\d{1,5})$"),
    // https://github.com/lritter/gnutch/blob/76711e01f868cc09ed9d4be078ee6f63b34baad5/src/plugin/urlfilter-validator/src/java/org/apache/nutch/urlfilter/validator/UrlValidator.java#L129
    Pattern.compile("^[a-zA-Z]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jdeps/share/classes/com/sun/tools/jdeprscan/Pretty.java#L204
    Pattern.compile("(?<name>.*)\\((?<args>.*)\\)(?<return>.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jdeps/share/classes/com/sun/tools/jdeprscan/scan/Scan.java#L131
    Pattern.compile("\\[*L(.*);"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jdeps/share/classes/com/sun/tools/jdeprscan/scan/Scan.java#L165
    Pattern.compile("\\[+L(.*);"),
    // https://github.com/sparklemotion/nokogiri/blob/117ca2e067dbbf054bef9078c79387c8170d2156/ext/java/nokogiri/internals/SaveContextVisitor.java#L267
    Pattern.compile("charset(()|\\s+)=(()|\\s+)(\\w|\\_|\\.|\\-)+", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L207
    Pattern.compile("^range="),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L213
    Pattern.compile(".*((Data_)|(Names_))(?<tag>.*)\\.class"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L259
    Pattern.compile(".+-[a-z]-.+"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L367
    Pattern.compile("^in"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L367
    Pattern.compile("^ji"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L367
    Pattern.compile("^iw"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L393
    Pattern.compile("^he"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L396
    Pattern.compile("^id"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jlink/internal/plugins/IncludeLocalesPlugin.java#L399
    Pattern.compile("^yi"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jlink/share/classes/jdk/tools/jmod/JmodTask.java#L1266
    Pattern.compile("Non-option arguments"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/Krislet.java#L209
    Pattern.compile("^\\(init\\s(\\w)\\s(\\d{1,2})\\s(\\w+?)\\).*$"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/Krislet.java#L325
    Pattern.compile("^\\((\\w+?)\\s.*"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/Krislet.java#L326
    Pattern.compile("^\\(hear\\s(\\w+?)\\s(\\w+?)\\s(.*)\\).*"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L96
    Pattern.compile("^\\((\\w+?)\\s(\\d+?)\\s(.*)\\).*"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L110
    Pattern.compile("\\(\\((.*?)\\)\\s(.*?)\\)"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L251
    Pattern.compile("^(player|p)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L252
    Pattern.compile("^(ball|b)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L253
    Pattern.compile("^(goal|g)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L254
    Pattern.compile("^(flag|f)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L255
    Pattern.compile("^(line|l)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L257
    Pattern.compile("^(p|g)$"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L258
    Pattern.compile("^\\d{2}$"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L259
    Pattern.compile("^(l|r)$"),
    // https://github.com/NMAI-lab/stateBasedKrislet/blob/808ec0f9f29ac9c85516efa324ed8ae74745dbdb/ClassicKrislet/VisualInfo.java#L260
    Pattern.compile("^(l|r|c)$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.scripting.nashorn/share/classes/jdk/nashorn/internal/codegen/Lower.java#L111
    Pattern.compile("[a-zA-Z_$][\\w$]*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/sample/nashorn/dynalink/UnderscoreNameLinkerExporter.java#L59
    Pattern.compile("_(.)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/utils/IdealGraphVisualizer/Data/src/com/sun/hotspot/igv/data/InputMethod.java#L114
    Pattern.compile("\\s*(\\d+)\\s*:?\\s*(\\w+)\\s*(.*)(?://(.*))?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/utils/IdealGraphVisualizer/Data/src/com/sun/hotspot/igv/data/serialization/BinaryParser.java#L862
    Pattern.compile("\\{(p|i)#([a-zA-Z0-9$_]+)(/(l|m|s))?\\}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/utils/LogCompilation/src/main/java/com/sun/hotspot/tools/compiler/LogCleanupReader.java#L57
    Pattern.compile(".+ compile_id='[0-9]+'.*( compile_id='[0-9]+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/utils/LogCompilation/src/main/java/com/sun/hotspot/tools/compiler/LogCleanupReader.java#L58
    Pattern.compile("' (C[12]) compile_id="),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/utils/LogCompilation/src/main/java/com/sun/hotspot/tools/compiler/LogCleanupReader.java#L59
    Pattern.compile("'(destroy_vm)/"),
    // https://github.com/f-droid/fdroidclient/blob/654d2ca40e7889cff8b6b0a5264c493a4c7dcb71/app/src/full/java/kellinwood/security/zipsigner/ZipSigner.java#L102
    Pattern.compile("^META-INF/(.*)[.](SF|RSA|DSA)$"),
    // https://github.com/adimit/werti/blob/c4dd20f15e9d6be3aa3f0c21a16745b19a4c9448/src/main/java/org/werti/uima/ae/relevance/GenericRelevanceAnnotator.java#L39
    Pattern.compile("^\\s*$"),
    // https://github.com/penguincoder/acmcompetition2003/blob/f8af7abd0dd09b497a07486ee5557683ce30e8c1/d/tread.java#L11
    Pattern.compile("[45] [45] [01] [89]"),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L67
    Pattern.compile("^[ ]{0,3}\\[(.+)\\]:[ \\t]*\\n?[ \\t]*<?(\\S+?)>?[ \\t]*\\n?[ \\t]*(?:[\"(](.+?)[\")][ \\t]*)?(?:\\n+|\\Z)", Pattern.MULTILINE),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L124
    Pattern.compile("((^[ \t]*>[ \t]?.+\\n(.+\\n)*\\n*)+)", Pattern.MULTILINE),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L141
    Pattern.compile("(\\s*<pre>.*?</pre>)", Pattern.DOTALL),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L154
    Pattern.compile("(?:\\n\\n|\\A)((?:(?:[ ]{4}).*\\n+)+)((?=^[ ]{0,4}\\S)|\\Z)", Pattern.MULTILINE),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L271
    Pattern.compile("(\\n)?^([ \\t]*)([@]|\\d+[.])[ ]+((?s:.+?)(\\n{1,2}))(?=\\n*(\\z|\\2([@]|\\d+[.])[ \\t]+))", Pattern.MULTILINE),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L310
    Pattern.compile("^(#{1,6})\\s*(.*?)\\s*\\1?$", Pattern.MULTILINE),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L345
    Pattern.compile("(\\[(.*?)\\]\\([ \\t]*<?(.*?)>?[ \\t]*((['\"])(.*?)\\5)?\\))", Pattern.DOTALL),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/src/org/spirit/util/markdown/BotListMarkUtil.java#L395
    Pattern.compile("(?<!\\\\)(`+)(.+?)(?<!`)\\1(?!`)"),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/tests/misc/src/org/spirit/test/MarkdownRegexTestCase.java#L34
    Pattern.compile(" {2,}\n"),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/tests/misc/src/org/spirit/test/MarkdownRegexTestCase.java#L44
    Pattern.compile("^(.*)\n====+$"),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/tests/misc/src/org/spirit/test/MarkdownRegexTestCase.java#L47
    Pattern.compile("^(.*)\n----+$"),
    // https://github.com/berlinbrown/openbotlist/blob/aecfe2ab765fa0b62523b4de40285942ddb9060f/botlist/tests/misc/src/org/spirit/test/MarkdownRegexTestCase.java#L88
    Pattern.compile("(\\*\\*)(?=\\S)(.+?[*]*)(?<=\\S)\\1"),
    // https://github.com/myabc/appfuse/blob/b56929b4d616cc9da0d24510edf6ba4b0b35ba0e/plugins/appfuse-maven-plugin/src/main/java/org/appfuse/tool/StringUtils.java#L10
    Pattern.compile("^.*(sh|ss|ch|o|i)$"),
    // https://github.com/myabc/appfuse/blob/b56929b4d616cc9da0d24510edf6ba4b0b35ba0e/plugins/appfuse-maven-plugin/src/main/java/org/appfuse/tool/StringUtils.java#L11
    Pattern.compile("^.*(ex|ix)$"),
    // https://github.com/myabc/appfuse/blob/b56929b4d616cc9da0d24510edf6ba4b0b35ba0e/plugins/appfuse-maven-plugin/src/main/java/org/appfuse/tool/StringUtils.java#L12
    Pattern.compile("^.*[^aeiou]y$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/LogProcessor.java#L54
    Pattern.compile("method='([^']+)'"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/LogProcessor.java#L50
    Pattern.compile("<task_done [^>]*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/LogProcessor.java#L51
    Pattern.compile("</task>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/PrintDirectivesProcessor.java#L43
    Pattern.compile(" matching: (.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/PrintProcessor.java#L57
    Pattern.compile("Compiled method (?<compiler>\\(.*\\))[ ]+(?<time>[0-9]+)[ ]+(?<id>[0-9]+) (?<attr>[ !%sbn]{6})(?<level>[0-9]+)[ ]+(?<name>[^ ]+).*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/compilercontrol/share/processors/PrintProcessor.java#L110
    Pattern.compile("::"),
    // https://github.com/myabc/appfuse/blob/b56929b4d616cc9da0d24510edf6ba4b0b35ba0e/plugins/maven-warpath-plugin/src/main/java/org/appfuse/WarPathUtils.java#L26
    Pattern.compile("^[/\\\\]?web-inf[/\\\\]classes[/\\\\]?(.*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/compiler/jvmci/compilerToVM/GetFlagValueTest.java#L78
    Pattern.compile("(\\w+)\\s+(\\w+)\\s+:?= (?:(.+))\\{[^}]+\\}\\s+\\{[^}]+\\}"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L34
    Pattern.compile("^(\\d{3})[ -]"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L35
    Pattern.compile("^200 result= *(\\S+)"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L36
    Pattern.compile("^200 result=\\S* +\\((.*)\\)"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L37
    Pattern.compile("^200 result=\\S* +(\\(.*\\) )?(.+)$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L38
    Pattern.compile("(\\S+)=(\\S+)"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiReplyImpl.java#L39
    Pattern.compile("^\\s*Usage:\\s*(.*)\\s*$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiRequestImpl.java#L48
    Pattern.compile("^([^\\?]*)\\?(.*)$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/fastagi/internal/AgiRequestImpl.java#L49
    Pattern.compile("^(.*)=(.*)$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/live/internal/AsteriskServerImpl.java#L47
    Pattern.compile("^([\\S]+)\\s+Revision: ([0-9\\.]+)"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/live/internal/AsteriskServerImpl.java#L49
    Pattern.compile("^(\\S+)\\s+(\\S+)\\s+(.{25})"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/live/internal/MeetMeManager.java#L50
    Pattern.compile("^User #: ([0-9]+).*Channel: (\\S+).*$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/manager/event/ChannelReloadEvent.java#L64
    Pattern.compile("^([A-Z]+) \\((.*)\\)$"),
    // https://github.com/jicksta/stomptomanagerbridge/blob/01ef977418674b66ad9bc0adab6e5344e07ba9ee/lib/asterisk-java/src/main/java/org/asteriskjava/util/AstState.java#L88
    Pattern.compile("^Unknown \\((\\d+)\\)$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/gc/g1/ihop/lib/IhopUtils.java#L46
    Pattern.compile("occupancy: (\\d+)B"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/gc/g1/ihop/lib/IhopUtils.java#L47
    Pattern.compile("threshold: (\\d+)B"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/gc/g1/plab/TestPLABEvacuationFailure.java#L77
    Pattern.compile("GC\\((\\d+)\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/ErrorHandling/SecondaryErrorTest.java#L97
    Pattern.compile("Will crash now \\(TestCrashInErrorHandler=14\\)..."),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/ErrorHandling/SecondaryErrorTest.java#L98
    Pattern.compile("\\[error occurred during error reporting \\(test secondary crash 1\\).*\\]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/ErrorHandling/SecondaryErrorTest.java#L100
    Pattern.compile("\\[error occurred during error reporting \\(test secondary crash 2\\).*\\]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/NMT/SummarySanityCheck.java#L70
    Pattern.compile("-\\s+(?<typename>[\\w\\s]+)\\(reserved=(?<reserved>\\d+)KB,\\scommitted=(?<committed>\\d+)KB\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/NMT/SummarySanityCheck.java#L72
    Pattern.compile("Total\\:\\sreserved=(?<reserved>\\d+)KB,\\scommitted=(?<committed>\\d+)KB"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L62
    Pattern.compile("^\"ContendingThread-.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L64
    Pattern.compile("^\"ContendingThread-.* waiting for monitor entry .*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L66
    Pattern.compile("^\"ContendingThread-.* waiting on condition .*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L68
    Pattern.compile("^\"ContendingThread-.* runnable .*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L74
    Pattern.compile(" *java\\.lang\\.Thread\\.State: .*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L76
    Pattern.compile(" *java\\.lang\\.Thread\\.State: BLOCKED \\(on object monitor\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L78
    Pattern.compile(" *java\\.lang\\.Thread\\.State: RUNNABLE"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L83
    Pattern.compile(".* locked \\<.*\\(a TestThreadDumpMonitorContention.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/runtime/Thread/TestThreadDumpMonitorContention.java#L89
    Pattern.compile(".* waiting to lock \\<.*\\(a TestThreadDumpMonitorContention.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/compiler/CodeCacheTest.java#L75
    Pattern.compile("(CodeCache|CodeHeap.*): size=(\\p{Digit}*)Kb used=(\\p{Digit}*)Kb max_used=(\\p{Digit}*)Kb free=(\\p{Digit}*)Kb"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/compiler/CodeCacheTest.java#L76
    Pattern.compile(" bounds \\[0x(\\p{XDigit}*), 0x(\\p{XDigit}*), 0x(\\p{XDigit}*)\\]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/compiler/CodeCacheTest.java#L77
    Pattern.compile(" total_blobs=(\\p{Digit}*) nmethods=(\\p{Digit}*) adapters=(\\p{Digit}*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/compiler/CodeCacheTest.java#L78
    Pattern.compile(" compilation: (.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/jvmti/DataDumpDcmdTest.java#L56
    Pattern.compile(".*VM warning.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L75
    Pattern.compile("\\|--DcmdTestClass\\$\\$Lambda.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L78
    Pattern.compile("java.lang.Object/null"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L79
    Pattern.compile("\\|--DcmdBaseClass/0x(\\p{XDigit}*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L80
    Pattern.compile("\\|  implements Intf2/0x(\\p{XDigit}*) \\(declared intf\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L81
    Pattern.compile("\\|  implements Intf1/0x(\\p{XDigit}*) \\(inherited intf\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L82
    Pattern.compile("\\|  \\|--DcmdTestClass/0x(\\p{XDigit}*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L83
    Pattern.compile("\\|  \\|  implements Intf1/0x(\\p{XDigit}*) \\(inherited intf\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassHierarchyTest.java#L84
    Pattern.compile("\\|  \\|  implements Intf2/0x(\\p{XDigit}*) \\(inherited intf\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassLoaderStatsTest.java#L65
    Pattern.compile("0x\\p{XDigit}*\\s*0x\\p{XDigit}*\\s*0x\\p{XDigit}*\\s*(\\d*)\\s*(\\d*)\\s*(\\d*)\\s*(.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/serviceability/dcmd/vm/ClassLoaderStatsTest.java#L66
    Pattern.compile("\\s*(\\d*)\\s*(\\d*)\\s*(\\d*)\\s*.*"),
    // https://github.com/fteeew/Facebook-java-code/blob/541c6f9f8222dadb3296d23a7dd514235e011e18/src/facebook/ParsingForID.java#L29
    Pattern.compile("\\&\\w{4}\\;\\d{4,30}\\:\\d{4,30}"),
    // https://github.com/fteeew/Facebook-java-code/blob/541c6f9f8222dadb3296d23a7dd514235e011e18/src/facebook/getReaction.java#L232
    Pattern.compile("(\"total_count\":\\d+)"),
    // https://github.com/fteeew/Facebook-java-code/blob/541c6f9f8222dadb3296d23a7dd514235e011e18/src/facebook/getReaction.java#L239
    Pattern.compile("(\\d+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/testlibrary/ctw/src/sun/hotspot/tools/ctw/PathHandler.java#L112
    Pattern.compile("^(.*[/\\\\])?\\*$"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/css/token/TokenDefImpl.java#L57
    Pattern.compile("[ a-zA-Z0-9_\\-%#.,()'/]*"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/css/token/TokenDefImpl.java#L60
    Pattern.compile("token\\("),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/css/token/TokenDefImpl.java#L61
    Pattern.compile("^t\\("),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/css/token/TokenDefImpl.java#L62
    Pattern.compile(" +t\\("),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/css/token/TokenDefImpl.java#L262
    Pattern.compile("^[a-zA-Z_](\\.?[-a-zA-Z0-9_]*)*$"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/factory/SVGParser.java#L46
    Pattern.compile(".*(&|/|<|>).*", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/javascript/testsuite/JavascriptMockHandler.java#L292
    Pattern.compile("^([\\w\\.]+?)(\\[\\])*\\z"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/util/BrowserUserAgent.java#L130
    Pattern.compile("[\\x20-\\x7E&&[^\\x5C]]*"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/util/BrowserUserAgent.java#L139
    Pattern.compile(".*(android.+mobile|apexmobile|avantgo|bada\\/|blackberry|bb10|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od|ad)|iris|kindle|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino).*"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-impl/src/main/java/org/auraframework/impl/util/BrowserUserAgent.java#L142
    Pattern.compile("1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|e\\-|e\\/|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(di|rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|xda(\\-|2|g)|yas\\-|your|zeto|zte\\-"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/metaspace/gc/FirstGCTest.java#L205
    Pattern.compile(".*Metaspace.* used .*, capacity .*, committed (\\d+)([KMGkmg]), reserved .*"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-integration-test/src/test/java/org/auraframework/integration/test/css/TokensSanityUITest.java#L36
    Pattern.compile("rgba?\\(((?:\\d+, ){2}\\d+)(, .+)?\\)"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-integration-test/src/test/java/org/auraframework/integration/test/def/TemplateDefTest.java#L281
    Pattern.compile("<script src=\"firstThingDefault\" type=\"text/javascript\"|<script type=\"text/javascript\" src=\"firstThingDefault\""),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-integration-test/src/test/java/org/auraframework/integration/test/def/TemplateDefTest.java#L282
    Pattern.compile("<script src=\"readonly\" type=\"text/javascript\"|<script type=\"text/javascript\" src=\"readonly\""),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-integration-test/src/test/java/org/auraframework/integration/test/def/TemplateDefTest.java#L283
    Pattern.compile("<meta content=\"testtest\" name=\"firstThingDefault\"|<meta name=\"firstThingDefault\" content=\"testtest\""),
    // https://github.com/wolfdancer/cotta/blob/e19c4604f82410e9891d45d06088e4a2af2a9a5d/core/src/net/sf/cotta/TPath.java#L239
    Pattern.compile("(\\.)|(\\.(\\\\|/)(.*))"),
    // https://github.com/wolfdancer/cotta/blob/e19c4604f82410e9891d45d06088e4a2af2a9a5d/core/src/net/sf/cotta/TPath.java#L240
    Pattern.compile("([A-Z|a-z]:)[\\\\|/]?(.*)"),
    // https://github.com/housejester/jsondumper/blob/faa4754e96b506b148f5ffa19a72e0e9f8ed7fac/src/main/java/org/merecode/walker/BeanNameValuePairs.java#L43
    Pattern.compile("^(get|is)[A-Z].*"),
    // https://github.com/rictic/code_swarm/blob/ddf0ffeff1e3d4c13adb7ebc58e71d622906f013/src/FreebaseAvatarFetcher.java#L17
    Pattern.compile("\"image:id\"\\s*:\\s*\"(.*?)\""),
    // https://github.com/rictic/code_swarm/blob/ddf0ffeff1e3d4c13adb7ebc58e71d622906f013/src/GravatarFetcher.java#L22
    Pattern.compile("<(.*?@.*?\\..*?)>"),
    // https://github.com/forcedotcom/aura/blob/400b2dcabfe704b972fecc1b41e1ce38336864c0/aura-util/src/main/java/org/auraframework/util/text/GlobMatcher.java#L33
    Pattern.compile("[a-zA-Z0-9_*]*"),
    // https://github.com/bcotton/selenium-grid/blob/9d05140058657ecca7942b0bdfc62d570bca11d2/hub/src/main/java/com/thoughtworks/selenium/grid/hub/remotecontrol/commands/NewBrowserSessionCommand.java#L21
    Pattern.compile("OK,([^,]*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/nsk/monitoring/RuntimeMXBean/RuntimeMXBean006/RuntimeMXBean006.java#L60
    Pattern.compile("^[0-9]+@(([a-zA-Z]|[a-zA-Z][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9\\-]*[A-Za-z0-9])$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/compiler/complog/share/LogCompilationTest.java#L82
    Pattern.compile("(\"[^\"]*\")|([^\\s\"]+(\"[^\"]*\")?)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/compiler/complog/uninit/UninitializedTrapCounter.java#L47
    Pattern.compile("method='(([^ ']+) ([^ ']+) [^']+)'.*uninitialized_traps='([0-9]+)'"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/compiler/complog/uninit/UninitializedTrapCounter.java#L49
    Pattern.compile("-methodFilter=([^ ]+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/compiler/complog/uninit/UninitializedTrapCounter.java#L48
    Pattern.compile("-classFilter=([^ ]+)"),
    // https://github.com/aemoncannon/flyparse-mode/blob/50e3aa363192d585dffd55c198bcf6189d3d2353/as3/src/emacs/flyparse/as3/AS3Driver.java#L46
    Pattern.compile("[\\\\/][A-Z][a-zA-Z0-9]+\\.as$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/runtime/defmeth/shared/Util.java#L121
    Pattern.compile(".*\\."),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/hotspot/jtreg/vmTestbase/vm/runtime/defmeth/shared/Util.java#L190
    Pattern.compile("\\((.*)\\)(.*)"),
    // https://github.com/pgm/junit-dist/blob/17b297c8568e2dd3bfcaa5f667d8688acedf6995/src/com/github/distrunner/XmlLoggingRunListener.java#L173
    Pattern.compile("([^(]+)\\(([^)]+)\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/com/sun/crypto/provider/Cipher/PBE/PBMacDoFinalVsUpdate.java#L179
    Pattern.compile("(\\d+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/awt/GraphicsDevice/DisplayModes/CompareToXrandrTest.java#L54
    Pattern.compile("^\\s*(\\d+x\\d+)"),
    // https://github.com/apache/directory-fortress-core/blob/4d5ae5aa9cc24f87bf3e4b34dea03277e88f5d2e/src/main/java/org/apache/directory/fortress/core/cli/CommandLineInterpreter.java#L1054
    Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/LinkMatcher.java#L91
    Pattern.compile("[^\\w]+"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L20
    Pattern.compile("/node/(\\d+)(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L21
    Pattern.compile("/node/search(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L22
    Pattern.compile("/node/recent(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L23
    Pattern.compile("/node/hot(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L24
    Pattern.compile("/node/newsnips(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L25
    Pattern.compile("/scripthack/newsnippet(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L26
    Pattern.compile("/(.*)?(\\.(\\w+))?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L27
    Pattern.compile("/apianon/search(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L28
    Pattern.compile("/node/prefix(\\.\\w+)?"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L31
    Pattern.compile("/node/addsnip"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L32
    Pattern.compile("/node/create"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L34
    Pattern.compile("/node/(\\d+)/addlink"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L35
    Pattern.compile("/node/(\\d+)/vote"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/NodeServlet.java#L36
    Pattern.compile("/node/login"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/WikiCountLinks.java#L20
    Pattern.compile("\\[\\[([^\\]\\|]+)(\\|[^\\]]+)?]\\]"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/WikiMatcher.java#L95
    Pattern.compile("[^\\w\']+"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/WikiRedirects.java#L14
    Pattern.compile("<title>(.*)</title>", Pattern.CASE_INSENSITIVE),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/WikiRedirects.java#L15
    Pattern.compile("\\[\\[([^\\]]+)\\]\\]"),
    // https://github.com/robennals/think-link/blob/3ab7c8e6ec49bcdb1ed85a49628f68f5cacd634d/java/com/intel/thinklink/WikiRedirects.java#L16
    Pattern.compile("#REDIRECT\\s*\\[\\[([^\\]]+)\\]\\]", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/Double/ParseDouble.java#L601
    Pattern.compile("[\\x00-\\x20]*[+-]?(NaN|Infinity|(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?))|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/System/LoggerFinder/internal/api/LoggerFinderAPITest.java#L74
    Pattern.compile("^((log(p|rb)?)|severe|warning|info|config|fine|finer|finest|isLoggable)$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/sample_src/java/com/github/rd4j/sample/blog/domain/Post.java#L55
    Pattern.compile("\\W+"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/NamedGroupPattern.java#L13
    Pattern.compile("\\(\\?P\\<(\\w+)>"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L82
    Pattern.compile("^\\s*for\\s+(\\S+)\\s+in\\s+(\\S+)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L83
    Pattern.compile("^\\s*if\\s+(\\S+)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L84
    Pattern.compile("^\\s*block\\s+(\\S+)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L85
    Pattern.compile("^\\s*endblock\\s+(\\S+)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L86
    Pattern.compile("^\\s*extends\\s+(\\S+)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L87
    Pattern.compile("^\\s*(\\S+)\\s+((?:\\S+=\"[^\"]*\"\\s*)*)((?:begin)?)\\s*$"),
    // https://github.com/pgm/rd4j/blob/778d2534c7f6d3d6715586878edfe911bcd4236a/src/java/com/github/rd4j/djangoishtemplate/Tokenizer.java#L207
    Pattern.compile("^\\s*(\\S+)\\s*=\\s*\"([^\"]*)\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/instrument/NMTHelper.java#L41
    Pattern.compile("^Total: reserved=\\d+KB .*KB, committed=\\d+KB (.*)KB$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/invoke/indify/Indify.java#L1884
    Pattern.compile("^\\([A-Z]*\\)[A-Z]$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/invoke/indify/Indify.java#L1892
    Pattern.compile("\\[*L[^;]*;|\\[+[A-Z]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/lang/invoke/indify/Indify.java#L1893
    Pattern.compile("[JD]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/net/httpclient/http2/java.net.http/jdk/internal/net/http/hpack/HuffmanTest.java#L358
    Pattern.compile("\\(\\s*(?<sym>\\d+)\\s*\\)\\s*(?<bits>(\\|([01])+)+)\\s*(?<hex>[0-9a-zA-Z]+)\\s*\\[\\s*(?<len>\\d+)\\s*\\]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/net/httpclient/http2/java.net.http/jdk/internal/net/http/hpack/HuffmanTest.java#L364
    Pattern.compile("\\|"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/net/httpclient/http2/java.net.http/jdk/internal/net/http/hpack/SimpleHeaderTableTest.java#L321
    Pattern.compile("\\|\\s*(?<index>\\d+?)\\s*\\|\\s*(?<name>.+?)\\s*\\|\\s*(?<value>.*?)\\s*\\|"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/net/httpclient/http2/java.net.http/jdk/internal/net/http/hpack/SpecHelper.java#L42
    Pattern.compile("[0-9a-fA-F]{2}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/Formatter/BasicDateTime.java#L179
    Pattern.compile("t"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java#L74
    Pattern.compile("(\\w+)(Classes)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java#L75
    Pattern.compile("(get)(\\w+)(Classes)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java#L76
    Pattern.compile("(is)(\\w+)(Class)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java#L77
    Pattern.compile("(get)(\\w+)Class"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L70
    Pattern.compile(".+/grails-app/domain/(.+)\\.groovy"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L75
    Pattern.compile(".+?/grails-app/(.+?)/(.+?\\.groovy)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L77
    Pattern.compile(".+?/grails-app/conf/spring/(.+?\\.groovy)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L160
    Pattern.compile("[/\\\\]"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L233
    Pattern.compile(".+?(/plugins/.+?/grails-app/.+)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceUtils.java#L275
    Pattern.compile(".+?/(plugins/.+?)/grails-app/.+"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/commons/metaclass/CreateDynamicMethod.java#L33
    Pattern.compile("^create$"),
    // https://github.com/fayson/cdhproject/blob/9003213de054233d71fbfdae119ba1bff5c3c3d6/flumesink/src/main/java/com/cloudera/utils/JsonStr2Map.java#L26
    Pattern.compile("(\"\\w+\"):(\"[^\"]+\")"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/validation/routines/UrlValidator.java#L121
    Pattern.compile("^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/validation/routines/UrlValidator.java#L125
    Pattern.compile("^([\\p{Alnum}\\-\\.]*)(:\\d*)?(.*)?"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/commons/org/codehaus/groovy/grails/validation/routines/UrlValidator.java#L144
    Pattern.compile("^\\p{ASCII}+$"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L38
    Pattern.compile("<[^>]+>"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L39
    Pattern.compile("<[Pp][Rr][Ee]>"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L40
    Pattern.compile("</[Pp][Rr][Ee]>"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L41
    Pattern.compile("\\&[^; ]+[; ]"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L42
    Pattern.compile("\\&amp;"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L43
    Pattern.compile("\\&gt;"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L44
    Pattern.compile("\\&lt;"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L560
    Pattern.compile("[\n ]+"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/CountByPersistentMethod.java#L47
    Pattern.compile("(countBy)(\\w+)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/CountPersistentMethod.java#L39
    Pattern.compile("^count$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/CreateCriteriaPersistentMethod.java#L34
    Pattern.compile("^createCriteria$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExecuteQueryPersistentMethod.java#L46
    Pattern.compile("^executeQuery$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExistsPersistentMethod.java#L38
    Pattern.compile("^exists$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllByPersistentMethod.java#L37
    Pattern.compile("(findAllBy)(\\w+)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllPersistentMethod.java#L97
    Pattern.compile("^findAll$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllWherePersistentMethod.java#L44
    Pattern.compile("^findAllWhere$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindByPersistentMethod.java#L50
    Pattern.compile("(findBy)(\\w+)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindPersistentMethod.java#L65
    Pattern.compile("^find$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindWherePersistentMethod.java#L44
    Pattern.compile("^findWhere$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/GetAllPersistentMethod.java#L48
    Pattern.compile("^getAll$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/GetPersistentMethod.java#L42
    Pattern.compile("^get$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListOrderByPersistentMethod.java#L33
    Pattern.compile("(listOrderBy)(\\w+)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListPersistentMethod.java#L41
    Pattern.compile("^list$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/WithCriteriaDynamicPersistentMethod.java#L47
    Pattern.compile("^withCriteria$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/WithTransactionPersistentMethod.java#L38
    Pattern.compile("^withTransaction$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/Scanner/ScannerStreamTest.java#L122
    Pattern.compile("[A-Z]{7,}"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/errors/GrailsWrappedRuntimeException.java#L47
    Pattern.compile("\\((\\w+)\\.groovy:(\\d+)\\)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/errors/GrailsWrappedRuntimeException.java#L48
    Pattern.compile("at\\s{1}(\\w+)\\$_closure\\d+\\.doCall\\(\\1:(\\d+)\\)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/errors/GrailsWrappedRuntimeException.java#L49
    Pattern.compile("\\p{Upper}(\\S+?)\\$_closure\\d+\\.doCall\\(\\1:(\\d+)\\)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/errors/GrailsWrappedRuntimeException.java#L50
    Pattern.compile("(\\S+?)_\\S+?_gsp.run\\((\\S+?\\.gsp):(\\d+)\\)"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/json/JSONTokener.java#L372
    Pattern.compile("^\\s*new\\s+Date\\(\\s*(\\d+)\\s*\\)\\s*$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java#L131
    Pattern.compile("\\*\\*"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java#L131
    Pattern.compile("([^\\*])\\*$"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java#L131
    Pattern.compile("([^\\*])\\*([^\\*])"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L45
    Pattern.compile("/p>\\s*<p[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L46
    Pattern.compile("((/td>\\s*</tr>\\s*<)?tr[^>]*>\\s*<)?td[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L47
    Pattern.compile("(\\s*(\\S+)\\s*=\\s*[\"]([^\"]*)[\"][\\s|>]{1}){1}"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L48
    Pattern.compile("(\\s*(\\S+)\\s*=\\s*[']([^']*)['][\\s|>]{1}){1}"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L195
    Pattern.compile("(\\w+)\\s*=\\s*\"([^\"]*)\""),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java#L471
    Pattern.compile("[\r\n\t]"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Strip.java#L31
    Pattern.compile("\\^([a-zA-Z]+)%\\{([^}]|\\}[^%])*\\}%"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/pages/Strip.java#L32
    Pattern.compile("((\\^[a-zA-Z])?%\\{([^}]|\\}[^%])*\\}%|[$@]\\{[^}]*\\})"),
    // https://github.com/lpicanco/grails/blob/5da5e9d52e55668822ff309906b737b81aadf32a/src/web/org/codehaus/groovy/grails/web/taglib/jsp/JspInvokeGrailsTagLibTag.java#L67
    Pattern.compile("(\\s*(\\S+)\\s*:\\s*(\\S+?)(,|$){1}){1}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/logging/HigherResolutionTimeStamps/SerializeLogRecord.java#L290
    Pattern.compile("^(.*\\.[0-9][0-9][0-9])([0-9][0-9][0-9][0-9][0-9][0-9])(.* - .*)$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/logging/SimpleFormatterFormat.java#L102
    Pattern.compile("([\\.a-zA-Z:]+) (.*) \\[.*\\] source: (.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L64
    Pattern.compile("X"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L79
    Pattern.compile("4"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L83
    Pattern.compile("\u00a3a"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L87
    Pattern.compile("1"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L95
    Pattern.compile("\u56da"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L114
    Pattern.compile("[ \t,:.]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/java/util/regex/PatternStreamTest.java#L119
    Pattern.compile("o"),
    // https://github.com/andreyvit/yoursway-commons/blob/1581ef88c0a3bb2646267a16dce1b60698c9f7af/com.yoursway.utils/src/com/yoursway/utils/StringExtractor.java#L10
    Pattern.compile("^\\w+"),
    // https://github.com/andreyvit/yoursway-commons/blob/1581ef88c0a3bb2646267a16dce1b60698c9f7af/com.yoursway.utils/src/com/yoursway/utils/StringExtractor.java#L12
    Pattern.compile("^\\s+"),
    // https://github.com/andreyvit/yoursway-commons/blob/1581ef88c0a3bb2646267a16dce1b60698c9f7af/com.yoursway.utils/src/com/yoursway/utils/YsFileUtils.java#L437
    Pattern.compile("^([._](git|svn|darcs)|CVS|\\.DS_Store)$"),
    // https://github.com/zootella/learning-bittorrent/blob/5fa74c6d4d6960fa60856d6f3e251db5bd20a67a/core/com/limegroup/gnutella/archive/Archives.java#L160
    Pattern.compile("^[^\\p{Alnum}]+"),
    // https://github.com/zootella/learning-bittorrent/blob/5fa74c6d4d6960fa60856d6f3e251db5bd20a67a/core/com/limegroup/gnutella/archive/Archives.java#L164
    Pattern.compile("[^\\p{Alnum}\\.\\-_]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/javax/xml/jaxp/parsers/8027359/XML11EntityScannerTest.java#L171
    Pattern.compile("USK@[%,~*-_./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz]+"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/jdk/internal/math/FloatingDecimal/OldFloatingDecimalForTest.java#L1895
    Pattern.compile("([-+])?0[xX](((\\p{XDigit}+)\\.?)|((\\p{XDigit}*)\\.(\\p{XDigit}+)))[pP]([-+])?(\\p{Digit}+)[fFdD]?"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.kalugin.plugins.sync.api.tests/src/com/kalugin/plugins/sync/api/tests/utils/TestingUtils.java#L54
    Pattern.compile("^#(\\d+)"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.kalugin.plugins.sync.api.tests/src/com/kalugin/plugins/sync/api/tests/utils/TestingUtils.java#L60
    Pattern.compile("^@(\\w+)(?::([^\\s]+)|\\(([^)]*)\\))?"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.kalugin.plugins.sync.api/src/com/kalugin/plugins/sync/api/RandomSourceFactory.java#L13
    Pattern.compile("^random\\b"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.kalugin.plugins.sync.api/src/com/kalugin/plugins/sync/api/SyncPluginsRegistry.java#L16
    Pattern.compile("^\\s*Sync(?:hronize)? with "),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.corchy.ui/src/com/mkalugin/corchy/internal/ui/SwtCocoaApplicationPresentation.java#L249
    Pattern.compile(" @done\\b"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.corchy.ui/src/com/mkalugin/corchy/internal/ui/editor/CorchyCompletionProcessor.java#L49
    Pattern.compile("@\\w+"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/controllers/sync/TaskPersistance.java#L30
    Pattern.compile("[^@]*"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L30
    Pattern.compile("@([^:(\\s@]*)(?::(\\S+)|\\(([^\\)]*)\\))?"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L34
    Pattern.compile("^@.+$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L35
    Pattern.compile("^Sync(hronize)? with (.+)$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L37
    Pattern.compile("^-\\s+([^@]*)(\\s+(@.+))?$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L38
    Pattern.compile("^([^@]+):(\\s+(@.+))?$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L39
    Pattern.compile("^((\\w\\.)*\\w\\.?)\\s+([^@]+)(\\s+(@.+))?$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.core/src/com/mkalugin/pikachu/core/workspace/DocumentParser.java#L40
    Pattern.compile("^(([A-Z0-9] )*[A-Z0-9])(\\s+(@.+))?$"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.basecamp/src/com/mkalugin/basecamp/BasecampSourceFactory.java#L18
    Pattern.compile("^(?:(https?)://)?((?:[\\w\\d_.-]+)\\.(?:updatelog|clientsection|seework|grouphub|projectpath)\\.com)(/)?"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.basecamp/src/com/mkalugin/basecamp/BasecampSourceFactory.java#L20
    Pattern.compile("^(?:,\\s*)?user(?:\\s*name)?\\s+[�\"']([^�\"']+)[�\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.basecamp/src/com/mkalugin/basecamp/BasecampSourceFactory.java#L23
    Pattern.compile("^(?:,\\s*)?project\\s+[�\"']([^�\"']+)[�\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.basecamp/src/com/mkalugin/basecamp/BasecampSourceFactory.java#L26
    Pattern.compile("^(?:,\\s*)?(?:TODO|to-do\\s*)?list\\s+[�\"']([^�\"']+)[�\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.lighthouse/src/com/mkalugin/lighthouse/LighthouseSourceFactory.java#L18
    Pattern.compile("^(?:(https?)://)?((?:[\\w\\d_.-]+)\\.lighthouseapp\\.com)(/)?"),
    // https://github.com/andreyvit/yoursway-taskus/blob/a2a6e9d676cf963f5b59ba2fe40988f4705a62d3/com.mkalugin.pikachu.sync.plugins.lighthouse/src/com/mkalugin/lighthouse/LighthouseSourceFactory.java#L26
    Pattern.compile("^(?:,\\s*)?query\\s+[�\"']([^�\"']*)[�\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/net/www/http/HttpClient/B8025710.java#L109
    Pattern.compile("^CONNECT ([^: ]+):([0-9]+) HTTP/[0-9.]+$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/nio/cs/FindDecoderBugs.java#L92
    Pattern.compile("\"[0-9a-f ]+\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/nio/cs/FindDecoderBugs.java#L93
    Pattern.compile("\\\\u[0-9a-f]{4}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/nio/cs/FindDecoderBugs.java#L401
    Pattern.compile("(?:x-)?(?:UTF|JIS(?:_X)?0).*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/nio/cs/TestCharsetMapping.java#L443
    Pattern.compile("(?:0x)?(\\p{XDigit}++)\\s++(?:U\\+|0x)?(\\p{XDigit}++)(?:\\s++#.*)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/security/krb5/IPv6.java#L108
    Pattern.compile(".*KrbKdcReq send: kdc=(.*) UDP:(\\d+),.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/sun/security/krb5/auto/KdcPolicy.java#L320
    Pattern.compile(">>> KDCCommunication: kdc=\\S+ (TCP|UDP):(\\d+), timeout=(\\d+),Attempt\\s*=(\\d+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/tools/jar/multiRelease/ApiValidatorTest.java#L56
    Pattern.compile("module (\\w+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/tools/jar/multiRelease/ApiValidatorTest.java#L57
    Pattern.compile("package (\\w+).*public class (\\w+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/tools/jmod/JmodTest.java#L400
    Pattern.compile("foo\\s+exports\\s+jdk.test.foo"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/jdk/tools/jmod/JmodTest.java#L405
    Pattern.compile("requires\\s+java.base\\s+mandated\\s+contains\\s+jdk.test.foo.internal"),
    // https://github.com/abraham0067/EBS_Multiempresa/blob/979314bd590e041b260626a8d9d15999c9ce0611/src/java/com/ebs/Test.java#L228
    Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"),
    // https://github.com/abraham0067/EBS_Multiempresa/blob/979314bd590e041b260626a8d9d15999c9ce0611/src/java/com/ebs/Test.java#L229
    Pattern.compile("PRUEBAXX-ATEB-SERV-SACV-TIMBREPRUEBA"),
    // https://github.com/abraham0067/EBS_Multiempresa/blob/979314bd590e041b260626a8d9d15999c9ce0611/src/java/com/ebs/util/CFDIStringUtils.java#L12
    Pattern.compile("UUID=\".{36}\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/jdk/javadoc/tool/MaxWarns.java#L86
    Pattern.compile("warning - @param argument \"i[0-9]+\" is not a parameter name"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/jdk/javadoc/tool/MaxWarns.java#L95
    Pattern.compile("(?ms).*^([0-9]+) warnings$.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/DocLintTester.java#L127
    Pattern.compile("(?m)^(.*?)([-A-Za-z0-9.]+:[0-9]+:)"),
    // https://github.com/davetron5000/restunit/blob/c3200dde71495145bc943a6cd18f059cb0ec29db/src/java/com/gliffy/restunit/http/ContentType.java#L17
    Pattern.compile("^(\\s*[^;]*)\\s*;\\s*([^=]*)\\s*=\\s*(.*)\\s*$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L189
    Pattern.compile("No warnings or errors were found."),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L190
    Pattern.compile("([0-9]+) warnings, ([0-9]+) errors were found!.*?(Not all warnings/errors were shown.)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L191
    Pattern.compile("Tidy found ([0-9]+) warning[s]? and ([0-9]+) error[s]?!.*?(Not all warnings/errors were shown.)?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L192
    Pattern.compile("You are recommended to use CSS.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L193
    Pattern.compile("line [0-9]+ column [0-9]+ - (Error|Warning):.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L196
    Pattern.compile(".*Error: <.*> is not recognized!"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L197
    Pattern.compile(".*Error: missing quote mark for attribute value"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L198
    Pattern.compile(".*Warning: <.*> anchor \".*\" already defined"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L199
    Pattern.compile(".*Warning: <.*> attribute \".*\" has invalid value \".*\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L200
    Pattern.compile(".*Warning: <.*> attribute \".*\" lacks value"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L202
    Pattern.compile(".*Warning: <.*> attribute with missing trailing quote mark"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L203
    Pattern.compile(".*Warning: <.*> dropping value \".*\" for repeated attribute \".*\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L204
    Pattern.compile(".*Warning: <.*> inserting \".*\" attribute"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L205
    Pattern.compile(".*Warning: <.*> is probably intended as </.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L206
    Pattern.compile(".*Warning: <.*> isn't allowed in <.*> elements"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L207
    Pattern.compile(".*Warning: <.*> lacks \".*\" attribute"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L208
    Pattern.compile(".*Warning: <.*> missing '>' for end of tag"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L209
    Pattern.compile(".*Warning: <.*> proprietary attribute \".*\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L210
    Pattern.compile(".*Warning: <.*> unexpected or duplicate quote mark"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L211
    Pattern.compile(".*Warning: <a> cannot copy name attribute to id"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L212
    Pattern.compile(".*Warning: <a> escaping malformed URI reference"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L213
    Pattern.compile(".*Warning: <blockquote> proprietary attribute \"pre\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L214
    Pattern.compile(".*Warning: discarding unexpected <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L215
    Pattern.compile(".*Warning: discarding unexpected </.*>"),
  };
}
