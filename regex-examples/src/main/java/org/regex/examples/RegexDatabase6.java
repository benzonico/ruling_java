package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase6 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/utils/DateUtil.java#L11
    Pattern.compile("(?:([0-9]+)\\s*y[a-z]*[,\\s]*)?(?:([0-9]+)\\s*mo[a-z]*[,\\s]*)?(?:([0-9]+)\\s*w[a-z]*[,\\s]*)?(?:([0-9]+)\\s*d[a-z]*[,\\s]*)?(?:([0-9]+)\\s*h[a-z]*[,\\s]*)?(?:([0-9]+)\\s*m[a-z]*[,\\s]*)?(?:([0-9]+)\\s*(?:s[a-z]*)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/Utils.java#L29
    Pattern.compile("[A-Za-z0-9_]"),
    // https://github.com/IrisTc/CCPM/blob/f89ba3e271910f4a3cbf3053ba188e2591e7852c/app/src/main/java/com/iris/ccpm/LoginActivity.java#L267
    Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"),
    // https://github.com/IrisTc/CCPM/blob/f89ba3e271910f4a3cbf3053ba188e2591e7852c/app/src/main/java/com/iris/ccpm/LoginActivity.java#L277
    Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$"),
    // https://github.com/IrisTc/CCPM/blob/f89ba3e271910f4a3cbf3053ba188e2591e7852c/app/src/main/java/com/iris/ccpm/LoginActivity.java#L278
    Pattern.compile("^[1-9]{1}[0-9]{5,8}$"),
    // https://github.com/pengsasa123/myTest/blob/58d3dd5d47753c5163c1985c908878a98542d45a/src/main/java/util/ValidateUtils.java#L125
    Pattern.compile("^(([1-9]\\d?)|(1[0-7]\\d))(\\.\\d{1,6})|180|0(\\.\\d{1,6})?$"),
    // https://github.com/pengsasa123/myTest/blob/58d3dd5d47753c5163c1985c908878a98542d45a/src/main/java/util/ValidateUtils.java#L136
    Pattern.compile("^(([1-8]\\d?)|([1-8]\\d))(\\.\\d{1,6})|90|0(\\.\\d{1,6})?$"),
    // https://github.com/pengsasa123/myTest/blob/58d3dd5d47753c5163c1985c908878a98542d45a/src/main/java/util/ValidateUtils.java#L143
    Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$"),
    // https://github.com/pengsasa123/myTest/blob/58d3dd5d47753c5163c1985c908878a98542d45a/qingzu/qingzu2/src/main/java/test3.java#L19
    Pattern.compile("^(\\d+(?:\\.\\d+)?)$"),
    // https://github.com/Meiqia/MeiqiaSDK-Android/blob/fd34ad869db298776cd8343992117699d24b67f9/meiqiasdk/src/main/java/com/meiqia/meiqiasdk/util/MQUtils.java#L545
    Pattern.compile("[-0-9]", Pattern.CASE_INSENSITIVE),
    // https://github.com/Meiqia/MeiqiaSDK-Android/blob/fd34ad869db298776cd8343992117699d24b67f9/meiqiasdk/src/main/java/com/meiqia/meiqiasdk/util/MQUtils.java#L563
    Pattern.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?", Pattern.CASE_INSENSITIVE),
    // https://github.com/leiningbo/demo/blob/16627190d64d6854e2660b4ffee817c16b5befb2/src/test/java/com/example/demo/DemoApplicationTests.java#L279
    Pattern.compile("(\\d{12})(\\d{4})$"),
    // https://github.com/adminDavin/hanfu/blob/ba1a0ee984f01994192eb7bc8fbcdd31149ba20d/hanfu-user-center/src/main/java/com/hanfu/user/center/controller/KingWordsController.java#L441
    Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$"),
    // https://github.com/adminDavin/hanfu/blob/ba1a0ee984f01994192eb7bc8fbcdd31149ba20d/hanfu-user-center/src/main/java/com/hanfu/user/center/controller/KingWordsController.java#L1038
    Pattern.compile("(\\$)(.*?)(\\$)"),
    // https://github.com/charapennikaurm/java_regexp/blob/ef58ae4baafd8637fa86d1d5de10aac6a6c152cd/src/main/java/com/bsu/Main.java#L13
    Pattern.compile("\"[^\"]+\""),
    // https://github.com/qingdongC/BlogSystem/blob/ee5f6a94e5e14c77d50937ed02502ad1a5be5b68/src/main/java/com/duan/blogos/service/BlogFilterAbstract.java#L169
    Pattern.compile("<img src=\"(.*)\" .*>"),
    // https://github.com/Yuuko-oh/Yuuko/blob/bb67416cc537785f0203c8b2b4744d7555f86e2b/src/main/java/com/yuuko/core/commands/developer/commands/ShutdownCommand.java#L15
    Pattern.compile("[0-9]+\\s*-\\s*[0-9]+"),
    // https://github.com/Yuuko-oh/Yuuko/blob/bb67416cc537785f0203c8b2b4744d7555f86e2b/src/main/java/com/yuuko/core/commands/developer/commands/ShutdownCommand.java#L16
    Pattern.compile("([0-9]+\\s*,\\s*)+[0-9]+"),
    // https://github.com/graalvm/graalpython/blob/6850d6a86d3e276fc0e2ef1b7f05880b936284c5/graalpython/com.oracle.graal.python/src/com/oracle/graal/python/builtins/objects/cext/capi/CExtNodes.java#L3179
    Pattern.compile("%(?<flags>[-\\+ #0])?(?<width>\\d+)?(\\.(?<prec>\\d+))?(?<len>(l|ll|z))?(?<spec>[%cduixsAUVSR])"),
    // https://github.com/guilhermefacanha/log-viewer/blob/4ea89dede3d1a9f7b102f6a225e1f45de43bfc83/src/main/java/br/com/gfsolucoesti/utils/GFUtils.java#L104
    Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"),
    // https://github.com/guilhermefacanha/log-viewer/blob/4ea89dede3d1a9f7b102f6a225e1f45de43bfc83/src/main/java/br/com/gfsolucoesti/utils/GFUtils.java#L134
    Pattern.compile("[^a-zZ-Z0-9]"),
    // https://github.com/elastic/elasticsearch/blob/a679c5dd3b42d91d7624723d0b5e8c173d7cf76b/buildSrc/src/main/java/org/elasticsearch/gradle/DependenciesInfoTask.java#L202
    Pattern.compile(".*/elasticsearch/"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexMoreExercize/src/WinningTicket.java#L32
    Pattern.compile("(?<win>([@#$^])\\2{5,})"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexMoreExercize/src/SantaSecretHelper.java#L27
    Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behavior>[GN])!"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexMoreExercize/src/RageQuit.java#L12
    Pattern.compile("(?<sequens>[A-Za-z\\W_]+)(?<repeat>\\d+)"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/StarEnigma.java#L17
    Pattern.compile("[STARstar]"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/StarEnigma.java#L33
    Pattern.compile("@(?<name>[A-Z][a-z]+)[^@\\-!:>]*?:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD]{1})![^@\\-!:>]*\\->(?<soldier>\\d+)"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/gregorian/GregorianDateMatcher.java#L10
    Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/gregorian/FebruaryGeneralMatcher.java#L10
    Pattern.compile("^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"),
    // https://github.com/ilyas-ouchane/iwim-application/blob/cf3fed6c4cd7aa8d53d81250f785cfa007ff4a45/app/src/main/java/com/example/iwimapplication/Activity/Register.java#L89
    Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/Kemiazhuk/HomeTask/blob/64796f42564244db4531bbc85624ef736707fab1/src/org/kemy/string/StringApp.java#L14
    Pattern.compile("[A-z-']+"),
    // https://github.com/derekzhang79/whly/blob/704725156148e7538f9727d0fa8ab96938c205d2/src/main/java/com/thinkgem/jeesite/common/utils/StringUtils.java#L101
    Pattern.compile("<([a-z]+?)\\s+?.*?>"),
    // https://github.com/derekzhang79/whly/blob/704725156148e7538f9727d0fa8ab96938c205d2/src/main/java/com/thinkgem/jeesite/common/utils/StringUtils.java#L182
    Pattern.compile("(>)[^<>]*(<?)"),
    // https://github.com/derekzhang79/whly/blob/704725156148e7538f9727d0fa8ab96938c205d2/src/main/java/com/thinkgem/jeesite/common/utils/StringUtils.java#L187
    Pattern.compile("</?(AREA|BASE|BASEFONT|BODY|BR|COL|COLGROUP|DD|DT|FRAME|HEAD|HR|HTML|IMG|INPUT|ISINDEX|LI|LINK|META|OPTION|P|PARAM|TBODY|TD|TFOOT|TH|THEAD|TR|area|base|basefont|body|br|col|colgroup|dd|dt|frame|head|hr|html|img|input|isindex|li|link|meta|option|p|param|tbody|td|tfoot|th|thead|tr)[^<>]*/?>"),
    // https://github.com/derekzhang79/whly/blob/704725156148e7538f9727d0fa8ab96938c205d2/src/main/java/com/thinkgem/jeesite/common/utils/StringUtils.java#L190
    Pattern.compile("<([a-zA-Z]+)[^<>]*>(.*?)</\\1>"),
    // https://github.com/derekzhang79/whly/blob/704725156148e7538f9727d0fa8ab96938c205d2/src/main/java/com/thinkgem/jeesite/common/utils/StringUtils.java#L193
    Pattern.compile("<([a-zA-Z]+)[^<>]*>"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L71
    Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1172
    Pattern.compile("([1-9][0-9]+)-?bit"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1259
    Pattern.compile("[^a-z0-9]+"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1264
    Pattern.compile("^(x8664|amd64|ia32e|em64t|x64)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1267
    Pattern.compile("^(x8632|x86|i[3-6]86|ia32|x32)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1270
    Pattern.compile("^(ia64|itanium64)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1273
    Pattern.compile("^(sparc|sparc32)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1276
    Pattern.compile("^(sparcv9|sparc64)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1279
    Pattern.compile("^(arm|arm32)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/util/internal/PlatformDependent.java#L1285
    Pattern.compile("^(ppc|ppc32)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/resolver/HostsFileParser.java#L51
    Pattern.compile("[ \t]+"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/handler/ssl/SslHandler.java#L170
    Pattern.compile("^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/io/netty/handler/ssl/SslHandler.java#L172
    Pattern.compile("^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/aakash2809/java-regex-user-registration-validation-problem/blob/c1e9c1473e50ab6a67377912d504ecb2bb926d6a/src/RegexValidator.java#L10
    Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}$"),
    // https://github.com/aakash2809/java-regex-user-registration-validation-problem/blob/c1e9c1473e50ab6a67377912d504ecb2bb926d6a/src/RegexValidator.java#L48
    Pattern.compile("^([A-Za-z\\d-_\\+]+)(\\.[A-Za-z\\d-_]+)?@([a-zA-Z\\d]+)\\.([a-zA-Z]{2,4})(\\.[A-Za-z]{2,4})?$"),
    // https://github.com/aakash2809/java-regex-user-registration-validation-problem/blob/c1e9c1473e50ab6a67377912d504ecb2bb926d6a/src/RegexValidator.java#L58
    Pattern.compile("^(\\+?\\d{1,3})[ ]([0-9]{10})$"),
    // https://github.com/aakash2809/java-regex-user-registration-validation-problem/blob/c1e9c1473e50ab6a67377912d504ecb2bb926d6a/src/RegexValidator.java#L70
    Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9!?.+-~!@#$%^&*_]{8,}$"),
    // https://github.com/inkarnadin/cms-check-component/blob/7b2a6487fafdb588d8d7d62dcb10afc4f263c738/src/main/java/web/cms/joomla/JoomlaVersionProcessor.java#L57
    Pattern.compile("<meta name=\"generator\".*Version\\s(.*)\" />"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L106
    Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L110
    Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L198
    Pattern.compile(" *\n *"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L203
    Pattern.compile("[ \t\\x0B\f\r]+"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L217
    Pattern.compile("\n$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/TtmlRenderer.java#L462
    Pattern.compile("^.*:"),
    // https://github.com/jkipper2020/javaDatabase/blob/e9e43609fc28c40323e43927b780efce69f47b2e/src/main/DateClass.java#L43
    Pattern.compile("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"),
    // https://github.com/stephengold/Heart/blob/076df7224f825de46f9712f6a4f80f0e7e128901/HeartLibrary/src/main/java/jme3utilities/MyString.java#L58
    Pattern.compile("[Ee][+-]?\\d+$"),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L32
    Pattern.compile("CONNECT.*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L33
    Pattern.compile("\\s*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L35
    Pattern.compile("SUBSCRIBE.*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L37
    Pattern.compile("MESSAGE.*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L40
    Pattern.compile("UNSUBSCRIBE.*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L42
    Pattern.compile("ERROR.*", Pattern.DOTALL),
    // https://github.com/trickl/flux-extensions/blob/26c7ea7f08710b536d35ac14bc78185b7bbc8bc0/src/test/java/com/trickl/flux/websocket/stomp/StompFluxClientTest.java#L44
    Pattern.compile("DISCONNECT.*", Pattern.DOTALL),
    // https://github.com/awslabs/djl/blob/e844aaf27e60b3323a9f1ebf05a5f00ef61e6419/dlr/dlr-engine/src/main/java/ai/djl/dlr/jni/LibUtils.java#L52
    Pattern.compile("(\\d+\\.\\d+\\.\\d+(-\\w)?)(-SNAPSHOT)?(-\\d+)?"),
    // https://github.com/oradian/monohash/blob/325e90b9511927b67857d2f43699a7985df4d711/src/main/java/com/oradian/infra/monohash/HashPlan.java#L66
    Pattern.compile("/*$"),
    // https://github.com/AuraDevelopmentTeam/AuraUpdateChecker/blob/bd2950206ca390829e72afcf3429eb0ce3f00b2b/src/main/java/dev/aura/updatechecker/util/PluginContainerUtil.java#L14
    Pattern.compile("<pluginId>"),
    // https://github.com/AuraDevelopmentTeam/AuraUpdateChecker/blob/bd2950206ca390829e72afcf3429eb0ce3f00b2b/src/main/java/dev/aura/updatechecker/util/PluginContainerUtil.java#L16
    Pattern.compile("<pluginNAME>"),
    // https://github.com/LuciferCoding/VirtualPiano/blob/42722d8dfacb0b3370b4a4f6de280166f0ef3330/app/src/main/java/com/adesk/virtualpiano/PianoPlayer.java#L97
    Pattern.compile("\\(([^}]*)\\)"),
    // https://github.com/apache/hive/blob/70f19ae758e3a58ed02b51612b6e6635b068eea0/itests/hive-unit/src/test/java/org/apache/hadoop/hive/ql/txn/compactor/TestCrudCompactorOnTez.java#L631
    Pattern.compile("(bucket_[0-9]+)(_[0-9]+)?"),
    // https://github.com/privateXqr/cm_web/blob/470707b0b4d8cc44e5bda76026061ce2a0b0ed72/cm_web/src/main/java/com/sy/util/StringReqUtil.java#L50
    Pattern.compile(".*[A-Z][a-z]{2}\\s[A-Z][a-z]{2}\\s[0-3][0-9]\\s[0-2][0-9]?:[0-5][0-9]?:[0-5][0-9]\\s[A-Z]{3}\\s[0-9]{4}.*"),
    // https://github.com/epam/cloud-pipeline/blob/4607a3e0e55b99d82f0770be1e818569ed499e28/e2e/gui/src/test/java/com/epam/pipeline/autotests/ao/LogAO.java#L402
    Pattern.compile("\\d+ available storage\\(s\\)\\. Checking mount options\\."),
    // https://github.com/epam/cloud-pipeline/blob/4607a3e0e55b99d82f0770be1e818569ed499e28/e2e/gui/src/test/java/com/epam/pipeline/autotests/ao/LogAO.java#L404
    Pattern.compile(" \\d* "),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L14
    Pattern.compile("\\{#[0-9a-fA-F]{6}\\}"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L17
    Pattern.compile("\\\u00a7x[\\\u00a70-9a-fA-F]{12}"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L20
    Pattern.compile("#<[0-9a-fA-F]{6}>"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L23
    Pattern.compile("<#[0-9a-fA-F]{6}>[^<]*</#[0-9a-fA-F]{6}>"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L26
    Pattern.compile("\\{#[0-9a-fA-F]{6}>\\}[^\\{]*\\{#[0-9a-fA-F]{6}<\\}"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/rgb/RGBUtils.java#L29
    Pattern.compile("<\\$#[0-9a-fA-F]{6}>[^<]*<\\$#[0-9a-fA-F]{6}>"),
    // https://github.com/NEZNAMY/TAB/blob/52a4a3453fb47fbda170f9763d48d9e86dc9f046/src/main/java/me/neznamy/tab/shared/placeholders/Placeholders.java#L21
    Pattern.compile("%([^%]*)%"),
    // https://github.com/nthykier/IDEA-debpkg/blob/c9410859663d88ddd859fb45f5c9c1e6759f44db/src/main/java/com/github/nthykier/debpkg/deb822/dialects/Deb822DialectDebianCopyrightFileTypeDetector.java#L15
    Pattern.compile("^Format\\s*:\\s*https?://www[.]debian[.]org/doc/packaging-manuals/copyright-format/\\d+[.]\\d+"),
    // https://github.com/seppukudevelopment/seppuku/blob/f0d1019a18002a16608a96417a70356ea8908148/src/main/java/me/rigamortis/seppuku/impl/module/misc/AutoIgnoreModule.java#L26
    Pattern.compile("<(\\S+)\\s*(\\S+?)?>\\s(.*)"),
    // https://github.com/KlubJagiellonski/pola-facebook/blob/d0cfbf8ef2b5c9a74803f83fbacd8363515a9c9e/src/main/java/com/domain/process/engine/machine/dispatcher/DispatcherHelper.java#L124
    Pattern.compile("(?<=^|\\s)\\d{13}(?:(?=$|\\s|[.,;?]))|(?<=^|\\s)\\d{8}(?:(?=$|\\s|[.,;?]))"),
    // https://github.com/graywolf/gecko-dev/blob/83462587a0fdc0c1477186e7f38f342181b0cdf4/mobile/android/geckoview_example/src/main/java/org/mozilla/geckoview_example/GeckoViewActivity.java#L1413
    Pattern.compile("(filename=\"?)(.+)(\"?)"),
    // https://github.com/graywolf/gecko-dev/blob/83462587a0fdc0c1477186e7f38f342181b0cdf4/mobile/android/geckoview/src/main/java/org/mozilla/gecko/util/IntentUtils.java#L31
    Pattern.compile("(.+)=(.*)"),
    // https://github.com/Evervolv/android_packages_apps_Snap/blob/ef738b759785ab11ec3f35327d3be908e2046392/quickReader/src/org/lineageos/quickreader/ScannerActivity.java#L51
    Pattern.compile("(?i)((?:http|https|file|chrome)://|(?:inline|data|about|javascript):)(.*)"),
    // https://github.com/Evervolv/android_packages_apps_Dialer/blob/6a0cea80e39c33847c3d26b14afe2575a482d15d/java/com/android/voicemail/impl/mail/internet/MimeUtility.java#L47
    Pattern.compile("\r|\n"),
    // https://github.com/Evervolv/android_packages_apps_Dialer/blob/6a0cea80e39c33847c3d26b14afe2575a482d15d/java/com/android/voicemail/impl/mail/internet/MimeMessage.java#L84
    Pattern.compile("^<?([^>]+)>?$"),
    // https://github.com/Evervolv/android_packages_apps_Dialer/blob/6a0cea80e39c33847c3d26b14afe2575a482d15d/java/com/android/voicemail/impl/mail/internet/MimeMessage.java#L86
    Pattern.compile("\r?\n"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/util/SqlUtil.java#L136
    Pattern.compile("'$"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/util/SqlUtil.java#L136
    Pattern.compile("B'"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/util/SqlUtil.java#L136
    Pattern.compile("b'"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/util/SqlUtil.java#L140
    Pattern.compile("'::\"bit\""),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/util/SqlUtil.java#L300
    Pattern.compile(":name|\\?|:value"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/structure/AbstractDatabaseObject.java#L177
    Pattern.compile("(.*)!\\{(.*)\\}"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/sqlgenerator/core/AddColumnGenerator.java#L203
    Pattern.compile("([\\w\\._]+)\\(([\\w_]+)\\)"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java#L40
    Pattern.compile("'(.*)'::[\\w ]+"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java#L41
    Pattern.compile("(\\d*)::[\\w ]+"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java#L438
    Pattern.compile(", $"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/serializer/core/formattedsql/FormattedSqlChangeLogSerializer.java#L25
    Pattern.compile(".*\\.(\\w+)\\.sql"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/xml/StandardNamespaceDetails.java#L19
    Pattern.compile("http://www.liquibase.org/xml/ns/dbchangelog/(dbchangelog-[\\d\\.]+.xsd)"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/xml/StandardNamespaceDetails.java#L20
    Pattern.compile("http://www.liquibase.org/xml/ns/migrator/(dbchangelog-[\\d\\.]+.xsd)"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L41
    Pattern.compile("\\-\\-\\s*liquibase formatted.*"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L81
    Pattern.compile("\\-\\-\\s*liquibase formatted.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L82
    Pattern.compile("\\-\\-[\\s]*changeset\\s+([^:]+):(\\S+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L83
    Pattern.compile("\\s*\\-\\-[\\s]*rollback (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L84
    Pattern.compile("\\s*\\-\\-[\\s]*preconditions(.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L85
    Pattern.compile("\\s*\\-\\-[\\s]*precondition\\-([a-zA-Z0-9-]+) (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L86
    Pattern.compile(".*stripComments:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L87
    Pattern.compile(".*splitStatements:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L88
    Pattern.compile(".*rollbackSplitStatements:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L89
    Pattern.compile(".*endDelimiter:(\\S*).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L90
    Pattern.compile(".*rollbackEndDelimiter:(\\S*).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L91
    Pattern.compile("\\-\\-[\\s]*comment:? (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L92
    Pattern.compile("\\-\\-[\\s]*validCheckSum:? (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L94
    Pattern.compile(".*runOnChange:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L95
    Pattern.compile(".*runAlways:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L96
    Pattern.compile(".*context:(\".*\"|\\S*).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L97
    Pattern.compile(".*logicalFilePath:(\\S*).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L98
    Pattern.compile(".*labels:(\\S*).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L99
    Pattern.compile(".*runInTransaction:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L100
    Pattern.compile(".*dbms:([^,][\\w!,]+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L101
    Pattern.compile(".*failOnError:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L102
    Pattern.compile(".*onFail:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L103
    Pattern.compile(".*onError:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L104
    Pattern.compile(".*onUpdateSQL:(\\w+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L130
    Pattern.compile("^not required.*"),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L286
    Pattern.compile("^(?:expectedResult:)?(\\w+) (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L287
    Pattern.compile("^(?:expectedResult:)?'([^']+)' (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L288
    Pattern.compile("^(?:expectedResult:)?\"([^\"]+)\" (.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Saorionesan/liquibase-core/blob/a54db29c0bc2228cb9bf7244d62c9fd8d78df9b0/src/main/java/liquibase/parser/core/formattedsql/FormattedSqlChangeLogParser.java#L318
    Pattern.compile("\\.*"),
    // https://github.com/stuartwdouglas/optimus/blob/180c6c544634c7affe9bf3f8adcfe9dd148fc2c1/src/main/java/io/quarkus/optimus/CustomRepositoryConnectorFactory.java#L124
    Pattern.compile("<version>(.*?)</version>"),
    // https://github.com/DerpFest-11/packages_apps_DocumentsUI/blob/4cb649b53219d9a1aaea1ab4cdeb1dd20eea95c2/tests/common/com/android/documentsui/bots/DirectoryListBot.java#L59
    Pattern.compile("^Deleting [0-9]+ item.+"),
    // https://github.com/DerpFest-11/packages_apps_DocumentsUI/blob/4cb649b53219d9a1aaea1ab4cdeb1dd20eea95c2/src/com/android/documentsui/inspector/GpsCoordinatesTextClassifier.java#L43
    Pattern.compile("-?(90(\\.0*)?|[1-8]?[0-9](\\.[0-9]*)?), *-?(180(\\.0*)?|([1][0-7][0-9]|[0-9]?[0-9])(\\.[0-9]*)?)"),
    // https://github.com/jenkinsci/teamscale-upload-plugin/blob/0a7fd6f843cdd13f26982943b2a72b65549f8ed6/src/main/java/eu/cqse/teamscale/jenkins/upload/TeamscaleUploadBuilder.java#L223
    Pattern.compile("^((([a-f]|[0-9])+)|([0-9])+)$"),
    // https://github.com/ogerardin/xpman/blob/ab0265cb8c74f0780287b4441ac9b2ea21809c35/xpman-api/src/main/java/com/ogerardin/xplane/config/aircrafts/custom/FlightFactorA350.java#L49
    Pattern.compile("([0-9]{2})([0-9]{2})([0-9]{2})"),
    // https://github.com/dbyte/tankschlau/blob/e56a5dbdf0a401cd04695c5118b575b6a375db3d/src/main/java/de/fornalik/tankschlau/gui/PrefsFactoryMixin.java#L153
    Pattern.compile("^(0|[1-9]\\d*)(\\.\\d*)?$"),
    // https://github.com/VolodyaZ/Lab_8/blob/f72a50352d20a74040978d0020ecf6eec1812038/main/java/com/company/RegExTasks.java#L17
    Pattern.compile("(?<=\\. )\\s*|(?<=\\w)\\s+"),
    // https://github.com/VolodyaZ/Lab_8/blob/f72a50352d20a74040978d0020ecf6eec1812038/main/java/com/company/RegExTasks.java#L28
    Pattern.compile("^https?:\\/\\/((([^\\-\\.][a-zA-Z0-9\\-]{0,50}[^\\-\\.])|\\w)\\.){1,50}(([^\\-\\.][a-zA-Z0-9\\-]{0,50}[^\\-\\.])|\\w)\\/?$"),
    // https://github.com/VolodyaZ/Lab_8/blob/f72a50352d20a74040978d0020ecf6eec1812038/main/java/com/company/RegExTasks.java#L51
    Pattern.compile("(?<= [\"']|^['\"]).*?(?=[\"'] |[\"']$)|([\\w]+-?[\\w]*'?[\\w]+)|\\w"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-dataflow/v1b3/1.31.0/com/google/api/services/dataflow/Dataflow.java#L467
    Pattern.compile("^projects/[^/]+/catalogTemplates/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-cloudtasks/v2beta3/1.31.0/com/google/api/services/cloudtasks/v2beta3/CloudTasks.java#L700
    Pattern.compile("^projects/[^/]+/locations/[^/]+/queues/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-cloudtasks/v2beta3/1.31.0/com/google/api/services/cloudtasks/v2beta3/CloudTasks.java#L2465
    Pattern.compile("^projects/[^/]+/locations/[^/]+/queues/[^/]+/tasks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-artifactregistry/v1beta2/1.31.0/com/google/api/services/artifactregistry/v1beta2/ArtifactRegistry.java#L1053
    Pattern.compile("^projects/[^/]+/locations/[^/]+/repositories/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-artifactregistry/v1beta2/1.31.0/com/google/api/services/artifactregistry/v1beta2/ArtifactRegistry.java#L2138
    Pattern.compile("^projects/[^/]+/locations/[^/]+/repositories/[^/]+/files/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-artifactregistry/v1beta2/1.31.0/com/google/api/services/artifactregistry/v1beta2/ArtifactRegistry.java#L2506
    Pattern.compile("^projects/[^/]+/locations/[^/]+/repositories/[^/]+/packages/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-artifactregistry/v1beta2/1.31.0/com/google/api/services/artifactregistry/v1beta2/ArtifactRegistry.java#L3112
    Pattern.compile("^projects/[^/]+/locations/[^/]+/repositories/[^/]+/packages/[^/]+/tags/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/517838f9f4565f482efac78338958242bb0fc542/clients/google-api-services-artifactregistry/v1beta2/1.31.0/com/google/api/services/artifactregistry/v1beta2/ArtifactRegistry.java#L3768
    Pattern.compile("^projects/[^/]+/locations/[^/]+/repositories/[^/]+/packages/[^/]+/versions/[^/]+$"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/formula/SheetNameFormatter.java#L38
    Pattern.compile("([A-Za-z]+)([0-9]+)"),
    // https://github.com/ballerina-platform/ballerina-lang/blob/5681d4763f080a1146a787d7ffb8c5364a7491fb/compiler/ballerina-lang/src/main/java/io/ballerina/projects/SemanticVersion.java#L30
    Pattern.compile("(\\d+)\\.(\\d+)(?:\\.)?(\\d*)"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/B%E5%91%98%E5%B7%A5%E5%8D%A1%E5%8F%91%E8%A1%8C%E7%B3%BB%E7%BB%9F/ETMCS/src/com/goldsign/etmcs/ui/panel/ReturnCardPanel.java#L964
    Pattern.compile("^[A-Za-z0-9]+$"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/B%E5%91%98%E5%B7%A5%E5%8D%A1%E5%8F%91%E8%A1%8C%E7%B3%BB%E7%BB%9F/ETMCS/src/com/goldsign/etmcs/ui/panel/MadeCardPanel.java#L1165
    Pattern.compile("^[A-C]+$"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/6%E6%B8%85%E5%88%86%E8%A7%84%E5%88%99%E7%B3%BB%E7%BB%9F/AccWebRL/src/com/goldsign/acc/app/password/controller/PasswordEdit.java#L83
    Pattern.compile("^(([A-Z]*|[a-z]*|\\d*|[-_\\~!@#\\$%\\^&\\*\\.\\(\\)\\[\\]\\{\\}<>\\?\\\\\\/\\'\\\"]*)|.{0,5})$|\\s"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/6%E6%B8%85%E5%88%86%E8%A7%84%E5%88%99%E7%B3%BB%E7%BB%9F/AccWebRL/src/com/goldsign/acc/app/password/controller/PasswordEdit.java#L89
    Pattern.compile("^[a-zA-Z0-9_]+$"),
    // https://github.com/xitosniper/FatManCosmetic/blob/463e20e797255f19ccfde6dfac1cf793d523309e/app/src/main/java/com/example/fatmancosmetic/Controller/CheckOut.java#L1177
    Pattern.compile("\\\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b", Pattern.CASE_INSENSITIVE),
    // https://github.com/OE-FET/JISA/blob/2fbe1f5ff20367e565d39c64b1a6f895415d1eb3/src/jisa/devices/K2400.java#L18
    Pattern.compile("MODEL (2400|2410|2420|2425|2430|2440)"),
    // https://github.com/OE-FET/JISA/blob/2fbe1f5ff20367e565d39c64b1a6f895415d1eb3/src/jisa/devices/K236.java#L950
    Pattern.compile("MSTG([0-9]{2}),([0-9]),([0-9])K([0-3])M([0-9]{3}),([0-9])N([0-1])R([0-1])T([0-4]),([0-8]),([0-8]),([0-1])V([0-1])Y([0-4])"),
    // https://github.com/OE-FET/JISA/blob/2fbe1f5ff20367e565d39c64b1a6f895415d1eb3/src/jisa/devices/K236.java#L985
    Pattern.compile("[IV]MPL,([0-9]{2})F([0-1]),([0-1])O([0-1])P([0-5])S([0-3])W([0-1])Z([0-1])"),
    // https://github.com/micronaut-projects/micronaut-kafka/blob/4bb40337ee6fe145cd07c6666a73c15136370684/kafka/src/main/java/io/micronaut/configuration/kafka/exceptions/DefaultKafkaListenerExceptionHandler.java#L43
    Pattern.compile(".+ for partition (.+)-(\\d+) at offset (\\d+)\\..+"),
    // https://github.com/aherbert/gdsc-smlm/blob/b17a4e78583d9665fa0acb74144743559ea19f5f/src/main/java/uk/ac/sussex/gdsc/smlm/ij/plugins/pcpalm/PcPalmFitting.java#L780
    Pattern.compile("#([^=]+) = ([^ ]+)"),
    // https://github.com/aherbert/gdsc-smlm/blob/b17a4e78583d9665fa0acb74144743559ea19f5f/src/main/java/uk/ac/sussex/gdsc/smlm/ij/plugins/PeakFit.java#L766
    Pattern.compile("Source: (<.*IJImageSource>.*<.*IJImageSource>)", Pattern.DOTALL),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L137
    Pattern.compile("^\\>[ \t\n\r]*\\*\\*\\_(.*?):?\\_\\*\\*(.*)$"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L139
    Pattern.compile("^\\>(.*)$"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L142
    Pattern.compile("^([#]+)\\s*([0-9]+(?:\\.[0-9]+)*\\.?)?\\s*(.*?)\\s*(?:\\{\\s*([a-z\\-]+)\\s*\\})?\\s*$"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L151
    Pattern.compile("^\\s*([0-9]+(?:\\.[0-9]+)*\\.?)\\s*(.*?)$"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L1129
    Pattern.compile("[^a-zA-Z0-9]+"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L1131
    Pattern.compile("^[^a-zA-Z0-9]+"),
    // https://github.com/sarl/sarl/blob/0d8259d21ab2fa1c563175d231ed35ee7003a903/main/externalmaven/io.sarl.maven.docs.generator/src/main/java/io/sarl/maven/docs/markdown/MarkdownParser.java#L1132
    Pattern.compile("[^a-zA-Z0-9]+$"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L25
    Pattern.compile("(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/|[ \\t]*//.*)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L33
    Pattern.compile("('.')"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L34
    Pattern.compile("(\".*\")"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L35
    Pattern.compile("(<.*>)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L37
    Pattern.compile("([|&<>(=][ ]*)-[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L41
    Pattern.compile("((\\([ ]*)|(=[ ]*))-[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L46
    Pattern.compile("[0-9]+\\.?[0-9]+([eE][-+]?[0-9]+)?"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L65
    Pattern.compile("(\\?\\.)|(\\?:)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L71
    Pattern.compile("(\\.\\.)|(\\?\\.)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L77
    Pattern.compile("(\\?:)|(::)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L84
    Pattern.compile("(\\+\\+)|(\\+=)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L91
    Pattern.compile("(--)|(-=)|(->)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L97
    Pattern.compile("(\\*=)|(/=)|(%=)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L103
    Pattern.compile("(>=)|(<=)|(->)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L110
    Pattern.compile("(!!)|(!=)"),
    // https://github.com/m0rk4/Kotlin-Jilb-Analysis/blob/d2e5f104a690dfc2db8abae8a1b616ff615e0da2/src/main/java/by/mark/TextParser.java#L116
    Pattern.compile("(\\+=)|(-=)|(\\*=)|(/=)|(%=)|(==)|(!=)|(<=)|(>=)"),
    // https://github.com/seoful/PictionaryFront/blob/21e8fd8145e0b4fc9b4252c67a8f8fc4e12bcb21/src/sample/Controller.java#L80
    Pattern.compile("^\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/seoful/PictionaryFront/blob/21e8fd8145e0b4fc9b4252c67a8f8fc4e12bcb21/src/sample/Controller.java#L138
    Pattern.compile("^\\w+", Pattern.CASE_INSENSITIVE),
    // https://github.com/wangwenjun/cicd/blob/1ad4d73c80330f6d07c115df8a089b53c0188b14/src/test/java/com/wangwenjun/cicd/chapter01/UnitTestBestPracticeTest.java#L20
    Pattern.compile("\\d{6}"),
    // https://github.com/wangwenjun/cicd/blob/1ad4d73c80330f6d07c115df8a089b53c0188b14/src/main/java/com/wangwenjun/cicd/chapter07/FullNameSplit.java#L9
    Pattern.compile("\\s*((?i)miss|ms|mrs|mr|sir)?\\s*([a-zA-Z0-9\\s]+)"),
    // https://github.com/wangwenjun/cicd/blob/1ad4d73c80330f6d07c115df8a089b53c0188b14/src/main/java/com/wangwenjun/cicd/chapter01/Expression.java#L48
    Pattern.compile("^(\\d+)([\\+|\\-|\\*|\\/])(\\d+)$"),
    // https://github.com/privatefoundation/pqvid/blob/6e41e9bd55925b83364ce58cb722a08c02fbf16a/src/main/java/io/kamax/matrix/room/RoomAlias.java#L28
    Pattern.compile("#(.+?):(.+)"),
    // https://github.com/SagarGi/AR-System/blob/9a00f29f852c65ab4b6fda0e6fc3b1800dd40a7e/project%20minor%201/com.gces.minor_project_i/src/com/gces/minor_project_i/staffadd.java#L506
    Pattern.compile("^[a-z]{0,4}[0-9]{0,4}$"),
    // https://github.com/SagarGi/AR-System/blob/9a00f29f852c65ab4b6fda0e6fc3b1800dd40a7e/project%20minor%201/com.gces.minor_project_i/src/com/gces/minor_project_i/staffadd.java#L530
    Pattern.compile("^[a-zA-Z\\s]{2,22}+$"),
    // https://github.com/SagarGi/AR-System/blob/9a00f29f852c65ab4b6fda0e6fc3b1800dd40a7e/project%20minor%201/com.gces.minor_project_i/src/com/gces/minor_project_i/staffadd.java#L555
    Pattern.compile("^[a-zA-Z0-9]{0,15}$"),
    // https://github.com/SagarGi/AR-System/blob/9a00f29f852c65ab4b6fda0e6fc3b1800dd40a7e/project%20minor%201/com.gces.minor_project_i/src/com/gces/minor_project_i/staffadd.java#L579
    Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"),
    // https://github.com/SagarGi/AR-System/blob/9a00f29f852c65ab4b6fda0e6fc3b1800dd40a7e/project%20minor%201/com.gces.minor_project_i/src/com/gces/minor_project_i/staffadd.java#L628
    Pattern.compile("^[a-zA-Z0-9\\s]{2,25}+$"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L8
    Pattern.compile("(a+)*"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L10
    Pattern.compile("(a+)*", Pattern.CASE_INSENSITIVE),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L24
    Pattern.compile(".*<script>.*"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L34
    Pattern.compile(".+@.+"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L64
    Pattern.compile("asdklj44_"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L65
    Pattern.compile("a+"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L67
    Pattern.compile("a{1}"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L68
    Pattern.compile("(a{1})*"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L70
    Pattern.compile("(a{1})+"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L71
    Pattern.compile("(a+)+"),
    // https://github.com/ChinnapaY/SonarJava/blob/2566cfc056580a634accdfe650770926fb6466c0/java-checks/src/test/files/checks/security/RegexHotspotCheck.java#L72
    Pattern.compile("(a{1}){2}"),
    // https://github.com/saberduck/sonar-java-test/blob/6e44241f8eb5299594c1bb0ea14ecd524bbe5767/src/main/java/checks/security/RegexHotspotCheck.java#L41
    Pattern.compile("arg"),
    // https://github.com/polovyivan/challenges-mix/blob/700c35697e286146d7879c1c1b302b2bdbc46d56/spring-framework/bean-validation/src/test/java/com/ivan/polovyi/challenges/beanvalidation/javax/ValidationJavaxTest.java#L506
    Pattern.compile("\\brejectedValue"),
    // https://github.com/kazuma-mikami/spring-practice/blob/1a1b48d00c12d478b4308f4c10a3855ab8a83237/Sample/src/main/java/com/example/demo/biz/service/domain/Customer.java#L41
    Pattern.compile(".*@ng.foo.baz$"),
    // https://github.com/Francislin123/apache-camel/blob/2c0c915ad7dac9c236d057be4379f76df7b01349/src/main/java/com/walmart/feeds/api/resources/feed/validator/SlugValidator.java#L14
    Pattern.compile("[a-z0-9]*-?[a-z0-9]*"),
    // https://github.com/thomplth/ridesharing-system-db/blob/5be80101ec86f9d45c712058004fc29da1e112a4/RideSharing/src/ridesharing/Passenger.java#L207
    Pattern.compile("[1-2][0-9][0-9][0-9]-(0[1-9]|1[0-2])-([1-9]|[12][0-9]|3[01])"),
    // https://github.com/nagyerik99/Document_manager_HF/blob/b6929ef554282813de9312bc844fb30a02719722/src/Logical_elements/DateMatcher.java#L17
    Pattern.compile("\\d{4,}\\.\\d{2,}\\.\\d{2,}$"),
    // https://github.com/nagyerik99/Document_manager_HF/blob/b6929ef554282813de9312bc844fb30a02719722/src/Logical_elements/DateMatcher.java#L21
    Pattern.compile("\\d{4,}\\/\\d{2,}\\/\\d{2,}$"),
    // https://github.com/nagyerik99/Document_manager_HF/blob/b6929ef554282813de9312bc844fb30a02719722/src/Logical_elements/DateMatcher.java#L25
    Pattern.compile("\\d{4,}\\.\\d{2,}\\.\\d{2,}\\-\\d{4,}\\.\\d{2,}\\.\\d{2,}$"),
    // https://github.com/nagyerik99/Document_manager_HF/blob/b6929ef554282813de9312bc844fb30a02719722/src/Logical_elements/DateMatcher.java#L29
    Pattern.compile("\\d{4,}\\/\\d{2,}\\/\\d{2,}\\-\\d{4,}\\/\\d{2,}\\/\\d{2,}$"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/YouTubePlaylistExtractor.java#L40
    Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/playlist\\?list=(.+?)( |\\z)"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/YouTubePlaylistExtractor.java#L43
    Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)&list=(.+?)( |&|\\z)"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/YouTubePlaylistExtractor.java#L45
    Pattern.compile("data-video-id=\"(.+?)\""),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/RaspiYouTubeExtractor.java#L42
    Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)( |\\z|&)"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/RaspiYouTubeExtractor.java#L43
    Pattern.compile("(http|https)://(www\\.|)youtu.be/(.+?)( |\\z|&)"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/youtube/RaspiYouTubeExtractor.java#L152
    Pattern.compile("\\p{Graph}+?"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/utils/RaspiUtils.java#L55
    Pattern.compile("[0-9]:.*?:.*?:.*?:([a-z]*? | )"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/RaspiListActivity.java#L50
    Pattern.compile("((http://|https://)(.+?))(\\s|\\z)"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/RaspiListActivity.java#L51
    Pattern.compile(".*(http|https)://(www\\.|m.|)youtube\\.com/playlist\\?list=(.+?)( |\\z).*"),
    // https://github.com/HaarigerHarald/raspicast/blob/a46ea1e47886b04ec8373b756a5842ca1ff3fcda/src/main/java/at/huber/raspicast/RaspiListActivity.java#L52
    Pattern.compile(".*(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)&list=(.+?)( |&|\\z).*"),
    // https://github.com/ft3356054/share-elec/blob/0c2aabd7f63c79edb9b7d0238e2520250dfe9edd/src/main/java/com/sgcc/uap/util/ValidateUtil.java#L22
    Pattern.compile("^(1)\\d{10}$"),
    // https://github.com/ft3356054/share-elec/blob/0c2aabd7f63c79edb9b7d0238e2520250dfe9edd/src/main/java/com/sgcc/uap/util/ValidateUtil.java#L27
    Pattern.compile("^0\\d{2,3}-?\\d{7,8}$"),
    // https://github.com/ft3356054/share-elec/blob/0c2aabd7f63c79edb9b7d0238e2520250dfe9edd/src/main/java/com/sgcc/uap/util/ValidateUtil.java#L32
    Pattern.compile("^([a-zA-Z0-9]+[_|_|.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|_|.]?)*[a-zA-Z0-9]+\\.(?:com|cn)$"),
    // https://github.com/ft3356054/share-elec/blob/0c2aabd7f63c79edb9b7d0238e2520250dfe9edd/src/main/java/com/sgcc/uap/util/ValidateUtil.java#L37
    Pattern.compile("^[A-Za-z_\\d]+$"),
    // https://github.com/jyotipandey21/jyo_project/blob/868511f442661d1e6b7e42213de8e27bfe01ac7a/src/main/java/Aaa/desire_expressio.java#L10
    Pattern.compile(".*somestring.*"),
    // https://github.com/wizzdi/wizzdi-setup/blob/a90a1a5d5fe4e707671ffd1e462be859d99fb910/src/main/java/com/flexicore/installer/model/InstallationTask.java#L2892
    Pattern.compile("version"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/SoftUniBarIncome.java#L11
    Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Race.java#L10
    Pattern.compile(",\\s+"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Race.java#L15
    Pattern.compile("[A-Za-z]"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/NetherRealms.java#L28
    Pattern.compile("\\-?\\d+\\.?\\d*"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/NetherRealms.java#L35
    Pattern.compile("[*/]"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/NetherRealms.java#L56
    Pattern.compile("[^\\d\\+\\-\\*\\/\\.]"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/MatchPhoneNumber.java#L12
    Pattern.compile("\\+359([ \\-])2\\1([\\d]{3}\\1[\\d]{4})\\b"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Furniture.java#L14
    Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+.?\\d+?)!(?<quantyti>\\d+)"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Emails.java#L9
    Pattern.compile("\\s(?<user>[A-Za-z0-9]+[-._]?[A-Za-z\\d]*@{1})(?<host>[a-z]+(-[a-z]+)?(\\.{1}[a-z]+){1,2})\\b"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/FindNames.java#L10
    Pattern.compile("\\b([A-Z][a-z]+)( )([A-Z][a-z]+)\\b"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Dates.java#L13
    Pattern.compile("\\b(?<day>[\\d]{2})([\\/\\-\\.])(?<moth>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})\\b"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Dates.java#L23
    Pattern.compile("[,\\s+]"),
    // https://github.com/knaevKMK/Fundsmental-Java/blob/e54cf0923d03b5953af2fc4aa762978a8cf1e7e1/RegexLab/src/Dates.java#L29
    Pattern.compile("[-\\.\\/]"),
    // https://github.com/victorgrubio/hackerrank/blob/696a391cfce4ab65eb569e7139e9c1bf78efdab7/java/strings/duplicate_word/DuplicateWords.java#L9
    Pattern.compile("\\b(\\w+)(\\W+\\1\\b)\\2*", Pattern.CASE_INSENSITIVE),
    // https://github.com/segler-alex/RadioDroid/blob/a3a37282a821c21e8fc59153d40eb26e1d7c1722/app/src/main/java/net/programmierecke/radiodroid2/Utils.java#L358
    Pattern.compile(".*\\.m3u8([#?\\s].*)?$"),
    // https://github.com/segler-alex/RadioDroid/blob/a3a37282a821c21e8fc59153d40eb26e1d7c1722/app/src/main/java/net/programmierecke/radiodroid2/Utils.java#L480
    Pattern.compile("_+$"),
    // https://github.com/segler-alex/RadioDroid/blob/a3a37282a821c21e8fc59153d40eb26e1d7c1722/app/src/main/java/net/programmierecke/radiodroid2/Utils.java#L480
    Pattern.compile("^_+"),
    // https://github.com/ZSERIFAN/test/blob/63dec6146730dd022f23ca2850ce3e979c5cff5b/src/main/java/com/massivecraft/factions/zcore/util/TextUtil.java#L108
    Pattern.compile("(§([a-z0-9]))"),
    // https://github.com/ZSERIFAN/test/blob/63dec6146730dd022f23ca2850ce3e979c5cff5b/src/main/java/com/massivecraft/factions/scoreboards/BufferedObjective.java#L22
    Pattern.compile("(\u00A7[0-9a-fk-r])|(.)"),
    // https://github.com/Chanok203/ecg-java-api-exmaple/blob/6e3df17c0cd4ae73edb2dd35be4520dcbc3f0f2c/src/main/java/Main.java#L31
    Pattern.compile("\\[(.*)]"),
    // https://github.com/tsahbazoglu/fms/blob/69e19fe5d9697d09266fcc6f2084aaa02f19937d/service/src/main/java/tr/org/tspb/service/RepositoryService.java#L126
    Pattern.compile("(\\{|\\[).*(\\}|\\])", Pattern.DOTALL),
    // https://github.com/oldboy-java/java/blob/6d6f3f5c4ecd8150d7ab133ea858e7718006629f/Regexp/src/regexp/RegexTestHarnessV5.java#L22
    Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})"),
    // https://github.com/oldboy-java/java/blob/6d6f3f5c4ecd8150d7ab133ea858e7718006629f/Regexp/src/regexp/RegexTestHarnessV5.java#L42
    Pattern.compile("(\\d{4})\\1-\\d{2}-\\d{2}"),
    // https://github.com/oldboy-java/java/blob/6d6f3f5c4ecd8150d7ab133ea858e7718006629f/Regexp/src/regexp/RegexTestHarnessV5.java#L54
    Pattern.compile("\\$\\{(\\S*)}"),
    // https://github.com/lbotano/recetasdivertidas/blob/bb68ceca387d3c10e8025eb54ea9891cacf6b08b/cliente/src/main/java/io/github/recetasDivertidas/pkgRecetasDivertidas/Multimedia.java#L17
    Pattern.compile("https?://(?:www\\.)?youtu(?:\\.be/|be\\.com/(?:watch\\?v=|v/|embed/|user/(?:[\\w#]+/)+))([^&#?\\n]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/vitakulina/PW2-Parcial2/blob/608f05fb8190fd7bcd99b3bd627893427426a150/apiEcommerce/src/main/java/com/vitakulina/apiEcommerce/service/impl/UserServiceImpl.java#L262
    Pattern.compile("^.{1,128}$"),
    // https://github.com/vitakulina/PW2-Parcial2/blob/608f05fb8190fd7bcd99b3bd627893427426a150/apiEcommerce/src/main/java/com/vitakulina/apiEcommerce/service/impl/UserServiceImpl.java#L271
    Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9\\.\\-_]{8,32}$"),
    // https://github.com/sosy-lab/cpachecker/blob/84862de07b698e836af11972d571388600979c56/src/org/sosy_lab/cpachecker/cpa/smg/SMGState.java#L93
    Pattern.compile("^(r_)(\\d+)(_.*)$"),
    // https://github.com/PavelYudzin/test-automation-training/blob/208afa0c475a66c3ea46c3325bd938a75a515a41/java/src/main/java/com/company/automation/fundamentals/optional_task/OptionalTask01.java#L76
    Pattern.compile("[^0-9-\\s+]"),
    // https://github.com/PavelYudzin/test-automation-training/blob/208afa0c475a66c3ea46c3325bd938a75a515a41/java/src/main/java/com/company/automation/fundamentals/optional_task/OptionalTask01.java#L80
    Pattern.compile("\\+\\s*"),
    // https://github.com/PavelYudzin/test-automation-training/blob/208afa0c475a66c3ea46c3325bd938a75a515a41/java/src/main/java/com/company/automation/fundamentals/optional_task/OptionalTask01.java#L81
    Pattern.compile("-\\s*"),
    // https://github.com/PavelYudzin/test-automation-training/blob/208afa0c475a66c3ea46c3325bd938a75a515a41/java/src/main/java/com/company/automation/fundamentals/optional_task/OptionalTask01.java#L257
    Pattern.compile("[13579]"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/trainexam/question/questions/ImportQuestionsTrans.java#L124
    Pattern.compile("[A-Z0-9]*"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/trainexam/question/questions/ImportQuestionsTrans.java#L289
    Pattern.compile("','"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/trainexam/question/questions/ImportQuestionsTrans.java#L521
    Pattern.compile("[+-]?[\\d.]*"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/trainexam/paper/preview/ExportPapersWordTrans.java#L163
    Pattern.compile("`~&~`"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/trainexam/paper/preview/ExportPapersWordTrans.java#L196
    Pattern.compile("`:`"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L542
    Pattern.compile("['|‘|’]"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L709
    Pattern.compile("[+]?[\\d.]*"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L866
    Pattern.compile("^(\\d{4})$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L875
    Pattern.compile("^(\\d{4})年$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L886
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L898
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L909
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L922
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]([0]*\\d{1}|[12]\\d{1}|3[01])*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L985
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]([0]*\\d{1}|[12]\\d{1}|3[01])[日]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/train/request/ImportClassDataTrans.java#L1280
    Pattern.compile("codeitemid"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/sys/GetPasswordTrans.java#L48
    Pattern.compile("([a-zA-Z0-9]+[_|\\_|\\-|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/sys/GetPasswordTrans.java#L49
    Pattern.compile("[0-9]{11}"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/smartphone/SearchPersonTrans.java#L199
    Pattern.compile("###"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/transaction/performance/objectiveManage/objectiveCard/ShowObjectiveCardTrans.java#L462
    Pattern.compile("／"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-oracle/src/main/java/org/jetbrains/dekaf/jdbc/OracleExceptionRecognizer.java#L57
    Pattern.compile("ORA-(\\d{5}):"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-mysql/src/main/java/org/jetbrains/dekaf/jdbc/MysqlIntermediateProvider.java#L40
    Pattern.compile("^jdbc:(?:mysql|mariadb)://.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-mssql/src/main/java/org/jetbrains/dekaf/jdbc/MssqlIntermediateProvider.java#L35
    Pattern.compile("^jdbc:(?:jtds:)?sqlserver:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-h2db/src/main/java/org/jetbrains/dekaf/jdbc/H2dbIntermediateProvider.java#L29
    Pattern.compile("^jdbc:h2:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-exasol/src/main/java/org/jetbrains/dekaf/jdbc/ExasolIntermediateProvider.java#L26
    Pattern.compile("^jdbc:exa:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/test/java/org/jetbrains/dekaf/util/StringsTest.java#L108
    Pattern.compile("abcde"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/util/Strings.java#L188
    Pattern.compile("[ \\s\\t\\r\\n]{2,}"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/sql/SqlScriptBuilder.java#L130
    Pattern.compile("(;|\\n\\s*/)(\\s|\\n|--[^\\n]*?\\n|/\\*.*?\\*/)*?(\\n|$)|$", Pattern.DOTALL),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/sql/SqlScriptBuilder.java#L149
    Pattern.compile("^(declare|begin|(create (or replace )?(type|package|procedure|function|trigger))).*"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/sql/ScriptumResourceFromJava.java#L20
    Pattern.compile("^\\s*-{4,}\\s*(([\\p{L}\\p{javaJavaIdentifierPart}$-]+)(\\s*\\+\\s*([\\p{L}\\p{javaJavaIdentifierPart}$-]+))?)\\s*-{4,}\\s*$", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/sql/Scriptum.java#L251
    Pattern.compile("((\\;\\s*)+|(\\n\\/\\s*\\n?)+)$", Pattern.DOTALL),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java#L150
    Pattern.compile("(?=[]\\[+&|!(){}^\"~*?:\\\\])"),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java#L153
    Pattern.compile("[\\s]*[0-9]+[\\-]?[\\s]*[0-9]*[\\s]*?(([,])[\\s]*[0-9]+[\\s]*[\\-]?[\\s]*[0-9]*[\\s]*|[\\s]*)+"),
    // https://github.com/Slightly-Useful-Inc/DankestMod/blob/1a473611458c62f8f19eef7b000836748b6d9b50/build/tmp/expandedArchives/forge-1.16.4-35.1.0_mapped_snapshot_20201028-1.16.3-sources.jar_c51f1a4d6ae306192d7f9edae1dccaf5/net/minecraftforge/common/animation/TimeValues.java#L141
    Pattern.compile("[+\\-*/mMrRfF]+"),
    // https://github.com/Slightly-Useful-Inc/DankestMod/blob/1a473611458c62f8f19eef7b000836748b6d9b50/build/tmp/expandedArchives/forge-1.16.4-35.1.0_mapped_snapshot_20201028-1.16.3-sources.jar_c51f1a4d6ae306192d7f9edae1dccaf5/net/minecraftforge/common/ToolType.java#L28
    Pattern.compile("[^a-z_]"),
    // https://github.com/Slightly-Useful-Inc/DankestMod/blob/1a473611458c62f8f19eef7b000836748b6d9b50/build/tmp/expandedArchives/forge-1.16.4-35.1.0_mapped_snapshot_20201028-1.16.3-sources.jar_c51f1a4d6ae306192d7f9edae1dccaf5/net/minecraftforge/common/ForgeHooks.java#L460
    Pattern.compile("((?:[a-z0-9]{2,}:\\/\\/)?(?:(?:[0-9]{1,3}\\.){3}[0-9]{1,3}|(?:[-\\w_]{1,}\\.[a-z]{2,}?))(?::[0-9]{1,5})?.*?(?=[!\"\u00A7 \n]|$))", Pattern.CASE_INSENSITIVE),
    // https://github.com/Slightly-Useful-Inc/DankestMod/blob/1a473611458c62f8f19eef7b000836748b6d9b50/build/tmp/expandedArchives/forge-1.16.4-35.1.0_mapped_snapshot_20201028-1.16.3-sources.jar_c51f1a4d6ae306192d7f9edae1dccaf5/net/minecraftforge/client/model/ModelLoaderRegistry.java#L154
    Pattern.compile("(?:.*[\\\\/]assets[\\\\/](?<namespace>[a-z_-]+)[\\\\/]textures[\\\\/])?(?<path>[a-z_\\\\/-]+)\\.png"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/labs/webminer/src/main/java/org/bigbluebutton/webminer/web/model/SessionHitsOrganizer.java#L217
    Pattern.compile("-slide-\\d{1,3}.swf"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/bbb-voice/src/main/java/org/bigbluebutton/voiceconf/messaging/RedisMessagingService.java#L19
    Pattern.compile("(.*)-bbbID-(.*)$"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/bbb-video/src/main/java/org/bigbluebutton/app/video/VideoApplication.java#L64
    Pattern.compile("(.*)(-recorded)$"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/bbb-screenshare/app/src/main/java/org/bigbluebutton/app/screenshare/red5/Red5AppHandler.java#L19
    Pattern.compile("(.*)-(.*)-(.*)$"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/bbb-common-web/src/main/java/org/bigbluebutton/presentation/imp/ThumbnailCreatorImp.java#L41
    Pattern.compile("(.+-thumb)-([0-9]+)-([0-9]+)(.png)"),
    // https://github.com/songjoon1/test1/blob/37ed2c75016c2ed26b0a2cc6f8ec3e460a7f9dad/bbb-common-web/src/main/java/org/bigbluebutton/presentation/imp/PngCreatorImp.java#L44
    Pattern.compile("(.+-png)-([0-9]+)-([0-9]+)(.png)"),
    // https://github.com/WordPress/gutenberg/blob/5cd71f42499173e6d6f10a20a4b066f3aab77e34/packages/react-native-aztec/android/src/main/java/org/wordpress/mobile/ReactNativeAztec/IllegalSelectionIndexException.java#L43
    Pattern.compile("<([^\\\\s>/]+)>"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/simulation/Grid.java#L475
    Pattern.compile("([0-9]+)?[ob$.A-Z]"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleLoader.java#L195
    Pattern.compile("\"/wiki/Rule:([a-zA-Z0-9_()-]+)\""),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleLoader.java#L200
    Pattern.compile("<a href=\"(\\S+)\" title=\"Special:AllPages\">Next page \\(.*?\\)</a>"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L55
    Pattern.compile("#N\\s*"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L59
    Pattern.compile("#S\\s*"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L113
    Pattern.compile("(-?\\d+),\\s*(-?\\d+)"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L139
    Pattern.compile("((-?\\d+)\\s*\\*)?\\s*\\((-?\\d+,\\s*-?\\d+)\\)"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L186
    Pattern.compile("state_weights:\\s*"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/rules/ruleloader/RuleDirective.java#L204
    Pattern.compile("tiling:\\s*"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/Utils.java#L47
    Pattern.compile("rule\\s*=\\s*\\S+"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/model/Utils.java#L144
    Pattern.compile(":N"),
    // https://github.com/jedlimlx/Cellular-Automaton-Viewer/blob/b54090c93eeea84eb0edd985d851d644ad5f8c40/src/main/java/sample/controller/MainController.java#L1372
    Pattern.compile("rule = [ \\S]+"),
    // https://github.com/evan-zxx/muduo-anot/blob/a037a97a1c843cf23d6d1602c7b049f0b8b550ed/examples/multiplexer/harness/src/com/chenshuo/muduo/example/multiplexer/MultiplexerTest.java#L26
    Pattern.compile("CONN (\\d+) FROM [0-9.:]+ IS ([A-Z]+)\r\n"),
    // https://github.com/drekisvart/ohmlawscalculator/blob/9c2b3b5998aa140f28add500f74ef9c005aa3fdf/app/src/main/java/com/barriag/ohmslawcalculator3/MainActivity.java#L105
    Pattern.compile("\\d*\\.?\\d+", Pattern.CASE_INSENSITIVE),
    // https://github.com/SpongePowered/SpongeCommon/blob/5ec91dd3a3db537524f41d05831e0fae45996001/src/launch/java/org/spongepowered/common/util/PrettyPrinter.java#L789
    Pattern.compile("^(\\s+)[^\\s]"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/android/net/http/LegacyHttpDateTime.java#L10
    Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/android/net/http/LegacyHttpDateTime.java#L12
    Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/android/net/compatibility/WebAddress.java#L14
    Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/consulo/consulo/blob/b911e9a713cc7422a6ca5ea0b555f83f811d2772/modules/base/lang-impl/src/main/java/com/intellij/ide/util/PsiElementListCellRenderer.java#L51
    Pattern.compile("(\\(in |\\()?([^)]*)(\\))?"),
    // https://github.com/consulo/consulo/blob/b911e9a713cc7422a6ca5ea0b555f83f811d2772/modules/base/lang-impl-testing/src/main/java/com/intellij/testFramework/ExpectedHighlightingData.java#L194
    Pattern.compile(".*?((<lineMarker)(?: descr=\"((?:[^\"\\\\]|\\\\\")*)\")?>)(.*)", Pattern.DOTALL),
    // https://github.com/consulo/consulo/blob/b911e9a713cc7422a6ca5ea0b555f83f811d2772/modules/base/lang-impl-testing/src/main/java/com/intellij/testFramework/ExpectedHighlightingData.java#L196
    Pattern.compile("(.*?)(</lineMarker>)(.*)", Pattern.DOTALL),
    // https://github.com/consulo/consulo/blob/b911e9a713cc7422a6ca5ea0b555f83f811d2772/modules/base/lang-impl-testing/src/main/java/com/intellij/testFramework/ExpectedHighlightingData.java#L281
    Pattern.compile("\\\\\\\\\""),
    // https://github.com/fatemeh-ynr/FlightBookingSystem/blob/9307fd02ca90bb8c8843ef767be46317812adc04/src/main/java/controller/filters/DateFilter.java#L19
    Pattern.compile("^[0-9]{4}/(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])$"),
    // https://github.com/hangilc/myclinic-vertx/blob/dde183b17bd264d33cd3baf1e3465586a7c36548/server/src/main/java/dev/myclinic/vertx/server/NoDatabaseRestHandler.java#L204
    Pattern.compile("\\.([^.]+)$"),
    // https://github.com/hangilc/myclinic-vertx/blob/dde183b17bd264d33cd3baf1e3465586a7c36548/server/src/main/java/dev/myclinic/vertx/server/NoDatabaseRestHandler.java#L734
    Pattern.compile("\\d+-refer-\\d{8}.*\\.json"),
    // https://github.com/hangilc/myclinic-vertx/blob/dde183b17bd264d33cd3baf1e3465586a7c36548/server/src/main/java/dev/myclinic/vertx/server/NoDatabaseRestHandler.java#L1142
    Pattern.compile("\\.devmode$"),
    // https://github.com/jneug/schule-projekte/blob/a778bba3bad0294ec52e73b925b6214c48629a5c/Versionen/OOP/Greenfoot/02-Feuerloeschen_ML/Wald.java#L135
    Pattern.compile("^\\{([A-Za-z][A-Za-z0-9-_]*)\\}$"),
    // https://github.com/jneug/schule-projekte/blob/a778bba3bad0294ec52e73b925b6214c48629a5c/Versionen/OOP/Greenfoot/02-Feuerloeschen_ML/Wald.java#L438
    Pattern.compile("\\.*(?=(\n|$))"),
    // https://github.com/jneug/schule-projekte/blob/a778bba3bad0294ec52e73b925b6214c48629a5c/Versionen/OOP/Greenfoot/02-Feuerloeschen_ML/Wald.java#L440
    Pattern.compile("\\n+$"),
    // https://github.com/jneug/schule-projekte/blob/a778bba3bad0294ec52e73b925b6214c48629a5c/Versionen/OOP/Greenfoot/02-Feuerloeschen_ML/Wald.java#L442
    Pattern.compile("\\n(?=(\n|$))"),
    // https://github.com/jneug/schule-projekte/blob/a778bba3bad0294ec52e73b925b6214c48629a5c/Versionen/OOP/Greenfoot/02-Feuerloeschen_ML/Wald.java#L443
    Pattern.compile("^\\n"),
    // https://github.com/ZimoLoveShuang/wisedu-unified-login-api/blob/f9cdcc8afe50e39d1b0c5947cda568f50e46b412/src/main/java/wiki/zimo/wiseduunifiedloginapi/process/CasLoginProcess.java#L79
    Pattern.compile("\"\\w{16}\""),
    // https://github.com/AidanSeboa/Gait-Recognition-Project/blob/680fdc11a37ec9c9cacffa45e4d1681dc4d8734c/MainActivityT.java#L234
    Pattern.compile("(\\d+(?:\\.\\d+)?)|-(\\d+(?:\\.\\d+)?)"),
    // https://github.com/sgoenko/CodeWars/blob/4122a3f4ca92a7a3080d5936091f9362334f5009/src/MathEvaluator/MathEvaluator.java#L8
    Pattern.compile("(-?)\\(([^()]+)\\)"),
    // https://github.com/sgoenko/CodeWars/blob/4122a3f4ca92a7a3080d5936091f9362334f5009/src/MathEvaluator/MathEvaluator.java#L10
    Pattern.compile("(-?[0-9.]+)\\s*(/|\\*)\\s*(-?[0-9.]+)"),
    // https://github.com/sgoenko/CodeWars/blob/4122a3f4ca92a7a3080d5936091f9362334f5009/src/MathEvaluator/MathEvaluator.java#L11
    Pattern.compile("(-?[0-9.]+)\\s*(\\+|-)\\s*(-?[0-9.]+)"),
    // https://github.com/hiroki389/javautils/blob/2f02e64e22f0d6c5a804918219b52a25ce26e250/rplugin/java/ClassSearch.java#L37
    Pattern.compile("\\.class$|\\.java$"),
    // https://github.com/hiroki389/javautils/blob/2f02e64e22f0d6c5a804918219b52a25ce26e250/rplugin/java/ClassSearch.java#L37
    Pattern.compile("[\\\\\\/]"),
    // https://github.com/hiroki389/javautils/blob/2f02e64e22f0d6c5a804918219b52a25ce26e250/rplugin/java/ClassSearch.java#L44
    Pattern.compile("\\.class$"),
    // https://github.com/inception-project/inception/blob/6e942d27112701c0604ea741bca29d4c32976f7b/inception-curation/src/main/java/de/tudarmstadt/ukp/inception/curation/CurationEditorExtension.java#L183
    Pattern.compile("(?:(?<USER>\\w+)\\:)(?<VID>.+)"),
    // https://github.com/HubSpot/jinjava/blob/06ba5fa414284e118d90f90246d6dc1dcf96de7d/src/main/java/com/hubspot/jinjava/util/DeferredValueUtils.java#L28
    Pattern.compile("(\\w+(?:\\.\\w+)*)"),
    // https://github.com/Devskiller/jpa2ddl/blob/5e0916c244147178de9b01dce5e2c6db7daa7c77/jpa2ddl-core/src/main/java/com/devskiller/jpa2ddl/FileResolver.java#L32
    Pattern.compile("v([0-9]+)__.+\\.sql", Pattern.CASE_INSENSITIVE),
    // https://github.com/Devskiller/jpa2ddl/blob/5e0916c244147178de9b01dce5e2c6db7daa7c77/jpa2ddl-core/src/main/java/com/devskiller/jpa2ddl/FileResolver.java#L33
    Pattern.compile("v([0-9]+)__jpa2ddl.*\\.sql", Pattern.CASE_INSENSITIVE),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L204
    Pattern.compile("^([^:]+):.*$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L207
    Pattern.compile("postgresql:"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L209
    Pattern.compile("postgres:"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L211
    Pattern.compile("sqlserver:"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L213
    Pattern.compile("oracle:"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L215
    Pattern.compile("sqlite:"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L253
    Pattern.compile("^([^/@]+)@([^/]+)/([^/]+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L261
    Pattern.compile("^([^/@]+)/([^/@]+)@([^/:]+)/([^/]+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L269
    Pattern.compile("^([^/@]+)/([^/@]+)@([^/:]+):([^/:]+)/([^/]+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L405
    Pattern.compile("^([^/:@]+)@([^/:]+)([/:])([^/:]+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/util/Jdbc.java#L416
    Pattern.compile("^([^/:@]+)/([^/:@]+)@([^/:]+)([/:])([^/:]+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/html/JsAndCss.java#L72
    Pattern.compile("\\$\\{version\\}"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/html/JsAndCss.java#L120
    Pattern.compile("^(.*)\\*\\*/\\*(\\..+)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/dates/Second.java#L257
    Pattern.compile("^(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)[ T](\\d\\d):(\\d\\d):(\\d\\d)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/dates/Month.java#L230
    Pattern.compile("^(\\d\\d\\d\\d)-(\\d\\d)$"),
    // https://github.com/edwin-adalid/ji-utils/blob/c98bbea90c705c0ae22ed818001f02c34bcc6323/src/main/java/com/jirvan/dates/Month.java#L231
    Pattern.compile("^(\\d\\d) */ *(\\d\\d)$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/taglib/general/inform/InfoBrowseTag.java#L64
    Pattern.compile("[a-zA-Z]+://[^\\s]*"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireLoginValidate.java#L283
    Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireKeywordFilter.java#L304
    Pattern.compile("<@>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireKeywordFilter.java#L315
    Pattern.compile("%0d"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireKeywordFilter.java#L329
    Pattern.compile("%0a"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireKeywordFilter.java#L338
    Pattern.compile("Chr(34)"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/servlet/hirelogin/HireKeywordFilter.java#L345
    Pattern.compile("~~"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/service/core/HrInfoservice.java#L726
    Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-9]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/workplan/plantask/businessobject/ExportWorkPlanExcelBo.java#L1287
    Pattern.compile("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])", Pattern.DOTALL),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/workplan/plantask/businessobject/ExportWorkPlanExcelBo.java#L1359
    Pattern.compile(".0"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/workplan/plantask/businessobject/ExportWorkPlanExcelBo.java#L1403
    Pattern.compile("^[+-]?[\\d]+$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/workplan/plantask/businessobject/ExportWorkPlanExcelBo.java#L1411
    Pattern.compile("^[+-]?[\\d]*[.]?[\\d]*[.]?[\\d]+"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/utils/asposeword/AsposeReadWordUtil.java#L648
    Pattern.compile("(\\{\\&(.+?):(.+?)\\&\\})|(?=\\{\\*)(.+?)(?<=\\*\\})|((?=\\{\\&)(.+?)\\[(.+?)\\]\\:(.+?)(?<=\\&\\}))|((?=\\{\\#)(.+?)(?<=\\#\\}))"),
    // https://github.com/KoSChicken/QQBot/blob/023c076ca3dca85505751c6c46f6526dc08163e4/src/main/java/io/koschicken/listener/DiceListener.java#L81
    Pattern.compile("^押骰子(.*)#([0-9]+)$"),
    // https://github.com/KoSChicken/QQBot/blob/023c076ca3dca85505751c6c46f6526dc08163e4/src/main/java/io/koschicken/listener/DiceListener.java#L204
    Pattern.compile("#roll(.*)[-dD](.*)"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L57
    Pattern.compile("^[a-zA-Z]\\w{5,19}$"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L67
    Pattern.compile("^((13[0-9])|(15[^4,\\D])|(16[0-9])|(17[0-9])|(18[0-9]))\\d{8}$"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L93
    Pattern.compile("[1-9]\\d{13,16}[a-zA-Z0-9]{1}"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L155
    Pattern.compile("\\-?[1-9]\\d+"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L166
    Pattern.compile("\\-?[1-9]\\d+(\\.\\d+)?"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L189
    Pattern.compile("^[\u4E00-\u9FA5]+$"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L200
    Pattern.compile("[1-9]{4}([-./])\\d{1,2}\\1\\d{1,2}"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L211
    Pattern.compile("(https?://(w{3}\\.)?)?\\w+\\.\\w+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/\\w*)*(\\??(.+=.*)?(&.+=.*)?)?"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L222
    Pattern.compile("[1-9]\\d{5}"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L233
    Pattern.compile("[1-9](\\d{1,2})?\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L309
    Pattern.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L390
    Pattern.compile("^[a-zA-Z]*"),
    // https://github.com/wonium-ethan/HydrogenAndroid/blob/9abe52899a3a4e6f8322d9ec2eb645743e46ab93/hydrogen-android/src/main/java/com/wonium/hydrogen/utils/VerifyUtil.java#L400
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/setup/InheritanceTreeGenerator.java#L93
    Pattern.compile(".*evosuite-.*\\.jar"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/setup/InheritanceTreeGenerator.java#L296
    Pattern.compile(".*\\$\\d+.*$"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/setup/InheritanceTreeGenerator.java#L297
    Pattern.compile(".*\\.\\d+.*$"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/setup/InheritanceTreeGenerator.java#L412
    Pattern.compile(".*\\$\\d+$"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/lm/LangModel.java#L104
    Pattern.compile("(\\d+)-grams:"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/lm/LangModel.java#L113
    Pattern.compile("([-0-9\\.]+)\\s*(\\S+)\\s*([-0-9\\.]+)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/lm/LangModel.java#L140
    Pattern.compile("([-0-9\\.]+)\\s*(\\S+) (\\S+)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/lm/LangModel.java#L170
    Pattern.compile("(\\S+) (\\S+)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/assertion/PrimitiveTraceObserver.java#L37
    Pattern.compile(".*[\\w+\\.]+@[abcdef\\d]+.*", Pattern.MULTILINE),
    // https://github.com/DevMaster835/clinicaMediFam/blob/95fb082968140d89d4ba7d5c812ceb6a6369d524/src/controladores/VistaPacientesController.java#L134
    Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/DevMaster835/clinicaMediFam/blob/95fb082968140d89d4ba7d5c812ceb6a6369d524/src/controladores/VistaEmpleadosController.java#L388
    Pattern.compile("[23789]"),
    // https://github.com/ScreamingSandals/SimpleInventories/blob/5d14341195703a862a5ad079193ee691bcb7c7b1/core/src/main/java/org/screamingsandals/simpleinventories/SimpleInventories.java#L287
    Pattern.compile("%[^%]+%"),
    // https://github.com/ScreamingSandals/SimpleInventories/blob/5d14341195703a862a5ad079193ee691bcb7c7b1/core/src/main/java/org/screamingsandals/simpleinventories/SimpleInventories.java#L293
    Pattern.compile("(?<!\\.)\\.(?!\\.)"),
    // https://github.com/ScreamingSandals/SimpleInventories/blob/5d14341195703a862a5ad079193ee691bcb7c7b1/core/src/main/java/org/screamingsandals/simpleinventories/SimpleInventories.java#L296
    Pattern.compile("\\.+"),
    // https://github.com/ScreamingSandals/SimpleInventories/blob/5d14341195703a862a5ad079193ee691bcb7c7b1/core/src/main/java/org/screamingsandals/simpleinventories/SimpleInventories.java#L462
    Pattern.compile(" as "),
    // https://github.com/AdoptOpenJDK/openjdk-jdk/blob/5be4de8583ac3f95226e030c564dd47c3e7c8a7c/src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/formats/html/markup/HtmlStyle.java#L717
    Pattern.compile("\\p{Upper}"),
    // https://github.com/P1ethora/Atum_DBot/blob/9a0e0e66e9e0888efcf32df0a25d7eaa587504f8/src/main/java/net/plethora/bot/botapi/handler/handtask/HandlerTaskMessage.java#L242
    Pattern.compile("\\{([^}]*)"),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/ResourceHelper.java#L59
    Pattern.compile("(-?[0-9]+(?:\\.[0-9]+)?)(.*)"),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/telephony/java/android/telephony/TelephonyManager.java#L1016
    Pattern.compile("\\sproduct_type\\s*=\\s*(\\w+)"),
    // https://github.com/PixelExperience/packages_apps_Bluetooth/blob/944b66a781322a11e46f4358f2e20d6cf26bcb46/src/com/android/bluetooth/mapclient/obex/ObexTime.java#L45
    Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})(([+-])(\\d{2})(\\d{2}))?"),
    // https://github.com/PixelExperience/packages_apps_Bluetooth/blob/944b66a781322a11e46f4358f2e20d6cf26bcb46/src/com/android/bluetooth/avrcpcontroller/bip/BipPixel.java#L121
    Pattern.compile("^(\\d{1,5})\\*(\\d{1,5})$"),
    // https://github.com/PixelExperience/packages_apps_Bluetooth/blob/944b66a781322a11e46f4358f2e20d6cf26bcb46/src/com/android/bluetooth/avrcpcontroller/bip/BipPixel.java#L133
    Pattern.compile("^(\\d{1,5})\\*(\\d{1,5})-(\\d{1,5})\\*(\\d{1,5})$"),
    // https://github.com/PixelExperience/packages_apps_Bluetooth/blob/944b66a781322a11e46f4358f2e20d6cf26bcb46/src/com/android/bluetooth/avrcpcontroller/bip/BipPixel.java#L144
    Pattern.compile("^(\\d{1,5})\\*\\*-(\\d{1,5})\\*(\\d{1,5})$"),
    // https://github.com/PixelExperience/packages_apps_Bluetooth/blob/944b66a781322a11e46f4358f2e20d6cf26bcb46/src/com/android/bluetooth/avrcpcontroller/bip/BipDateTime.java#L58
    Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})([Z])?"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/09_FilesAndNetwork/ParserCSV/src/main/java/Main.java#L85
    Pattern.compile("\"?\\d+,\\d+\""),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/09_FilesAndNetwork/ParserCSV/src/main/java/Main.java#L96
    Pattern.compile("([/\\\\].*?)(\\s{2,})"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/08_ExceptionsDebuggingAndTesting/ConsoleCustomerList/src/CustomerStorage.java#L22
    Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/08_ExceptionsDebuggingAndTesting/ConsoleCustomerList/src/CustomerStorage.java#L28
    Pattern.compile("(?i)([A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4})"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/05_ArraysAndCollections/TreeSetExperiments/src/Main.java#L25
    Pattern.compile("(?i)(ADD\\s+)([A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4})"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/05_ArraysAndCollections/PhoneBookMap/src/Main.java#L29
    Pattern.compile("^([А-ЯЁA-Z]|[А-ЯЁA-Z][\\x27а-яёa-z]+|[А-ЯЁA-Z][\\x27а-яёa-z]+-([А-ЯЁA-Z][\\x27а-яёa-z]+|(оглы)|(кызы)|(бюль)))\\040[А-ЯЁA-Z][\\x27а-яёa-z]+(\\040[А-ЯЁA-Z][\\x27а-яёa-z]+)?$"),
    // https://github.com/gagarin-developer/Skillbox_Java/blob/7960404656718061c61dee83bef18bbca623abb5/05_ArraysAndCollections/PhoneBookMap/src/Main.java#L32
    Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$"),
    // https://github.com/springdoc/springdoc-openapi/blob/3e43d72e0f7c89b15e2d5b28cccab9b50bb02786/springdoc-openapi-common/src/main/java/org/springdoc/core/customizers/ActuatorOpenApiCustomizer.java#L28
    Pattern.compile("\\{(.*?)}"),
    // https://github.com/ekkoratha/Coursework01/blob/bb7afeb6e204d8108ec92b455364561ba4606d5f/src/test/java/com/bath/demo/ValidationTest.java#L102
    Pattern.compile("([-?\\d{1,}dr]\\s*[\\+-/\\*^%]?\\s*)+"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/jdbc/UnknownDatabaseProvider.java#L20
    Pattern.compile("^jdbc:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-core/src/main/java/org/jetbrains/dekaf/jdbc/JdbcIntermediateFacade.java#L305
    Pattern.compile("(\\d{1,2}(\\.\\d{1,3}){1,5})"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-clickhouse/src/main/java/org/jetbrains/dekaf/jdbc/CHouseIntermediateProvider.java#L26
    Pattern.compile("^jdbc:clickhouse:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-clickhouse/src/main/java/org/jetbrains/dekaf/jdbc/CHouseIntermediateFacade.java#L84
    Pattern.compile("(\\d{1,2}(\\.\\d{1,10}){1,5})"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-cassandra/src/main/java/org/jetbrains/dekaf/jdbc/CassandraIntermediateProvider.java#L24
    Pattern.compile("^jdbc:cassandra:.+$"),
    // https://github.com/zurbaevi/HackerRank-solutions/blob/6c114c42d6359544ba675af6c65ffe4297ccfb8c/src/main/java/com/hackerrank/java/thirtydaysofcode/Day28RegExPatternsAndIntroToDatabases.java#L21
    Pattern.compile("[a-z].@gmail.com"),
    // https://github.com/HauNGuyen5408/DuAn1-IChat/blob/b73840bce8e95ebf5246a42fdb252fa75c0770e4/app/src/main/java/com/anthonycode/animation_provided/Common/SplashScreen/User/Register/Fragment_Register/Fragment5_GetPassword.java#L64
    Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"),
    // https://github.com/OilMod/OilMod-API/blob/27cc6c077bbd9ccf625a64e80c6e6b605c083e42/src/main/java/org/oilmod/api/util/Util.java#L18
    Pattern.compile("^[a-z][a-z0-9_]*$"),
    // https://github.com/raise-isayan/BurpExtlib/blob/f0af7cf3b6a136ad1c263b77bd3e9715cae71be5/src/main/java/extend/util/ConvertUtil.java#L212
    Pattern.compile("([\"\\\\/])"),
    // https://github.com/raise-isayan/BurpExtlib/blob/f0af7cf3b6a136ad1c263b77bd3e9715cae71be5/src/main/java/extend/util/ConvertUtil.java#L318
    Pattern.compile("([\\.\\\\\\+\\*\\?\\[\\^\\]\\$\\(\\)\\{\\}\\=\\!\\<\\>\\|\\:\\-])"),
    // https://github.com/UntilTheEndDev/UntilTheEnd/blob/2d40e5e8553f817d3e3dfeda6c8b822f4e02df6c/src/main/java/ute/api/BlockApi.java#L69
    Pattern.compile("(^.*)?((-|)[0-9]+)-((-|)[0-9]+)-((-|)[0-9]+)$"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L378
    Pattern.compile("\\(a"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L377
    Pattern.compile("\\(8"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L376
    Pattern.compile("\\n+"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L404
    Pattern.compile("\\p{Alpha}"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L445
    Pattern.compile("\\»"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L456
    Pattern.compile("^[0-9]{4}$"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/ssrs-dms-ocr/src/main/java/org/mardep/ssrs/dms/ocr/service/OcrServiceEng2.java#L486
    Pattern.compile("\\@"),
    // https://github.com/ericleung-cnt/testingUploadVitalDoc/blob/f8fcf069e72d4956a82ee0e954d4d7c4246eb617/service/src/main/java/org/mardep/ssrs/service/LdapAuthenticationService.java#L74
    Pattern.compile("\\[username\\]"),
    // https://github.com/smathog/Hyperskill-Projects/blob/9888c301d8afeecb26aa58fb7f8b48d74193334d/Java%20Projects/Linear%20Equations%20Solver%20(Hard)/Stage%205/Complex.java#L7
    Pattern.compile("((-?\\d+(\\.\\d+)?)(\\+|-)((\\d+(\\.\\d+)?)?i))|(-?(\\d+(\\.\\d+)?)?i)|(-?\\d+(\\.\\d+)?)"),
    // https://github.com/smathog/Hyperskill-Projects/blob/9888c301d8afeecb26aa58fb7f8b48d74193334d/Java%20Projects/Linear%20Equations%20Solver%20(Hard)/Stage%205/Complex.java#L8
    Pattern.compile("(\\+|-)?(\\d+(\\.\\d+)?)?(?=i)"),
    // https://github.com/L7z404/SplashLoginCosaPOO/blob/fe577e8dcf2db16b073cf91f5de74e831fa34520/src/controlador/ControladorVistaEmpleado.java#L497
    Pattern.compile("[0-9, .]+"),
    // https://github.com/L7z404/SplashLoginCosaPOO/blob/fe577e8dcf2db16b073cf91f5de74e831fa34520/src/controlador/ControladorVistaEmpleado.java#L507
    Pattern.compile("[+-]?([0-9]*[.])?[0-9]+"),
    // https://github.com/L7z404/SplashLoginCosaPOO/blob/fe577e8dcf2db16b073cf91f5de74e831fa34520/src/controlador/ControladorVistaEmpleado.java#L519
    Pattern.compile("[a-z ñ A-Z]+"),
    // https://github.com/L7z404/SplashLoginCosaPOO/blob/fe577e8dcf2db16b073cf91f5de74e831fa34520/src/controlador/ControladorVistaEmpleado.java#L593
    Pattern.compile("^[0-9]([0-9]|-(?!-))+$"),
    // https://github.com/Pgirardin/task6/blob/5a4fadb496284ae0de2732d83a1ec1572ef4647c/task6/src/task6.java#L231
    Pattern.compile(" |\\W "),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L43
    Pattern.compile("(frick|fric)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L44
    Pattern.compile("(silly sausage)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L45
    Pattern.compile("(dang|dam)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L46
    Pattern.compile("(bri)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L47
    Pattern.compile("(heck)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L49
    Pattern.compile("(butt)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/GreenfieldMC/GreenfieldCore/blob/42def23d35bbbe4a3bdeb1c112c5d3d7ae9d0911/src/main/java/com/njdaeger/greenfieldcore/utilities/UtilitiesModule.java#L50
    Pattern.compile("(crap|poop|shoot)\\W", Pattern.CASE_INSENSITIVE),
    // https://github.com/ZGorlock/YoutubeDownloader/blob/678aa812270ecf8228fcfdae8464d0beb056c6be/src/main/java/YoutubeUtils.java#L34
    Pattern.compile("^.*/watch?.*v=(?<id>[^=?&]+).*$"),
    // https://github.com/ZGorlock/YoutubeDownloader/blob/678aa812270ecf8228fcfdae8464d0beb056c6be/src/main/java/YoutubeUtils.java#L111
    Pattern.compile("[\\p{Cntrl}&&[^\r\n\t]]"),
    // https://github.com/ZGorlock/YoutubeDownloader/blob/678aa812270ecf8228fcfdae8464d0beb056c6be/src/main/java/YoutubeUtils.java#L110
    Pattern.compile("[^\\x00-\\x7F]"),
    // https://github.com/ZGorlock/YoutubeDownloader/blob/678aa812270ecf8228fcfdae8464d0beb056c6be/src/main/java/YoutubeUtils.java#L198
    Pattern.compile(".*<a\\shref=\"latest\">Latest</a>\\s\\(v(?<version>[0-9.]+)\\)\\sdownloads:.*"),
    // https://github.com/YordanZhendov/Fundamentals-Java/blob/5f2f3b77ff4498dfe1b8243b1a3c0fc63b23ef31/Race.java#L22
    Pattern.compile("(?<name>[a-zA-Z]+)|(?<distance>\\d+)"),
    // https://github.com/malakgit/MuslimApp/blob/e5c727b9dac9ca7e3dbb9e60ceb9afa9a5de47ed/app/src/main/java/hamood/malak/muslimapp/MyUtils/MyValidations.java#L12
    Pattern.compile("((?=.[a-z])(?=.\\d)(?=.[A-Z])(?=.[@#$%!]).{8,40})"),
    // https://github.com/inkarnadin/cms-check-component/blob/4127100c1330b9d1319a17477dd4be1ef09eb463/src/test/java/web/analyzer/version/VersionAnalyzerTest.java#L18
    Pattern.compile("@since\\s(.*?)\\s"),
    // https://github.com/smunozc/DWES_2021/blob/ef66e260b8489d3d3ca61398114a3cb48bc6ecdc/SmunozcInternational/src/misc/RegexValidator.java#L8
    Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$"),
    // https://github.com/smunozc/DWES_2021/blob/ef66e260b8489d3d3ca61398114a3cb48bc6ecdc/SmunozcInternational/src/misc/RegexValidator.java#L20
    Pattern.compile("^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$"),
    // https://github.com/smunozc/DWES_2021/blob/ef66e260b8489d3d3ca61398114a3cb48bc6ecdc/SmunozcInternational/src/misc/RegexValidator.java#L34
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$"),
    // https://github.com/smunozc/DWES_2021/blob/ef66e260b8489d3d3ca61398114a3cb48bc6ecdc/SmunozcInternational/src/misc/RegexValidator.java#L41
    Pattern.compile("^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"),
    // https://github.com/smunozc/DWES_2021/blob/ef66e260b8489d3d3ca61398114a3cb48bc6ecdc/SmunozcInternational/src/misc/RegexValidator.java#L53
    Pattern.compile("^((4\\d{3})|(5[1-5]\\d{2})|(6011)|(7\\d{3}))-?\\d{4}-?\\d{4}-?\\d{4}|3[4,7]\\d{13}$"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/util/Currency.java#L393
    Pattern.compile("^[a-zA-Z]{2}$"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/browse/BrowseIndex.java#L153
    Pattern.compile("(\\w+):(\\w+):([\\w\\.\\*,]+):?(\\w*):?(\\w*):?(\\w*)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/util/LocalSchemaFilenameFilter.java#L20
    Pattern.compile("^metadata_.*.xml$"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/StatisticsLoader.java#L50
    Pattern.compile("dspace-log-monthly-([0-9][0-9][0-9][0-9]-[0-9]+)\\.dat"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/StatisticsLoader.java#L51
    Pattern.compile("dspace-log-general-([0-9]+-[0-9]+-[0-9]+)\\.dat"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/StatisticsLoader.java#L52
    Pattern.compile("report-([0-9][0-9][0-9][0-9]-[0-9]+)\\.html"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/StatisticsLoader.java#L53
    Pattern.compile("report-general-([0-9]+-[0-9]+-[0-9]+)\\.html"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/ReportGenerator.java#L164
    Pattern.compile("^(.+)=(.+)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L238
    Pattern.compile("^#"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L832
    Pattern.compile("handle="),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L835
    Pattern.compile(",item_id=.*$"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L838
    Pattern.compile("query="),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L841
    Pattern.compile("collection_id=[0-9]*,"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L844
    Pattern.compile("community_id=[0-9]*,"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L847
    Pattern.compile(",results=(.*)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L850
    Pattern.compile("( . |^. | .$)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L855
    Pattern.compile("^(\\d\\d\\d\\d-\\d\\d\\-\\d\\d) \\d\\d:\\d\\d:\\d\\d,\\d\\d\\d (\\w+)\\s+\\S+ @ ([^:]+):[^:]+:([^:]+):(.*)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L857
    Pattern.compile("^(\\d\\d\\d\\d-\\d\\d\\-\\d\\d) \\d\\d:\\d\\d:\\d\\d,\\d\\d\\d (\\w+)\\s+\\S+ @ ([^:]+):[^:]+:[^:]+:([^:]+):(.*)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/statistics/LogAnalyser.java#L853
    Pattern.compile("^(\\d\\d\\d\\d-\\d\\d\\-\\d\\d) \\d\\d:\\d\\d:\\d\\d,\\d\\d\\d (\\w+)\\s+\\S+ @ (.*)"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/opt/photoviewer/src/com/android/ex/photo/util/ImageUtils.java#L57
    Pattern.compile("^(?:.*;)?base64,.*"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/opt/calendar/src/com/android/calendarcommon2/RecurrenceSet.java#L415
    Pattern.compile(".{75}"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/ex/common/java/com/android/common/Rfc822Validator.java#L49
    Pattern.compile("[^\\s@]+@([^\\s@\\.]+\\.)+[a-zA-z][a-zA-Z][a-zA-Z]*"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/ex/chips/src/com/android/ex/chips/RecipientEditTextView.java#L215
    Pattern.compile("(\\+[0-9]+[\\- \\.]*)?(1?[ ]*\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.][0-9\\- \\.]+[0-9])"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/base/wifi/java/android/net/wifi/p2p/WifiP2pDevice.java#L121
    Pattern.compile("((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) (\\d+ )?p2p_dev_addr=((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) pri_dev_type=(\\d+-[0-9a-fA-F]+-\\d+) name='(.*)' config_methods=(0x[0-9a-fA-F]+) dev_capab=(0x[0-9a-fA-F]+) group_capab=(0x[0-9a-fA-F]+)( wfd_dev_info=0x000006([0-9a-fA-F]{12}))?"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/base/wifi/java/android/net/wifi/WifiStateMachine.java#L128
    Pattern.compile("\t+"),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/base/wifi/java/android/net/wifi/WifiMonitor.java#L171
    Pattern.compile("((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) .* \\[id=([0-9]+) "),
    // https://github.com/karri26/bbbandroid/blob/4060bd3d7dd4a84581541c4f03a1588f40fc3908/frameworks/base/wifi/java/android/net/wifi/WifiMonitor.java#L81
    Pattern.compile("WPS-FAIL msg=\\d+(?: config_error=(\\d+))?(?: reason=(\\d+))?"),
    // https://github.com/javadozent/java2-2020/blob/6395223d4da3b86925b48a86c25a97bf21dbb05a/A04_URLService_0.5/src/service/ExtractURLService.java#L16
    Pattern.compile("\\b(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", Pattern.CASE_INSENSITIVE),
    // https://github.com/javadozent/java2-2020/blob/6395223d4da3b86925b48a86c25a97bf21dbb05a/A04_URLService_0.5/src/application/Test.java#L49
    Pattern.compile("\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", Pattern.CASE_INSENSITIVE),
    // https://github.com/ledangtuanbk/template-spring/blob/220c769d6ef51dc272ffd134ee6b22f7e52488b0/src/main/java/com/test/service/utils/StrUtils.java#L117
    Pattern.compile("đ"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-sword/src/main/java/org/purl/sword/client/ClientOptions.java#L130
    Pattern.compile("(.*?)(\\[(.*?)\\]) {0,1}(:(.*)) {0,1}@(http://.*)"),
    // https://github.com/jeffrpowell/adventofcode/blob/479fd6601acf623eef5a59d0e8979743c15218ea/src/main/java/com/jeffrpowell/adventofcode/inputparser/rule/Rule.java#L12
    Pattern.compile("(\\d(?:\\d*\\.?\\d*))\\s*,(\\d(?:\\d*\\.?\\d*))\\s*"),
    // https://github.com/jeffrpowell/adventofcode/blob/479fd6601acf623eef5a59d0e8979743c15218ea/src/main/java/com/jeffrpowell/adventofcode/aoc2015/Day6.java#L22
    Pattern.compile("(turn on|turn off|toggle) (\\d+,\\d+) through (\\d+,\\d+)"),
    // https://github.com/aytchell/validator/blob/f8037a2bda274cf389d9aee16600e053185ddb48/src/test/java/com/github/aytchell/validator/StringValidatorTest.java#L27
    Pattern.compile("private.*String.*=.*"),
    // https://github.com/aytchell/validator/blob/f8037a2bda274cf389d9aee16600e053185ddb48/src/test/java/com/github/aytchell/validator/StringValidatorTest.java#L164
    Pattern.compile(".*public.*"),
    // https://github.com/rdelos1001/Cine/blob/8eca35ca0c4c90f775a0b1e13f8646b1803a857f/src/main/java/tools/Validaciones.java#L23
    Pattern.compile("^[a-zA-Z]*$"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-install/src/main/java/org/compiere/install/ConfigOracle.java#L173
    Pattern.compile("$", Pattern.MULTILINE),
    // https://github.com/Deekshakhajuria/Spring-2020-AED-Team/blob/aacf1c280fb2ea902365292d341c681658e8b563/Falcon_Travel_Agency/Falcon_Travel_Agency/src/Interface/ManageAirliner/CustomerSignupJPanel.java#L270
    Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$"),
    // https://github.com/Deekshakhajuria/Spring-2020-AED-Team/blob/aacf1c280fb2ea902365292d341c681658e8b563/Falcon_Travel_Agency/Falcon_Travel_Agency/src/Interface/ManageAirliner/CustomerSignupJPanel.java#L332
    Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$"),
    // https://github.com/Deekshakhajuria/Spring-2020-AED-Team/blob/aacf1c280fb2ea902365292d341c681658e8b563/Child%20Care%20System/Child_Care_System/db4odemo/src/Business/Validation/PhoneNoValidation.java#L26
    Pattern.compile("^[1-9]{1}+[0-9]{9}$"),
    // https://github.com/unufolio/spring-security-demos/blob/e1776b16a2535e1683f3cd4a86e359ee9b617282/07-bearer-token-authentication/src/main/java/com/unufolio/spring/security/demos/DefaultBearerTokenResolver.java#L14
    Pattern.compile("^Bearer (?<token>[a-zA-Z0-9-._~+/]+=*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/shoy160/net-proxy/blob/5ca28e7ed732f27f01948fd62fe87c3c6d5c6077/proxy-server/src/main/java/com/yunzhicloud/proxy/filter/TransferManager.java#L23
    Pattern.compile("((Ethernet[0-9/]+)|(Eth-Trunk[0-9/]+)|(Route-Aggregation[0-9/]+))\\s+current\\s+state\\s+:\\s+UP"),
    // https://github.com/RohieOS/packages_services_Telephony/blob/c850f57f0a222d48be72f9066ae5944663b7336f/src/com/android/services/telephony/TelephonyConnectionService.java#L96
    Pattern.compile("\\*228[0-9]{0,2}"),
    // https://github.com/xiaocanming/YQC/blob/2490f8ec65eacc839b85594760fae5e324a6ad0a/app/src/main/java/com/example/yqc/util/StringTool.java#L12
    Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b"),
    // https://github.com/xiaocanming/YQC/blob/2490f8ec65eacc839b85594760fae5e324a6ad0a/app/src/main/java/com/example/yqc/util/StringTool.java#L26
    Pattern.compile("[0-9]*.?[0-9]?"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/failmon/src/java/org/apache/hadoop/contrib/failmon/SMARTParser.java#L155
    Pattern.compile("^\\s{0,2}(\\d{1,3}\\s+.*)$", Pattern.MULTILINE),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/failmon/src/java/org/apache/hadoop/contrib/failmon/HadoopLogParser.java#L118
    Pattern.compile("\\s+(\\w+/.+)\\s+"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/failmon/src/java/org/apache/hadoop/contrib/failmon/Environment.java#L251
    Pattern.compile("[(failed)(device not supported)]"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/test/org/apache/hadoop/corona/TestMiniCoronaPurge.java#L73
    Pattern.compile("^(.+)\\/job_(\\d+)\\.(\\d+)_(\\d+)$"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/mapred/ProxyJobTracker.java#L93
    Pattern.compile("^(.+)\\/(\\d+)\\.(\\d+)$"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/mapred/ProxyJobTracker.java#L198
    Pattern.compile("[^a-zA-Z_]"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/corona/Utilities.java#L41
    Pattern.compile("(.+):(\\d+)"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/corona/Utilities.java#L44
    Pattern.compile("^([0-9]+)\\.([0-9]+)\\.([0-9]+)\\.([0-9]+)$"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/corona/PoolInfo.java#L34
    Pattern.compile(".*[^0-9a-z\\-\\_].*"),
    // https://github.com/YuchongHu/ncscale/blob/97dcc8f322c395fde2ef591994a5c142cb51295e/hadoop-20-aws/src/contrib/corona/src/java/org/apache/hadoop/corona/PoolInfo.java#L117
    Pattern.compile("[.]"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/server/src/test/java/org/neo4j/server/rest/dbms/AuthorizationFilterTest.java#L110
    Pattern.compile("/browser.*"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/server/src/main/java/org/neo4j/server/rest/dbms/AuthorizationEnabledFilter.java#L60
    Pattern.compile("/user/.*"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/server/src/main/java/org/neo4j/server/rest/batch/BatchOperations.java#L49
    Pattern.compile("\\{(\\d{1,10})}"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/server/src/main/java/org/neo4j/server/logging/JettyLogBridge.java#L36
    Pattern.compile("(\\w)\\w+\\."),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/security/src/main/java/org/neo4j/server/security/auth/AbstractUserRepository.java#L49
    Pattern.compile("^[\\x21-\\x2B\\x2D-\\x39\\x3B-\\x7E]+$"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/push-to-cloud/src/main/java/org/neo4j/pushtocloud/PushToCloudCommand.java#L191
    Pattern.compile("(?:bolt(?:\\+routing)?|neo4j(?:\\+s|\\+ssc)?)://([^-]+)(-(.+))?.databases.neo4j.io$"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/logging/src/main/java/org/neo4j/logging/internal/LogMessageUtil.java#L28
    Pattern.compile("\\{}"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L203
    Pattern.compile("\0"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L225
    Pattern.compile("([\\p{Alnum}$_.]+)=(.*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L268
    Pattern.compile("([^/]+)=(,*[^,].*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L489
    Pattern.compile("[^,].*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L647
    Pattern.compile("([^/]+)/([^=]+)=(,*[^,].*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L668
    Pattern.compile("([^=]+)=(,*[^,].*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L691
    Pattern.compile(",*[^,].*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L1113
    Pattern.compile(",+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Option.java#L1302
    Pattern.compile(".*[=:]$"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Main.java#L378
    Pattern.compile(".*\\s+.*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Main.java#L395
    Pattern.compile("(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/main/Arguments.java#L818
    Pattern.compile("\\x00"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/comp/Modules.java#L1613
    Pattern.compile("([^/]+)/([^=]+)=(.*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/comp/Modules.java#L1614
    Pattern.compile("\0+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/comp/Modules.java#L1649
    Pattern.compile("[ ,]+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/javac/comp/Modules.java#L1693
    Pattern.compile("([^=]+)=(.*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/doclint/Checker.java#L757
    Pattern.compile("[A-Za-z][A-Za-z0-9-_:.]*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/doclint/Checker.java#L759
    Pattern.compile("-?[0-9]+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.compiler/com/sun/tools/doclint/Checker.java#L762
    Pattern.compile("(?i)(\\{@docRoot *\\}/?)?(.*)"),
    // https://github.com/voidf/HimeHikari_typingGame/blob/40e828b6b93f4a5b74deff895af853ee36d6214e/src/Word.java#L22
    Pattern.compile("\\s*(\\S*)\\s*?(\\S.*?)$"),
    // https://github.com/vayci/song-rank-proxy-pool/blob/836da5d96c9f014b9b4e90e9a83300933c0fd033/src/main/java/me/olook/proxypool/core/provider/ProxyListOrgProvider.java#L67
    Pattern.compile("Proxy\\('(.*?)'\\)"),
    // https://github.com/qtam-choi/smartBill/blob/1bc57cd520d320d90ab0627a5374efed3296ac16/src/test/convDbCol.java#L52
    Pattern.compile("^[\\S]*\\."),
    // https://github.com/Roman141099/WebRinch/blob/8e82d22c1dc56f11cb96645ad7a433f97ba5be06/demoJboss/src/main/java/beans/UserBean.java#L21
    Pattern.compile("[a-zA-Z][\\w.]+?@inbox\\.ru"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L186
    Pattern.compile("\\d{8}\\,\\d{6}\\,\\d{5}"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L191
    Pattern.compile("\\,+\\u6bcf\\u65e5\\u5c0f\\u8a08"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L197
    Pattern.compile("\\,+\\u5408\\u8a08"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L203
    Pattern.compile("\\u6388\\u6b0a\\u55ae\\u865f"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L269
    Pattern.compile("\\d{4}\\-\\d{2}\\-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{16}"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/AllInOne.java#L279
    Pattern.compile("\"\\d{4}\\/\\d{2}\\/\\d{2} \\d{2}:\\d{2}:\\d{2}\""),
    // https://github.com/kunal-26/Sehat-Complete-Healthcare-Solution-Optum-/blob/8d99506fcb3ead77fc79e7edd970fc3c9aaf79ed/Sehat%20App/app/src/main/java/com/MJ/Hack/Sehat/Login.java#L50
    Pattern.compile("^(?=.*[a-zA-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"),
    // https://github.com/sunchao199606/JavaDemo/blob/0dc954016dff8768deb1ab3c54079b7015d3ad54/src/test/java/cn/com/sun/javaApi/RegexTest.java#L16
    Pattern.compile("[<>/\\|\"*?]"),
    // https://github.com/870235784/common/blob/d463006cad1daf9fc777d31bc1eefffc8b3f5a66/common-utils/src/main/java/com/tca/common/utils/ValidateUtils.java#L17
    Pattern.compile("[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|[1-9]\\d*|0"),
    // https://github.com/870235784/common/blob/d463006cad1daf9fc777d31bc1eefffc8b3f5a66/common-utils/src/main/java/com/tca/common/utils/ValidateUtils.java#L19
    Pattern.compile("^[0-9]*[1-9][0-9]*$"),
    // https://github.com/Hulkong/Trend-On/blob/146878d3018eeb4613337a4c3cd4ed7d42789afc/src/main/java/com/openmate/onmap/api/ApiAuthCheck.java#L51
    Pattern.compile("^([^:\\/\\s]+)(:([^\\/]*))"),
    // https://github.com/Hulkong/Trend-On/blob/146878d3018eeb4613337a4c3cd4ed7d42789afc/src/main/java/com/openmate/onmap/api/ApiAuthCheck.java#L93
    Pattern.compile("^(https?):\\/\\/([^:\\/\\s]+)(:([^\\/]*))"),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L23
    Pattern.compile(" 28 00 AE 03 00 01 18 00 28 00 1E 40 00 1E "),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L33
    Pattern.compile(" 10 "),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L70
    Pattern.compile(" 24 70 72 65 66 61 62 73 "),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L85
    Pattern.compile(" 18 \\w\\w "),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L145
    Pattern.compile("24 70 72 65 66 61 62 73 "),
    // https://github.com/ngaionice/trove-io/blob/810defec14ff8d714e3abedb23c686f29fdabb6f/src/main/java/Splitter.java#L189
    Pattern.compile("72 65 63 69 70 65 "),
    // https://github.com/jedlab/framework/blob/b96e461e5e1f2ee8e35e3e9887710040465de5e6/src/main/java/com/jedlab/framework/web/RequestProcessor.java#L171
    Pattern.compile("\\[(.)\\]"),
    // https://github.com/151751www/LiaoningQHPG/blob/203474c0094c29206623218fecacaf8e3f325623/src/main/java/zhwy/controller/ChanPinController.java#L234
    Pattern.compile("\\$\\{(.+?)\\}", Pattern.CASE_INSENSITIVE),
    // https://github.com/151751www/LiaoningQHPG/blob/203474c0094c29206623218fecacaf8e3f325623/src/main/java/zhwy/controller/ChanPinController.java#L289
    Pattern.compile("\\$\\{"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L273
    Pattern.compile("'[^']+'", Pattern.DOTALL),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L291
    Pattern.compile("\\s/\\s"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L421
    Pattern.compile("\\/\\*ORACLE>.*<ORACLE\\*\\/", Pattern.DOTALL),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L425
    Pattern.compile("\\/\\*POSTGRESQL>"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L428
    Pattern.compile("<POSTGRESQL\\*\\/"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L432
    Pattern.compile("\\/\\*.*\\*\\/", Pattern.DOTALL),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L485
    Pattern.compile("(\\([^\\)]*\\))|(\\bRETURN \\w+ (AS)|(IS))|(;)|(\\bBEGIN\\b)|(\\bTHEN\\b)|(\\bELSE\\b)|(\\bELSIF\\b)", Pattern.CASE_INSENSITIVE),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L749
    Pattern.compile("\\bINSERTING\\b"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L750
    Pattern.compile("\\bUPDATING\\b"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L751
    Pattern.compile("\\bDELETING\\b"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L752
    Pattern.compile(":new."),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L753
    Pattern.compile(":old."),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L786
    Pattern.compile("\\bRETURN;", Pattern.CASE_INSENSITIVE),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L796
    Pattern.compile("(\\(.*\\))|(;)|(\\bBEGIN\\b)|(\\bTHEN\\b)|(\\bELSE\\b)|(\\bELSIF\\b)", Pattern.CASE_INSENSITIVE),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L835
    Pattern.compile("\\sOF.*ON\\s"),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L904
    Pattern.compile("\\w+\\.(nextval)|(curval)", Pattern.CASE_INSENSITIVE),
    // https://github.com/compiere-erp/compiere/blob/d8c9f756c89b65b67d3442609753de5437e0b124/compiere-base/src/main/java/org/compiere/db/convert/Convert.java#L928
    Pattern.compile("RAISE_APPLICATION_ERROR\\s*\\(.+'\\)", Pattern.CASE_INSENSITIVE),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/Utility.java#L24
    Pattern.compile("(\\*\\[(.*?)]\\*)"),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/Utility.java#L215
    Pattern.compile("\\*\\{"),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/Utility.java#L216
    Pattern.compile("}\\*"),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/Utility.java#L331
    Pattern.compile("\\s."),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/ListingPane.java#L29
    Pattern.compile("\\s?([0-9a-fA-F]+):(?:\\s(?:[0-9a-fA-F]{2})){2,4}\\s+([a-z]+)([^;]+)"),
    // https://github.com/wholder/MegaTinyIDE/blob/7eaa2f59d4f38ac0e0802ad666628136aa5dc257/src/ListingPane.java#L30
    Pattern.compile("([0-9a-fA-F]{8}).{9}(.+)\t([0-9a-fA-F]{8})\\s+(.*)"),
    // https://github.com/psac-serve/ban-manager/blob/fb3cfc1e01ef51d75e0ec2b2800f5ad8a3ea1775/src/main/java/ml/peya/plugins/commands/CommandTempBan.java#L61
    Pattern.compile("^[0-9]+((year|y)|(month|mo)|(day|d)|(hour|h)|(minute|min|m)|(second|sec|s))(s)?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/crdroidandroid/android_vendor_qcom_opensource_bluetooth_ext/blob/b74be7f750915af2bad923c965b968762177aeb3/packages_apps_bluetooth_ext/src/map/src/BluetoothMapbMessageExtEmail.java#L139
    Pattern.compile("\r\n([/]*)/END\\:MSG"),
    // https://github.com/crdroidandroid/android_vendor_qcom_opensource_bluetooth_ext/blob/b74be7f750915af2bad923c965b968762177aeb3/packages_apps_bluetooth_ext/src/map/src/BluetoothMapbMessageExtEmail.java#L289
    Pattern.compile("END:MSG"),
    // https://github.com/crdroidandroid/android_vendor_qcom_opensource_bluetooth_ext/blob/b74be7f750915af2bad923c965b968762177aeb3/packages_apps_bluetooth_ext/src/map/src/BluetoothMapbMessageExtEmail.java#L309
    Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+"),
    // https://github.com/Ian2244/JavaProject/blob/a29d58e241627d01da987d7134bbb609902fba45/zhnagyin/src/main/java/Year2020/Day0330/Test.java#L14
    Pattern.compile("((\\d|1\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|1\\d|1\\d\\d|2[0-4]\\d|25[0-5])"),
    // https://github.com/Ian2244/JavaProject/blob/a29d58e241627d01da987d7134bbb609902fba45/zhnagyin/src/main/java/Year2020/Day0225/Main.java#L14
    Pattern.compile("b*"),
    // https://github.com/zurbaevi/HackerRank-solutions/blob/6ce0dbc765130b3927d64b7cca00df27355e8cfc/src/main/java/com/hackerrank/java/strings/JavaRegex2DuplicateWords.java#L13
    Pattern.compile("\\b(\\w+)(\\b\\W+\\b\\1\\b)*", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L93
    Pattern.compile("(?s).*?(\\(\\s*;{0,1}.*\\))(?s).*?"),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L102
    Pattern.compile("(?s).*?SZ\\[([\\d:]+)\\](?s).*"),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L108
    Pattern.compile("([\\d]+):([\\d]+)"),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L160
    Pattern.compile("(?s).*\\)\\s*\\)"),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L300
    Pattern.compile("[^0-9.]"),
    // https://github.com/hope366/Lizzie-improvements/blob/cc0e005f516c2e73d13ef16c4b85928d3720d1cb/src/main/java/featurecat/lizzie/rules/SGFParser.java#L995
    Pattern.compile("(?s).*?SZ\\[(\\d+)\\](?s).*"),
    // https://github.com/zhengxingquan/design-vue-bg-admin/blob/37f866492ab2abb57d612ca3730e697dd1aae97b/bg-framework/bg-base-spring-boot-starter/src/main/java/com/quam/common/util/StringUtil.java#L397
    Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"),
    // https://github.com/zhengxingquan/design-vue-bg-admin/blob/37f866492ab2abb57d612ca3730e697dd1aae97b/bg-framework/bg-base-spring-boot-starter/src/main/java/com/quam/common/util/StringUtil.java#L562
    Pattern.compile("^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$"),
    // https://github.com/zhengxingquan/design-vue-bg-admin/blob/37f866492ab2abb57d612ca3730e697dd1aae97b/bg-framework/bg-base-spring-boot-starter/src/main/java/com/quam/common/util/StringUtil.java#L586
    Pattern.compile("(?<=\\w{3})\\w(?=\\w{4})"),
    // https://github.com/jhl8041/huboard/blob/dc86fd758fd32aa11791fe6718a7e6fe71d983d3/src/main/java/com/humuson/huboard/controller/JoinController.java#L29
    Pattern.compile("^[a-z0-9]{6,}$"),
    // https://github.com/jhl8041/huboard/blob/dc86fd758fd32aa11791fe6718a7e6fe71d983d3/src/main/java/com/humuson/huboard/controller/JoinController.java#L59
    Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+]).{8,}$"),
    // https://github.com/jhl8041/huboard/blob/dc86fd758fd32aa11791fe6718a7e6fe71d983d3/src/main/java/com/humuson/huboard/controller/JoinController.java#L155
    Pattern.compile("^(?=.*[a-z])(?=.*[@])((?=.*[.]+[c]+[o]+[m])|(?=.*[.]+[n]+[e]+[t])|(?=.*[.]+[c]+[o]+[.]+[k]+[r])|(?=.*[.]+[g]+[o]+[v])).{1,}$"),
    // https://github.com/adinathraut20/AdvanceJava_Module/blob/b9209144bd10b8e40c3194e3db5c57d0831935ff/AdvanceJavaEclipseWorkSpace/AdvanceJavaProject/MovieBookingSystem/src/com/bookmovie/valid/UserValidator.java#L31
    Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$"),
    // https://github.com/silknow/converter/blob/8e608234111885e0b4c7e39aa6eff1754ce31851/src/main/java/org/silknow/converter/converters/UNIPAConverter.java#L14
    Pattern.compile("cm (\\d+(?:\\.\\d+)?) x (\\d+(?:\\.\\d+)?)"),
    // https://github.com/silknow/converter/blob/8e608234111885e0b4c7e39aa6eff1754ce31851/src/main/java/org/silknow/converter/converters/UNIPAConverter.java#L17
    Pattern.compile("(\\d+(?:\\.\\d+)?)x(\\d+(?:\\.\\d+)?)"),
    // https://github.com/silknow/converter/blob/8e608234111885e0b4c7e39aa6eff1754ce31851/src/main/java/org/silknow/converter/converters/GarinConverter.java#L20
    Pattern.compile("(ANV|REV|DET)"),
    // https://github.com/silknow/converter/blob/8e608234111885e0b4c7e39aa6eff1754ce31851/src/main/java/org/silknow/converter/converters/GarinConverter.java#L151
    Pattern.compile("(?i)\\.jpg$"),
    // https://github.com/UNIVALI-LITE/Portugol-Studio/blob/baffee2e55005575a43218bfad6cd40cc6c0d594/core/src/main/java/br/univali/portugol/nucleo/analise/sintatica/AnalisadorSintatico.java#L95
    Pattern.compile("[^programa]*programa[^{]*\\{"),
    // https://github.com/MaxPoser/Testat-3-321387-321722/blob/ba52761ac384672ef246e4b6e6b20d681a0d750e/Testat-3-321387-321722/src/harvestManagement/HelperManager.java#L192
    Pattern.compile("[^a-zA-Z0-9]*"),
    // https://github.com/MaxPoser/Testat-3-321387-321722/blob/ba52761ac384672ef246e4b6e6b20d681a0d750e/Testat-3-321387-321722/src/harvestManagement/HelperManager.java#L233
    Pattern.compile("[mM]ale|[fF]emale|[dD]iverse"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/testlibrary/whitebox/sun/hotspot/cpuinfo/CPUInfo.java#L62
    Pattern.compile("(, )| "),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/joomla/JoomlaCheckProcessor.java#L49
    Pattern.compile("joomla-script-options"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/drupal/DrupalVersionProcessor.java#L27
    Pattern.compile("<meta name=\"[gG]enerator\" content=\"Drupal\\s(.+?)\\s"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/drupal/DrupalVersionProcessor.java#L29
    Pattern.compile("drupal\\s(.*)\\s"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/drupal/DrupalCheckProcessor.java#L34
    Pattern.compile("data-drupal-link-system-path"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/drupal/DrupalCheckProcessor.java#L35
    Pattern.compile("Drupal\\.settings"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/drupal/DrupalCheckProcessor.java#L41
    Pattern.compile("drupal"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L36
    Pattern.compile("dle_root"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L37
    Pattern.compile("dle_admin"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L38
    Pattern.compile("engine/classes"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L39
    Pattern.compile("engine/templates/Default"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L55
    Pattern.compile("DataLife Engine"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/bitrix/BitrixCheckProcessor.java#L31
    Pattern.compile("bitrix/cache"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/bitrix/BitrixCheckProcessor.java#L32
    Pattern.compile("bitrix/js"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/bitrix/BitrixCheckProcessor.java#L33
    Pattern.compile("bitrix/tools"),
    // https://github.com/inkarnadin/cms-check-component/blob/2cc30e4ed9a18fa93256131bb74b089608938637/src/main/java/web/cms/bitrix/BitrixCheckProcessor.java#L34
    Pattern.compile("bitrix/components"),
    // https://github.com/CVBot-Union/cvbot-android-app/blob/997c350fe0540004454c3896ae9750270a82e370/app/src/main/java/com/cvbotunion/cvtwipush/Service/WebService.java#L34
    Pattern.compile("-\\s+(.+?)\\s+-", Pattern.DOTALL),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/base/UpdateLangDriver.java#L15
    Pattern.compile("\\(#\\{(\\w+)\\}\\)"),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/base/UpdateLangDriver.java#L26
    Pattern.compile("_column"),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/base/UpdateLangDriver.java#L26
    Pattern.compile("_field"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/interfaces/general/PendingTask.java#L683
    Pattern.compile("&param="),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L807
    Pattern.compile("<br>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L808
    Pattern.compile("<p>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L809
    Pattern.compile("</p>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L810
    Pattern.compile("<P>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L811
    Pattern.compile("</P>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L812
    Pattern.compile("&acute;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L813
    Pattern.compile("&amp;nbsp;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L814
    Pattern.compile("%25"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L815
    Pattern.compile("%3D"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L816
    Pattern.compile("&llt;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L817
    Pattern.compile("&ggt;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L818
    Pattern.compile("&qquot;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1117
    Pattern.compile("<BR>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1118
    Pattern.compile("<br/>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1119
    Pattern.compile("<BR/>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1120
    Pattern.compile("<br />"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1121
    Pattern.compile("<BR />"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1122
    Pattern.compile("</br>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1123
    Pattern.compile("</BR>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1124
    Pattern.compile("</ br>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/trainexam/question/questiones/QuestionesBo.java#L1125
    Pattern.compile("</ BR>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/attendance/TrainAtteBo.java#L94
    Pattern.compile("%26amp;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/attendance/TrainAtteBo.java#L94
    Pattern.compile("%26quot;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/attendance/TrainAtteBo.java#L94
    Pattern.compile("%26gt;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/train/attendance/TrainAtteBo.java#L94
    Pattern.compile("%26lt;"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/sys/setup/findfile/parse/ParseWebxml.java#L39
    Pattern.compile("\\s*<session-timeout>\\d*</session-timeout>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/sys/org/DecExpresion.java#L267
    Pattern.compile("\\!"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/sys/SaveDbSecurity.java#L31
    Pattern.compile("[`~!@%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/sys/AsyncEmailBo.java#L295
    Pattern.compile("<[ ]*TABLE"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/user_defined_reoprt/UserdefinedReport.java#L660
    Pattern.compile("[0]*[.]?[0]*"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/user_defined_reoprt/UserdefinedReport.java#L1228
    Pattern.compile("<\\s*[B|b][O|o][D|d][Y|y].*?>", Pattern.DOTALL),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/user_defined_reoprt/UserdefineSqlFile.java#L501
    Pattern.compile("/^[0-9]*$/"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.phases/src/org/graalvm/compiler/phases/BasePhase.java#L86
    Pattern.compile("[A-Z][A-Za-z0-9]+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/meta/HotSpotObjdumpDisassemblerProvider.java#L89
    Pattern.compile(" *(([0-9a-fA-F]+):\t.*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/meta/HotSpotObjdumpDisassemblerProvider.java#L166
    Pattern.compile("[A-Za-z0-9@%_\\-\\+=:,\\./]+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/JVMCIVersionCheck.java#L52
    Pattern.compile(".*-jvmci-(\\d+)\\.(\\d+)-b(\\d+).*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/JVMCIVersionCheck.java#L63
    Pattern.compile(".*-jvmci-(\\d+)(?:\\.|-b)(\\d+).*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot.test/src/org/graalvm/compiler/hotspot/test/HsErrLogTest.java#L83
    Pattern.compile("# +(.*hs_err_pid[\\d]+\\.log)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot.test/src/org/graalvm/compiler/hotspot/test/CompileTheWorld.java#L151
    Pattern.compile("\\s+|#"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot.test/src/org/graalvm/compiler/hotspot/test/CompileTheWorld.java#L556
    Pattern.compile("META-INF/versions/[1-9][0-9]*/(.+)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.internal.vm.compiler/org.graalvm.compiler.hotspot.lir.test/src/org/graalvm/compiler/hotspot/lir/test/BenchmarkCounterOverflowTest.java#L154
    Pattern.compile("^# (.*hs_err_pid.*log)$"),
    // https://github.com/netanel208/Delivery-Service-Management/blob/a5fd9ee8a50ad031b8fcc06ca15186711e637b54/src/com/scanovate/deliveryService/main/Main.java#L32
    Pattern.compile("(?:[^a-zA-Z]*[a-zA-Z]){3}.*"),
    // https://github.com/netanel208/Delivery-Service-Management/blob/a5fd9ee8a50ad031b8fcc06ca15186711e637b54/src/com/scanovate/deliveryService/main/Main.java#L44
    Pattern.compile("(\\w+[^\\w]+\\w+)"),
    // https://github.com/hojelse/idbs/blob/77c5e6000cb050d6bcc0d89a1ee793d4ee890795/hw03/fdparser.java#L14
    Pattern.compile("Projects: ([a-zA-Z]+ --> [a-zA-Z]+) \\| MAY HOLD"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/UserValidator.java#L10
    Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])[\\w]{6,16}$"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/UserValidator.java#L13
    Pattern.compile("^(?=.*?\\d)(?=.*?[A-Z])(?=.*?[a-z])[\\w]{6,16}$"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/UserValidator.java#L16
    Pattern.compile("^[\\w-\\.\\+!#$%&’*+\\/=?`{|}~^]+@[\\w-]+\\.[\\w]{2,6}$"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/TourValidator.java#L10
    Pattern.compile("\\d{1,7}"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/TourValidator.java#L11
    Pattern.compile("\\d{1,3}"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/TourValidator.java#L12
    Pattern.compile("\\d{1,2}"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/PaycardValidator.java#L6
    Pattern.compile("[\\d]{7}"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/PassportValidator.java#L6
    Pattern.compile("[A-Za-z]{1,30}"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/PassportValidator.java#L7
    Pattern.compile("^[A-Za-z]{2}[\\d]{7}$"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/GeneralValidator.java#L8
    Pattern.compile("\\b[\\d]{4}-[\\d]{2}-[\\d]{2}\\b"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/GeneralValidator.java#L9
    Pattern.compile("\\b[A-Za-z\\d]+\\.[A-Za-z]{2,5}\\b"),
    // https://github.com/AntonSedkov/Travel_Agency/blob/7ad71c0fe1e03aa4b33daa26f1d5004761652a04/src/by/epam/tagency/validator/GeneralValidator.java#L10
    Pattern.compile(".{3,64}"),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/DateUtils.java#L251
    Pattern.compile("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)"),
    // https://github.com/RakeshShrestha/Kotlin-Java/blob/5e1355365cb3622f6d1ab832a53fb55f57bae169/javaapps/src/com/catgen/loader/DataLoader.java#L336
    Pattern.compile("\\([^)]*\\)"),
    // https://github.com/RakeshShrestha/Kotlin-Java/blob/5e1355365cb3622f6d1ab832a53fb55f57bae169/javaapps/src/com/catgen/loader/DataLoader.java#L337
    Pattern.compile("\\s\\*.*$"),
    // https://github.com/RakeshShrestha/Kotlin-Java/blob/5e1355365cb3622f6d1ab832a53fb55f57bae169/javaapps/src/com/catgen/loader/DataLoader.java#L552
    Pattern.compile("([A-Z]+)([0-9]+)"),
    // https://github.com/xal3xhx/PeripheralsPlusOne-fixed/blob/a64386c71df60525948a34de8782fd767bb79244/src/main/java/com/austinv11/peripheralsplusplus/tiles/TileEntityPrivacyGuard.java#L252
    Pattern.compile(".*<(.*@.*\\..*)>"),
    // https://github.com/xal3xhx/PeripheralsPlusOne-fixed/blob/a64386c71df60525948a34de8782fd767bb79244/src/main/java/com/austinv11/peripheralsplusplus/lua/api/DynApi.java#L84
    Pattern.compile("^(\\d+)?(?:\\.(\\d+))?(?:\\.(\\d+))?(?:-(alpha|beta|release))?(?:-(\\d+))?$"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/verification/VerifyAioCheckOut.java#L109
    Pattern.compile("[A-Za-z]{2}[0-9]{14}"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/verification/VerifyAioCheckOut.java#L114
    Pattern.compile("^\\/[A-Za-z0-9\\s+-]{7}$"),
    // https://github.com/frankkuo214/iiiNews/blob/0ccf204c99680753f38f1edc232e03e44eeba9b2/src/main/java/ecpay/payment/integration/verification/VerifyAioCheckOut.java#L142
    Pattern.compile("(\\|\\||^\\||\\|$)"),
    // https://github.com/YJ2CS/core-java-learning-noMaven/blob/d4dca22a3ce9ddd8c06be898dd3b5b863a253d7a/src/code_in_book/v2ch02/match/HrefMatch.java#L32
    Pattern.compile("<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/YJ2CS/core-java-learning-noMaven/blob/d4dca22a3ce9ddd8c06be898dd3b5b863a253d7a/src/code_in_book/v1ch12/completableFutures/CompletableFutureDemo.java#L15
    Pattern.compile("[<]\\s*[iI][mM][gG]\\s*[^>]*[sS][rR][cC]\\s*[=]\\s*['\"]([^'\"]*)['\"][^>]*[>]"),
    // https://github.com/CesiumOS-BetaLabs/packages_apps_SettingsIntelligence/blob/14f8a20a84b3349d13c47833d446fd1648d251d2/src/com/android/settings/intelligence/search/indexing/IndexData.java#L66
    Pattern.compile("[,]\\s*"),
    // https://github.com/CesiumOS-BetaLabs/packages_apps_SettingsIntelligence/blob/14f8a20a84b3349d13c47833d446fd1648d251d2/src/com/android/settings/intelligence/search/indexing/IndexData.java#L61
    Pattern.compile("\u2011"),
    // https://github.com/Vikash-Invenio/Mulesoft-hackathon/blob/2703106f104abd03d632827a6db050c3e54b987c/src/main/java/org/alicebot/ab/PreProcessor.java#L225
    Pattern.compile("[\\.!\\?]"),
    // https://github.com/Vikash-Invenio/Mulesoft-hackathon/blob/2703106f104abd03d632827a6db050c3e54b987c/src/main/java/org/alicebot/ab/JapaneseTokenizer.java#L25
    Pattern.compile("(<.*>.*</.*>)|(<.*/>)"),
    // https://github.com/tonikelope/coronapoker/blob/c2ffdb77366530bf5969280d5485910731479ba6/src/main/java/com/tonikelope/coronapoker/Helpers.java#L696
    Pattern.compile("\\.00$"),
    // https://github.com/editor-minseop/k.nayeon/blob/a1599ccc336f55524428aadd026b70e0f5b7e3d6/nayeon/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L94
    Pattern.compile("\\.."),
    // https://github.com/openjdk/mobile/blob/62c9eb6a2a4e43fe7d2cac93ec0c4d7b8421e57c/src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/formats/html/HtmlDocletWriter.java#L2066
    Pattern.compile("^(Module|Package|Class)$"),
    // https://github.com/openjdk/mobile/blob/62c9eb6a2a4e43fe7d2cac93ec0c4d7b8421e57c/src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/formats/html/HtmlDocletWriter.java#L2065
    Pattern.compile("AnnotationType"),
    // https://github.com/openjdk/mobile/blob/62c9eb6a2a4e43fe7d2cac93ec0c4d7b8421e57c/src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/formats/html/HtmlDocletWriter.java#L2064
    Pattern.compile("(Writer)?(Impl)?$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RefactoringMiner_Adapted/src/org/refactoringminer/api/RefactoringType.java#L124
    Pattern.compile(" *, *"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RefactoringMiner_Adapted/src-test/org/refactoringminer/utils/RefactoringCrawlerResultReader.java#L42
    Pattern.compile("<refactoring name=\"([^\"]+)\">\\s*<parameter name= \"new element\">([^/]+)</parameter>\\s*<parameter name= \"old element\">([^/]+)</parameter>"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L223
    Pattern.compile("^\\@.*$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L237
    Pattern.compile(" static "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L239
    Pattern.compile(" final "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L241
    Pattern.compile(" transient "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L243
    Pattern.compile(" volatile "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L245
    Pattern.compile(" native "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L247
    Pattern.compile(" const "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L248
    Pattern.compile("\\<\\?\\>"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L249
    Pattern.compile("\\<T\\>"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L250
    Pattern.compile("\\(final "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L251
    Pattern.compile("\\,final "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L252
    Pattern.compile(" final\\,"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L253
    Pattern.compile(" synchronized "),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L262
    Pattern.compile("throws"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L308
    Pattern.compile("^(//)(.*)$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L315
    Pattern.compile("^(/\\*)(.*)$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L322
    Pattern.compile("^(\\*)(.*)$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L329
    Pattern.compile("^(})(\\s*)$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L336
    Pattern.compile("^(\\{)(\\s*)$"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L347
    Pattern.compile("(//.*?$)|(/\\*.*?\\*/)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileUtil.java#L348
    Pattern.compile("(\".*?(?<!\\\\)\")"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileOperationsUtil.java#L93
    Pattern.compile("^(\\+)"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileOperationsUtil.java#L102
    Pattern.compile("^(\\-)"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileOperationsUtil.java#L626
    Pattern.compile("@@\\s-\\d+,\\d+\\s\\+\\d+,\\d+\\s@@"),
    // https://github.com/rbonifacio/raszz/blob/8cabf432889fa2343c813f50e092173ac159f09c/RA-SZZ/src/br/ufrn/raszz/util/FileOperationsUtil.java#L634
    Pattern.compile("^(import)(\\s*)(.*)$"),
    // https://github.com/p76081158/WukongDockerfile/blob/31a5aba34d6d5a0cd3f35936c273b1dfb9db611d/gateway-alpine/tmp/gradle-2.4/src/wrapper/org/gradle/wrapper/SystemPropertiesHandler.java#L46
    Pattern.compile("systemProp\\.(.*)"),
    // https://github.com/0ZzYy0/jgxy/blob/fd1c2db65e6ae160c246be272fe64766480a4603/src/main/java/com/javafast/modules/jgxy/web/JgxyReceptionController.java#L316
    Pattern.compile("^[1-9]+[0-9]*$"),
    // https://github.com/Flexstor/allPractices/blob/ea2378d52147f6e64fae12577121ab078ae24a6a/src/main/java/com/company/practice23_24/Worker.java#L77
    Pattern.compile("([-]*\\d+)([*+/-])([-]*\\d+)"),
    // https://github.com/itsallcode/white-rabbit/blob/883e676964284ccd8264d310ca2b965c697ff1b0/logic/src/main/java/org/itsallcode/whiterabbit/logic/storage/DateToFileMapper.java#L24
    Pattern.compile("^(\\d\\d\\d\\d)-(\\d\\d)\\.json$"),
    // https://github.com/zfb-github/spring/blob/6cba34564fddb87fa86bd9b4b623c0a0ec81aba7/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/transport/handler/AbstractHttpSendingTransportHandler.java#L51
    Pattern.compile("[0-9A-Za-z_.]*"),
    // https://github.com/khainglaelaesoe/MMPortalAPI/blob/79eee6779e0b25f0601ad1c91f5e4698eab24501/src/main/java/com/portal/controller/UserController.java#L761
    Pattern.compile("[!@#$%&*()+=|<>?{}\\[\\]~]"),
    // https://github.com/trandinhlam/LAMTDCompany/blob/5c35ac00393a4db6f916056467b8159c96c283ef/HCMUSSDHCrawler/src/main/java/com/lamtd/maven/hcmussdhcrawler/task/HCMUSCrawlTask.java#L112
    Pattern.compile("post-([0-9]+)[\\s\\S]*<a href=\"([\\S]+)\" title=\"([^<]+)\""),
    // https://github.com/trandinhlam/LAMTDCompany/blob/5c35ac00393a4db6f916056467b8159c96c283ef/HCMUSSDHCrawler/src/main/java/com/lamtd/maven/hcmussdhcrawler/task/HCMUSCrawlTask.java#L115
    Pattern.compile("<ul class=\"academia-posts-archive academia-loop-posts\">"),
    // https://github.com/trandinhlam/LAMTDCompany/blob/5c35ac00393a4db6f916056467b8159c96c283ef/HCMUSSDHCrawler/src/main/java/com/lamtd/maven/hcmussdhcrawler/task/HCMUSCrawlTask.java#L118
    Pattern.compile("</li><!-- .academia-post -->"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/lettuce/lettuce-common/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/lettuce/LettuceArgSplitter.java#L17
    Pattern.compile("((key|value)<(?<wrapped>[^>]+)>|(?<plain>[0-9A-Za-z=]+))(\\s+|$)"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/kubernetes-client-7.0/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/kubernetesclient/KubernetesResource.java#L15
    Pattern.compile("^/api/v1(/namespaces/(?<namespace>[\\w-]+))?/(?<resource>[\\w-]+)(/(?<name>[\\w-]+))?(/(?<subresource>[\\w-]+))?"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/kubernetes-client-7.0/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/kubernetesclient/KubernetesResource.java#L19
    Pattern.compile("^/apis/(?<group>\\S+?)/(?<version>\\S+?)(/namespaces/(?<namespace>[\\w-]+))?/(?<resource>[\\w-]+)(/(?<name>[\\w-]+))?(/(?<subresource>[\\w-]+))?"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/kubernetes-client-7.0/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/kubernetesclient/KubernetesRequestDigest.java#L15
    Pattern.compile("^/(api|apis)(/\\S+)?/v\\d\\w*/\\S+"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/jdbc/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/jdbc/JdbcConnectionUrlParser.java#L119
    Pattern.compile("(?:(?:(?:[A-F0-9]{1,4}:){6}|(?=(?:[A-F0-9]{0,4}:){0,6}(?:[0-9]{1,3}\\.){3}[0-9]{1,3}(?![:.\\w]))(([0-9A-F]{1,4}:){0,5}|:)((:[0-9A-F]{1,4}){1,5}:|:)|::(?:[A-F0-9]{1,4}:){5})(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)|(?:[A-F0-9]{1,4}:){7}[A-F0-9]{1,4}|(?=(?:[A-F0-9]{0,4}:){0,7}[A-F0-9]{0,4}(?![:.\\w]))(([0-9A-F]{1,4}:){1,7}|:)((:[0-9A-F]{1,4}){1,7}|:)|(?:[A-F0-9]{1,4}:){7}:|:(:[A-F0-9]{1,4}){7})(?![:.\\w])", Pattern.CASE_INSENSITIVE),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/jdbc/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/jdbc/JdbcConnectionUrlParser.java#L350
    Pattern.compile("\\(\\s*host\\s*=\\s*([^ )]+)\\s*\\)"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/jdbc/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/jdbc/JdbcConnectionUrlParser.java#L351
    Pattern.compile("\\(\\s*port\\s*=\\s*([\\d]+)\\s*\\)"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/jdbc/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/jdbc/JdbcConnectionUrlParser.java#L352
    Pattern.compile("\\(\\s*user\\s*=\\s*([^ )]+)\\s*\\)"),
    // https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/5f263644da9383616016d2cc007a3301f7885c4b/instrumentation/jdbc/javaagent/src/main/java/io/opentelemetry/javaagent/instrumentation/jdbc/JdbcConnectionUrlParser.java#L560
    Pattern.compile("\\(\\s*service_name\\s*=\\s*([^ )]+)\\s*\\)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.desktop/javax/swing/plaf/basic/BasicFileChooserUI.java#L1075
    Pattern.compile("\" \""),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j/src/main/java/de/unibremen/informatik/st/libvcs4j/svn/SVNEngine.java#L67
    Pattern.compile("file://.*|http://.*|https://.*|svn://.*|svn+ssh://.*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j/src/main/java/de/unibremen/informatik/st/libvcs4j/svn/SVNEngine.java#L71
    Pattern.compile("file://.*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j/src/main/java/de/unibremen/informatik/st/libvcs4j/hg/HGEngine.java#L76
    Pattern.compile("file://.*|http.*|https.*|ssh.*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j/src/main/java/de/unibremen/informatik/st/libvcs4j/hg/HGEngine.java#L400
    Pattern.compile("\r\n$|\n$"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j/src/main/java/de/unibremen/informatik/st/libvcs4j/git/GitEngine.java#L63
    Pattern.compile("file://.*|http.*|ssh.*|git@.*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/libvcs4j-api/src/main/java/de/unibremen/informatik/st/libvcs4j/ITEngine.java#L157
    Pattern.compile("#(\\d+)"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/version/Version.java#L74
    Pattern.compile("\\s*(\\d+)\\.(\\d+)\\s*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/string/StringUtils.java#L59
    Pattern.compile("^[\\t\\p{Zs}]+", Pattern.MULTILINE),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/string/StringUtils.java#L1066
    Pattern.compile("([^^])([A-Z][a-z])"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/string/StringUtils.java#L1116
    Pattern.compile("([$\\\\])"),
    // https://github.com/divyank00/Event-Management-System/blob/1badb8b4f38625557f8532b83b08e1533a14ca55/app/src/main/java/com/example/collegeproject/auth/RegisterFragment.java#L201
    Pattern.compile("(0/91)?[7-9][0-9]{9}"),
    // https://github.com/MirasSafadi/SVC/blob/3f688daea9e608122bcf66596a202386670eabe3/app/src/main/java/security/InputValidators.java#L11
    Pattern.compile("^[a-z ]+[^0-9]$", Pattern.CASE_INSENSITIVE),
    // https://github.com/MirasSafadi/SVC/blob/3f688daea9e608122bcf66596a202386670eabe3/app/src/main/java/security/InputValidators.java#L12
    Pattern.compile("^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{6,}))$"),
    // https://github.com/MirasSafadi/SVC/blob/3f688daea9e608122bcf66596a202386670eabe3/app/src/main/java/security/InputValidators.java#L13
    Pattern.compile("^(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])$", Pattern.CASE_INSENSITIVE),
    // https://github.com/HarrisonTao/view_dome/blob/9455e84b7eff4c16191ec0a176e353b8719fd144/meiqiasdk/src/main/java/com/meiqia/meiqiasdk/util/MQEmotionUtil.java#L19
    Pattern.compile("(:[\u4e00-\u9fa5\\w]+:)"),
    // https://github.com/HarrisonTao/view_dome/blob/9455e84b7eff4c16191ec0a176e353b8719fd144/base/src/main/java/com/dykj/module/util/BaseStringUtil.java#L114
    Pattern.compile("^((13[0-9])|(147)|(15[^4,\\D])|(17[6-8])|(18[0-9]))\\d{8}$"),
    // https://github.com/HarrisonTao/view_dome/blob/9455e84b7eff4c16191ec0a176e353b8719fd144/base/src/main/java/com/dykj/module/util/BaseStringUtil.java#L140
    Pattern.compile("(\\+\\d+)?(\\d{3,4}\\-?)?\\d{7,8}$"),
    // https://github.com/whyhardpickname/introJava10e/blob/d8676e260d1f1f2f4198cdc6a64ff42d266058e5/ch12/exercises/ex27.java#L30
    Pattern.compile("Exercise[0-9]+_[0-9]+"),
    // https://github.com/whyhardpickname/introJava10e/blob/d8676e260d1f1f2f4198cdc6a64ff42d266058e5/ch12/exercises/ex25.java#L39
    Pattern.compile("[0-9]{4,}+"),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/VTabbed/ThongKeTab.java#L67
    Pattern.compile("^Tháng (\\d.*)"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/org/entando/entando/aps/system/services/storage/StorageManagerUtil.java#L35
    Pattern.compile("\\A(?!(?:COM[0-9]|CON|LPT[0-9]|NUL|PRN|AUX|com[0-9]|con|lpt[0-9]|nul|prn|aux)|[\\s\\.])[^\\\\/:*\"?<>|]{1,254}\\z"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/org/entando/entando/aps/system/services/storage/StorageManagerUtil.java#L36
    Pattern.compile("(^[\\w|\\.|\\-|\\_|/| ]+?)"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/org/entando/entando/aps/system/services/storage/StorageManagerUtil.java#L34
    Pattern.compile("([\\w|\\-]+?$)"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/org/entando/entando/aps/system/services/dataobject/model/DataObject.java#L111
    Pattern.compile("\\d+\\.\\d+"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/com/agiletec/aps/system/common/entity/model/attribute/util/TextAttributeValidationRules.java#L158
    Pattern.compile("([\t\n\r\f ])++"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/com/agiletec/aps/system/common/entity/model/attribute/util/TextAttributeValidationRules.java#L158
    Pattern.compile("\\&[^\\&;]+;"),
    // https://github.com/w-caffiero-entando/a22f031d/blob/d650236592406642d2e18663631267e6abf694f2/src/main/java/com/agiletec/aps/system/common/entity/model/attribute/util/TextAttributeValidationRules.java#L158
    Pattern.compile("<[^<>]+>"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L161
    Pattern.compile("#[a-fA-F0-9]{6}"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L258
    Pattern.compile("<!>"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L272
    Pattern.compile("&((<!>)*)([Rrk-oK-O])"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L273
    Pattern.compile("&((<!>)*)([XxA-Za-zUu0-9Rrk-oK-O])"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L291
    Pattern.compile("#[A-Fa-f0-9]{6}"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L411
    Pattern.compile("[XxA-Fa-fUu0-9]"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L507
    Pattern.compile("([+-]*[0-9]+)(m[o]+[n]*[t]*[h]*[s]*|m[i]*[n]*[u]*[t]*[e]*[s]*|y[e]*[a]*[r]*[s]*|w[e]*[k]*[s]*|h[o]*[u]*[r]*[s]*|s[e]*[c]*[o]*[n]*[d]*[s]*|d[a]*[y]*[s]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L653
    Pattern.compile("[^0-9E+.,()*/-]+"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L673
    Pattern.compile("[^+0-9E.,-]+"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L784
    Pattern.compile("[^+0-9E-]+"),
    // https://github.com/TheDevTec/TheAPI/blob/665da8fb8ebef350cc6d14c9e60bb27aef27e2f4/src/me/DevTec/TheAPI/Utils/StringUtils.java#L840
    Pattern.compile("[^A-Z-a-z0-9_]+"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/entity/mapstuff/puzzle/PuzzleBuildingBlock.java#L65
    Pattern.compile("\"[^\"]*\"|[A-Za-z0-9._]+"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/core/rp/WeatherUpdater.java#L36
    Pattern.compile("varying(?:\\((.*)\\))?"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/core/engine/StendhalRPZone.java#L1652
    Pattern.compile("^(-?[\\d]|int)_(.+)$"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/core/engine/StendhalRPZone.java#L1671
    Pattern.compile("^\\d"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/core/engine/StendhalRPZone.java#L1785
    Pattern.compile("^-?\\d"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/server/actions/chat/QuoteSpecials.java#L18
    Pattern.compile("§"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/common/parser/Expression.java#L597
    Pattern.compile(" not"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/update/UpdateProgressBarMetaRefreshSupport.java#L53
    Pattern.compile("<meta http-equiv=\"refresh\" content=\"([^;]*); url=([\"]*)\">"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/update/UpdateProgressBarMetaRefreshSupport.java#L56
    Pattern.compile("<meta content=\"([^;]*); url=([^\"]*)\" http-equiv=\"refresh\">"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/sound/sound/ExtendedSoundManager.java#L161
    Pattern.compile(".*pulseaudio.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/sound/sound/ExtendedSoundManager.java#L162
    Pattern.compile(".*plughw.0.0.*"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/sound/sound/ExtendedSoundManager.java#L163
    Pattern.compile(".*Java Sound Audio Engine.*"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/sound/manager/DeviceEvaluator.java#L165
    Pattern.compile(".*PulseAudio.*"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/gui/textformat/HtmlPreprocessor.java#L22
    Pattern.compile("(.*)\\<tally\\>([0-9]+)\\</tally\\>(.*)"),
    // https://github.com/OharaOli/Stendhal/blob/0664d678b4b056cd2cc3251e355d2390a4b886a1/src/games/stendhal/client/gui/KTextEdit.java#L510
    Pattern.compile("^https?://stendhalgame\\.org(/.*)*$"),
    // https://github.com/apache/tapestry-5/blob/5701b7bd8122c052fe2d921751cc8f6e0bafca5a/tapestry-core/src/main/java/org/apache/tapestry5/corelib/pages/ExceptionReport.java#L64
    Pattern.compile("\\..*path$"),
    // https://github.com/apache/tapestry-5/blob/5701b7bd8122c052fe2d921751cc8f6e0bafca5a/commons/src/main/java/org/apache/tapestry5/commons/util/TimeInterval.java#L54
    Pattern.compile("\\s*(\\d+)\\s*([a-z]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/tapestry-5/blob/5701b7bd8122c052fe2d921751cc8f6e0bafca5a/commons/src/main/java/org/apache/tapestry5/commons/internal/util/InternalCommonsUtils.java#L199
    Pattern.compile("^[_|$]*([\\p{javaJavaIdentifierPart}]+?)[_|$]*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/javadevjournal/javadevjournal/blob/8475fb461f8b94afa37a879b501d6865819ce086/Java/email-validation-regex/src/main/java/com/javadevjournal/regex/email/W3CHTML5EmailValidation.java#L8
    Pattern.compile("^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$"),
    // https://github.com/javadevjournal/javadevjournal/blob/8475fb461f8b94afa37a879b501d6865819ce086/Java/email-validation-regex/src/main/java/com/javadevjournal/regex/email/SimpleEmailValidation.java#L11
    Pattern.compile("^(.+)@(.+)$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Months.java#L8
    Pattern.compile("^([1-9]|1[0-2])$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Months.java#L9
    Pattern.compile("^(\\*(/([1-9]|1[0-2]))?)$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Minutes.java#L8
    Pattern.compile("^([1-5]?[0-9])$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Minutes.java#L9
    Pattern.compile("^(\\*(/[1-5]?[0-9])?)$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Hours.java#L8
    Pattern.compile("^(1?[0-9]|2[0-3])$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/Hours.java#L9
    Pattern.compile("^(\\*(/(1?[0-9]|2[0-3]))?)$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/DaysOfMonth.java#L8
    Pattern.compile("^([1-9]|[1-2][0-9]|3[0-1])$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/DaysOfMonth.java#L9
    Pattern.compile("^(\\*(/([1-2]?[0-9]|3[0-1]))?)$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/DayOfWeek.java#L8
    Pattern.compile("^[0-6]$"),
    // https://github.com/fbeba/cron-printer/blob/e7d5ba0fc5b8393bbb1681a5dfff78a05357494b/src/main/java/com/company/DayOfWeek.java#L9
    Pattern.compile("^(\\*(/([0-6]))?)$"),
    // https://github.com/hoadaika/task-ecoit/blob/b07cfa1e26fc366162d941443c2461f91bd3c9fa/backend-core/src/main/java/com/vz/backend/core/common/BussinessCommon.java#L29
    Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/ekptg/view/pdt/FrmMesyuarat.java#L2216
    Pattern.compile("X000000X"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/ekptg/view/pdt/FrmMesyuarat.java#L4080
    Pattern.compile("<xxx>(.+?)</xxx>"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VINResultParser.java#L31
    Pattern.compile("[IOQ]"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VINResultParser.java#L32
    Pattern.compile("[A-Z0-9]{17}"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L38
    Pattern.compile("BEGIN:VCARD", Pattern.CASE_INSENSITIVE),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L39
    Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L40
    Pattern.compile("\r\n[ \t]"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L41
    Pattern.compile("\\\\[nN]"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L42
    Pattern.compile("\\\\([,;\\\\])"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L45
    Pattern.compile("(?<!\\\\);+"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/VCardResultParser.java#L47
    Pattern.compile("[;,]"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/URIResultParser.java#L32
    Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/URIResultParser.java#L34
    Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/URIParsedResult.java#L28
    Pattern.compile(":/*([^/@]+)@[^/]+"),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/GeoResultParser.java#L35
    Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", Pattern.CASE_INSENSITIVE),
    // https://github.com/AriefRafie/myetapp_v6.5/blob/047509bf0a55e0b8119cb63dc4f0600842a7c066/WEB-INF/src/com/google/zxing/client/result/EmailDoCoMoResultParser.java#L32
    Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+"),
    // https://github.com/SianaRizwan/NGO-Management-System/blob/d8e7f58b19e7efe43baf14b0e68ddf0635437f0b/src/Utilities/PhoneValidator.java#L10
    Pattern.compile("88?[0][1][0-9]{9}|[0][1][0-9]{9}"),
    // https://github.com/albertogfm/CompiladorASC/blob/b807ec5d75daf7410c0e57ff0e5cbb4223c250bd/src/filemanagment/Datos.java#L26
    Pattern.compile("^([A-Za-z]+)([0-9]*)"),
    // https://github.com/albertogfm/CompiladorASC/blob/b807ec5d75daf7410c0e57ff0e5cbb4223c250bd/src/compiladorasc/CompiladorASC.java#L41
    Pattern.compile("^((\\*)[a-zA-Z0-9_\\*( )]*)$"),
    // https://github.com/albertogfm/CompiladorASC/blob/b807ec5d75daf7410c0e57ff0e5cbb4223c250bd/src/compiladorasc/CompiladorASC.java#L43
    Pattern.compile("((\\*)[a-zA-Z0-9_\\*( )]*)"),
    // https://github.com/albertogfm/CompiladorASC/blob/b807ec5d75daf7410c0e57ff0e5cbb4223c250bd/src/compiladorasc/CompiladorASC.java#L45
    Pattern.compile("^( )*$"),
    // https://github.com/CMPUT301F20T35/BookIt/blob/8e927ad00ee8f8ca4a87a81e615f72109aaf2b46/Code/app/src/main/java/com/example/bookit/NewBookEditFragment.java#L148
    Pattern.compile("^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$"),
    // https://github.com/kleaves/WebdavExplorer/blob/4c7dfa3ad1e3424f612efe6961133e3f80e7d544/app/src/main/java/red/blueto/www/WebdavExplorer/BaseManActivity.java#L63
    Pattern.compile("[hH][tT]{2}[pP][sS]{0,2}\\:\\/\\/\\S*\\.\\S*", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/trancutuad/Appdocbao/blob/33319265768aedc13ab0db7c97007eb17541d250/app/src/main/java/vn/poly/appdoctintuc/MainActivity.java#L89
    Pattern.compile("<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>"),
    // https://github.com/hakimihamzan/code_journey/blob/780989a5b29df52a98084981224925609bf19d28/11th%20-%20NOVEMBER/x_17_guess_celeb_crappy/java/com/k31/guessthecelebrity/MainActivity.java#L63
    Pattern.compile("<div class=\"image\">\n\t\t\t\t\t\t<img src=\"(.*?)\" alt=\""),
    // https://github.com/hakimihamzan/code_journey/blob/780989a5b29df52a98084981224925609bf19d28/11th%20-%20NOVEMBER/x_17_guess_celeb_crappy/java/com/k31/guessthecelebrity/MainActivity.java#L73
    Pattern.compile("\" alt=\"(.*?)\"/>"),
    // https://github.com/KoalaTeaSoftware/greenlands-test/blob/2b293c939613dbf25f55ad1181c2c5bd996576f3/src/test/java/testFramework/helpers/resourceLocator.java#L23
    Pattern.compile("^(https|http)?(://)?((?!-)[A-Za-z0-9-.]{1,63}(?<!-)\\.+[A-Za-z]{2,6})?(.*)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/jdk.zipfs/jdk/nio/zipfs/ZipFileSystem.java#L1385
    Pattern.compile("^[1-9][0-9]*$"),
    // https://github.com/loic-fremaux/QueryBuilder/blob/e3f552295fd14bb480e200853edb2b65810bade8/src/main/java/fr/lfremaux/queryBuilder/objects/NamedParamStatement.java#L19
    Pattern.compile("(?<!')(:[\\w]*)(?!')"),
    // https://github.com/MJLblabla/hapiProfile/blob/5d8abeca243e2dd755f7571b058e7d72c7001e17/hapiBlock/src/main/java/com/hapi/aop/util/DeviceUtil.java#L339
    Pattern.compile("0-[\\d]+$"),
    // https://github.com/MJLblabla/hapiProfile/blob/5d8abeca243e2dd755f7571b058e7d72c7001e17/hapiBlock/src/main/java/com/hapi/aop/util/DeviceUtil.java#L361
    Pattern.compile("cpu[0-9]"),
    // https://github.com/IrinaTik/java_course/blob/53f902c5a64cbacc4f3f2b0b24eb45a200f5791d/09_FilesAndNetwork/Tables/src/StringParser.java#L11
    Pattern.compile("(\\\\|/)([a-zA-Z].+)((\\d{2}\\.\\d{2}\\.\\d{2}\\s+){2})"),
    // https://github.com/chenzw100/oa/blob/82c8aa733fd057734d21c8193566f1aa76a54b1d/src/main/java/com/example/demo/service/KpwHrService.java#L32
    Pattern.compile("; "),
    // https://github.com/chenzw100/oa/blob/82c8aa733fd057734d21c8193566f1aa76a54b1d/src/main/java/com/example/demo/service/KpwHrService.java#L103
    Pattern.compile("(?<!\\d)(?:(?:1[34578]\\d{9})|(?:861[358]\\d{9}))(?!\\d)"),
    // https://github.com/code-cubic/hive-tool/blob/f02ba31596980f143a9d5ae72f3317c32a1c8943/src/main/java/com/codecubic/dao/JdbcTemplate.java#L192
    Pattern.compile("AUTO_INCREMENT=\\d+\\s"),
    // https://github.com/code-cubic/hive-tool/blob/f02ba31596980f143a9d5ae72f3317c32a1c8943/src/main/java/com/codecubic/dao/JdbcTemplate.java#L195
    Pattern.compile("timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'"),
    // https://github.com/code-cubic/hive-tool/blob/f02ba31596980f143a9d5ae72f3317c32a1c8943/src/main/java/com/codecubic/dao/JdbcTemplate.java#L196
    Pattern.compile("timestamp NOT NULL COMMENT"),
    // https://github.com/code-cubic/hive-tool/blob/f02ba31596980f143a9d5ae72f3317c32a1c8943/src/main/java/com/codecubic/dao/JdbcTemplate.java#L197
    Pattern.compile("DEFAULT '0000-00-00 00:00:00.000'"),
    // https://github.com/code-cubic/hive-tool/blob/f02ba31596980f143a9d5ae72f3317c32a1c8943/src/main/java/com/codecubic/dao/JdbcTemplate.java#L198
    Pattern.compile("DEFAULT '1980-01-01 00:00:00.000'"),
    // https://github.com/cronn/ssh-proxy/blob/5bbb8c8246a1249455ed739449123cc05be10415/src/main/java/de/cronn/proxy/ssh/SshProxyConfig.java#L17
    Pattern.compile("ssh -q -W ([\\w\\.\\-_0-9]+|%h):(\\d+|%p) (.+)"),
    // https://github.com/Roman-2001/Java-bot/blob/87eec5f4f24b5d4eba65be0e4cf7d974dca3e06f/src/GlossaryReader.java#L82
    Pattern.compile(".*,,"),
    // https://github.com/Roman-2001/Java-bot/blob/87eec5f4f24b5d4eba65be0e4cf7d974dca3e06f/src/GlossaryReader.java#L101
    Pattern.compile(" \\("),
    // https://github.com/raidcraft/rccities/blob/c664706555ecda231af2da0b09bd56181e745495/src/main/java/net/silthus/rccities/api/flags/FlagType.java#L21
    Pattern.compile("^((\\d+)[gG])?\\s?((\\d+)[sS])?\\s?((\\d+)[cCkK]?)?$"),
    // https://github.com/inkarnadin/cms-check-component/blob/13920a9c9c5ab9e05465f39f2f09786b56232a8f/src/main/java/web/cms/modx/ModXCheckProcessor.java#L31
    Pattern.compile("assets/templates"),
    // https://github.com/inkarnadin/cms-check-component/blob/13920a9c9c5ab9e05465f39f2f09786b56232a8f/src/main/java/web/cms/modx/ModXCheckProcessor.java#L32
    Pattern.compile("assets/cache"),
    // https://github.com/abdullah-paracha/OBE/blob/8ba622224c782a6d85d9971a20fdb4bf21854fbc/EnterpriseApplication2-war/src/java/QOBE/test.java#L30
    Pattern.compile("<a href=(\"[^\"]*\")[^<]*</a>"),
    // https://github.com/jjrim/MyFirstAndroidProject/blob/5b00bc51b34f965792a15278024aeea57e296ba4/app/src/main/java/ca/bcit/groupproject/FindLocationActivity.java#L73
    Pattern.compile("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L193
    Pattern.compile("^pljava/([^/]+dir)(?![^/])"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L261
    Pattern.compile("pljava/pkglibdir/(?:lib)?+pljava-so-.*"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L1050
    Pattern.compile("\\.lib$"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L1549
    Pattern.compile("^file:///"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2292
    Pattern.compile("(.+?)(?:\\1){16,}"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2570
    Pattern.compile(".*\\.(?i:cmd|bat)$"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2613
    Pattern.compile("(\\\\*+)(\")"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2630
    Pattern.compile("(?s:[^ \\t<>]*+.++)"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2632
    Pattern.compile("(\\\\)(\\\\*+)$"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2731
    Pattern.compile("(\\\\++)(\"|$)"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-packaging/src/main/java/Node.java#L2732
    Pattern.compile("([<>|&()^])"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-api/src/main/java/org/postgresql/pljava/annotation/processing/DDRProcessor.java#L6187
    Pattern.compile("(?i:INT|INTEGER|SMALLINT|BIGINT|REAL|FLOAT|DECIMAL|DEC|NUMERIC|BOOLEAN|BIT|CHARACTER|CHAR|VARCHAR|TIMESTAMP|TIME|INTERVAL)"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava-api/src/main/java/org/postgresql/pljava/annotation/processing/DDRProcessor.java#L6377
    Pattern.compile("\\d++"),
    // https://github.com/RaulJAGG/Serializacion/blob/a7e3ac9ab2de7a76bc4c5b0240513854b3b88b07/src/serializacion/Registro.java#L411
    Pattern.compile("[A-Za-z0-9]+"),
    // https://github.com/RaulJAGG/Serializacion/blob/a7e3ac9ab2de7a76bc4c5b0240513854b3b88b07/src/serializacion/Registro.java#L542
    Pattern.compile("[a-z0-9+.?-?_?]+@+[a-z+]+[.]+[a-z+]+"),
    // https://github.com/RaulJAGG/Serializacion/blob/a7e3ac9ab2de7a76bc4c5b0240513854b3b88b07/src/serializacion/Registro.java#L545
    Pattern.compile("[A-Za-z0-9#]+"),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/ReplaceParent.java#L11
    Pattern.compile("(<project[^<]*>)(.*?)(</project>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/ReplaceInPlugins.java#L10
    Pattern.compile("(<build>.*?<plugins>)(.*?)(</plugins>.*?</build>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/ReplaceInPluginManagement.java#L10
    Pattern.compile("(<build>.*?<pluginManagement>.*?<plugins>)(.*?)(</plugins>.*?</pluginManagement>.*?</build>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/ReplaceInDependencyManagement.java#L11
    Pattern.compile("(<dependencyManagement>.*?<dependencies>)(.*?)(</dependencies>.*?</dependencyManagement>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/ReplaceInDependencies.java#L9
    Pattern.compile("(<dependencies>)(.*?)(</dependencies>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/Plugins.java#L8
    Pattern.compile("<plugin>.*?</plugin>", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/Dependencies.java#L7
    Pattern.compile("<dependency>.*?</dependency>", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/Parent.java#L8
    Pattern.compile("<parent>.*?</parent>", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/AbstractArtifactCoordinates.java#L9
    Pattern.compile("(<groupId>\\s*)(.*?)(\\s*</groupId>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/AbstractArtifactCoordinates.java#L10
    Pattern.compile("(<artifactId>\\s*)(.*?)(\\s*</artifactId>)", Pattern.DOTALL),
    // https://github.com/flexiooss/poom-ci/blob/181dfd846652ccc65f525a13f9d894a29a29c689/poom-ci-apps/poom-ci-releaser/src/main/java/org/codingmatters/poom/ci/apps/releaser/maven/fragments/AbstractArtifactCoordinates.java#L11
    Pattern.compile("(<version>\\s*)(.*?)(\\s*</version>)", Pattern.DOTALL),
    // https://github.com/crumpf-sdsu/planb/blob/a4e971415a94952649150af5a3fedcec63e8b4bb/tensorflow-v2.4.0-rc3/tensorflow/java/src/gen/java/org/tensorflow/processor/OperatorProcessor.java#L152
    Pattern.compile("@(?:param|return|throws|exception|see)\\s+.*"),
    // https://github.com/crumpf-sdsu/planb/blob/a4e971415a94952649150af5a3fedcec63e8b4bb/tensorflow-v2.2.1/tensorflow/java/src/main/java/org/tensorflow/op/NameScope.java#L145
    Pattern.compile("[A-Za-z0-9.][A-Za-z0-9_.\\-]*"),
    // https://github.com/marvinwel/3311_Team_4/blob/6a73a1a803d922562b14647527256eca3c44357d/app/src/main/java/com/example/password_saver/Register.java#L273
    Pattern.compile("[a-zA-Z0-9]\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA_Z0-9][a-zA-Z0-9\\-]{0,25}])+"),
    // https://github.com/andbi/evrete/blob/63de0a424c5c2ebf4c59caa57a3eff404dcfd8f1/evrete-core/src/main/java/org/evrete/spi/minimal/DefaultExpressionResolver.java#L17
    Pattern.compile("\\$[a-zA-Z0-9]+(\\.[a-zA-Z][a-zA-Z0-9]*)+"),
    // https://github.com/tobidope/aoc2015/blob/4baf00266abcab37614c2857b996c8752690c3b6/src/main/java/de/tobiasbell/aoc_2015/day6/Instruction.java#L13
    Pattern.compile("(?<command>turn (?:on|off)|toggle) (?<from>\\d+,\\d+) through (?<to>\\d+,\\d+)"),
    // https://github.com/caomingjie-code/mh-open/blob/7898ef7ccc7b139f5d502825549b55c4c7f1742f/mh-base/src/main/java/com/mh/base/utils/sql/SQLParse.java#L23
    Pattern.compile("(\\#\\{[0-9a-zA-Z-]+\\})"),
    // https://github.com/onedevarmy/chess/blob/195995d10fa059fc081b0dedf48dc7182729712f/src/main/java/it/uniba/chess/InputValidator.java#L35
    Pattern.compile("^(C|A|T|D|R|)([a-h]?|[1-8]?)(x?)([a-h][1-8])((e[.]p[.])?)$"),
    // https://github.com/onedevarmy/chess/blob/195995d10fa059fc081b0dedf48dc7182729712f/src/main/java/it/uniba/chess/InputValidator.java#L360
    Pattern.compile("[1-8]"),
    // https://github.com/onedevarmy/chess/blob/195995d10fa059fc081b0dedf48dc7182729712f/src/main/java/it/uniba/chess/InputValidator.java#L367
    Pattern.compile("[a-h]"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L62
    Pattern.compile("<br>Найдено <b>(.*?)</b> записей<br>"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L78
    Pattern.compile("<tr><td align=center><a href=\"(.*?)</td></tr>"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L86
    Pattern.compile("&id=(.*?)\">"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L95
    Pattern.compile("</a></td><td>(.*?)</td><td>"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L116
    Pattern.compile("</a></td><td align=center>(.*?)</td>"),
    // https://github.com/OlegSuturin/SpaceInStamps/blob/84eb5b6847c02504f5bee0751be6767e73bcd7ad/app/src/main/java/com/oliverst/spaceinstamps/utils/NetworkUtils.java#L121
    Pattern.compile("</td>\t<td>(.*?)</td></tr>"),
    // https://github.com/j309999174/beibeiwuandroid/blob/d88f41252c0ab29a8493f5251e22ecf86d950d73/app/src/main/java/xin/banghua/beiyuan/Main5Branch/MeFragment.java#L323
    Pattern.compile("(\\D*)(\\d+)(.*)"),
    // https://github.com/zebra134/RTU/blob/48b58dd4aa5670cecbb5a5f97e8cd979a2b91a08/src/ru/zebra134/RTU/Pr25/Ex4/Main.java#L12
    Pattern.compile("\\([\\d+/*-]*\\)"),
    // https://github.com/zebra134/RTU/blob/48b58dd4aa5670cecbb5a5f97e8cd979a2b91a08/src/ru/zebra134/RTU/Pr25/Ex4/Main.java#L19
    Pattern.compile("[\\d+/*-]*"),
    // https://github.com/zfb-github/spring/blob/6cba34564fddb87fa86bd9b4b623c0a0ec81aba7/spring-web/src/main/java/org/springframework/http/client/reactive/JettyClientHttpResponse.java#L47
    Pattern.compile("(?i).*SameSite=(Strict|Lax|None).*"),
    // https://github.com/Nagisa12321/Myalgs/blob/ad4369f786351609259b900a1e33c76e75859d62/src/main/java/com/JTChen/PracticalOperation/MyCalculator.java#L26
    Pattern.compile("[0-9]*\\.?[0-9]*"),
    // https://github.com/JHawanetFramework/JHawanetFramework/blob/6fdfb5e99bbc79aed942930f3c6c473dc7d30ff8/src/main/java/controller/util/TextInputUtil.java#L25
    Pattern.compile("-?(([1-9][0-9]*)|0)?(\\.[0-9]*)?"),
    // https://github.com/JHawanetFramework/JHawanetFramework/blob/6fdfb5e99bbc79aed942930f3c6c473dc7d30ff8/src/main/java/controller/util/TextInputUtil.java#L59
    Pattern.compile("-?(([1-9][0-9]*)|0)?"),
    // https://github.com/Virtual-FTC/Basic-Virtual-Controller/blob/76d1839d748ce3063d381a4472f4333d3331809f/FtcCommon/src/main/java/com/qualcomm/ftccommon/FtcEventLoopBase.java#L927
    Pattern.compile("(?i).*\\.bin"),
    // https://github.com/limwoobin/CleanCode/blob/5fccbb0679c1cf61778ce9810b36575e0910c048/src/Chapter05_Convention/Ex/BoldWidget.java#L10
    Pattern.compile("'''(.+?)'''", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/ZJUHSY/CS61C/blob/dbbb5b48fc2fbc6cc16e428c23e06a1818a3ef92/labs/03/bin/mars/ErrorMessage.java#L197
    Pattern.compile("<\\d+>"),
    // https://github.com/a00400302/PingAnWeiShi-mobile/blob/9581db5d5957f17521478b161205043f56c6224b/common/src/main/java/com/yxdz/common/utils/ComNetWorkUtils.java#L128
    Pattern.compile("^(http://|https://)?((?:[A-Za-z0-9]+-[A-Za-z0-9]+|[A-Za-z0-9]+)\\.)+([A-Za-z]+)[/\\?\\:]?.*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/crdroidandroid/android_vendor_qcom_opensource_packages_apps_Bluetooth/blob/0c74772e08de0980e672887dd43678afa783ee9b/src/com/android/bluetooth/opp/BluetoothOppLauncherActivity.java#L70
    Pattern.compile("[<>&]| {2,}|\r?\n"),
    // https://github.com/crdroidandroid/android_vendor_qcom_opensource_packages_apps_Bluetooth/blob/0c74772e08de0980e672887dd43678afa783ee9b/src/com/android/bluetooth/opp/BluetoothOppLauncherActivity.java#L309
    Pattern.compile("(?i)(http|https)://"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L10
    Pattern.compile("(^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})*$)"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L18
    Pattern.compile("^(0)?9\\d{9}$"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L26
    Pattern.compile("(^[a-zA-Z]*$)"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L34
    Pattern.compile("(^(?=^.{6,}$)((?=.*[A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z]))^.*$)"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L42
    Pattern.compile("^(1[90]|[2-6][0-9])$"),
    // https://github.com/AP2020Fall/project-team-team-1/blob/eb397300ecde3d7ad0d64cc987cbfe17191eb26a/src/main/java/Controller/CompetencyController/Validation.java#L50
    Pattern.compile("(^[a-zA-Z0-9]*$)"),
    // https://github.com/IThawk/learnCode/blob/ea6154cb5e6196b77340519b036d3780a4f3e173/spring5/spring-orm/src/main/java/com/ithawk/demo/spring/orm/framework/QueryRuleSqlBuilder.java#L160
    Pattern.compile("from\\s+"),
    // https://github.com/IThawk/learnCode/blob/ea6154cb5e6196b77340519b036d3780a4f3e173/spring5/spring-orm/src/main/java/com/ithawk/demo/spring/orm/framework/BaseDaoSupport.java#L860
    Pattern.compile("^\\s*and"),
    // https://github.com/robinhood-jim/JavaFramework/blob/c45792ed139e12eec8327123cb424489cfd33325/core/src/main/java/com/robin/core/base/util/Const.java#L162
    Pattern.compile("%\\[\\w+\\]"),
    // https://github.com/pollend/joml-primitives/blob/2fe3893b0c26a257b9db12b483bb96be2b76b4cf/buildhelper/UrlChecker.java#L44
    Pattern.compile("\"(http[^\"]+)\""),
    // https://github.com/TatevMT/banktransaction/blob/be47e5a597de415812829bcfbee48b11a4700b1c/banktransaction/src/main/java/com/bdg/banktransaction/model/User.java#L107
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&--_+=()])(?=\\S+$).{8,20}"),
    // https://github.com/TatevMT/banktransaction/blob/be47e5a597de415812829bcfbee48b11a4700b1c/banktransaction/src/main/java/com/bdg/banktransaction/model/User.java#L121
    Pattern.compile("^[a-zA-Z0-9_+&*-]+(\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9]+)*(\\.[A-Za-z]{2,7})$"),
    // https://github.com/GorVad/MISIS-PROG-JAVA/blob/20988fe3447cbee4d33f511a39ba7a8336982dc5/MISIS-PROG-JAVA/src/LR4Main/LR4MainClass.java#L19
    Pattern.compile("agent ver:(\\d+.\\d+.\\d+)"),
    // https://github.com/GorVad/MISIS-PROG-JAVA/blob/20988fe3447cbee4d33f511a39ba7a8336982dc5/MISIS-PROG-JAVA/src/LR4Main/LR4MainClass.java#L20
    Pattern.compile("(\\S+)@"),
    // https://github.com/GorVad/MISIS-PROG-JAVA/blob/20988fe3447cbee4d33f511a39ba7a8336982dc5/MISIS-PROG-JAVA/src/LR4Main/LR4MainClass.java#L21
    Pattern.compile("(\\d+.\\d+.\\d+.\\d+.\\d+.\\d+.\\d+\\s.\\d+.\\d+.\\s\\w+\\s\\w\\d.\\d.\\d+\\s\\w+.\\s.+)"),
    // https://github.com/GorVad/MISIS-PROG-JAVA/blob/20988fe3447cbee4d33f511a39ba7a8336982dc5/MISIS-PROG-JAVA/src/LR4Main/LR4MainClass.java#L42
    Pattern.compile("EFOpenError: "),
    // https://github.com/twister55/tamtam-bot-api/blob/afea95337c12548765550b86381b56de2ab85030/generator/src/main/java/chat/tamtam/botapi/JsDocsBuilder.java#L13
    Pattern.compile("(.*)(\\[.+?]\\(#operation/(\\S+?)\\))(.*)"),
    // https://github.com/twister55/tamtam-bot-api/blob/afea95337c12548765550b86381b56de2ab85030/generator/src/main/java/chat/tamtam/botapi/JsDocsBuilder.java#L75
    Pattern.compile("\\. "),
    // https://github.com/twister55/tamtam-bot-api/blob/afea95337c12548765550b86381b56de2ab85030/generator/src/main/java/chat/tamtam/botapi/JsDocsBuilder.java#L102
    Pattern.compile("(\\s?[0-9]\\.\\s+?\\S)(.*)"),
    // https://github.com/stom79/TubeLab/blob/964b0f26904ba3c5ab5b9178ca226b8acf667b88/app/src/main/java/app/fedilab/fedilabtube/PeertubeActivity.java#L540
    Pattern.compile("(https?://[\\da-z.-]+\\.[a-z.]{2,10})/videos/watch/(\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12})(\\?start=(\\d+[hH])?(\\d+[mM])?(\\d+[sS])?)?$"),
    // https://github.com/Kamil-Kacprzak/coding-challenges/blob/e738dbd0601b67ca14ae524989225ddf6c5c694e/src/hackerrank/interviewprepkit/hashmaps/FreqQueries.java#L71
    Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$"),
    // https://github.com/Single-Wu/qst-mall-master/blob/bce98fccbe89b14ac7c889aab15af1f7bc81fc0d/qst-mall-master/src/main/java/wxd/qst/mall/util/PatternUtil.java#L24
    Pattern.compile("^[a-zA-Z0-9\u4E00-\u9FA5]+$"),
    // https://github.com/Single-Wu/qst-mall-master/blob/bce98fccbe89b14ac7c889aab15af1f7bc81fc0d/qst-mall-master/src/main/java/wxd/qst/mall/util/PatternUtil.java#L49
    Pattern.compile("^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$"),
    // https://github.com/jenkinsci/git-plugin/blob/5f8117e9010a847e140cb0b41c72c88f42776d81/src/main/java/hudson/plugins/git/browser/GitRepositoryBrowser.java#L143
    Pattern.compile(".*[.](corp|home|local|localnet)$"),
    // https://github.com/SpongePowered/Royale/blob/acd5968fd031a4a0ee3494c5ecb73b4afe7589ae/src/main/java/org/spongepowered/royale/template/ComponentTemplate.java#L47
    Pattern.compile("<(?<token>pl_(?<placeholder>.+:.+)(_(?<arg>.+))?)>"),
    // https://github.com/PeterBowman/wikibot/blob/01635c9c95559d19f980af318d7299d8f485982d/wikibot/src/main/java/com/github/wikibot/tasks/plwikt/MissingPolishEntries.java#L32
    Pattern.compile("^sgjp-\\d{8}\\.tab\\.gz$"),
    // https://github.com/ChenLangChen/MapReduce-Word-Coount/blob/54fb9cc8a5174f19eeb12d1b2074f8cd2b3787cd/s3754699_BDP_S2_2020/simpleWordCount/src/main/java/BigData/Assignment1/simpleWordCount/task2.java#L38
    Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE),
    // https://github.com/ChenLangChen/MapReduce-Word-Coount/blob/54fb9cc8a5174f19eeb12d1b2074f8cd2b3787cd/s3754699_BDP_S2_2020/simpleWordCount/src/main/java/BigData/Assignment1/simpleWordCount/task2.java#L39
    Pattern.compile("[BCDFGHJKLMNPQRSTVXZWY]", Pattern.CASE_INSENSITIVE),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/submit/lookup/SubmissionLookupUtils.java#L51
    Pattern.compile(".*\\((.*)\\)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/submit/lookup/SubmissionLookupUtils.java#L108
    Pattern.compile("^doi:"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/submit/lookup/SubmissionLookupUtils.java#L107
    Pattern.compile("^http://dx.doi.org/"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/storage/rdbms/DatabaseUtils.java#L1386
    Pattern.compile("^([0-9]*\\.[0-9]*)(\\.)?.*"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/statistics/util/ClassicDSpaceLogConverter.java#L67
    Pattern.compile("ip_addr=(\\d*\\.\\d*\\.\\d*\\.\\d*):"),
    // https://github.com/wushexu/etcb/blob/9778d2ea1a296406f115c664a9591f97f23ce79e/src/main/java/com/bonc/etcb/model/jou/JournalFile.java#L17
    Pattern.compile("\\d+_(20[0-9]{6})_([0-9]{13})_ZTTX_Entrust_Detail.*\\.txt"),
    // https://github.com/huaibbfjb/msgsys_lyt/blob/d013dcb14fa0437af54164c92009e60722eb097a/src/com/msgsys/servlet/UserServlet.java#L92
    Pattern.compile(".+(.JPEG|.jpeg|.JPG|.jpg)$"),
    // https://github.com/AospExtended/platform_packages_providers_MediaProvider/blob/45f9b279308ebb2fc9a5106acc4c334a5fe3b696/src/com/android/providers/media/scan/ModernMediaScanner.java#L161
    Pattern.compile("(?i)^/storage/[^/]+(?:/[0-9]+)?(?:/Android/sandbox/([^/]+))?$"),
    // https://github.com/AospExtended/platform_packages_providers_MediaProvider/blob/45f9b279308ebb2fc9a5106acc4c334a5fe3b696/src/com/android/providers/media/scan/ModernMediaScanner.java#L163
    Pattern.compile("(?i)^/storage/[^/]+(?:/[0-9]+)?(?:/Android/sandbox/([^/]+))?/(?:(?:Android/(?:data|obb)$)|(?:(?:Movies|Music|Pictures)/.thumbnails$))"),
    // https://github.com/AospExtended/platform_packages_providers_MediaProvider/blob/45f9b279308ebb2fc9a5106acc4c334a5fe3b696/src/com/android/providers/media/scan/ModernMediaScanner.java#L166
    Pattern.compile("([1-9][0-9][0-9][0-9])"),
    // https://github.com/AospExtended/platform_packages_providers_MediaProvider/blob/45f9b279308ebb2fc9a5106acc4c334a5fe3b696/src/com/android/providers/media/scan/ModernMediaScanner.java#L169
    Pattern.compile("(?i)(?:(?:^folder|(?:^AlbumArt(?:(?:_\\{.*\\}_)?(?:small|large))?))(?:\\.jpg$)|(?:\\._.*))"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/String/Split.java#L75
    Pattern.compile("e"),
    // https://github.com/JoshBHodges/DJ-Keyren/blob/23f59490c74d4699c8f6a8bfed3dc6ad7cecb14d/src/main/java/com/jeshy/djkeyren/LinkParser.java#L21
    Pattern.compile("\"url\":\"/watch\\?v=(.+?)\""),
    // https://github.com/JoshBHodges/DJ-Keyren/blob/23f59490c74d4699c8f6a8bfed3dc6ad7cecb14d/src/main/java/com/jeshy/djkeyren/LinkParser.java#L31
    Pattern.compile("https://www\\.youtube.com/watch\\?v=(.+?)"),
    // https://github.com/Horiapavel98/reminder-api-client/blob/b9bc3e97fbf8cabee771456e2bf9eb050a8cdc59/src/main/java/com/horia/reminder/api/client/FieldValidator.java#L13
    Pattern.compile("(\\+)?(\\d{10,12})"),
    // https://github.com/Horiapavel98/reminder-api-client/blob/b9bc3e97fbf8cabee771456e2bf9eb050a8cdc59/src/main/java/com/horia/reminder/api/client/FieldValidator.java#L14
    Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}"),
    // https://github.com/NoNameLi/firecontrol/blob/977a8dc09f450b47823129d287fe55691b891ca9/turing-gate/turing-gate-server/src/main/java/cn/turing/firecontrol/gate/filter/AdminAccessFilter.java#L164
    Pattern.compile("\\{\\*\\}"),
    // https://github.com/NoNameLi/firecontrol/blob/977a8dc09f450b47823129d287fe55691b891ca9/turing-device/src/main/java/cn/turing/firecontrol/device/rest/DeviceFireMainController.java#L345
    Pattern.compile("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L123
    Pattern.compile("\\\\D"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L126
    Pattern.compile("\\\\s"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L129
    Pattern.compile("\\\\S"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L132
    Pattern.compile("\\\\w"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L135
    Pattern.compile("\\\\W"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L153
    Pattern.compile("\\(\\?i\\)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L156
    Pattern.compile("\\(\\?d\\)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L159
    Pattern.compile("\\(\\?x\\)"),
  };
}
