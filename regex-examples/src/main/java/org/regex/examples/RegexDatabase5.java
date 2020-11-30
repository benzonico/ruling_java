package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase5 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/apache/druid/blob/e83d5cb59e07d605f6198dfade87d2d71eb31c01/indexing-service/src/test/java/org/apache/druid/indexing/common/task/AppenderatorDriverRealtimeIndexTaskTest.java#L1236
    Pattern.compile("(?s)java\\.lang\\.IllegalArgumentException.*\n\tat (java\\.base/)?java\\.nio\\.Buffer\\..*"),
    // https://github.com/iclavijos/msdb/blob/7f87a65f6f0d215ac6c1cfb7e7f969fdbcc67850/src/main/java/com/icesoft/msdb/web/rest/ImportsResource.java#L419
    Pattern.compile("\\+?\\d+"),
    // https://github.com/iclavijos/msdb/blob/7f87a65f6f0d215ac6c1cfb7e7f969fdbcc67850/src/main/java/com/icesoft/msdb/web/rest/ImportsResource.java#L459
    Pattern.compile("\\+?(\\d+h)?(([0-5]?\\d)[':m])?(\\d?\\d)([\\.,](\\d+))?s?"),
    // https://github.com/jeremy8551/java-atom-tool/blob/d1727ed584324f4d8b9e47d5955438011a05a0e5/atom/src/test/java/indi/lvzhaojun/script/cmd/SSHPortForwardCommandTest.java#L12
    Pattern.compile("(?i)ssh\\s+open\\s+tunnel\\s+(\\S+)\\s+use\\s+(\\S+)\\s+proxy\\s+connect\\s+to\\s+([^\\;]+)\\s*[;]*"),
    // https://github.com/jeremy8551/java-atom-tool/blob/d1727ed584324f4d8b9e47d5955438011a05a0e5/atom/src/test/java/indi/lvzhaojun/script/cmd/DefineProgressCommandTest.java#L12
    Pattern.compile("(?i)define(\\s+\\S{0,})\\s+progress\\s+use\\s+([^\\s]+)\\s+output\\s+(.*)\\s+total\\s+([^\\s]+)\\s+times\\s*;"),
    // https://github.com/FraunhoferISST/DataspaceConnector/blob/4f2a356d9e849fff37a9f7a6cba833645ef2483e/src/main/java/de/fraunhofer/isst/dataspaceconnector/services/UUIDUtils.java#L23
    Pattern.compile("\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}"),
    // https://github.com/yuanhonglie/LanCastDemo/blob/f89fd92a715e4d90f24e0e36608579f30abe0d9c/jmdns/src/main/java/javax/jmdns/impl/ServiceTypeDecoder.java#L11
    Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$"),
    // https://github.com/yuanhonglie/LanCastDemo/blob/f89fd92a715e4d90f24e0e36608579f30abe0d9c/jmdns/src/main/java/javax/jmdns/impl/ServiceTypeDecoder.java#L12
    Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$"),
    // https://github.com/PixysOS/packages_modules_NetworkStack/blob/6ddf202ebd885c457ad3104695790fa6339c0552/src/com/android/networkstack/netlink/TcpSocketTracker.java#L456
    Pattern.compile("^(\\d+)(\\.(\\d+))?.*"),
    // https://github.com/PixysOS/packages_modules_NetworkStack/blob/8622000d176c0b5e4c34757a46e4582643335f68/src/com/android/server/connectivity/NetworkMonitor.java#L2600
    Pattern.compile("; *charset=\"?([^ ;\"]+)\"?", Pattern.CASE_INSENSITIVE),
    // https://github.com/Jurek83/MyRepository/blob/721706f2c1b6adbfe8415d077b782a207fa84076/src/nbm/Message.java#L46
    Pattern.compile("^(\\+|\\d)(?:([0-9]|\\-) ?){2,20}([0-9]|\\-)$"),
    // https://github.com/Jurek83/MyRepository/blob/721706f2c1b6adbfe8415d077b782a207fa84076/src/nbm/Message.java#L48
    Pattern.compile("^@([A-Za-z0-9_]{1,15})$"),
    // https://github.com/Jurek83/MyRepository/blob/721706f2c1b6adbfe8415d077b782a207fa84076/src/nbm/Message.java#L286
    Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{2})"),
    // https://github.com/Jurek83/MyRepository/blob/721706f2c1b6adbfe8415d077b782a207fa84076/src/nbm/Message.java#L337
    Pattern.compile("([0-9]{2})-([0-9]{2})-([0-9]{2})"),
    // https://github.com/Jurek83/MyRepository/blob/721706f2c1b6adbfe8415d077b782a207fa84076/src/nbm/Message.java#L474
    Pattern.compile("(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"),
    // https://github.com/AgMonk/pixivmanager2/blob/14b05ae153ad1c96e0af4af8cdf6535c5f1ea2de/src/main/java/com/gin/pixivmanager2/service/FileServiceImpl.java#L29
    Pattern.compile("\\d+_p\\d+"),
    // https://github.com/AgMonk/pixivmanager2/blob/14b05ae153ad1c96e0af4af8cdf6535c5f1ea2de/src/main/java/com/gin/pixivmanager2/service/FileServiceImpl.java#L30
    Pattern.compile("\\d+_\\d+"),
    // https://github.com/jimisun/embedrepo/blob/fd34ee6be172d2382c5a0b608f759a6ab9fe4c17/miaoexpress/app/src/main/java/com/zhuo/mexp/activity/UserRegisterActivity.java#L59
    Pattern.compile("^u_[a-zA-Z_0-9]{3,5}"),
    // https://github.com/jimisun/embedrepo/blob/fd34ee6be172d2382c5a0b608f759a6ab9fe4c17/miaoexpress/app/src/main/java/com/zhuo/mexp/activity/UserRegisterActivity.java#L61
    Pattern.compile("^1[3,5,8,7][0-9]{9}"),
    // https://github.com/jimisun/embedrepo/blob/fd34ee6be172d2382c5a0b608f759a6ab9fe4c17/miaoexpress/app/src/main/java/com/zhuo/mexp/activity/DistribRegisterActivity.java#L63
    Pattern.compile("^d_[a-zA-z_0-9]{3,5}"),
    // https://github.com/jimisun/embedrepo/blob/fd34ee6be172d2382c5a0b608f759a6ab9fe4c17/miaoexpress/app/src/main/java/com/zhuo/mexp/activity/DistribRegisterActivity.java#L67
    Pattern.compile("(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)"),
    // https://github.com/raulvenson/clienteCadastroHibernate/blob/46d8f666bb885859945c39cb0eb4fc9b24fe18fa/src/main/java/br/com/raul/view/ViewCadastroCliente.java#L554
    Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L95
    Pattern.compile("^(([^:/?#]+):)?(//(([^@\\[/?#]*)@)?(\\[[\\p{XDigit}:.]*[%\\p{Alnum}]*]|[^\\[/?#:]*)(:(\\d*(?:\\{[^/]+?})?))?)?([^?#]*)(\\?([^#]*))?(#(.*))?"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L99
    Pattern.compile("^(?i)(http|https):(//(([^@\\[/?#]*)@)?(\\[[\\p{XDigit}:.]*[%\\p{Alnum}]*]|[^\\[/?#:]*)(:(\\d*(?:\\{[^/]+?})?))?)?([^?#]*)(\\?([^#]*))?(#(.*))?"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L104
    Pattern.compile("(?i:host)=\"?([^;,\"]+)\"?"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L106
    Pattern.compile("(?i:proto)=\"?([^;,\"]+)\"?"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L108
    Pattern.compile("(?i:for)=\"?([^;,\"]+)\"?"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-web/src/main/java/org/springframework/web/util/UriComponents.java#L51
    Pattern.compile("\\{([^/]+?)}"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-test/src/main/java/org/springframework/test/context/util/TestContextResourceUtils.java#L50
    Pattern.compile(".*\\$\\{[^}]+}.*"),
    // https://github.com/ZhangZiJiang/spring/blob/2c976ba9d77701fdfcd6bebcfa10bef6f23ef6ac/spring-messaging/src/main/java/org/springframework/messaging/rsocket/MetadataEncoder.java#L52
    Pattern.compile("\\{(.+?)}"),
    // https://github.com/amit-agrawal10-git/market-data-collection-start-manager/blob/5221d30f0ee35c1685efeec5c1a8ffd7e914135e/src/main/java/com/github/amag/dataanalytics/actions/task/URLBuilderTaskAction.java#L35
    Pattern.compile("<[\\w/]+>"),
    // https://github.com/yangmbin/JDB.SmartPayment.App.Android/blob/f020ed4f1132016ee8cfedce9e6519654fe0bc43/NetClient/src/main/java/com/guinong/net/BaseUtils.java#L20
    Pattern.compile("^((13[0-9])|(15[^4,\\D])|(177)|(18[0,5-9]))\\d{8}$"),
    // https://github.com/yangmbin/JDB.SmartPayment.App.Android/blob/f020ed4f1132016ee8cfedce9e6519654fe0bc43/NetClient/src/main/java/com/guinong/net/BaseUtils.java#L27
    Pattern.compile("^(\\+?86)\\d{11}$"),
    // https://github.com/yangmbin/JDB.SmartPayment.App.Android/blob/f020ed4f1132016ee8cfedce9e6519654fe0bc43/NetClient/src/main/java/com/guinong/net/BaseUtils.java#L46
    Pattern.compile("^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-docs/src/main/java/org/apache/flink/docs/configuration/ConfigOptionsDocGenerator.java#L79
    Pattern.compile("(?<className>(?<classPrefix>[a-zA-Z]*)(?:Options|Config|Parameters))(?:\\.java)?"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/core/fs/Path.java#L65
    Pattern.compile("/\\p{Alpha}+:/"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/api/java/typeutils/TupleTypeInfoBase.java#L36
    Pattern.compile("(f?)([0-9]+)"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/api/java/typeutils/TupleTypeInfoBase.java#L37
    Pattern.compile("((f?)([0-9]+))(\\.(.+))?"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/api/java/typeutils/RowTypeInfo.java#L54
    Pattern.compile("([\\p{L}_\\$][\\p{L}\\p{Digit}_\\$]*|[0-9]+)(\\.(.+))?"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/api/java/typeutils/PojoTypeInfo.java#L64
    Pattern.compile("([\\p{L}_\\$][\\p{L}\\p{Digit}_\\$]*)(\\.(.+))?"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-core/src/main/java/org/apache/flink/api/common/operators/Keys.java#L197
    Pattern.compile("[\\.]?(\\*|\\_)$"),
    // https://github.com/aixuebo/flink-1.6/blob/030813b9cda5d0aba779182e2fa11df19f317dfe/flink-contrib/flink-connector-wikiedits/src/main/java/org/apache/flink/streaming/connectors/wikiedits/WikipediaEditEvent.java#L180
    Pattern.compile("\\[\\[(.*)\\]\\]\\s(.*)\\s(.*)\\s\\*\\s(.*)\\s\\*\\s\\(\\+?(.\\d*)\\)\\s(.*)"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/agent/src/share/classes/sun/jvm/hotspot/CommandProcessor.java#L427
    Pattern.compile("^(0x[0-9a-f]+)(/([0-9]*)([a-z]*))?$"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/agent/src/share/classes/sun/jvm/hotspot/CommandProcessor.java#L428
    Pattern.compile("^(0x[0-9a-f]+),(0x[0-9a-f]+)(/[a-z]*)?$"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/agent/src/share/classes/sun/jvm/hotspot/CommandProcessor.java#L1811
    Pattern.compile("((!\\*)|(!\\$)|(!!-?)|(!-?[0-9][0-9]*)|(![a-zA-Z][^ ]*))"),
    // https://github.com/xwiki/xwiki-platform/blob/dae81e6e137f8e774d4788ad741d9b62e15d79fa/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/web/TempResourceAction.java#L77
    Pattern.compile(".*?/temp/([^/]*+)/([^/]*+)/([^/]*+)/(.*+)"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/compiler/testlibrary/rtm/RTMLockingStatistics.java#L62
    Pattern.compile("# rtm lock aborts\\s+(?<type>[0-9]+):\\s(?<count>[0-9]+)"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/compiler/testlibrary/rtm/RTMLockingStatistics.java#L66
    Pattern.compile("(?<className>[^.\n]+)\\.(?<methodName>[^@\n]+)@(?<bci>[0-9]+)\n# rtm locks total \\(estimated\\):\\s*(?<totalLocks>[0-9]+)\n# rtm lock aborts\\s+:\\s*(?<totalAborts>[0-9]+)\n(?<abortStats>(# rtm lock aborts\\s+(?<type>[0-9]+):\\s(?<count>[0-9]+)\n)+)"),
    // https://github.com/Osvaldo-Gutierrez/BeeFRM-workspace/blob/f3527699e91bc274276adcdf8abaf1cda07bb714/BeeFRM/src/cl/bee/preptex/util/PrepTexStream.java#L37
    Pattern.compile("^[ ]*END", Pattern.CASE_INSENSITIVE),
    // https://github.com/Osvaldo-Gutierrez/BeeFRM-workspace/blob/f3527699e91bc274276adcdf8abaf1cda07bb714/BeeFRM/src/cl/bee/preptex/util/PrepTexStream.java#L40
    Pattern.compile("^[ ]*ELSE", Pattern.CASE_INSENSITIVE),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/tools/launcher/ExecutionEnvironment.java#L302
    Pattern.compile(".*jvisualvm.*|.*javaws.*|.*ControlPanel.*|.*java-rmi.cgi|.*jcontrol.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/tools/launcher/Arrrghs.java#L198
    Pattern.compile("\\s*argv\\[[0-9]*\\].*=.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/sun/tools/jstatd/JstatdTest.java#L67
    Pattern.compile("^\\d+\\s*.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/sun/security/krb5/auto/KDC.java#L1458
    Pattern.compile("(\\d+):(\\d+)(:(\\d+))?"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/sun/security/krb5/auto/KDC.java#L1479
    Pattern.compile("((\\d+)d)?\\s*((\\d+)h)?\\s*((\\d+)m)?\\s*((\\d+)s)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/com/sun/tools/example/debug/tty/VMConnection.java#L92
    Pattern.compile("(quote=[^,]+,)|(\\w+=)(((\"[^\"]*\")|('[^']*')|([^,'\"]+))+,)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/macosx/native/jobjc/src/generator/java/com/apple/internal/jobjc/generator/utils/StructOffsetResolver.java#L116
    Pattern.compile("^(.*) (.*):(\\d+).*$"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/macosx/native/jobjc/src/generator/java/com/apple/internal/jobjc/generator/utils/StructOffsetResolver.java#L131
    Pattern.compile(" (-?\\d+)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/macosx/native/jobjc/src/generator/java/com/apple/internal/jobjc/generator/Utils.java#L89
    Pattern.compile("\\~"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/macosx/native/jobjc/src/generator/java/com/apple/internal/jobjc/generator/Utils.java#L89
    Pattern.compile("\\#"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/make/src/classes/build/tools/tzdb/TzdbZoneRulesCompiler.java#L272
    Pattern.compile("(?i)(?<min>min)|(?<max>max)|(?<only>only)|(?<year>[0-9]+)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/make/src/classes/build/tools/tzdb/TzdbZoneRulesCompiler.java#L273
    Pattern.compile("(?i)(jan)|(feb)|(mar)|(apr)|(may)|(jun)|(jul)|(aug)|(sep)|(oct)|(nov)|(dec)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/make/src/classes/build/tools/tzdb/TzdbZoneRulesCompiler.java#L274
    Pattern.compile("(?i)(mon)|(tue)|(wed)|(thu)|(fri)|(sat)|(sun)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/make/src/classes/build/tools/tzdb/TzdbZoneRulesCompiler.java#L275
    Pattern.compile("(?<neg>-)?+(?<hour>[0-9]{1,2})(:(?<minute>[0-5][0-9]))?+(:(?<second>[0-5][0-9]))?+"),
    // https://github.com/Lylbp/java_model_simple/blob/93c1b8a607825048350916a543d581eb7a5d752e/src/main/java/com/lylbp/common/utils/FfmpegUtil.java#L151
    Pattern.compile("Duration: (.*?), start: (.*?), bitrate: (\\d*) kb\\/s"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/misc/Numbers.java#L58
    Pattern.compile("[0xX0-9a-fA-F]+"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L222
    Pattern.compile("rax|eax|ax|ah|al"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L225
    Pattern.compile("rbx|ebx|bx|bh|bl"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L228
    Pattern.compile("rcx|ecx|cx|ch|cl"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L231
    Pattern.compile("rdx|edx|dx|dh|dl"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L234
    Pattern.compile("rsi|esi|sil|si"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L237
    Pattern.compile("rdi|edi|dil|di"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L240
    Pattern.compile("rbp|ebp|bpl|bp"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L243
    Pattern.compile("rsp|esp|spl|sp"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L246
    Pattern.compile("r8b|r8d|r8w|r8l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L249
    Pattern.compile("r9b|r9d|r9w|r9l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L252
    Pattern.compile("r10b|r10d|r10w|r10l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L255
    Pattern.compile("r11b|r11d|r11w|r11l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L258
    Pattern.compile("r12b|r12d|r12w|r12l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L261
    Pattern.compile("r13b|r13d|r13w|r13l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L264
    Pattern.compile("r14b|r14d|r14w|r14l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L267
    Pattern.compile("r15b|r15d|r15w|r15l"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/registers/Registers.java#L270
    Pattern.compile("eiz"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/operand/OperandTranslator.java#L46
    Pattern.compile("byte|dword|qword|word"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/operand/OperandTranslator.java#L49
    Pattern.compile(".*\\[.*\\].*"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/operand/OperandTranslator.java#L52
    Pattern.compile("[0-9a-f]+ <.*>"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/operand/OperandTranslator.java#L55
    Pattern.compile("[a-zA-Z ]+:0x[0-9a-f]+"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/operand/OperandTranslator.java#L58
    Pattern.compile("[a-zA-Z0-9]+\\*[0x123456789abcdef]+"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/objparser/ObjParser.java#L264
    Pattern.compile("rep|repe|repne|repz|repnz|lock|o16"),
    // https://github.com/sunil-sopho/Tejas/blob/9f7b7e21d1fd013a7e6212c267c8d91263784879/Tejas/src/simulator/emulatorinterface/translator/x86/objparser/ObjParser.java#L351
    Pattern.compile("[0-9a-fA-F]+ <.*> [a-zA-Z]+.*"),
    // https://github.com/fulltimefarmer/JavaStudy/blob/a0fb62025c0f598429a44c9f550463fc5f9fe6cb/src/main/java/org/max/java/UnicodeUtil.java#L26
    Pattern.compile("&#\\d{5};"),
    // https://github.com/fulltimefarmer/JavaStudy/blob/a0fb62025c0f598429a44c9f550463fc5f9fe6cb/src/main/java/org/max/java/UnicodeUtil.java#L42
    Pattern.compile("&#x\\d{5};"),
    // https://github.com/charvolant/ala-name-matching-2/blob/ce4029d0f732f026bd979319308f4b0bb2a73372/bayesian-core/src/main/java/au/org/ala/bayesian/Identifiable.java#L26
    Pattern.compile("[\\p{L}_][\\p{L}\\p{Digit}:_\\-\\.]*"),
    // https://github.com/charvolant/ala-name-matching-2/blob/ce4029d0f732f026bd979319308f4b0bb2a73372/bayesian-core/src/main/java/au/org/ala/bayesian/Identifiable.java#L28
    Pattern.compile("[^\\p{L}\\p{Digit}:_\\-\\.]+"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/beans/XMLDecoder/8028054/Task.java#L79
    Pattern.compile("jar:file:(.*)!.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/com/sun/tools/attach/RunnerUtil.java#L159
    Pattern.compile("(\\w*)=([0-9]+)\\r?\\n"),
    // https://github.com/UNC-Libraries/Carolina-Digital-Repository/blob/ccecd0018fb963fd6e0761b8d409efc2a54da5e8/services-camel/src/main/java/edu/unc/lib/dl/services/camel/fulltext/FulltextProcessor.java#L65
    Pattern.compile("^(text/|application/pdf|application/msword|application/vnd\\.|application/rtf|application/powerpoint|application/postscript).*$"),
    // https://github.com/Codeforces/codeforces-commons/blob/ebd017cb21ce8543402502666f48a0c2370b65b8/code/src/main/java/com/codeforces/commons/text/Patterns.java#L12
    Pattern.compile("\\-"),
    // https://github.com/Codeforces/codeforces-commons/blob/ebd017cb21ce8543402502666f48a0c2370b65b8/code/src/main/java/com/codeforces/commons/text/Patterns.java#L22
    Pattern.compile("\\r\\n"),
    // https://github.com/Codeforces/codeforces-commons/blob/ebd017cb21ce8543402502666f48a0c2370b65b8/code/src/main/java/com/codeforces/commons/text/Patterns.java#L32
    Pattern.compile("[^{}]*public\\s+(final)?\\s*class\\s+(\\w+).*", Pattern.DOTALL),
    // https://github.com/Codeforces/codeforces-commons/blob/ebd017cb21ce8543402502666f48a0c2370b65b8/code/src/main/java/com/codeforces/commons/text/Patterns.java#L33
    Pattern.compile("[^{}]*object\\s+(\\w+).*", Pattern.DOTALL),
    // https://github.com/doeni98/POO/blob/8d2468ddf1f153ee7e76521d9ab556414fb268b4/lab09/src/chess/views/console/ConsoleView.java#L33
    Pattern.compile("[a-h][1-8][a-h][1-8]"),
    // https://github.com/arnavs-0/PocDoc-Public/blob/ed67f220a67f2d797299e9d400422ce4b5f3b4bb/app/src/main/java/com/arnav/pocdoc/MedicalIdEdit.java#L112
    Pattern.compile("^[0-9]+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/code1990/java/blob/932e745653fbd0af7f4ee82502cdb6f5138d655d/src/main/java/util/RegexUtil.java#L29
    Pattern.compile(".*[a-zA-z].*"),
    // https://github.com/code1990/java/blob/932e745653fbd0af7f4ee82502cdb6f5138d655d/src/main/java/util/RegexUtil.java#L43
    Pattern.compile("[a-z||A-Z]"),
    // https://github.com/smathog/Hyperskill-Projects/blob/be6a747afc3060a6d8ae9865e0225b3d786a416a/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%208/Calculator.java#L11
    Pattern.compile("-|\\+|=|\\*|\\/"),
    // https://github.com/smathog/Hyperskill-Projects/blob/be6a747afc3060a6d8ae9865e0225b3d786a416a/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%208/Calculator.java#L12
    Pattern.compile("\\(|\\)"),
    // https://github.com/smathog/Hyperskill-Projects/blob/be6a747afc3060a6d8ae9865e0225b3d786a416a/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%208/Calculator.java#L13
    Pattern.compile("\\*{2,}|\\/{2,}"),
    // https://github.com/smathog/Hyperskill-Projects/blob/be6a747afc3060a6d8ae9865e0225b3d786a416a/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%208/Calculator.java#L14
    Pattern.compile("/[a-zA-Z]+"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/tools/ci/java-ci-tools/src/main/java/org/apache/flink/tools/ci/licensecheck/LicenseChecker.java#L76
    Pattern.compile(".*:shade \\((shade-flink|default)\\) @ ([^ _]+)(_[0-9.]+)? --.*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/tools/ci/java-ci-tools/src/main/java/org/apache/flink/tools/ci/licensecheck/LicenseChecker.java#L77
    Pattern.compile(".*Including ([^:]+):([^:]+):jar:([^ ]+) in the shaded jar"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/tools/ci/java-ci-tools/src/main/java/org/apache/flink/tools/ci/licensecheck/LicenseChecker.java#L80
    Pattern.compile(".*maven-dependency-plugin:[^:]+:copy \\([^)]+\\) @ ([^ _]+)(_[0-9.]+)? --.*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/tools/ci/java-ci-tools/src/main/java/org/apache/flink/tools/ci/licensecheck/LicenseChecker.java#L81
    Pattern.compile(".*Configured Artifact: ([^:]+):([^:]+):([^:]+):jar.*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/tools/ci/java-ci-tools/src/main/java/org/apache/flink/tools/ci/licensecheck/LicenseChecker.java#L87
    Pattern.compile("- ([^ :]+):([^:]+):([^ ]+)($| )|.*bundles \"([^:]+):([^:]+):([^\"]+)\".*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn/src/main/java/org/apache/flink/yarn/YarnLocalResourceDescriptor.java#L43
    Pattern.compile("YarnLocalResourceDescriptor\\{key=(\\S+), path=(\\S+), size=([\\d]+), modificationTime=([\\d]+), visibility=(\\S+), type=(\\S+)}"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L128
    Pattern.compile("akka\\.remote\\.RemoteTransportExceptionNoStackTrace"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L131
    Pattern.compile("java\\.lang\\.InterruptedException"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L133
    Pattern.compile("Remote connection to \\[null\\] failed with java.net.ConnectException: Connection refused"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L134
    Pattern.compile("Remote connection to \\[null\\] failed with java.nio.channels.NotYetConnectedException"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L135
    Pattern.compile("java\\.io\\.IOException: Connection reset by peer"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L136
    Pattern.compile("Association with remote system \\[akka.tcp://flink@[^]]+\\] has failed, address is now gated for \\[50\\] ms. Reason: \\[Association failed with \\[akka.tcp://flink@[^]]+\\]\\] Caused by: \\[java.net.ConnectException: Connection refused: [^]]+\\]"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L142
    Pattern.compile("java\\.util\\.concurrent\\.RejectedExecutionException: Worker has already been shutdown"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L144
    Pattern.compile("org\\.apache\\.flink.util\\.FlinkException: Stopping JobMaster"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L145
    Pattern.compile("org\\.apache\\.flink.util\\.FlinkException: JobManager is shutting down\\."),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L146
    Pattern.compile("lost the leadership."),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YarnTestBase.java#L148
    Pattern.compile("akka.remote.transport.netty.NettyTransport.*Remote connection to \\[[^]]+\\] failed with java.io.IOException: Broken pipe"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-yarn-tests/src/test/java/org/apache/flink/yarn/YARNSessionCapacitySchedulerITCase.java#L306
    Pattern.compile("JobManager Web Interface: http://([a-zA-Z0-9.-]+):([0-9]+)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-tests/src/test/java/org/apache/flink/test/recovery/BatchFineGrainedRecoveryITCase.java#L132
    Pattern.compile("MapPartition \\(Test partition mapper (\\d+)\\)"),
    // https://github.com/ylyu4/6290/blob/1650ca1ea531fe114ed1229ab31951eb20ccfa9e/app/src/main/java/com/example/finalproject/utils/TextUtil.java#L22
    Pattern.compile("[0-9a-zA-Z]{1,}"),
    // https://github.com/nickg2/nickgeyser/blob/3e28bb0711b7bab6df9418c3e9edd2656bc174aa/connector/src/main/java/org/geysermc/connector/network/translators/collision/translators/SnowCollision.java#L41
    Pattern.compile("layers=([0-8])"),
    // https://github.com/nickg2/nickgeyser/blob/3e28bb0711b7bab6df9418c3e9edd2656bc174aa/connector/src/main/java/org/geysermc/connector/network/translators/chat/MinecraftTranslationRegistry.java#L55
    Pattern.compile("%s"),
    // https://github.com/nickg2/nickgeyser/blob/3e28bb0711b7bab6df9418c3e9edd2656bc174aa/connector/src/main/java/org/geysermc/connector/network/translators/chat/MinecraftTranslationRegistry.java#L65
    Pattern.compile("%([0-9]+)\\$s"),
    // https://github.com/nickg2/nickgeyser/blob/3e28bb0711b7bab6df9418c3e9edd2656bc174aa/connector/src/main/java/org/geysermc/connector/entity/living/merchant/VillagerEntity.java#L125
    Pattern.compile("facing=([a-z]+)"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/database/variable/EvalJavaBsh.java#L63
    Pattern.compile("@(\\w+)"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/database/variable/EvalJavaBsh.java#L64
    Pattern.compile("(P|PAR)\\(\"(\\w+)\"\\)"),
    // https://github.com/Jacttis/BaseDeDatosApp/blob/df0dff6b0cdf9eef0249e200399b8eb9acb23281/src/VentanaInspector/VistaInspector.java#L188
    Pattern.compile("[A-Z]{3}[0-9]{3}"),
    // https://github.com/RockLee444/ProyectoFinal/blob/a5e3503e3d50db3af7a4188fe210c1b538f98819/src/controllers/AutomataController.java#L171
    Pattern.compile("(^[a-zA-Z_]+[\\w]*|[\\d]+)$"),
    // https://github.com/RockLee444/ProyectoFinal/blob/a5e3503e3d50db3af7a4188fe210c1b538f98819/src/controllers/AutomataController.java#L201
    Pattern.compile("([\\w])$"),
    // https://github.com/RockLee444/ProyectoFinal/blob/a5e3503e3d50db3af7a4188fe210c1b538f98819/src/controllers/AutomataController.java#L395
    Pattern.compile("(^[a-zA-Z_]+[\\w]*|[\\d]+)$|([\\\"][\\w|\\W]*[\\\"])$"),
    // https://github.com/huanglong0438/practice/blob/2cbad05bcc8280c4a380581ecb9794368f959212/src/main/java/practice/practice.java#L747
    Pattern.compile("^(?i)(http://|https://){0,1}"),
    // https://github.com/huanglong0438/practice/blob/2cbad05bcc8280c4a380581ecb9794368f959212/src/main/java/practice/practice.java#L757
    Pattern.compile("([^/]*/){3,}..*"),
    // https://github.com/huanglong0438/practice/blob/2cbad05bcc8280c4a380581ecb9794368f959212/src/main/java/practice/practice.java#L768
    Pattern.compile("[^/]*/[^/]*/..*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-kubernetes/src/main/java/org/apache/flink/kubernetes/KubernetesWorkerNode.java#L39
    Pattern.compile("\\S+-taskmanager-([\\d]+)-([\\d]+)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-metrics-reporter-prometheus-test/src/test/java/org/apache/flink/metrics/prometheus/tests/PrometheusReporterEndToEndITCase.java#L120
    Pattern.compile(".*Started PrometheusReporter HTTP server on port ([0-9]+).*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/test/java/org/apache/flink/tests/util/util/FileUtilsTest.java#L58
    Pattern.compile("line1"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/test/java/org/apache/flink/tests/util/util/FileUtilsTest.java#L65
    Pattern.compile("line(.*)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/test/java/org/apache/flink/tests/util/util/FileUtilsTest.java#L72
    Pattern.compile("line2"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/main/java/org/apache/flink/tests/util/flink/FlinkDistribution.java#L71
    Pattern.compile("(rootLogger.level =).*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/main/java/org/apache/flink/tests/util/flink/FlinkDistribution.java#L171
    Pattern.compile("Job has been submitted with JobID (.*)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/main/java/org/apache/flink/tests/util/flink/FlinkDistribution.java#L172
    Pattern.compile("Job with JobID (.*) has finished."),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/main/java/org/apache/flink/tests/util/cache/TravisDownloadCache.java#L37
    Pattern.compile("(?<hash>.*)__(?<build>.*)__(?<name>.*)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-end-to-end-tests/flink-end-to-end-tests-common/src/main/java/org/apache/flink/tests/util/cache/PersistingDownloadCache.java#L41
    Pattern.compile("(?<hash>.*)__(?<date>.*)__(?<name>.*)"),
    // https://github.com/bmTas/JRecord/blob/dc64fe201ff5f0a78091ee94369a69267c9b0cc3/Source/JRecord_Project/JRecord_Common/src/main/java/net/sf/JRecord/External/Def/DependingOn.java#L69
    Pattern.compile("\\sOF\\s", Pattern.CASE_INSENSITIVE),
    // https://github.com/xiaoshuwen0525/obd-scan/blob/674ee1d76fa7e2b10ff5996c4332559a89d06bda/obd-admin/src/main/java/com/ruoyi/web/controller/upload/service/impl/UploadServiceImpl.java#L630
    Pattern.compile("^[0-9]*[0-9][0-9]*$"),
    // https://github.com/entando/entando-plugin-jpseo/blob/a3b0792fac5b5f63aad8367f49a91d95dc7fe119/src/main/java/org/entando/entando/plugins/jpseo/web/page/validator/SeoPageValidator.java#L39
    Pattern.compile("([a-z0-9_])+"),
    // https://github.com/entando/entando-plugin-jpseo/blob/a3b0792fac5b5f63aad8367f49a91d95dc7fe119/src/main/java/org/entando/entando/plugins/jpseo/aps/system/services/controller/control/RequestValidator.java#L193
    Pattern.compile("^/page/(\\w+)((/\\w+)*)"),
    // https://github.com/MikitaBrodau/Java/blob/2a89abad8c99d299dacd2d44d33822e971b8aa84/strings/src/workingWithString/MostOfSpaceBetweenWords.java#L8
    Pattern.compile("(\\s+)"),
    // https://github.com/MikitaBrodau/Java/blob/2a89abad8c99d299dacd2d44d33822e971b8aa84/strings/src/workingWithString/LongestWord.java#L9
    Pattern.compile("(\\w+)"),
    // https://github.com/MikitaBrodau/Java/blob/2a89abad8c99d299dacd2d44d33822e971b8aa84/strings/src/workingWithString/AmountOfClause.java#L9
    Pattern.compile("([a-zA-Z][.]|[a-zA-Z][?]|[a-zA-Z][!])"),
    // https://github.com/MikitaBrodau/Java/blob/2a89abad8c99d299dacd2d44d33822e971b8aa84/strings/src/stringAsArray/DelSpace.java#L11
    Pattern.compile("\\s++"),
    // https://github.com/MikitaBrodau/Java/blob/2a89abad8c99d299dacd2d44d33822e971b8aa84/strings/src/stringAsArray/CamelCaseSnake_Case.java#L17
    Pattern.compile("\\p{javaUpperCase}"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/extraction/DumpLinkParser.java#L22
    Pattern.compile("([a-z\\-]+)\\:(.*)"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/extraction/DumpLinkParser.java#L33
    Pattern.compile("([^#|]+)(\\#([^|]+))?(\\|(.+))?"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/comparison/ConnectionSnippet.java#L24
    Pattern.compile("\\s*={2,}(.*?)={2,}(.*)"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/comparison/ConnectionSnippet.java#L25
    Pattern.compile("\\s*[*#]+(.*)"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/WikiPreprocessor.java#L47
    Pattern.compile("={2,}([^=]+)={2,}"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/WikiPreprocessor.java#L86
    Pattern.compile("(={2,})([^=]+)\\1"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/WikiPreprocessor.java#L111
    Pattern.compile("(\\{\\{|\\}\\})"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/WikiPreprocessor.java#L151
    Pattern.compile("(\\{\\||\\|\\})"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/WikiPreprocessor.java#L194
    Pattern.compile("(\\[\\[|\\]\\])"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/HtmlPreprocessor.java#L87
    Pattern.compile("<title([^>]*)>(.*?)</title>", Pattern.DOTALL),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/HtmlPreprocessor.java#L95
    Pattern.compile("<meta(.*?)/>", Pattern.DOTALL),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/annotation/preprocessing/HtmlPreprocessor.java#L112
    Pattern.compile("<a([^>]*)>(.*?)</a>", Pattern.DOTALL),
    // https://github.com/AndriyFrost/RegExrLab6/blob/f12c5a8cd317a9dd8e0940a585c67c517a43ad80/src/main/java/ua/lviv/iot/regular/expressions/ZipCodesRegularExpressions.java#L13
    Pattern.compile("\\b790+\\d{2}\\b"),
    // https://github.com/manjushadadi/Assignment/blob/bf672e3e63cdab78d0131f43af2ce5eca892d469/amountValidator/src/main/java/com/challenge/amountValidator/validator/AmountValidator.java#L24
    Pattern.compile("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"),
    // https://github.com/bewillcott/mdj-cli/blob/2dc460980a8564d6aadecee5782451238beeb4f3/src/main/java/com/bewsoftware/mdj/cli/Find.java#L134
    Pattern.compile("^(?<basename>.*?)(?:[.]\\w+)?$"),
    // https://github.com/bewillcott/mdj-cli/blob/2dc460980a8564d6aadecee5782451238beeb4f3/src/main/java/com/bewsoftware/mdj/cli/Cli.java#L70
    Pattern.compile("(?<!\\\\)(?:\\$\\{(?<group>\\w+)[.](?<key>\\w+)\\})"),
    // https://github.com/bewillcott/mdj-cli/blob/2dc460980a8564d6aadecee5782451238beeb4f3/src/main/java/com/bewsoftware/mdj/cli/Cli.java#L80
    Pattern.compile("\\A(?:@@@\\n(?<metablock>.*?)\\n@@@\\n)(?<body>.*)\\z", Pattern.DOTALL),
    // https://github.com/bewillcott/mdj-cli/blob/2dc460980a8564d6aadecee5782451238beeb4f3/src/main/java/com/bewsoftware/mdj/cli/Cli.java#L89
    Pattern.compile("^\\s*(?<key>\\w+)\\s*:\\s*(?<value>.*?)?\\s*?$", Pattern.MULTILINE),
    // https://github.com/bewillcott/mdj-cli/blob/2dc460980a8564d6aadecee5782451238beeb4f3/src/main/java/com/bewsoftware/mdj/cli/Cli.java#L106
    Pattern.compile("(?<=\\n)(?:@@@\\[(?<name>\\w+)\\]\\n(?<metablock>.*?)\\n@@@\\n)", Pattern.DOTALL),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/make/src/classes/build/tools/addjsum/AddJsum.java#L50
    Pattern.compile("# [0-9A-Fa-f]*"),
    // https://github.com/ehubin/SosBot/blob/ba35ea378a235c3e77188fc6d739b41d0190dec7/src/main/java/pingBot.java#L22
    Pattern.compile("(.*\\S)\\s+(\\d+.?\\d*)"),
    // https://github.com/caneleex/Spidey/blob/390a760323c237940dfeeb61a82714ea40f364a2/src/main/java/dev/mlnr/spidey/utils/Utils.java#L34
    Pattern.compile("(\\d{17,20})"),
    // https://github.com/caneleex/Spidey/blob/390a760323c237940dfeeb61a82714ea40f364a2/src/main/java/dev/mlnr/spidey/utils/Utils.java#L35
    Pattern.compile("\\S{2,32}#\\d{4}"),
    // https://github.com/caneleex/Spidey/blob/390a760323c237940dfeeb61a82714ea40f364a2/src/main/java/dev/mlnr/spidey/utils/Utils.java#L36
    Pattern.compile("[a-zA-Z0-9-_]+"),
    // https://github.com/claudiocosta49/RI_Assignments/blob/49a15547aef8ecb8776f2e80c2d39fdf80403f69/RI_assignment1/src/main/java/ImprovedTokenizer.java#L13
    Pattern.compile("^[a-z0-9]+(['\\@]?([a-z]){3,})+"),
    // https://github.com/jxtxzzw/jxtxzzw.github.io/blob/fb400e14768c236f19097ff684940896fd226a55/data/coding/HDU/2024.java#L10
    Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*"),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L278
    Pattern.compile("\u001B\\[[;\\d]*[ -/]*[@-~]"),
    // https://github.com/jenkinsZhou/SmartCity/blob/eb3578bebc2fee3242b0ad1c0d6598b605a0c4d9/app/src/main/java/com/tourcool/widget/webview/HtmlUtils.java#L56
    Pattern.compile("<img\\b[^>]*\\bsrc\\b\\s*=\\s*('|\")?([^'\"\n\r\f>]+(\\.jpg|\\.bmp|\\.eps|\\.gif|\\.mif|\\.miff|\\.png|\\.tif|\\.tiff|\\.svg|\\.wmf|\\.jpe|\\.jpeg|\\.dib|\\.ico|\\.tga|\\.cut|\\.pic|\\b)\\b)[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/SpineEventEngine/base/blob/97607048433aebdfa38e9cfe0c01ddfa6b19af80/base/src/main/java/io/spine/base/TestsProperty.java#L63
    Pattern.compile("\"' "),
    // https://github.com/Hossam01/Packing-App/blob/a515df59089dc5c1fdf01ea92ccb09ae38813c44/app/src/main/java/com/example/packingapp/Helper/Constant.java#L24
    Pattern.compile("[a-z ]"),
    // https://github.com/gridgain/gridgain/blob/63a6d942821727352577193611e1ddd95fdc4fda/modules/control-utility/src/test/java/org/apache/ignite/util/GridCommandHandlerTest.java#L1291
    Pattern.compile("[\\W_]+"),
    // https://github.com/gridgain/gridgain/blob/63a6d942821727352577193611e1ddd95fdc4fda/modules/control-utility/src/test/java/org/apache/ignite/util/GridCommandHandlerTest.java#L2322
    Pattern.compile(".*VisorIdleVerifyDumpTask successfully written output to '(.*)'"),
    // https://github.com/FearNixx/vigilant-bans/blob/712bc26d669efff578a325d548375574d97b71e0/src/main/java/de/fearnixx/lolbanpick/config/ConfigKeys.java#L20
    Pattern.compile("rgb\\((\\d+),(\\d+),(\\d+)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/sjavac/Main.java#L502
    Pattern.compile("[a-zA-Z_]{1}[a-zA-Z0-9_]*(\\.[a-zA-Z_]{1}[a-zA-Z0-9_]*)*(\\.\\*)?+"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/sjavac/Main.java#L517
    Pattern.compile("\\.[a-zA-Z_]{1}[a-zA-Z0-9_]*=[a-z_]{1}[a-z0-9_]*(\\.[a-z_]{1}[a-z0-9_]*)*(\\.[a-zA-Z_]{1}[a-zA-Z0-9_]*)(,.*)?"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/sjavac/Main.java#L532
    Pattern.compile("\\.[a-zA-Z_]{1}[a-zA-Z0-9_]*"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/sjavac/Main.java#L548
    Pattern.compile("\\*?(.+\\\\)*.+"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/sjavac/Main.java#L551
    Pattern.compile("\\*?(.+/)*.+"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/javadoc/ParamTagImpl.java#L46
    Pattern.compile("<([^<>]+)>"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/javadoc/DocImpl.java#L223
    Pattern.compile("(?is).*<body\\b[^>]*>(.*)</body\\b.*"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/javadoc/DocImpl.java#L228
    Pattern.compile("(?is).*<body\\b.*"),
    // https://github.com/apromore/ApromoreCore/blob/4641931c6f5f89a8845835a4e9ae22612db9a8e2/Apromore-Custom-Plugins/CSVImporter-Logic/src/test/java/org/apromore/service/csvimporter/services/utilities/TestUtilities.java#L74
    Pattern.compile("(?:Z|[+-](?:2[0-3]|[01][0-9]):[0-5][0-9])"),
    // https://github.com/lets-mica/mica/blob/a326af70e0c6ebfd9c8db2fbdf9e25504b30bde3/mica-core/src/main/java/net/dreamlu/mica/core/utils/StringUtil.java#L44
    Pattern.compile("[`'\"|/,;()-+*%#·•�　\\s]"),
    // https://github.com/daiyi-x/java_note/blob/39dacc4dc2ab91d4b9c282fdb279e742e3843bb9/src/main/java/cases/BytesCase.java#L14
    Pattern.compile("连我激活码：([0-9]{6})"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L154
    Pattern.compile("((路|街|巷)[0-9]+号([0-9A-Z一二三四五六七八九十][\\#\\-一－—/\\\\]|楼)?)?([0-9A-Z一二三四五六七八九十]+(栋|橦|幢|座|号楼|号|楼|\\#楼?)){0,1}([一二三四五六七八九十东西南北甲乙丙0-9]+([\\#\\-一－—/\\\\]|单元|门|梯|层|座|组))?([0-9]+([\\#\\-一－—/\\\\]|室|房|层|楼|号|户)?)?([0-9]+号?)?"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L165
    Pattern.compile("((路|街|巷)[0-9]+号)?([0-9A-Z一二三四五六七八九十]+(栋|橦|幢|座|号楼|号|\\#楼?)){0,1}([一二三四五六七八九十东西南北甲乙丙0-9]+(单元|门|梯|层|座))?([0-9]+(室|房)?)?"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L172
    Pattern.compile("(栋|幢|橦|号楼|号|\\#|\\#楼|单元|室|房|门)+"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L179
    Pattern.compile("[A-Za-z0-9]+([\\#\\-一－/\\\\]+[A-Za-z0-9]+)+"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L186
    Pattern.compile("[0-9]+(组|通道)[A-Z0-9\\-一]+号?"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L191
    Pattern.compile("(?<bracket>([\\(（\\{\\<〈\\[【「][^\\)）\\}\\>〉\\]】」]*[\\)）\\}\\>〉\\]】」]))"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L196
    Pattern.compile("^(?<road>([\u4e00-\u9fa5]{2,6}(路|街坊|街|道|大街|大道)))(?<ex>[甲乙丙丁])?(?<roadnum>[0-9０１２３４５６７８９一二三四五六七八九十]+(号院|号楼|号大院|号|號|巷|弄|院|区|条|\\#院|\\#))?"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L200
    Pattern.compile("[0-9A-Z一二三四五六七八九十]+(栋|橦|幢|座|号楼|号|\\#楼?)"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L204
    Pattern.compile("^((?<z>[\u4e00-\u9fa5]{2,2}(镇|乡))(?<c>[\u4e00-\u9fa5]{1,3}村)?)"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L205
    Pattern.compile("^((?<z>[\u4e00-\u9fa5]{1,3}镇)?(?<x>[\u4e00-\u9fa5]{1,3}乡)?(?<c>[\u4e00-\u9fa5]{1,3}村(?!(村|委|公路|(东|西|南|北)?(大街|大道|路|街))))?)"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L206
    Pattern.compile("^(?<c>[\u4e00-\u9fa5]{1,3}村(?!(村|委|公路|(东|西|南|北)?(大街|大道|路|街))))?"),
    // https://github.com/YangYunhe/JavaAccumulation/blob/659775ecdd841010ff6c4a97ff9b0d953802c80b/cpca/src/main/java/core/impl/DefaultAddressInterpreter.java#L626
    Pattern.compile("[ \\da-zA-Z\r\n\t,，。·.．;；:：、！@$%*^`~=+&'\"|_\\-\\/]"),
    // https://github.com/sunzhen623896834/rocketmq-externals/blob/5cbec0cd1c80c5f2ffb374ae53bb0a012d719ce4/rocketmq-jms/core/src/main/java/org/apache/rocketmq/jms/domain/JmsBaseConnectionMetaData.java#L46
    Pattern.compile("(\\d+)\\.(\\d+).*"),
    // https://github.com/sunzhen623896834/rocketmq-externals/blob/5cbec0cd1c80c5f2ffb374ae53bb0a012d719ce4/rocketmq-connect/rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/PluginUtils.java#L42
    Pattern.compile("^(?:java|javax\\.accessibility|javax\\.activation|javax\\.activity|javax\\.annotation|javax\\.batch\\.api|javax\\.batch\\.operations|javax\\.batch\\.runtime|javax\\.crypto|javax\\.decorator|javax\\.ejb|javax\\.el|javax\\.enterprise\\.concurrent|javax\\.enterprise\\.context|javax\\.enterprise\\.context\\.spi|javax\\.enterprise\\.deploy\\.model|javax\\.enterprise\\.deploy\\.shared|javax\\.enterprise\\.deploy\\.spi|javax\\.enterprise\\.event|javax\\.enterprise\\.inject|javax\\.enterprise\\.inject\\.spi|javax\\.enterprise\\.util|javax\\.faces|javax\\.imageio|javax\\.inject|javax\\.interceptor|javax\\.jms|javax\\.json|javax\\.jws|javax\\.lang\\.model|javax\\.mail|javax\\.management|javax\\.management\\.j2ee|javax\\.naming|javax\\.net|javax\\.persistence|javax\\.print|javax\\.resource|javax\\.rmi|javax\\.script|javax\\.security\\.auth|javax\\.security\\.auth\\.message|javax\\.security\\.cert|javax\\.security\\.jacc|javax\\.security\\.sasl|javax\\.servlet|javax\\.sound\\.midi|javax\\.sound\\.sampled|javax\\.sql|javax\\.swing|javax\\.tools|javax\\.transaction|javax\\.validation|javax\\.websocket|javax\\.ws\\.rs|javax\\.xml|javax\\.xml\\.bind|javax\\.xml\\.registry|javax\\.xml\\.rpc|javax\\.xml\\.soap|javax\\.xml\\.ws|org\\.ietf\\.jgss|org\\.omg\\.CORBA|org\\.omg\\.CosNaming|org\\.omg\\.Dynamic|org\\.omg\\.DynamicAny|org\\.omg\\.IOP|org\\.omg\\.Messaging|org\\.omg\\.PortableInterceptor|org\\.omg\\.PortableServer|org\\.omg\\.SendingContext|org\\.omg\\.stub\\.java\\.rmi|org\\.w3c\\.dom|org\\.xml\\.sax)\\..*$|io\\.openmessaging\\.KeyValue"),
    // https://github.com/sunzhen623896834/rocketmq-externals/blob/5cbec0cd1c80c5f2ffb374ae53bb0a012d719ce4/rocketmq-connect-mongo/src/main/java/org/apache/connect/mongo/replicator/ReplicaSetManager.java#L31
    Pattern.compile("((([^=]+)[=])?(([^/]+)\\/))?(.+)"),
    // https://github.com/sunzhen623896834/rocketmq-externals/blob/5cbec0cd1c80c5f2ffb374ae53bb0a012d719ce4/rocketmq-connect-jdbc/src/main/java/org/apache/rocketmq/connect/jdbc/schema/column/ColumnParser.java#L94
    Pattern.compile("(enum|set)\\((.*)\\)"),
    // https://github.com/sevagrbnv/Na_proverku/blob/f4772e00fb92152c9dd6b3ab9301c9cce691d584/src/Lab11/Task2.java#L81
    Pattern.compile("[a-zA-Z0-9._-]*$"),
    // https://github.com/Ju-eun/foodinfo/blob/3f334ce34da9620232521933a6e4b614bb5053c7/foodinfo/app/src/main/java/com/project/foodinfo/Sign/SignActivity.java#L337
    Pattern.compile("(^.*(?=.{6,100})(?=.*[0-9])(?=.*[a-zA-Z]).*$)"),
    // https://github.com/Ju-eun/foodinfo/blob/3f334ce34da9620232521933a6e4b614bb5053c7/foodinfo/app/src/main/java/com/project/foodinfo/Sign/SignActivity.java#L340
    Pattern.compile(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-datamigration/v1beta1/1.31.0/com/google/api/services/datamigration/v1beta1/CloudDatabaseMigrationService.java#L719
    Pattern.compile("^projects/[^/]+/locations/[^/]+/connectionProfiles/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-datamigration/v1beta1/1.31.0/com/google/api/services/datamigration/v1beta1/CloudDatabaseMigrationService.java#L2147
    Pattern.compile("^projects/[^/]+/locations/[^/]+/migrationJobs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudshell/v1alpha1/1.31.0/com/google/api/services/cloudshell/v1alpha1/CloudShell.java#L201
    Pattern.compile("^users/[^/]+/environments/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudshell/v1alpha1/1.31.0/com/google/api/services/cloudshell/v1alpha1/CloudShell.java#L949
    Pattern.compile("^users/[^/]+/environments/[^/]+/publicKeys/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L180
    Pattern.compile("^devices/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L1183
    Pattern.compile("^devices/[^/]+/deviceUsers/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L2259
    Pattern.compile("^devices/[^/]+/deviceUsers$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L2714
    Pattern.compile("^devices/[^/]+/deviceUsers/[^/]+/clientStates/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L3262
    Pattern.compile("^groups/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/d771555d4de11c07d4e1064a5a722c947f423c77/clients/google-api-services-cloudidentity/v1beta1/1.31.0/com/google/api/services/cloudidentity/v1beta1/CloudIdentity.java#L4629
    Pattern.compile("^groups/[^/]+/memberships/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudtrace/v2beta1/1.31.0/com/google/api/services/cloudtrace/v2beta1/CloudTrace.java#L345
    Pattern.compile("^projects/[^/]+/traceSinks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudtrace/v2/1.31.0/com/google/api/services/cloudtrace/v2/CloudTrace.java#L360
    Pattern.compile("^projects/[^/]+/traces/[^/]+/spans/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudsearch/v1/1.31.0/com/google/api/services/cloudsearch/v1/CloudSearch.java#L219
    Pattern.compile("^datasources/[^/]+/items/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudsearch/v1/1.31.0/com/google/api/services/cloudsearch/v1/CloudSearch.java#L374
    Pattern.compile("^datasources/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudsearch/v1/1.31.0/com/google/api/services/cloudsearch/v1/CloudSearch.java#L770
    Pattern.compile("^identitysources/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudsearch/v1/1.31.0/com/google/api/services/cloudsearch/v1/CloudSearch.java#L5293
    Pattern.compile("^searchapplications/[^/]+$"),
    // https://github.com/GRAFO-URJC/WebGE/blob/441504b96a21b3f9eef32728d537935eb6eb8ff7/src/main/java/com/gramevapp/web/controller/ExperimentController.java#L814
    Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}"),
    // https://github.com/GRAFO-URJC/WebGE/blob/441504b96a21b3f9eef32728d537935eb6eb8ff7/src/main/java/com/gramevapp/web/controller/ExperimentController.java#L821
    Pattern.compile("[0-9]{1,3}% performed.*$"),
    // https://github.com/GRAFO-URJC/WebGE/blob/441504b96a21b3f9eef32728d537935eb6eb8ff7/src/main/java/com/gramevapp/web/controller/ExperimentController.java#L832
    Pattern.compile("Thread-[0-9]+"),
    // https://github.com/GRAFO-URJC/WebGE/blob/441504b96a21b3f9eef32728d537935eb6eb8ff7/src/main/java/com/gramevapp/web/controller/ExperimentController.java#L842
    Pattern.compile("2m---\u001B\\[0;39m \u001B\\[2m\\[     Thread-[0-9]+]\u001B\\[0;39m \u001B\\[36mj.c.algorithm.ga.SimpleGeneticAlgorithm \u001B\\[0;39m \u001B\\[2m:\u001B\\[0;39m "),
    // https://github.com/apache/olingo-odata2/blob/77b42d00354a91990d788d5906c1e7131b02a7de/odata2-lib/odata-core/src/main/java/org/apache/olingo/odata2/core/uri/UriParserImpl.java#L81
    Pattern.compile("(?:([^.()]+)\\.)?([^.()]+)(?:\\((.+)\\)|(\\(\\)))?"),
    // https://github.com/apache/olingo-odata2/blob/77b42d00354a91990d788d5906c1e7131b02a7de/odata2-lib/odata-core/src/main/java/org/apache/olingo/odata2/core/uri/UriParserImpl.java#L82
    Pattern.compile("([^()]+)(?:\\((.+)\\)|(\\(\\)))?"),
    // https://github.com/apache/olingo-odata2/blob/77b42d00354a91990d788d5906c1e7131b02a7de/odata2-lib/odata-core/src/main/java/org/apache/olingo/odata2/core/uri/UriParserImpl.java#L83
    Pattern.compile("(?:([^=]+)=)?([^=]+)"),
    // https://github.com/languagetool-org/languagetool/blob/1aa832cd4f44ba1445b38820db775a6fd0b711e3/languagetool-language-modules/es/src/main/java/org/languagetool/tokenizers/es/SpanishWordTokenizer.java#L40
    Pattern.compile("([\\d])\\.([\\d])", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/languagetool-org/languagetool/blob/1aa832cd4f44ba1445b38820db775a6fd0b711e3/languagetool-language-modules/es/src/main/java/org/languagetool/tokenizers/es/SpanishWordTokenizer.java#L42
    Pattern.compile("([\\d]),([\\d])", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/languagetool-org/languagetool/blob/1aa832cd4f44ba1445b38820db775a6fd0b711e3/languagetool-language-modules/es/src/main/java/org/languagetool/tokenizers/es/SpanishWordTokenizer.java#L44
    Pattern.compile("\\b([\\d]+)\\.(º|ª|o|a|er|os|as)\\b", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/gregorian/February29thMatcher.java#L10
    Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/RangedDateMatcher.java#L8
    Pattern.compile("^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/FormattedDateMatcher.java#L8
    Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/regexp/EscapingCharsUnitTest.java#L17
    Pattern.compile("foo."),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/regexp/EscapingCharsUnitTest.java#L25
    Pattern.compile("foo\\."),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/java/regex/RegexUnitTest.java#L16
    Pattern.compile("foo"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/java/regex/RegexUnitTest.java#L382
    Pattern.compile("(.*)"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/java/regex/RegexUnitTest.java#L390
    Pattern.compile("(.*)", Pattern.DOTALL),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/java/regex/RegexUnitTest.java#L398
    Pattern.compile("(?s)(.*)"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/test/java/com/baeldung/java/regex/RegexUnitTest.java#L442
    Pattern.compile("dog"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/main/java/com/baeldung/passwordhashing/PBKDF2Hasher.java#L40
    Pattern.compile("\\$31\\$(\\d\\d?)\\$(.{43})"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/core-java/src/main/java/com/baeldung/console/ConsoleScannerClass.java#L66
    Pattern.compile("www.baeldung.com"),
    // https://github.com/jjrim/MyFirstAndroidProject/blob/1eef64ef45c4ff8a946aab9f8386f580aa466939/app/src/main/java/ca/bcit/groupproject/FindLocationActivity.java#L47
    Pattern.compile("/^[A-Za-z]\\d[A-Za-z][ -]?\\d[A-Za-z]\\d$/"),
    // https://github.com/ist-dresden/composum-assets/blob/ed051d746a9f8e7414c11aa197b9d4e057dde17d/commons/bundle/src/main/java/com/composum/assets/commons/AssetsConstants.java#L48
    Pattern.compile("^image/.+$"),
    // https://github.com/lyzh1688/tuozuo/blob/564a62a3b7bb089a528e4717153008031eb09005/backend/tz-tavern/tavern-app/tavern-organ-biz/src/main/java/com/tuozuo/tavern/organ/biz/service/impl/CompanyNameServiceImpl.java#L239
    Pattern.compile("(101)|(102)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/doclets/internal/toolkit/Configuration.java#L902
    Pattern.compile("\\{([012])\\}"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/doclets/formats/html/HtmlDocletWriter.java#L1285
    Pattern.compile(".*[&<>].*"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/doclets/formats/html/HtmlDocletWriter.java#L1616
    Pattern.compile("/.."),
    // https://github.com/Energyxxer/Guardian/blob/8c625775ac186528d4992fa5f70c0678b9018d85/guardian/src/main/java/com/energyxxer/guardian/ui/commodoreresources/DefinitionPacks.java#L20
    Pattern.compile("minecraft_j_1_(\\d+)(?:_(\\d+))?"),
    // https://github.com/Energyxxer/Guardian/blob/8c625775ac186528d4992fa5f70c0678b9018d85/guardian/src/main/java/com/energyxxer/guardian/ui/commodoreresources/DefinitionPacks.java#L21
    Pattern.compile("minecraft_b_1_(\\d+)(?:_(\\d+))?"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/runtime/7194254/Test7194254.java#L77
    Pattern.compile("\\\"Priority=(\\d+)\\\".* prio=(\\d+).*"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/gc/survivorAlignment/SurvivorAlignmentTestMain.java#L60
    Pattern.compile("(?<size>[0-9]+)(?<multiplier>[GMKgmk])?"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/gc/g1/TestEagerReclaimHumongousRegionsWithRefs.java#L98
    Pattern.compile("Full GC"),
    // https://github.com/jfdoyle3/HackerRank/blob/077244a5f70d7dc61193ab0327c3fe04dd67231b/java/30DaysOfCoding/Day28_RegEx_Patterns_and_Intro_to_Databases.java#L19
    Pattern.compile("^[a-zA-Z0-9+_.-]+@gmail.com"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/pipe/SelectiveSGML2TokenSequence.java#L32
    Pattern.compile("</?([^>]*)>"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/pipe/CharSubsequence.java#L30
    Pattern.compile("\\n\\n(.*)\\z", Pattern.DOTALL),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/pipe/CharSequenceRemoveUUEncodedBlocks.java#L23
    Pattern.compile("^M.{60}$"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/util/ModelReader.java#L220
    Pattern.compile("[+-]?\\d+(?:\\.\\d+)?(E[+-]\\d+)?"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/test/TestGenericAcrfData2TokenSequence.java#L62
    Pattern.compile("^$"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/learning/templates/SimilarTokensTemplate.java#L191
    Pattern.compile("WORD=(.*)"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/learning/templates/SimilarTokensTemplate.java#L192
    Pattern.compile("W=(.*)"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/learning/templates/SimilarTokensTemplate.java#L193
    Pattern.compile(".*(?:@-?\\d+|_&_).*"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/learning/templates/SimilarTokensTemplate.java#L265
    Pattern.compile("[A-Z][A-Za-z]*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/TestEditLog.java#L1073
    Pattern.compile("\\[(\\d+),(\\d+)?\\]"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/TestAuditLogs.java#L90
    Pattern.compile("allowed=.*?\\sugi=.*?\\sip=/\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\scmd=.*?\\ssrc=.*?\\sdst=null\\sperm=.*?"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/TestAuditLogs.java#L96
    Pattern.compile(".*allowed=true.*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/TestAuditLogs.java#L98
    Pattern.compile(".*cmd=open.*proto=webhdfs.*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestFetchImage.java#L43
    Pattern.compile("fsimage_(\\d+)"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestDFSUpgrade.java#L433
    Pattern.compile("failed in 1 storage"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/util/MD5FileUtils.java#L50
    Pattern.compile("([0-9a-f]{32}) [ \\*](.+)"),
    // https://github.com/vespa-engine/vespa/blob/371e9b50738dafc28c7ab2aea6495d26ecd6c0c9/config-model/src/main/java/com/yahoo/vespa/model/container/xml/ContainerModelBuilder.java#L540
    Pattern.compile("-XX:[-+]Use.+GC"),
    // https://github.com/vespa-engine/vespa/blob/371e9b50738dafc28c7ab2aea6495d26ecd6c0c9/config-model/src/main/java/com/yahoo/vespa/model/container/xml/ContainerModelBuilder.java#L541
    Pattern.compile("-XX:[-+]*CMS"),
    // https://github.com/reaktivity/command-log.java/blob/2930abe7a7b2ae1ea857b062393d9175f69363ce/src/main/java/org/reaktivity/command/log/internal/LogCommand.java#L104
    Pattern.compile("streams(?:-(?<option>[a-z]+))?"),
    // https://github.com/Samuel-Sierra/examenrsa/blob/44aac152a9fd00096b32e5e4838bbf183f5ec8c7/src/rsa/Validar.java#L20
    Pattern.compile("^[a-zA-Z\\s]*$"),
    // https://github.com/hagergroup/sweet-okhttp-cache-android/blob/96c99b8fd945e6bd06ad61b505697bc1aa4223d6/lib/src/main/apollo-http-cache/com/apollographql/apollo/cache/http/internal/DiskLruCache.java#L96
    Pattern.compile("[a-z0-9_-]{1,120}"),
    // https://github.com/garry2361323/freenow-task/blob/4a18dc50c7763233962cceafa7f4b51f2e485235/src/test/java/com/freenow/task/utils/Patterns.java#L17
    Pattern.compile("^(?![._\\-+])[a-zA-Z0-9_.+-]*[a-zA-Z0-9]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]*[a-zA-Z0-9]+$"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/unsafe/src/main/java/org/apache/spark/unsafe/types/CalendarInterval.java#L54
    Pattern.compile("^(?:['|\"])?([+|-])?(\\d+)-(\\d+)(?:['|\"])?$"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/unsafe/src/main/java/org/apache/spark/unsafe/types/CalendarInterval.java#L57
    Pattern.compile("^(?:['|\"])?([+|-])?(\\d+) (\\d+):(\\d+):(\\d+)(\\.(\\d+))?(?:['|\"])?$"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/unsafe/src/main/java/org/apache/spark/unsafe/types/CalendarInterval.java#L59
    Pattern.compile("^(?:['|\"])?(.*?)(?:['|\"])?$"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/network/common/src/main/java/org/apache/spark/network/util/JavaUtils.java#L169
    Pattern.compile("(-?[0-9]+)([a-z]+)?"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/network/common/src/main/java/org/apache/spark/network/util/JavaUtils.java#L218
    Pattern.compile("([0-9]+)([a-z]+)?"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/network/common/src/main/java/org/apache/spark/network/util/JavaUtils.java#L219
    Pattern.compile("([0-9]+\\.[0-9]+)([a-z]+)?"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/launcher/src/main/java/org/apache/spark/launcher/SparkSubmitOptionParser.java#L139
    Pattern.compile("(--[^=]+)=(.+)"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/launcher/src/main/java/org/apache/spark/launcher/SparkClassCommandBuilder.java#L83
    Pattern.compile("spark-tools_.*\\.jar"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/launcher/src/main/java/org/apache/spark/launcher/AbstractCommandBuilder.java#L331
    Pattern.compile("spark-assembly.*hadoop.*\\.jar"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/security/krb5/Config.java#L309
    Pattern.compile("[\\s,]+"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/security/ec/CurveDB.java#L59
    Pattern.compile(",|\\[|\\]"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/net/ftp/impl/FtpClient.java#L382
    Pattern.compile("150 Opening .*\\((\\d+) bytes\\)."),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/net/ftp/impl/FtpClient.java#L592
    Pattern.compile("^229 .* \\(\\|\\|\\|(\\d+)\\|\\)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/net/ftp/impl/FtpClient.java#L629
    Pattern.compile("227 .* \\(?(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)?"),
    // https://github.com/burningwave/core/blob/75875cfcc30f91366ea41bf43704d75396149189/src/main/java/org/burningwave/core/io/PathHelperImpl.java#L39
    Pattern.compile("\\/\\/(.*)\\/\\/(children|allChildren):(.*)"),
    // https://github.com/burningwave/core/blob/75875cfcc30f91366ea41bf43704d75396149189/src/main/java/org/burningwave/core/io/PathHelperImpl.java#L198
    Pattern.compile("[\\$\\{\\}]"),
    // https://github.com/aldo-manco-jr/shak-android/blob/09be463e05e842a7f239987d550a03de789b2f9e/app/src/main/java/org/aldofrank/shak/authentication/controllers/SignupFragment.java#L178
    Pattern.compile("@(.*?)."),
    // https://github.com/Anatdub/sample/blob/2af6eb9d31cccbbf8080f43d50250615bc0a8985/Practicum/src/first/Test.java#L14
    Pattern.compile("(cat)"),
    // https://github.com/Anatdub/sample/blob/2af6eb9d31cccbbf8080f43d50250615bc0a8985/DemoJunit/src/main/java/ru/center/DemoJunit/App2.java#L20
    Pattern.compile("([a-zA-Z]*)([0-9]*)"),
    // https://github.com/cerijerome/ceri/blob/8814cc57e3c5b1839405087162a78948c8bd3588/ceri-serial/src/main/java/ceri/serial/javax/SerialPort.java#L27
    Pattern.compile("(?i)(?:device not configured|\\bioctl\\b)"),
    // https://github.com/Neizmyasa/SpringNetworkChat/blob/349156c335c00a0f1922013fabb9e84d367a53a0/lesson-01-network-chat/src/main/java/ru/geekbrains/client/MessagePatterns.java#L27
    Pattern.compile("^/w (\\w+) (.+)", Pattern.MULTILINE),
    // https://github.com/Jaimedsf/curso/blob/8c33c2ec8b63a8c51562cfdb0ea12b47913f00ae/plugins/cordova-plugin-x-socialsharing/src/android/nl/xservices/plugins/SocialSharing.java#L141
    Pattern.compile(".*\\<[^>]+>.*", Pattern.DOTALL),
    // https://github.com/Jaimedsf/curso/blob/8c33c2ec8b63a8c51562cfdb0ea12b47913f00ae/plugins/cordova-plugin-x-socialsharing/src/android/nl/xservices/plugins/SocialSharing.java#L425
    Pattern.compile("[^a-zA-Z0-9._-]"),
    // https://github.com/Jaimedsf/curso/blob/8c33c2ec8b63a8c51562cfdb0ea12b47913f00ae/plugins/cordova-plugin-x-socialsharing/src/android/nl/xservices/plugins/SocialSharing.java#L431
    Pattern.compile("filename=([^;]+)"),
    // https://github.com/Jaimedsf/curso/blob/8c33c2ec8b63a8c51562cfdb0ea12b47913f00ae/plugins/cordova-plugin-x-socialsharing/src/android/nl/xservices/plugins/SocialSharing.java#L743
    Pattern.compile(".*/([^?#]+)?"),
    // https://github.com/Jaimedsf/curso/blob/8c33c2ec8b63a8c51562cfdb0ea12b47913f00ae/plugins/cordova-plugin-x-socialsharing/src/android/nl/xservices/plugins/SocialSharing.java#L800
    Pattern.compile("[:\\\\/*?|<> ]"),
    // https://github.com/K2NIO/gocypher-cybench-intellij/blob/995a44e1522c1d856429909828ebb39d50619168/src/main/java/com/gocypher/cybench/toolWindow/CyBenchExplorerToolWindow.java#L125
    Pattern.compile("(?<rName>.*)-(?<timestamp>[0-9]*)-(?<score>[0-9.,]*).cybench"),
    // https://github.com/K2NIO/gocypher-cybench-intellij/blob/995a44e1522c1d856429909828ebb39d50619168/src/main/java/com/gocypher/cybench/runConfiguration/CyBenchMessageHandler.java#L58
    Pattern.compile("Computed hash (.*) for class (.*), classloader (.*)"),
    // https://github.com/K2NIO/gocypher-cybench-intellij/blob/995a44e1522c1d856429909828ebb39d50619168/src/main/java/com/gocypher/cybench/runConfiguration/CyBenchMessageHandler.java#L65
    Pattern.compile("^# Benchmark: (.*)"),
    // https://github.com/K2NIO/gocypher-cybench-intellij/blob/995a44e1522c1d856429909828ebb39d50619168/src/main/java/com/gocypher/cybench/runConfiguration/CyBenchMessageHandler.java#L72
    Pattern.compile("Finished CyBench benchmarking"),
    // https://github.com/hp849215170/CustomerData/blob/c512b6689a8e96ffb604d25f036e4354225eb4a3/app/src/main/java/m/hp/customerdata/activity/AddUserActivity.java#L164
    Pattern.compile("^[A-Z]"),
    // https://github.com/hapifhir/org.hl7.fhir.core/blob/7e5a670846186ced8faedb5ad8d3c411194521b3/org.hl7.fhir.r5/src/main/java/org/hl7/fhir/r5/utils/client/ResourceAddress.java#L65
    Pattern.compile("(.*)(/)([a-zA-Z0-9]*)(/)([a-z0-9\\-\\.]{1,64})(/_history/)([a-z0-9\\-\\.]{1,64})$"),
    // https://github.com/entitystream/identiza/blob/5581b6ccb173ddd5d46ced86f12d02ede5aeffb2/identiza/src/main/java/com/entitystream/identiza/entity/resolve/match/Indexable.java#L291
    Pattern.compile("^\\w.*"),
    // https://github.com/entitystream/identiza/blob/5581b6ccb173ddd5d46ced86f12d02ede5aeffb2/identiza/src/main/java/com/entitystream/identiza/entity/resolve/match/Indexable.java#L303
    Pattern.compile("\\/|\\^|\\?|\\*"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L17
    Pattern.compile("abcDeee"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L23
    Pattern.compile("^abcDeee"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L24
    Pattern.compile("^abcDeeeF12Ghhiiiiiijkl99z"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L26
    Pattern.compile("jkl99z$"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L35
    Pattern.compile("[abcdef34678]"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L39
    Pattern.compile("[\\d]"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L40
    Pattern.compile("[\\D]"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L56
    Pattern.compile("^abcDe{3}"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L59
    Pattern.compile("abcDe{2,5}"),
    // https://github.com/Rafal-Stefanski/Git/blob/4742a924478aca32212f7863592c95fd9de082a0/src/main/java/udemy/java_programming_masterclass/section17/quantifiers_pattern_matcher_classes/Main.java#L69
    Pattern.compile(".*<h2>.*"),
    // https://github.com/NinzaRJ01/HackerRankSolved/blob/e04c8893346788ca36cdd222f52d612bd0e6c73e/JavaSolved/024JavaRegex2/Solution.java#L9
    Pattern.compile("\\b([a-zA-Z0-9]+)(\\b\\W+\\1\\b)*", Pattern.CASE_INSENSITIVE),
    // https://github.com/echothreellc/echothree/blob/064cf4a1160cfe7e6616eecbf5c1020f4e40debb/src/java/com/echothree/util/server/persistence/Session.java#L52
    Pattern.compile("_PK_"),
    // https://github.com/echothreellc/echothree/blob/064cf4a1160cfe7e6616eecbf5c1020f4e40debb/src/java/com/echothree/util/server/persistence/Session.java#L53
    Pattern.compile("_ALL_"),
    // https://github.com/echothreellc/echothree/blob/064cf4a1160cfe7e6616eecbf5c1020f4e40debb/src/java/com/echothree/util/server/persistence/Session.java#L54
    Pattern.compile("_LIMIT_"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/zhihu/android/library/netprobe/internal/p1644a/PingProcessCheckCmd.java#L185
    Pattern.compile("((?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))(?![\\d])", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/zhihu/android/library/netprobe/internal/p1644a/PingProcessCheckCmd.java#L186
    Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/zhihu/android/kmarket/kmbutton/KmButton.java#L57
    Pattern.compile("[￥¥\\\\$+\\-×/0-9.‌]+"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/zhihu/android/kmarket/kmbutton/KmButton.java#L60
    Pattern.compile("\\[([^]]+)]"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/zhihu/android/comment/editor/p1446a/p1447a/CommentATagHandler.java#L21
    Pattern.compile("<a (.*?)href=\"(.*?)\"(.*?)>(.*?)</a>"),
    // https://github.com/apache/accumulo/blob/68acf9f101efeaf3a612b39e898a3a58090470fa/start/src/main/java/org/apache/accumulo/start/classloader/AccumuloClassLoader.java#L110
    Pattern.compile("\\$[A-Za-z][a-zA-Z0-9_]*"),
    // https://github.com/apache/accumulo/blob/68acf9f101efeaf3a612b39e898a3a58090470fa/core/src/main/java/org/apache/accumulo/core/conf/PropertyType.java#L199
    Pattern.compile("[^\\d]*$"),
    // https://github.com/mappadi/test/blob/c8b6d203afc839429c45bab579f8dfb26cc12f71/src/main/java/com/business/zee/ZeeBusinessLogic.java#L537
    Pattern.compile("Based on your current location, your content language is (\\w+)  and  (\\w+)"),
    // https://github.com/mappadi/test/blob/c8b6d203afc839429c45bab579f8dfb26cc12f71/src/main/java/com/business/zee/ZeeBusinessLogic.java#L934
    Pattern.compile("(\\d)"),
    // https://github.com/mappadi/test/blob/c8b6d203afc839429c45bab579f8dfb26cc12f71/src/main/java/com/business/zee/ZeeBusinessLogic.java#L1675
    Pattern.compile("videoQuality(.*)"),
    // https://github.com/HGUISEL/DAISE/blob/fa77ce86abcd6ce38d258d08a475efa8603585d8/src/main/java/edu/handong/csee/isel/online/OnlineWeka.java#L34
    Pattern.compile(".+/(\\w+)-data"),
    // https://github.com/HGUISEL/DAISE/blob/fa77ce86abcd6ce38d258d08a475efa8603585d8/src/main/java/edu/handong/csee/isel/online/OnlinePBDP.java#L21
    Pattern.compile("'(\\d\\d\\d\\d-\\d\\d-\\d\\d\\s\\d\\d:\\d\\d:\\d\\d)'"),
    // https://github.com/HGUISEL/DAISE/blob/fa77ce86abcd6ce38d258d08a475efa8603585d8/src/main/java/edu/handong/csee/isel/online/OnlinePBDP.java#L24
    Pattern.compile("@attribute\\sKey\\s\\{([^,]+)"),
    // https://github.com/HGUISEL/DAISE/blob/fa77ce86abcd6ce38d258d08a475efa8603585d8/src/main/java/edu/handong/csee/isel/online/OnlinePBDP.java#L27
    Pattern.compile("@attribute @@class@@ \\{\\w+,(\\w+)\\}"),
    // https://github.com/HGUISEL/DAISE/blob/fa77ce86abcd6ce38d258d08a475efa8603585d8/src/main/java/edu/handong/csee/isel/online/OnlineMain.java#L952
    Pattern.compile("(.+)/(.+).arff"),
    // https://github.com/amasterenko/job4j_grabber/blob/c17ab038f796bae94b3afc25a50a9539802ba327/src/main/java/ru/job4j/grabber/SqlRuParse.java#L44
    Pattern.compile("[\\w|А-Яа-я][^&]*"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/URLUtil.java#L392
    Pattern.compile("attachment;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L144
    Pattern.compile("[^,*\u2022\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]+(?=[,*\u2022\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L157
    Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L166
    Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+of[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+states[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+of[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+mariana[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+carolina)|(nd|north[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+dakota)|(ne|nebraska)|(nh|new[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+hampshire)|(nj|new[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+jersey)|(nm|new[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+mexico)|(nv|nevada)|(ny|new[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+rico)|(pw|palau)|(ri|rhode[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+island)|(sc|south[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+carolina)|(sd|south[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+virginia)|(wy|wyoming))(?=[,*\u2022\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L229
    Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*\u2022\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L256
    Pattern.compile("([0-9]+)(st|nd|rd|th)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/webkit/FindAddress.java#L259
    Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*\u2022\u0009\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\u000C\r\u0085\u2028\u2029]|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L38
    Pattern.compile("((aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(biz|b[abdefghijmnorstvwyz])|(cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(edu|e[cegrstu])|f[ijkmor]|(gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(info|int|i[delmnoqrst])|(jobs|j[emop])|k[eghimnprwyz]|l[abcikrstuvy]|(mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(name|net|n[acefgilopruz])|(org|om)|(pro|p[aefghklmnrstwy])|qa|r[eosuw]|s[abcdeghijklmnortuvyz]|(tel|travel|t[cdfghjklmnoprtvwz])|u[agksyz]|v[aceginu]|w[fs]|(\u03b4\u03bf\u03ba\u03b9\u03bc\u03ae|\u0438\u0441\u043f\u044b\u0442\u0430\u043d\u0438\u0435|\u0440\u0444|\u0441\u0440\u0431|\u05d8\u05e2\u05e1\u05d8|\u0622\u0632\u0645\u0627\u06cc\u0634\u06cc|\u0625\u062e\u062a\u0628\u0627\u0631|\u0627\u0644\u0627\u0631\u062f\u0646|\u0627\u0644\u062c\u0632\u0627\u0626\u0631|\u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629|\u0627\u0644\u0645\u063a\u0631\u0628|\u0627\u0645\u0627\u0631\u0627\u062a|\u0628\u06be\u0627\u0631\u062a|\u062a\u0648\u0646\u0633|\u0633\u0648\u0631\u064a\u0629|\u0641\u0644\u0633\u0637\u064a\u0646|\u0642\u0637\u0631|\u0645\u0635\u0631|\u092a\u0930\u0940\u0915\u094d\u0937\u093e|\u092d\u093e\u0930\u0924|\u09ad\u09be\u09b0\u09a4|\u0a2d\u0a3e\u0a30\u0a24|\u0aad\u0abe\u0ab0\u0aa4|\u0b87\u0ba8\u0bcd\u0ba4\u0bbf\u0baf\u0bbe|\u0b87\u0bb2\u0b99\u0bcd\u0b95\u0bc8|\u0b9a\u0bbf\u0b99\u0bcd\u0b95\u0baa\u0bcd\u0baa\u0bc2\u0bb0\u0bcd|\u0baa\u0bb0\u0bbf\u0b9f\u0bcd\u0b9a\u0bc8|\u0c2d\u0c3e\u0c30\u0c24\u0c4d|\u0dbd\u0d82\u0d9a\u0dcf|\u0e44\u0e17\u0e22|\u30c6\u30b9\u30c8|\u4e2d\u56fd|\u4e2d\u570b|\u53f0\u6e7e|\u53f0\u7063|\u65b0\u52a0\u5761|\u6d4b\u8bd5|\u6e2c\u8a66|\u9999\u6e2f|\ud14c\uc2a4\ud2b8|\ud55c\uad6d|xn\\-\\-0zwm56d|xn\\-\\-11b5bs3a9aj6g|xn\\-\\-3e0b707e|xn\\-\\-45brj9c|xn\\-\\-80akhbyknj4f|xn\\-\\-90a3ac|xn\\-\\-9t4b11yi5a|xn\\-\\-clchc0ea0b2g2a9gcd|xn\\-\\-deba0ad|xn\\-\\-fiqs8s|xn\\-\\-fiqz9s|xn\\-\\-fpcrj9c3d|xn\\-\\-fzc2c9e2c|xn\\-\\-g6w251d|xn\\-\\-gecrj9c|xn\\-\\-h2brj9c|xn\\-\\-hgbk6aj7f53bba|xn\\-\\-hlcj6aya9esc7a|xn\\-\\-j6w193g|xn\\-\\-jxalpdlp|xn\\-\\-kgbechtv|xn\\-\\-kprw13d|xn\\-\\-kpry57d|xn\\-\\-lgbbat1ad8j|xn\\-\\-mgbaam7a8h|xn\\-\\-mgbayh7gpa|xn\\-\\-mgbbh1a71e|xn\\-\\-mgbc0a9azcg|xn\\-\\-mgberp4a5d4ar|xn\\-\\-o3cw4h|xn\\-\\-ogbpf8fl|xn\\-\\-p1ai|xn\\-\\-pgbs0dh|xn\\-\\-s9brj9c|xn\\-\\-wgbh1c|xn\\-\\-wgbl6a|xn\\-\\-xkc2al3hye2a|xn\\-\\-xkc2dl3a5ee0h|xn\\-\\-yfro4i67o|xn\\-\\-ygbi2ammx|xn\\-\\-zckzah|xxx)|y[et]|z[amw])"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L247
    Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L301
    Pattern.compile("(([a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]_\\-]{0,61}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L323
    Pattern.compile("(((?:(?i:http|https|rtsp)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]_\\-]{0,61}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L396
    Pattern.compile("(((?:\\b|$|^)(?:(?:(?i:http|https|rtsp)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)(?:(?:(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]_\\-]{0,61}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]){0,1}(?:\\.(?=\\S))?)+|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))?(?:\\:\\d{1,5})?)(?:[/\\?](?:(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))|((?:\\b|$|^)(?<!:\\/\\/)((?:(?:(?:(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]_\\-]{0,61}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]){0,1}\\.)+(?:(?:(?:aaa|aarp|abb|abbott|abogado|academy|accenture|accountant|accountants|aco|active|actor|ads|adult|aeg|aero|afl|agency|aig|airforce|airtel|allfinanz|alsace|amica|amsterdam|android|apartments|app|apple|aquarelle|aramco|archi|army|arpa|arte|asia|associates|attorney|auction|audio|auto|autos|axa|azure|a[cdefgilmoqrstuwxz])|(?:band|bank|bar|barcelona|barclaycard|barclays|bargains|bauhaus|bayern|bbc|bbva|bcn|beats|beer|bentley|berlin|best|bet|bharti|bible|bid|bike|bing|bingo|bio|biz|black|blackfriday|bloomberg|blue|bms|bmw|bnl|bnpparibas|boats|bom|bond|boo|boots|boutique|bradesco|bridgestone|broadway|broker|brother|brussels|budapest|build|builders|business|buzz|bzh|b[abdefghijmnorstvwyz])|(?:cab|cafe|cal|camera|camp|cancerresearch|canon|capetown|capital|car|caravan|cards|care|career|careers|cars|cartier|casa|cash|casino|cat|catering|cba|cbn|ceb|center|ceo|cern|cfa|cfd|chanel|channel|chat|cheap|chloe|christmas|chrome|church|cipriani|cisco|citic|city|cityeats|claims|cleaning|click|clinic|clothing|cloud|club|clubmed|coach|codes|coffee|college|cologne|com|commbank|community|company|computer|comsec|condos|construction|consulting|contractors|cooking|cool|coop|corsica|country|coupons|courses|credit|creditcard|creditunion|cricket|crown|crs|cruises|csc|cuisinella|cymru|cyou|c[acdfghiklmnoruvwxyz])|(?:dabur|dad|dance|date|dating|datsun|day|dclk|deals|degree|delivery|dell|delta|democrat|dental|dentist|desi|design|dev|diamonds|diet|digital|direct|directory|discount|dnp|docs|dog|doha|domains|doosan|download|drive|durban|dvag|d[ejkmoz])|(?:earth|eat|edu|education|email|emerck|energy|engineer|engineering|enterprises|epson|equipment|erni|esq|estate|eurovision|eus|events|everbank|exchange|expert|exposed|express|e[cegrstu])|(?:fage|fail|fairwinds|faith|family|fan|fans|farm|fashion|feedback|ferrero|film|final|finance|financial|firmdale|fish|fishing|fit|fitness|flights|florist|flowers|flsmidth|fly|foo|football|forex|forsale|forum|foundation|frl|frogans|fund|furniture|futbol|fyi|f[ijkmor])|(?:gal|gallery|game|garden|gbiz|gdn|gea|gent|genting|ggee|gift|gifts|gives|giving|glass|gle|global|globo|gmail|gmo|gmx|gold|goldpoint|golf|goo|goog|google|gop|gov|grainger|graphics|gratis|green|gripe|group|gucci|guge|guide|guitars|guru|g[abdefghilmnpqrstuwy])|(?:hamburg|hangout|haus|healthcare|help|here|hermes|hiphop|hitachi|hiv|hockey|holdings|holiday|homedepot|homes|honda|horse|host|hosting|hoteles|hotmail|house|how|hsbc|hyundai|h[kmnrtu])|(?:ibm|icbc|ice|icu|ifm|iinet|immo|immobilien|industries|infiniti|info|ing|ink|institute|insure|int|international|investments|ipiranga|irish|ist|istanbul|itau|iwc|i[delmnoqrst])|(?:jaguar|java|jcb|jetzt|jewelry|jlc|jll|jobs|joburg|jprs|juegos|j[emop])|(?:kaufen|kddi|kia|kim|kinder|kitchen|kiwi|koeln|komatsu|krd|kred|kyoto|k[eghimnprwyz])|(?:lacaixa|lancaster|land|landrover|lasalle|lat|latrobe|law|lawyer|lds|lease|leclerc|legal|lexus|lgbt|liaison|lidl|life|lifestyle|lighting|limited|limo|linde|link|live|lixil|loan|loans|lol|london|lotte|lotto|love|ltd|ltda|lupin|luxe|luxury|l[abcikrstuvy])|(?:madrid|maif|maison|man|management|mango|market|marketing|markets|marriott|mba|media|meet|melbourne|meme|memorial|men|menu|meo|miami|microsoft|mil|mini|mma|mobi|moda|moe|moi|mom|monash|money|montblanc|mormon|mortgage|moscow|motorcycles|mov|movie|movistar|mtn|mtpc|mtr|museum|mutuelle|m[acdeghklmnopqrstuvwxyz])|(?:nadex|nagoya|name|navy|nec|net|netbank|network|neustar|new|news|nexus|ngo|nhk|nico|ninja|nissan|nokia|nra|nrw|ntt|nyc|n[acefgilopruz])|(?:obi|office|okinawa|omega|one|ong|onl|online|ooo|oracle|orange|org|organic|osaka|otsuka|ovh|om)|(?:page|panerai|paris|partners|parts|party|pet|pharmacy|philips|photo|photography|photos|physio|piaget|pics|pictet|pictures|ping|pink|pizza|place|play|playstation|plumbing|plus|pohl|poker|porn|post|praxi|press|pro|prod|productions|prof|properties|property|protection|pub|p[aefghklmnrstwy])|(?:qpon|quebec|qa)|(?:racing|realtor|realty|recipes|red|redstone|rehab|reise|reisen|reit|ren|rent|rentals|repair|report|republican|rest|restaurant|review|reviews|rich|ricoh|rio|rip|rocher|rocks|rodeo|rsvp|ruhr|run|rwe|ryukyu|r[eosuw])|(?:saarland|sakura|sale|samsung|sandvik|sandvikcoromant|sanofi|sap|sapo|sarl|saxo|sbs|sca|scb|schmidt|scholarships|school|schule|schwarz|science|scor|scot|seat|security|seek|sener|services|seven|sew|sex|sexy|shiksha|shoes|show|shriram|singles|site|ski|sky|skype|sncf|soccer|social|software|sohu|solar|solutions|sony|soy|space|spiegel|spreadbetting|srl|stada|starhub|statoil|stc|stcgroup|stockholm|studio|study|style|sucks|supplies|supply|support|surf|surgery|suzuki|swatch|swiss|sydney|systems|s[abcdeghijklmnortuvxyz])|(?:tab|taipei|tatamotors|tatar|tattoo|tax|taxi|team|tech|technology|tel|telefonica|temasek|tennis|thd|theater|theatre|tickets|tienda|tips|tires|tirol|today|tokyo|tools|top|toray|toshiba|tours|town|toyota|toys|trade|trading|training|travel|trust|tui|t[cdfghjklmnortvwz])|(?:ubs|university|uno|uol|u[agksyz])|(?:vacations|vana|vegas|ventures|versicherung|vet|viajes|video|villas|vin|virgin|vision|vista|vistaprint|viva|vlaanderen|vodka|vote|voting|voto|voyage|v[aceginu])|(?:wales|walter|wang|watch|webcam|website|wed|wedding|weir|whoswho|wien|wiki|williamhill|win|windows|wine|wme|work|works|world|wtc|wtf|w[fs])|(?:\u03b5\u03bb|\u0431\u0435\u043b|\u0434\u0435\u0442\u0438|\u043a\u043e\u043c|\u043c\u043a\u0434|\u043c\u043e\u043d|\u043c\u043e\u0441\u043a\u0432\u0430|\u043e\u043d\u043b\u0430\u0439\u043d|\u043e\u0440\u0433|\u0440\u0443\u0441|\u0440\u0444|\u0441\u0430\u0439\u0442|\u0441\u0440\u0431|\u0443\u043a\u0440|\u049b\u0430\u0437|\u0570\u0561\u0575|\u05e7\u05d5\u05dd|\u0627\u0631\u0627\u0645\u0643\u0648|\u0627\u0644\u0627\u0631\u062f\u0646|\u0627\u0644\u062c\u0632\u0627\u0626\u0631|\u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629|\u0627\u0644\u0645\u063a\u0631\u0628|\u0627\u0645\u0627\u0631\u0627\u062a|\u0627\u06cc\u0631\u0627\u0646|\u0628\u0627\u0632\u0627\u0631|\u0628\u06be\u0627\u0631\u062a|\u062a\u0648\u0646\u0633|\u0633\u0648\u062f\u0627\u0646|\u0633\u0648\u0631\u064a\u0629|\u0634\u0628\u0643\u0629|\u0639\u0631\u0627\u0642|\u0639\u0645\u0627\u0646|\u0641\u0644\u0633\u0637\u064a\u0646|\u0642\u0637\u0631|\u0643\u0648\u0645|\u0645\u0635\u0631|\u0645\u0644\u064a\u0633\u064a\u0627|\u0645\u0648\u0642\u0639|\u0915\u0949\u092e|\u0928\u0947\u091f|\u092d\u093e\u0930\u0924|\u0938\u0902\u0917\u0920\u0928|\u09ad\u09be\u09b0\u09a4|\u0a2d\u0a3e\u0a30\u0a24|\u0aad\u0abe\u0ab0\u0aa4|\u0b87\u0ba8\u0bcd\u0ba4\u0bbf\u0baf\u0bbe|\u0b87\u0bb2\u0b99\u0bcd\u0b95\u0bc8|\u0b9a\u0bbf\u0b99\u0bcd\u0b95\u0baa\u0bcd\u0baa\u0bc2\u0bb0\u0bcd|\u0c2d\u0c3e\u0c30\u0c24\u0c4d|\u0dbd\u0d82\u0d9a\u0dcf|\u0e04\u0e2d\u0e21|\u0e44\u0e17\u0e22|\u10d2\u10d4|\u307f\u3093\u306a|\u30b0\u30fc\u30b0\u30eb|\u30b3\u30e0|\u4e16\u754c|\u4e2d\u4fe1|\u4e2d\u56fd|\u4e2d\u570b|\u4e2d\u6587\u7f51|\u4f01\u4e1a|\u4f5b\u5c71|\u4fe1\u606f|\u5065\u5eb7|\u516b\u5366|\u516c\u53f8|\u516c\u76ca|\u53f0\u6e7e|\u53f0\u7063|\u5546\u57ce|\u5546\u5e97|\u5546\u6807|\u5728\u7ebf|\u5927\u62ff|\u5a31\u4e50|\u5de5\u884c|\u5e7f\u4e1c|\u6148\u5584|\u6211\u7231\u4f60|\u624b\u673a|\u653f\u52a1|\u653f\u5e9c|\u65b0\u52a0\u5761|\u65b0\u95fb|\u65f6\u5c1a|\u673a\u6784|\u6de1\u9a6c\u9521|\u6e38\u620f|\u70b9\u770b|\u79fb\u52a8|\u7ec4\u7ec7\u673a\u6784|\u7f51\u5740|\u7f51\u5e97|\u7f51\u7edc|\u8c37\u6b4c|\u96c6\u56e2|\u98de\u5229\u6d66|\u9910\u5385|\u9999\u6e2f|\ub2f7\ub137|\ub2f7\ucef4|\uc0bc\uc131|\ud55c\uad6d|xbox|xerox|xin|xn\\-\\-11b4c3d|xn\\-\\-1qqw23a|xn\\-\\-30rr7y|xn\\-\\-3bst00m|xn\\-\\-3ds443g|xn\\-\\-3e0b707e|xn\\-\\-3pxu8k|xn\\-\\-42c2d9a|xn\\-\\-45brj9c|xn\\-\\-45q11c|xn\\-\\-4gbrim|xn\\-\\-55qw42g|xn\\-\\-55qx5d|xn\\-\\-6frz82g|xn\\-\\-6qq986b3xl|xn\\-\\-80adxhks|xn\\-\\-80ao21a|xn\\-\\-80asehdb|xn\\-\\-80aswg|xn\\-\\-90a3ac|xn\\-\\-90ais|xn\\-\\-9dbq2a|xn\\-\\-9et52u|xn\\-\\-b4w605ferd|xn\\-\\-c1avg|xn\\-\\-c2br7g|xn\\-\\-cg4bki|xn\\-\\-clchc0ea0b2g2a9gcd|xn\\-\\-czr694b|xn\\-\\-czrs0t|xn\\-\\-czru2d|xn\\-\\-d1acj3b|xn\\-\\-d1alf|xn\\-\\-efvy88h|xn\\-\\-estv75g|xn\\-\\-fhbei|xn\\-\\-fiq228c5hs|xn\\-\\-fiq64b|xn\\-\\-fiqs8s|xn\\-\\-fiqz9s|xn\\-\\-fjq720a|xn\\-\\-flw351e|xn\\-\\-fpcrj9c3d|xn\\-\\-fzc2c9e2c|xn\\-\\-gecrj9c|xn\\-\\-h2brj9c|xn\\-\\-hxt814e|xn\\-\\-i1b6b1a6a2e|xn\\-\\-imr513n|xn\\-\\-io0a7i|xn\\-\\-j1aef|xn\\-\\-j1amh|xn\\-\\-j6w193g|xn\\-\\-kcrx77d1x4a|xn\\-\\-kprw13d|xn\\-\\-kpry57d|xn\\-\\-kput3i|xn\\-\\-l1acc|xn\\-\\-lgbbat1ad8j|xn\\-\\-mgb9awbf|xn\\-\\-mgba3a3ejt|xn\\-\\-mgba3a4f16a|xn\\-\\-mgbaam7a8h|xn\\-\\-mgbab2bd|xn\\-\\-mgbayh7gpa|xn\\-\\-mgbbh1a71e|xn\\-\\-mgbc0a9azcg|xn\\-\\-mgberp4a5d4ar|xn\\-\\-mgbpl2fh|xn\\-\\-mgbtx2b|xn\\-\\-mgbx4cd0ab|xn\\-\\-mk1bu44c|xn\\-\\-mxtq1m|xn\\-\\-ngbc5azd|xn\\-\\-node|xn\\-\\-nqv7f|xn\\-\\-nqv7fs00ema|xn\\-\\-nyqy26a|xn\\-\\-o3cw4h|xn\\-\\-ogbpf8fl|xn\\-\\-p1acf|xn\\-\\-p1ai|xn\\-\\-pgbs0dh|xn\\-\\-pssy2u|xn\\-\\-q9jyb4c|xn\\-\\-qcka1pmc|xn\\-\\-qxam|xn\\-\\-rhqv96g|xn\\-\\-s9brj9c|xn\\-\\-ses554g|xn\\-\\-t60b56a|xn\\-\\-tckwe|xn\\-\\-unup4y|xn\\-\\-vermgensberater\\-ctb|xn\\-\\-vermgensberatung\\-pwb|xn\\-\\-vhquv|xn\\-\\-vuq861b|xn\\-\\-wgbh1c|xn\\-\\-wgbl6a|xn\\-\\-xhq521b|xn\\-\\-xkc2al3hye2a|xn\\-\\-xkc2dl3a5ee0h|xn\\-\\-y9a3aq|xn\\-\\-yfro4i67o|xn\\-\\-ygbi2ammx|xn\\-\\-zfr164b|xperia|xxx|xyz)|(?:yachts|yamaxun|yandex|yodobashi|yoga|yokohama|youtube|y[et])|(?:zara|zip|zone|zuerich|z[amw]))|xn\\-\\-[\\w\\-]{0,58}\\w))|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)(?:[/\\?](?:(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^)))"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L423
    Pattern.compile("((?:\\b|$|^)(?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]\\+\\-_%'](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]\\+\\-_%'\\.]{0,62}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]\\+\\-_%'])?@(?=.{1,255}(?:\\s|$|^))([a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]](?:[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]_\\-]{0,61}[a-zA-Z0-9[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC00-\uD8BF\uDFFD\uD8C0\uDC00-\uD8FF\uDFFD\uD900\uDC00-\uD93F\uDFFD\uD940\uDC00-\uD97F\uDFFD\uD980\uDC00-\uD9BF\uDFFD\uD9C0\uDC00-\uD9FF\uDFFD\uDA00\uDC00-\uDA3F\uDFFD\uDA40\uDC00-\uDA7F\uDFFD\uDA80\uDC00-\uDABF\uDFFD\uDAC0\uDC00-\uDAFF\uDFFD\uDB00\uDC00-\uDB3F\uDFFD\uDB44\uDC00-\uDB7F\uDFFD&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]]{2,63}))(?:\\b|$|^))"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L430
    Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/Patterns.java#L455
    Pattern.compile("(\\+[0-9]+[\\- \\.]*)?(\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.]+[0-9])"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/EventLog.java#L56
    Pattern.compile("^\\s*(#.*)?$"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/util/EventLog.java#L57
    Pattern.compile("^\\s*(\\d+)\\s+(\\w+)\\s*(\\(.*\\))?\\s*$"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/text/Html.java#L705
    Pattern.compile("(?:\\s+|\\A)text-align\\s*:\\s*(\\S*)\\b"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/text/Html.java#L713
    Pattern.compile("(?:\\s+|\\A)color\\s*:\\s*(\\S*)\\b"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/text/Html.java#L721
    Pattern.compile("(?:\\s+|\\A)background(?:-color)?\\s*:\\s*(\\S*)\\b"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/android/text/Html.java#L729
    Pattern.compile("(?:\\s+|\\A)text-decoration\\s*:\\s*(\\S*)\\b"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/DefaultPassConfig.java#L104
    Pattern.compile("^[a-zA-Z0-9$_]+$"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CompilerOptions.java#L1200
    Pattern.compile("^((.*/)?google3/)?((^/)?(blaze|bazel)-out/[^/]+/(bin/|(?=genfiles/)))?"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CommandLineRunner.java#L1093
    Pattern.compile(" *--([a-z0-9_]+)"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CommandLineRunner.java#L1061
    Pattern.compile("[-*\\`\\[\\]{}\\(\\)#+\\.!<>]"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CommandLineRunner.java#L1467
    Pattern.compile("(--?[a-zA-Z_]+)=(.*)", Pattern.DOTALL),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CommandLineRunner.java#L1468
    Pattern.compile("^['\"](.*)['\"]$"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/CheckJSDoc.java#L94
    Pattern.compile("(/|(\n[ \t]*))\\*[ \t]*@[a-zA-Z]+[ \t\n{]"),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/AllowlistWarningsGuard.java#L56
    Pattern.compile(":-?\\d+"),
    // https://github.com/Torben1977/PdfClown/blob/3aeda204a583049dfe42736cd31d2da842d68942/java/pdfclown.lib/src/org/pdfclown/objects/PdfName.java#L57
    Pattern.compile("#([\\da-fA-F]{2})"),
    // https://github.com/Torben1977/PdfClown/blob/3aeda204a583049dfe42736cd31d2da842d68942/java/pdfclown.lib/src/org/pdfclown/objects/PdfName.java#L58
    Pattern.compile("[\\s\\(\\)<>\\[\\]{}/%#]"),
    // https://github.com/Torben1977/PdfClown/blob/3aeda204a583049dfe42736cd31d2da842d68942/java/pdfclown.lib/src/org/pdfclown/documents/contents/fonts/PfbParser.java#L63
    Pattern.compile("(\\S+)\\s+(.+)"),
    // https://github.com/Torben1977/PdfClown/blob/3aeda204a583049dfe42736cd31d2da842d68942/java/pdfclown.lib/src/org/pdfclown/documents/contents/fonts/PfbParser.java#L85
    Pattern.compile("dup (\\S+) (\\S+) put"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/gencode/GencodeFuncotationFactory.java#L426
    Pattern.compile("UTR[35]:(\\d+)-(\\d+)"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/gencode/GencodeFuncotationFactory.java#L427
    Pattern.compile("CDS:(\\d+)-(\\d+)"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/cosmic/CosmicFuncotationFactory.java#L52
    Pattern.compile("(\\d+):(\\d+)-(\\d+)"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/cosmic/CosmicFuncotationFactory.java#L58
    Pattern.compile("[pP]\\.\\(?[A-Z](\\d+)\\)?[A-Z]?_?(?:[A-Z]?(\\d+)?.*)?"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/DataSourceUtils.java#L51
    Pattern.compile("Version:\\s+(\\d+)\\.(\\d+)\\.(\\d\\d\\d\\d)(\\d\\d)(\\d\\d)"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/DataSourceUtils.java#L52
    Pattern.compile("Source:\\s+(ftp.*)"),
    // https://github.com/falcon-computing/gatk4/blob/eff34c69e0ee1557396c5ad7f94128a08c0ab2f3/src/main/java/org/broadinstitute/hellbender/tools/funcotator/dataSources/DataSourceUtils.java#L53
    Pattern.compile("Alternate Source:\\s+(gs.*)"),
    // https://github.com/FannySarb/Cxpress/blob/61131d9d5606d0ce8fa9698ebd2257b29873dc79/app/src/main/java/estefania/com/cxpress/RegistroUsuario.java#L91
    Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9]"),
    // https://github.com/nguyenhaison1999/project_network/blob/82c2ac4de72f8db1fd084c8ab01f771e5a342558/src/sample/projectConsole/Server.java#L72
    Pattern.compile("^([A-Za-z][A-Za-z0-9_]*)$"),
    // https://github.com/nguyenhaison1999/project_network/blob/82c2ac4de72f8db1fd084c8ab01f771e5a342558/src/sample/projectConsole/Server.java#L190
    Pattern.compile("\\)([+\\-\\*%\\/])\\("),
    // https://github.com/nguyenhaison1999/project_network/blob/82c2ac4de72f8db1fd084c8ab01f771e5a342558/src/sample/projectConsole/Server.java#L338
    Pattern.compile("([-\\d]+)"),
    // https://github.com/ericchhuang/graphs/blob/6fb72e8c7e80001d9d7a2f91b1fb7e776679b996/make/Maker.java#L26
    Pattern.compile("\\s*(#.*)?"),
    // https://github.com/ericchhuang/graphs/blob/6fb72e8c7e80001d9d7a2f91b1fb7e776679b996/make/Maker.java#L29
    Pattern.compile("([^:\\s]+)\\s*:\\s*(.*?)\\s*"),
    // https://github.com/ericchhuang/graphs/blob/6fb72e8c7e80001d9d7a2f91b1fb7e776679b996/make/Maker.java#L31
    Pattern.compile("[^:=#\\\\]*$"),
    // https://github.com/ericchhuang/graphs/blob/6fb72e8c7e80001d9d7a2f91b1fb7e776679b996/make/Maker.java#L33
    Pattern.compile("(\\s+.*)"),
    // https://github.com/ericchhuang/graphs/blob/6fb72e8c7e80001d9d7a2f91b1fb7e776679b996/make/Maker.java#L35
    Pattern.compile("\\p{Blank}+"),
    // https://github.com/Vorobeyyyyyy/EpamTraining/blob/74052c6e38501d37d7e3553e93c57fa64e07ba09/src/com/vorobyev/day5/service/TextService.java#L49
    Pattern.compile("( )+"),
    // https://github.com/unicode-org/cldr/blob/9c332e831ab9ffb6c327b878c46120688062a398/tools/cldr-apps/src/main/java/org/unicode/cldr/web/SurveyMain.java#L1387
    Pattern.compile("^CLDR_([A-Z]+)_HASH$"),
    // https://github.com/sergueik/selenium_java/blob/de3c514019c1d49b6c9a4466fbc47032e091d098/swet_javafx/src/main/java/com/github/sergueik/swet_javafx/TemplateCache.java#L53
    Pattern.compile("\\{#(?:\\r?\\n)?(.*)(?:\\r?\\n)?#\\}", Pattern.MULTILINE),
    // https://github.com/sergueik/selenium_java/blob/de3c514019c1d49b6c9a4466fbc47032e091d098/swet_javafx/src/main/java/com/github/sergueik/swet_javafx/TemplateCache.java#L59
    Pattern.compile("template: (.+)$", Pattern.MULTILINE),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L33
    Pattern.compile("\\[\\[(.*?:)?(.*?)(\\|.*?)?\\]\\]"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L35
    Pattern.compile("(\\s*|.*\\n(\\s*))", Pattern.DOTALL),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L36
    Pattern.compile("(\\s*|(\\s*)\\n.*)", Pattern.DOTALL),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L198
    Pattern.compile("\\<\\/?b\\>"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L387
    Pattern.compile("\n{3,}"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L541
    Pattern.compile("\\n\\s*((={2,})[^=].*?\\2)[^=]"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L606
    Pattern.compile("(\\s*)\\<i\\>(.*?)\\<\\/i\\>\\.?(\\s*)"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L637
    Pattern.compile("^(\\s*)$"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L638
    Pattern.compile("^(\\s*):.*"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/src/org/wikipedia/miner/util/MarkupStripper.java#L640
    Pattern.compile("^(\\s*)\\[\\[Image\\:(.*?)\\]\\](\\s*)"),
    // https://github.com/darlanfelisberto/alle/blob/857389bfcfaf2b3ed124e9a54e9617458d8e093a/src/main/java/br/analisy/alle/AnalisyXML.java#L43
    Pattern.compile("((QUESTÃO|Questão|QUESTÃO DISCURSIVA|Questão Discursiva)( [0-9]{1,2}))|^[0-9]{1,2}\\.|^[0-9]{1,2}\n", Pattern.CASE_INSENSITIVE),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.file.storage.composition/src/com/openexchange/file/storage/composition/FilenameValidationUtils.java#L134
    Pattern.compile("^                                # Anchor to start of string.        \n(?!                              # Assert filename is not: CON, PRN, \n  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n  )                              # LPT6, LPT7, LPT8, and LPT9...     \n  (?:\\.[^.]*)?                  # followed by optional extension    \n  $                              # and end of string                 \n)                                # End negative lookahead assertion. \n[^<>:/?*\"\\\\|\\x00-\\x1F]*     # Zero or more valid filename chars.\n[^<>:/?*\"\\\\|\\x00-\\x1F\\ .]  # Last char is not a space or dot.  \n$                                # Anchor to end of string.            ", Pattern.CASE_INSENSITIVE|Pattern.COMMENTS|Pattern.UNICODE_CASE),
    // https://github.com/Suryabeam/Daleel_Al_Jahra/blob/5a7c50bb17250ef6cd55d8da4d2400b537f819b1/app/src/main/java/com/daleelpackage/myapp/packages/WorldPay/Card.java#L22
    Pattern.compile("[^0-9-\\s]"),
    // https://github.com/dobrienUNCG/Cards/blob/ca283ccbc0b3f29860edb7a30291eac2fa292411/app/src/main/java/Cards/models/CardScanner.java#L18
    Pattern.compile("/[@]/"),
    // https://github.com/dobrienUNCG/Cards/blob/ca283ccbc0b3f29860edb7a30291eac2fa292411/app/src/main/java/Cards/models/CardScanner.java#L19
    Pattern.compile("(.*)(at)\\s(\\S*)"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/grmm/learning/GenericAcrfData2TokenSequence.java#L120
    Pattern.compile("^(.*=)?([+-]?\\d*\\.?\\d+([eE][+-]?\\d+)?)(@[+-]?\\d+)?"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/fst/tests/TestCRF.java#L943
    Pattern.compile("^(\\S+) (.*)"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/com/android/internal/util/TypedProperties.java#L149
    Pattern.compile("([a-zA-Z_$][0-9a-zA-Z_$]*\\.)*[a-zA-Z_$][0-9a-zA-Z_$]*"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/com/android/internal/os/KernelCpuThreadReaderSettingsObserver.java#L148
    Pattern.compile("([0-9]+)-([0-9]+)"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/com/android/internal/content/FileSystemProvider.java#L645
    Pattern.compile("(?i)^/storage/[^/]+/(?:[0-9]+/)?Android/(?:data|obb|sandbox)$"),
    // https://github.com/CesiumOS-org/frameworks_base/blob/b6071685e17244a25bc1d87eb3130141d0206265/core/java/com/android/internal/app/procstats/ProcessStats.java#L252
    Pattern.compile("^Node\\s+(\\d+),.* zone\\s+(\\w+),.* type\\s+(\\w+)\\s+([\\s\\d]+?)\\s*$"),
    // https://github.com/gutao1994/hanshunping-data-structures/blob/167199718c44e8b7974a0936bcf7740eb9536f72/%E7%AC%94%E8%AE%B0%E3%80%81%E4%BB%A3%E7%A0%81%E3%80%81%E8%AF%BE%E4%BB%B6%E3%80%81%E8%B5%84%E6%96%99/%E4%BB%A3%E7%A0%81/DataStructures/src/com/atguigu/reversepolishcal/ReversePolishMultiCalc.java#L57
    Pattern.compile("^[-\\+]?[.\\d]*$"),
    // https://github.com/gutao1994/hanshunping-data-structures/blob/167199718c44e8b7974a0936bcf7740eb9536f72/%E7%AC%94%E8%AE%B0%E3%80%81%E4%BB%A3%E7%A0%81%E3%80%81%E8%AF%BE%E4%BB%B6%E3%80%81%E8%B5%84%E6%96%99/%E4%BB%A3%E7%A0%81/DataStructures/src/com/atguigu/reversepolishcal/ReversePolishMultiCalc.java#L14
    Pattern.compile("\\+|-|\\*|/|\\(|\\)"),
    // https://github.com/aldo-stentella/gestro/blob/742621a3221a3d5cd3686a2981b83cd50c526a61/brevetti-ejb/src/main/java/it/cnr/brevetti/util/HostName.java#L68
    Pattern.compile("^\\d+\\.\\d+\\.\\d+\\.\\d+$|:"),
    // https://github.com/Danielagf02/IHC/blob/7cf9afa39254be841e8b8fc4a35bacdebaf89c27/src/Interfaces/Registrarse.java#L1002
    Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$"),
    // https://github.com/Danielagf02/IHC/blob/7cf9afa39254be841e8b8fc4a35bacdebaf89c27/src/Interfaces/Registrarse.java#L1020
    Pattern.compile("^([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L21
    Pattern.compile("^[2-9]{1}[0-9]{11}$"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L28
    Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L34
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L56
    Pattern.compile("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L59
    Pattern.compile("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L65
    Pattern.compile("\\d{4}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L67
    Pattern.compile("\\(\\d{5}\\)-\\d{3}-\\d{3}"),
    // https://github.com/Kaushal-99/Donation-android-app/blob/4df0dd14c2852f588d41b039d2d75f8d55bd2157/app/src/main/java/com/example/donation/MainActivity.java#L70
    Pattern.compile("\\(\\d{4}\\)-\\d{3}-\\d{3}"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/filter/AbstractPatternFilter.java#L47
    Pattern.compile("^(\\w+):(.*)"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/SshFenceByTcpPort.java#L231
    Pattern.compile("([^:]+?)?(?:\\:(\\d+))?"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/NodeFencer.java#L56
    Pattern.compile("([a-zA-Z0-9\\.\\$]+)\\((.+?)\\)"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/NodeFencer.java#L56
    Pattern.compile("([a-zA-Z0-9\\.\\$]+)"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/PathData.java#L66
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]+:"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/PathData.java#L68
    Pattern.compile("^/?[a-zA-Z]:\\\\"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/PathData.java#L70
    Pattern.compile("^/?[a-zA-Z]:/"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/permission/UmaskParser.java#L36
    Pattern.compile("^\\s*[+]?(0*)([0-7]{3})\\s*$"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/permission/UmaskParser.java#L38
    Pattern.compile("\\G\\s*([ugoa]*)([+=-]+)([rwx]*)([,\\s]*)\\s*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/permission/ChmodParser.java#L34
    Pattern.compile("^\\s*[+]?([01]?)([0-7]{3})\\s*$"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/permission/ChmodParser.java#L36
    Pattern.compile("\\G\\s*([ugoa]*)([+=-]+)([rwxXt]+)([,\\s]*)\\s*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/Path.java#L56
    Pattern.compile("^/?[a-zA-Z]:"),
    // https://github.com/Daniyal-Qureshi/Turing-Machine/blob/abb929862a1b7b43b59a080bdca44a997b99554d/src/turing/machine/project/TuringMachine.java#L209
    Pattern.compile("\\s(.+)\\s"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L274
    Pattern.compile("[a-zA-Z0-9.,_+=:;@()-]*"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L279
    Pattern.compile("[a-zA-Z0-9._+=:@%/-]*"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L285
    Pattern.compile("(['])"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L291
    Pattern.compile("([()!^<>&|% ])"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L292
    Pattern.compile("([\"])"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L327
    Pattern.compile("(.*?:)?(\\d+)"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/cli/Run.java#L356
    Pattern.compile("(\\S*?)=(\\S+)"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/Script.java#L36
    Pattern.compile("(?<key>\\w+)\\s*=\\s*\"(?<value>.*?)\""),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/Script.java#L37
    Pattern.compile("@Grab\\(\\s*\"(?<value>.*)\"\\s*\\)"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/Script.java#L42
    Pattern.compile("@GrabResolver\\(\\s*\"(?<value>.*)\"\\s*\\)"),
    // https://github.com/jbangdev/jbang/blob/361a9f62ba09f9bf493e1e4febf9b64be66ce43c/src/main/java/dev/jbang/Script.java#L238
    Pattern.compile("\\d+[+]?"),
    // https://github.com/wholder/MegaTinyIDE/blob/839ec89694917495e34e623c2954d8117b68e882/src/MegaTinyCompiler.java#L299
    Pattern.compile("#\\s\\d+\\s\"(.*?)\""),
    // https://github.com/Lukeisun/COP3330_DelaCruz/blob/cc357a57431bef0c8e18d6f71e31a3247687390c/delacruz_p5/src/TaskItem.java#L26
    Pattern.compile("^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$"),
    // https://github.com/Lukeisun/COP3330_DelaCruz/blob/cc357a57431bef0c8e18d6f71e31a3247687390c/delacruz_p5/src/TaskApp.java#L359
    Pattern.compile("(\\w)*\\.txt"),
    // https://github.com/ZelmoTheDragon/whiteapp/blob/13d33ea7772d757618358a8b4d2f45bb554e64a4/whiteapp-common/src/main/java/com/github/zelmothedragon/whiteapp/common/validation/Constraint.java#L70
    Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/JamFactoryInc/JamFacMod/blob/2f3764f415ec7730694fc7e43009b49fb09da868/Mod/build/tmp/expandedArchives/forge-1.16.3-34.1.0_mapped_snapshot_20200514-1.16-sources.jar_17c431d297a8751786c4d17c4408e346/net/minecraft/command/arguments/UUIDArgument.java#L19
    Pattern.compile("^([-A-Fa-f0-9]+)"),
    // https://github.com/Dolj0/Java-Mooc-1-3/blob/7a36049a237ff6b1f7f1af083e7a7136ea32fbba/part03-Part03_13.AverageOfAList/src/test/java/AverageOfAListTest.java#L70
    Pattern.compile("(?s).*?(-?\\d+\\.\\d+)\\s*$"),
    // https://github.com/Dolj0/Java-Mooc-1-3/blob/7a36049a237ff6b1f7f1af083e7a7136ea32fbba/part03-Part03_12.SumOfAList/src/test/java/SumOfAListTest.java#L71
    Pattern.compile("(?s).*?(\\d+)\\s*$"),
    // https://github.com/Plarium-Repo/Superflow/blob/d617b722f72cd482086a92dcec3711a48b6652a4/superflow-core/src/main/java/com/plarium/south/superflow/core/utils/TemplateUtils.java#L15
    Pattern.compile("^\\$\\{(?<osEnvKey>[\\w]+):?(?<defaultVal>.*)?}$", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/yunkyung318/JAVA_TERM_ALGOLITHM/blob/8bcc777cdadbfc295dc9512f2a016e319c68746f/src/PassWord.java#L7
    Pattern.compile("^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$"),
    // https://github.com/xatkit-bot-platform/xatkit-runtime/blob/9f2e179b2452e986c8eb06cd4da5726f4f5ff636/src/main/java/com/xatkit/core/recognition/regex/RegExIntentRecognitionProvider.java#L75
    Pattern.compile("[{}()\\[\\].+*?^$\\\\|]"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/servlet/ArticleServlet.java#L41
    Pattern.compile("(.+?)(?=(?: \\d.*)|(?:[:,] .*)|(?: \\(\\d+\\))|$)"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/rss/CommentRss.java#L49
    Pattern.compile("Comments(.*?)\\.rss"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/rss/ArticleRss.java#L44
    Pattern.compile("(.*?)Articles\\.rss"),
    // https://github.com/GPC-debug/nacos-project/blob/342aa218925ba5623a79c114a407e89c7fd0be8a/RuoYi-Cloud/ruoyi-common/ruoyi-common-core/src/main/java/com/ruoyi/common/core/utils/ReUtil.java#L15
    Pattern.compile("\\$(\\d+)"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1beta1/1.31.0/com/google/api/services/serviceconsumermanagement/v1beta1/ServiceConsumerManagement.java#L178
    Pattern.compile("^operations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1beta1/1.31.0/com/google/api/services/serviceconsumermanagement/v1beta1/ServiceConsumerManagement.java#L363
    Pattern.compile("^services/[^/]+/[^/]+/[^/]+/consumerQuotaMetrics/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1beta1/1.31.0/com/google/api/services/serviceconsumermanagement/v1beta1/ServiceConsumerManagement.java#L534
    Pattern.compile("^services/[^/]+/[^/]+/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1beta1/1.31.0/com/google/api/services/serviceconsumermanagement/v1beta1/ServiceConsumerManagement.java#L899
    Pattern.compile("^services/[^/]+/[^/]+/[^/]+/consumerQuotaMetrics/[^/]+/limits/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1beta1/1.31.0/com/google/api/services/serviceconsumermanagement/v1beta1/ServiceConsumerManagement.java#L1275
    Pattern.compile("^services/[^/]+/[^/]+/[^/]+/consumerQuotaMetrics/[^/]+/limits/[^/]+/producerOverrides/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-serviceconsumermanagement/v1/1.31.0/com/google/api/services/serviceconsumermanagement/v1/ServiceConsumerManagement.java#L1088
    Pattern.compile("^services/[^/]+/[^/]+/[^/]+/tenancyUnits/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-pubsub/v1beta2/1.31.0/com/google/api/services/pubsub/Pubsub.java#L201
    Pattern.compile("^projects/[^/]+/subscriptions/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-pubsub/v1beta2/1.31.0/com/google/api/services/pubsub/Pubsub.java#L1851
    Pattern.compile("^projects/[^/]+/topics/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-pubsub/v1/1.31.0/com/google/api/services/pubsub/Pubsub.java#L212
    Pattern.compile("^projects/[^/]+/snapshots/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-networkmanagement/v1beta1/1.31.0/com/google/api/services/networkmanagement/v1beta1/NetworkManagement.java#L572
    Pattern.compile("^projects/[^/]+/locations/global$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-networkmanagement/v1beta1/1.31.0/com/google/api/services/networkmanagement/v1beta1/NetworkManagement.java#L746
    Pattern.compile("^projects/[^/]+/locations/global/connectivityTests/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-networkmanagement/v1beta1/1.31.0/com/google/api/services/networkmanagement/v1beta1/NetworkManagement.java#L2099
    Pattern.compile("^projects/[^/]+/locations/global/operations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L180
    Pattern.compile("^projects/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L626
    Pattern.compile("^projects/[^/]+/jobs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L2731
    Pattern.compile("^projects/[^/]+/locations/[^/]+/studies/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L3167
    Pattern.compile("^projects/[^/]+/locations/[^/]+/studies/[^/]+/trials/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L4656
    Pattern.compile("^projects/[^/]+/models/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/3a6e405a9ef576cbffa7ab501c0e6f89e4938ca2/clients/google-api-services-ml/v1/1.31.0/com/google/api/services/ml/v1/CloudMachineLearningEngine.java#L5933
    Pattern.compile("^projects/[^/]+/models/[^/]+/versions/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/ff60f99d73ea8106a8424915ccaeb4aac841b1e7/clients/google-api-services-serviceusage/v1beta1/1.31.0/com/google/api/services/serviceusage/v1beta1/ServiceUsage.java#L675
    Pattern.compile("^[^/]+/[^/]+/services/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/ff60f99d73ea8106a8424915ccaeb4aac841b1e7/clients/google-api-services-serviceusage/v1beta1/1.31.0/com/google/api/services/serviceusage/v1beta1/ServiceUsage.java#L1518
    Pattern.compile("^[^/]+/[^/]+/services/[^/]+/consumerQuotaMetrics/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/ff60f99d73ea8106a8424915ccaeb4aac841b1e7/clients/google-api-services-serviceusage/v1beta1/1.31.0/com/google/api/services/serviceusage/v1beta1/ServiceUsage.java#L2199
    Pattern.compile("^[^/]+/[^/]+/services/[^/]+/consumerQuotaMetrics/[^/]+/limits/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/ff60f99d73ea8106a8424915ccaeb4aac841b1e7/clients/google-api-services-serviceusage/v1beta1/1.31.0/com/google/api/services/serviceusage/v1beta1/ServiceUsage.java#L2566
    Pattern.compile("^[^/]+/[^/]+/services/[^/]+/consumerQuotaMetrics/[^/]+/limits/[^/]+/adminOverrides/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/ff60f99d73ea8106a8424915ccaeb4aac841b1e7/clients/google-api-services-serviceusage/v1beta1/1.31.0/com/google/api/services/serviceusage/v1beta1/ServiceUsage.java#L3323
    Pattern.compile("^[^/]+/[^/]+/services/[^/]+/consumerQuotaMetrics/[^/]+/limits/[^/]+/consumerOverrides/[^/]+$"),
    // https://github.com/ryan-zhy/lombok-intellij-plugin/blob/1db9b359a96dcc2bc673a5eef76eba1ad0cf9e78/test-manual/src/main/java/de/plushnikov/value/Issue332.java#L21
    Pattern.compile("FOREIGN_KEY", Pattern.CASE_INSENSITIVE),
    // https://github.com/taktik/freehealth-connector/blob/efe8ac344ed06dafbcc451fb0c013f8822f58f61/decompiled/3.17.1/be/ehealth/technicalconnector/config/impl/ConfigurationModuleSystemProps.java#L20
    Pattern.compile("(.+?)=(.*)"),
    // https://github.com/kessibi/prog_reseaux/blob/460c8f7b2cd3302c4ae44afa14bcce49ba3dd7a3/TP2/TP-HTTP-Code/src/http/server/HeaderParser.java#L47
    Pattern.compile("^([A-Z]*)(?s)(.*)"),
    // https://github.com/kessibi/prog_reseaux/blob/460c8f7b2cd3302c4ae44afa14bcce49ba3dd7a3/TP2/TP-HTTP-Code/src/http/server/HeaderParser.java#L67
    Pattern.compile("Content-Length: ([0-9]+)"),
    // https://github.com/kessibi/prog_reseaux/blob/460c8f7b2cd3302c4ae44afa14bcce49ba3dd7a3/TP2/TP-HTTP-Code/src/http/server/HeaderParser.java#L82
    Pattern.compile("^(.*)(?s)(HTTP)(.*)"),
    // https://github.com/Netflix/zuul/blob/f2f3ae93c8e6b83e33bef874774ae6e9f0164ba5/zuul-core/src/main/java/com/netflix/zuul/passport/CurrentPassport.java#L419
    Pattern.compile("CurrentPassport \\{start_ms=\\d+, \\[(.*)\\]\\}"),
    // https://github.com/Netflix/zuul/blob/f2f3ae93c8e6b83e33bef874774ae6e9f0164ba5/zuul-core/src/main/java/com/netflix/zuul/passport/CurrentPassport.java#L420
    Pattern.compile("^\\+(\\d+)=(.+)$"),
    // https://github.com/Rycorlin/ATZFinance/blob/6f490c0c1cc20179e7876634f323fdee5cd1ac3d/src/Controller/CreateAccountController.java#L55
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,50}$"),
    // https://github.com/Rycorlin/ATZFinance/blob/6f490c0c1cc20179e7876634f323fdee5cd1ac3d/src/Controller/CreateAccountController.java#L86
    Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE),
    // https://github.com/CMSgov/dpc-app/blob/154c127885e1678d5c0c82e26c396bae952ac97d/dpc-api/src/main/java/gov/cms/dpc/api/resources/v1/PatientResource.java#L54
    Pattern.compile("^[a-z0-9]+://.*$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L126
    Pattern.compile("^[^/<>&\"]+$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L127
    Pattern.compile("^(/[^/<>&\"]+)+$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L362
    Pattern.compile("^((/jcr:root)?/[^ (\\[]*)( +([^ /(\\[]+) *|(.*))$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L368
    Pattern.compile("^ *([^ /]+) *$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L1316
    Pattern.compile("^d([\\d]+)$"),
    // https://github.com/ist-dresden/composum/blob/0f02b4d8c8f3b4b56f1f4585a7875ac4adc72173/console/src/main/java/com/composum/sling/nodes/servlet/NodeServlet.java#L1317
    Pattern.compile("^i([\\d]+)$"),
    // https://github.com/llaske/sugarizer-apkbuilder/blob/32474a67e13f5d7c338f1397fdac1162b1c789ec/src/.gradle/wrapper/dists/gradle-3.3-all/2pjhuu3pz1dpi6vcvf3301a8j/gradle-3.3/src/testing-jvm/org/gradle/api/internal/tasks/testing/junit/JUnitTestEventAdapter.java#L35
    Pattern.compile("(.*)\\((.*)\\)", Pattern.DOTALL),
    // https://github.com/llaske/sugarizer-apkbuilder/blob/32474a67e13f5d7c338f1397fdac1162b1c789ec/src/.gradle/wrapper/dists/gradle-3.3-all/2pjhuu3pz1dpi6vcvf3301a8j/gradle-3.3/src/testing-base/org/gradle/api/internal/tasks/testing/logging/GroovyStackTraceSpec.java#L26
    Pattern.compile("org.codehaus.groovy.runtime\\..*|org.codehaus.groovy.reflection\\..*|org.codehaus.groovy\\..*MetaClass.*|groovy\\..*MetaClass.*|groovy.lang.MetaMethod|java.lang.reflect\\..*|sun.reflect\\..*|jdk.internal.reflect\\..*"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-filtering/src/main/java/org/apache/maven/shared/filtering/FilteringUtils.java#L32
    Pattern.compile("^(.*)[a-zA-Z]:\\\\(.*)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-deploy-plugin/src/main/java/org/apache/maven/plugins/deploy/DeployFileMojo.java#L224
    Pattern.compile("META-INF/maven/.*/pom\\.xml"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-changelog-plugin/src/main/java/org/apache/maven/plugin/changelog/ChangeLogReport.java#L105
    Pattern.compile("%ISSUE%"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-changelog-plugin/src/main/java/org/apache/maven/plugin/changelog/ChangeLogReport.java#L99
    Pattern.compile("%FILE%"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-changelog-plugin/src/main/java/org/apache/maven/plugin/changelog/ChangeLogReport.java#L112
    Pattern.compile("%REV%"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-changelog-plugin/src/main/java/org/apache/maven/plugin/changelog/ChangeLogReport.java#L1699
    Pattern.compile("^.*(&amp;module=.*?(?:&amp;|$)).*$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-changelog-plugin/src/main/java/org/apache/maven/plugin/changelog/ChangeLogHandler.java#L68
    Pattern.compile(" \\(from [^:]+:\\d+\\)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java#L48
    Pattern.compile("^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-archetype/maven-archetype-plugin/src/test/java/org/apache/maven/archetype/ui/generation/DefaultArchetypeGenerationQueryerTest.java#L55
    Pattern.compile("^valid-.*"),
    // https://github.com/liu-lulu/ineutech/blob/1eaea86ab3777f0274f7b1a525a9ecc6b523997d/2019wuwenjun/src/java/com/kkbc/util/StringHelper.java#L62
    Pattern.compile("/[^\u4E00-\u9FA5]/g,''"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L166
    Pattern.compile("(?s)\\Q${\\E([^}]+?)(?:\\Q:+\\E([^}]+))?\\Q}"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L168
    Pattern.compile("(?s)\\Q%{\\E(\\d)(?:\\Q:+\\E([^}]+))?\\Q}"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L321
    Pattern.compile("\\Q\r"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L320
    Pattern.compile("\\Q\r\n"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L336
    Pattern.compile("\\Q\n"),
    // https://github.com/ryenus/hsqldb/blob/27e44fe30479d05a87bee5e624ae2e446c0bb098/src/org/hsqldb/lib/RefCapablePropertyResourceBundle.java#L395
    Pattern.compile("^[^./].*[./].+"),
    // https://github.com/arcosx/JavaSource/blob/e9d825f3fb37678cb87ad83c576375b1cd137a1f/src/com/company/java.base/jdk/internal/module/ModulePath.java#L584
    Pattern.compile("-(\\d+(\\.|$))"),
    // https://github.com/arcosx/JavaSource/blob/e9d825f3fb37678cb87ad83c576375b1cd137a1f/src/com/company/java.base/jdk/internal/module/ModulePath.java#L586
    Pattern.compile("(\\.)(\\1)+"),
    // https://github.com/arcosx/JavaSource/blob/e9d825f3fb37678cb87ad83c576375b1cd137a1f/src/com/company/java.base/jdk/internal/module/ModulePath.java#L587
    Pattern.compile("^\\."),
    // https://github.com/lyl12321/Fixed/blob/259d845165db8d29a00d4dae4e7daf5ecbe28679/app/src/main/java/util/StringFilter.java#L12
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"),
    // https://github.com/skyvers/skyve/blob/9c23d8fcd74c20c0f9e9f1cb7f165a5dda0bef4a/skyve-core/src/main/java/org/skyve/impl/util/UtilImpl.java#L275
    Pattern.compile("(?s)\\/\\*(?:(\\*(?!\\/))|(?:[^\\*]))*\\*\\/|[^:]\\/\\/[^\\n\\r]*(?=[\\n\\r])", Pattern.MULTILINE),
    // https://github.com/dtrung98/MusicPlayer/blob/34555c0b714cfd81c670f070ca5a9a26317e6275/app/src/main/java/com/ldt/musicr/ui/bottomsheet/LyricBottomSheet.java#L281
    Pattern.compile("(\\<\\w+((\\s+\\w+(\\s*\\=\\s*(?:\".*?\"|'.*?'|[^'\"\\>\\s]+))?)+\\s*|\\s*)\\>.*\\</\\w+\\>)|(\\<\\w+((\\s+\\w+(\\s*\\=\\s*(?:\".*?\"|'.*?'|[^'\"\\>\\s]+))?)+\\s*|\\s*)/\\>)|(&[a-zA-Z][a-zA-Z0-9]+;)", Pattern.DOTALL),
    // https://github.com/caller79/rest-utils/blob/5637ffb17920977efc689beb461d3738619eb014/src/main/java/io/github/caller79/daterange/DateRangeFactory.java#L20
    Pattern.compile("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$"),
    // https://github.com/caller79/rest-utils/blob/5637ffb17920977efc689beb461d3738619eb014/src/main/java/io/github/caller79/daterange/DateRangeFactory.java#L22
    Pattern.compile("^-?[0-9]+[dhm]?\\|?$"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/startup/Bootstrap.java#L61
    Pattern.compile("(\"[^\"]*\")|(([^,])*)"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/ssi/SSIFilter.java#L57
    Pattern.compile("text/x-server-parsed-html(;.*)?"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/servlets/CGIServlet.java#L258
    Pattern.compile("[a-zA-Z0-9\\Q-_.\\/:\\E]+"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/servlets/CGIServlet.java#L304
    Pattern.compile("ACCEPT[-0-9A-Z]*|CACHE-CONTROL|COOKIE|HOST|IF-[-0-9A-Z]*|REFERER|USER-AGENT"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/servlets/CGIServlet.java#L327
    Pattern.compile("[a-zA-Z0-9\\Q%;/?:@&,$-_.!~*'()\\E]+"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/filters/RestCsrfPreventionFilter.java#L84
    Pattern.compile("GET|HEAD|OPTIONS"),
    // https://github.com/evgnpn/clevertec-jtasks/blob/db03efa2fd26ae3ccb22c9981f7f8c0e4316aca9/ui.console/src/main/java/com/company/Main.java#L23
    Pattern.compile("^-(?<key>.+)=(?<value>.+)$"),
    // https://github.com/evgnpn/clevertec-jtasks/blob/db03efa2fd26ae3ccb22c9981f7f8c0e4316aca9/ui.console/src/main/java/com/company/Main.java#L149
    Pattern.compile("^d-check=(?<key>\\w+)$"),
    // https://github.com/evgnpn/clevertec-jtasks/blob/db03efa2fd26ae3ccb22c9981f7f8c0e4316aca9/ui.console/src/main/java/com/company/Main.java#L168
    Pattern.compile("^d-item=(?<id>\\d+):(?<key>\\w+)$"),
    // https://github.com/evgnpn/clevertec-jtasks/blob/db03efa2fd26ae3ccb22c9981f7f8c0e4316aca9/ui.console/src/main/java/com/company/Main.java#L184
    Pattern.compile("^-(?<key>\\w+)=(?<value>.+)$"),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L51
    Pattern.compile("^(?!000|999)[0-9]{3}(?!00)[0-9]{2}(?!0000|9999)[0-9]{4}$"),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L52
    Pattern.compile("^(?!0000|9999)[0-9]{4}$"),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L58
    Pattern.compile("^^(\\d)\\1{8}$"),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L81
    Pattern.compile("^[a-z0-9 \\-\\.\\#_]*[a-z0-9]+[a-z0-9 \\-\\.\\#_]*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L88
    Pattern.compile(".*[a-z]+.*[a-z]+.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/linkja/linkja-hashing/blob/87bdee453bd025c3fcb0816b07381cdba61a2ee6/src/main/java/org/linkja/hashing/steps/ValidationFilterStep.java#L291
    Pattern.compile("[\\- ]"),
    // https://github.com/johnau/FloortechSchedulingAssistant/blob/349f30bb8372af899a89e7c3e9b70a08e9a2c6fc/src/test/java/tech.jmcs.floortech.scheduling.app.extractor/GenericExcelHorizontalTableDataExtractorTest.java#L374
    Pattern.compile("[a-zA-Z]{2}"),
    // https://github.com/johnau/FloortechSchedulingAssistant/blob/349f30bb8372af899a89e7c3e9b70a08e9a2c6fc/src/main/java/tech/jmcs/floortech/scheduling/app/extractor/TrussListExtractor.java#L263
    Pattern.compile("([cC][wWxX])([a-zA-Z0-9]{3})([\\s]*)(Joist Schedule)", Pattern.CASE_INSENSITIVE),
    // https://github.com/johnau/FloortechSchedulingAssistant/blob/349f30bb8372af899a89e7c3e9b70a08e9a2c6fc/src/main/java/tech/jmcs/floortech/scheduling/app/extractor/TrussListExtractor.java#L339
    Pattern.compile("([0-9])[\\s]*[+][\\s]*([0-9])"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L107
    Pattern.compile("(S|s)(I|i)(N|n)"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L108
    Pattern.compile("[Cc][Oo][Ss]"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L109
    Pattern.compile("[Tt][Aa][Nn]"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L111
    Pattern.compile("^-"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L113
    Pattern.compile("(\\d+\\s?-\\s?\\d+)|([cst]\\s?-\\s?\\d)|(\\d\\s?-\\s?[cst])|([cst]\\s?-\\s?[cst])|(\\)\\s?-\\s?\\()|(\\d+\\s?-\\s?\\()|(\\)\\s?-\\s?\\d+)|([cst]\\s?-\\s?\\()|(\\)\\s?-\\s?[cst])"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L123
    Pattern.compile("[^\\d)]\\s?\\-\\s?[\\dcst\\(]"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L132
    Pattern.compile("[sct\\+\\-\\*/\\^=%@]"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L139
    Pattern.compile("-?((\\d*\\.\\d*([eE][\\+\\-]?\\d+)?)|\\d+)"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L280
    Pattern.compile("^-?((\\d*\\.\\d*([eE][\\+\\-]?\\d+)?)|\\d+)$"),
    // https://github.com/Sekator778/JavaRushTasks/blob/21f7c793b9418c8413645675545e304fbe1aa559/4.JavaCollections/src/com/javarush/task/task34/task3404/Solution.java#L298
    Pattern.compile("!"),
    // https://github.com/MegaMek/mekhq/blob/6df2e5f7c0890b395b16b4274f5b138e4ea7ba5e/MekHQ/src/mekhq/campaign/market/PartsStore.java#L144
    Pattern.compile("\\d+\\shit\\(s\\),\\s"),
    // https://github.com/MegaMek/mekhq/blob/6df2e5f7c0890b395b16b4274f5b138e4ea7ba5e/MekHQ/src/mekhq/campaign/market/PartsStore.java#L145
    Pattern.compile("\\d+\\shit\\(s\\)"),
    // https://github.com/NationalSecurityAgency/ghidra/blob/14d4c87ef43f45e2f50edfa99c1e4b7f5779e232/Ghidra/Framework/Help/src/test/java/help/OverlayHelpTreeTest.java#L402
    Pattern.compile(".*toc_id=\"(.*)\".*"),
    // https://github.com/Evolveum/midpoint-studio/blob/a5b32f93582300c54000b63bb62610589c7ba8e4/studio-idea-plugin/src/main/java/com/evolveum/midpoint/studio/impl/Expander.java#L30
    Pattern.compile("\\$\\((\\S*?)\\)"),
    // https://github.com/KostyaSvirski/epam.test-web-1/blob/681d1cc3814648042d16b4e7f8b7789d56ba6542/src/by/svirski/testweb/util/validator/impl/NumberValidatorImpl.java#L10
    Pattern.compile("[\\d|(.)]{0,}"),
    // https://github.com/KostyaSvirski/epam.test-web-1/blob/681d1cc3814648042d16b4e7f8b7789d56ba6542/src/by/svirski/testweb/util/validator/impl/ImageSourceValidator.java#L10
    Pattern.compile("http://\\w+(.){0,}(.)[a-z]+/.{0,}(.)(png)|http://\\w+(.){0,}(.)[a-z]+/.{0,}(.)(jpg)|http://\\w+(.){0,}(.)[a-z]+/(.){0,}(.)(jpeg)|https://\\w+(.){0,}(.)[a-z]+/(.){0,}(.)(png)|https://\\w+(.){0,}(.)[a-z]+/(.){0,}(.)(jpg)|https://\\w+(.){0,}(.)[a-z]+/(.){0,}(.)(jpeg)"),
    // https://github.com/jbrower2/http-server/blob/447f98ed0da2b4999bf85d7cff1c0204d1c36f0d/src/main/java/com/jeffbrower/http/Server.java#L37
    Pattern.compile("(\\w+)[ \t]+(\\S+)[ \t]+HTTP/(\\d)\\.(\\d)"),
    // https://github.com/jbrower2/http-server/blob/447f98ed0da2b4999bf85d7cff1c0204d1c36f0d/src/main/java/com/jeffbrower/http/Server.java#L38
    Pattern.compile("[0-9A-Za-z!#$%&'*+.^_`|~-]+"),
    // https://github.com/jbrower2/http-server/blob/447f98ed0da2b4999bf85d7cff1c0204d1c36f0d/src/main/java/com/jeffbrower/http/PathMatcher.java#L12
    Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-auth/src/test/java/org/apache/hadoop/security/authentication/util/TestKerberosUtil.java#L126
    Pattern.compile("HTTP/.*"),
    // https://github.com/mumbai-indians/hadoop/blob/a0da1ec01051108b77f86799dd5e97563b2a3962/hadoop-common-project/hadoop-auth/src/main/java/org/apache/hadoop/security/authentication/util/KerberosName.java#L69
    Pattern.compile("\\s*((DEFAULT)|(RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?(s/([^/]*)/([^/]*)/(g)?)?))/?(L)?"),
    // https://github.com/kaniGupta/ImageHoster/blob/3615b503f1c4df23ea9cf935bcc490c0642f277b/src/main/java/ImageHoster/controller/UserController.java#L110
    Pattern.compile("^(?=.*[0-9])((?=.*[a-z])|(?=.*[A-Z]))(?=.*[@#$%^&+=]).{3,}$"),
    // https://github.com/PhilippToeglhofer/MorrowporoDatabasePerformanceTests/blob/3650e77bf582ab1037622770d26788bedde0fee8/src/view/GUI_Elements.java#L392
    Pattern.compile("(^Morrow)"),
    // https://github.com/okccc/anoob/blob/27466ea8fa98a690e5ae6246373e73300c125253/ability/src/main/java/j2se/StringDemo.java#L148
    Pattern.compile("1[3,5,8]\\d{9}"),
    // https://github.com/okccc/anoob/blob/27466ea8fa98a690e5ae6246373e73300c125253/ability/src/main/java/j2se/StringDemo.java#L149
    Pattern.compile("([a-z]+) ([a-z]+)"),
    // https://github.com/okccc/anoob/blob/27466ea8fa98a690e5ae6246373e73300c125253/ability/src/main/java/j2se/StringDemo.java#L161
    Pattern.compile("(\\d{3})\\d{4}(\\d{3})"),
    // https://github.com/brucejohnson/comdnmr/blob/a536d46347a1632da4761ca78f71819d61952ada/src/main/java/org/comdnmr/data/DataIO.java#L120
    Pattern.compile("[^0-9]*([0-9]+)[^0-9]*"),
    // https://github.com/opendevstack/ods-provisioning-app/blob/d3a8105dc0b228d609ac6abd13a06d7776158687/src/main/java/org/opendevstack/provision/model/OpenProjectDataValidator.java#L33
    Pattern.compile("^(?!tests)(([A-Za-z][-A-Za-z]*)?[A-Za-z])?$"),
    // https://github.com/opendevstack/ods-provisioning-app/blob/d3a8105dc0b228d609ac6abd13a06d7776158687/src/main/java/org/opendevstack/provision/model/OpenProjectDataValidator.java#L36
    Pattern.compile("^(([A-Za-z][-A-Za-z0-9]*)?[A-Za-z0-9])?$"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/ntomcat/src/main/java/net/thevpc/nuts/toolbox/tomcat/util/ApacheTomcatRepositoryModel.java#L55
    Pattern.compile(".*-RC[0-9]+/"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/ntomcat/src/main/java/net/thevpc/nuts/toolbox/tomcat/util/ApacheTomcatRepositoryModel.java#L55
    Pattern.compile(".*-M[0-9]+/"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/nserver/src/main/java/net/thevpc/nuts/toolbox/nutsserver/NutsServerMain.java#L20
    Pattern.compile("((<?protocol>(http|https|admin))://)?(<host>[a-zA-Z0-9_-]+)(<port>:[0-9]+)?"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/njob/src/main/java/net/thevpc/nuts/toolbox/njob/time/TimePeriod.java#L11
    Pattern.compile("(?<val>[0-9]+([.][0-9]+)?)[ ]*(?<unit>([a-zA-Z]+))"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/njob/src/main/java/net/thevpc/nuts/toolbox/njob/time/TimeParser.java#L266
    Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/njob/src/main/java/net/thevpc/nuts/toolbox/njob/time/TimeParser.java#L269
    Pattern.compile("[0-9]{2}:[0-9]{2}"),
    // https://github.com/thevpc/nuts/blob/c661efff3d4ff4e2fb1ce10a7f116b45df69d943/toolbox/ndi/src/main/java/net/thevpc/nuts/toolbox/ndi/util/NdiUtils.java#L81
    Pattern.compile("[$][$](?<name>([^$]+))[$][$]"),
    // https://github.com/quyixiao/spring_tiny/blob/fa34c8dbdd0c4a2d00871cdfd9a2adb5d36634a0/src/main/java/com/utils/StringUtils.java#L39
    Pattern.compile("[\u4E00-\u9FA5|\\！|\\，|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]"),
    // https://github.com/quyixiao/spring_tiny/blob/fa34c8dbdd0c4a2d00871cdfd9a2adb5d36634a0/src/main/java/com/utils/StringUtils.java#L137
    Pattern.compile("[\\w]"),
    // https://github.com/quyixiao/spring_tiny/blob/fa34c8dbdd0c4a2d00871cdfd9a2adb5d36634a0/src/main/java/com/utils/StringUtils.java#L878
    Pattern.compile("(-)?\\d*(.\\d*)?"),
    // https://github.com/quyixiao/spring_tiny/blob/fa34c8dbdd0c4a2d00871cdfd9a2adb5d36634a0/src/main/java/com/utils/StringUtils.java#L963
    Pattern.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$"),
    // https://github.com/Miles-Hu/tij/blob/3455f751bf6ba893904950329237b7cd0a02bd21/strings/SplitDemo.java#L11
    Pattern.compile("!!"),
    // https://github.com/Miles-Hu/tij/blob/3455f751bf6ba893904950329237b7cd0a02bd21/strings/ReFlags.java#L6
    Pattern.compile("^java", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/pavan0169/myplacementscodes/blob/e82974090a96948e6266d0663748687cc6340d88/Practice2/regexexample/Example1.java#L11
    Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$"),
    // https://github.com/wangh0911/JavaReflection/blob/bfc1b1a5c192acf7b8a1fa79878827ac4eb8c632/src/main/java/com/javaguides/reflection/arrays/ArrayCreator.java#L13
    Pattern.compile("^\\s*(\\S+)\\s*\\w+\\[\\].*\\{\\s*([^}]+)\\s*\\}"),
    // https://github.com/self-xdsd/todo-finder-cli/blob/187f0f7599b3c77cedf8a6d73c94105c91c45152/src/main/java/com/selfxdsd/todocli/TodoParser.java#L68
    Pattern.compile("(\\s*[*])(\\s\\s)(.*)"),
    // https://github.com/self-xdsd/todo-finder-cli/blob/187f0f7599b3c77cedf8a6d73c94105c91c45152/src/main/java/com/selfxdsd/todocli/TodoParser.java#L94
    Pattern.compile("#\\d+:\\d+(m|min|mins)\\b"),
    // https://github.com/self-xdsd/todo-finder-cli/blob/187f0f7599b3c77cedf8a6d73c94105c91c45152/src/main/java/com/selfxdsd/todocli/TodoParser.java#L174
    Pattern.compile("[A-Za-z]+"),
    // https://github.com/NianDUI/ExerciseProject/blob/a42a9f44e6ab37cd849c0f190b004cd9ec3d4818/04%E5%B0%8F%E8%AF%B4%E5%92%8C%E6%BC%AB%E7%94%BB/fictionweb/src/main/java/top/niandui/common/uitls/file/EasyExcelWriteUtil.java#L199
    Pattern.compile("[^\\x00-\\xff]+"),
    // https://github.com/NianDUI/ExerciseProject/blob/a42a9f44e6ab37cd849c0f190b004cd9ec3d4818/04%E5%B0%8F%E8%AF%B4%E5%92%8C%E6%BC%AB%E7%94%BB/fictionweb/src/main/java/top/niandui/common/uitls/file/EasyExcelWriteUtil.java#L296
    Pattern.compile("^\\d*\\.\\d+0{7}\\d*$"),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1855
    Pattern.compile("%2C"),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1856
    Pattern.compile("%22"),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1857
    Pattern.compile("%27"),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1872
    Pattern.compile("\\<script[^>]*?>.*?\\<\\/script\\>", Pattern.CASE_INSENSITIVE),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1873
    Pattern.compile("\\<style[^>]*?>.*?\\<\\/style\\>", Pattern.CASE_INSENSITIVE),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1874
    Pattern.compile("\\<option[^>]*?>.*?\\<\\/option\\>", Pattern.CASE_INSENSITIVE),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1875
    Pattern.compile("\\<head\\>(.*?)\\<\\/head\\>", Pattern.CASE_INSENSITIVE),
    // https://github.com/HeainLee/manager-test/blob/857e26e82c43a820b390952c58a83e6ef5c366df/DataAnalyticsManager/src/main/java/com/daumsoft/dataAnalyticsManager/common/utils/StringUtil.java#L1876
    Pattern.compile("\\<.*?\\>", Pattern.CASE_INSENSITIVE),
    // https://github.com/water498/Delius1/blob/ba4317d8b88c81b2697dd165aaa8048a07ad2e8d/app/src/main/java/com/test/delius1/SignUp/AgreementActivity.java#L203
    Pattern.compile("서비스 이용 약관"),
    // https://github.com/water498/Delius1/blob/ba4317d8b88c81b2697dd165aaa8048a07ad2e8d/app/src/main/java/com/test/delius1/SignUp/AgreementActivity.java#L207
    Pattern.compile("개인 정보 취급 방침"),
    // https://github.com/water498/Delius1/blob/ba4317d8b88c81b2697dd165aaa8048a07ad2e8d/app/src/main/java/com/test/delius1/SignUp/AgreementActivity.java#L211
    Pattern.compile("이용 약관 서비스"),
    // https://github.com/VitorMartinezz/Trabalho_Pronota/blob/a418c9efac1164df6d62c8ab022d251ea62056f2/src/front/services/validators/EmailValidator.java#L23
    Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"),
    // https://github.com/zhengyi0802/MTVService/blob/8cc8e511ebd15fb5a2f5558cd567d34fbef3805a/DroidDLNA/src/main/java/org/fourthline/cling/model/types/DLNADoc.java#L32
    Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})"),
    // https://github.com/pahola-github/ClientRETO1/blob/4e4fd9ba0580e785ca8817d4abe124ff66fd12cb/src/clientreto1/controller/FXMLSignUpController.java#L249
    Pattern.compile("[a-z_A-Z_ _ñÑáÁéÉíÍóÓúÚ]+"),
    // https://github.com/MericLuc/CodinGame/blob/2f620e207694efb903cf498528ff9308d15c2ca7/Easy/equivalent-resistance-circuit-building.java#L9
    Pattern.compile("(\\([^()\\[\\]]+\\)|\\[[^()\\[\\]]+\\])"),
    // https://github.com/MericLuc/CodinGame/blob/2f620e207694efb903cf498528ff9308d15c2ca7/Easy/equivalent-resistance-circuit-building.java#L45
    Pattern.compile("([()\\[\\]])"),
    // https://github.com/alenfive/rocket-api/blob/c6d31c934ab2b7727eb54952dfd6b2b9bb156ee1/src/main/java/com/github/alenfive/rocketapi/service/ScriptParseService.java#L158
    Pattern.compile("(#|\\$)\\{[A-Za-z0-9-\\[\\]_\\.]+\\}"),
    // https://github.com/alenfive/rocket-api/blob/c6d31c934ab2b7727eb54952dfd6b2b9bb156ee1/src/main/java/com/github/alenfive/rocketapi/service/ScriptParseService.java#L336
    Pattern.compile(".+\\[\\d+\\]$"),
    // https://github.com/alenfive/rocket-api/blob/c6d31c934ab2b7727eb54952dfd6b2b9bb156ee1/src/main/java/com/github/alenfive/rocketapi/config/QLRequestMappingFactory.java#L212
    Pattern.compile("^applicationConfig.*"),
    // https://github.com/actiontech/dble/blob/7567e1ce91ef5e61caef799a2531bf763b65b4f3/src/main/java/com/actiontech/dble/services/rwsplit/RWSplitService.java#L29
    Pattern.compile(".*/\\*\\s*dble_dest_expect\\s*:\\s*([M|S])\\s*\\*/", Pattern.CASE_INSENSITIVE),
    // https://github.com/tatv98/RIM/blob/408101ded6ed14c8f0fa09d0b648c496a464c741/app/src/main/java/vn/icar/rim/device/serial/providers/USBProvider.java#L77
    Pattern.compile("^.*<([^>]+)>", Pattern.MULTILINE),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/independent-projects/resteasy-reactive/common/runtime/src/main/java/org/jboss/resteasy/reactive/common/util/PathHelper.java#L19
    Pattern.compile("\\{\\s*(\\w[\\w\\.-]*)\\s*(:\\s*([^{}][^{}]*))?\\}"),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/independent-projects/resteasy-reactive/common/runtime/src/main/java/org/jboss/resteasy/reactive/common/util/PathHelper.java#L21
    Pattern.compile("\\{\\s*(\\w[\\w\\.-]*)\\s*(:\\s*([^{}][^{}]*))\\}"),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/independent-projects/resteasy-reactive/common/runtime/src/main/java/org/jboss/resteasy/reactive/common/util/PathHelper.java#L23
    Pattern.compile("\\{(\\w[\\w\\.-]*)\\}"),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/independent-projects/resteasy-reactive/common/runtime/src/main/java/org/jboss/resteasy/reactive/common/util/PathHelper.java#L31
    Pattern.compile("(\\{([^}]+)\\})"),
    // https://github.com/MerlinRdev/ax89x/blob/d847c4cfc37f7e1ce71d84d7c81975673f19510f/release/src/router/strongswan/src/frontends/android/app/src/main/java/org/strongswan/android/logic/imc/collectors/PortFilterCollector.java#L31
    Pattern.compile("\\bLISTEN\\b"),
    // https://github.com/MerlinRdev/ax89x/blob/d847c4cfc37f7e1ce71d84d7c81975673f19510f/release/src/router/strongswan/src/frontends/android/app/src/main/java/org/strongswan/android/logic/imc/collectors/PortFilterCollector.java#L32
    Pattern.compile("\\b(tcp|udp)6?\\b"),
    // https://github.com/MerlinRdev/ax89x/blob/d847c4cfc37f7e1ce71d84d7c81975673f19510f/release/src/router/strongswan/src/frontends/android/app/src/main/java/org/strongswan/android/logic/imc/collectors/PortFilterCollector.java#L33
    Pattern.compile("[:]{1,3}(\\d{1,5})\\b(?!\\.)"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L45
    Pattern.compile("^[a-zA-Z]+$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L51
    Pattern.compile("^(\\d+)(.*)"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L53
    Pattern.compile("^[-+]?[1-9]\\d*$|^0$/"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L55
    Pattern.compile("[-\\+]?\\d+(\\.\\d+)?$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L71
    Pattern.compile("[\\-\\+]?\\d+(\\.\\d+)?$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L57
    Pattern.compile("^((\\(\\d{2,3}\\))|(\\d{3}\\-))?(\\(0\\d{2,3}\\)|0\\d{2,3}-)?[1-9]\\d{6,7}(\\-\\d{1,4})?$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L59
    Pattern.compile("^((\\+86)|(86))?(1)\\d{10}$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L63
    Pattern.compile("^[1-9]\\d{5}$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L65
    Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L67
    Pattern.compile("^(http|https|ftp):\\/\\/(([A-Z0-9][A-Z0-9_-]*)(\\.[A-Z0-9][A-Z0-9_-]*)+)(:(\\d+))?\\/?/i"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L69
    Pattern.compile("^[\\u0391-\\uFFE5]+$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L283
    Pattern.compile("^\\d{17}(\\d|X)$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L283
    Pattern.compile("\\d{15}$"),
    // https://github.com/zhangyingchengqi/picLib/blob/8b45dd0e195ec34c7505c4e4ea3ab170e3a34b3c/piclib-domain/src/main/java/com/yc/piclib/util/CommonUtils.java#L321
    Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"),
    // https://github.com/gridgain/gridgain/blob/bc008562684fa4e58a09c053a5b7896a12066d79/modules/control-utility/src/test/java/org/apache/ignite/util/GridCommandHandlerDefragmentationTest.java#L433
    Pattern.compile("default2 - size before/after: (\\S+)/\\1"),
    // https://github.com/geekup-legodevops/heroku-app/blob/2935c2478b551722f477ee0729649e1fe45531d0/app/server/appsmith-server/src/main/java/com/appsmith/server/services/LayoutActionServiceImpl.java#L54
    Pattern.compile("[a-zA-Z_][a-zA-Z0-9._]*"),
    // https://github.com/WeiShengPan/core-lib/blob/2e993f0f7521e30d18a99f709ff678e3454dd151/src/main/java/com/pws/javafeatures/io/baseio/FileTest.java#L60
    Pattern.compile("Range.*?"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/mediafilter/ImageMagickThumbnailFilter.java#L40
    Pattern.compile("Generated Thumbnail"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/app/itemupdate/ContentsEntry.java#L36
    Pattern.compile("-([rw])\\s*'?([^']+)'?"),
    // https://github.com/mochi356/hometask/blob/b90cf9149cfc199bff9cb5237df931465a57102e/src/main/java/task/MailCheck.java#L15
    Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"),
    // https://github.com/Dylmay/uni_libsgx_sdk/blob/e6d785a59239663e325e02aba21db9eee571cb53/Linux_SGXEclipsePlugin/build_directory/plugins/com.intel.sgx/src/com/intel/sgx/testers/SGXPropertyTester.java#L27
    Pattern.compile(".*Release.*"),
    // https://github.com/Dylmay/uni_libsgx_sdk/blob/e6d785a59239663e325e02aba21db9eee571cb53/Linux_SGXEclipsePlugin/build_directory/plugins/com.intel.sgx/src/com/intel/sgx/testers/SGXPropertyTester.java#L28
    Pattern.compile(".*Hardware.*"),
    // https://github.com/Dylmay/uni_libsgx_sdk/blob/e6d785a59239663e325e02aba21db9eee571cb53/Linux_SGXEclipsePlugin/build_directory/plugins/com.intel.sgx/src/com/intel/sgx/testers/SGXPropertyTester.java#L29
    Pattern.compile(".*Prerelease.*"),
    // https://github.com/hemantbeast/packages_apps_Launcher3/blob/e28504e313248c427117ba2e3697ee8931da03a1/tests/tapl/com/android/launcher3/tapl/AddToHomeScreenPrompt.java#L31
    Pattern.compile("^Add automatically$", Pattern.CASE_INSENSITIVE),
    // https://github.com/hemantbeast/packages_apps_Launcher3/blob/e28504e313248c427117ba2e3697ee8931da03a1/tests/src/com/android/launcher3/util/rule/TestStabilityRule.java#L41
    Pattern.compile("^((?<local>(BuildFromAndroidStudio|([0-9]+|[A-Z])-eng\\.[a-z]+\\.[0-9]+\\.[0-9]+))|(?<presubmit>([0-9]+|[A-Z])-P[0-9]+)|(?<postsubmit>([0-9]+|[A-Z])-[0-9]+)|(?<platform>[0-9]+|[A-Z]))$"),
    // https://github.com/hemantbeast/packages_apps_Launcher3/blob/e28504e313248c427117ba2e3697ee8931da03a1/tests/src/com/android/launcher3/util/rule/TestStabilityRule.java#L49
    Pattern.compile("^((?<commandLine>eng\\.[a-z]+\\.[0-9]+\\.[0-9]+)|(?<presubmit>P[0-9]+)|(?<postsubmit>[0-9]+))$"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L53
    Pattern.compile("reddit\\.com/u/"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L59
    Pattern.compile("^https?://[a-zA-Z0-9.]{0,4}reddit\\.com/gallery/([a-zA-Z0-9]+).*$"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L273
    Pattern.compile("https?://i.reddituploads.com/([a-zA-Z0-9]+)\\?.*"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L337
    Pattern.compile("^https?://[a-zA-Z0-9.]{0,4}reddit\\.com/(user|u)/([a-zA-Z0-9_\\-]{3,}).*$"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L344
    Pattern.compile("^https?://[a-zA-Z0-9.]{0,4}reddit\\.com/.*comments/([a-zA-Z0-9]{1,8}).*$"),
    // https://github.com/RipMeApp/ripme/blob/bddda276e3b3b94330decd138beea587f9b69777/src/main/java/com/rarchives/ripme/ripper/rippers/RedditRipper.java#L358
    Pattern.compile("^https?://[a-zA-Z0-9.]{0,4}reddit\\.com/r/([a-zA-Z0-9_]+).*$"),
    // https://github.com/RipMeApp/ripme/blob/4e8d17ec168e9c076ebfc37db540c7ffd52962e9/src/main/java/com/rarchives/ripme/ripper/rippers/AllporncomicRipper.java#L35
    Pattern.compile("https?://allporncomic.com/porncomic/([a-zA-Z0-9_\\-]+)/([a-zA-Z0-9_\\-]+)/?$"),
    // https://github.com/RipMeApp/ripme/blob/4e8d17ec168e9c076ebfc37db540c7ffd52962e9/src/main/java/com/rarchives/ripme/ripper/rippers/AllporncomicRipper.java#L40
    Pattern.compile("^https?://allporncomic.com/porncomic/([a-zA-Z0-9_\\-]+)/?$"),
    // https://github.com/instaclustr/esop/blob/ec549ec8b9d8b9018ba337b6f00f7d2f23231234/src/main/java/com/instaclustr/esop/impl/backup/BackupCommitLogsOperation.java#L137
    Pattern.compile("CommitLog-\\d+-\\d+\\.log"),
    // https://github.com/KaappoRaivio/shakki2/blob/f988ffddaccfd8cd040153603b001b0cf4cda2e3/src/main/java/misc/Position.java#L13
    Pattern.compile("^[a-hA-H]\\d$"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/phonenumbers/PhoneNumbersRegexUnitTest.java#L28
    Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/phonenumbers/PhoneNumbersRegexUnitTest.java#L56
    Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/phonenumbers/PhoneNumbersRegexUnitTest.java#L77
    Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/phonenumbers/PhoneNumbersRegexUnitTest.java#L99
    Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/matcher/MatcherUnitTest.java#L16
    Pattern.compile("\\d\\d\\d\\d"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/regex/countmatches/CountMatchesUnitTest.java#L17
    Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/test/java/com/baeldung/patternreuse/PatternUnitTest.java#L17
    Pattern.compile("[a-zA-Z]{3,} [a-zA-Z]{3,}"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/main/java/com/baeldung/replacetokens/ReplacingTokens.java#L8
    Pattern.compile("(?<=^|[^A-Za-z])([A-Z][a-z]*)(?=[^A-Za-z]|$)"),
    // https://github.com/tfantas/spring-example/blob/0619ece251390dacf94e1f6e09716672409e8575/core-java-modules/core-java-regex/src/main/java/com/baeldung/patternreuse/PatternPerformanceComparison.java#L22
    Pattern.compile("\\d*[02468]"),
    // https://github.com/iznauy/sql-optimization/blob/e9115ddda04d7391a29595feaca930a01ea30aa3/src/main/java/cn/edu/tsinghua/dataset/Dataset.java#L59
    Pattern.compile("(project_[^\\s]*)\\s*([^\\s]*)\\s*([^\\s]*)\\s*([^\\s]*)"),
    // https://github.com/epam/cloud-pipeline/blob/937600a2e2e044b63d16c7f691efafea5becf86d/api/src/main/java/com/epam/pipeline/dao/metadata/MetadataEntityDao.java#L58
    Pattern.compile("@KEY@"),
    // https://github.com/epam/cloud-pipeline/blob/937600a2e2e044b63d16c7f691efafea5becf86d/api/src/main/java/com/epam/pipeline/dao/metadata/MetadataEntityDao.java#L59
    Pattern.compile("@VALUE@"),
    // https://github.com/epam/cloud-pipeline/blob/937600a2e2e044b63d16c7f691efafea5becf86d/api/src/main/java/com/epam/pipeline/dao/metadata/MetadataEntityDao.java#L60
    Pattern.compile("@WHERE_CLAUSE@"),
    // https://github.com/epam/cloud-pipeline/blob/937600a2e2e044b63d16c7f691efafea5becf86d/api/src/main/java/com/epam/pipeline/dao/metadata/MetadataEntityDao.java#L61
    Pattern.compile("@ORDER_CLAUSE@"),
    // https://github.com/epam/cloud-pipeline/blob/937600a2e2e044b63d16c7f691efafea5becf86d/api/src/main/java/com/epam/pipeline/dao/metadata/MetadataEntityDao.java#L62
    Pattern.compile("@QUERY@"),
    // https://github.com/ISEL-HGU/NGLPExperimentalDataExtractor/blob/a303af788d13e3fab984b5a7b4f65d5546360176/src/main/java/edu/handong/csee/isel/metric/collector/ArffHelper.java#L27
    Pattern.compile("(\\{|,)(\\d+)\\s"),
    // https://github.com/ISEL-HGU/NGLPExperimentalDataExtractor/blob/a303af788d13e3fab984b5a7b4f65d5546360176/src/main/java/edu/handong/csee/isel/metric/collector/ArffHelper.java#L30
    Pattern.compile("\\{.+\\,\\d+\\s(.+)\\}"),
    // https://github.com/ISEL-HGU/NGLPExperimentalDataExtractor/blob/a303af788d13e3fab984b5a7b4f65d5546360176/src/main/java/edu/handong/csee/isel/metric/collector/ArffHelper.java#L413
    Pattern.compile("(\\d+)\\s(\\d+\\.?\\d*)"),
    // https://github.com/ISEL-HGU/NGLPExperimentalDataExtractor/blob/a303af788d13e3fab984b5a7b4f65d5546360176/src/main/java/edu/handong/csee/isel/bfc/collector/github/IssueLinkParser.java#L52
    Pattern.compile("<.+\\\"(.+)/.+\\\".+\\\".+\\\">.+"),
    // https://github.com/wangchao-web/confinterface/blob/8968c4fcf0bace01fc1ec95c540f7cab867d4a23/src/main/java/com/kedacom/confinterface/service/TerminalService.java#L2438
    Pattern.compile("[0-9a-fA-F]*"),
    // https://github.com/andyludeveloper/functional_thinking_example/blob/bf7745804df44fc699a838ee975a7a6643dbed81/src/main/java/com/andyludeveloper/functional_thinking/ch1/Words.java#L31
    Pattern.compile("\\w+"),
    // https://github.com/KnIfER/PolymPic/blob/8fbc62819df6580028df1464631330185f1b16bd/ActivityLauncher/src/main/java/com/knziha/polymer/Toastable_Activity.java#L334
    Pattern.compile("[a-z0-9_-]+\\.[0-9]{1,3}"),
    // https://github.com/bamboolife/PictureSelector/blob/1673f01541eb9129b68ab43c8bc65c578dfe6c2a/ucrop/src/main/java/com/yalantis/ucrop/immersion/CropRomUtils.java#L64
    Pattern.compile("Flyme"),
    // https://github.com/bamboolife/PictureSelector/blob/1673f01541eb9129b68ab43c8bc65c578dfe6c2a/ucrop/src/main/java/com/yalantis/ucrop/immersion/CropRomUtils.java#L65
    Pattern.compile("OS"),
    // https://github.com/bamboolife/PictureSelector/blob/1673f01541eb9129b68ab43c8bc65c578dfe6c2a/ucrop/src/main/java/com/yalantis/ucrop/immersion/CropRomUtils.java#L137
    Pattern.compile("^[-\\+]?[\\d]+$"),
    // https://github.com/denisacosta97/Bienestar-Estudiantil/blob/096edf355c3e969d2a2755b4c819dcf819de5733/app/src/main/java/com/unse/bienestar/estudiantil/Vistas/Activities/Inicio/MainActivity.java#L410
    Pattern.compile("[a-zA-Z0-9 ]+"),
    // https://github.com/denisacosta97/Bienestar-Estudiantil/blob/096edf355c3e969d2a2755b4c819dcf819de5733/app/src/main/java/com/unse/bienestar/estudiantil/Vistas/Activities/Inicio/MainActivity.java#L416
    Pattern.compile("-[0-9]+"),
    // https://github.com/denisacosta97/Bienestar-Estudiantil/blob/096edf355c3e969d2a2755b4c819dcf819de5733/app/src/main/java/com/unse/bienestar/estudiantil/Herramientas/Utils.java#L709
    Pattern.compile("!="),
    // https://github.com/denisacosta97/Bienestar-Estudiantil/blob/096edf355c3e969d2a2755b4c819dcf819de5733/app/src/main/java/com/unse/bienestar/estudiantil/Herramientas/Utils.java#L710
    Pattern.compile("=!"),
    // https://github.com/denisacosta97/Bienestar-Estudiantil/blob/096edf355c3e969d2a2755b4c819dcf819de5733/app/src/main/java/com/unse/bienestar/estudiantil/Herramientas/Utils.java#L967
    Pattern.compile("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1066
    Pattern.compile("(\r\n|\r|\n|\n\r)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1084
    Pattern.compile("(\r\n)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1087
    Pattern.compile("(\n\r)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1090
    Pattern.compile("(\r)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1093
    Pattern.compile("(\n)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1104
    Pattern.compile("(#%#RNNEWLINEANDENTERFORFORMITEMENCODE#%#)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1107
    Pattern.compile("(#%#RNENTERANDNEWLINEFORFORMITEMENCODE#%#)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1110
    Pattern.compile("(#%#RNNEWLINEFORFORMITEMENCODE#%#)"),
    // https://github.com/bigFaceCatW/KNOW/blob/43d43d4a11883bd11135f0a6935e866fa964fffa/src/main/java/com/know/util/StringUtil.java#L1113
    Pattern.compile("(#%#RNENTERFORFORMITEMENCODE#%#)"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-spring/src/main/java/com/alibaba/dubbo/config/spring/schema/DubboBeanDefinitionParser.java#L59
    Pattern.compile("^[\\-.0-9_a-zA-Z]+(\\:[\\-.0-9_a-zA-Z]+)?$"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L51
    Pattern.compile("[\\-._0-9a-zA-Z]+"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L53
    Pattern.compile("[,\\-._0-9a-zA-Z]+"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L55
    Pattern.compile("[a-zA-Z][0-9a-zA-Z]*"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L57
    Pattern.compile("[/\\-$._0-9a-zA-Z]+"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L59
    Pattern.compile("[:*,/\\-._0-9a-zA-Z]+"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-config/dubbo-config-api/src/main/java/com/alibaba/dubbo/config/AbstractConfig.java#L61
    Pattern.compile("[*,\\-._0-9a-zA-Z]+"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/StringUtils.java#L43
    Pattern.compile("([_.a-zA-Z0-9][-_.a-zA-Z0-9]*)[=](.*)"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ReflectUtils.java#L105
    Pattern.compile("(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)|(?:\\[+(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;))))"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ReflectUtils.java#L109
    Pattern.compile("(?:((?:[_$a-zA-Z][_$a-zA-Z0-9]*))?\\(((?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)|(?:\\[+(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;))))*)\\)((?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)|(?:\\[+(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)))))?)"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ReflectUtils.java#L113
    Pattern.compile("get([A-Z][_a-zA-Z0-9]*)\\(\\)((?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)|(?:\\[+(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)))))"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ReflectUtils.java#L115
    Pattern.compile("set([A-Z][_a-zA-Z0-9]*)\\(((?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)|(?:\\[+(?:(?:[VZBCDFIJS])|(?:L(?:[_$a-zA-Z][_$a-zA-Z0-9]*)(?:\\/(?:[_$a-zA-Z][_$a-zA-Z0-9]*))*;)))))\\)V"),
    // https://github.com/YOUYOU-xcu/dubbo-admin/blob/9362181d1285fe89d345ebf92ec4186353f1fd02/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ReflectUtils.java#L117
    Pattern.compile("(?:is|has|can)([A-Z][_a-zA-Z0-9]*)\\(\\)Z"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L70
    Pattern.compile("<div class=\"gdtm\"[^<>]*><div[^<>]*width:(\\d+)[^<>]*height:(\\d+)[^<>]*\\((.+?)\\)[^<>]*-(\\d+)px[^<>]*><a[^<>]*href=\"(.+?)\"[^<>]*><img alt=\"([\\d,]+)\""),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/ArchiveParser.java#L28
    Pattern.compile("<form id=\"hathdl_form\" action=\"[^\"]*?or=([^=\"]*?)\" method=\"post\">"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/ArchiveParser.java#L29
    Pattern.compile("<a href=\"[^\"]*\" onclick=\"return do_hathdl\\('([0-9]+|org)'\\)\">([^<]+)</a>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L64
    Pattern.compile("[(\\[]eng(?:lish)?[)\\]]|英訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L66
    Pattern.compile("[(\uFF08\\[]ch(?:inese)?[)\uFF09\\]]|[汉漢]化|中[国國][语語]|中文|中国翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L67
    Pattern.compile("[(\\[]spanish[)\\]]|[(\\[]Español[)\\]]|スペイン翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L68
    Pattern.compile("[(\\[]korean?[)\\]]|韓国翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L69
    Pattern.compile("[(\\[]rus(?:sian)?[)\\]]|ロシア翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L70
    Pattern.compile("[(\\[]fr(?:ench)?[)\\]]|フランス翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L71
    Pattern.compile("[(\\[]portuguese|ポルトガル翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L72
    Pattern.compile("[(\\[]thai(?: ภาษาไทย)?[)\\]]|แปลไทย|タイ翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L73
    Pattern.compile("[(\\[]german[)\\]]|ドイツ翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L74
    Pattern.compile("[(\\[]italiano?[)\\]]|イタリア翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L75
    Pattern.compile("[(\\[]vietnamese(?: Tiếng Việt)?[)\\]]|ベトナム翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L76
    Pattern.compile("[(\\[]polish[)\\]]|ポーランド翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L77
    Pattern.compile("[(\\[]hun(?:garian)?[)\\]]|ハンガリー翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/data/GalleryInfo.java#L78
    Pattern.compile("[(\\[]dutch[)\\]]|オランダ翻訳", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/EhUtils.java#L50
    Pattern.compile("^(?:(?:\\([^\\)]*\\))|(?:\\[[^\\]]*\\])|(?:\\{[^\\}]*\\})|(?:~[^~]*~)|\\s+)*"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/EhUtils.java#L53
    Pattern.compile("(?:\\s+ch.[\\s\\d-]+)?(?:(?:\\([^\\)]*\\))|(?:\\[[^\\]]*\\])|(?:\\{[^\\}]*\\})|(?:~[^~]*~)|\\s+)*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/EhEngine.java#L85
    Pattern.compile("(You must have a H@H client assigned to your account to use this feature\\.)"),
    // https://github.com/FZ985/GitHubPros/blob/d32f11955bda0892025296efccdb08cb49d8a842/KtxPro/KTX1/200430App29/src/main/java/com/app/api29/utils/Tools.java#L425
    Pattern.compile("^[A-Za-z_\u4e00-\u9fa5]+$"),
    // https://github.com/FZ985/GitHubPros/blob/d32f11955bda0892025296efccdb08cb49d8a842/KtxPro/KTX1/200430App29/src/main/java/com/app/api29/utils/Tools.java#L911
    Pattern.compile("^(0|86|17951)?(13[0-9]|15[012356789]|16[0123456789]|17[0123456789]|18[0-9]|14[0-9]|19[0-9])[0-9]{8}$"),
    // https://github.com/FZ985/GitHubPros/blob/d32f11955bda0892025296efccdb08cb49d8a842/KtxPro/KTX1/200430App29/src/main/java/com/app/api29/utils/Sort.java#L26
    Pattern.compile("[a-zA-Z]"),
    // https://github.com/bmk15897/Runtime-Terror-Shramik-Bal/blob/7530daae258e69b24d5a3184993d89223d39f718/ShramikBal/src/main/java/com/example/demo/service/LoginService.java#L38
    Pattern.compile("\\d{12}"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/resource/src/main/java/com/exc/street/light/resource/utils/RegexUtil.java#L33
    Pattern.compile("[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/resource/src/main/java/com/exc/street/light/resource/utils/RegexUtil.java#L46
    Pattern.compile("(\\-?)(?:[0-9]|[1-9][0-9]|1[0-7][0-9])\\.([0-9]{1,17})|(180\\.0{1,17})"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/resource/src/main/java/com/exc/street/light/resource/utils/RegexUtil.java#L59
    Pattern.compile("(\\-?)(?:[0-9]|[1-8][0-9])\\.([0-9]{1,17})|(90\\.0{1,17})"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/em/src/main/java/com/exc/street/light/em/service/impl/MeteorologicalDeviceServiceImpl.java#L756
    Pattern.compile("(\\d+\\.\\d+)"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/electricity/src/main/java/com/exc/street/light/electricity/listener/ElectricityNodeImportListener.java#L74
    Pattern.compile("^[A-F0-9]{2}(-[A-F0-9]{2}){5}$"),
    // https://github.com/605408609/street_light_yancheng/blob/5d0d4fd4af0eb6b54f7e1ecef9651a3b9208d7f7/electricity/src/main/java/com/exc/street/light/electricity/listener/ElectricityNodeImportListener.java#L75
    Pattern.compile("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])$"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/security/util/DisabledAlgorithmConstraints.java#L230
    Pattern.compile("denyAfter\\s+(\\d{4})-(\\d{2})-(\\d{2})"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/security/util/AlgorithmDecomposer.java#L41
    Pattern.compile("with|and", Pattern.CASE_INSENSITIVE),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/src/share/classes/sun/security/ssl/Utilities.java#L42
    Pattern.compile("\\r\\n|\\n|\\r"),
    // https://github.com/smith5623/mybatis/blob/af98b6c6c7c4795f0220337aa585a1c1c903863e/generator/src/main/java/com/cscsc/common/utils/CreatePdf.java#L218
    Pattern.compile("\\$\\{[A-Za-z1-9_.]+\\}"),
    // https://github.com/smith5623/mybatis/blob/af98b6c6c7c4795f0220337aa585a1c1c903863e/generator/src/main/java/com/cscsc/common/utils/CreatePdf.java#L275
    Pattern.compile("∙"),
    // https://github.com/smith5623/mybatis/blob/af98b6c6c7c4795f0220337aa585a1c1c903863e/generator/src/main/java/com/cscsc/common/persistence/Page.java#L447
    Pattern.compile("(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)", Pattern.CASE_INSENSITIVE),
    // https://github.com/GabrielBuenoOliveira/password/blob/29a0405b923becbaabec10daaae228ce2ac38448/src/main/java/com/gabriel/service/validation/UpperCaseValidation.java#L7
    Pattern.compile("([A-Z\\u00C0-\\u00DD])"),
    // https://github.com/GabrielBuenoOliveira/password/blob/29a0405b923becbaabec10daaae228ce2ac38448/src/main/java/com/gabriel/service/validation/SymbolValidation.java#L7
    Pattern.compile("([!@#$%^&*()-+])"),
    // https://github.com/GabrielBuenoOliveira/password/blob/29a0405b923becbaabec10daaae228ce2ac38448/src/main/java/com/gabriel/service/validation/LowerCaseValidation.java#L7
    Pattern.compile("([a-z\\u00E0-\\u00FF])"),
    // https://github.com/xlf19/PurchasingCenter/blob/602439851697dd2dbcd685b03004ff0427bf3bd8/jeecg-boot/jeecg-boot-base-common/src/main/java/org/jeecg/common/system/query/QueryGenerator.java#L576
    Pattern.compile("\\#\\{\\w+\\}"),
    // https://github.com/zcxiyou/platform/blob/eecbeacdfc3b43234f5dc1a8b7794bb2895f8d00/hx-common/src/main/java/com/hx/common/utils/SimpleUtil.java#L1250
    Pattern.compile("^[1](([3][0-9])|([4][5,7,9])|([5][^4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$"),
    // https://github.com/huyvu96/react-native/blob/eaf0da241af42bbc6db0d777cfcf7651aef7fde5/ReactAndroid/src/main/java/com/facebook/react/util/JSStackTrace.java#L20
    Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)"),
    // https://github.com/huyvu96/react-native/blob/eaf0da241af42bbc6db0d777cfcf7651aef7fde5/ReactAndroid/src/main/java/com/facebook/react/devsupport/StackTraceHelper.java#L30
    Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$"),
    // https://github.com/huyvu96/react-native/blob/eaf0da241af42bbc6db0d777cfcf7651aef7fde5/ReactAndroid/src/main/java/com/facebook/react/devsupport/StackTraceHelper.java#L32
    Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$"),
    // https://github.com/huyvu96/react-native/blob/eaf0da241af42bbc6db0d777cfcf7651aef7fde5/ReactAndroid/src/main/java/com/facebook/react/devsupport/BundleDownloader.java#L146
    Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\""),
    // https://github.com/huyvu96/react-native/blob/eaf0da241af42bbc6db0d777cfcf7651aef7fde5/ReactAndroid/src/main/java/com/facebook/react/animated/InterpolationAnimatedNode.java#L30
    Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?"),
    // https://github.com/MrSimppleH/Simple/blob/45ab9d5bb9fcbe953873a76f0577fcb1edd0bb33/src/main/java/com/computer/campaign/service/impl/SuperUserServiceImpl.java#L47
    Pattern.compile(".*\\d+.*"),
    // https://github.com/hejiehui/xDecision/blob/ffbd9158b370ebd827b84055d4de435e2f07c281/com.xrosstools.xdecision/src/com/xrosstools/xdecision/ext/XrossEvaluatorConstants.java#L35
    Pattern.compile("[a-zA-Z][a-zA-Z0-9_]*"),
    // https://github.com/xs19951018/springboot-collect/blob/8666a3ebb5c0e3b8ba7e2b9a64ca2172f5df6d5a/springboot-selenium/src/test/java/com/my/springbootselenium/test/TestReg.java#L14
    Pattern.compile("<p>(您好，您管理的网络.+?)：<\\/p><p>\\n告警来源：(.+?)<br>告警级别：(.+?)<br>设备IP：(.+?)<br>告警类型：(.+?)<br>告警产生时间：(.+?)<\\/p><p>(.+?)<\\/p>"),
    // https://github.com/xs19951018/springboot-collect/blob/8666a3ebb5c0e3b8ba7e2b9a64ca2172f5df6d5a/springboot-selenium/src/test/java/com/my/springbootselenium/test/TestReg.java#L15
    Pattern.compile("<p>(您好，您管理的网络.+?)：<\\/p><p>\\n告警来源：(.+?)<br>告警级别：(.+?)<br>设备IP：(.+?)<br>告警类型：(.+?)<br>告警产生时间：(.+?)<\\/p>"),
    // https://github.com/xs19951018/springboot-collect/blob/8666a3ebb5c0e3b8ba7e2b9a64ca2172f5df6d5a/springboot-selenium/src/test/java/com/my/springbootselenium/test/TestReg.java#L16
    Pattern.compile("<p>(您好，您管理的网络.+?)：<\\/p><p>\\n告警来源：(.+?)<br>告警级别：(.+?)<br>告警类型：(.+?)<br>告警产生时间：(.+?)<\\/p>"),
    // https://github.com/xs19951018/springboot-collect/blob/8666a3ebb5c0e3b8ba7e2b9a64ca2172f5df6d5a/springboot-selenium/src/test/java/com/my/springbootselenium/test/TestReg.java#L18
    Pattern.compile("<p>(您好，您管理的网络.+?)：<\\/p><p>\\n告警来源：(.+?)<br>设备IP：(.+?)<br>告警类型：(.+?)<br>告警产生时间：(.+?)<br>告警消除时间：(.+?)<br>告警持续时间：(.+?)<\\/p><p>(.+?)<\\/p>"),
    // https://github.com/xs19951018/springboot-collect/blob/8666a3ebb5c0e3b8ba7e2b9a64ca2172f5df6d5a/springboot-selenium/src/test/java/com/my/springbootselenium/test/TestReg.java#L19
    Pattern.compile("<p>(您好，您管理的网络.+?)：<\\/p><p>\\n告警来源：(.+?)<br>设备IP：(.+?)<br>告警类型：(.+?)<br>告警产生时间：(.+?)<br>告警消除时间：(.+?)<br>告警持续时间：(.+?)<\\/p>"),
    // https://github.com/rymndlys/PatientLogin/blob/074bccc14285e8c589af9226685f0a64169c2d40/app/src/main/java/com/example/patientlogin/PatientRegister.java#L171
    Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/user/ui/EditWindow.java#L3329
    Pattern.compile(".*LE\\.getdrive.*"),
    // https://github.com/lwjhn/domino2sql/blob/3ac179391c1d310f2d411641a5ae30efd4d69efa/src/com/lwjhn/domino2sql/config/DefaultConfig.java#L22
    Pattern.compile("^(_|[a-zA-Z])(_|[a-zA-Z0-9])*$"),
    // https://github.com/lwjhn/domino2sql/blob/3ac179391c1d310f2d411641a5ae30efd4d69efa/src/com/lwjhn/domino2sql/config/DefaultConfig.java#L23
    Pattern.compile("^(_|[a-zA-Z])(_|[a-zA-Z0-9])*((\\.(_|[a-zA-Z])(_|[a-zA-Z0-9])*)$|$)"),
    // https://github.com/lwjhn/domino2sql/blob/3ac179391c1d310f2d411641a5ae30efd4d69efa/src/com/lwjhn/LtpaToken.java#L9
    Pattern.compile("((?<==)|^)[^/=]*((?=/)|$)"),
    // https://github.com/actiontech/dble/blob/158d79ea94853de0b48ffa4c96ce7e5438cbe15a/src/main/java/com/actiontech/dble/config/loader/xml/XMLUserLoader.java#L46
    Pattern.compile("^[0|1]{4}$"),
    // https://github.com/actiontech/dble/blob/158d79ea94853de0b48ffa4c96ce7e5438cbe15a/src/main/java/com/actiontech/dble/config/loader/xml/XMLDbLoader.java#L41
    Pattern.compile("([a-zA-Z_0-9\\-\\.]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/priyankasalian91/SomoCom/blob/1f4775324713d87df63bf5a15f080b73129065b2/src/main/java/com/aipl/store/controller/AccountController.java#L500
    Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,20}$"),
    // https://github.com/bbepis/Apollo-X/blob/eee48aa104b7c38597c0eec5887d6d6d20bb4e4c/app/src/main/java/io/bepis/apollox/lastfm/StringUtilities.java#L42
    Pattern.compile("[a-fA-F0-9]{32}"),
    // https://github.com/bbepis/Apollo-X/blob/eee48aa104b7c38597c0eec5887d6d6d20bb4e4c/app/src/main/java/io/bepis/apollox/lastfm/StringUtilities.java#L138
    Pattern.compile("[*:/\\\\?|<>\"]"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L49
    Pattern.compile("</a></p>"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L49
    Pattern.compile("<p><a"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L58
    Pattern.compile("<p>&nbsp;</p>"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L67
    Pattern.compile("&nbsp;&nbsp;"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L81
    Pattern.compile("title=\"\""),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L90
    Pattern.compile("aria-label=\"\""),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L99
    Pattern.compile("<br><br>"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L113
    Pattern.compile("(&nbsp;)*(?=(<\\/a>))"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L113
    Pattern.compile(" *(?=(<\\/a>))"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L114
    Pattern.compile("(?<=(<a [^>]+>))(&nbsp;)*"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L114
    Pattern.compile("(?<=(<a [^>]+>)) *"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L125
    Pattern.compile("<a(.*?) target=\"_blank\"(.*?)>(.*?)</a>"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L126
    Pattern.compile("<a(.*?)title=\"(.*?)\"(.*?)</a>"),
    // https://github.com/departement-loire-atlantique/jPlatformSocle/blob/bd5b5aec37680235121c8916f8d296800a4f0551/WEB-INF/classes/fr/cg44/plugin/socle/policyfilter/WysiwygPolicyFilter.java#L144
    Pattern.compile("blank\""),
    // https://github.com/leesiri1004/Java/blob/cd1a5955fe9a412c7eec8da492ef0a6633e3ef58/Ch12/src/p339/ReEx3.java#L13
    Pattern.compile("(0\\d{1,2})-(\\d{3,4})-(\\d{4})"),
    // https://github.com/leesiri1004/Java/blob/cd1a5955fe9a412c7eec8da492ef0a6633e3ef58/Ch12/src/p339/ReEx3.java#L14
    Pattern.compile("(\\w+)@(\\w+).(\\w+)"),
    // https://github.com/leesiri1004/Java/blob/cd1a5955fe9a412c7eec8da492ef0a6633e3ef58/Ch12/src/p339/ReEx3.java#L15
    Pattern.compile("(\\d{3})-(\\d{2})-(\\d{6})"),
    // https://github.com/leesiri1004/Java/blob/cd1a5955fe9a412c7eec8da492ef0a6633e3ef58/Ch12/src/p336/ReEx.java#L11
    Pattern.compile("b[a-z]*"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/537c086c727b0d44a0edb94e7512be5b5bdebe4c/services/core/java/com/android/server/tv/TvInputManagerService.java#L113
    Pattern.compile("^dvb([0-9]+)\\.frontend([0-9]+)$"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/537c086c727b0d44a0edb94e7512be5b5bdebe4c/services/core/java/com/android/server/tv/TvInputManagerService.java#L115
    Pattern.compile("^adapter([0-9]+)$"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/537c086c727b0d44a0edb94e7512be5b5bdebe4c/services/core/java/com/android/server/tv/TvInputManagerService.java#L117
    Pattern.compile("^frontend([0-9]+)$"),
    // https://github.com/YuriShido/Java-final-project/blob/381fa1bc8ec8cd916dca860c3fc351b2309d625f/src/ca/java/test/Check.java#L9
    Pattern.compile("^[\\w!#$%&�e*+/=?`{|}~^-]+(?:\\.[\\w!#$%&�e*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"),
    // https://github.com/IceTeaIsLife/edu_java/blob/d079318a1cf992a983ec33d55548dc161f9f10ba/Projects/src/main/java/Practice_14/Main.java#L13
    Pattern.compile("(?<rule>\\w+) (?<on>\\w+)"),
    // https://github.com/IceTeaIsLife/edu_java/blob/d079318a1cf992a983ec33d55548dc161f9f10ba/Projects/src/main/java/Practice_14/LineCoder.java#L58
    Pattern.compile("(?<toFind>\\w+) (?<replaceTo>\\w+)"),
    // https://github.com/akash89bis/StudentApp/blob/d651452a77079da1bbb1bfbea14c85353e6aec92/app/src/main/java/com/example/studentapp/view/util/NameFilter.java#L18
    Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]*"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/YouTubeDLExternalVideoProvider.java#L136
    Pattern.compile("https?:\\/\\/(?:www\\.)?youtube\\.com\\/watch\\?v=(\\S*)$"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/VimeoDLExternalVideoProvider.java#L158
    Pattern.compile("https?:\\/\\/(?:www\\.)?vimeo\\.com\\/album\\/.*\\/video\\/(\\S*)"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/VimeoDLExternalVideoProvider.java#L161
    Pattern.compile("https?:\\/\\/(?:www\\.)?vimeo\\.com\\/showcase\\/.*\\/video\\/(\\S*)"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/VimeoDLExternalVideoProvider.java#L164
    Pattern.compile("https?:\\/\\/(?:www\\.)?vimeo\\.com\\/channels\\/.*\\/(\\S*)"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/VimeoDLExternalVideoProvider.java#L166
    Pattern.compile("https?:\\/\\/(?:www\\.)?vimeo\\.com\\/groups\\/.*\\/videos\\/(\\S*)"),
    // https://github.com/liferay/liferay-portal/blob/5c2f7d47da7d4c9e1b0259cd8cd024115efbd929/modules/apps/document-library/document-library-external-video/src/main/java/com/liferay/document/library/external/video/internal/provider/VimeoDLExternalVideoProvider.java#L168
    Pattern.compile("https?:\\/\\/(?:www\\.)?vimeo\\.com\\/(\\S*)$"),
    // https://github.com/gtu001/gtu-test-code/blob/59d1dee091a67268fe2f54f21e9ad882aa59f468/GTU/src/gtu/_work/ui/DMMVRPlayerHotKeyUI.java#L798
    Pattern.compile("(\\d+)x(\\d+)"),
    // https://github.com/gtu001/gtu-test-code/blob/59d1dee091a67268fe2f54f21e9ad882aa59f468/GTU/src/gtu/_work/ui/AVChoicerUI.java#L115
    Pattern.compile("avDirList\\_(\\d+)"),
    // https://github.com/gtu001/gtu-test-code/blob/59d1dee091a67268fe2f54f21e9ad882aa59f468/GTU/src/gtu/_work/ui/AVChoicerUI.java#L116
    Pattern.compile("avExeText\\_(\\d+)"),
    // https://github.com/gtu001/gtu-test-code/blob/59d1dee091a67268fe2f54f21e9ad882aa59f468/GTU/src/gtu/_work/ui/AVChoicerUI.java#L1453
    Pattern.compile("([a-zA-Z]{2,5})[\\-\\_]?([0-9]{2,5})"),
    // https://github.com/MuhammetAliYILDIRIM/microservices-example/blob/cc47eccd8fe59e7441783081c61a65c9a22d62e9/account-service/src/main/java/com/may/accountservice/util/validator/PhoneNumberValidator.java#L18
    Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$"),
    // https://github.com/GluuFederation/jans-admin-ui-api/blob/4d6e5127f33ee02489d947a2eec90dc1cabc0477/src/main/java/org/gluu/jansadminuiapi/BearerAuthzFilter.java#L31
    Pattern.compile("Bearer\\s+(\\S+)"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/util/src/main/java/br/com/company/util/general/NxUtil.java#L87
    Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/util/src/main/java/br/com/company/util/general/NxUtil.java#L97
    Pattern.compile("^([1-9]{2})([1-5]{1})([0-9]{7})$"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/util/src/main/java/br/com/company/util/general/NxUtil.java#L100
    Pattern.compile("^([1-9]{2})([6-9]{1})([0-9]{7})$"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/util/src/main/java/br/com/company/util/general/NxUtil.java#L103
    Pattern.compile("^([1-9]{2})([9]{1})([0-9]{8})$"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L77
    Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE|Pattern.CANON_EQ),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L199
    Pattern.compile("R$"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L223
    Pattern.compile("\\d{2}:\\d{2}"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L229
    Pattern.compile("[^\\w\\.]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L264
    Pattern.compile("  "),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L333
    Pattern.compile("[ÁÀÂÃÄ]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L334
    Pattern.compile("[ÉÈÊË]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L335
    Pattern.compile("[ÍÌÎÏ]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L336
    Pattern.compile("[ÓÒÔÕÖ]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L337
    Pattern.compile("[ÚÙÛÜ]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L338
    Pattern.compile("[Ñ]"),
    // https://github.com/marceloeugenios/be-stack/blob/4d1353a643b5dcf25ee6dd0c2109841de86581ff/core/src/main/java/br/com/company/core/util/Util.java#L433
    Pattern.compile("^\\d*[0-9]$"),
    // https://github.com/apache/camel/blob/f2b5858114de67ce0c526748979c33c26064c3c1/core/camel-core-languages/src/main/java/org/apache/camel/language/simple/ast/BinaryExpression.java#L44
    Pattern.compile("^(\\d+)(\\.\\.)(\\d+)$"),
    // https://github.com/Tianscar/VirtualPixelDungeon/blob/9d50bc5f5383f44efc3e73c7a4e1ec7c1a05704d/core/src/com/watabou/utils/Highlighter.java#L8
    Pattern.compile("_(.*?)_"),
    // https://github.com/Tianscar/VirtualPixelDungeon/blob/9d50bc5f5383f44efc3e73c7a4e1ec7c1a05704d/core/src/com/watabou/utils/Highlighter.java#L9
    Pattern.compile("[ \n]"),
    // https://github.com/Tianscar/VirtualPixelDungeon/blob/9d50bc5f5383f44efc3e73c7a4e1ec7c1a05704d/core/src/com/watabou/pixeldungeon/ui/GameLog.java#L36
    Pattern.compile(".*[.,;?! ]$"),
    // https://github.com/felicialevina/Android-TutorUp/blob/7419dd4b533de8cd0c7a01a893aad7d780722f99/app/src/main/java/com/example/tutorup/Register.java#L130
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{4,}$"),
    // https://github.com/IThawk/learnCode/blob/84ed3b3a9256b93121a8d2f15eb38098efe2237e/spring5/spring-1.0/src/main/java/com/ithawk/demo/spring/v1/mvcframework/v3/servlet/GPDispatcherServletBak.java#L85
    Pattern.compile(",\\s"),
    // https://github.com/IThawk/learnCode/blob/84ed3b3a9256b93121a8d2f15eb38098efe2237e/spring5/spring-1.0/src/main/java/com/ithawk/demo/spring/v1/mvcframework/v3/servlet/GPDispatcherServletBak.java#L85
    Pattern.compile("\\[|\\]"),
    // https://github.com/langlan/timetable/blob/f37aff730d1a2a2794ca695f4592beaa427e77e9/src/main/java/com/jytec/cs/excel/TrainingScheduleImporter.java#L80
    Pattern.compile("(\\d+)[^\\d]+(\\d+)"),
    // https://github.com/langlan/timetable/blob/f37aff730d1a2a2794ca695f4592beaa427e77e9/src/main/java/com/jytec/cs/excel/TrainingScheduleImporter.java#L76
    Pattern.compile("周\\s*数"),
    // https://github.com/langlan/timetable/blob/f37aff730d1a2a2794ca695f4592beaa427e77e9/src/main/java/com/jytec/cs/excel/TrainingScheduleImporter.java#L77
    Pattern.compile("班\\s*级"),
    // https://github.com/langlan/timetable/blob/f37aff730d1a2a2794ca695f4592beaa427e77e9/src/main/java/com/jytec/cs/excel/TrainingScheduleImporter.java#L78
    Pattern.compile("星期([一二三四五六])"),
    // https://github.com/langlan/timetable/blob/f37aff730d1a2a2794ca695f4592beaa427e77e9/src/main/java/com/jytec/cs/excel/TrainingScheduleImporter.java#L81
    Pattern.compile("系\\s*部|备\\s*注"),
    // https://github.com/xwiki/xwiki-platform/blob/dae81e6e137f8e774d4788ad741d9b62e15d79fa/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/web/EditForm.java#L52
    Pattern.compile("^((?:\\w+\\.)+\\w+?)_([0-9]+)_(.+)$"),
    // https://github.com/xwiki/xwiki-platform/blob/dae81e6e137f8e774d4788ad741d9b62e15d79fa/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/web/EditForm.java#L59
    Pattern.compile("^((?:\\w+\\.)+\\w+?)_([0-9]+)$"),
    // https://github.com/xwiki/xwiki-platform/blob/dae81e6e137f8e774d4788ad741d9b62e15d79fa/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/web/DownloadAction.java#L106
    Pattern.compile("bytes=([0-9]+)?-([0-9]+)?"),
    // https://github.com/xwiki/xwiki-platform/blob/dae81e6e137f8e774d4788ad741d9b62e15d79fa/xwiki-platform-core/xwiki-platform-oldcore/src/main/java/com/xpn/xwiki/web/CommentSaveAction.java#L75
    Pattern.compile("XWiki.XWikiComments_(\\d+)_comment"),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/tests/src/com/android/providers/downloads/HelpersTest.java#L316
    Pattern.compile(".*\\((.+)\\)"),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/src/com/android/providers/downloads/Helpers.java#L82
    Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\""),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/src/com/android/providers/downloads/Helpers.java#L85
    Pattern.compile("(?i)^/storage/[^/]+(?:/[0-9]+)?/Android/(?:data|obb|media)/.+"),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/src/com/android/providers/downloads/Helpers.java#L88
    Pattern.compile("(?i)^/storage/[^/]+(?:/[0-9]+)?/([^/]+)/.+"),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/src/com/android/providers/downloads/Helpers.java#L623
    Pattern.compile("(?i)^/storage/(?:emulated/[0-9]+/|[^/]+/)(Android/sandbox/([^/]+)/)?"),
    // https://github.com/Evervolv/android_packages_providers_DownloadProvider/blob/c14d4968c0da15fa2530f18d36608c9c04a81e6a/src/com/android/providers/downloads/Helpers.java#L630
    Pattern.compile("(?i)^/storage/([^/]+)"),
    // https://github.com/PopCandier/message-push/blob/8f8b9f8913030b9c8bce99289fb1bcab2dc2c2fc/src/main/java/com/pop/netty/chat/protocol/IMDecoder.java#L26
    Pattern.compile("^\\[(.*)\\](\\s\\-\\s(.*))?"),
    // https://github.com/xuqiqiang/ScaleBox/blob/c11cb6ac03ec1a168680e53140c378d736608bc4/libuikit/src/main/java/com/xuqiqiang/uikit/utils/StringUtils.java#L713
    Pattern.compile("^((https|http|ftp|rtsp|mms)?://)?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?(([0-9]{1,3}\\.){3}[0-9]{1,3}|(([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]+\\.)?([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\.(com.cn|net.cn|org.cn|gov.cn|com.hk|公司|中国|网络|com|net|org|int|edu|gov|mil|arpa|Asia|biz|info|name|pro|coop|aero|museum|ac|ad|ae|af|ag|ai|al|am|an|ao|aq|ar|as|at|au|aw|az|ba|bb|bd|be|bf|bg|bh|bi|bj|bm|bn|bo|br|bs|bt|bv|bw|by|bz|ca|cc|cf|cg|ch|ci|ck|cl|cm|cn|co|cq|cr|cu|cv|cx|cy|cz|de|dj|dk|dm|do|dz|ec|ee|eg|eh|es|et|ev|fi|fj|fk|fm|fo|fr|ga|gb|gd|ge|gf|gh|gi|gl|gm|gn|gp|gr|gt|gu|gw|gy|hk|hm|hn|hr|ht|hu|id|ie|il|in|io|iq|ir|is|it|jm|jo|jp|ke|kg|kh|ki|km|kn|kp|kr|kw|ky|kz|la|lb|lc|li|lk|lr|ls|lt|lu|lv|ly|ma|mc|md|me|mg|mh|ml|mm|mn|mo|mp|mq|mr|ms|mt|mv|mw|mx|my|mz|na|nc|ne|nf|ng|ni|nl|no|np|nr|nt|nu|nz|om|pa|pe|pf|pg|ph|pk|pl|pm|pn|pr|pt|pw|py|qa|re|ro|ru|rw|sa|sb|sc|sd|se|sg|sh|si|sj|sk|sl|sm|sn|so|sr|st|su|sy|sz|tc|td|tf|tg|th|tj|tk|tm|tn|to|tp|tr|tt|tv|tw|tz|ua|ug|uk|us|uy|va|vc|ve|vg|vn|vu|wf|ws|ye|yu|za|zm|zr|zw))(:[0-9]{1,4})?((/?)|(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$"),
    // https://github.com/xuqiqiang/ScaleBox/blob/c11cb6ac03ec1a168680e53140c378d736608bc4/libuikit/src/main/java/com/xuqiqiang/uikit/utils/StringUtils.java#L758
    Pattern.compile("(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}"),
    // https://github.com/xuqiqiang/ScaleBox/blob/c11cb6ac03ec1a168680e53140c378d736608bc4/libuikit/src/main/java/com/xuqiqiang/uikit/utils/Cache.java#L288
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"),
    // https://github.com/ukwa/webarchive-discovery/blob/0bad4475b1680b7af8f5078f79216f9888290c33/warc-indexer/src/main/java/uk/bl/wa/util/Normalisation.java#L174
    Pattern.compile("https?://[^/]+"),
    // https://github.com/ukwa/webarchive-discovery/blob/0bad4475b1680b7af8f5078f79216f9888290c33/warc-indexer/src/main/java/uk/bl/wa/util/Normalisation.java#L175
    Pattern.compile("([a-z]+://)(?:www[0-9]*|ww2|ww)[.](.+)"),
    // https://github.com/ukwa/webarchive-discovery/blob/0bad4475b1680b7af8f5078f79216f9888290c33/warc-indexer/src/main/java/uk/bl/wa/util/Normalisation.java#L319
    Pattern.compile("([sS][hH][aA]1:)([0-9A-Fa-f]{40,40})"),
    // https://github.com/kocmoc1985/DBEraser/blob/c4d95b205f5b272a10e068618554f73d3fd0b6a8/src/LabDev/Validator_MCR.java#L42
    Pattern.compile("\\d{6}-\\d{4}"),
    // https://github.com/kocmoc1985/DBEraser/blob/c4d95b205f5b272a10e068618554f73d3fd0b6a8/src/LabDev/Validator_MCR.java#L44
    Pattern.compile("\\d{2}.\\d{2}.\\d{4}"),
    // https://github.com/Komodo-OS-Rom/packages_apps_KomodoIsland/blob/f7cc2afc5f167d179a84e2f1a49b5db390be8793/src/com/android/launcher3/Utilities.java#L109
    Pattern.compile("^[\\s|\\p{javaSpaceChar}]*(.*)[\\s|\\p{javaSpaceChar}]*$"),
    // https://github.com/typhon-project/typhonql/blob/9c37b53115cd90fa103506dc52b39602fc913d52/typhonql/src/nl/cwi/swat/typhonql/client/XMIPolystoreConnection.java#L267
    Pattern.compile("[\"\\\\\\n\\t\\r\\x08]"),
    // https://github.com/java-operator-sdk/java-operator-sdk/blob/f0317c94f2a76009a6b315f6a5bf3c8c89442c0b/samples/tomcat/src/main/java/io/javaoperatorsdk/operator/sample/WebappController.java#L75
    Pattern.compile("([^\\/]+$)"),
    // https://github.com/Kerkesni/Texte_Document_Topic_Semantic_Distance/blob/4e7442d8d0b856629a536eb603bb82f75bb26fd6/other/mallet-2.0.8/src/cc/mallet/util/UriUtils.java#L25
    Pattern.compile("\\p{Alpha}[\\p{Alnum}\\+\\.-]*:"),
    // https://github.com/PixelExperience/vendor_qcom_opensource_commonsys_packages_apps_Bluetooth/blob/4818adad81ab799665eb1d719fd4a88ee6461f96/src/com/android/bluetooth/mapclient/obex/BmsgTokenizer.java#L40
    Pattern.compile("(([^:]*):(.*))?\r\n"),
    // https://github.com/PixelExperience/vendor_qcom_opensource_commonsys_packages_apps_Bluetooth/blob/4818adad81ab799665eb1d719fd4a88ee6461f96/src/com/android/bluetooth/map/BluetoothMapUtils.java#L465
    Pattern.compile("=\\?(.+?)\\?(.)\\?(.+?(?=\\?=))\\?="),
    // https://github.com/PixelExperience/vendor_qcom_opensource_commonsys_packages_apps_Bluetooth/blob/4818adad81ab799665eb1d719fd4a88ee6461f96/src/com/android/bluetooth/avrcp/MediaPlayerList.java#L76
    Pattern.compile("\\d\\d.*"),
    // https://github.com/Evervolv/android_packages_apps_Launcher3/blob/e7339bf0ffe5c210054409376dfde4c782c53c28/tests/tapl/com/android/launcher3/tapl/AppIcon.java#L34
    Pattern.compile("onAllAppsItemLongClick"),
    // https://github.com/Evervolv/android_packages_apps_Contacts/blob/82d26f1a8a37428a7a4d54e96f1beac59de0add7/src/com/android/contacts/list/ContactListItemView.java#L1803
    Pattern.compile("([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})|[\\w]+"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/liulishuo/okdownload/core/C6103c.java#L228
    Pattern.compile("bytes (\\d+)-(\\d+)/\\d+"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/iflytek/voiceads/param/C5577a.java#L24
    Pattern.compile("^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/iflytek/voiceads/p622d/p628f/C5476h.java#L29
    Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/iflytek/voiceads/p622d/p628f/C5476h.java#L32
    Pattern.compile("([+-])?(\\d+)"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/iflytek/voiceads/p622d/p628f/C5476h.java#L149
    Pattern.compile("^\\+"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/huawei/updatesdk/support/p611c/C5170a.java#L121
    Pattern.compile("(\\.)+[\\\\/]+"),
    // https://github.com/seasonmac/zhihuAPK/blob/dcdbd103436a187f9c8b4be8f71bdf7813b6d201/src/main/java/com/fasterxml/jackson/p519b/p527h/VersionUtil.java#L11
    Pattern.compile("[-_./;:]"),
    // https://github.com/code1990/java/blob/932e745653fbd0af7f4ee82502cdb6f5138d655d/src/test/java/WorkFileTest.java#L32
    Pattern.compile("\\d+.\\d+|\\w+"),
    // https://github.com/code1990/java/blob/932e745653fbd0af7f4ee82502cdb6f5138d655d/src/test/java/WorkFileTest.java#L108
    Pattern.compile("[^A-Za-z]"),
    // https://github.com/code1990/java/blob/932e745653fbd0af7f4ee82502cdb6f5138d655d/src/main/java/util/StringUtil.java#L13
    Pattern.compile("[\\s~·`!！@#￥$%^……&*（()）\\-——\\-_=+【\\[\\]】｛{}｝\\|、\\\\；;：:‘'“”\"，,《<。.》>、/？?]"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L82
    Pattern.compile("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L101
    Pattern.compile("&lsquo;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L102
    Pattern.compile("&rsquo;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L103
    Pattern.compile("&ldquo;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L104
    Pattern.compile("&rdquo;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L107
    Pattern.compile("&hellip;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L108
    Pattern.compile("&middot;"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L189
    Pattern.compile("(^[_.0-9a-z-]+)@(([0-9a-z][0-9a-z-]+.)+)([a-z]{2,3}$)"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L199
    Pattern.compile("^01[016789]{1}-(?:\\d{3}|\\d{4})-\\d{4}$"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L209
    Pattern.compile("^\\d{2,3}-\\d{3,4}-\\d{4}$"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L219
    Pattern.compile("[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])-?[012349][0-9]{6}"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L229
    Pattern.compile("^\\d{3}-\\d{2}-\\d{5}$"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L240
    Pattern.compile("^\\d{6}-\\d{7}$"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/StringUtil.java#L460
    Pattern.compile("<img[^>]*src=[\"']?([^>\"']+)[\"']?[^>]*>"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/CommonUtil.java#L171
    Pattern.compile("\n\n"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/CommonUtil.java#L548
    Pattern.compile("\\b(\\S+)+@(\\S+.\\S+)"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/CommonUtil.java#L563
    Pattern.compile("\\b(\\S+)[^@][^@]+@(\\S+)"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/kr/co/gocle/hrdi/comm/util/CommonUtil.java#L565
    Pattern.compile("\\b(\\S+)[^@][^@][^@]+@(\\S+)"),
    // https://github.com/gocle/HRDI_CONFERENCE/blob/e88302f3c32f5ec4d5a800ac7db12bc2d343fd85/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L32
    Pattern.compile("%2E"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/lib/jdk/test/lib/process/OutputAnalyzer.java#L506
    Pattern.compile(".* VM warning:.*\\R"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/lib/jdk/test/lib/process/OutputAnalyzer.java#L506
    Pattern.compile(".* VM warning:.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/lib/jdk/test/lib/Utils.java#L194
    Pattern.compile("(?:\\-XX\\:[\\+\\-]Use.+GC)|(?:\\-Xconcgc)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/jdk/jfr/tool/ExecuteHelper.java#L124
    Pattern.compile("a*b"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/jdk/jfr/jcmd/TestJcmdStartStopDefault.java#L70
    Pattern.compile(".*Use jcmd \\d+ JFR.dump name=(\\S+).*", Pattern.DOTALL),
    // https://github.com/condyboy/d3-v2/blob/9afb6e95091ef62f1cf109c35842b496272c79de/src/main/java/cn/secure/util/TrackCommonUtil.java#L151
    Pattern.compile(".*[A-Z]+.*"),
    // https://github.com/condyboy/d3-v2/blob/9afb6e95091ef62f1cf109c35842b496272c79de/src/main/java/cn/secure/util/TrackCommonUtil.java#L455
    Pattern.compile("[^\\s\\\\/:\\*\\?\\\"<>\\|](\\x20|[^\\s\\\\/:\\*\\?\\\"<>\\|])*[^\\s\\\\/:\\*\\?\\\"<>\\|\\.]$"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.redis/src/main/java/ghost/framework/data/redis/core/convert/MappingRedisConverter.java#L436
    Pattern.compile("\\.\\[.*\\]"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.redis/src/main/java/ghost/framework/data/redis/connection/VersionParser.java#L32
    Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.*)"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/util/json/ParameterBindingJsonReader.java#L59
    Pattern.compile("^\\?(\\d+)$"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/util/json/ParameterBindingJsonReader.java#L61
    Pattern.compile("[\\?:]#\\{.*\\}"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/gridfs/AntPath.java#L32
    Pattern.compile("\\?|\\*\\*|\\*"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-feature-cpconverter/src/main/java/org/apache/sling/feature/cpconverter/interpolator/SimpleVariablesInterpolator.java#L27
    Pattern.compile("\\$\\{\\{(.+?)\\}\\}"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-feature-cpconverter/src/main/java/org/apache/sling/feature/cpconverter/handlers/RepPolicyEntryHandler.java#L123
    Pattern.compile("\\{[^\\}]+\\}\\[(.+)\\]"),
    // https://github.com/JorickPepin/Wikipedia-help/blob/6b7c6932988782c574b0c58e6b5e5c6e9066714e/src/recordsnbawiki/packLogic/DataManagement.java#L132
    Pattern.compile("^.*\\d$"),
    // https://github.com/Limiun/dobbu/blob/e2ea5cfb9cdb951a4c092c7d4c487e42521fe5b8/dubbo-admin-master/dubbo-admin/src/main/java/com/alibaba/dubboadmin/filter/LoginFilter.java#L53
    Pattern.compile("(\\w+)=[\"]?([^,\"]+)[\"]?[,]?\\s*"),
    // https://github.com/Greeshm04/MAMS/blob/62107956b318c71f32b8a596caa0f3bdea75ae51/MAMSadmin/app/src/main/java/apex/mams/admin/addstudentActivity.java#L343
    Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"),
    // https://github.com/sosy-lab/cpachecker/blob/f142d560cce4c7ba659fdb922e3ac90c301b5d2c/src/org/sosy_lab/cpachecker/core/counterexample/ReportGenerator.java#L541
    Pattern.compile("[0-9-]* [0-9:]*\t[A-Z]*\t.*\t.*"),
    // https://github.com/Z-P-J/sjly/blob/25a5ec51dc160f6c6e15c67d590927eea21b901f/fragmentation-dialog/src/main/java/com/zpj/fragmentation/dialog/imagetrans/MyImageLoad.java#L30
    Pattern.compile("http[s]*://[[[^/:]&&[a-zA-Z_0-9]]\\.]+(:\\d+)?(/[a-zA-Z_0-9]+)*(/[a-zA-Z_0-9]*([a-zA-Z_0-9]+\\.[a-zA-Z_0-9]+)*)?(\\?(&?[a-zA-Z_0-9]+=[%[a-zA-Z_0-9]-]*)*)*(#[[a-zA-Z_0-9]|-]+)?(.jpg|.png|.gif|.jpeg)?"),
    // https://github.com/reaktivity/nukleus-proxy.java/blob/32d121b8e59cb2cc6bc54de6ade43eda60df6233/src/main/java/org/reaktivity/nukleus/proxy/internal/route/ProxyAddress.java#L37
    Pattern.compile("(?<prefix>[^/]+)(?:/(?<length>\\d+))?"),
    // https://github.com/reaktivity/nukleus-proxy.java/blob/32d121b8e59cb2cc6bc54de6ade43eda60df6233/src/main/java/org/reaktivity/nukleus/proxy/internal/route/ProxyAddress.java#L38
    Pattern.compile("(?<low>[\\d]+)(?:-(?<high>\\d+))?"),
    // https://github.com/sohutv/cachecloud/blob/32b21f69f0679346e9ffed8436d31367e02c59e1/cachecloud-web/src/main/java/com/sohu/cache/util/OSFactory.java#L22
    Pattern.compile("([1-9]+(\\.[0-9]+)?)"),
    // https://github.com/sohutv/cachecloud/blob/32b21f69f0679346e9ffed8436d31367e02c59e1/cachecloud-web/src/main/java/com/sohu/cache/ssh/SSHUtil.java#L351
    Pattern.compile("(\\d+).(\\d+)"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/nio/charset/coders/Check.java#L65
    Pattern.compile("^(\\p{XDigit}+) +(\\p{XDigit}+)$", Pattern.MULTILINE),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L95
    Pattern.compile("Warning:.*\\n"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L188
    Pattern.compile("(?m)^(?:COMSPEC|PROMPT|PATHEXT)=.*\n"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L664
    Pattern.compile("en.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L664
    Pattern.compile("C"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L1951
    Pattern.compile("[Ss]tream [Cc]losed"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/ProcessBuilder/Basic.java#L2060
    Pattern.compile(".*Bad file.*"),
    // https://github.com/kb-1000/jdk8u_jdk_upstream/blob/51a69b67403b62eaa18252863399888916c52afd/test/java/lang/Character/CheckScript.java#L135
    Pattern.compile("sc\\s*;\\s*(\\p{Alpha}{4})\\s*;\\s*([\\p{Alpha}|_]+)\\s*.*"),
    // https://github.com/AnnaFRepo/zadaniadomowe/blob/406d99c62e25f3b6aa8ca57e9331ebc1f5602f62/src/Homework2October.java#L191
    Pattern.compile("[\\p{L}]+"),
    // https://github.com/KorolkovRS/MyCloud/blob/88055eda5181be23fcd33c856ecd35b8a3ddfbfa/src/main/java/client/GUI/Controllers/AuthController.java#L26
    Pattern.compile("[^\\w]"),
    // https://github.com/kristijanpanov/SentenceSimplifier/blob/3a42feb04cc84c190eb02af879f8220d4de9761a/sentence-simplifier/src/main/java/org/group/sensim/SentenceSimplifier.java#L431
    Pattern.compile("^[NCP,:S].*"),
    // https://github.com/kristijanpanov/SentenceSimplifier/blob/3a42feb04cc84c190eb02af879f8220d4de9761a/sentence-simplifier/src/main/java/org/group/sensim/SentenceSimplifier.java#L1759
    Pattern.compile("[A-Z]\\.[A-Z][a-z]"),
    // https://github.com/kristijanpanov/SentenceSimplifier/blob/3a42feb04cc84c190eb02af879f8220d4de9761a/sentence-simplifier/src/main/java/org/group/sensim/SentenceSimplifier.java#L1768
    Pattern.compile("[A-Z]\\.[a-z]"),
    // https://github.com/kristijanpanov/SentenceSimplifier/blob/3a42feb04cc84c190eb02af879f8220d4de9761a/sentence-simplifier/src/main/java/org/group/sensim/SentenceSimplifier.java#L1778
    Pattern.compile("[a-z]\\.[A-Z][a-z]"),
    // https://github.com/AdoptOpenJDK/stf/blob/f9c239a743931b805cf95e7479e87398d04256a0/stf.core/src/stf.core/net/adoptopenjdk/stf/environment/PlatformFinder.java#L88
    Pattern.compile("390|x86|ppc|x86|arm|riscv"),
    // https://github.com/AdoptOpenJDK/stf/blob/f9c239a743931b805cf95e7479e87398d04256a0/stf.core/src/stf.core/net/adoptopenjdk/stf/environment/PlatformFinder.java#L94
    Pattern.compile("le|"),
    // https://github.com/AdoptOpenJDK/stf/blob/f9c239a743931b805cf95e7479e87398d04256a0/stf.core/src/stf.core/net/adoptopenjdk/stf/environment/PlatformFinder.java#L100
    Pattern.compile("31|32|64"),
    // https://github.com/AdoptOpenJDK/stf/blob/f9c239a743931b805cf95e7479e87398d04256a0/stf.core/src/stf.core/net/adoptopenjdk/stf/environment/PlatformFinder.java#L113
    Pattern.compile("(.*)_(.*?)([l][e])?-(.*)"),
    // https://github.com/AdoptOpenJDK/stf/blob/f9c239a743931b805cf95e7479e87398d04256a0/stf.core/src/stf.core/net/adoptopenjdk/stf/environment/PlatformFinder.java#L160
    Pattern.compile(".linux$|.win$|.aix$|.zos$|.osx$|.bsd$"),
    // https://github.com/OpenVidu/openvidu/blob/58a67da150b42622e855707a77541ed7783e8b26/openvidu-server/src/main/java/io/openvidu/server/kurento/core/KurentoSessionManager.java#L1015
    Pattern.compile("^(file|rtsp)://"),
    // https://github.com/OpenVidu/openvidu/blob/58a67da150b42622e855707a77541ed7783e8b26/openvidu-server/src/main/java/io/openvidu/server/kurento/core/KurentoSessionManager.java#L1018
    Pattern.compile("://$"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L37
    Pattern.compile("(?<=(\r\n|\n))|(?<=\r)(?=[^\n])"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L38
    Pattern.compile(" *(\r|\n|\r\n)+ *"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L39
    Pattern.compile(" *(\r|\n|\r\n) *"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L40
    Pattern.compile("(\r|\n|\r\n)+"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L237
    Pattern.compile("<br/?>"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L240
    Pattern.compile("<(.|\n)*?>"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L2759
    Pattern.compile("http://[a-zA-Z0-9./\\-+]+"),
    // https://github.com/JetBrains/intellij-community/blob/fa8d0536c3afa8d332b87cd1668e00c9d45f800a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java#L3021
    Pattern.compile("\\\\u[0-9a-fA-F]{4}"),
    // https://github.com/elastic/elasticsearch/blob/e7d06843f9cce7ea3f3e22606cf1dc196658f801/server/src/main/java/org/elasticsearch/common/settings/KeyStoreWrapper.java#L105
    Pattern.compile("[A-Za-z0-9_\\-.]+"),
    // https://github.com/dbeaver/dbeaver/blob/5e612d677dd7ee23a21c199da51783953e1e5436/plugins/org.jkiss.dbeaver.ext.hana/src/org/jkiss/dbeaver/ext/hana/model/HANAMetaModel.java#L55
    Pattern.compile(" \\(at pos ([0-9]+)\\)"),
    // https://github.com/qualicen/specmate/blob/bc32f6dd997d83b881110012a7e44eb82e2376a8/bundles/specmate-search/src/com/specmate/search/internal/services/LuceneBasedModelSearchService.java#L88
    Pattern.compile("com\\/specmate\\/model\\/notification\\/([^\\/]+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/display/OverlayDisplayAdapter.java#L122
    Pattern.compile("([^,]+)(,[,_a-z]+)*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/display/OverlayDisplayAdapter.java#L123
    Pattern.compile("(\\d+)x(\\d+)/(\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/am/MemoryStatUtil.java#L55
    Pattern.compile("total_pgfault (\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/am/MemoryStatUtil.java#L56
    Pattern.compile("total_pgmajfault (\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/am/MemoryStatUtil.java#L57
    Pattern.compile("total_rss (\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/am/MemoryStatUtil.java#L58
    Pattern.compile("total_cache (\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/services/core/java/com/android/server/am/MemoryStatUtil.java#L59
    Pattern.compile("total_swap (\\d+)"),
    // https://github.com/Nousin-Tang/spring-boot-2.2.12/blob/95bff8d4cf00dfea8aa5e490836ef712754d0229/spring-boot-tests/spring-boot-smoke-tests/spring-boot-smoke-test-property-validation/src/main/java/smoketest/propertyvalidation/SamplePropertiesValidator.java#L27
    Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$"),
    // https://github.com/3redronin/mu-server/blob/123ccaaea9409fc5c76b59bcfa892aba467e9476/src/main/java/io/muserver/openapi/SchemaObjectBuilder.java#L468
    Pattern.compile("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]"),
    // https://github.com/howa0104/Assignment2/blob/98c0e7b0a9be2f8d74141cfbf2f9f60ba5dce1e9/src/main/java/common/ComponentExamples.java#L36
    Pattern.compile("(/)?(Account|Board|Host|Image){1}(TableJSP)?"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/utils/read/GATKReadAdaptersUnitTest.java#L1453
    Pattern.compile("(\\t)(\\d+)"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L94
    Pattern.compile("^Civar:.*$"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L97
    Pattern.compile("^.*\\d+.*$"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L177
    Pattern.compile("^\\d+:\\d+:.+$"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L186
    Pattern.compile("^\\*:\\d+:\\d+$"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L240
    Pattern.compile("\\*:^\\d+:\\d+"),
    // https://github.com/falcon-computing/gatk/blob/384de223ac1c788ed7a2be3ab7837adedacfbb11/src/test/java/org/broadinstitute/hellbender/tools/walkers/haplotypecaller/AssemblyRegionTestDataSet.java#L294
    Pattern.compile("(\\d+)([=A-Z])"),
    // https://github.com/miso-lims/miso-lims/blob/1f68cbfa6b2e04202cfb37082f31efc8c2c5da8e/migration/src/main/java/uk/ac/bbsrc/tgac/miso/migration/destination/DefaultMigrationTarget.java#L351
    Pattern.compile("^\\w{3,5}_(\\d+).*"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/src/share/classes/com/sun/tools/doclets/internal/toolkit/util/VisibleMemberMap.java#L665
    Pattern.compile("[sg]et\\p{Upper}.*"),
    // https://github.com/z1lc/core/blob/60ce67b3403a02151340a59194b38b735b5bce9d/src/main/java/com/robertsanek/data/quality/anki/AllNumericalClozeDeletionsHaveHashtagHint.java#L44
    Pattern.compile("\\{\\{c\\d+::\\d+?}}"),
    // https://github.com/Despical/TNTRun/blob/0f5df84bf5a4a1e91ca75356826221b5a341c443/src/main/java/me/despical/tntrun/utils/UpdateChecker.java#L55
    Pattern.compile("\\d+(?:\\.\\d+)*"),
    // https://github.com/canmengqian/mybatis-source/blob/3ead41fa7c70a3f55682bfcaa6d302234c196c65/org/apache/ibatis/jdbc/ScriptRunner.java#L44
    Pattern.compile("^\\s*((--)|(//))?\\s*(//)?\\s*@DELIMITER\\s+([^\\s]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/utils/VersionUtil.java#L47
    Pattern.compile("^(\\d+)\\.(\\d+)\\.?([0-9]*)?(?:-pre(\\d))?(?:-?R?([\\d.]+))?(?:-SNAPSHOT)?"),
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/utils/StringUtil.java#L10
    Pattern.compile("[^a-z0-9-]"),
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/utils/StringUtil.java#L11
    Pattern.compile("[^a-z0-9]"),
    // https://github.com/TacticalDevMC/RemoteCore/blob/d319418d4b43b87ee49d0bd94a74530dc40ec32e/RemoteCore-spigot/src/main/java/com/github/tacticaldevmc/remotecore/utils/utils/StringUtil.java#L12
    Pattern.compile("[^\t\n\r\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFC]"),
  };
}
