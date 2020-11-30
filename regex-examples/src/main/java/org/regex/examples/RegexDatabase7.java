package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase7 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L162
    Pattern.compile("\\(\\?m\\)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L165
    Pattern.compile("\\(\\?s\\)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L168
    Pattern.compile("\\(\\?u\\)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L174
    Pattern.compile("\\+\\?"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L175
    Pattern.compile("\\*\\?"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/main/java/org/evosuite/utils/RegexDistanceUtils.java#L176
    Pattern.compile("\\?\\?"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/lib/ToolBox.java#L806
    Pattern.compile("public\\s+(?:class|enum|interface){1}\\s+(\\w+)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/lib/ToolBox.java#L808
    Pattern.compile("(?:class|enum|interface){1}\\s+(\\w+)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L603
    Pattern.compile("DC(.*)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L773
    Pattern.compile("\n[ \t]+@"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L772
    Pattern.compile("(\\{@value\\s+[^}]+)\\s+(\\})"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L771
    Pattern.compile("\\{@inheritDoc\\s+\\}"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L770
    Pattern.compile("\\{@docRoot\\s+\\}"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L769
    Pattern.compile("\\s+<(/?p|pre|h[1-6])>"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L768
    Pattern.compile("\\.\\s*\\n *@"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javac/doctree/DocCommentTester.java#L767
    Pattern.compile("\\.\\s++([^@])"),
    // https://github.com/anjaleeps/DependencyGraphBuilder/blob/d93673cdb80afcabbfe09fb1eeb7ce5d76e796e9/src/main/java/builder/DependencyCollector.java#L22
    Pattern.compile("([a-zA-Z]\\w+(/|[.]))+(\\w|[$])+"),
    // https://github.com/DNAstack/ga4gh-search-adapter-presto/blob/51c0a3c9d962a64913d10407da7efd72a32d6433/src/main/java/com/dnastack/ga4gh/search/adapter/presto/PrestoSearchAdapter.java#L63
    Pattern.compile("^\"?[^\"]+\"?\\.\"?[^\"]+\"?\\.\"?[^\"]+\"?$"),
    // https://github.com/DNAstack/ga4gh-search-adapter-presto/blob/51c0a3c9d962a64913d10407da7efd72a32d6433/src/main/java/com/dnastack/ga4gh/search/adapter/presto/PrestoSearchAdapter.java#L91
    Pattern.compile("((ga4gh_type)\\(\\s*([^,]+)\\s*,\\s*('[^']+')\\s*\\)((\\s+as)?\\s+((?!FROM\\s+)[A-Za-z0-9_]*))?)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/xxySpace/litemall/blob/ff1c885929da823d1c09019df124002e680d2df5/litemall-core/src/main/java/org/linlinjava/litemall/core/util/bcrypt/BCryptPasswordEncoder.java#L37
    Pattern.compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}"),
    // https://github.com/LineageOS/android_packages_apps_Snap/blob/b8f109df1af2d1111633c4b334482b7daccb56aa/src/com/android/camera/VideoModule.java#L2646
    Pattern.compile("[1-9][0-9]*"),
    // https://github.com/Jahia/server-performances-analyzer/blob/4c9cc7efbcd733c254ccb17248fbfbe4d7e39630/src/main/java/org/jahia/modules/serverperfanalyzer/threadumps/ThreadDumpsParser.java#L21
    Pattern.compile("\\W*\\\"(.+)\\\"\\W+nid=(\\d+)\\W+state=(.+)\\W+\\[\\]\\W*"),
    // https://github.com/xiongningwan/LibCore/blob/74bb2137a2a7cbf28ee085031761a8fd48b1b062/app/src/main/java/com/yb/core/utils/UnitUtil.java#L175
    Pattern.compile("-?[0-9]+(\\.[0-9]+)?"),
    // https://github.com/luan-grabher/Java-Robot-SCI-ConcileSuppliers/blob/3044a885cc747e5641b9622a63f3ad95e064ed8d/src/robot_conciliate/Model/ChangeEntries.java#L75
    Pattern.compile("Ref\\. +[0-1][0-9]\\/20[0-9]{2}"),
    // https://github.com/luan-grabher/Java-Robot-SCI-ConcileSuppliers/blob/3044a885cc747e5641b9622a63f3ad95e064ed8d/src/robot_conciliate/Model/ChangeEntries.java#L118
    Pattern.compile("[^a-zA-Z0-9 .-]"),
    // https://github.com/hefanbo/o2oa-dev/blob/65c00ddbf5763ca1dab56ae2f4f5b87273db163d/o2oa-src/o2server/x_base_core_project/src/main/java/com/x/base/core/project/http/HttpToken.java#L39
    Pattern.compile("^(anonymous|user|manager|cipher)([2][0][1-2][0-9][0-1][0-9][0-3][0-9][0-5][0-9][0-5][0-9][0-5][0-9])(\\S{1,})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/zaglife/somenaeil/blob/083c1a7c886945e9caa6e4508052e9ab1134e6a9/somenaeil/src/com/post/post.java#L145
    Pattern.compile("<(\\/)?[\\w\\d]+((\\s[\\w\\d-./]+)=(\"[\\w\\d-./\\\\:]*\")*)*(\\/)?>"),
    // https://github.com/zaglife/somenaeil/blob/083c1a7c886945e9caa6e4508052e9ab1134e6a9/somenaeil/src/com/post/post.java#L172
    Pattern.compile("<img((\\s)*[\\w\\d-]*(=\"[\\w\\d/.-]+\")*)*>"),
    // https://github.com/p76081158/WukongDockerfile/blob/31a5aba34d6d5a0cd3f35936c273b1dfb9db611d/master-alpine/tmp/gradle-2.4/src/tooling-api/org/gradle/tooling/internal/adapter/ProtocolToModelAdapter.java#L44
    Pattern.compile("is(\\w+)Supported"),
    // https://github.com/p76081158/WukongDockerfile/blob/31a5aba34d6d5a0cd3f35936c273b1dfb9db611d/master-alpine/tmp/gradle-2.4/src/tooling-api/org/gradle/tooling/internal/adapter/ProtocolToModelAdapter.java#L45
    Pattern.compile("get(\\w+)"),
    // https://github.com/p76081158/WukongDockerfile/blob/31a5aba34d6d5a0cd3f35936c273b1dfb9db611d/master-alpine/tmp/gradle-2.4/src/tooling-api/org/gradle/tooling/internal/adapter/ProtocolToModelAdapter.java#L46
    Pattern.compile("is(\\w+)"),
    // https://github.com/p76081158/WukongDockerfile/blob/31a5aba34d6d5a0cd3f35936c273b1dfb9db611d/gateway-alpine/tmp/gradle-2.4/src/scala/org/gradle/api/tasks/ScalaRuntime.java#L53
    Pattern.compile("scala-(\\w.*?)-(\\d.*).jar"),
    // https://github.com/cilisi/series-utilities/blob/ae838667df4e9046dae114de7970e06813b72e87/java-expand/src/main/java/javae/math/ArithmeticFormulaCalculator.java#L38
    Pattern.compile("[1-9]\\d*(.\\d+)?|0(.\\d+)?"),
    // https://github.com/cilisi/series-utilities/blob/ae838667df4e9046dae114de7970e06813b72e87/java-expand/src/main/java/javae/lang/reflect/SimpleValueAccessor.java#L47
    Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*(\\[(\\d|[1-9]\\d+)\\])?(\\.[a-zA-Z_$][a-zA-Z0-9_$]*(\\[(\\d|[1-9]\\d+)\\])?)*$"),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/security/utils/SQLInjectionValidator.java#L69
    Pattern.compile(" ="),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/security/utils/SQLInjectionValidator.java#L74
    Pattern.compile("= "),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/security/utils/SQLInjectionValidator.java#L38
    Pattern.compile("[a-zA-Z_=,\\-'!><.?\"`% ()0-9*\n\r]*"),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/security/utils/SQLBuilder.java#L38
    Pattern.compile("([a-zA-Z_][a-zA-Z0-9_-]*\\.)?[a-zA-Z_-][a-zA-Z0-9_-]*"),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/reportmailingjob/validation/ReportMailingJobValidator.java#L53
    Pattern.compile("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"),
    // https://github.com/ProdSys/Fineract/blob/e37e03e7d2b94773270780688e109a53baebb8bb/fineract-provider/src/main/java/org/apache/fineract/infrastructure/core/data/DataValidatorBuilder.java#L1011
    Pattern.compile("^\\+?[0-9. ()-]{0,25}$"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/telephony/java/com/android/internal/telephony/SmsMessageBase.java#L410
    Pattern.compile("( /)|( )"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/telephony/java/android/telephony/PhoneNumberUtils.java#L2797
    Pattern.compile("[@;:]"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/wm/WindowManagerShellCommand.java#L243
    Pattern.compile("(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+)"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/stats/pull/IonMemoryUtil.java#L44
    Pattern.compile("\n\\s*total\\s*(\\d+)\\s*\n"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/stats/pull/IonMemoryUtil.java#L46
    Pattern.compile("\n\\s+\\S+\\s+(\\d+)\\s+(\\d+)"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/soundtrigger_middleware/UuidUtil.java#L31
    Pattern.compile("^([a-fA-F0-9]{8})-([a-fA-F0-9]{4})-([a-fA-F0-9]{4})-([a-fA-F0-9]{4})-([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})$"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/pm/dex/PackageDynamicCodeLoading.java#L82
    Pattern.compile("([A-Z]):([0-9]+):([^:]*):(.*)"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/pm/DynamicCodeLoggingService.java#L63
    Pattern.compile(".*\\bavc: granted \\{ execute(?:_no_trans|) \\} .*\\bpath=(?:\"([^\" ]*)\"|([0-9A-F]+)) .*\\bscontext=u:r:untrusted_app(?:_25|_27)?:.*\\btcontext=u:object_r:app_data_file:.*\\btclass=file\\b.*"),
    // https://github.com/RohieOS/frameworks_base/blob/2022c04a3780a39940cb20a6283f87b9175a6ffa/services/core/java/com/android/server/om/OverlayManagerShellCommand.java#L282
    Pattern.compile("(.*?):(.*?)/(.*?)"),
    // https://github.com/Anatdub/TestProject/blob/44e9a5204ff46f86344d1e131a3fece162c1c0cf/Practicum/src/first/Test.java#L9
    Pattern.compile("\\s*(\\s|,|!|\\.)\\s*"),
    // https://github.com/smathog/Hyperskill-Projects/blob/62ead90b5d075faa3b4eeaaf58019290285e2e5f/Java%20Projects/Budget%20Manager%20(Hard)/Stage%204/BudgetManager.java#L16
    Pattern.compile("(?<=\\$)\\d+(\\.\\d+)?"),
    // https://github.com/cilisi/series-utilities/blob/87a4e6988064bfbe4862faa3430be54cd0ae853d/java-expand/src/main/java/javae/text/AbstractAmountWords.java#L34
    Pattern.compile("^[+\\-]?[1-9]\\d*(.\\d+)?|0(.\\d+)?$"),
    // https://github.com/freeorgtaf/product-microgateway-mirror/blob/7d4812619ca68c04f6abab7f729dac7c78814e3f/components/micro-gateway-cli/src/main/java/org/wso2/apimgt/gateway/cli/constants/GatewayCliConstants.java#L81
    Pattern.compile("\\$\\{([^}]*)}"),
    // https://github.com/REC2020-TeamBird/NetflixSearch/blob/d9667185f76f7959aa7dad243b0cdd61d1c0f2bc/src/com/teambird/netflixsearch/Objects/Credits.java#L25
    Pattern.compile("\\[[^]]*]"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/logicaleffort/LETool.java#L191
    Pattern.compile("ATTR_"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/logicaleffort/LETool.java#L338
    Pattern.compile("^(\\D+)(\\d+)$"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/output/EDIFEquiv.java#L323
    Pattern.compile("(.+?)\\{(.+?)\\}(.+?)\\{(.+?)\\}"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/output/EDIFEquiv.java#L543
    Pattern.compile("[(),]"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/output/EDIF.java#L2080
    Pattern.compile("(pPar|iPar|atPar|dotPar|_Par)\\(\"(\\w+)\"\\)"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/output/EDIF.java#L2081
    Pattern.compile("\\[([~+.@])(\\w+)\\]"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/output/EDIF.java#L2195
    Pattern.compile("\\.[0-9]+"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/input/DEF.java#L91
    Pattern.compile(".*\\\\\\["),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/input/DEF.java#L92
    Pattern.compile("\\\\\\["),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/input/DEF.java#L93
    Pattern.compile(".*\\\\\\]"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/tool/io/input/DEF.java#L94
    Pattern.compile("\\\\\\]"),
    // https://github.com/Andrew-Abdo/INF1600/blob/22ac8f6fbd8122714fd170031897dace3262d415/TP1/inf1600_tp1/com/sun/electric/database/variable/VarContext.java#L495
    Pattern.compile("P\\(\"(\\w+)\"\\)"),
    // https://github.com/1522395053/MyDemo/blob/c96bdffc9d9f3b05a7c7802ca0b0bd1fd8427418/JavaTest/src/main/java/com/ssyh/javatest/java7source/java/util/Currency.java#L243
    Pattern.compile("([A-Z]{3})\\s*,\\s*(\\d{3})\\s*,\\s*([0-3])"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L54
    Pattern.compile("[fF]unc_[0-9]+_[a-zA-Z_]+|[fF]ield_[0-9]+_[a-zA-Z_]+|p_[\\w]+_\\d+_\\b"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L55
    Pattern.compile("^(?<indent>(?: {3})+|\\t+)(?!return)(?:\\w+\\s+)*(?<generic><[\\w\\W]*>\\s+)?(?<return>\\w+[\\w$.]*(?:<[\\w\\W]*>)?[\\[\\]]*)\\s+(?<name>func_[0-9]+_[a-zA-Z_]+)\\("),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L56
    Pattern.compile("^(?<indent>(?: {3})+|\\t+)(?!return)(?:\\w+\\s+)*(?:\\w+[\\w$.]*(?:<[\\w\\W]*>)?[\\[\\]]*)\\s+(?<name>field_[0-9]+_[a-zA-Z_]+) *(?:=|;)"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L57
    Pattern.compile("^(?<indent>(?: )*|\\t*)([\\w|@]*\\s)*(class|interface|@interface|enum) (?<name>[\\w]+)"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L58
    Pattern.compile("^(?<indent>(?: )*|\\t*)}"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L59
    Pattern.compile("^[\\s]*package(\\s)*(?<name>[\\w|.]+);$"),
    // https://github.com/FledgeXu/ForgeGradleCN/blob/abbc1c50f3786e87fbaaf725160ac20e3d02162f/src/common/java/net/minecraftforge/gradle/common/util/McpNames.java#L60
    Pattern.compile("\\((?<args>(?:(?:, ){0,1}(?:p_[\\w]+_\\d+_\\b))+)\\) ->"),
    // https://github.com/huaxueyihao/NoteOfStudy/blob/838d63b97a19a1033c75530003089685c40adbb1/A04.Netty/B01.Netty_Book/doc/nettybook2-master/src/com/phei/netty/protocol/http/fileServer/HttpFileServerHandler.java#L159
    Pattern.compile(".*[<>&\"].*"),
    // https://github.com/huaxueyihao/NoteOfStudy/blob/838d63b97a19a1033c75530003089685c40adbb1/A04.Netty/B01.Netty_Book/doc/nettybook2-master/src/com/phei/netty/protocol/http/fileServer/HttpFileServerHandler.java#L187
    Pattern.compile("[A-Za-z0-9][-_A-Za-z0-9\\.]*"),
    // https://github.com/gnembon/fabric-carpet/blob/989bc1ec2b8dc6ea856b183a895ee94f58042b21/src/main/java/carpet/script/CarpetEventServer.java#L965
    Pattern.compile("(\\w+)\\(from (\\w+)\\)"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/TeknologiBigData/rake/RakeAlgorithm.java#L131
    Pattern.compile("([!\"#$%&'()*+,-./:;<=>?@\\^_>{|}<¥])"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idpostagger/wordprob/OOVWordProb.java#L95
    Pattern.compile("^([0-9]+)|([0-9]+\\.)|([0-9.,:-]+[0-9]+)|([a-zA-Z]{1,5}+[.,:-]+[0-9]+)|([0-9]+[a-zA-Z]{1,3})$"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianPhraseChunker.java#L198
    Pattern.compile(" : "),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L444
    Pattern.compile("\\w{1}.*\\w{1}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L453
    Pattern.compile("[^a-zA-Z]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L445
    Pattern.compile("\\W{1}.*\\W{1}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L446
    Pattern.compile("\\W{1}.{1,}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L490
    Pattern.compile("-[^a-zA-Z]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L447
    Pattern.compile(".{1,}\\W{1}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L448
    Pattern.compile("[\\w{1}\\W{1}]"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L619
    Pattern.compile("[A-Z]{1}[a-z]*"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L619
    Pattern.compile("[A-Z][a-z]*-[A-Z][a-z]*"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L619
    Pattern.compile("[A-Z][a-z]*-[a-z]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L621
    Pattern.compile("[A-Z]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L631
    Pattern.compile("[0-9]+/[0-9]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L631
    Pattern.compile("[0-9]+/[0-9]+/[0-9]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L633
    Pattern.compile("[\\D]+[0-9]+[,.0-9]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L635
    Pattern.compile("[0-9]+[,.\\-\\^0-9]+"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L635
    Pattern.compile("[0-9]+\\-an"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L637
    Pattern.compile("[0-9]{1,2}:[0-9]{1,2}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L639
    Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{1,4}"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L686
    Pattern.compile("([a-z]+)([\\+\\-]\\d+)$"),
    // https://github.com/wmwijaya/indonesian-text-summarizer/blob/458e823f154ad98b802762e41a2a374c0b9b8cfd/IndonesianSummarizerFunction/src/main/java/com/IndonesianNLP/idnlp/IndonesianNETagger.java#L806
    Pattern.compile("([a-z]+)([\\+\\-]\\d+)=([A-Z]+)$"),
    // https://github.com/mydeadvictoria/spring-integration-demo-task/blob/0c0b27365c564512fbd32e22118b019f29564c1f/src/main/java/com/example/springintegrationdemo/engine/expression/ArrayExpressionResolver.java#L30
    Pattern.compile("\\(payload\\..* map \\{.+\\}\\)", Pattern.DOTALL),
    // https://github.com/mydeadvictoria/spring-integration-demo-task/blob/0c0b27365c564512fbd32e22118b019f29564c1f/src/main/java/com/example/springintegrationdemo/engine/expression/ArrayExpressionResolver.java#L33
    Pattern.compile("\\(payload\\.(.+) map (\\{.+\\})\\)", Pattern.DOTALL),
    // https://github.com/rahulram756/pennant-OpeneTelemetry/blob/976e737db9d4a3de9760bcbce1fa4f9153724750/javaagent-tooling/src/main/java/io/opentelemetry/javaagent/tooling/muzzle/collector/MuzzleCodeGenerator.java#L482
    Pattern.compile("(?<enumClass>.*)\\$[0-9]+$"),
    // https://github.com/rahulram756/pennant-OpeneTelemetry/blob/976e737db9d4a3de9760bcbce1fa4f9153724750/javaagent-tooling/src/main/java/io/opentelemetry/javaagent/tooling/matcher/GlobalIgnoresMatcher.java#L32
    Pattern.compile("com\\.mchange\\.v2\\.c3p0\\..*Proxy"),
    // https://github.com/mobile-gt/chatoxpakaryo-sdk/blob/079c0bea0a4716ad046f6f1f68e394f79673981f/chatosdk/src/main/java/com/gamatechno/chato/sdk/utils/SocialView/SocialViewHelper.java#L175
    Pattern.compile("#(\\w+)"),
    // https://github.com/rahulram756/pennant-OpeneTelemetry/blob/976e737db9d4a3de9760bcbce1fa4f9153724750/instrumentation-api/src/main/java/io/opentelemetry/instrumentation/api/config/Config.java#L24
    Pattern.compile("[^a-zA-Z0-9.]"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L118
    Pattern.compile("[\\[\\{<>(),\\t\\s\\+\\-\\/\\*^%!|&=?:~]\\d+\\.?\\d*"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L214
    Pattern.compile("[\\[\\{<>(),\\t\\s\\+\\-\\/\\*^%!|&=?:~]0x[A-Fa-f0-9]+"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L368
    Pattern.compile("color\\(|color\\s\\(|fill[\\(\\s]|stroke[\\(\\s]|background[\\(\\s]|tint[\\(\\s]"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L453
    Pattern.compile("ambientLight[\\(\\s]|directionalLight[\\(\\s]|pointLight[\\(\\s]|spotLight[\\(\\s]|lightSpecular[\\(\\s]|specular[\\(\\s]|ambient[\\(\\s]|emissive[\\(\\s]"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L598
    Pattern.compile("[+\\-]?(?:0|[1-9]\\d*)(?:\\.\\d*)?[eE][+\\-]?\\d+"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L671
    Pattern.compile("\r\n|\n\r|\n|\r"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L893
    Pattern.compile("void[\\s\\t\\r\\n]*setup[\\s\\t]*\\(\\)[\\s\\t\\r\\n]*\\{"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/tweak/SketchParser.java#L940
    Pattern.compile("size[\\s\\t]*\\("),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/preproc/PdePreprocessor.java#L178
    Pattern.compile("(?:^|\\s|;)void\\s+setup\\s*\\(", Pattern.MULTILINE),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/preproc/PdePreprocessor.java#L181
    Pattern.compile("(?:^|\\s|;)void\\s+settings\\s*\\(", Pattern.MULTILINE),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/preproc/PdePreprocessor.java#L186
    Pattern.compile("(^|;)\\s*public\\s+class\\s+\\S+\\s+extends\\s+PApplet", Pattern.MULTILINE),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/preproc/PdePreprocessor.java#L190
    Pattern.compile("(^|;)\\s*((public|private|protected|final|static)\\s+)*(void|int|float|double|String|char|byte|boolean)(\\s*\\[\\s*\\])?\\s+[a-zA-Z0-9]+\\s*\\(", Pattern.MULTILINE),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/preproc/PdePreprocessor.java#L874
    Pattern.compile("((?:^|;|\\})\\s*)(import\\s+)((?:static\\s+)?\\S+)(\\s*;)"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L22
    Pattern.compile("(?:^|;)\\s*(import\\s+(?:(static)\\s+)?((?:\\w+\\s*\\.)*)\\s*(\\S+)\\s*;)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L26
    Pattern.compile("^\\s*((?:(static)\\s+)?((?:\\w+\\s*\\.)*)\\s*(\\S+))", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L63
    Pattern.compile("(?<=^|\\W)(int|char|float|boolean|byte)(?=\\s*\\()", Pattern.MULTILINE),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L87
    Pattern.compile("(?<=^|\\W)(#[A-Fa-f0-9]{6})(?=\\W|$)"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L155
    Pattern.compile("(?:^(?:[0-9]|[0-9][0-9_]*[0-9])\\.(?:[0-9]|[0-9][0-9_]*[0-9])?(?:[eE][+-]?(?:[0-9]|[0-9][0-9_]*[0-9]))?[fFdD]?$)|(?:^\\.(?:[0-9]|[0-9][0-9_]*[0-9])(?:[eE][+-]?(?:[0-9]|[0-9][0-9_]*[0-9]))?[fFdD]?$)|(?:^(?:[0-9]|[0-9][0-9_]*[0-9])(?:[eE][+-]?(?:[0-9]|[0-9][0-9_]*[0-9]))[fFdD]?$)|(?:^(?:[0-9]|[0-9][0-9_]*[0-9])(?:[eE][+-]?(?:[0-9]|[0-9][0-9_]*[0-9]))?[fFdD]$)"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L205
    Pattern.compile("(?:^|^\\p{javaJavaIdentifierPart})(color)\\s(?!\\s*\\()", Pattern.MULTILINE|Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/SourceUtils.java#L222
    Pattern.compile("[-+]?[0-9]*\\.?[0-9]+(?:[eE][-+]?[0-9]+)?"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/ErrorMessageSimplifier.java#L50
    Pattern.compile("\\b token\\b"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/ErrorMessageSimplifier.java#L252
    Pattern.compile("[^“”]"),
    // https://github.com/David-Birge-Cotte/la-spirulerie/blob/9300d7ed8c2b243ed66b4b2649c54a5fb71ade8b/MK3_Firmware/lib/TFT_eSPI_Modified/Tools/Create_Smooth_Font/Create_font/processing-3.5.4/modes/java/src/processing/mode/java/pdex/ErrorMessageSimplifier.java#L359
    Pattern.compile("[^‘’“”]"),
    // https://github.com/qtqa/gerrit/blob/40d08ce811755524a3b5a5911652bac36e7596ab/java/com/google/gerrit/server/config/ConfigUtil.java#L206
    Pattern.compile("^(0|[1-9][0-9]*)\\s*(.*)$"),
    // https://github.com/rahulram756/pennant-OpeneTelemetry/blob/976e737db9d4a3de9760bcbce1fa4f9153724750/javaagent/src/main/java/io/opentelemetry/javaagent/OpenTelemetryAgent.java#L128
    Pattern.compile("-javaagent:([^=]+).*"),
    // https://github.com/gh7800/AndroidFourComponent/blob/8fefa93b1a5cbb135c5aeceaa248f7f18a478524/base/src/main/java/cn/shineiot/base/utils/RegularUtil.java#L15
    Pattern.compile("^((13[0-9])|(14[4-9])|(15[^4])|(16[6-7])|(17[^9])|(18[0-9])|(19[1|8|9]))\\d{8}$"),
    // https://github.com/apache/camel/blob/2a0abf84740b430a0b7c31c140cdfbb88693f59d/core/camel-core-languages/src/main/java/org/apache/camel/language/csimple/CSimpleHelper.java#L299
    Pattern.compile("[+-]"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/module/post/adapter/PostCommentAdapter.java#L100
    Pattern.compile("(.*?)\\((Lv\\..*)\\)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/module/post/adapter/PostCommentAdapter.java#L109
    Pattern.compile("(.*?)发表于(.*?)\n(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/module/magic/presenter/UseMagicPresenter.java#L79
    Pattern.compile("(.*?)CDATA\\[(.*?)<script(.*?)"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L16
    Pattern.compile("(\\d{4}-)?(\\d{1,2}-\\d{1,2})\\s*(\\d{2}:\\d{2}(:\\d{2})?)?"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L19
    Pattern.compile("今天(\\s*(\\d{2}:\\d{2}))?"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L20
    Pattern.compile("昨天(\\s*(\\d{2}:\\d{2}))?"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L21
    Pattern.compile("前天(\\s*(\\d{2}:\\d{2}))?"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L22
    Pattern.compile("(\\d+)\\s*秒前"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L23
    Pattern.compile("(\\d+)\\s*分钟前"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L24
    Pattern.compile("(\\d+)\\s*小时前"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L25
    Pattern.compile("(\\d+)\\s*天前"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L26
    Pattern.compile("(\\d+)\\s*周前"),
    // https://github.com/xl-code-bit/newspaper-crawler/blob/f27583976e159961e9b49c9ab51a77a0f9ac74a6/src/main/java/com/hz/newspaper/utils/DateUtils.java#L105
    Pattern.compile("星期([一二三四五六日])"),
    // https://github.com/AAAAGHHH/BK/blob/beac9098eb45c5f21e7529386425f3108865a6e6/src/main/java/com/utils/TaleUtils.java#L31
    Pattern.compile("^[A-Za-z0-9_-]{5,100}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/AAAAGHHH/BK/blob/beac9098eb45c5f21e7529386425f3108865a6e6/src/main/java/com/utils/TaleUtils.java#L207
    Pattern.compile("eval\\((.*)\\)"),
    // https://github.com/AAAAGHHH/BK/blob/beac9098eb45c5f21e7529386425f3108865a6e6/src/main/java/com/utils/TaleUtils.java#L208
    Pattern.compile("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']"),
    // https://github.com/AAAAGHHH/BK/blob/beac9098eb45c5f21e7529386425f3108865a6e6/src/main/java/com/utils/TaleUtils.java#L209
    Pattern.compile("script"),
    // https://github.com/Gavin213917/javaBasicLearning/blob/89f65ba1fff644a5e0eb1b7ae682bdac9a49fd14/basicKnowledge/src/main/java/com/gavin/date/StringUtils.java#L113
    Pattern.compile("[\\-|\\+]?\\d+"),
    // https://github.com/Gavin213917/javaBasicLearning/blob/89f65ba1fff644a5e0eb1b7ae682bdac9a49fd14/basicKnowledge/src/main/java/com/gavin/date/StringUtils.java#L114
    Pattern.compile("[\\-|\\+]?\\d*[\\.]?\\d+"),
    // https://github.com/Gavin213917/javaBasicLearning/blob/89f65ba1fff644a5e0eb1b7ae682bdac9a49fd14/basicKnowledge/src/main/java/com/gavin/date/StringUtils.java#L1052
    Pattern.compile("[\u0391-\uFFE5]"),
    // https://github.com/Harveybegood/algs4_harvey/blob/12b631205d0135cbe40e1f8c5c84fee3895dfa69/Chapter1_3_Bags_Queues_Stacks/Ex17.java#L27
    Pattern.compile("[^a-zA-Z]"),
    // https://github.com/Harveybegood/algs4_harvey/blob/12b631205d0135cbe40e1f8c5c84fee3895dfa69/Chapter1_3_Bags_Queues_Stacks/Ex17.java#L30
    Pattern.compile("\\d{1,4}[-/]\\d{1,2}[-/]\\d{1,2}"),
    // https://github.com/Harveybegood/algs4_harvey/blob/12b631205d0135cbe40e1f8c5c84fee3895dfa69/Chapter1_3_Bags_Queues_Stacks/Ex17.java#L33
    Pattern.compile("[1-9]\\d*(\\.\\d+)?"),
    // https://github.com/servicecatalog/oscm-app/blob/7a9bbe386ef2fc9bc1b2fb30c37ca8a5704c8b2b/oscm-app-vmware/src/test/java/org/oscm/app/vmware/business/statemachine/CreateActionsTest.java#L153
    Pattern.compile("regex"),
    // https://github.com/shangcg/spring-boot-2.2/blob/0ab7b1b8998a4d17e7dbc91f574c0396cd17bf77/spring-boot-project/spring-boot-tools/spring-boot-loader-tools/src/main/java/org/springframework/boot/loader/tools/DefaultLaunchScript.java#L45
    Pattern.compile("\\{\\{(\\w+)(:.*?)?\\}\\}(?!\\})"),
    // https://github.com/shangcg/spring-boot-2.2/blob/0ab7b1b8998a4d17e7dbc91f574c0396cd17bf77/spring-boot-project/spring-boot-tools/spring-boot-gradle-plugin/src/test/java/org/springframework/boot/gradle/testkit/GradleBuildExtension.java#L38
    Pattern.compile("\\[Gradle .+\\]"),
    // https://github.com/lastwhispers/code/blob/6e3831d30db0f21a0e20a95e5457ddc222a015f6/java-basic/basic/src/main/java/cn/lastwhisper/basic/regex/RegExTest.java#L23
    Pattern.compile("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$"),
    // https://github.com/weimin96/Talker/blob/99d9ee770529c84e959c19d3a5a60aed4c1320e6/App/ITalker/common/src/main/java/com/aoliao/example/face/Face.java#L236
    Pattern.compile("(\\[[^\\[\\]:\\s\\n]+\\])"),
    // https://github.com/deboxfaheem/Travelwing-app/blob/937cc95643f1e3bdbe33ea13b29e340f87b2cf6f/app/src/main/java/com/travelwings/trav_client/RegisterLogin.java#L37
    Pattern.compile("\\\\r\\\\n"),
    // https://github.com/prestosql/presto/blob/69ce7869427a65255b0ccdf67ba75313b5f9c1c2/presto-jdbc/src/main/java/io/prestosql/jdbc/AbstractPrestoResultSet.java#L89
    Pattern.compile("(?<year>[-+]?\\d{4,})-(?<month>\\d{1,2})-(?<day>\\d{1,2})(?: (?<hour>\\d{1,2}):(?<minute>\\d{1,2})(?::(?<second>\\d{1,2})(?:\\.(?<fraction>\\d+))?)?)?\\s*(?<timezone>.+)?"),
    // https://github.com/prestosql/presto/blob/69ce7869427a65255b0ccdf67ba75313b5f9c1c2/presto-jdbc/src/main/java/io/prestosql/jdbc/AbstractPrestoResultSet.java#L94
    Pattern.compile("(?<hour>\\d{1,2}):(?<minute>\\d{1,2}):(?<second>\\d{1,2})(?:\\.(?<fraction>\\d+))?"),
    // https://github.com/prestosql/presto/blob/69ce7869427a65255b0ccdf67ba75313b5f9c1c2/presto-jdbc/src/main/java/io/prestosql/jdbc/AbstractPrestoResultSet.java#L95
    Pattern.compile("(?<hour>\\d{1,2}):(?<minute>\\d{1,2}):(?<second>\\d{1,2})(?:\\.(?<fraction>\\d+))?[ ]?(?<sign>[+-])(?<offsetHour>\\d\\d):(?<offsetMinute>\\d\\d)"),
    // https://github.com/andyluna/javastudy/blob/5fada16b2ac981f2b0b4892621fa9fe97f986f51/netty-study/src/main/java/io/netty/example/http/file/HttpStaticFileServerHandler.java#L280
    Pattern.compile("[^-\\._]?[^<>&\\\"]*"),
    // https://github.com/AlexFalappa/nb-springboot/blob/ceb73b6dfc84778de08abaa9b7139eb1e3c4dea6/src/main/java/com/github/alexfalappa/nbspringboot/Utils.java#L85
    Pattern.compile("(\\w+\\.)+(\\w+)"),
    // https://github.com/cosminpopescu14/code-with-quarkus-profanity/blob/35a4054057b062c2910adee2e749eb0996caa17d/code-with-quarkus-profanity/src/main/java/org/acme/services/ProfanityService.java#L48
    Pattern.compile("((\\b[^\\s]+\\b)((?<=\\.\\w).)?)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ds185045/JsonFlattener/blob/980f2d89999eaadb6f501af4c0ef8f819744cd14/src/main/java/com/automationanywhere/botcommand/samples/commands/basic/JsonToArray.java#L193
    Pattern.compile("\\[[0-9]+\\]+"),
    // https://github.com/ds185045/JsonFlattener/blob/980f2d89999eaadb6f501af4c0ef8f819744cd14/src/main/java/com/automationanywhere/botcommand/samples/commands/basic/JsonToArray.java#L211
    Pattern.compile("\\[[0-9]+\\]"),
    // https://github.com/ds185045/JsonFlattener/blob/980f2d89999eaadb6f501af4c0ef8f819744cd14/src/main/java/com/automationanywhere/botcommand/samples/commands/basic/JsonToArray.java#L243
    Pattern.compile("\\.0"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.repository/src/functionalTest/java/com/ngc/seaside/gradle/plugins/repository/PasswordHidingWriter.java#L31
    Pattern.compile("(password\\s*?=?)\\s*\\S+", Pattern.CASE_INSENSITIVE),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.release/src/main/java/com/ngc/seaside/gradle/plugins/version/VersionResolver.java#L43
    Pattern.compile("^(?<beginning> \\s*? version \\s*? = \\s*? ([\"']?) ) (?<version> \\d+?(?:\\.\\d+?)+? ) (?<suffix> [-\\.][A-Za-z]+ )? (?<ending> \\2\\s*? )$", Pattern.COMMENTS|Pattern.MULTILINE),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.eclipse/src/main/java/com/ngc/seaside/gradle/plugins/eclipse/BaseEclipsePlugin.java#L82
    Pattern.compile("(?<name>\\w+?(?:\\.\\w+?)*?)[\\.\\-_](?<versionNumber>\\d+?(?:\\.\\d+?){0,2})([\\._\\-](?<versionQualifier>[\\w\\-\\.]+?))?\\.(?<extension>jar)"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.eclipse/src/main/java/com/ngc/seaside/gradle/plugins/eclipse/BaseEclipsePlugin.java#L85
    Pattern.compile("(?<versionNumber>\\d+?(?:\\.\\d+?){0,2})([\\._\\-](?<versionQualifier>[\\w\\-\\.]+?))?"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.cpp/src/main/java/com/ngc/seaside/gradle/plugins/cpp/dependencies/UnpackCppDistributionsTask.java#L90
    Pattern.compile("(.+)-\\d+\\.\\d+(\\.\\d+)?(-\\w+)?"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.base/src/main/java/com/ngc/seaside/gradle/util/Versions.java#L35
    Pattern.compile("(\\d+\\.\\d+\\.\\d+)(-(\\w+))?"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.base/src/main/java/com/ngc/seaside/gradle/util/Versions.java#L37
    Pattern.compile("(\\d+\\.\\d+)(-(\\w+))?"),
    // https://github.com/NorthropGrumman/seaside-gradle-plugins/blob/34999237b4048678dc42bb5e08c4bdacabd4a8b5/com.ngc.seaside.gradle.plugins.base/src/main/java/com/ngc/seaside/gradle/util/OsgiResolver.java#L299
    Pattern.compile("(?<name>\\w+(?:\\.\\w+))*[\\._-](?<version>\\d+(?:\\.\\d+)*(?:[\\._-]\\w+)?)\\.(?<extension>jar|zip)"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L35
    Pattern.compile("wp-featherligh-css"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L36
    Pattern.compile("contact-form-7-css"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L37
    Pattern.compile("wp-postratings-css"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L38
    Pattern.compile("wpfront-scroll-top-css"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L39
    Pattern.compile("core-front-css"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L62
    Pattern.compile("Powered by .*WordPress"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L63
    Pattern.compile("wp-pwd"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L64
    Pattern.compile("wp-submit"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L65
    Pattern.compile("wp-core-ui"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L67
    Pattern.compile("wordpress_test_cookie"),
    // https://github.com/inkarnadin/cms-check-component/blob/abc4039c86675acab33961f047ff5068d959b18a/src/main/java/web/cms/wordpress/WordPressCheckProcessor.java#L69
    Pattern.compile("XML-RPC server accepts POST requests only"),
    // https://github.com/Maple-mxf/rest-doc/blob/b57448c615873f546a0360af30c959aab2729d4b/restdoc-web/src/main/kotlin/restdoc/web/util/dp/BaseProjector.java#L28
    Pattern.compile("([a-zA-Z0-9_]+[a-zA-Z0-9_\\-]*)(\\[\\d*\\])+"),
    // https://github.com/Tau-Coin/dhtTAU/blob/c6e005d68c2082ead45a8672110f8d306d837897/taucoin-android/src/main/java/io/taucoin/torrent/publishing/core/utils/Utils.java#L56
    Pattern.compile("\\b[0-9a-fA-F]{5,40}\\b"),
    // https://github.com/Tau-Coin/dhtTAU/blob/c6e005d68c2082ead45a8672110f8d306d837897/taucoin-android/src/main/java/io/taucoin/torrent/publishing/core/utils/Utils.java#L406
    Pattern.compile("^(([0-9]{1,3}.){3}[0-9]{1,3}|([0-9a-z][0-9a-z-]{0,61})?[0-9a-z].[a-z]{2,6})(:[0-9]{1,4})$"),
    // https://github.com/xzhuah/codingDimension/blob/e7d6576b9f81c5eca12f999eefac4d914cf9b1eb/xinyu/java/src/main/java/nodes/mapNode/china/utils/Converter.java#L21
    Pattern.compile("([0-9]+),([0-9]+),([0-9]+),([0-9]+),([0-9]+),\'([0-9]*)\',\'([^\']+)\',\'([^\']+)\',\'([^\']+)\',\'([\\s\\S]*)\',([0-9.]+),([0-9.]+)"),
    // https://github.com/maximdrive/TestTask1/blob/692b27076d566b7a6367fe9ea9a85011d511f6b6/src/com/beans/PersonInfo.java#L112
    Pattern.compile("(\\+*)375\\d{9}"),
    // https://github.com/sunshinexinxin/mushroomGreenHouseGraduateDesign/blob/4e6d6a360a14558bb6a7ebcfdf65873c263c243c/src/com/hbkd/hyx/tool/CommonUtil.java#L132
    Pattern.compile("\\D*"),
    // https://github.com/izgzhen/markii/blob/d7cb5298050fbbd38a3d8b19b69718e048817877/src/main/java/soot/toDex/DexPrinter.java#L206
    Pattern.compile("META-INF/[^/]+(\\.SF|\\.DSA|\\.RSA|\\.EC)$"),
    // https://github.com/privateXqr/cm_web/blob/b44ab5ce08ec0ddeef58d61224434850b94ff0bc/cm_web/src/main/java/com/sy/util/StringReqUtil.java#L16
    Pattern.compile("\\d{2,3}\\w+"),
    // https://github.com/UnderKoen/AdventOfCode/blob/41d26d35654f95279e25375cb6fd4eb2ea262d20/src/main/java/nl/underkoen/adventofcode/solutions/year2018/Day04.java#L25
    Pattern.compile("Guard #(\\d+)"),
    // https://github.com/UnderKoen/AdventOfCode/blob/41d26d35654f95279e25375cb6fd4eb2ea262d20/src/main/java/nl/underkoen/adventofcode/solutions/year2018/Day04.java#L36
    Pattern.compile("]"),
    // https://github.com/nkkize/DSnA/blob/f3593b0cb035b69323730e27c5f2e3c5a04d7cd6/src/com/nkk/regex/RegexPatterns.java#L9
    Pattern.compile("((\\+\\d{1,2}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4})", Pattern.MULTILINE),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/services/core/java/com/android/server/display/OverlayDisplayAdapter.java#L62
    Pattern.compile("(\\d+)x(\\d+)/(\\d+)(,[a-z]+)*"),
    // https://github.com/LenovoTab2A7/android_frameworks_base-mt8127/blob/db35e5a4d17493a215cb62bdf8f507a1434b8d10/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeParameters.java#L177
    Pattern.compile("(\\d+?)s"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/oppo/internal/telephony/imsphone/OppoImsPhoneReference.java#L286
    Pattern.compile("_(A\\.\\d\\d)_"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/oppo/enterprise/mdmcoreservice/service/managerimpl/DeviceConnectivityManagerImpl.java#L181
    Pattern.compile("^[0-9a-fA-F]{2}((:[0-9a-fA-F]{2})|(-[0-9a-fA-F]{2})){2,5}([/*]+)$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/oppo/enterprise/mdmcoreservice/service/managerimpl/DeviceConnectivityManagerImpl.java#L181
    Pattern.compile("^(([0-9a-fA-F]{2}-)|(([0-9a-fA-F]{2}:))){3,5}([0-9a-fA-F]){0,1}([/*]+)$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/oppo/enterprise/mdmcoreservice/service/managerimpl/DeviceConnectivityManagerImpl.java#L183
    Pattern.compile("^[0-9a-fA-F]{2}((:[0-9a-fA-F]{2})|(-[0-9a-fA-F]{2})){5}$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/server/anr/AnrManagerService.java#L967
    Pattern.compile("(\\S+.+transaction).+from\\s+(\\d+):(\\d+)\\s+to\\s+(\\d+):(\\d+).+start\\s+(\\d+\\.+\\d+).+android\\s+(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+\\.\\d+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/powerhalservice/PowerHalAddressUtils.java#L9
    Pattern.compile("^::[fF]{4}:(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/internal/telephony/MtkPhoneNumberUtils.java#L161
    Pattern.compile("^([*][#]|[*]{1,2}|[#]{1,2})([0-9]{2,3})([*])([+]?[0-9]+)(.*)(#)$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/internal/telephony/MtkPhoneNumberUtils.java#L194
    Pattern.compile("^([*][#]|[*]{1,2}|[#]{1,2})([0-9]{2,3})([*])([0-9]+)(.*)(#)$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/custom/CustomPropInterface.java#L17
    Pattern.compile("\\s+AppleWebKit\\/(\\d+\\.?\\d*)\\s+"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/rawdataimport/fileformats/NativeFileReadTask.java#L264
    Pattern.compile(".* ms\\d+ (\\d+\\.\\d+)[@ ]"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/rawdataimport/fileformats/NativeFileReadTask.java#L279
    Pattern.compile("MASS VALUES: (\\d+) x (\\d+) BYTES"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/rawdataimport/fileformats/NativeFileReadTask.java#L312
    Pattern.compile("INTENSITY VALUES: (\\d+) x (\\d+) BYTES"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/rawdataimport/fileformats/MzMLReadTask.java#L67
    Pattern.compile("scan=([0-9]+)"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/projectload/ProjectOpeningTask.java#L179
    Pattern.compile("Peak list #([\\d]+) (.*)\\.xml$"),
    // https://github.com/mzmine/mzmine3/blob/36610f23e38e39a3e591e87a2222b9a5ff060f41/src/main/java/io/github/mzmine/modules/io/projectload/ProjectOpeningTask.java#L333
    Pattern.compile("^(\\d+)\\.(\\d+)"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/service/validator/SignInDataValidator.java#L7
    Pattern.compile("[^$#№%,?&!\\s]{3,20}"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/service/validator/SignInDataValidator.java#L8
    Pattern.compile("([^$#№%,?&!\\.\\s]{5,15})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/UserValidation.java#L7
    Pattern.compile("([A-Za-z0-9-_]){5,20}"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/UserValidation.java#L8
    Pattern.compile("([A-Za-z0-9_-]){5,15}"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/UserValidation.java#L9
    Pattern.compile("([A-ZА-Я])([a-zа-я]{1,15})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/UserValidation.java#L10
    Pattern.compile("([a-z0-9_-]{1,15})@([a-z0-9_-]{1,10})(\\.([a-z]{2,6}))"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/FlightValidation.java#L9
    Pattern.compile("([A-Za-zА-Яа-я]{2,15})\\s?([-]?)\\s?([A-Za-zА-Яа-я]{2,15})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/FlightValidation.java#L10
    Pattern.compile("([1-9])([0-9]{1,2})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/FlightValidation.java#L11
    Pattern.compile("([1-9])([0-9]{2,3})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/AircraftValidation.java#L7
    Pattern.compile("([A-Z]{1,5})-([A-Z0-9]{1,7})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/AircraftValidation.java#L8
    Pattern.compile("([A-Za-z]{1,10})([-\\s])([0-9]{1,5})"),
    // https://github.com/pavelveka1/com.epamtr.final_project/blob/e25ba1631b823492f4ad62f1a3581a99db72f5b7/src/main/java/by/epamtr/airline/controller/validation/AircraftValidation.java#L10
    Pattern.compile("([1-9])([0-9]{3})"),
    // https://github.com/Xbc-gressor/Practice_BigData/blob/092d66e864a664e1fc7ff56957de2e0669c16c61/01%E6%8A%80%E6%9C%AF%E5%AD%A6%E4%B9%A0/day0203/HadoopTest/src/com/demo/salary/SalaryReduce.java#L50
    Pattern.compile("\\u4e07"),
    // https://github.com/Xbc-gressor/Practice_BigData/blob/092d66e864a664e1fc7ff56957de2e0669c16c61/01%E6%8A%80%E6%9C%AF%E5%AD%A6%E4%B9%A0/day0203/HadoopTest/src/com/demo/salary/SalaryReduce.java#L56
    Pattern.compile("\\u5e74"),
    // https://github.com/Xbc-gressor/Practice_BigData/blob/092d66e864a664e1fc7ff56957de2e0669c16c61/01%E6%8A%80%E6%9C%AF%E5%AD%A6%E4%B9%A0/day0203/HadoopTest/src/com/demo/salary/SalaryReduce.java#L88
    Pattern.compile("[^\\d.]+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L170
    Pattern.compile("@[a-zA-Z]+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L173
    Pattern.compile("(\\s+|//[^\\n]*\\n)+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L174
    Pattern.compile("[a-zA-Z\\.]+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L175
    Pattern.compile("[a-zA-Z\\./:]+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L176
    Pattern.compile("\\[[a-zA-Z0-9\\-_]+\\]"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L177
    Pattern.compile("=>"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L179
    Pattern.compile("[a-zA-Z0-9\\-_]+"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L360
    Pattern.compile("[a-zA-Z]+[a-zA-Z0-9]*"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L361
    Pattern.compile("'[^']*'|\\\"[^\\\"]*\\\""),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L363
    Pattern.compile("[0-9]*\\.[0-9]+f?"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L364
    Pattern.compile("\\$[a-zA-Z]+[a-zA-Z0-9]"),
    // https://github.com/PixelExtended/frameworks_base/blob/7e143d14635fa7a1b05744b63372147f3d9c4f09/media/mca/filterfw/java/android/filterfw/io/TextGraphReader.java#L365
    Pattern.compile("true|false"),
    // https://github.com/cliveyao/TestRepository/blob/bc600b9bc1420054e53ffd56f7864dc83960b68a/src/main/java/org/lf/utils/StringUtils.java#L232
    Pattern.compile("\\t|\r|\n"),
    // https://github.com/cliveyao/TestRepository/blob/bc600b9bc1420054e53ffd56f7864dc83960b68a/src/main/java/org/lf/utils/StringUtils.java#L281
    Pattern.compile("[&]"),
    // https://github.com/cliveyao/TestRepository/blob/bc600b9bc1420054e53ffd56f7864dc83960b68a/src/main/java/org/lf/utils/StringUtils.java#L283
    Pattern.compile("[=]"),
    // https://github.com/apache/calcite/blob/b75c549194bcbb1e2c028b28fd1858c4e300bd41/mongodb/src/test/java/org/apache/calcite/test/MongoAssertions.java#L43
    Pattern.compile("\\.0$"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L696
    Pattern.compile("[\\u0000-\\u0020　]+\\z"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L695
    Pattern.compile("\\A[\\u0000-\\u0020　]+"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L724
    Pattern.compile("(?m)[\\u0000-\\u0020　&&[^\\n\\r]]+$"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L723
    Pattern.compile("(?m)^[\\u0000-\\u0020　&&[^\\n\\r]]+"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L738
    Pattern.compile("\\|\t|\r|\n|\r\n"),
    // https://github.com/tianfangxu/Security-Server/blob/0203a112f35b5d4ccd4072827e452886987fc560/server-web/common/src/main/java/com/mot/utils/CommonUtil.java#L840
    Pattern.compile(".*[\\d]{6,6}$"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/autojs/src/main/java/com/stardust/autojs/engine/RootAutomatorEngine.java#L32
    Pattern.compile("[0-9]{2,}"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/autojs/src/main/java/com/stardust/autojs/core/ui/inflater/util/Drawables.java#L29
    Pattern.compile("data:(\\w+/\\w+);base64,(.+)"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/autojs/src/main/java/com/stardust/autojs/core/ui/inflater/util/Dimensions.java#L30
    Pattern.compile("([+-]?[0-9.]+)([a-zA-Z]*)"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/autojs/src/main/java/com/stardust/autojs/core/record/inputevent/InputEventRecorder.java#L18
    Pattern.compile("[^0-9]+([0-9]+)$"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/autojs/src/main/java/com/stardust/autojs/core/inputevent/InputEventObserver.java#L21
    Pattern.compile("^\\[([^\\]]*)\\]\\s+([^:]*):\\s+([^\\s]*)\\s+([^\\s]*)\\s+([^\\s]*)\\s*$"),
    // https://github.com/hamibot/hamibot/blob/9be58c31007f82ab21b24f8df9dc1ef37ab514c6/app/src/main/java/org/autojs/autojs/ui/project/ProjectConfigActivity.java#L53
    Pattern.compile("^([A-Za-z][A-Za-z\\d_]*\\.)+([A-Za-z][A-Za-z\\d_]*)$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/projectmanage/project/businessobject/ProjectManageBo.java#L1288
    Pattern.compile("？"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/projectmanage/project/businessobject/ProjectManageBo.java#L1289
    Pattern.compile("＊"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L468
    Pattern.compile("(.{7}\\-\\-.{7}\\s{2}(.+))|(.{7}\\-\\-至今\\s{2}(.+))|(.{7}\\-\\-.{7}\\s{2})|(                (.+))|(.{7}\\-\\-       \\s{2}(.+))"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L1499
    Pattern.compile("至今       "),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L1548
    Pattern.compile("(.+)(\\(其中:(.+)\\))"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L1556
    Pattern.compile("\\(其中:"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L1573
    Pattern.compile("(.+)(\\(其间:(.+)\\))"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/officermanage/businessobject/impl/CardViewServiceImpl.java#L1581
    Pattern.compile("\\(其间:"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/util/KqUtil.java#L150
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]([0]*\\d{1}|[12]\\d{1}|3[01])[\\s日]([01]*\\d{1}|2[0-3])[:时]([0-5]*\\d{1})[:分]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/util/KqUtil.java#L152
    Pattern.compile("^(\\d{4})[-.年]([0]*\\d{1}|1[0-2])[-.月]([0]*\\d{1}|[12]\\d{1}|3[01])[\\s日]([01]*\\d{1}|2[0-3])[:时]([0-5]*\\d{1})[:分]([0-5]*\\d{1})[秒]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/card/businessobject/impl/KqCardDataServiceImpl.java#L1681
    Pattern.compile("日"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/card/businessobject/impl/KqCardDataServiceImpl.java#L1683
    Pattern.compile("^(\\d{4})[-.年]([0]\\d{1}|1[0-2])[-.月]([0]\\d{1}|[12]\\d{1}|3[01])[\\s日]([01]\\d{1}|2[0-3])[:时]([0-5]\\d{1})[:分]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/card/businessobject/impl/KqCardDataServiceImpl.java#L1685
    Pattern.compile("^(\\d{4})[-.年]([0]\\d{1}|1[0-2])[-.月]([0]\\d{1}|[12]\\d{1}|3[01])[\\s日]([01]\\d{1}|2[0-3])[:时]([0-5]\\d{1})[:分]([0-5]\\d{1})[秒]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/card/businessobject/impl/KqCardDataServiceImpl.java#L1688
    Pattern.compile("^([01]\\d{1}|2[0-3])[:时]([0-5]\\d{1})[:分]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/kq/card/businessobject/impl/KqCardDataServiceImpl.java#L1690
    Pattern.compile("^([01]\\d{1}|2[0-3])[:时]([0-5]\\d{1})[:分]([0-5]\\d{1})[秒]*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/jobtitle/reviewfile/businessobject/ReviewFileBo.java#L1070
    Pattern.compile("b_query=link&encryptParam="),
    // https://github.com/apache/zeppelin/blob/b1d21e6934b8c4bc6596cb26514264cd5e0741d9/jdbc/src/main/java/org/apache/zeppelin/jdbc/hive/HiveUtils.java#L47
    Pattern.compile(".*Tracking URL = (\\S*).*", Pattern.DOTALL),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-runtime/src/test/java/org/apache/flink/runtime/leaderelection/ZooKeeperLeaderElectionTest.java#L91
    Pattern.compile("akka//user/jobmanager_(\\d+)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-runtime/src/test/java/org/apache/flink/runtime/leaderelection/ZooKeeperLeaderElectionTest.java#L91
    Pattern.compile("akka//user/jobmanager_(\\d+)_(\\d+)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-runtime/src/main/java/org/apache/flink/runtime/util/Hardware.java#L46
    Pattern.compile("^MemTotal:\\s*(\\d+)\\s+kB$"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-runtime-web/src/main/java/org/apache/flink/runtime/webmonitor/handlers/utils/JarHandlerUtils.java#L192
    Pattern.compile("([^\"\']\\S*|\".+?\"|\'.+?\')\\s*"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-metrics/flink-metrics-prometheus/src/main/java/org/apache/flink/metrics/prometheus/AbstractPrometheusReporter.java#L61
    Pattern.compile("[^a-zA-Z0-9:_]"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-libraries/flink-gelly-examples/src/test/java/org/apache/flink/graph/drivers/TestUtils.java#L77
    Pattern.compile("DataSink \\(org\\.apache\\.flink\\.api\\.java\\.io\\.DiscardingOutputFormat@[0-9a-f]{1,8}\\)"),
    // https://github.com/ChasonPickles/streamingWithQuantification/blob/6dde5d0e0c28c59c6fc2ed3cb6b313f06d381c3b/flink-libraries/flink-gelly-examples/src/test/java/org/apache/flink/graph/drivers/TestUtils.java#L78
    Pattern.compile("FlatMap \\(Translate results IDs\\)"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/vcs/gitlab/GitlabApiService.java#L87
    Pattern.compile("^([AMD]):([^\\r\\n]+)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/vcs/gitlab/GitlabApiService.java#L100
    Pattern.compile("/api/v.*$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/vcs/gitlab/GitlabApiService.java#L211
    Pattern.compile("^refs/(heads|tags)/"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/vcs/gitlab/GitlabApiService.java#L1367
    Pattern.compile("^0+$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/tool/CommonUtil.java#L63
    Pattern.compile("(token|password)(\\\"?\\s*[\\=\\:]\\s*\\[?\\\"?)([^,;\\\"\\'&}]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/tool/CommonUtil.java#L66
    Pattern.compile("^\\[([^\\]]+)\\](.+)$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/tool/CommonUtil.java#L373
    Pattern.compile("\\+0([0-9]){1}\\:00"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/sql/SqlQueryUtil.java#L24
    Pattern.compile("^\\`?[A-z][0-9A-z\\.\\_\\-\\`]*[0-9A-z]\\`?$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/sql/SqlQueryUtil.java#L27
    Pattern.compile("^((?:[\\<\\>]?\\=)|(?:[\\<\\>])|(?:%\\+)|(?:\\+?%))"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/sql/AbstractDao.java#L58
    Pattern.compile("^\\s*(SELECT|UPDATE|DELETE|INSERT)\\s+", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/sql/AbstractDao.java#L91
    Pattern.compile("^classpath\\s*:\\s*"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/model/AbstractUser.java#L14
    Pattern.compile(".+@([^@\\s]+)$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/model/AbstractUser.java#L44
    Pattern.compile("^[a-z][a-z0-9\\-\\_\\.]+[a-z0-9]$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/exception/MvcResponseExceptionHandler.java#L48
    Pattern.compile("^\\s*Duplicate\\s+entry", Pattern.CASE_INSENSITIVE),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-util/src/main/java/org/socyno/webfwk/util/conf/ConfigService.java#L17
    Pattern.compile("^[a-z0-9_\\.\\-]+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-state/src/main/java/org/socyno/webfwk/state/module/menu/SystemMenuService.java#L403
    Pattern.compile("(^.+)#\\((.+)\\)$"),
    // https://github.com/danyuandefine/PopularMVC/blob/d3cf6c16ab3d87d64b8bf42564cc43a415a9cf66/popular-web-mvc/src/main/java/com/danyuanblog/framework/popularmvc/aspect/ApiInvokeAspector.java#L46
    Pattern.compile("[0-9\\.]*"),
    // https://github.com/jaffersadhik/unitia/blob/59ab802b9000f7414c9f8e29a2570397c1d60e9c/unitiaroute/src/main/java/unitiaroute/RouteProcessor.java#L347
    Pattern.compile(".*[^0-9].*"),
    // https://github.com/apache/pulsar/blob/8e30dd465b7b6849375ec82a09eee06f490f33a9/pulsar-functions/runtime/src/main/java/org/apache/pulsar/functions/runtime/kubernetes/KubernetesRuntime.java#L109
    Pattern.compile("[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/pulsar/blob/8e30dd465b7b6849375ec82a09eee06f490f33a9/pulsar-functions/runtime/src/main/java/org/apache/pulsar/functions/runtime/kubernetes/KubernetesRuntime.java#L1105
    Pattern.compile("[^a-z0-9-\\.]"),
    // https://github.com/yichaun/up-habit/blob/761325990e31f3396f909002ccee472870b46938/src/main/java/com/up/habit/kit/StrKit.java#L200
    Pattern.compile("^[a-z0-9A-Z\\u4e00-\\u9fa5]+$"),
    // https://github.com/yichaun/up-habit/blob/761325990e31f3396f909002ccee472870b46938/src/main/java/com/up/habit/kit/StrKit.java#L225
    Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$"),
    // https://github.com/apache/pulsar/blob/625627c8cc2915974a55c5fa7ae02fe33dd2e4c8/pulsar-proxy/src/main/java/org/apache/pulsar/proxy/server/ProxyConfiguration.java#L578
    Pattern.compile("^httpReverseProxy\\.([^\\.]*)\\.(.+)$"),
    // https://github.com/WahyuSeptiadi/WaitingListApps/blob/d735959d79c688c3a6ef106ce1564325c1357020/app/src/main/java/com/wahyu/waitinglistapps/View/Activity/RegisterActivity.java#L116
    Pattern.compile("^[\\w.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/PEX-Rebase/system_core/blob/6b73045ed5b72701e6ac481c18605f71f44d7e38/fs_mgr/tests/src/com/android/tests/vendoroverlay/VendorOverlayHostTest.java#L54
    Pattern.compile("^overlay .+ /vendor$", Pattern.MULTILINE),
    // https://github.com/PEX-Rebase/system_core/blob/6b73045ed5b72701e6ac481c18605f71f44d7e38/fs_mgr/tests/src/com/android/tests/vendoroverlay/VendorOverlayHostTest.java#L55
    Pattern.compile("^overlay .+ /product$", Pattern.MULTILINE),
    // https://github.com/PEX-Rebase/system_core/blob/6b73045ed5b72701e6ac481c18605f71f44d7e38/fs_mgr/tests/src/com/android/tests/vendoroverlay/VendorOverlayHostTest.java#L118
    Pattern.compile("([1-9])[.]([0-9]+).*"),
    // https://github.com/line/armeria/blob/ce7a665bb584f5fbfe460bef7bde0afa8689c9f6/core/src/main/java/com/linecorp/armeria/client/DefaultDnsQueryLifecycleObserver.java#L50
    Pattern.compile("\\bNXDOMAIN\\b"),
    // https://github.com/line/armeria/blob/ce7a665bb584f5fbfe460bef7bde0afa8689c9f6/core/src/main/java/com/linecorp/armeria/client/DefaultDnsQueryLifecycleObserver.java#L51
    Pattern.compile("\\bCNAME\\b"),
    // https://github.com/line/armeria/blob/ce7a665bb584f5fbfe460bef7bde0afa8689c9f6/core/src/main/java/com/linecorp/armeria/client/DefaultDnsQueryLifecycleObserver.java#L52
    Pattern.compile("\\bmatching\\b"),
    // https://github.com/line/armeria/blob/ce7a665bb584f5fbfe460bef7bde0afa8689c9f6/core/src/main/java/com/linecorp/armeria/client/DefaultDnsQueryLifecycleObserver.java#L53
    Pattern.compile("\\bunrecognized\\b"),
    // https://github.com/line/armeria/blob/ce7a665bb584f5fbfe460bef7bde0afa8689c9f6/core/src/main/java/com/linecorp/armeria/client/DefaultDnsQueryLifecycleObserver.java#L54
    Pattern.compile("\\bservers returned an answer\\b"),
    // https://github.com/cwoac/Infinity-Army-Tools/blob/4036c3e2f46828d046f4a3a1171899a906be2f32/Core/src/main/java/net/codersoffortune/infinity/tts/TTSModel.java#L18
    Pattern.compile("\"ImageURL\":\"(?<url>[^\"]*)\""),
    // https://github.com/cwoac/Infinity-Army-Tools/blob/4036c3e2f46828d046f4a3a1171899a906be2f32/Core/src/main/java/net/codersoffortune/infinity/tts/TTSModel.java#L19
    Pattern.compile("\"MeshURL\":\"(?<url>[^\"]*)\""),
    // https://github.com/Easterlyn/Easterlyn/blob/c431a3606aa16ee42dfae736aae5eb1529c9d3fe/core/src/main/java/com/easterlyn/command/CoreContexts.java#L37
    Pattern.compile("(-?\\d+)[dl]?", Pattern.CASE_INSENSITIVE),
    // https://github.com/Easterlyn/Easterlyn/blob/c431a3606aa16ee42dfae736aae5eb1529c9d3fe/core/src/main/java/com/easterlyn/acf/EasterlynLocales.java#L18
    Pattern.compile("\\{@@(?<key>.+?)}", Pattern.CASE_INSENSITIVE),
    // https://github.com/Easterlyn/Easterlyn/blob/c431a3606aa16ee42dfae736aae5eb1529c9d3fe/chat/src/main/java/com/easterlyn/chat/event/UserChatEvent.java#L38
    Pattern.compile("$\\{ITEM:(\\d+)}^"),
    // https://github.com/StrokeBun/techtrainingcamp-client-16/blob/10e4b38e7cd2e14a690a541af208afe94910114b/app/src/main/java/com/example/newsboard/util/MarkdownUtils.java#L19
    Pattern.compile("\n.*?(!\\[\\s*(.*?)\\s*]\\(\\s*(\\S*?)(\\s+(['\"])(.*?)\\5)?\\s*?\\))"),
    // https://github.com/ankoye/young-tao/blob/32b33cdcfb004c278da02cd5ec2a7cc454a2ff12/youngtao-api/youngtao-common/youngtao-common-core/src/main/java/com/youngtao/core/util/Consts.java#L20
    Pattern.compile("[\\s,，]+"),
    // https://github.com/xbell3/PDT/blob/8f94c033b132078697ed3365672c849ae97418e9/PDTclient/src/usuario/VentanaRegistrarUsuario.java#L549
    Pattern.compile("[@]"),
    // https://github.com/xbell3/PDT/blob/8f94c033b132078697ed3365672c849ae97418e9/PDTclient/src/usuario/VentanaRegistrarUsuario.java#L550
    Pattern.compile(".com"),
    // https://github.com/cattman42/Pong/blob/5b19c8f2fa7bec8cecd642b5ce179b0ea7e0ae29/Test.java#L192
    Pattern.compile("\\d{1,4}"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/handler/src/main/java/io/netty/handler/ssl/CipherSuiteConverter.java#L55
    Pattern.compile("^(?:TLS|SSL)_((?:(?!_WITH_).)+)_WITH_(.*)_(.*)$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/handler/src/main/java/io/netty/handler/ssl/CipherSuiteConverter.java#L83
    Pattern.compile("^(AES)_([0-9]+)_CBC$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/handler/src/main/java/io/netty/handler/ssl/CipherSuiteConverter.java#L84
    Pattern.compile("^(AES)_([0-9]+)_(.*)$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/handler/src/main/java/io/netty/handler/ssl/CipherSuiteConverter.java#L85
    Pattern.compile("^(AES)([0-9]+)$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/handler/src/main/java/io/netty/handler/ssl/CipherSuiteConverter.java#L86
    Pattern.compile("^(AES)([0-9]+)-(.*)$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/common/src/main/java/io/netty/util/internal/PlatformDependent.java#L243
    Pattern.compile("[ ]+"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/codec-http/src/test/java/io/netty/handler/codec/http/cookie/ServerCookieEncoderTest.java#L46
    Pattern.compile("myCookie=myValue; Max-Age=50; Expires=(.+?); Path=/apathsomewhere; Domain=.adomainsomewhere; Secure; SameSite=Lax"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/codec-http/src/main/java/io/netty/handler/codec/rtsp/RtspDecoder.java#L72
    Pattern.compile("RTSP/\\d\\.\\d"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/extensions/WebSocketExtensionUtil.java#L37
    Pattern.compile("^([^=]+)(=[\\\"]?([^\\\"]+)[\\\"]?)?$"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketServerHandshaker00.java#L48
    Pattern.compile("[^ ]"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/ParseUtils.java#L32
    Pattern.compile("[\\s\\p{Punct}&&[^']]+"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/ParseUtils.java#L37
    Pattern.compile("(?<=(\\b|[._])\\p{Lu})[.](?=\\p{Lu}([.]|$))"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/ParseUtils.java#L40
    Pattern.compile("^(\\d+([.)][\\s\\p{Punct}]+|\\s+\\p{Punct}[\\p{Punct}\\s]*))*"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/ParseUtils.java#L48
    Pattern.compile("[\\s\\p{Punct}]([(][)])[\\s\\p{Punct}]"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieVerbatimMatcher.java#L40
    Pattern.compile("\\s*\"(.*)\"\\s*"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieSceneMatcher.java#L90
    Pattern.compile("(?i)(?:(?:DIR(?:ECTORS)?|EXTENDED)[\\s\\p{Punct}]?CUT|UNRATED|THEATRICAL[\\s\\p{Punct}]?EDITION)"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieSceneMatcher.java#L104
    Pattern.compile("((?:[^\\s\\p{Punct}]+[\\s\\p{Punct}])+?)((?:19|20)\\d{2})(?:[\\s\\p{Punct}][^\\s\\p{Punct}]+)+"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MoviePathMatcher.java#L45
    Pattern.compile(".*/((?:[\\p{L}\\p{N}]++\\s*+)++)\\(((?:19|20)\\d{2})\\)[^/]*+/[^/]++"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieDefaultMatcher.java#L173
    Pattern.compile("[\\s\\p{Punct}]((?:19|20)\\d{2})(?!\\d)"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieDefaultMatcher.java#L175
    Pattern.compile("[<({\\[].+?[>)}\\]]"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/preprocess/MovieDVDMatcher.java#L85
    Pattern.compile("(?i).*?/[^/]+/(?!VIDEO_TS)([^/]+)/(?:VIDEO_TS/)?(?:VTS_\\d\\d_\\d|VIDEO_TS)\\.VOB"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L65
    Pattern.compile("(.+?)[[\\p{Punct}&&[^()]]\\s]++(?:s|seas|season)[[\\p{Punct}&&[^()]]\\s]*+(20\\d{2}|\\d{1,2})[[\\p{Punct}&&[^()]]\\s]*+(?:e|ep|episode)[[\\p{Punct}&&[^()]]\\s]*+(\\d{1,3})(?!\\d).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L67
    Pattern.compile("(.+?)[[\\p{Punct}&&[^()]]\\s]++(20\\d{2}|\\d{1,2})[[\\p{Punct}&&[^()]]\\s]*+x[[\\p{Punct}&&[^()]]\\s]++(\\d{1,3})(?!\\d).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L69
    Pattern.compile("(.+?)[[\\p{Punct}&&[^()]]\\s]++(20\\d{2}|\\d{1,2})[[\\p{Punct}&&[^()]]\\s]*+x[[\\p{Punct}&&[^()]]\\s]*+(?!(?:264|265|720))(\\d{1,3})(?!\\d).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L73
    Pattern.compile("(.+)[[\\p{Punct}&&[^()]]\\s]++(?!(?:264|265|720))([1-9])(\\d{2,2})[[\\p{Punct}&&[^()]]\\s]++.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L59
    Pattern.compile("[[\\p{Punct}&&[^()]]\\s]*+(?:s|seas|season)[[\\p{Punct}&&[^()]]\\s]*+(\\d{1,2})[[\\p{Punct}&&[^()]]\\s]*+(?:e|ep|episode)[[\\p{Punct}&&[^()]]\\s]*+(\\d{1,3})(?!\\d)[[\\p{Punct}&&[^()]]\\s]*+([^-]*+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediascraper/ShowUtils.java#L59
    Pattern.compile("[[\\p{Punct}&&[^()]]\\s]*+(\\d{1,2})[[\\p{Punct}&&[^()]]\\s]*+x[[\\p{Punct}&&[^()]]\\s]*+(\\d{1,3})(?!\\d)[[\\p{Punct}&&[^()]]\\s]*+([^-]*+).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediaprovider/video/VobHandler.java#L351
    Pattern.compile("vts_(\\d\\d)_(\\d).vob", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediaprovider/video/Blacklist.java#L61
    Pattern.compile("^.*(?:sample|trailer)(?:\\.[^.]+)?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediacenter/utils/videodb/XmlDb.java#L388
    Pattern.compile(".*\\.(\\d+)\\.archos.resume.xml"),
    // https://github.com/nova-video-player/aos-MediaLib/blob/53c1e5a412a2bdf8eeaa91629b563b7c16b25963/src/com/archos/mediacenter/utils/videodb/XmlDb.java#L423
    Pattern.compile("\\.(.*)\\.\\d+\\.archos.resume.xml"),
    // https://github.com/glinnar/ProjektArbeteJavaVerktyg/blob/1d679b4b725127ad96910628ecbb43160993efee/src/main/java/com/Projektarbete/Contact/Contact.java#L13
    Pattern.compile("^[A-Za-z\\x{00C0}-\\x{00FF}][A-Za-z\\x{00C0}-\\x{00FF}\\'\\-]+([\\ A-Za-z\\x{00C4}-\\x{00F6}][A-Za-z\\x{00C4}-\\x{00F6}\\'\\-]+)*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/glinnar/ProjektArbeteJavaVerktyg/blob/1d679b4b725127ad96910628ecbb43160993efee/src/main/java/com/Projektarbete/Contact/Contact.java#L16
    Pattern.compile("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/glinnar/ProjektArbeteJavaVerktyg/blob/1d679b4b725127ad96910628ecbb43160993efee/src/main/java/com/Projektarbete/Contact/Contact.java#L18
    Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/awslabs/djl/blob/a00ecf3eb0f040e6bb44a315fe81d968b6a2da33/tensorflow/tensorflow-engine/src/main/java/ai/djl/tensorflow/engine/LibUtils.java#L41
    Pattern.compile("(\\d+\\.\\d+\\.\\d+(-[a-z]+)?)(-SNAPSHOT)?(-\\d+)?"),
    // https://github.com/awslabs/djl/blob/a00ecf3eb0f040e6bb44a315fe81d968b6a2da33/mxnet/mxnet-engine/src/main/java/ai/djl/mxnet/jna/LibUtils.java#L58
    Pattern.compile("\\s*'(.+)',"),
    // https://github.com/mcroteau/AngularFix/blob/ec234542cec7fa3e7a3ae2d706f0f39ac74a9e19/src/main/java/xyz/ioc/web/PostController.java#L49
    Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/mcroteau/AngularFix/blob/ec234542cec7fa3e7a3ae2d706f0f39ac74a9e19/src/main/java/xyz/ioc/common/Utilities.java#L68
    Pattern.compile("[^A-Za-z0-9]", Pattern.CASE_INSENSITIVE),
    // https://github.com/Swagger-Ranger/JavaSrc/blob/0d8a4e631567936e3632ccdcbda82fb178331fa9/src/com.silinx/source/effectivejava/chapter2/item6/RomanNumerals.java#L8
    Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"),
    // https://github.com/KinichMan/SuKarneDemo/blob/2f6d17ff3cef74c46ee10a76681c9d8c7946405e/src/main/java/service/samsaraavayspaces/socketIO/SamsaraBotSocket.java#L37
    Pattern.compile("\\@SuKarneBot\\b"),
    // https://github.com/KinichMan/SuKarneDemo/blob/2f6d17ff3cef74c46ee10a76681c9d8c7946405e/src/main/java/service/samsaraavayspaces/socketIO/Samsara.java#L33
    Pattern.compile("\\@AvayaBot\\b"),
    // https://github.com/KinichMan/SuKarneDemo/blob/2f6d17ff3cef74c46ee10a76681c9d8c7946405e/src/main/java/service/samsaraavayspaces/dialogflow/DialogflowImpl.java#L107
    Pattern.compile("numerodecuenta-followup"),
    // https://github.com/embulk/embulk/blob/42ecca3361a1688f86aa6456462a1e998ef62240/embulk-core/src/main/java/org/embulk/EmbulkRunner.java#L473
    Pattern.compile(".*\\.ya?ml$"),
    // https://github.com/embulk/embulk/blob/42ecca3361a1688f86aa6456462a1e998ef62240/embulk-core/src/main/java/org/embulk/EmbulkRunner.java#L474
    Pattern.compile(".*\\.ya?ml\\.liquid$"),
    // https://github.com/PandaWarrior2/DSBDA_HWII/blob/6160dce63ffc8340b28c0ff22231bb7eec20178c/sbloghandler/src/main/java/ru/nikitin/sbloghandler/service/LogParser.java#L45
    Pattern.compile("([A-Za-z]{3}\\s[\\d]{2}\\s\\d{2}:\\d{2}:\\d{2})\\s([\\S]*)\\s(\\S*):\\s(.*)", Pattern.MULTILINE),
    // https://github.com/CJMenart/CS-7140-2020/blob/415a90813d2fa3fecde72752beb88d0714bc4e52/DITAA/src/org/stathissideris/ascii2image/core/JavadocTaglet.java#L109
    Pattern.compile("[;:]"),
    // https://github.com/CJMenart/CS-7140-2020/blob/415a90813d2fa3fecde72752beb88d0714bc4e52/DITAA/src/org/stathissideris/ascii2image/core/JavadocTaglet.java#L184
    Pattern.compile("\\[(\\w+)\\]"),
    // https://github.com/sjcross/MIA/blob/5a73d6a66cdd0a3c00a5975921e8d07d9cc7a050/src/main/java/wbif/sjx/MIA/Module/Miscellaneous/GlobalVariables.java#L57
    Pattern.compile("V\\{([\\w]+)}"),
    // https://github.com/murmilad/jefshowcase/blob/cd3c22b90b4e624654dcd4f03dfd2d95c6ad7a96/src/main/java/com/technology/showcase/jersey/FormWebService.java#L412
    Pattern.compile("data:([a-zA-Z]*)/([a-zA-Z]*);base64,([^\\\"]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/mtransitapps/ca-saskatoon-transit-bus-parser/blob/01455123620a2b2098953d815a71b03c2b644b79/src/main/java/org/mtransit/parser/ca_saskatoon_transit_bus/SaskatoonTransitBusAgencyTools.java#L781
    Pattern.compile("((^|\\W){1}(industrial)(\\W|$){1})", Pattern.CASE_INSENSITIVE),
    // https://github.com/mtransitapps/ca-saskatoon-transit-bus-parser/blob/01455123620a2b2098953d815a71b03c2b644b79/src/main/java/org/mtransit/parser/ca_saskatoon_transit_bus/SaskatoonTransitBusAgencyTools.java#L784
    Pattern.compile("((^|\\W){1}(forestgrove)(\\W|$){1})", Pattern.CASE_INSENSITIVE),
    // https://github.com/mtransitapps/ca-saskatoon-transit-bus-parser/blob/01455123620a2b2098953d815a71b03c2b644b79/src/main/java/org/mtransit/parser/ca_saskatoon_transit_bus/SaskatoonTransitBusAgencyTools.java#L787
    Pattern.compile("((^|\\W){1}(ciity)(\\W|$){1})", Pattern.CASE_INSENSITIVE),
    // https://github.com/mtransitapps/ca-saskatoon-transit-bus-parser/blob/01455123620a2b2098953d815a71b03c2b644b79/src/main/java/org/mtransit/parser/ca_saskatoon_transit_bus/SaskatoonTransitBusAgencyTools.java#L790
    Pattern.compile("((^|\\W){1}(cenrtre)(\\W|$){1})", Pattern.CASE_INSENSITIVE),
    // https://github.com/mtransitapps/ca-saskatoon-transit-bus-parser/blob/01455123620a2b2098953d815a71b03c2b644b79/src/main/java/org/mtransit/parser/ca_saskatoon_transit_bus/SaskatoonTransitBusAgencyTools.java#L793
    Pattern.compile("((^|\\W){1}(confederartion)(\\W|$){1})", Pattern.CASE_INSENSITIVE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/make/tools/src/build/tools/charsetmapping/SBCS.java#L109
    Pattern.compile("0x(\\p{XDigit}++)\\s++U\\+(\\p{XDigit}++)(\\s++#.*)?"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/sun/net/www/http/HttpClient/ProxyTest.java#L80
    Pattern.compile("^GET (.*) HTTP/1\\.1"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/sun/net/www/ftptest/FtpCommandHandler.java#L218
    Pattern.compile("\\|(\\d)\\|(.*)\\|(\\d+)\\|"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/sun/misc/Version/Version.java#L110
    Pattern.compile("^([0-9]{1,2})"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L273
    Pattern.compile("xyz"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L304
    Pattern.compile("squid"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L334
    Pattern.compile("^squidattack"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L349
    Pattern.compile("^abc"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L361
    Pattern.compile("catattack"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L405
    Pattern.compile("^x?", Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L520
    Pattern.compile("(?<=cat)dog(?=cat)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L548
    Pattern.compile("(?<!cat)dog(?!cat)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L574
    Pattern.compile("\\$0"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L587
    Pattern.compile("[^>]"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L591
    Pattern.compile("[^fr]"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L612
    Pattern.compile("[^f\u203Ar]"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L630
    Pattern.compile("[^\u203Ar\u203B]"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L652
    Pattern.compile("b+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L670
    Pattern.compile("abc\\t$^"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L676
    Pattern.compile("\\Qa^$bcabc\\E"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L680
    Pattern.compile("\\\\Q\\\\E"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L683
    Pattern.compile("\\Qabc\\Eefg\\\\Q\\\\Ehij"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L686
    Pattern.compile("\\\\\\Q\\\\E"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L709
    Pattern.compile("^cat$"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L715
    Pattern.compile("abcdef"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L721
    Pattern.compile("a...b"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L727
    Pattern.compile("testa\u030a"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L858
    Pattern.compile("^abc$"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L939
    Pattern.compile("\\Qdir1\\dir2\\E"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L942
    Pattern.compile("\\Qdir1\\dir2\\\\E"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L945
    Pattern.compile("(\\Qdir1\\dir2\\\\E)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L998
    Pattern.compile("(abc)+|(abcd)+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1215
    Pattern.compile("1(\\s\\S+?){1,3}?[\\s,]2"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1224
    Pattern.compile("([a-z])+?c"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1237
    Pattern.compile("(b)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1258
    Pattern.compile("\\G\\w"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1266
    Pattern.compile("\\GA*"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1284
    Pattern.compile("foo\\Z"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1296
    Pattern.compile("foo\\Z", Pattern.UNIX_LINES),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1310
    Pattern.compile("(ab)(c*)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1387
    Pattern.compile("[az]$", Pattern.UNIX_LINES|Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1416
    Pattern.compile("aa \\# aa"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1421
    Pattern.compile("aa  # blah"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1426
    Pattern.compile("aa blah"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1431
    Pattern.compile("aa  # blah blech  "),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1436
    Pattern.compile("aa  # blah\n  "),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1441
    Pattern.compile("aa  # blah\nbc # blech"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1446
    Pattern.compile("aa  # blah\nbc# blech"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1451
    Pattern.compile("aa  # blah\nbc\\# blech"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1502
    Pattern.compile("aa"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1507
    Pattern.compile("aA"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1584
    Pattern.compile("[h-j]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1591
    Pattern.compile("(ab)(cd)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1600
    Pattern.compile("([a-z]+)( *= *)([0-9]+)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1739
    Pattern.compile("[\\[@^]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1745
    Pattern.compile("[@\\[^]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1751
    Pattern.compile("[@\\[^@]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1767
    Pattern.compile("[&@]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1770
    Pattern.compile("[@&]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1773
    Pattern.compile("[@\\&]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1780
    Pattern.compile("\\u0007"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1784
    Pattern.compile("\\07"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1788
    Pattern.compile("\\007"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1792
    Pattern.compile("\\0007"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1796
    Pattern.compile("\\040"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1800
    Pattern.compile("\\0403"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1804
    Pattern.compile("\\0103"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1815
    Pattern.compile("a 32-character-long pattern xxxx"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1816
    Pattern.compile("a 33-character-long pattern xxxxx"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1817
    Pattern.compile("a thirty four character long regex"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1844
    Pattern.compile("(tes)ting"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1873
    Pattern.compile("^(tes)ting"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1925
    Pattern.compile("blah"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1994
    Pattern.compile("blah[ab]]blech"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L1997
    Pattern.compile("[abc[def]]"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2009
    Pattern.compile("[ab\u00ffcd]", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2016
    Pattern.compile("[ab\u00b5cd]", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2031
    Pattern.compile("[sik\u00c5]+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2039
    Pattern.compile("\\w*"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2053
    Pattern.compile("^\\w*"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2074
    Pattern.compile("\\A\\p{Alpha}{3}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2080
    Pattern.compile("^\\p{Alpha}{3}", Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2099
    Pattern.compile("^", Pattern.UNIX_LINES|Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2110
    Pattern.compile("x+(?>y+)z+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2120
    Pattern.compile("x+(?:y+)z+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2156
    Pattern.compile("(a*)bc\\1"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2162
    Pattern.compile("(abc)(def)\\1"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2165
    Pattern.compile("(abc)(def)\\3"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2179
    Pattern.compile("(a)(b)(c)(d)(e)(f)(g)(h)(i)(j)\\11"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2183
    Pattern.compile("(a)(b)(c)(d)(e)(f)(g)(h)(i)(j)(k)\\11"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2186
    Pattern.compile("(a)bcdefghij\\11"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2218
    Pattern.compile("^.*$", Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2233
    Pattern.compile(".+$"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2243
    Pattern.compile(".+$", Pattern.MULTILINE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2337
    Pattern.compile("ulb(c*)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2353
    Pattern.compile("a|ad"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2429
    Pattern.compile("testa\u030a", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2439
    Pattern.compile("test\u00e5", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2449
    Pattern.compile("test[abca\u030a]", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2459
    Pattern.compile("test[abc\u00e5def\u00e0]", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2473
    Pattern.compile("testa\u0308\u0300", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2478
    Pattern.compile("testa\u0308\u0323", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2483
    Pattern.compile("testa\u0308\u0323\u0300", Pattern.CANON_EQ),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2606
    Pattern.compile("(ab)(cd)*"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2625
    Pattern.compile("(ab)(cd)*(ef)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2645
    Pattern.compile("(ab)(cd*)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2697
    Pattern.compile("(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2849
    Pattern.compile("(abc)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2957
    Pattern.compile("\\043"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2962
    Pattern.compile("\\x23"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2967
    Pattern.compile("\\u0023"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2980
    Pattern.compile("abc", Pattern.CASE_INSENSITIVE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L2985
    Pattern.compile("a*", Pattern.CASE_INSENSITIVE),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3390
    Pattern.compile("x+(?<gname>y+)z+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3395
    Pattern.compile("x+(?<gname8>y+)z+"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3404
    Pattern.compile("(?<gname>a*)bc\\k<gname>"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3407
    Pattern.compile("(?<gname>abc)(def)\\k<gname>"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3410
    Pattern.compile("(a)(b)(c)(d)(e)(f)(g)(h)(i)(j)(?<gname>k)\\k<gname>"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3428
    Pattern.compile("x+(?<gname>y+)z+\\k<gname>"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3504
    Pattern.compile("cd(?<gn>ef)gh"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3505
    Pattern.compile("(?<gn>[a-e])b"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3514
    Pattern.compile("(?<gname>abc)(def)"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3523
    Pattern.compile("\\P{Lu}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3537
    Pattern.compile("\\P{InMathematicalAlphanumericSymbols}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3547
    Pattern.compile("\\p{IsLu}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3548
    Pattern.compile("\\p{Lu}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3549
    Pattern.compile("\\p{gc=Lu}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3550
    Pattern.compile("\\p{general_category=Lu}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3551
    Pattern.compile("\\p{IsLatin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3552
    Pattern.compile("\\p{sc=Latin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3553
    Pattern.compile("\\p{script=Latin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3554
    Pattern.compile("\\p{InBasicLatin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3555
    Pattern.compile("\\p{blk=BasicLatin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3556
    Pattern.compile("\\p{block=BasicLatin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3559
    Pattern.compile("\\p{script=Common}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3560
    Pattern.compile("\\p{IsUnknown}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3564
    Pattern.compile("\\p{block=basic_latin}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3565
    Pattern.compile("\\p{InGreek}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3664
    Pattern.compile("\\p{Lower}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3666
    Pattern.compile("\\p{ASCII}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3668
    Pattern.compile("\\p{Digit}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3669
    Pattern.compile("\\p{Alnum}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3671
    Pattern.compile("\\p{Graph}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3672
    Pattern.compile("\\p{Print}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3673
    Pattern.compile("\\p{Blank}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3675
    Pattern.compile("\\p{XDigit}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3678
    Pattern.compile("\\w++"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3680
    Pattern.compile("\\p{Lower}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3681
    Pattern.compile("\\p{Upper}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3682
    Pattern.compile("\\p{ASCII}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3683
    Pattern.compile("\\p{Alpha}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3684
    Pattern.compile("\\p{Digit}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3685
    Pattern.compile("\\p{Alnum}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3686
    Pattern.compile("\\p{Punct}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3687
    Pattern.compile("\\p{Graph}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3688
    Pattern.compile("\\p{Print}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3689
    Pattern.compile("\\p{Blank}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3690
    Pattern.compile("\\p{Cntrl}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3691
    Pattern.compile("\\p{XDigit}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3692
    Pattern.compile("\\p{Space}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3693
    Pattern.compile("\\b", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3694
    Pattern.compile("\\w", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3696
    Pattern.compile("(?U)\\p{Lower}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3697
    Pattern.compile("(?U)\\p{Graph}", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3698
    Pattern.compile("(?U)\\w", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3700
    Pattern.compile("\\b\\w\\b"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3701
    Pattern.compile("\\b\\w++\\b", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3702
    Pattern.compile("(?U)\\b\\w++\\b", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3704
    Pattern.compile("\\p{IsLowerCase}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3705
    Pattern.compile("\\p{IsUpperCase}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3706
    Pattern.compile("\\p{IsTitleCase}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3707
    Pattern.compile("\\p{IsLetter}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3708
    Pattern.compile("\\p{IsAlphabetic}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3709
    Pattern.compile("\\p{IsIdeographic}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3710
    Pattern.compile("\\p{IsControl}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3711
    Pattern.compile("\\p{IsWhiteSpace}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3712
    Pattern.compile("\\p{IsAssigned}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3713
    Pattern.compile("\\p{IsNoncharacterCodePoint}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3716
    Pattern.compile("\\p{javaLowerCase}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3718
    Pattern.compile("\\p{javaAlphabetic}"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/java/util/regex/RegExTest.java#L3719
    Pattern.compile("\\p{javaIdeographic}"),
    // https://github.com/LenovoTab2A7/android_packages_apps_Settings-mt8127/blob/3ba993f84af2e4e19bfd21c49ced510ef78e218e/src/com/android/settings/DeviceInfoSettings.java#L429
    Pattern.compile("Linux version (\\S+) \\((\\S+?)\\) (?:\\(gcc.+? \\)) (#\\d+) (?:.*?)?((Sun|Mon|Tue|Wed|Thu|Fri|Sat).+)"),
    // https://github.com/LenovoTab2A7/android_packages_apps_Settings-mt8127/blob/3ba993f84af2e4e19bfd21c49ced510ef78e218e/src/com/android/settings/DeviceInfoSettings.java#L588
    Pattern.compile("component=([^/]+)/"),
    // https://github.com/genny-project/notes/blob/d852acffd0293d1412261291adaf9f183559fbf9/src/main/java/life/genny/notes/models/GennyToken.java#L131
    Pattern.compile(",:;"),
    // https://github.com/genny-project/notes/blob/d852acffd0293d1412261291adaf9f183559fbf9/src/main/java/life/genny/notes/models/GennyToken.java#L188
    Pattern.compile("(?<=\\[)([^\\]]+)(?=\\])"),
    // https://github.com/genny-project/genny-verticle-rules/blob/3ba5758a5e0c162e890f5d952768e369fd0a642f/src/main/java/life/genny/utils/BaseEntityUtils.java#L484
    Pattern.compile("(PRI_\\[A-Z0-9\\_])"),
    // https://github.com/genny-project/genny-verticle-rules/blob/3ba5758a5e0c162e890f5d952768e369fd0a642f/src/main/java/life/genny/utils/BaseEntityUtils.java#L2259
    Pattern.compile("_PLUS_"),
    // https://github.com/genny-project/genny-verticle-rules/blob/3ba5758a5e0c162e890f5d952768e369fd0a642f/src/main/java/life/genny/utils/BaseEntityUtils.java#L2260
    Pattern.compile("_DOT_"),
    // https://github.com/genny-project/genny-verticle-rules/blob/3ba5758a5e0c162e890f5d952768e369fd0a642f/src/main/java/life/genny/utils/BaseEntityUtils.java#L2261
    Pattern.compile("_AT_"),
    // https://github.com/genny-project/genny-verticle-rules/blob/3ba5758a5e0c162e890f5d952768e369fd0a642f/src/main/java/life/genny/utils/BaseEntityUtils.java#L2262
    Pattern.compile("_DASH_"),
    // https://github.com/Vorobeyyyyyy/EpamTraining/blob/e52a646364edabb2f0deba165e65bc52d15cb4e2/src/com/vorobyev/dao/validator/BookValidator.java#L16
    Pattern.compile("[A-Za-z-!.,0-9[[:space:]]]{1,30}"),
    // https://github.com/Vorobeyyyyyy/EpamTraining/blob/e52a646364edabb2f0deba165e65bc52d15cb4e2/src/com/vorobyev/dao/validator/BookValidator.java#L17
    Pattern.compile("[A-Za-z-]{1,25}[[:space:]][A-Za-z-]{1,25}"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/result/supplement/TitleRetriever.java#L35
    Pattern.compile("<title>([^<]+)"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/result/supplement/ProductResultInfoRetriever.java#L43
    Pattern.compile(",event\\)\">([^<]+)</a></h3>.+<span class=psrp>([^<]+)</span>"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/result/supplement/ProductResultInfoRetriever.java#L44
    Pattern.compile("owb63p\">([^<]+).+zdi3pb\">([^<]+)"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/encode/VCardContactEncoder.java#L30
    Pattern.compile("([\\\\,;])"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/encode/MECARDContactEncoder.java#L30
    Pattern.compile("([\\\\:;])"),
    // https://github.com/common-good/cgpay-android/blob/5279e0038389d90b16b2fa3f341330325063273c/CGPay/src/main/java/zxing/client/android/book/SearchBookContentsActivity.java#L61
    Pattern.compile("&#39;"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L82
    Pattern.compile("(?i)\\W+union\\W+"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L84
    Pattern.compile("(?i)\\Worder\\s+by\\W"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L86
    Pattern.compile("(?i)\\Wgroup\\s+by\\W"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L91
    Pattern.compile("^(\\s*\\{)?\\s*\\?"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L94
    Pattern.compile("(?i)^select\\s+distinct\\s+"),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L100
    Pattern.compile("\\W(sum|avg|min|max|first|last|first_value|last_value)\\("),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L775
    Pattern.compile("ta."),
    // https://github.com/sagframe/sagacity-sqltoy/blob/affeb2c844c49501eaa0c7047dcfb0c52e249d6e/trunk/sqltoy-orm/src/main/java/org/sagacity/sqltoy/dialect/utils/DialectUtils.java#L2124
    Pattern.compile("\\_"),
    // https://github.com/byManuel18/WikiGI/blob/36656d35a15053e2641c49bd989338cb6de5c24a/app/src/main/java/com/manueh/wikigi/views/Form_activity.java#L242
    Pattern.compile("[A-Za-zÑñ ]+"),
    // https://github.com/byManuel18/WikiGI/blob/36656d35a15053e2641c49bd989338cb6de5c24a/app/src/main/java/com/manueh/wikigi/views/Form_activity.java#L384
    Pattern.compile("[A-Za-zÑñ]"),
    // https://github.com/byManuel18/WikiGI/blob/36656d35a15053e2641c49bd989338cb6de5c24a/app/src/main/java/com/manueh/wikigi/views/Form_activity.java#L454
    Pattern.compile("[A-Za-zÑñ]+"),
    // https://github.com/jeevith15/Text-Editor-Pro/blob/b4845e9131efce18cc52f27ec3b4bf17af155948/src/application/AutoSpellingTextArea.java#L249
    Pattern.compile("[\\w'-]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/anas90zh/susskartoffi/blob/4ccc63ec07c08308c66dce35ad0a5ba7b7acce52/susskartoffi/src/db/RezeptJDBC.java#L74
    Pattern.compile("^[1-9][0-9]{0,2}(?:,[0-9]{3}){0,3}$"),
    // https://github.com/DeDe-0705/SchoolProject/blob/6fe839a67291615ee6aff4cb83194e256619963f/restaurant/Boundary/RegisterGUI.java#L14
    Pattern.compile("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$"),
    // https://github.com/DeDe-0705/SchoolProject/blob/6fe839a67291615ee6aff4cb83194e256619963f/restaurant/Boundary/RegisterGUI.java#L129
    Pattern.compile("^[A-Za-z]+$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L23
    Pattern.compile("^[\u4e00-\u9fa5]{2,7}"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L34
    Pattern.compile("^[\u4e00-\u9fa5]{2,12}"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L45
    Pattern.compile("^([\u4E00-\u9FA5]{2,7}+|[a-zA-Z]+)$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L53
    Pattern.compile("^\\d{19}$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L69
    Pattern.compile("^\\d{15}$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L80
    Pattern.compile("^(\\d{16}|\\d{19})$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L91
    Pattern.compile("\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L124
    Pattern.compile("(\\+\\d+)?1[3456789]\\d{9}$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L262
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����& amp;*��������+|{}������������������������]"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L287
    Pattern.compile("^[A-Za-z0-9]{4,40}$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L295
    Pattern.compile("^[A-Z0-9]{4}$"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L306
    Pattern.compile("!|！|@|◎|#|＃|(\\$)|￥|%|％|(\\^)|……|(\\&)|※|(\\*)|×|(\\()|(|(\\))|)|_|——|(\\+)|＋|(\\|)|§"),
    // https://github.com/1050957107/Serlink/blob/b9b6da9ba8fb228b0d97204d3d11d1c5fb1c2c4e/app/src/main/java/com/xinao/serlinkoperate/util/RegexUtil.java#L317
    Pattern.compile("[`~!@#$^&*()=|{}':;',\\\\[\\\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]"),
    // https://github.com/ravi005e/java-junit-selenium-testlib/blob/44603a97e98c9311bb011c026f03a94abe01d0b6/src/main/java/io/github/ravi005e/utils/junit/rules/ScreenshotRule.java#L22
    Pattern.compile("[^\\w#]+"),
    // https://github.com/MinecraftForge/ForgeGradle/blob/dbf4c0a2139a402f39670577206d15a2ad5096e1/src/userdev/java/net/minecraftforge/gradle/userdev/MinecraftUserRepo.java#L316
    Pattern.compile("_at_"),
    // https://github.com/MinecraftForge/ForgeGradle/blob/dbf4c0a2139a402f39670577206d15a2ad5096e1/src/userdev/java/net/minecraftforge/gradle/userdev/MinecraftUserRepo.java#L321
    Pattern.compile("_mapped_"),
    // https://github.com/BluebirdLyrase/ProjectStackOverFlow/blob/2da49f7e00f892fb536b35a90e745b46072bc88e/StackOverFlow/src/stackoverflow/handlers/SearchHandler.java#L47
    Pattern.compile("text: (.*?), document", Pattern.DOTALL),
    // https://github.com/BluebirdLyrase/ProjectStackOverFlow/blob/2da49f7e00f892fb536b35a90e745b46072bc88e/StackOverFlow/src/stackoverflow/handlers/SearchHandler.java#L69
    Pattern.compile("[\\p{Graph}\\p{Space}]+"),
    // https://github.com/unclebob/fitnesse/blob/a0c8f5fe49e6efe145bae138cb2c86ccae255d6f/src/fitnesse/testsystems/slim/HtmlTable.java#L40
    Pattern.compile(".*(<table.*?>.*</table>).*", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/unclebob/fitnesse/blob/a0c8f5fe49e6efe145bae138cb2c86ccae255d6f/src/fitnesse/testsystems/slim/HtmlTable.java#L42
    Pattern.compile("^(\\$[A-Za-z]\\w*<?->?\\[|\\$`[^`]+`<?->?\\[)(.*)(\\])$", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/cronn/jira-sync/blob/ce920ee8d89d8a7703d93e6048c92f6f9c0d7749/src/main/java/de/cronn/jira/sync/mapping/DefaultDescriptionMapper.java#L20
    Pattern.compile("\\{panel[^\\\\}]*\\}.*?\\{panel\\}\\s*", Pattern.DOTALL),
    // https://github.com/cronn/jira-sync/blob/ce920ee8d89d8a7703d93e6048c92f6f9c0d7749/src/main/java/de/cronn/jira/sync/mapping/DefaultDescriptionMapper.java#L21
    Pattern.compile("\\{(panel[^\\\\}]*)\\}"),
    // https://github.com/ShapeShiftOS-WIP/android_packages_apps_Settings/blob/e5436e07109ea21da1846139578fc53e8f492866/tests/uitests/src/com/android/settings/ui/StorageWizardTest.java#L177
    Pattern.compile("[\n ]"),
    // https://github.com/zfb-github/spring/blob/6cba34564fddb87fa86bd9b4b623c0a0ec81aba7/spring-aop/src/main/java/org/springframework/aop/interceptor/CustomizableTraceInterceptor.java#L150
    Pattern.compile("\\$\\[\\p{Alpha}+]"),
    // https://github.com/fyshhh/aoc/blob/ce14cbb4eafc4e72f0559b4e28a7f78487dc4823/y2019/day14/Main14.java#L77
    Pattern.compile("(?<in>.+) => (?<out>.+)"),
    // https://github.com/guillaume-houioux/Projet-Java/blob/4f0dd6718b28ad890c63ecfd8e7c62f1cf72b162/src/pojo/Spectator.java#L97
    Pattern.compile("^[A-Z][a-z]*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/guillaume-houioux/Projet-Java/blob/4f0dd6718b28ad890c63ecfd8e7c62f1cf72b162/src/pojo/Spectator.java#L98
    Pattern.compile("^[0-9]{10}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/dashboard/portlets/common/timeline/TimeLineDataProvider.java#L47
    Pattern.compile("\\$\\{[^\\$^\\{^\\}]*\\}"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/certificate/manage/businessobject/CertificateManageBo.java#L361
    Pattern.compile("\\s|\\t|\\r|\\n"),
    // https://github.com/eclipse/xtext-core/blob/0903e4427ed41028e1e72e7e33a5047bfd017d76/org.eclipse.xtext.xtext.generator/xtend-gen/org/eclipse/xtext/xtext/generator/web/WebIntegrationFragment.java#L334
    Pattern.compile("\\w(.*\\w)?"),
    // https://github.com/mjd-programming/MobileWebBrowser/blob/f37039972f2ed4d857f9eda991cf1a92ab81b779/app/src/main/java/edu/temple/webbrowser/PageViewerFragment.java#L64
    Pattern.compile("\\.[a-z]{1,3}"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L81
    Pattern.compile("([0-9]+ )?([0-9].)?[0-9] oz"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L82
    Pattern.compile("([0-9]+ )?([0-9].)?[0-9] [C|c]ups?"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L83
    Pattern.compile("[0-9]/[0-9](?= oz)"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L84
    Pattern.compile("[0-9]/[0-9](?= [C|c]ups?)"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L85
    Pattern.compile("[0-9]+\\.?[0-9]?(?= +oz)"),
    // https://github.com/olid901/ShakerApp/blob/cffd06d598fd1e0014dc74ebd3a3d08759fa75c9/app/src/main/java/com/example/myapplication/Cocktail.java#L86
    Pattern.compile("[0-9]+\\.?[0-9]?(?= +[C|c]ups?)"),
    // https://github.com/pitralimbong/Hybrid-Algorithm-Cryptography-/blob/710ab96d4b216e3f2ed42e4dd91119cdfc92ca25/src/client/ClientWithGUI2.java#L663
    Pattern.compile("(@).*\\1"),
    // https://github.com/openjdk/panama-vector/blob/53d14442c9f572b3dea7fbce0423a120c6b6a207/test/langtools/jdk/javadoc/doclet/testSearch/TestSearch.java#L669
    Pattern.compile("class=\\\\*\"([^\\\\\"]+)\\\\*\""),
    // https://github.com/openjdk/panama-vector/blob/53d14442c9f572b3dea7fbce0423a120c6b6a207/test/langtools/jdk/javadoc/doclet/testSearch/TestSearch.java#L670
    Pattern.compile("attr\\(\"class\", \"([^\"]+)\"\\)"),
    // https://github.com/kewlaniyash/CarPool/blob/260e1a974fdaf02db8da8287f56c4eeaad1dccf1/app/src/main/java/com/example/carpool/utils/CommonMethods.java#L28
    Pattern.compile("^[0-9]\\d{9}$"),
    // https://github.com/BitterCaffe/monitor-alarm/blob/8232564ab7c870c774a21d63f4a20dfedf5713ac/src/main/java/com/caffe/monitor/alarm/util/AlarmParsing.java#L12
    Pattern.compile("(alarm(:|：)\\s{0,8}\\w+|\"alarm\"(:|：)\\s{0,8}\\w+|\"alarm\"(:|：)\\s{0,8}\"\\w+)"),
    // https://github.com/portalthree/JustEnoughDungeons/blob/d6c31293d96b90a1a7907b3d638cffab1782a138/src/main/java/com/portalthree/Main.java#L51
    Pattern.compile("^Dungeon Finder > ?(?<player>\\w{1,16}) joined the dungeon group! \\(.+\\)$"),
    // https://github.com/portalthree/JustEnoughDungeons/blob/d6c31293d96b90a1a7907b3d638cffab1782a138/src/main/java/com/portalthree/Main.java#L451
    Pattern.compile("^Select all the ?(?<containerNameFound>\\w{1,16}) items!"),
    // https://github.com/portalthree/JustEnoughDungeons/blob/d6c31293d96b90a1a7907b3d638cffab1782a138/src/main/java/com/portalthree/Main.java#L452
    Pattern.compile("^What starts with: '?(?<itemFound>\\w)'\\?"),
    // https://github.com/ZeeMenng/HuaPingMango/blob/d28cf974d0960e0bedccc026fdc48bb80afbb7f9/mango/src/main/java/com/jusfoun/utl/Tools.java#L49
    Pattern.compile("([A-Z])"),
    // https://github.com/zapta/GHCN/blob/b21921af1c49807b080ced103a9807643487050b/3rd_party/ftp4j/ftp4j-1.7.2/src/it/sauronsoftware/ftp4j/listparsers/UnixListParser.java#L43
    Pattern.compile("^([dl\\-])[r\\-][w\\-][xSs\\-][r\\-][w\\-][xSs\\-][r\\-][w\\-][xTt\\-]\\s+(?:\\d+\\s+)?\\S+\\s*\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\*?\"<>|]+)(?: -> ([^\\\\*?\"<>|]+))?$"),
    // https://github.com/zapta/GHCN/blob/b21921af1c49807b080ced103a9807643487050b/3rd_party/ftp4j/ftp4j-1.7.2/src/it/sauronsoftware/ftp4j/listparsers/NetWareListParser.java#L42
    Pattern.compile("^(d|-)\\s+\\[.{8}\\]\\s+\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\/*?\"<>|]+)$"),
    // https://github.com/zapta/GHCN/blob/b21921af1c49807b080ced103a9807643487050b/3rd_party/ftp4j/ftp4j-1.7.2/src/it/sauronsoftware/ftp4j/listparsers/DOSListParser.java#L40
    Pattern.compile("^(\\d{2})-(\\d{2})-(\\d{2})\\s+(\\d{2}):(\\d{2})(AM|PM)\\s+(<DIR>|\\d+)\\s+([^\\\\/*?\"<>|]+)$"),
    // https://github.com/zapta/GHCN/blob/b21921af1c49807b080ced103a9807643487050b/3rd_party/ftp4j/ftp4j-1.7.2/src/it/sauronsoftware/ftp4j/FTPClient.java#L163
    Pattern.compile("\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}"),
    // https://github.com/zapta/GHCN/blob/b21921af1c49807b080ced103a9807643487050b/3rd_party/ftp4j/ftp4j-1.7.2/src/it/sauronsoftware/ftp4j/FTPClient.java#L168
    Pattern.compile("\"/.*\""),
    // https://github.com/janaldous/minanamanila-api/blob/fe1e588527c7591b34278434ffe33097c491eddb/src/test/java/com/janaldous/minanamanila/resttests/OrderApiE2E.java#L86
    Pattern.compile("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}$"),
    // https://github.com/lixiang2114/ElasticSink/blob/5f2531ee7b58105a73a873c74ad03722cb2d1164/src/main/java/com/github/lixiang2114/flume/plugin/es/util/TypeUtil.java#L30
    Pattern.compile("[0-9.]+"),
    // https://github.com/lixiang2114/ElasticSink/blob/5f2531ee7b58105a73a873c74ad03722cb2d1164/src/main/java/com/github/lixiang2114/flume/plugin/es/util/DateUtil.java#L16
    Pattern.compile("(\\d{4})?-?([01]\\d{1})?(?!:)-?([0123]\\d{1})?(?!:)\\s*([012]\\d{1})?:?([012345]\\d{1})?:?([012345]\\d{1})?\\s*(\\d{1,3})?"),
    // https://github.com/julia-888/JavaExercises/blob/05057de458eb5c6a47eea59d49ed9a0273624f19/_25/src/_3.java#L8
    Pattern.compile("((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(2[0-5][0-5]|1[0-9]{2}|[1-9][0-9]|[0-9])"),
    // https://github.com/javagurulv/java2_thursday_online_2020_autumn/blob/8707c62d339ccf3f66787344623b694f690cade0/team_rj/src/main/java/estore/core/validation/SearchProductByNameValidator.java#L34
    Pattern.compile("[A-Za-z]*"),
    // https://github.com/Bisher-d790/VRBlockchainGame/blob/955ac87cbfabb88d40f7a21001c2c1d39da6bbd9/VRBlockchain_Base/EtherlinkerServer/Stratum/src/main/java/com/academy/utils/AddressUtils.java#L19
    Pattern.compile("^(0x)[0-9a-fA-F]{40}$"),
    // https://github.com/Karpov2851/carscan-repo/blob/5de229be9cf390b69aba56e5949b17e977818262/imageresizing/src/main/java/com/imageresizing/ImageResizing.java#L68
    Pattern.compile(".*\\.([^\\.]*)"),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L62
    Pattern.compile("^([\\w\\.-]+)@([\\w\\.-]+)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L68
    Pattern.compile("^([^ \f\n\r\t\\(\\)><@,;:\\\\\\\"\\.\\[\\]]+|(\"[^\"]+\"))(\\.([^ \f\n\r\t\\(\\)><@,;:\\\\\\\"\\.\\[\\]]+|(\"[^\"]+\")))*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L69
    Pattern.compile("^[^ \f\n\r\t\\(\\)><@,;:\\\\\\\"\\.\\[\\]]+(\\.[^ \f\n\r\t\\(\\)><@,;:\\\\\\\"\\.\\[\\]]+)+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L70
    Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", Pattern.CASE_INSENSITIVE),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L73
    Pattern.compile("^\\.(com|net|org|edu|int|mil|gov|arpa|biz|aero|name|coop|info|pro|museum)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/igniterealtime/Spark/blob/1e00ddfbfecf6e058f8a0bc348af1f9cddeb6fcb/core/src/main/java/org/jivesoftware/spark/util/StringUtils.java#L1241
    Pattern.compile("([\\$\\?\\|\\/\\.])"),
    // https://github.com/runelite/runelite/blob/58136ff07b9759fc11ee25bfcf9d4b0d77f0b839/runelite-client/src/main/java/net/runelite/client/config/ConfigManager.java#L116
    Pattern.compile("([^.]+)\\.(?:(rsprofile\\.[^.]+)\\.)?(.*)"),
    // https://github.com/cdmn230199/TraSeaBanDuTru/blob/60ae0323b144b3abe1d7277453bba46278c50d6c/app/src/main/java/com/example/TraSeApp/LogInActivity.java#L53
    Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z]).{6,16}"),
    // https://github.com/winterstein/jerbil/blob/be12f77685706464531519957a3412dab47d6568/src/java/com/goodloop/jerbil/BuildJerbilPage.java#L37
    Pattern.compile("^([A-Za-z0-9\\-_]+):(.*)$", Pattern.MULTILINE),
    // https://github.com/winterstein/jerbil/blob/be12f77685706464531519957a3412dab47d6568/src/java/com/goodloop/jerbil/BuildJerbilPage.java#L173
    Pattern.compile("<section\\s+src=['\"]([\\S'\"]+)['\"]\\s*(/>|>(.*?)</section\\s*>)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/winterstein/jerbil/blob/be12f77685706464531519957a3412dab47d6568/src/java/com/goodloop/jerbil/BuildJerbilPage.java#L190
    Pattern.compile("</section\\s*>$", Pattern.CASE_INSENSITIVE),
    // https://github.com/winterstein/JTwitter/blob/d94c3bd6085fc0b348131ad7d1680b05fdce12ad/builder/goodloop/jtwitter/BuildJTwitter.java#L100
    Pattern.compile("<span class='version'>[0-9\\.]+</span>"),
    // https://github.com/winterstein/JTwitter/blob/d94c3bd6085fc0b348131ad7d1680b05fdce12ad/builder/goodloop/jtwitter/BuildJTwitter.java#L105
    Pattern.compile("jtwitter-[0-9\\-\\.]+\\.zip"),
    // https://github.com/opencrx/opencrx/blob/9a7c06ada358865d2186bb77524e9ee1b7f8b305/core/src/main/java/org/opencrx/kernel/utils/Utils.java#L1198
    Pattern.compile("(\r\n|\r|\n)"),
    // https://github.com/pinggle/flink/blob/66a2871cee0508a51d49e5c4d4a4dcd1c6aa4a33/1.10.2/flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/filesystem/PartitionPathUtils.java#L44
    Pattern.compile("([^/]+)=([^/]+)"),
    // https://github.com/pinggle/flink/blob/66a2871cee0508a51d49e5c4d4a4dcd1c6aa4a33/1.10.2/flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/gateway/local/LocalExecutor.java#L113
    Pattern.compile("(INSERT\\s+(INTO|OVERWRITE).*)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/crschnick/pdx_unlimiter/blob/dac20137a9c8b7712723f7acd62ad35732ecf508/app/src/main/java/com/crschnick/pdx_unlimiter/app/game/Hoi4Installation.java#L53
    Pattern.compile("\\s+([A-Za-z]+)_([a-z]+):0 \"(.+)\""),
    // https://github.com/crschnick/pdx_unlimiter/blob/dac20137a9c8b7712723f7acd62ad35732ecf508/app/src/main/java/com/crschnick/pdx_unlimiter/app/game/Hoi4Installation.java#L109
    Pattern.compile("v(\\d)\\.(\\d+)\\.(\\d+)\\.(\\d+)"),
    // https://github.com/crschnick/pdx_unlimiter/blob/dac20137a9c8b7712723f7acd62ad35732ecf508/app/src/main/java/com/crschnick/pdx_unlimiter/app/game/Eu4Installation.java#L69
    Pattern.compile("\\w+\\s+v(\\d)\\.(\\d+)\\.(\\d+)\\.(\\d+)\\s+(\\w+)\\.\\w+\\s.+"),
    // https://github.com/Giperkot/digitalSoftFinal/blob/b43018e0bd8ba4cd30142627c12821135db0dcda/src/main/java/ru/perfolenta/dviz/service/DataService.java#L23
    Pattern.compile("([ЁА-Я])"),
    // https://github.com/Giperkot/digitalSoftFinal/blob/b43018e0bd8ba4cd30142627c12821135db0dcda/src/main/java/ru/perfolenta/dviz/service/DataService.java#L208
    Pattern.compile("\\$\\{query\\}"),
    // https://github.com/WYGNG/USTC/blob/ea1410c0f1123d8e3cbabd7ff59c65a6bf0159b6/Android-SCOS/SCOSServer/src/esd/scos/servlet/LoginValidator.java#L16
    Pattern.compile("^[A-Za-z1-9_-]+$"),
    // https://github.com/AEFeinstein/Mtgjson2Familiar/blob/cf82e13e505240286cf7913b9feed9b3d45a1f1f/src/com/gelakinetic/mtgJson2Familiar/JudgeDocScraper.java#L80
    Pattern.compile("https"),
    // https://github.com/zhao1112/BigBear/blob/b2e0ec652bbde85ad33fa998e16d27e7c6662085/app/src/main/java/com/yunqin/bearmall/util/CommonUtils.java#L169
    Pattern.compile("^[a-zA-Z]{1}[-_a-zA-Z0-9]{5,19}$"),
    // https://github.com/zhao1112/BigBear/blob/b2e0ec652bbde85ad33fa998e16d27e7c6662085/app/src/main/java/com/yunqin/bearmall/util/CommonUtils.java#L429
    Pattern.compile(".*[a-zA-Z]+.*"),
    // https://github.com/zhao1112/BigBear/blob/b2e0ec652bbde85ad33fa998e16d27e7c6662085/app/src/main/java/com/yunqin/bearmall/util/CommonUtils.java#L431
    Pattern.compile(".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*"),
    // https://github.com/zhao1112/BigBear/blob/b2e0ec652bbde85ad33fa998e16d27e7c6662085/app/src/main/java/com/yunqin/bearmall/util/CashierInputFilter.java#L27
    Pattern.compile("([0-9]|\\.)*"),
    // https://github.com/zhao1112/BigBear/blob/b2e0ec652bbde85ad33fa998e16d27e7c6662085/app/src/main/java/com/yunqin/bearmall/ui/fragment/FragmentFans.java#L365
    Pattern.compile("^((13[0-9])|(14[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$"),
    // https://github.com/PureDroid/frameworks_base/blob/7584b074aefe7e1df13908a89c0173b624f64a24/packages/SettingsLib/src/com/android/settingslib/DeviceInfoUtils.java#L84
    Pattern.compile("Linux version (\\S+) \\((\\S+)\\).*(#\\d+).*((?:Sun|Mon|Tue|Wed|Thu|Fri|Sat).+)"),
    // https://github.com/PureDroid/frameworks_base/blob/8dc338348dda4c7e9d2b63bf9a4f01931cd82f41/services/core/java/com/android/server/display/OverlayDisplayAdapter.java#L79
    Pattern.compile("([^,]+)(,[a-z]+)*"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/assessment/external/ExternalRatingPartitionTable.java#L43
    Pattern.compile(".*@ConQAT.ExternalRatingTable[ _]+(\\S+) *", Pattern.CASE_INSENSITIVE),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/assessment/Rating.java#L79
    Pattern.compile("^package .*;$"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/assessment/PartitionedRating.java#L68
    Pattern.compile("(.*)@ConQAT.PartitionedRating[ _]+(\\S+) *", Pattern.CASE_INSENSITIVE),
    // https://github.com/theo-jedi/wavenote-android/blob/785f53e55cf9385fff34d2cdd3538d5f6951e961/Wavenote/src/main/java/com/theost/wavenote/NoteListFragment.java#L107
    Pattern.compile("tag:(.*?)( |$)"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L61
    Pattern.compile(".*(Majonäse|Bravur|Anschovis|Belkanto|Campagne|Frotté|Grisli|Jockei|Joga|Kalvinismus|Kanossa|Kargo|Ketschup|Kollier|Kommunikee|Masurka|Negligee|Nessessär|Poulard|Varietee|Wandalismus|kalvinist).*"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L119
    Pattern.compile("lsallerersten?s"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L129
    Pattern.compile("haft"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L130
    Pattern.compile("^rosan"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L225
    Pattern.compile("kreativ"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L225
    Pattern.compile("kreativlos"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L279
    Pattern.compile("mal"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L306
    Pattern.compile("lich"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L389
    Pattern.compile("[wW]ohlfühlsein"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L463
    Pattern.compile("ig"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L463
    Pattern.compile("beid"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L501
    Pattern.compile("pall"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L501
    Pattern.compile("pa"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L603
    Pattern.compile("sch"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L603
    Pattern.compile("af"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L647
    Pattern.compile("Panel"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1135
    Pattern.compile("[a-zöäü]-.+"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1169
    Pattern.compile("\\p{L} \\p{L}+"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1215
    Pattern.compile("\\w\\p{Punct}?"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1291
    Pattern.compile("Spielzugs?|Spielzugangs?|Spielzuganges|Spielzugbuchs?|Spielzugbüchern?|Spielzuges|Spielzugverluste?|Spielzugverlusten|Spielzugverlustes"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1297
    Pattern.compile("[A-ZÖÄÜ][a-zöäß-]+schafte"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1366
    Pattern.compile(".*ibel[hk]eit$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1367
    Pattern.compile("el[hk]eit$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1372
    Pattern.compile("aquise$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1377
    Pattern.compile("standart$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1382
    Pattern.compile("standarts$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1387
    Pattern.compile("tips$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1397
    Pattern.compile("ent"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1402
    Pattern.compile("oullie$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1407
    Pattern.compile("^urschnitt"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1412
    Pattern.compile("^Bundstift"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1416
    Pattern.compile("[aA]llmähll?i(g|ch)(e[mnrs]?)?"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1417
    Pattern.compile("llmähll?i(g|ch)"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1421
    Pattern.compile(".*[mM]a[jy]onn?[äe]se.*"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1422
    Pattern.compile("a[jy]onn?[äe]se"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1426
    Pattern.compile(".*[rR]es(a|er)[vw]i[he]?rung(en)?"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1427
    Pattern.compile("es(a|er)[vw]i[he]?rung"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1431
    Pattern.compile("[rR]eschaschier.+"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1432
    Pattern.compile("schaschier"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1436
    Pattern.compile(".*[lL]aborants$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1437
    Pattern.compile("ts$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1441
    Pattern.compile("[pP]roff?ess?ion([äe])h?ll?(e[mnrs]?)?"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1442
    Pattern.compile("roff?ess?ion([äe])h?l{1,2}"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1446
    Pattern.compile("[vV]erstehendniss?(es?)?"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1447
    Pattern.compile("[vV]erstehendnis"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1451
    Pattern.compile("koregier.+"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1456
    Pattern.compile("diagno[sz]ier.*"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1457
    Pattern.compile("gno[sz]ier"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1461
    Pattern.compile(".*eiss.*"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1462
    Pattern.compile("eiss"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1466
    Pattern.compile(".*uess.*"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1467
    Pattern.compile("uess"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1477
    Pattern.compile("z[bB]"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1477
    Pattern.compile("z[bB]."),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1521
    Pattern.compile("derbies$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1526
    Pattern.compile("stories$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1531
    Pattern.compile("parties$"),
    // https://github.com/languagetool-org/languagetool/blob/bdbc79dfd73f3d61a2f83916a2027180637997ad/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanSpellerRule.java#L1568
    Pattern.compile("Email[a-zäöü]{5,}"),
    // https://github.com/EuKaique/Projeto-Diagnostico-Medico/blob/ad0028f7d66e6a36d8102e6d9940f2ed2ec705f0/src/visao/jasperreports-6.15.0/src/net/sf/jasperreports/engine/export/FlashPrintElement.java#L246
    Pattern.compile("\\{(link\\-[\\-\\w]+)\\}"),
    // https://github.com/EuKaique/Projeto-Diagnostico-Medico/blob/ad0028f7d66e6a36d8102e6d9940f2ed2ec705f0/src/visao/jasperreports-6.15.0/src/net/sf/jasperreports/compilers/StandardReportClassWhitelist.java#L45
    Pattern.compile("\\*+"),
    // https://github.com/EuKaique/Projeto-Diagnostico-Medico/blob/ad0028f7d66e6a36d8102e6d9940f2ed2ec705f0/src/visao/jasperreports-6.15.0/src/net/sf/jasperreports/compilers/GroovyEvaluator.java#L68
    Pattern.compile("Ambiguous method overloading for method.*Cannot resolve which method to invoke for \\[null\\] due to overlapping prototypes between.*", Pattern.DOTALL),
    // https://github.com/sakuyuki1341/Homeworks/blob/e11fc4e3872b7ee7033d739b3576c7b4d929bdb5/MICS%E5%AE%9F%E9%A8%93%E7%AC%AC%E4%BA%8C/2f/ONE/src/input/StandardEventsReader.java#L79
    Pattern.compile("(#.*)|(^\\s*$)"),
    // https://github.com/sakuyuki1341/Homeworks/blob/e11fc4e3872b7ee7033d739b3576c7b4d929bdb5/MICS%E5%AE%9F%E9%A8%93%E7%AC%AC%E4%BA%8C/2f/ONE/src/input/StandardEventsReader.java#L199
    Pattern.compile("^\\D+\\d+$"),
    // https://github.com/IannuccilloAntonio/Progetto-Automated-Software-Delivery/blob/6203453fb61420827884b8517e1d99197aeb544b/platforms/android/app/src/main/java/io/sqlc/SQLiteAndroidDatabase.java#L41
    Pattern.compile("^[\\s;]*([^\\s;]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/IannuccilloAntonio/Progetto-Automated-Software-Delivery/blob/6203453fb61420827884b8517e1d99197aeb544b/platforms/android/app/src/main/java/io/sqlc/SQLiteAndroidDatabase.java#L44
    Pattern.compile("\\s+WHERE\\s+(.+)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/IannuccilloAntonio/Progetto-Automated-Software-Delivery/blob/6203453fb61420827884b8517e1d99197aeb544b/platforms/android/app/src/main/java/io/sqlc/SQLiteAndroidDatabase.java#L47
    Pattern.compile("^\\s*UPDATE\\s+(\\S+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/IannuccilloAntonio/Progetto-Automated-Software-Delivery/blob/6203453fb61420827884b8517e1d99197aeb544b/platforms/android/app/src/main/java/io/sqlc/SQLiteAndroidDatabase.java#L50
    Pattern.compile("^\\s*DELETE\\s+FROM\\s+(\\S+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/ctask/general/MetadataWebService.java#L135
    Pattern.compile("\'([^\']*)\'|(\\S+)"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/ctask/general/MetadataWebService.java#L193
    Pattern.compile("\\|\\|"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/core/Utils.java#L55
    Pattern.compile("(\\d+)([smhdwy])"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/content/packager/PackageUtils.java#L778
    Pattern.compile("^([^_]+)_([^_]+)_(.+)$"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/content/packager/PackageUtils.java#L870
    Pattern.compile("^.+_.+_.+$"),
    // https://github.com/juliapim/DiSSCo-Prepare/blob/6ac06c8a23b2d2abbaf5ac3dd0bd780395a414da/dspace-api/src/main/java/org/dspace/checker/ResultsPruner.java#L109
    Pattern.compile("checker\\.retention\\.(.*)"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/template/templatecard/transaction/SubSetExcelOut.java#L259
    Pattern.compile("^(((\\d{2}(([02468][048])|([13579][26]))[\\-]((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-]((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|(1[0-9])|(2[0-8]))))))|((\\d{2}(([02468][048])|([13579][26]))[\\/]((((0?[13578])|(1[02]))[\\/]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\/]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\/]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\/]((((0?[13578])|(1[02]))[\\/]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\/]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\/]((0?[1-9])|(1[0-9])|(2[0-8]))))))|((\\d{2}(([02468][048])|([13579][26]))[\\.]((((0?[13578])|(1[02]))[\\.]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\.]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\.]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\.]((((0?[13578])|(1[02]))[\\.]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\.]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\.]((0?[1-9])|(1[0-9])|(2[0-8]))))))|((\\d{2}(([02468][048])|([13579][26]))[\\年]((((0?[13578])|(1[02]))[\\月]((0?[1-9])|([1-2][0-9])|(3[01]))[\\日])|(((0?[469])|(11))[\\月]((0?[1-9])|([1-2][0-9])|(30))[\\日])|(0?2[\\月]((0?[1-9])|([1-2][0-9]))[\\日])))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\年]((((0?[13578])|(1[02]))[\\月]((0?[1-9])|([1-2][0-9])|(3[01]))[\\日])|(((0?[469])|(11))[\\月]((0?[1-9])|([1-2][0-9])|(30))[\\日])|(0?2[\\月]((0?[1-9])|(1[0-9])|(2[0-8]))[\\日])))))"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/template/templatecard/transaction/SubSetExcelOut.java#L351
    Pattern.compile("-[0-9]+(.[0-9]+)?|[0-9]+(.[0-9]+)?"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/template/templatecard/transaction/SubSetExcelOut.java#L417
    Pattern.compile("、"),
    // https://github.com/litetokensdev/java-tron/blob/8840b02241e02288768c60d4c8b27991b2d2a037/framework/src/main/java/org/tron/core/services/ratelimiter/strategy/Strategy.java#L27
    Pattern.compile("\\b([^\\s]+)=([^\\s]+)\\b"),
    // https://github.com/litetokensdev/java-tron/blob/8840b02241e02288768c60d4c8b27991b2d2a037/framework/src/main/java/org/tron/core/services/http/JsonFormat.java#L74
    Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE),
    // https://github.com/litetokensdev/java-tron/blob/8840b02241e02288768c60d4c8b27991b2d2a037/framework/src/main/java/org/tron/common/net/udp/message/discover/DiscoverMessageInspector.java#L12
    Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$"),
    // https://github.com/billkable/k8s-postgres-svc-example/blob/4d74c592560305f5d0ddd311a199e2330a98c11d/app/src/main/java/io/pivotal/pal/tracker/instrumentation/FlywayMigrationHealthIndicator.java#L41
    Pattern.compile("([1-9]\\d*)\\.(\\d+)\\.(\\d+)"),
    // https://github.com/jcosentino/doctor-appointment-scheduler-API-spring/blob/06f63982ff503e606780de333bc0b7714c9fff59/API/src/main/java/com/doctor/api/validation/Validations.java#L56
    Pattern.compile("^(?=.*[a-zA-Z])(?=.*[\\d]).*$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/module/gz/analysistables/analysistable/businessobject/impl/TableServiceImpl.java#L113
    Pattern.compile("[^\\x00-\\xff]"),
    // https://github.com/trajar/normandra/blob/b912a3715ba8af876fc55b8495ccbb2f2ad9179c/src/main/java/org/normandra/util/QueryUtils.java#L239
    Pattern.compile("SELECT"),
    // https://github.com/trajar/normandra/blob/b912a3715ba8af876fc55b8495ccbb2f2ad9179c/src/main/java/org/normandra/util/QueryUtils.java#L244
    Pattern.compile("FROM"),
    // https://github.com/dzzhyk/mine-spring/blob/47a0eaee70d1f1679a16fb959f1f1bca7de4ab33/src/main/java/com/yankaizhang/spring/web/view/HtmlView.java#L24
    Pattern.compile("\\$\\{[^}]+}", Pattern.CASE_INSENSITIVE),
    // https://github.com/dzzhyk/mine-spring/blob/47a0eaee70d1f1679a16fb959f1f1bca7de4ab33/src/main/java/com/yankaizhang/spring/web/view/HtmlView.java#L64
    Pattern.compile("\\$\\{|}"),
    // https://github.com/dzzhyk/mine-spring/blob/47a0eaee70d1f1679a16fb959f1f1bca7de4ab33/src/main/java/com/yankaizhang/spring/aop/support/AdvisedSupport.java#L153
    Pattern.compile("\\.\\*"),
    // https://github.com/dzzhyk/mine-spring/blob/47a0eaee70d1f1679a16fb959f1f1bca7de4ab33/src/main/java/com/yankaizhang/spring/aop/support/AdvisedSupport.java#L151
    Pattern.compile("\\\\."),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L20
    Pattern.compile("(\r?\n)+"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L169
    Pattern.compile("([a-zA-Z]|[\\,\\.])_([a-zA-Z])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L175
    Pattern.compile("(\\S.+?[.!?][\"”\u201D]?)(?=\\s+|$)"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L176
    Pattern.compile("^[\\[\\(\\{⟨]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L177
    Pattern.compile("^[\\)\\]\\}⟩]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L180
    Pattern.compile("^[,\\.;:\\?!)\"\"“”\u2019‘`'%…\u2103\\^\\*°/⁄\\-@]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L183
    Pattern.compile("^[\\^\\*\\$/⁄#\\-@°]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L184
    Pattern.compile("^[(\"\"“”\u2019‘`''«»‘’]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L185
    Pattern.compile("^[\u2019‘`']+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L186
    Pattern.compile("^[\u2019'’]+$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L187
    Pattern.compile("^(www[0-9]?|WWW[0-9]?)$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L188
    Pattern.compile("^(com|org|edu|net|xyz|gov|int|eu|hk|tw|cn|de|ch|fr)$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L192
    Pattern.compile("([Ee])[.]([Gg])[.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L193
    Pattern.compile("([Ii])[.]([Ee])[.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L194
    Pattern.compile("([Aa])[\\.]([Mm])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L195
    Pattern.compile("([Pp])[\\.]([Mm])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L196
    Pattern.compile("(Cap)[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L197
    Pattern.compile("([Cc])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L198
    Pattern.compile("([Ee][Tt])[\\s]([Aa][Ll])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L199
    Pattern.compile("(ect|ECT)[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L200
    Pattern.compile("([Pp])[\\.]([Ss])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L201
    Pattern.compile("([Pp])[\\.]([Ss])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L202
    Pattern.compile("([Pp])([Hh])[\\.]([Dd])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L203
    Pattern.compile("([Rr])[\\.]([Ii])[\\.]([Pp])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L204
    Pattern.compile("([Vv])([Ss]?)[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L205
    Pattern.compile("([Mm])([Rr]|[Ss]|[Xx])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L206
    Pattern.compile("([Dd])([Rr])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L207
    Pattern.compile("([Pp])([Ff])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L208
    Pattern.compile("([Ii])([Nn])([Dd]|[Cc])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L209
    Pattern.compile("([Cc])([Oo])[\\.][\\,][\\s]([Ll])([Tt])([Dd])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L210
    Pattern.compile("([Cc])([Oo])[\\.][\\s]([Ll])([Tt])([Dd])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L211
    Pattern.compile("([Cc])([Oo])[\\.][\\,]([Ll])([Tt])([Dd])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L212
    Pattern.compile("([Cc])([Oo])([Rr]?)([Pp]?)[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L213
    Pattern.compile("([Ll])([Tt])([Dd])[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L214
    Pattern.compile("(Prof|PROF|prof)[\\.]"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L216
    Pattern.compile("\\.{3}"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L217
    Pattern.compile("([\\?\\!\\\"\\u201C\\\\.,;:@#$%&])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L219
    Pattern.compile(",([^0-9])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L220
    Pattern.compile("([^.])([.])([\\])}>\\\"'’]*)\\s*$"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L221
    Pattern.compile("([\\[\\](){}<>⟨⟩])"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L225
    Pattern.compile("([^'])' | '"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L226
    Pattern.compile(" \u2018"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L227
    Pattern.compile("'([SMD]) "),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L231
    Pattern.compile("([Cc])an['’]t"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L232
    Pattern.compile("([Dd])idn['’]t"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L233
    Pattern.compile("([CcWw])ouldn['’]t"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L234
    Pattern.compile("([Ss])houldn['’]t"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L235
    Pattern.compile("([Ii])t['’]s"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L236
    Pattern.compile("n['’]t "),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L237
    Pattern.compile("['’]ve "),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L238
    Pattern.compile("['’]re "),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L242
    Pattern.compile(" ([A-Z]) \\."),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L246
    Pattern.compile("°"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L247
    Pattern.compile("…"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L248
    Pattern.compile("([\\w])([’'])\\s"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L249
    Pattern.compile("_elipsisDDD_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L252
    Pattern.compile("_([Ee])([Gg])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L253
    Pattern.compile("_([Ii])([Ee])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L254
    Pattern.compile("_([Aa])([Mm])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L255
    Pattern.compile("_([Pp])([Mm])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L256
    Pattern.compile("_(Cap)_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L257
    Pattern.compile("_([Cc])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L258
    Pattern.compile("_([Ee][Tt])zzz([Aa][Ll])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L259
    Pattern.compile("_(ect|ECT)_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L260
    Pattern.compile("_([Pp])([Ss])dot_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L261
    Pattern.compile("_([Pp])([Ss])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L262
    Pattern.compile("_([Pp])([Hh])([Dd])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L263
    Pattern.compile("_([Rr])([Ii])([Pp])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L264
    Pattern.compile("_([Vv])([Ss]?)_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L265
    Pattern.compile("_([Mm])([Rr]|[Ss]|[Xx])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L266
    Pattern.compile("_([Dd])([Rr])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L267
    Pattern.compile("_([Pp])([Ff])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L268
    Pattern.compile("_([Ii])([Nn])([Dd]|[Cc])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L269
    Pattern.compile("_([Cc])([Oo])dcs([Ll])([Tt])([Dd])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L270
    Pattern.compile("_([Cc])([Oo])ds([Ll])([Tt])([Dd])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L271
    Pattern.compile("_([Cc])([Oo])dc([Ll])([Tt])([Dd])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L272
    Pattern.compile("_([Cc])([Oo])([Rr]?)([Pp]?)_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L273
    Pattern.compile("_([Ll])([Tt])([Dd])_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L274
    Pattern.compile("_(Prof|PROF|prof)_"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/Tokenizer.java#L277
    Pattern.compile("___"),
    // https://github.com/dhowe/rita2/blob/81adc85619503994ab14dce903f0db772b19877d/src/main/java/rita/RiTa.java#L454
    Pattern.compile("^[^0-9A-Za-z\\s]*$"),
    // https://github.com/codebbgr/cbbMaven/blob/a1f218d12cf31f4c1304985dbaea2af300c258fd/maven-xml/src/main/java/org/apache/maven/xml/sax/SAXEventUtils.java#L31
    Pattern.compile("[^:]+$"),
    // https://github.com/SuperiorOS/android_packages_apps_Messaging/blob/04f7be1c8bf38e2ed8fe0941b2466077ff71a3ba/src/com/android/messaging/sms/MmsSmsUtils.java#L109
    Pattern.compile("\\*[0-9]+"),
    // https://github.com/pinggle/flink/blob/66a2871cee0508a51d49e5c4d4a4dcd1c6aa4a33/1.10.2/flink/flink-python/src/test/java/org/apache/flink/client/python/PythonDriverEnvUtilsTest.java#L189
    Pattern.compile("[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/formulaAnalyse/ReportInnerFormulaOperation.java#L487
    Pattern.compile("\\d+\\:([^:\\[])+"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/formulaAnalyse/ReportInnerFormulaOperation.java#L921
    Pattern.compile("CN "),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/auto_fill_report/reportanalyse/ReportSpaceAnalyse.java#L541
    Pattern.compile("\\d+\\:([^:\\[])+\\:([^:\\[])+"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/SQL_Util.java#L104
    Pattern.compile("^\\d+?[.]?\\d*?$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/performance/singleGrade/SingleGradeBo.java#L1265
    Pattern.compile("^\\d+$|^\\d+\\.\\d+$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/performance/singleGrade/SingleGradeBo.java#L6017
    Pattern.compile("0+?$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/performance/singleGrade/SingleGradeBo.java#L6018
    Pattern.compile("[.]$"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L137
    Pattern.compile("~"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L1627
    Pattern.compile("<<(.+?)>>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2385
    Pattern.compile("＃发件人姓名＃"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2389
    Pattern.compile("＃日期＃"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2392
    Pattern.compile("＃时间＃"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2406
    Pattern.compile("＃模板名称＃"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2435
    Pattern.compile("＃收件人姓名＃"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/workflow/SendMessageBo.java#L2591
    Pattern.compile("<<>>"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/templateanalyse/ParseHtml.java#L1974
    Pattern.compile("\\{#"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/templateanalyse/ParseHtml.java#L1975
    Pattern.compile("\\#}"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/templateanalyse/ParseHtml.java#L4327
    Pattern.compile("xrywlh888"),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/general/template/templateanalyse/ParseHtml.java#L4982
    Pattern.compile("wlhxryhrp"),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/StrUtil.java#L189
    Pattern.compile("[\\p{Punct}\\p{Space}]+"),
    // https://github.com/xxz-joe/xhoa/blob/78c7943c206527bb34266813efde2bb584c5e61f/src/main/java/com/byefan/core/utils/StrUtil.java#L191
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}<>《》【】‘；：”“’。，、？]"),
    // https://github.com/vijay-kd/StringCalculator/blob/a8a5d98232d71eafd6ae97d394c22a045a9fd4f7/demo/src/main/java/com/example/demo/assessment/StringCalculator.java#L35
    Pattern.compile("//(.)\n(.*)"),
    // https://github.com/vijay-kd/StringCalculator/blob/a8a5d98232d71eafd6ae97d394c22a045a9fd4f7/demo/src/main/java/com/example/demo/assessment/StringCalculator.java#L44
    Pattern.compile(",|\n"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/kernel/src/main/java/org/neo4j/kernel/api/query/QueryObfuscation.java#L35
    Pattern.compile("(?:(?i)call)\\s+(?:dbms(?:\\.security)?\\.change(?:User)?Password|dbms\\.security\\.createUser)\\(\\s*(?:\\s*(?:'(?:(?<=\\\\)'|[^'])*'|\"(?:(?<=\\\\)\"|[^\"])*\"|[^,]*)\\s*,)?\\s*('(?:(?<=\\\\)'|[^'])*'|\"(?:(?<=\\\\)\"|[^\"])*\"|\\$\\w*|\\{\\w*})"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/kernel/src/main/java/org/neo4j/helpers/SocketAddressParser.java#L31
    Pattern.compile("\\[(?<hostname>[^\\s]+)]:(?<port>\\d+)"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/kernel/src/main/java/org/neo4j/helpers/SocketAddressParser.java#L32
    Pattern.compile("(?<hostname>[^\\s]+):(?<port>\\d+)"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/kernel/src/main/java/org/neo4j/helpers/SocketAddressParser.java#L33
    Pattern.compile(":(?<port>\\d+)"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/community-it/bolt-it/src/test/java/org/neo4j/bolt/v1/runtime/integration/TransactionIT.java#L76
    Pattern.compile("neo4j:bookmark:v1:tx[0-9]+"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/bolt/src/main/java/org/neo4j/bolt/v1/runtime/RunMessageChecker.java#L28
    Pattern.compile("(?i)^\\s*BEGIN\\s*;?\\s*$"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/bolt/src/main/java/org/neo4j/bolt/v1/runtime/RunMessageChecker.java#L29
    Pattern.compile("(?i)^\\s*COMMIT\\s*;?\\s*$"),
    // https://github.com/graphfoundation/ongdb/blob/634391105011a97d484c8718aef7e26c7b8d595e/community/bolt/src/main/java/org/neo4j/bolt/v1/runtime/RunMessageChecker.java#L30
    Pattern.compile("(?i)^\\s*ROLLBACK\\s*;?\\s*$"),
    // https://github.com/rishikasinha-source/UserRegistrationProb/blob/912707a9c7565395dc8b0c349745850a4b19e697/src/UserRegistration.java#L29
    Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$"),
    // https://github.com/rishikasinha-source/UserRegistrationProb/blob/912707a9c7565395dc8b0c349745850a4b19e697/src/UserRegistration.java#L37
    Pattern.compile("^([\\\\+]?91)[6-9]{1}[0-9]{9}$"),
    // https://github.com/rishikasinha-source/UserRegistrationProb/blob/912707a9c7565395dc8b0c349745850a4b19e697/src/UserRegistration.java#L53
    Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"),
    // https://github.com/PRATSTHEONE/Java/blob/867c6a53ae8d02eab73ca8ca2f03a3286d36b5f9/1%20DAW/98EjerciciosVarios/src/Prog_Tarea09/Movimiento.java#L28
    Pattern.compile("([0-9]|([0-2][0-9])|(3[0-1]))[\\/|\\-]([0-9]|(0[0-9])|([0-1][0-2]))[\\/|\\-]([1-2][0-9]{3})"),
    // https://github.com/p76081158/WukongDockerfile/blob/e068a894ca0fe1ef7f90fc69a80fa0391e179e26/device-alpine/tmp/gradle-2.4/src/resources-s3/org/gradle/internal/resource/transport/aws/s3/S3RegionalResource.java#L28
    Pattern.compile("^s3:\\/\\/(.+)?\\.s3[.-]([a-z0-9-]+)\\.amazonaws\\.com(\\.[a-z]+)?\\/(.+)"),
    // https://github.com/p76081158/WukongDockerfile/blob/e068a894ca0fe1ef7f90fc69a80fa0391e179e26/device-alpine/tmp/gradle-2.4/src/resources-s3/org/gradle/internal/resource/transport/aws/s3/S3RegionalResource.java#L83
    Pattern.compile("\\.s3-external-1\\.amazonaws\\.com"),
    // https://github.com/p76081158/WukongDockerfile/blob/e068a894ca0fe1ef7f90fc69a80fa0391e179e26/device-alpine/tmp/gradle-2.4/src/resources-s3/org/gradle/internal/resource/transport/aws/s3/S3RegionalResource.java#L83
    Pattern.compile("\\.s3\\.amazonaws\\.com"),
    // https://github.com/p76081158/WukongDockerfile/blob/e068a894ca0fe1ef7f90fc69a80fa0391e179e26/device-alpine/tmp/gradle-2.4/src/resources-s3/org/gradle/internal/resource/transport/aws/s3/S3Client.java#L44
    Pattern.compile("[^\\/]+\\.*$"),
    // https://github.com/p76081158/WukongDockerfile/blob/e068a894ca0fe1ef7f90fc69a80fa0391e179e26/device-alpine/tmp/gradle-2.4/src/plugins/org/gradle/api/internal/tasks/testing/logging/GroovyStackTraceSpec.java#L26
    Pattern.compile("org.codehaus.groovy.runtime\\..*|org.codehaus.groovy.reflection\\..*|org.codehaus.groovy\\..*MetaClass.*|groovy\\..*MetaClass.*|groovy.lang.MetaMethod|java.lang.reflect\\..*|sun.reflect\\..*"),
    // https://github.com/AospExtended/platform_packages_apps_Dialer/blob/3c9c4fb3beabc53170b675a876c6d40829735687/java/com/android/dialer/lookup/yellowpages/YellowPagesApi.java#L66
    Pattern.compile("<a href=\"([^>]+?)\"[^>]+?class=\"url[^>]+?>([^<]+)</a>", Pattern.DOTALL),
    // https://github.com/AospExtended/platform_packages_apps_Dialer/blob/3c9c4fb3beabc53170b675a876c6d40829735687/java/com/android/dialer/lookup/yellowpages/YellowPagesApi.java#L82
    Pattern.compile("class=\"ypgListingTitleLink utagLink\".*?href=\"(.*?)\">(<span\\s+class=\"listingTitle\">.*?</span>)", Pattern.DOTALL),
    // https://github.com/dordje21/com.Hillelhw/blob/35facf7d51440499841f6b0dc0ffdaa8376bd27c/src/main/java/com/hillel/homeworks/hw4/Lecture4Task3.java#L16
    Pattern.compile("^[a-z0-9+_.-]\\w{5,15}$"),
    // https://github.com/kLubidorka/Java-MIPT-fall2020/blob/e628bae5dbddd866f462bee47fbb20cbd73f5b0e/Sem05/RegEx/src/main/java/RegExExample.java#L24
    Pattern.compile("[A-Z].*[.?!]"),
    // https://github.com/kLubidorka/Java-MIPT-fall2020/blob/e628bae5dbddd866f462bee47fbb20cbd73f5b0e/Sem05/RegEx/src/main/java/RegExExample.java#L44
    Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"),
    // https://github.com/kLubidorka/Java-MIPT-fall2020/blob/e628bae5dbddd866f462bee47fbb20cbd73f5b0e/Sem05/RegEx/src/main/java/RegExExample.java#L75
    Pattern.compile("YOUR REGEX HERE"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L72
    Pattern.compile("^\\s*([^=]+?)\\s*=\\s*(.*)$"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L74
    Pattern.compile("^#\\s*Rule:\\s*verbatim\\s*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L76
    Pattern.compile("^#\\s*Rule:\\s*(.*)>(.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L78
    Pattern.compile("^\\s*(?:#.*)?$"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L80
    Pattern.compile("Numeric[-\\s_]*Value", Pattern.CASE_INSENSITIVE),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/icu/src/tools/java/org/apache/lucene/analysis/icu/GenerateUTR30DataFiles.java#L97
    Pattern.compile(".*\\.(?s:txt)"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/tools/java/org/apache/lucene/analysis/standard/GenerateJflexTLDMacros.java#L86
    Pattern.compile("([-A-Za-z0-9]+)\\.\\s+NS\\s+.*"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/tools/java/org/apache/lucene/analysis/standard/GenerateJflexTLDMacros.java#L88
    Pattern.compile("([-A-Za-z0-9]+)\\.\\s+\\d+\\s+IN\\s+NS\\s+.*"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/pattern/TestPatternTokenizer.java#L85
    Pattern.compile("[,;/\\s]+"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/pattern/TestPatternTokenizer.java#L94
    Pattern.compile("Günther"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/pattern/TestPatternReplaceFilter.java#L75
    Pattern.compile("(a*)b"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/pattern/TestPatternReplaceCharFilter.java#L287
    Pattern.compile("(c.+)*xy"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/pattern/TestPatternCaptureGroupTokenFilter.java#L604
    Pattern.compile("((..)(..))"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestKeywordMarkerFilter.java#L58
    Pattern.compile("[a-zA-Z]+[fF]ox"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestKeywordMarkerFilter.java#L64
    Pattern.compile("[a-zA-Z]+[f]ox"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestKeywordMarkerFilter.java#L82
    Pattern.compile("Birds|Houses"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/test/org/apache/lucene/analysis/miscellaneous/TestKeywordMarkerFilter.java#L83
    Pattern.compile("Dogs|Trees"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/java/org/apache/lucene/analysis/pt/RSLPStemmerBase.java#L264
    Pattern.compile("^\\{\\s*\"([^\"]*)\",\\s*([0-9]+),\\s*(0|1),\\s*\\{(.*)\\},\\s*$"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/java/org/apache/lucene/analysis/pt/RSLPStemmerBase.java#L266
    Pattern.compile("^\\{\\s*\"([^\"]*)\",\\s*([0-9]+)\\s*\\}\\s*(,|(\\}\\s*;))$"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/java/org/apache/lucene/analysis/pt/RSLPStemmerBase.java#L268
    Pattern.compile("^\\{\\s*\"([^\"]*)\",\\s*([0-9]+),\\s*\"([^\"]*)\"\\}\\s*(,|(\\}\\s*;))$"),
    // https://github.com/IandECrave/CraveSolr/blob/295c599c5f1bbcc012c807c11bbe2248df425f7a/lucene-solr/lucene/analysis/common/src/java/org/apache/lucene/analysis/pt/RSLPStemmerBase.java#L270
    Pattern.compile("^\\{\\s*\"([^\"]*)\",\\s*([0-9]+),\\s*\"([^\"]*)\",\\s*\\{(.*)\\}\\s*\\}\\s*(,|(\\}\\s*;))$"),
    // https://github.com/tada/pljava/blob/1963eb91930ef316abefbd705a7e188070da821a/pljava/src/main/java/org/postgresql/pljava/internal/InstallHelper.java#L215
    Pattern.compile("^(?:(\\d++)?+=)?+"),
    // https://github.com/TASelwyn/CoMaS-Carleton/blob/cd84c0c2dc50903473019479429a75e3889a33c8/Source/CoMaS-0.7.5/edu/carleton/cas/modules/foundation/ModuleManager.java#L221
    Pattern.compile("([\\p{L}_$][\\p{L}\\p{N}_$]*\\.)*[\\p{L}_$][\\p{L}\\p{N}_$]*"),
    // https://github.com/CMPUT301F20T15/BookwormAdventuresDeluxe2/blob/51de58ab1588dfec9610491ec307be3f854e4864/app/src/main/java/com/example/bookwormadventuresdeluxe2/Utilities/EditTextValidator.java#L194
    Pattern.compile("^\\s*(?:\\+?(\\d{1}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/michaelpradel/static-taint-analysis-project/blob/6eb4b49d443407f1cb2f58c4f89f818b86fc1d82/closure-compiler/src/com/google/javascript/jscomp/ConformanceRules.java#L930
    Pattern.compile("\\.prototype\\."),
    // https://github.com/ls1intum/Artemis/blob/66ab874df9f172c6f6a35430bf485fe0ef90b68e/src/main/java/de/tum/in/www1/artemis/service/connectors/LtiService.java#L132
    Pattern.compile("=(.*?);"),
    // https://github.com/ls1intum/Artemis/blob/b903db205749c7d5739a1a3d9a6f1e20957dd4e0/src/main/java/de/tum/in/www1/artemis/service/FileService.java#L295
    Pattern.compile("[:.]"),
    // https://github.com/ls1intum/Artemis/blob/b903db205749c7d5739a1a3d9a6f1e20957dd4e0/src/main/java/de/tum/in/www1/artemis/service/FileService.java#L331
    Pattern.compile("git.ignore.file"),
    // https://github.com/ls1intum/Artemis/blob/b903db205749c7d5739a1a3d9a6f1e20957dd4e0/src/main/java/de/tum/in/www1/artemis/service/FileService.java#L335
    Pattern.compile("git.attributes.file"),
    // https://github.com/ls1intum/Artemis/blob/b903db205749c7d5739a1a3d9a6f1e20957dd4e0/src/main/java/de/tum/in/www1/artemis/service/FileService.java#L595
    Pattern.compile("\\r\\n?"),
    // https://github.com/Uzias1/Examen_Rsa/blob/78476b430846620a85f94cb32a6b7825ee188b20/Rsa_Examen/src/rsa_examen/FCifrar.java#L127
    Pattern.compile("^[a-zA-Z\\s\\u00f1\\u00d1]{1,888}"),
    // https://github.com/wholder/MegaTinyIDE/blob/4849f435ee953a4c3b55069e4bf21b34e8db4749/src/JSSCPort.java#L35
    Pattern.compile("cu."),
    // https://github.com/wholder/MegaTinyIDE/blob/4849f435ee953a4c3b55069e4bf21b34e8db4749/src/JSSCPort.java#L76
    Pattern.compile("(ttyS|ttyUSB|ttyACM|ttyAMA|rfcomm)[0-9]{1,3}"),
    // https://github.com/wholder/MegaTinyIDE/blob/4849f435ee953a4c3b55069e4bf21b34e8db4749/src/JSSCPort.java#L84
    Pattern.compile("tty.*"),
    // https://github.com/paytonx10/CalsuladoraSF/blob/530dc7ea078076b6f8d5140bb62b8abee27b6a01/src/main/java/com/microservicio/calculadorasf/utils/IdentificacionCaracteresUtil.java#L12
    Pattern.compile("[/+,-,/*,//,-]"),
    // https://github.com/EvilDrCoconut/NetworksFinalforView/blob/4fa41f7382ce17c07dd6373172837f8ca46cd9f4/FinalDraft/src/Client/HTMLDependencyExtractor.java#L24
    Pattern.compile("(?<=<link).+?(?<=href=\")(\\./.+?)(?=\")"),
    // https://github.com/EvilDrCoconut/NetworksFinalforView/blob/4fa41f7382ce17c07dd6373172837f8ca46cd9f4/FinalDraft/src/Client/HTMLDependencyExtractor.java#L25
    Pattern.compile("(?<=<script).+?(?<=src=\")(\\./.+?)(?=\")"),
    // https://github.com/EvilDrCoconut/NetworksFinalforView/blob/4fa41f7382ce17c07dd6373172837f8ca46cd9f4/FinalDraft/src/Client/HTMLDependencyExtractor.java#L26
    Pattern.compile("(?<=<img).+?(?<=src=\")(\\./.+?)(?=\")"),
    // https://github.com/systemincloud/ruminaq/blob/2d609a293696937cbdb6656b272796021c599afe/bundles/org.ruminaq.tasks.javatask.gui/src/main/java/org/ruminaq/tasks/javatask/gui/wizards/CreateJavaTaskPage.java#L91
    Pattern.compile("\\b(.)(.*?)\\b"),
    // https://github.com/sumaris-net/sumaris-pod/blob/6e7021e54b0189daccf314e751a2086e87b0c72d/sumaris-core/src/main/java/net/sumaris/core/dao/administration/user/PersonRepositoryImpl.java#L343
    Pattern.compile("sumaris.userProfile.(\\w+).label"),
    // https://github.com/sumaris-net/sumaris-pod/blob/6e7021e54b0189daccf314e751a2086e87b0c72d/sumaris-core-shared/src/main/java/net/sumaris/core/util/Files.java#L60
    Pattern.compile("([0-9.]+)([Ee][-+])([0-9]+)"),
    // https://github.com/sumaris-net/sumaris-pod/blob/6e7021e54b0189daccf314e751a2086e87b0c72d/sumaris-core-shared/src/main/java/net/sumaris/core/dao/technical/Daos.java#L1235
    Pattern.compile(":[a-zA-Z_0-9]+"),
    // https://github.com/sumaris-net/sumaris-pod/blob/6e7021e54b0189daccf314e751a2086e87b0c72d/sumaris-core-shared/src/main/java/net/sumaris/core/dao/technical/Daos.java#L1629
    Pattern.compile("[%]"),
    // https://github.com/sumaris-net/sumaris-pod/blob/6e7021e54b0189daccf314e751a2086e87b0c72d/sumaris-core-shared/src/main/java/net/sumaris/core/dao/technical/Daos.java#L1628
    Pattern.compile("[*]+"),
    // https://github.com/Khmelov/JD2020-11-10/blob/750de06fca3b4812de30117182ce77437ed36fe8/src/by/it/_examples_/jd01_06/MyMatcher.java#L11
    Pattern.compile("a+y"),
    // https://github.com/Khmelov/JD2020-11-10/blob/750de06fca3b4812de30117182ce77437ed36fe8/src/by/it/_examples_/jd01_06/MyMatcher.java#L17
    Pattern.compile("(\\w{6,})@(\\w+\\.)([a-z]{2,4})"),
    // https://github.com/Khmelov/JD2020-11-10/blob/750de06fca3b4812de30117182ce77437ed36fe8/src/by/it/_examples_/jd01_06/MyMatcher.java#L26
    Pattern.compile("\\d+\\s?"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/perf-android-k-9/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MessageExtractor.java#L89
    Pattern.compile("<meta http-equiv=\"?Content-Type\"? content=\"text/html; charset=(.+?)\">", Pattern.CASE_INSENSITIVE),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/perf-android-k-9/k9mail-library/src/main/java/com/fsck/k9/mail/internet/ListHeaders.java#L36
    Pattern.compile("<(mailto:.+)>"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/perf-android-k-9/k9mail-library/src/main/java/com/fsck/k9/mail/Address.java#L24
    Pattern.compile("^(?:[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~]|\\s)+$"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/perf-android-k-9/k9mail-library/src/main/java/com/fsck/k9/mail/Address.java#L320
    Pattern.compile("^\".*\"$"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/guides/subprojects/guides-test-fixtures/src/main/java/org/gradle/guides/test/fixtures/validation/DefaultOutputValidator.java#L8
    Pattern.compile(".*\\s+deprecated.*"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/guides/subprojects/guides-test-fixtures/src/main/java/org/gradle/guides/test/fixtures/validation/DefaultOutputValidator.java#L9
    Pattern.compile("\\s+(at\\s+)?([\\w.$_]+/)?[\\w.$_]+\\.[\\w$_ =\\+\'-]+\\(.+?\\)"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/guides/subprojects/gradle-guides-plugin/src/main/java/org/gradle/docs/internal/StringUtils.java#L70
    Pattern.compile("(.)(\\p{Upper})"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/guides/subprojects/gradle-guides-plugin/src/main/java/org/gradle/docs/internal/StringUtils.java#L82
    Pattern.compile("(?<=[a-z0-9])[A-Z]"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/gradle/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/adapter/ProtocolToModelAdapter.java#L65
    Pattern.compile("(?m)([A-Z]*)([a-z0-9]*)"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/gradle/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/execution/XCTestScraper.java#L48
    Pattern.compile(":\\d+: error: (-\\[\\p{Alnum}+.)?(\\p{Alnum}+)[ .](\\p{Alnum}+)]? : (.*)"),
    // https://github.com/WeilerWebServices/Gradle/blob/19e3f6366d251d163b08a984a2a920a58d0ea391/gradle/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/execution/XCTestScraper.java#L113
    Pattern.compile("[. ]"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/parser/DaemonicParserState.java#L101
    Pattern.compile("^([A-Za-z0-9_]*)//(.*)$"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/log/InvocationInfo.java#L48
    Pattern.compile(".+_.+_.+"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/jvm/java/JavacErrorParser.java#L37
    Pattern.compile("error: cannot access (?<symbol>\\S+)"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/jvm/java/JavacErrorParser.java#L71
    Pattern.compile("^(?<file>.+):[0-9]+: error: package (?<class>\\S+) does not exist"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/jvm/java/DefaultJavaLibraryRules.java#L284
    Pattern.compile("^(1\\.)*(?<version>\\d)$"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/jvm/java/ClassUsageTracker.java#L39
    Pattern.compile("^.*\\$\\d.*.class$"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/jvm/java/ClassUsageTracker.java#L68
    Pattern.compile("!/"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/io/filesystem/impl/DefaultProjectFilesystemFactory.java#L50
    Pattern.compile("[*?{\\[]"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/httpserver/TraceDataHandler.java#L38
    Pattern.compile("/([0-9a-zA-Z-]+)"),
    // https://github.com/WeilerWebServices/Facebook/blob/a862afa1ecedb6dbd043680c597716a3f4cf8232/buck/src/com/facebook/buck/httpserver/TraceDataHandler.java#L40
    Pattern.compile("[\\w\\.]+"),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/VDialog/HoaDonBanDialog.java#L224
    Pattern.compile("(MH\\d.*)]", Pattern.MULTILINE),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/VDialog/HoaDonBanDialog.java#L232
    Pattern.compile("(KH\\d.*)]", Pattern.MULTILINE),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/Utils/RegexExpression.java#L15
    Pattern.compile("^[\\w_\\.]{6,25}$"),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/Utils/RegexExpression.java#L16
    Pattern.compile("^([\\w_\\.!@#$%^&*()]+){6,25}$"),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/Utils/RegexExpression.java#L17
    Pattern.compile("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$"),
    // https://github.com/truonghdpk/travel-helper/blob/9d5bdf04716f8e8de6e637ca62e366dd832843c0/project/src/Utils/RegexExpression.java#L19
    Pattern.compile("^(\\d{9})|(\\d{12})$"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/removed/carver/SequenceExtractor.java#L87
    Pattern.compile("^\\.+\\.class"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/removed/carver/PostProcessor.java#L113
    Pattern.compile("\\s+;"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/master/src/test/java/com/examples/with/different/packagename/sette/LO_Other.java#L174
    Pattern.compile("^[0-9a-zA-Z]{6}$"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/master/src/test/java/com/examples/with/different/packagename/sette/LO_Other.java#L186
    Pattern.compile("[a-z0-9]{6}", Pattern.CASE_INSENSITIVE),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/master/src/test/java/com/examples/with/different/packagename/RegexNullExample.java#L31
    Pattern.compile("(--[a-zA-Z_]+)=(.*)"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/test/java/org/evosuite/utils/TestRegexDistance.java#L284
    Pattern.compile(".*\\bhallo\\b.*"),
    // https://github.com/Asdolo/Ingsoft2/blob/44313347f1ea21938c6cea5437a79c64eb8e2be8/taller-5/evosuite/client/src/test/java/org/evosuite/symbolic/solver/avm/TestPatternSearch.java#L52
    Pattern.compile("(\\d+)-(\\d\\d)-(\\d)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/2f7692a5efcd78ca2106b3f21b8604d3a1c7bd99/src/gov/epa/exp_data_gathering/parse/ParseOFMPub.java#L60
    Pattern.compile("CAS No\\.[ ]?([0-9-]+),[ ]?([-0-9a-zA-Z, ]+)( or)?"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/2f7692a5efcd78ca2106b3f21b8604d3a1c7bd99/src/gov/epa/exp_data_gathering/parse/ParseOFMPub.java#L93
    Pattern.compile("Other @"),
    // https://github.com/DelfikPro/vimeworld-2fa/blob/a8a9bc19d0be16be728952bc0f73c0f3cfc1f87a/src/main/java/implario/vimeworld/_2fa/phase/LoginPhase.java#L21
    Pattern.compile("<div class=\"wrap\">(.*)<div class=\"form-signin-heading\">"),
    // https://github.com/DelfikPro/vimeworld-2fa/blob/a8a9bc19d0be16be728952bc0f73c0f3cfc1f87a/src/main/java/implario/vimeworld/_2fa/phase/LoginPhase.java#L22
    Pattern.compile("</button>(.*)</div>"),
    // https://github.com/DelfikPro/vimeworld-2fa/blob/a8a9bc19d0be16be728952bc0f73c0f3cfc1f87a/src/main/java/implario/vimeworld/_2fa/phase/CsrfPhase.java#L17
    Pattern.compile("csrf_token: '([0-9a-f]+)'"),
    // https://github.com/DelfikPro/vimeworld-2fa/blob/a8a9bc19d0be16be728952bc0f73c0f3cfc1f87a/src/main/java/implario/vimeworld/_2fa/phase/CaptchaSolvingPhase.java#L19
    Pattern.compile("PHPSESSID=([A-Za-z0-9_-]+)"),
    // https://github.com/littlecurl/ShaoHua/blob/44f7b7f96d0c04899a67050f6645ec753937e53c/ShaoHuaAndroid/app/src/main/java/cn/edu/heuet/shaohua/util/ValidUtils.java#L13
    Pattern.compile("^[1]([3-9])[0-9]{9}$"),
    // https://github.com/littlecurl/ShaoHua/blob/44f7b7f96d0c04899a67050f6645ec753937e53c/ShaoHuaAndroid/RxKit/src/main/java/com/vondear/rxtool/RxTool.java#L253
    Pattern.compile("[^0-9\u4E00-\u9FA5]"),
    // https://github.com/littlecurl/ShaoHua/blob/44f7b7f96d0c04899a67050f6645ec753937e53c/ShaoHuaAndroid/RxKit/src/main/java/com/vondear/rxtool/RxRegTool.java#L56
    Pattern.compile("^(13[0-9]|15[012356789]|17[03678]|18[0-9]|14[57])[0-9]{8}$"),
    // https://github.com/littlecurl/ShaoHua/blob/44f7b7f96d0c04899a67050f6645ec753937e53c/ShaoHuaAndroid/RxKit/src/main/java/com/vondear/rxtool/RxRegTool.java#L68
    Pattern.compile("^\\d{16,19}$|^\\d{6}[- ]\\d{10,13}$|^\\d{4}[- ]\\d{4}[- ]\\d{4}[- ]\\d{4,7}$"),
    // https://github.com/littlecurl/ShaoHua/blob/44f7b7f96d0c04899a67050f6645ec753937e53c/ShaoHuaAndroid/RxKit/src/main/java/com/vondear/rxtool/RxRegTool.java#L81
    Pattern.compile("^(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[Xx])$)$"),
    // https://github.com/xieshiwei/SpringCloudAlibabaNacosResurce/blob/b4f287e8c29faa5bd118630ddf45dd74fc752fc5/naming/src/main/java/com/alibaba/nacos/naming/core/Instance.java#L64
    Pattern.compile("(\\d|\\.)+"),
    // https://github.com/xieshiwei/SpringCloudAlibabaNacosResurce/blob/b4f287e8c29faa5bd118630ddf45dd74fc752fc5/config/src/main/java/com/alibaba/nacos/config/server/utils/UrlAnalysisUtils.java#L31
    Pattern.compile("^(\\w+://)?([\\w\\.]+:)(\\d*)?(\\??.*)"),
    // https://github.com/xieshiwei/SpringCloudAlibabaNacosResurce/blob/b4f287e8c29faa5bd118630ddf45dd74fc752fc5/config/src/main/java/com/alibaba/nacos/config/server/utils/DerbyUtils.java#L29
    Pattern.compile("(INSERT INTO .+? VALUES)"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/3%E7%A5%A8%E5%8A%A1%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/AccWebTk/src/com/goldsign/acc/app/query/controller/TicketStorageQueryController.java#L557
    Pattern.compile("(\"[^\"]*(\"{2})*[^\"]*\")*[^,]*,"),
  };
}
