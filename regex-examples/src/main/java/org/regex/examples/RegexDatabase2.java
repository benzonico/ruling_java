package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase2 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L79
    Pattern.compile("  \\| state=R .*"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/result/evaulation/ResultFinalEvaluationOutPutReader.java#L66
    Pattern.compile("(.*): ?(.*)"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/result/evaulation/ResultFinalEvaluationOutPutReader.java#L69
    Pattern.compile("(.*) = Score \\[getF1\\(\\)=(.+?), getPrecision\\(\\)=(.+?), getRecall\\(\\)=(.+?), tp=(.+?), fp=(.+?), fn=(.+?), tn=(.+?)\\]"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/result/evaulation/ResultFinalEvaluationOutPutReader.java#L72
    Pattern.compile("(.*)(=|:) Score \\[macroF1=(.+?), macroPrecision=(.+?), macroRecall=(.+?), macroAddCounter=.*?\\]"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/result/evaulation/ResultFinalEvaluationOutPutReader.java#L75
    Pattern.compile("EXP GROUP MICRO  INTERVALL CARDINALITY = (.*?)	(.*?)	(.*?)	(.*?)"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/result/evaulation/ResultFinalEvaluationOutPutReader.java#L145
    Pattern.compile(".*Results.*"),
    // https://github.com/ag-sc/SCIOExtraction/blob/2267b47a9f9ebdda06f69f81e90e17d54683df7f/src/main/java/de/uni/bielefeld/sc/hterhors/psink/scio/semanticmr/slot_filling/experimental_group/evaluation/ExperimentalGroupFinalEvaluationOutPutReader.java#L93
    Pattern.compile("(.*): (.*)"),
    // https://github.com/DevashishPathrabe/Hackerrank/blob/bc8de6d92f6273f9dc586b8450888f7905ad6c33/HackerRank%20Solutions/Regex/Applications/HackerRank%20Tweets.java#L6
    Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE),
    // https://github.com/xkcoding/spring-boot-demo/blob/90de2f4935bad8a77726c5ab9f880fb9e9461399/demo-oauth/oauth-authorization-server/src/test/java/com/xkcoding/oauth/oauth/AuthorizationCodeGrantTests.java#L71
    Pattern.compile("(?s).*name=\"_csrf\".*?value=\"([^\"]+).*"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/context/request/ServletWebRequest.java#L70
    Pattern.compile("\\*|\\s*((W\\/)?(\"[^\"]*\"))\\s*,?"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-expression/src/main/java/org/springframework/expression/spel/standard/InternalSpelExpressionParser.java#L90
    Pattern.compile("[\\p{L}\\p{N}_$]+"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-core/src/test/java/org/springframework/core/io/ClassPathResourceTests.java#L47
    Pattern.compile("^class path resource \\[(.+?)\\]$"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-core/src/main/java/org/springframework/util/unit/DataSize.java#L41
    Pattern.compile("^([+\\-]?\\d+)([a-zA-Z]{0,2})$"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java#L80
    Pattern.compile("\\{[^/]+?\\}"),
    // https://github.com/YWUJ123456/Spring5.1.x/blob/5a8695e1cbda665dbbdb64332372d228c4c34bd3/spring-framework-5.1.x/spring-context/src/test/java/org/springframework/context/annotation/ClassPathScanningCandidateComponentProviderTests.java#L69
    Pattern.compile("example.scannable.*Named.*"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/model/message/header/TimeoutHeader.java#L31
    Pattern.compile("Second-(?:([0-9]+)|infinite)"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/model/message/header/MaxAgeHeader.java#L30
    Pattern.compile(".*max-age\\s*=\\s*([0-9]+).*"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/model/message/header/MANHeader.java#L26
    Pattern.compile("\"(.+?)\"(;.+?)??"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/model/message/header/MANHeader.java#L27
    Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/binding/xml/RecoveringUDA10DeviceDescriptorBinderImpl.java#L163
    Pattern.compile("The prefix \"(.*)\" for element"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/binding/xml/RecoveringUDA10DeviceDescriptorBinderImpl.java#L166
    Pattern.compile("undefined prefix: ([^ ]*)"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/binding/xml/RecoveringUDA10DeviceDescriptorBinderImpl.java#L176
    Pattern.compile("<root([^>]*)"),
    // https://github.com/zhengyi0802/MTVService/blob/d8984d287430d43a0fb942be1121bec4e02a5c42/libDLNA/src/main/java/org/fourthline/cling/binding/xml/RecoveringUDA10DeviceDescriptorBinderImpl.java#L187
    Pattern.compile("<root[^>]*>(.*)</root>", Pattern.DOTALL),
    // https://github.com/niick7/BD_W1D2/blob/39a5a543200478b71a804641eb8d253bf6b7c1d8/src/main/java/w2d1/Application.java#L14
    Pattern.compile("[0-9]|_"),
    // https://github.com/arunavo001/gitHelloWorld2/blob/39b5b40a3b6587bf9f7dc816c7aa633f99052b58/src/PatternMatcherProblem.java#L12
    Pattern.compile("\\d[aeiou]{2,}[a-z&&[^aeiou]]{3,}(\\d)"),
    // https://github.com/SakshamG30/ChatApp-with-Chatbot-Implementation/blob/e7fbb52b2353ed72e66de86261edd6301a1c6dc4/src/main/java/org/alicebot/ab/Sraix.java#L181
    Pattern.compile("(.*)-(.*)-(.*)T(.*):(.*)"),
    // https://github.com/SakshamG30/ChatApp-with-Chatbot-Implementation/blob/e7fbb52b2353ed72e66de86261edd6301a1c6dc4/src/main/java/org/alicebot/ab/Sraix.java#L243
    Pattern.compile("\\[(.*)\\]"),
    // https://github.com/SakshamG30/ChatApp-with-Chatbot-Implementation/blob/e7fbb52b2353ed72e66de86261edd6301a1c6dc4/src/main/java/org/alicebot/ab/Sraix.java#L274
    Pattern.compile("<a(.*)</a>"),
    // https://github.com/SakshamG30/ChatApp-with-Chatbot-Implementation/blob/e7fbb52b2353ed72e66de86261edd6301a1c6dc4/src/main/java/org/alicebot/ab/PreProcessor.java#L73
    Pattern.compile("(\r\n|\n\r|\r|\n)"),
    // https://github.com/SakshamG30/ChatApp-with-Chatbot-Implementation/blob/e7fbb52b2353ed72e66de86261edd6301a1c6dc4/src/main/java/org/alicebot/ab/PreProcessor.java#L169
    Pattern.compile("\"(.*?)\",\"(.*?)\"", Pattern.DOTALL),
    // https://github.com/JFKakaJFK/quizconnect/blob/cfb8392ffbe5866ef5e1f081bd5adac1d9e08396/src/main/java/at/qe/sepm/skeleton/ui/beans/ValidationBean.java#L28
    Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"),
    // https://github.com/JFKakaJFK/quizconnect/blob/cfb8392ffbe5866ef5e1f081bd5adac1d9e08396/src/main/java/at/qe/sepm/skeleton/ui/beans/ValidationBean.java#L63
    Pattern.compile("^[a-zA-Z0-9 .,;-_€@$äÄöÖüÜ!?#&=]+$"),
    // https://github.com/JFKakaJFK/quizconnect/blob/cfb8392ffbe5866ef5e1f081bd5adac1d9e08396/src/main/java/at/qe/sepm/skeleton/ui/beans/ValidationBean.java#L91
    Pattern.compile("^.{5,}$"),
    // https://github.com/JFKakaJFK/quizconnect/blob/cfb8392ffbe5866ef5e1f081bd5adac1d9e08396/src/main/java/at/qe/sepm/skeleton/ui/beans/ValidationBean.java#L126
    Pattern.compile("^\\d+\\/\\d+\\/.*\\.(?:(png|jpg))$"),
    // https://github.com/suraj0955/aosp4/blob/26e8207c1c6a188c348846f77e3c2d8c94e953ab/external/okhttp/src/main/java/com/squareup/okhttp/internal/DiskLruCache.java#L95
    Pattern.compile("[a-z0-9_-]{1,64}"),
    // https://github.com/suraj0955/aosp4/blob/26e8207c1c6a188c348846f77e3c2d8c94e953ab/external/okhttp/src/main/java/com/squareup/okhttp/MediaType.java#L28
    Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"),
    // https://github.com/suraj0955/aosp4/blob/26e8207c1c6a188c348846f77e3c2d8c94e953ab/external/okhttp/src/main/java/com/squareup/okhttp/MediaType.java#L32
    Pattern.compile(";\\s*([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\")"),
    // https://github.com/suraj0955/aosp4/blob/265f7a094c30873fee324141d4e6073996796da0/external/oauth/core/src/main/java/net/oauth/http/HttpMessage.java#L159
    Pattern.compile("; *charset *= *([^;\"]*|\"([^\"]|\\\\\")*\")(;|$)"),
    // https://github.com/suraj0955/aosp4/blob/265f7a094c30873fee324141d4e6073996796da0/external/oauth/core/src/main/java/net/oauth/OAuthMessage.java#L387
    Pattern.compile("\\s*(\\w*)\\s+(.*)"),
    // https://github.com/suraj0955/aosp4/blob/265f7a094c30873fee324141d4e6073996796da0/external/oauth/core/src/main/java/net/oauth/OAuthMessage.java#L388
    Pattern.compile("(\\S*)\\s*\\=\\s*\"([^\"]*)\""),
    // https://github.com/suraj0955/aosp4/blob/d81b31695ed8fd352935e4d7f48b56dbb9780088/external/mp4parser/isoparser/src/main/java/com/googlecode/mp4parser/util/Path.java#L34
    Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?"),
    // https://github.com/suraj0955/aosp4/blob/d81b31695ed8fd352935e4d7f48b56dbb9780088/external/mp4parser/isoparser/src/main/java/com/coremedia/iso/PropertyBoxParserImpl.java#L75
    Pattern.compile("(.*)\\((.*?)\\)"),
    // https://github.com/suraj0955/aosp4/blob/d86564d3281615498ee01e3f7a72d302e0dc698a/external/mockito/src/org/mockito/internal/util/Decamelizer.java#L13
    Pattern.compile("([A-Z\\d][^A-Z\\d]*)"),
    // https://github.com/wordpress-mobile/WordPress-Android/blob/3666a8f02a03dc20ce116d27a0ee249238f1a441/WordPress/src/main/java/org/wordpress/android/ui/posts/PostUtils.java#L88
    Pattern.compile("(\\[ *([^ ]+) [^\\[\\]]*\\])"),
    // https://github.com/wordpress-mobile/WordPress-Android/blob/3666a8f02a03dc20ce116d27a0ee249238f1a441/WordPress/src/main/java/org/wordpress/android/ui/posts/PostUtils.java#L303
    Pattern.compile("(?s)<!--\\swp:gallery?(.*?)wp:gallery\\s-->"),
    // https://github.com/gigagibi/JAVA_MIREA_PRACTICE/blob/a972f0bb3d87adfd69ce23bed73402046845ee7d/src/main/java/PRAKTIKA23/Worker.java#L27
    Pattern.compile("([\\+\\-\\*\\/]?\\d+\\.?\\d*)\\s*([\\+\\-\\*\\/])\\s*([\\+\\-\\*\\/]?\\s*\\d+\\.?\\d*)"),
    // https://github.com/apache/netbeans/blob/e990d2bc21c2f7a11b1480aa46be4f663b825a34/webcommon/web.webkit.tooling/src/org/netbeans/modules/web/webkit/tooling/networkmonitor/ModelItem.java#L636
    Pattern.compile("([0-9a-zA-Z_$]+?\\()([\\{\\[].*?[\\}\\]])(\\)[\\;]?[\n\r]?)", Pattern.DOTALL),
    // https://github.com/shamrice/discapp/blob/ae5e8ccd0ea4903e0d6381c7a449f065a22e930b/src/main/java/io/github/shamrice/discapp/web/controller/maintenance/AppearancePreviewController.java#L211
    Pattern.compile("href=([\"'])(?:(?=(\\\\?))\\2.)*?\\1"),
    // https://github.com/shamrice/discapp/blob/ae5e8ccd0ea4903e0d6381c7a449f065a22e930b/src/main/java/io/github/shamrice/discapp/web/controller/maintenance/AppearancePreviewController.java#L223
    Pattern.compile("(?i)<(.*)form(.*?)>"),
    // https://github.com/fev/cudu/blob/eff3a112803822b4cf448e91a9743288fa7d36de/backend/src/main/java/org/scoutsfev/cudu/domain/validadores/ValidadorDniNie.java#L69
    Pattern.compile("^[a-zA-Z]{3}[0-9]{6}[a-zA-Z]?$"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/optifine/CustomColormap.java#L172
    Pattern.compile("^block([0-9]+).*$"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/util/StringUtils.java#L7
    Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/util/StringTranslate.java#L19
    Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/util/EnumChatFormatting.java#L61
    Pattern.compile("[^a-z]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/util/ChatComponentTranslation.java#L19
    Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/src/Config.java#L342
    Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/src/Config.java#L1728
    Pattern.compile("([A-Z])([0-9]+)(.*)"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L14
    Pattern.compile("\\[[-+\\d|,\\s]+\\]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L439
    Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L440
    Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L441
    Pattern.compile("[-+]?[0-9]+[b|B]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L442
    Pattern.compile("[-+]?[0-9]+[l|L]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L443
    Pattern.compile("[-+]?[0-9]+[s|S]"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L444
    Pattern.compile("[-+]?[0-9]+"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/nbt/JsonToNBT.java#L445
    Pattern.compile("[-+]?[0-9]*\\.?[0-9]+"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/command/server/CommandBanIp.java#L20
    Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/command/PlayerSelector.java#L42
    Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/command/PlayerSelector.java#L47
    Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)"),
    // https://github.com/ahmetyxa/Pixargonclient/blob/4e17ddedeb24e4b212eaf30861ef553a775c3cd3/src/main/resources/net/minecraft/command/PlayerSelector.java#L52
    Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)"),
    // https://github.com/inkarnadin/cms-check-component/blob/b9ee80019972580f4355f97d11f56bee78e283d2/src/main/java/web/cms/joomla/JoomlaCheckProcessor.java#L70
    Pattern.compile("<meta name=\"generator\" content=\"(Joomla!).*/>"),
    // https://github.com/inkarnadin/cms-check-component/blob/b9ee80019972580f4355f97d11f56bee78e283d2/src/main/java/web/cms/joomla/JoomlaCheckProcessor.java#L104
    Pattern.compile("login-joomla"),
    // https://github.com/ParkJeongseop/MobileProgrammingClassAssignment/blob/3bc355323a134bed6e659c4e0270e286750f294c/app/src/main/java/com/parkjeongseop/assingmentapp/SignUpActivity.java#L62
    Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9가-힣]).{8,})"),
    // https://github.com/SachaLvz/Factions/blob/91311793de7a3af09f7e7cac7611efad6825c251/src/com/massivecraft/factions/zcore/util/TextUtil.java#L42
    Pattern.compile("<([a-zA-Z0-9_]*)>"),
    // https://github.com/SachaLvz/Factions/blob/91311793de7a3af09f7e7cac7611efad6825c251/src/com/massivecraft/factions/zcore/util/TextUtil.java#L78
    Pattern.compile("(\u00A7l([a-z0-9]))"),
    // https://github.com/SachaLvz/Factions/blob/91311793de7a3af09f7e7cac7611efad6825c251/src/com/massivecraft/factions/zcore/util/TextUtil.java#L79
    Pattern.compile("(&([a-z0-9]))"),
    // https://github.com/SachaLvz/Factions/blob/91311793de7a3af09f7e7cac7611efad6825c251/src/com/massivecraft/factions/listeners/FactionsChatListener.java#L52
    Pattern.compile("[{\\[]factions?_([a-zA-Z_]+)[}\\]]"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/ooxml/java/org/apache/poi/xslf/usermodel/XMLSlideShow.java#L168
    Pattern.compile("/ppt/embeddings/.*?"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/ooxml/java/org/apache/poi/xslf/usermodel/XMLSlideShow.java#L179
    Pattern.compile("/ppt/media/.*?"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/ooxml/java/org/apache/poi/openxml4j/opc/internal/ContentType.java#L124
    Pattern.compile("^([\\x21-\\x7E&&[^\\(\\)<>@,;:\\\\/\"\\[\\]\\?={}\\x20\\x09]]+)/([\\x21-\\x7E&&[^\\(\\)<>@,;:\\\\/\"\\[\\]\\?={}\\x20\\x09]]+)$"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/util/CellReference.java#L56
    Pattern.compile("\\$?([A-Za-z]+)\\$?([0-9]+)"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/util/CellReference.java#L61
    Pattern.compile("\\$?([A-Za-z]+)"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/util/CellReference.java#L66
    Pattern.compile("\\$?([0-9]+)"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/util/CellReference.java#L71
    Pattern.compile("[_A-Za-z][_.A-Za-z0-9]*"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L53
    Pattern.compile("^\\[\\$\\-.*?\\]"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L54
    Pattern.compile("^\\[[a-zA-Z]+\\]"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L55
    Pattern.compile("^[\\[\\]yYmMdDhHsS\\-/,. :\"\\\\]+0*[ampAMP/]*$"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L57
    Pattern.compile("^\\[([hH]+|[mM]+|[sS]+)\\]"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L224
    Pattern.compile("\\\\-"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L226
    Pattern.compile("\\\\,"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L228
    Pattern.compile("\\\\\\."),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L230
    Pattern.compile("\\\\ "),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DateUtil.java#L234
    Pattern.compile(";@"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L106
    Pattern.compile("[0#]+"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L109
    Pattern.compile("([d]{3,})", Pattern.CASE_INSENSITIVE),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L112
    Pattern.compile("((A|P)[M/P]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L115
    Pattern.compile("(\\[\\$[^-\\]]*-[0-9A-Z]+\\])"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L123
    Pattern.compile("(\\[BLACK\\])|(\\[BLUE\\])|(\\[CYAN\\])|(\\[GREEN\\])|(\\[MAGENTA\\])|(\\[RED\\])|(\\[WHITE\\])|(\\[YELLOW\\])|(\\[COLOR\\s*\\d\\])|(\\[COLOR\\s*[0-5]\\d\\])", Pattern.CASE_INSENSITIVE),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L375
    Pattern.compile("\\\\/"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L377
    Pattern.compile("\"/\""),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L392
    Pattern.compile("D"),
    // https://github.com/Martin0618/phase2/blob/82f472d3c0f6352ba21181ef8eeeaa534016064c/poi-3.8/src/java/org/apache/poi/ss/usermodel/DataFormatter.java#L701
    Pattern.compile("E"),
    // https://github.com/neo4j/graph-data-science/blob/080aa2bc529f903822dbfbd05bbe82f36a18512b/core/src/main/java/org/neo4j/graphalgo/core/utils/mem/MemoryUsage.java#L318
    Pattern.compile("^.relationships.table\\[\\d+].value.list.*$"),
    // https://github.com/neo4j/graph-data-science/blob/080aa2bc529f903822dbfbd05bbe82f36a18512b/core/src/main/java/org/neo4j/graphalgo/core/utils/mem/MemoryUsage.java#L319
    Pattern.compile("^.relationships.table\\[\\d+].value.offsets.*$"),
    // https://github.com/YANGZ001/cs61b-2018spring/blob/9b0c6f556e182a6095c00662672fe0d52993cec3/lab14/lab14/DownloadSound.java#L27
    Pattern.compile("class[\\s]+([\\w]+).*\\{"),
    // https://github.com/YANGZ001/cs61b-2018spring/blob/9b0c6f556e182a6095c00662672fe0d52993cec3/lab11/lab11/graphs/Maze.java#L145
    Pattern.compile("(\\w+)\\s*=\\s*([a-zA-Z0-9_.]+)"),
    // https://github.com/marei94203729/vue/blob/d069ff827dece2b9ae928e287a2d0b9116ff0b66/src/main/java/com/cros/vue/common/StringUtils.java#L102
    Pattern.compile("<.+?>"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-file/v1beta1/1.31.0/com/google/api/services/file/v1beta1/CloudFilestore.java#L197
    Pattern.compile("^projects/[^/]+/locations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-file/v1beta1/1.31.0/com/google/api/services/file/v1beta1/CloudFilestore.java#L729
    Pattern.compile("^projects/[^/]+/locations/[^/]+/backups/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-file/v1beta1/1.31.0/com/google/api/services/file/v1beta1/CloudFilestore.java#L1595
    Pattern.compile("^projects/[^/]+/locations/[^/]+/instances/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-file/v1beta1/1.31.0/com/google/api/services/file/v1beta1/CloudFilestore.java#L2441
    Pattern.compile("^projects/[^/]+/locations/[^/]+/operations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-domainsrdap/v1/1.31.0/com/google/api/services/domainsrdap/v1/DomainsRDAP.java#L326
    Pattern.compile("^[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/afbcaac58c4fb988b8718cb61b94beba41f2b997/clients/google-api-services-domains/v1beta1/1.31.0/com/google/api/services/domains/v1beta1/CloudDomains.java#L906
    Pattern.compile("^projects/[^/]+/locations/[^/]+/registrations/[^/]+$"),
    // https://github.com/lamsfoundation/lams/blob/dac907ce79fde14b5b168324b3a2da18404d6dcb/lams_tool_assessment/src/java/org/lamsfoundation/lams/tool/assessment/service/AssessmentServiceImpl.java#L794
    Pattern.compile("\\Q"),
    // https://github.com/lamsfoundation/lams/blob/dac907ce79fde14b5b168324b3a2da18404d6dcb/lams_tool_assessment/src/java/org/lamsfoundation/lams/tool/assessment/service/AssessmentServiceImpl.java#L794
    Pattern.compile("\\Q", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/version/util/VerGen.java#L108
    Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)((\\.\\d+)*)(-(.+))?$"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java#L72
    Pattern.compile("-+BEGIN\\s+.*CERTIFICATE[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*CERTIFICATE[^-]*-+", Pattern.CASE_INSENSITIVE),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java#L78
    Pattern.compile("-+BEGIN\\s+.*PRIVATE\\s+KEY[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*PRIVATE\\s+KEY[^-]*-+", Pattern.CASE_INSENSITIVE),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java#L84
    Pattern.compile("-+BEGIN\\s+.*PUBLIC\\s+KEY[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*PUBLIC\\s+KEY[^-]*-+", Pattern.CASE_INSENSITIVE),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java#L55
    Pattern.compile("([^/@]*)(/([^/@]*))?@([^/@]*)"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java#L62
    Pattern.compile("([^$]*)(\\$(\\d*))?"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java#L68
    Pattern.compile("\\s*((DEFAULT)|(RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?(s/([^/]*)/([^/]*)/(g)?)?))"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java#L74
    Pattern.compile("[/@]"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java#L104
    Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java#L107
    Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java#L110
    Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java#L126
    Pattern.compile("\\s*([^\"\']\\S*|\"[^\"]*\"|'[^']*')\\s*"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java#L127
    Pattern.compile("^([\'\"])(.*)(\\1)$"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/Log4JSource.java#L265
    Pattern.compile("^(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3})"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/Log4JSource.java#L286
    Pattern.compile("\\[1:(\\d+)\\]"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/JsonGenerator.java#L77
    Pattern.compile("- (LOOKING|FOLLOWING|LEADING)"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/JsonGenerator.java#L78
    Pattern.compile("New election. My id =  (\\d+), Proposed zxid = (\\d+)"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/JsonGenerator.java#L79
    Pattern.compile("Notification: (\\d+) \\(n.leader\\), (\\d+) \\(n.zxid\\), (\\d+) \\(n.round\\), .+ \\(n.state\\), (\\d+) \\(n.sid\\), .+ \\(my state\\)"),
    // https://github.com/LmingXie/zookeeper-release-3.5.6/blob/63843f12fbaebe7371452da825b382d3cca897ae/zookeeper-contrib/zookeeper-contrib-loggraph/src/main/java/org/apache/zookeeper/graph/JsonGenerator.java#L80
    Pattern.compile("xception"),
    // https://github.com/nstanar/flight-adviser/blob/42b2ca2189e8960d3906a42e2753302443bb96d5/flight-management/src/main/java/com/htec/flight_management/service/util/data/converter/impl/AirportRecordsConverterImpl.java#L25
    Pattern.compile("[a-zA-Z]{3}"),
    // https://github.com/nstanar/flight-adviser/blob/42b2ca2189e8960d3906a42e2753302443bb96d5/flight-management/src/main/java/com/htec/flight_management/service/util/data/converter/impl/AirportRecordsConverterImpl.java#L30
    Pattern.compile("[a-zA-Z]{4}"),
    // https://github.com/sfc-gh-sca-sa/libsnowflakeclient-sca/blob/087996b4f6dac3ed1089e5e2e066c4a1e7785c5e/deps/aws-sdk-cpp-1.3.50/code-generation/generator/src/main/java/com/amazonaws/util/awsclientgenerator/domainmodels/codegeneration/Http.java#L28
    Pattern.compile(".*\\{[\\w\\d]+\\}"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/XMLHelper.java#L119
    Pattern.compile("<\\?xml.*encoding=[\"'](.*)[\"']\\?>"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/XMLHelper.java#L142
    Pattern.compile("(?s)xmlns=['\"].*?['\"]"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/XMLHelper.java#L144
    Pattern.compile("(?s)\\w*:schemaLocation=['\"].*?['\"]"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/XMLHelper.java#L155
    Pattern.compile("(\\w+?)=['\"](.*?)['\"]"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/StringHelper.java#L326
    Pattern.compile("\\d"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/StringHelper.java#L352
    Pattern.compile("(.*)\\((.*),(.*)\\)"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/StringHelper.java#L353
    Pattern.compile("(.*)\\((.*)\\)"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/StringHelper.java#L359
    Pattern.compile("\\w+\\(.*?\\)"),
    // https://github.com/wujun728/jun_code_generator/blob/43b2be761795adca4472a9f0ad0c09363ef9ceae/jun_code_generators/docs/jun_rapid_generator_3.9.2/src/cn/org/rapid_framework/generator/util/AntPathStringMatcher.java#L37
    Pattern.compile("\\?|\\*|\\{([^/]+?)\\}"),
    // https://github.com/wujun728/jedp_product/blob/5cba44be661af8296b5eed5c799a0a2361e667c2/xutils/src/main/java/klg/common/utils/JsoupHttp.java#L28
    Pattern.compile("(?i)\\bcharset=\\s*(?:\"|')?([^\\s,;\"']*)"),
    // https://github.com/wujun728/jedp_product/blob/5cba44be661af8296b5eed5c799a0a2361e667c2/xutils/src/main/java/klg/common/utils/JsoupHttp.java#L91
    Pattern.compile("[\"']"),
    // https://github.com/wujun728/jedp_product/blob/5cba44be661af8296b5eed5c799a0a2361e667c2/spring-boot-demo/spring-boot-demo-24-1/src/main/java/com/roncoo/example/util/base/Sql.java#L154
    Pattern.compile("order\\s*by[\\w|\\W|\\s|\\S]*", Pattern.CASE_INSENSITIVE),
    // https://github.com/Talend/tdi-studio-se/blob/29dbd7c1a538e3a02aa715d441b7af19c5325bc4/main/plugins/org.talend.designer.dbmap/src/main/java/org/talend/designer/dbmap/utils/DataMapExpressionParser.java#L196
    Pattern.compile("\\\""),
    // https://github.com/Talend/tdi-studio-se/blob/29dbd7c1a538e3a02aa715d441b7af19c5325bc4/main/plugins/org.talend.designer.dbmap/src/main/java/org/talend/designer/dbmap/utils/DataMapExpressionParser.java#L196
    Pattern.compile("\\)"),
    // https://github.com/Talend/tdi-studio-se/blob/29dbd7c1a538e3a02aa715d441b7af19c5325bc4/main/plugins/org.talend.designer.dbmap/src/main/java/org/talend/designer/dbmap/language/generation/DbGenerationManager.java#L179
    Pattern.compile("[\r\n]"),
    // https://github.com/12345asdf555/SPACEXIFA/blob/04e0efc23c0ece9f2d55227767f515c10cfd7ec5/src/com/spring/controller/ImportExcelController.java#L2082
    Pattern.compile("^[-\\+]?[\\d]*$"),
    // https://github.com/hiling/mini-platform/blob/6ed2c425a7242341357893a745855b70780da274/common/src/main/java/com/github/hiling/common/utils/AddressUtils.java#L23
    Pattern.compile("[0-9]{1,3}(\\.[0-9]{1,3}){3,}"),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/model/MSchedule.java#L46
    Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", Pattern.CASE_INSENSITIVE),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/model/MSchedule.java#L47
    Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", Pattern.CASE_INSENSITIVE),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/model/MOrder.java#L2649
    Pattern.compile("( \\| )?Close \\(.*\\)"),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/dbPort/Convert.java#L306
    Pattern.compile("'[[^']*]*'"),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/dbPort/Convert.java#L551
    Pattern.compile("UPDATE .*_TRL SET .*"),
    // https://github.com/ocurieles/idempiere-custom/blob/ecf017ed1c2d4dd7559201c0b1eeceafc6c40e09/org.adempiere.base/src/org/compiere/dbPort/Convert.java#L553
    Pattern.compile("INSERT INTO .*_TRL .*"),
    // https://github.com/bsilva3/EasyBDI/blob/513efef569f902b9c271a28937a6a595b6e849af/src/main/java/helper_classes/utils_other/TableColumnNameExtractor.java#L15
    Pattern.compile("\\w+\\.\\w+", Pattern.DOTALL),
    // https://github.com/Lydxn/Competitions-Practice/blob/266cdcaacae2ac92d836dc980d9dec8a93b70a85/DMOJ/regex1.java#L18
    Pattern.compile("\\b\\d\\d\\d\\d-\\d\\d-\\d\\d\\b"),
    // https://github.com/walterYangana/parcialCinco/blob/d3f99537c32a37553bbb624e1e842c308659fc1f/app/src/main/java/com/univalle/parcialcinco/Login.java#L181
    Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[correounivalle]+(\\.[edu]+)*(\\.[co]{2,4})$"),
    // https://github.com/Elic0de/Parkour-master/blob/bcd1dce8d8a19eae4c07bad2dd60478ae13b002c/src/main/java/elicode/parkour/user/StatusBoard.java#L34
    Pattern.compile("^[^!-~｡-ﾟ]+$"),
    // https://github.com/Elic0de/Parkour-master/blob/bcd1dce8d8a19eae4c07bad2dd60478ae13b002c/src/main/java/elicode/parkour/parkour/Parkour.java#L23
    Pattern.compile("(?i)§[0-9a-fA-F]"),
    // https://github.com/Elic0de/Parkour-master/blob/bcd1dce8d8a19eae4c07bad2dd60478ae13b002c/src/main/java/elicode/parkour/command/parkour/ParkourSettingCommand.java#L25
    Pattern.compile("^((2[0-4]\\d|25[0-5]|1\\d{1,2}|[1-9]\\d|\\d)( ?, ?)){2}(2[0-4]\\d|25[0-5]|1\\d{1,2}|[1-9]\\d|\\d)"),
    // https://github.com/Elic0de/Parkour-master/blob/bcd1dce8d8a19eae4c07bad2dd60478ae13b002c/src/main/java/elicode/parkour/command/parkour/ParkourSettingCommand.java#L26
    Pattern.compile("[0-9]{1,8},[0-9]{1,8}"),
    // https://github.com/isunican/AppGasolinerasGrupo4/blob/92d5cc55f007878de4adcd320de53e87090de11f/AndroidProject/app/src/main/java/com/isunican/proyectobase/presenter/PresenterVehiculos.java#L110
    Pattern.compile("[0-9]{4}+[A-Z]{3}"),
    // https://github.com/dtlexi/spring-reader/blob/ed24d35ca7655504174286a7c6c24b81a9f499f6/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java#L80
    Pattern.compile("\\{[^/]+?}"),
    // https://github.com/dtlexi/spring-reader/blob/ed24d35ca7655504174286a7c6c24b81a9f499f6/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java#L644
    Pattern.compile("\\?|\\*|\\{((?:\\{[^/]+?}|[^/{}]|\\\\[{}])+?)}"),
    // https://github.com/zhengyin/test/blob/63e8fb74c3b2d8f32b14539ce756d7474f842086/test-other/src/main/java/com/izhengyin/test/other/test/PatternTest.java#L12
    Pattern.compile("$$enhancerbyspringcglib$$\\w+\\."),
    // https://github.com/zhengyin/test/blob/63e8fb74c3b2d8f32b14539ce756d7474f842086/test-other/src/main/java/com/izhengyin/test/other/test/PatternTest.java#L13
    Pattern.compile("\\$\\$enhancerbyspringcglib\\$\\$\\w+"),
    // https://github.com/googleapis/google-api-java-client-services/blob/0d450e8b30fb56fb10eb2ef4d4615acd8bafa17f/clients/google-api-services-admob/v1/1.31.0/com/google/api/services/admob/v1/AdMob.java#L177
    Pattern.compile("^accounts/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/92e6dc6ce62d270b70bcd0a557adc1d8ffa8f8ef/clients/google-api-services-area120tables/v1alpha1/1.31.0/com/google/api/services/area120tables/v1alpha1/Area120Tables.java#L177
    Pattern.compile("^tables/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/92e6dc6ce62d270b70bcd0a557adc1d8ffa8f8ef/clients/google-api-services-area120tables/v1alpha1/1.31.0/com/google/api/services/area120tables/v1alpha1/Area120Tables.java#L903
    Pattern.compile("^tables/[^/]+/rows/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/92e6dc6ce62d270b70bcd0a557adc1d8ffa8f8ef/clients/google-api-services-area120tables/v1alpha1/1.31.0/com/google/api/services/area120tables/v1alpha1/Area120Tables.java#L1587
    Pattern.compile("^workspaces/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-cloudbilling/v1/1.31.0/com/google/api/services/cloudbilling/Cloudbilling.java#L288
    Pattern.compile("^billingAccounts/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-cloudbilling/v1/1.31.0/com/google/api/services/cloudbilling/Cloudbilling.java#L2000
    Pattern.compile("^services/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-chat/v1/1.31.0/com/google/api/services/chat/v1/HangoutsChat.java#L355
    Pattern.compile("^spaces/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-chat/v1/1.31.0/com/google/api/services/chat/v1/HangoutsChat.java#L664
    Pattern.compile("^spaces/[^/]+/members/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-chat/v1/1.31.0/com/google/api/services/chat/v1/HangoutsChat.java#L1184
    Pattern.compile("^spaces/[^/]+/messages/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-chat/v1/1.31.0/com/google/api/services/chat/v1/HangoutsChat.java#L1650
    Pattern.compile("^spaces/[^/]+/messages/[^/]+/attachments/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-assuredworkloads/v1/1.31.0/com/google/api/services/assuredworkloads/v1/Assuredworkloads.java#L218
    Pattern.compile("^organizations/[^/]+/locations/[^/]+/operations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-assuredworkloads/v1/1.31.0/com/google/api/services/assuredworkloads/v1/Assuredworkloads.java#L363
    Pattern.compile("^organizations/[^/]+/locations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-assuredworkloads/v1/1.31.0/com/google/api/services/assuredworkloads/v1/Assuredworkloads.java#L747
    Pattern.compile("^organizations/[^/]+/locations/[^/]+/workloads/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L651
    Pattern.compile("^accounts/[^/]+/dataSharingSettings$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L2164
    Pattern.compile("^accounts/[^/]+/userLinks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L2881
    Pattern.compile("^properties/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L3717
    Pattern.compile("^properties/[^/]+/androidAppDataStreams/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L4527
    Pattern.compile("^properties/[^/]+/firebaseLinks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L5102
    Pattern.compile("^properties/[^/]+/googleAdsLinks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L5736
    Pattern.compile("^properties/[^/]+/iosAppDataStreams/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L7321
    Pattern.compile("^properties/[^/]+/userLinks/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L8070
    Pattern.compile("^properties/[^/]+/webDataStreams/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L8367
    Pattern.compile("^properties/[^/]+/webDataStreams/[^/]+/enhancedMeasurementSettings$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/bc288b0c96895a462f2ac8db4333c719b4e3e4b3/clients/google-api-services-analyticsadmin/v1alpha/1.31.0/com/google/api/services/analyticsadmin/v1alpha/GoogleAnalyticsAdmin.java#L8522
    Pattern.compile("^properties/[^/]+/webDataStreams/[^/]+/globalSiteTag$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L203
    Pattern.compile("^projects/[^/]+/dataSources/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L1066
    Pattern.compile("^projects/[^/]+/locations/[^/]+/dataSources/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L1833
    Pattern.compile("^projects/[^/]+/locations/[^/]+/transferConfigs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L2935
    Pattern.compile("^projects/[^/]+/locations/[^/]+/transferConfigs/[^/]+/runs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L3984
    Pattern.compile("^projects/[^/]+/transferConfigs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-bigquerydatatransfer/v1/1.31.0/com/google/api/services/bigquerydatatransfer/v1/BigQueryDataTransfer.java#L5086
    Pattern.compile("^projects/[^/]+/transferConfigs/[^/]+/runs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-apigateway/v1beta/1.31.0/com/google/api/services/apigateway/v1beta/Apigateway.java#L695
    Pattern.compile("^projects/[^/]+/locations/[^/]+/apis/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-apigateway/v1beta/1.31.0/com/google/api/services/apigateway/v1beta/Apigateway.java#L1983
    Pattern.compile("^projects/[^/]+/locations/[^/]+/apis/[^/]+/configs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-apigateway/v1beta/1.31.0/com/google/api/services/apigateway/v1beta/Apigateway.java#L3297
    Pattern.compile("^projects/[^/]+/locations/[^/]+/gateways/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L346
    Pattern.compile("^customers/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L487
    Pattern.compile("^customers/[^/]+/configurations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L1259
    Pattern.compile("^customers/[^/]+/devices/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L2251
    Pattern.compile("^partners/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L3081
    Pattern.compile("^partners/[^/]+/devices/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-androiddeviceprovisioning/v1/1.31.0/com/google/api/services/androiddeviceprovisioning/v1/AndroidProvisioningPartner.java#L3958
    Pattern.compile("^partners/[^/]+/vendors/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/47265ef09ca00316e1b11ca7c14b6e15faa6fe2e/clients/google-api-services-adexperiencereport/v1/1.31.0/com/google/api/services/adexperiencereport/v1/AdExperienceReport.java#L178
    Pattern.compile("^sites/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-analyticsdata/v1alpha/1.31.0/com/google/api/services/analyticsdata/v1alpha/AnalyticsData.java#L189
    Pattern.compile("^properties/[^/]+/metadata$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-adsensehost/v4.1/1.31.0/com/google/api/services/adsensehost/AdSenseHost.java#L1715
    Pattern.compile("\\d{4}-\\d{2}-\\d{2}|(today|startOfMonth|startOfYear)(([\\-\\+]\\d+[dwmy]){0,3}?)"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-adsensehost/v4.1/1.31.0/com/google/api/services/adsensehost/AdSenseHost.java#L1721
    Pattern.compile("[a-zA-Z_]+"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-adsensehost/v4.1/1.31.0/com/google/api/services/adsensehost/AdSenseHost.java#L1724
    Pattern.compile("[a-zA-Z_]+(==|=@).+"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-adsensehost/v4.1/1.31.0/com/google/api/services/adsensehost/AdSenseHost.java#L1733
    Pattern.compile("(\\+|-)?[a-zA-Z_]+"),
    // https://github.com/googleapis/google-api-java-client-services/blob/1105e506b7c1e55bd05131331d304b986447dd39/clients/google-api-services-adsense/v1.4/1.31.0/com/google/api/services/adsense/AdSense.java#L2400
    Pattern.compile("\\d{4}-\\d{2}-\\d{2}|(today|startOfMonth|startOfYear)(([\\-\\+]\\d+[dwmy]){0,3}?)|(latest-(\\d{2})-(\\d{2})(-\\d+y)?)|(latest-latest-(\\d{2})(-\\d+m)?)"),
    // https://github.com/medal003/learnfremwork/blob/fc7793cf61aaab66e30880cadb897a4745d787e9/src/test/java/com/example/learnfremwork/LearnfremworkApplicationTests.java#L16
    Pattern.compile("(?<=(\\()|(,))\\d+"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L182
    Pattern.compile("^folders/[^/]+/accessApprovalSettings$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L660
    Pattern.compile("^folders/[^/]+/approvalRequests/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L1312
    Pattern.compile("^organizations/[^/]+/accessApprovalSettings$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L1790
    Pattern.compile("^organizations/[^/]+/approvalRequests/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L2442
    Pattern.compile("^projects/[^/]+/accessApprovalSettings$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/81e2a6698f5f960ae493c0acdefe830514531bf5/clients/google-api-services-accessapproval/v1/1.31.0/com/google/api/services/accessapproval/v1/AccessApproval.java#L2920
    Pattern.compile("^projects/[^/]+/approvalRequests/[^/]+$"),
    // https://github.com/atp-mipt/jsyntrax/blob/4ca79decf441cba9ab67928935c57efdd33a348c/jsyntrax/src/main/java/org/atpfivt/jsyntrax/styles/NodeTokenStyle.java#L11
    Pattern.compile("."),
    // https://github.com/atp-mipt/jsyntrax/blob/4ca79decf441cba9ab67928935c57efdd33a348c/jsyntrax/src/main/java/org/atpfivt/jsyntrax/styles/NodeHexStyle.java#L11
    Pattern.compile("^\\w"),
    // https://github.com/atp-mipt/jsyntrax/blob/4ca79decf441cba9ab67928935c57efdd33a348c/jsyntrax/src/main/java/org/atpfivt/jsyntrax/styles/NodeBoxStyle.java#L10
    Pattern.compile("^/"),
    // https://github.com/saiprakash774/Userregistration/blob/33ca8b01235c6da18ebe0380b950118bd1789eea/UserRegistration.java#L15
    Pattern.compile("^[A-Z][a-z]{2,}$"),
    // https://github.com/saiprakash774/Userregistration/blob/33ca8b01235c6da18ebe0380b950118bd1789eea/UserRegistration.java#L24
    Pattern.compile("^[a-zA-Z]+([\\d\\.\\+\\-][0-9a-zA-z]+)*@[\\da-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})*$"),
    // https://github.com/saiprakash774/Userregistration/blob/33ca8b01235c6da18ebe0380b950118bd1789eea/UserRegistration.java#L33
    Pattern.compile("^(\\d{2}( )?)?[6-9]{1}\\d{9}$"),
    // https://github.com/saiprakash774/Userregistration/blob/33ca8b01235c6da18ebe0380b950118bd1789eea/UserRegistration.java#L42
    Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$"),
    // https://github.com/Euraxluo/ProjectPractice/blob/56bff10148850355dc6777b7518e4441512448a0/java/admin(%20jdbc%2Bservlet%2Bjsp%2Bajax%2BSmantic-UI)/src/com/lailelaodi/util/TextUtils.java#L97
    Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(14[5,7])| (17[0,1,3,5-8]))\\d{8}$"),
    // https://github.com/fabioz/Pydev/blob/7108abd388bb4f0ad5162f49578c7d1f25c0d4ab/plugins/com.python.pydev.analysis/src/com/python/pydev/analysis/mypy/MypyAnalysis.java#L362
    Pattern.compile("\\A\\s*(.*)\\s*\\:\\s*(\\d+)\\s*\\:\\s*(\\d+)\\s*\\:\\s*(\\w+)\\s*\\:\\s*(.*)\\Z"),
    // https://github.com/fabioz/Pydev/blob/7108abd388bb4f0ad5162f49578c7d1f25c0d4ab/plugins/com.python.pydev.analysis/src/com/python/pydev/analysis/mypy/MypyAnalysis.java#L372
    Pattern.compile("\\A\\s*(.*)\\s*\\:\\s*(\\d+)()\\s*\\:\\s*(\\w+)\\s*\\:\\s*(.*)\\Z"),
    // https://github.com/UNICORE-EU/workflow/blob/d46f0fc0501a8e0443b3a4f27dfb908d9bffda2c/workflow-server/src/main/java/eu/unicore/workflow/pe/iterators/Iteration.java#L132
    Pattern.compile("\\$\\{\\w*\\}"),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/streamhtmlparser/util/HtmlUtils.java#L72
    Pattern.compile("^\\s*\\d*\\s*;\\s*URL\\s*=\\s*[\'\"]?", Pattern.CASE_INSENSITIVE),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/syntax/StructuralWhitespaceStripper.java#L102
    Pattern.compile("[^\\S\\n]*"),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/syntax/StructuralWhitespaceStripper.java#L110
    Pattern.compile("^[^\\S\\n]*\\n"),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/syntax/StructuralWhitespaceStripper.java#L115
    Pattern.compile("\\n[^\\S\\n]*$"),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/syntax/StructuralWhitespaceStripper.java#L122
    Pattern.compile("^[^\\S\\n]*\\n(.*)$", Pattern.DOTALL),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/syntax/StructuralWhitespaceStripper.java#L130
    Pattern.compile("^(.*?)[^\\S\\n]*$", Pattern.DOTALL),
    // https://github.com/suraj0955/aosp4/blob/2000b0791a99dc85e04ff72735cefe76b0ec9c99/external/jsilver/src/com/google/clearsilver/jsilver/functions/html/TextHtmlFunction.java#L56
    Pattern.compile("([^]\\[@:;<>\\\"()\\s\\p{Cntrl}]+@[-+a-zA-Z0-9]+\\.[-+a-zA-Z0-9\\.]+[-+a-zA-Z0-9])|((?:http|https|ftp|mailto):[^\\s>\"]*)|(www\\.[-a-z0-9\\.]+[^\\s;\">]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/suraj0955/aosp4/blob/d4984983306b2132bd62d55b02df8fd2c3a561a2/external/jmonkeyengine/engine/src/core/com/jme3/font/ColorTags.java#L17
    Pattern.compile("\\\\#([0-9a-fA-F]{8})#|\\\\#([0-9a-fA-F]{6})#|\\\\#([0-9a-fA-F]{4})#|\\\\#([0-9a-fA-F]{3})#"),
    // https://github.com/project-ncl/dependency-analysis/blob/f9d3d5ed5c3b973c16ea4405ccb915d9dde47e39/common/src/main/java/org/jboss/da/common/version/VersionParser.java#L15
    Pattern.compile("^((?<major>[0-9]{1,9})?(\\.(?<minor>[0-9]{1,9})(\\.$|[.-](?<micro>[0-9]{1,9}))?)?)([.-]?(?<qualifier>.+?))??([.-]redhat-(?<suffixversion>[0-9]{1,9}))?$"),
    // https://github.com/project-ncl/dependency-analysis/blob/f9d3d5ed5c3b973c16ea4405ccb915d9dde47e39/common/src/main/java/org/jboss/da/common/version/VersionParser.java#L33
    Pattern.compile("^((?<major>[0-9]{1,9})?(\\.(?<minor>[0-9]{1,9})(\\.$|[.-](?<micro>[0-9]{1,9}))?)?)([.-]?(?<qualifier>.+?))?$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L271
    Pattern.compile("(?:((?:[\"][^\"]+[\"])|(?:[`][^`]+[`])|(?:['][^']+['])|(?:[\\w]+))\\s*\\.\\s*)?((?:[\"][^\"]+[\"])|(?:[`][^`]+[`])|(?:['][^']+['])|(?:[\\w]+))$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L548
    Pattern.compile("^(?is)(\\bselect\\b).........*?(\\bfrom\\b)(.*)$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L604
    Pattern.compile("(?:(;\\s*(\\n\\r?|$))|(\\n\\r?([ \\t\\r]*\\n\\r?)+))", Pattern.DOTALL),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L606
    Pattern.compile("(?:(;\\s*(\\n\\r?|$)))", Pattern.DOTALL),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L647
    Pattern.compile("(\\n\\s*)$", Pattern.DOTALL),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L748
    Pattern.compile("((?:\\n(?: |\\t|\\r)*?)) ?\\\\([ \\t\\r]*)(?=\\n)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L747
    Pattern.compile("((?:(?:;(?: |\\t|\\r)*?(?:--[^\\n]*)?))) ?\\\\([ \\t\\r]*\\n)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L746
    Pattern.compile("(?is)(;\\s*)+$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L178
    Pattern.compile("(\\s*/\\s*)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L1237
    Pattern.compile(";\\s*$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L1379
    Pattern.compile("^(?is)\\b(drop|create|alter|rename)\\b.*"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L1986
    Pattern.compile("\\n\\s*\\n"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2006
    Pattern.compile("(;\\s*)+$"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2130
    Pattern.compile("('([^']*'))|(/\\*.*?\\*/)|(\\-\\-.*?(\n|$))", Pattern.DOTALL),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2264
    Pattern.compile("\\n\\s*Position: ([0-9]+)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2284
    Pattern.compile("(?:(?:;( |\\t|\\r)*(?:--[^\\n]*)?)|(?:\\n( |\\t|\\r)*)) ?\\\\( |\\t|\\r)*\\n", Pattern.DOTALL),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2300
    Pattern.compile("((?:(?:;(?: |\\t|\\r)*(?:--[^\\n]*)?)))(\\n(\\r)?)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2301
    Pattern.compile("((?:(?:\\n(?: |\\t|\\r)*)))(?=\\n)"),
    // https://github.com/Wisser/Jailer/blob/785151b7c84ba5f234cf391c95141641fe5f2e56/src/main/gui/net/sf/jailer/ui/databrowser/sqlconsole/SQLConsole.java#L2302
    Pattern.compile("\\\\(\\s*)$"),
    // https://github.com/Zaederx/PatientHealthApp-v1.1/blob/ddd9b069e311191aff90d511c523995eeb4218ac/src/main/java/app/PatientHealthApp/services/UserServiceDetailsImpl.java#L290
    Pattern.compile("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$"),
    // https://github.com/Zaederx/PatientHealthApp-v1.1/blob/ddd9b069e311191aff90d511c523995eeb4218ac/src/main/java/app/PatientHealthApp/services/UserServiceDetailsImpl.java#L299
    Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/b58c99c998940f5ea6950500db67eb214b3a5e3f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/release/DiscogsReleaseEnricher.java#L20
    Pattern.compile("http(?:s?)://www\\.discogs\\.com/release/(?<id>\\d+)"),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/b58c99c998940f5ea6950500db67eb214b3a5e3f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/release/BandcampReleaseEnricher.java#L30
    Pattern.compile(".+\\.bandcamp\\.com"),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/b58c99c998940f5ea6950500db67eb214b3a5e3f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/release/AppleMusicReleaseEnricher.java#L34
    Pattern.compile("(?:itunes|music)\\.apple\\.com"),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/b58c99c998940f5ea6950500db67eb214b3a5e3f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/release/AppleMusicReleaseEnricher.java#L37
    Pattern.compile("(?<genre>.+).·.\\d+"),
    // https://github.com/gimral/MirrorMakerTest/blob/d96c2736840fe71d0ed81079c654a0e549e3ce77/src/test/java/mirrormaker/OffSetTest.java#L100
    Pattern.compile(".*topic-18e39925-4004-447b-bf68-02e2898918a6"),
    // https://github.com/nianq/noproblem/blob/4ddac219146a62f4b07380f3cae2363ab0e75207/commonsutils/src/main/java/com/gongj/noproblem/commonsutils/utils/MailUtil.java#L23
    Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"),
    // https://github.com/egovernments/DIGIT/blob/30868dd914e65d7cdba6079347ffdf03f77c3e16/core-services/egov-idgen/src/main/java/org/egov/id/service/IdGenerationService.java#L225
    Pattern.compile("\\[(.*?)\\]"),
    // https://github.com/egovernments/DIGIT/blob/30868dd914e65d7cdba6079347ffdf03f77c3e16/core-services/egov-idgen/src/main/java/org/egov/id/service/IdGenerationService.java#L360
    Pattern.compile("\\{(.*?)\\}"),
    // https://github.com/cimiko/Java/blob/4ea02e5423a6e00267b93a34c132aea1501dbca9/Exam/bootcamp-java-Exam2/src/main/java/co/g2academy/bootcamp/model/RegistrationModelValidator.java#L37
    Pattern.compile("^.(.+)@(.+)$"),
    // https://github.com/zhuyb0614/graph-batis/blob/ac793ea376ab1c75142851d129b9fd487484fb73/graph-batis-generator/src/main/java/org/zhuyb/graphbatis/cg/RenamePlugin.java#L17
    Pattern.compile("PrimaryKey"),
    // https://github.com/zhuyb0614/graph-batis/blob/ac793ea376ab1c75142851d129b9fd487484fb73/graph-batis-generator/src/main/java/org/zhuyb/graphbatis/cg/RenamePlugin.java#L18
    Pattern.compile("Mapper"),
    // https://github.com/zhuyb0614/graph-batis/blob/ac793ea376ab1c75142851d129b9fd487484fb73/graph-batis-generator/src/main/java/org/zhuyb/graphbatis/cg/RenamePlugin.java#L19
    Pattern.compile("Mapper.xml"),
    // https://github.com/wso2/wso2-synapse/blob/44317ca27a84b632655f4a6e8628531e8ba0859d/modules/core/src/main/java/org/apache/synapse/mediators/elementary/Target.java#L102
    Pattern.compile("'[^']*'"),
    // https://github.com/ythy/GIMG/blob/552bbfc2858811abe0719d9d86be7564eb7a8cc6/app/src/main/java/com/mx/gillustrated/util/CommonUtil.java#L622
    Pattern.compile("-?[0-9]+.?[0-9]+"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L30
    Pattern.compile("\'"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L38
    Pattern.compile("%00"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L44
    Pattern.compile("\\.\\./"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L45
    Pattern.compile("\\.\\.\\\\"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L46
    Pattern.compile("\\./"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L47
    Pattern.compile("%2F"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L77
    Pattern.compile("\\"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L78
    Pattern.compile("\\.\\."),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L99
    Pattern.compile("\\p{Space}"),
    // https://github.com/dasomel/seminar/blob/0bf2347c398b1fae13376670ce6afa21c411a98f/opdc/30th/source/src/main/java/egovframework/com/cmm/EgovWebUtil.java#L103
    Pattern.compile("|"),
    // https://github.com/hengjb/HelloJDKSrc/blob/9f88b8c1bf1740d5cdc3e7e1afa39f9aaa9429b8/myjdksrc/java/lang/ProcessImpl.java#L155
    Pattern.compile("[^\\s\"]+|\"[^\"]*\""),
    // https://github.com/hengjb/HelloJDKSrc/blob/9f88b8c1bf1740d5cdc3e7e1afa39f9aaa9429b8/myjdksrc/com/sun/security/auth/module/LdapLoginModule.java#L334
    Pattern.compile("\\{USERNAME\\}"),
    // https://github.com/codefootmen/doofi/blob/6ecefee2ef8db52ea7a6295f560a016b90cb5c20/src/main/java/utils/ClientValidationHelper.java#L40
    Pattern.compile("[^a-z]+"),
    // https://github.com/codefootmen/doofi/blob/6ecefee2ef8db52ea7a6295f560a016b90cb5c20/src/main/java/utils/ClientValidationHelper.java#L49
    Pattern.compile("[^0-9]+"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L203
    Pattern.compile("^1[3-9]\\d{9,10}$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L255
    Pattern.compile("((^[a|A][g|G][a-zA-Z0-9]{4,18}$)|(^1[3|4|5|7|8][0-9]{9}$))"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L278
    Pattern.compile("[a-zA-Z0-9]{8,10}"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L299
    Pattern.compile("[a-zA-Z0-9]{6,16}"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L380
    Pattern.compile("^[0-9]+$|^[0-9]+\\.[0-9]{1,2}$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L488
    Pattern.compile("[\u4e00-\u9fa5_a-zA-Z.·•▪·.]{2,20}"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L514
    Pattern.compile("^\\d{16,19}$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_Bet365/app/src/main/java/com/hgapp/bet365/common/util/HGCheck.java#L541
    Pattern.compile("^[\u4e00-\u9fa5_a-zA-Z]{2,20}$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_A07_NHG/commonliberary/src/main/java/com/nhg/common/util/Timber.java#L598
    Pattern.compile("(\\$\\d+)+$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_A07_NHG/app/src/main/java/com/nhg/xhg/homepage/push/ExampleUtil.java#L40
    Pattern.compile("^[+0-9][-0-9]{1,}$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_A07_NHG/app/src/main/java/com/nhg/xhg/homepage/push/ExampleUtil.java#L49
    Pattern.compile("^[\u4E00-\u9FA50-9a-zA-Z_!@#$&*+=.|]+$"),
    // https://github.com/chinalollipop/Android/blob/a41e7a271cb90ab2143e89a5f230ecad91ac9e7c/HGAPP_A07_NHG/app/src/main/java/com/nhg/xhg/homepage/push/ExampleUtil.java#L123
    Pattern.compile("[\\x20-\\x7E]+"),
    // https://github.com/Mentor-Media/MM_SERP_PDA/blob/3f19da1e72b8d970c58114f36b26117c535390ca/app/src/main/java/com/common/BasedActivity.java#L198
    Pattern.compile("^[a-f,A-F,0-9]*$"),
    // https://github.com/ErlendHer/StudIt/blob/ee2465d6086b73557f6871d26f6e1a44da25bf03/StudIt/core/src/main/java/studit/core/chatbot/InformationRequestExecutor.java#L260
    Pattern.compile("[a-zA-z]{2,4}\\d{4}"),
    // https://github.com/anj412/CoderExercise/blob/d0261ffea04c82ceb5c117c2098f205f1ef94c1a/src/main/java/ru/croc/coder/service/UserService.java#L27
    Pattern.compile("^[A-Za-z0-9-_]{3,16}$"),
    // https://github.com/anj412/CoderExercise/blob/d0261ffea04c82ceb5c117c2098f205f1ef94c1a/src/main/java/ru/croc/coder/service/UserService.java#L30
    Pattern.compile("^[A-Za-z0-9-_@#$%]{3,16}$"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L157
    Pattern.compile("ReturnStatus:(.*?),"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L243
    Pattern.compile("ReturnStatus=(.*?),"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L269
    Pattern.compile("MessageText=(.*?),"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L429
    Pattern.compile("__metadata:\\{[a-zA-Z0-9,':=\".()/_ -]*\\},"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L431
    Pattern.compile(":,"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L432
    Pattern.compile(":}"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L433
    Pattern.compile("<201 [a-zA-Z ]+,"),
    // https://github.com/mkitbs/ZAGA-WEB/blob/0e78cea3f3b2c4db8035974b086a07202429748b/work-order-service/src/main/java/org/mkgroup/zaga/workorderservice/service/SpentMaterialService.java#L434
    Pattern.compile(",\\[content[-a-zA-Z0-9,\". ;:_()'\\]<>]+"),
    // https://github.com/kocmoc1985/DBEraser/blob/adb05c628068448503075836fc5285554fcf4499/src/DatabaseBrowser/FQ.java#L560
    Pattern.compile("from\\s+(?:\\w+\\.)*(\\w+)($|\\s+[WHERE,JOIN,START\\s+WITH,ORDER\\s+BY,GROUP\\s+BY])", Pattern.CASE_INSENSITIVE),
    // https://github.com/IskanderMAATALLAH/app_de_gestion/blob/b9f776332eb327f5c7310cf3948a1b2597edc12a/src/Controle/Rapport.java#L187
    Pattern.compile("[0-9]*[1-9]+[0-9]*"),
    // https://github.com/IskanderMAATALLAH/app_de_gestion/blob/b9f776332eb327f5c7310cf3948a1b2597edc12a/src/Controle/Facture.java#L598
    Pattern.compile("[0][0-9]{9}"),
    // https://github.com/IskanderMAATALLAH/app_de_gestion/blob/b9f776332eb327f5c7310cf3948a1b2597edc12a/src/Controle/Facture.java#L673
    Pattern.compile("[^0-9]"),
    // https://github.com/IskanderMAATALLAH/app_de_gestion/blob/b9f776332eb327f5c7310cf3948a1b2597edc12a/src/Controle/Facture.java#L686
    Pattern.compile("[^0-9&&[^-]]"),
    // https://github.com/IskanderMAATALLAH/app_de_gestion/blob/b9f776332eb327f5c7310cf3948a1b2597edc12a/src/Controle/DetailCaisseEntr%C3%A9e.java#L282
    Pattern.compile("[^0-9&&[^.]]"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/NBTTagCompound.java#L36
    Pattern.compile("[A-Za-z0-9._+-]+"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L28
    Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L29
    Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L30
    Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L31
    Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L32
    Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L33
    Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/MojangsonParser.java#L34
    Pattern.compile("[-+]?(?:0|[1-9][0-9]*)"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/LocaleLanguage.java#L25
    Pattern.compile("%(\\d+\\$)?[\\d.]*[df]"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/FileUtils.java#L10
    Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/FileUtils.java#L11
    Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/EnumChatFormat.java#L22
    Pattern.compile("(?i)\u00a7[0-9A-FK-OR]"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/DedicatedServer.java#L28
    Pattern.compile("^[a-fA-F0-9]{40}$"),
    // https://github.com/JasonHoku/MauiMC/blob/d542662231272ef25d0f15ab9920920610ad8fcd/work/decompile-13da6e65/net/minecraft/server/BlockStateList.java#L30
    Pattern.compile("^[a-z0-9_]+$"),
    // https://github.com/argeo/argeo-slc/blob/0cf96d4a1398f506dea9170d8bee77259ec4d929/cms/org.argeo.slc.repo/src/org/eclipse/aether/repository/RemoteRepository.java#L28
    Pattern.compile("([^:/]+(:[^:/]{2,}+(?=://))?):(//([^@/]*@)?([^/:]+))?.*"),
    // https://github.com/argeo/argeo-slc/blob/0cf96d4a1398f506dea9170d8bee77259ec4d929/cms/org.argeo.slc.repo/src/org/eclipse/aether/artifact/DefaultArtifact.java#L64
    Pattern.compile("([^: ]+):([^: ]+)(:([^: ]*)(:([^: ]+))?)?:([^: ]+)"),
    // https://github.com/argeo/argeo-slc/blob/0cf96d4a1398f506dea9170d8bee77259ec4d929/cms/org.argeo.slc.repo/src/org/eclipse/aether/artifact/AbstractArtifact.java#L29
    Pattern.compile("^(.*-)?([0-9]{8}\\.[0-9]{6}-[0-9]+)$"),
    // https://github.com/argeo/argeo-slc/blob/0cf96d4a1398f506dea9170d8bee77259ec4d929/cms/org.argeo.slc.repo/src/org/argeo/slc/repo/maven/AetherUtils.java#L18
    Pattern.compile("^(.*-)?([0-9]{8}.[0-9]{6}-[0-9]+)$"),
    // https://github.com/cbonoz/covid20/blob/a9ea1984a9d4bca36ff308a8b9662216d2203087/Utils/src/main/java/com/amazon/android/utils/JsonHelper.java#L42
    Pattern.compile("\\/\\*(.*?|\n)\\*\\/"),
    // https://github.com/RockinChaos/ItemJoin/blob/6d0c78e160a92932f2d2f15087be24dd87835969/src/me/RockinChaos/itemjoin/utils/Utils.java#L516
    Pattern.compile("&#([A-Fa-f0-9]{6})"),
    // https://github.com/viljinsky/sensystem/blob/9d4707ecafbd798c2a0b7a0f4fa15f52dd09d954/src/ru/viljinsky/tcp/MainTCP.java#L50
    Pattern.compile("form-data"),
    // https://github.com/viljinsky/sensystem/blob/9d4707ecafbd798c2a0b7a0f4fa15f52dd09d954/src/ru/viljinsky/tcp/HttpRequest.java#L33
    Pattern.compile("(.+):(.*)"),
    // https://github.com/JetBrains/android/blob/c265b896cc251e7f5529df64c709071399aed984/android/src/com/android/tools/idea/gradle/util/GradleUtil.java#L114
    Pattern.compile("[012]\\..*"),
    // https://github.com/lcr2011/spring/blob/521f6de9ec997f955c24d7a6c2975a8b511deedb/spring-web/src/main/java/org/springframework/web/context/request/ServletWebRequest.java#L296
    Pattern.compile("^W/"),
    // https://github.com/CrabProgrammer/JavaTP/blob/00f5866cc1aa9783eee30e56602327139611f3a9/javaTasks6/src/com/company/Main.java#L149
    Pattern.compile("rgb\\(\\d+,\\d+,\\d+\\)"),
    // https://github.com/Fumapps/poly-hamster-simulator/blob/b11802c93c20098d9a18d7c971b6756761698f45/de.unistuttgart.iste.sqa.mpw.modeling.generator/src/template/properties/PropertyUtils.java#L7
    Pattern.compile("[\\w]+(\\.[\\w]+)+(\\(\\))?"),
    // https://github.com/Fumapps/poly-hamster-simulator/blob/b11802c93c20098d9a18d7c971b6756761698f45/de.unistuttgart.iste.sqa.mpw.modeling.generator/src/template/properties/PropertyUtils.java#L10
    Pattern.compile("(\\(\\w+)\\.(class::\\w+\\))"),
    // https://github.com/Fumapps/poly-hamster-simulator/blob/b11802c93c20098d9a18d7c971b6756761698f45/de.unistuttgart.iste.sqa.mpw.modeling.generator/src/template/properties/PropertyUtils.java#L30
    Pattern.compile("(\\(\\w+)\\_(class::\\w+\\))"),
    // https://github.com/Fumapps/poly-hamster-simulator/blob/b11802c93c20098d9a18d7c971b6756761698f45/de.unistuttgart.iste.sqa.mpw.modeling.generator/src/template/properties/PropertyUtils.java#L45
    Pattern.compile("is[A-Z0-9].*"),
    // https://github.com/belaban/jgroups-raft/blob/095bfefd05c0bb4d2d968f952f74ccbf48a69049/src/org/jgroups/protocols/raft/RAFT.java#L993
    Pattern.compile("\\s*([^=\\s]+)\\s*=\\s*([^=\\s,]+)\\s*,?"),
    // https://github.com/inkarnadin/cms-check-component/blob/6a031d008ce533a33756a5593d566e408f339064/src/main/java/web/db/phpmyadmin/PhpMyAdminVersionProcessor.java#L38
    Pattern.compile("<title>.*phpMyAdmin\\s(.*?)\\s"),
    // https://github.com/inkarnadin/cms-check-component/blob/6a031d008ce533a33756a5593d566e408f339064/src/main/java/web/cms/drupal/DrupalCheckProcessor.java#L39
    Pattern.compile("misc/drupal\\.js"),
    // https://github.com/inkarnadin/cms-check-component/blob/6a031d008ce533a33756a5593d566e408f339064/src/main/java/web/cms/datalife/DataLifeCheckProcessor.java#L50
    Pattern.compile("engine/classes/js/dle_js\\.js"),
    // https://github.com/vansmoe/hello-java/blob/27f863c1c8de1832b04d99a85b37849ea5c118bc/src/Main.java#L253
    Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}, EUR=[0-9]\\.[0-9]"),
    // https://github.com/Elyar-cr7/codeHome/blob/26e06fa3183c914b932bb44750c21af9806d2051/myProject-common/src/main/java/cn/elyar/myProject/utils/StringUtils.java#L255
    Pattern.compile("[\\u4e00-\\u9fa5]+"),
    // https://github.com/Elyar-cr7/codeHome/blob/26e06fa3183c914b932bb44750c21af9806d2051/myProject-common/src/main/java/cn/elyar/myProject/utils/StringUtils.java#L305
    Pattern.compile("((((0?[0-9])|([1][0-9])|([2][0-4]))\\:([0-5]?[0-9])))?$"),
    // https://github.com/Elyar-cr7/codeHome/blob/26e06fa3183c914b932bb44750c21af9806d2051/myProject-common/src/main/java/cn/elyar/myProject/utils/StringUtils.java#L311
    Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1][0-9])|([2][0-4]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/hoster/K2SApi.java#L82
    Pattern.compile("(([1-2])?([0-9])?([0-9])\\.([1-2])?([0-9])?([0-9])\\.([1-2])?([0-9])?([0-9])\\.([1-2])?([0-9])?([0-9]))", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/hoster/K2SApi.java#L1006
    Pattern.compile("\\}$"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/hoster/K2SApi.java#L1270
    Pattern.compile("[\\d\\.]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L63
    Pattern.compile("https?://(www\\.|m\\.)?api\\.soundcloud\\.com/playlists/\\d+(?:\\?|.*?&)secret_token=[A-Za-z0-9\\-_]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L64
    Pattern.compile("https?://(www\\.|m\\.)?api\\.soundcloud\\.com/tracks/\\d+(\\?secret_token=[A-Za-z0-9\\-_]+)?"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L65
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/sets/[A-Za-z0-9\\-_]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L66
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/sets"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L67
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/[A-Za-z0-9\\-_]+/sets"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L68
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/likes"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L69
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/repost"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L70
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/groups/[A-Za-z0-9\\-_]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L73
    Pattern.compile("https?://snd\\.sc/[A-Za-z0-9]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L233
    Pattern.compile("://(www|m)\\."),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L233
    Pattern.compile("(/download|\\\\)"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L62
    Pattern.compile("https?://(www\\.)?soundcloud\\.com/(you|tour|signup|logout|login|premium|messages|settings|imprint|community\\-guidelines|videos|terms\\-of\\-use|sounds|jobs|press|mobile|#?search|upload|people|dashboard|#/)($|/.*?)"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L72
    Pattern.compile("https?://(m\\.)?soundcloud\\.com/[A-Za-z0-9\\-_]+/[A-Za-z0-9\\-_]+\\?fb_action_ids=.+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L288
    Pattern.compile("https?://[^/]+/[^/]+/sets/[^/]+/s-[A-Za-z0-9]+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L718
    Pattern.compile(".*?soundcloud\\.com/[a-z\\-_0-9]+/(tracks|favorites)(\\?page=\\d+)?"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L718
    Pattern.compile("[^?]+/groups/.*"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L718
    Pattern.compile("[^?]+/sets.*"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L724
    Pattern.compile(".*?soundcloud\\.com(/[A-Za-z\\-_0-9]+){2,3}/?(\\?.+)?"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/plugins/decrypter/SoundCloudComDecrypter.java#L834
    Pattern.compile("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2} \\+\\d+"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L358
    Pattern.compile("(?U)[_]"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L358
    Pattern.compile("(?U)[^\\w]"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L1012
    Pattern.compile("(.+?)(/|\\\\)+$"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L1057
    Pattern.compile("\\.(html?|php)$"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L1696
    Pattern.compile("^linkcollector.*?\\.zip$", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L2083
    Pattern.compile("(\\d+)(?:_(\\d+))?|extraInfo", Pattern.CASE_INSENSITIVE),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L2176
    Pattern.compile("^(/+|\\\\+)"),
    // https://github.com/mirror/jdownloader/blob/3af2098cd2276c3d554126ff4ad1452ea4c1ac6f/src/jd/controlling/linkcollector/LinkCollector.java#L2724
    Pattern.compile(".*\\.(php|aspx)$"),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L48
    Pattern.compile("^!--(.*)--$", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L50
    Pattern.compile("^/([a-z0-9]+)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L51
    Pattern.compile("^([a-z0-9]+)(.*?)(/?)$", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L52
    Pattern.compile("([a-z0-9]+)=([\"'])(.*?)\\2", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L53
    Pattern.compile("([a-z0-9]+)(=)([^\"\\s']+)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/xss/HTMLFilter.java#L54
    Pattern.compile("^([^:]+):", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/3cQScbrOnlyOne/platform/blob/544dcc91b1131dccf820293e13bd0fc667cd1892/platform-common/src/main/java/com/platform/utils/StringUtils.java#L151
    Pattern.compile("-?\\d+"),
    // https://github.com/selyu/commands/blob/5b23c00dece7005bb97696a4f7f330343876398c/core/src/main/java/org/selyu/commands/core/provider/impl/EnumProvider.java#L15
    Pattern.compile("[^A-Za-z0-9]"),
    // https://github.com/Starlight-tanxin/codebase/blob/e1f42acd1c3ba3511a40bdaa73fc397d740fcc4d/study-nio/src/main/java/com/tx/study/netty/echo/TestMain.java#L19
    Pattern.compile("<img src=\"([^\"]+?)\" />"),
    // https://github.com/Starlight-tanxin/codebase/blob/e1f42acd1c3ba3511a40bdaa73fc397d740fcc4d/study-nio/src/main/java/com/tx/study/netty/echo/TestMain.java#L32
    Pattern.compile("(\\d\\d\\d\\d)-(0[1-9]|1[012])"),
    // https://github.com/gaodingsong/myself/blob/d9fc099ab243dd58e39c5ae3a4e07765e7144323/src/main/java/com/example/validation/InputCheckUtil.java#L212
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？ ]"),
    // https://github.com/gaodingsong/myself/blob/d9fc099ab243dd58e39c5ae3a4e07765e7144323/src/main/java/com/example/validation/InputCheckUtil.java#L225
    Pattern.compile("[1-9][0-9]?"),
    // https://github.com/liangQAQ/cloudpush/blob/fc2e461fef8a781fe7d8d849314189e3d50b3324/cloudpush-api/src/main/java/com/huangliang/api/util/NetUtils.java#L48
    Pattern.compile("^\\d{1,3}(\\.\\d{1,3}){3}\\:\\d{1,5}$"),
    // https://github.com/liangQAQ/cloudpush/blob/fc2e461fef8a781fe7d8d849314189e3d50b3324/cloudpush-api/src/main/java/com/huangliang/api/util/NetUtils.java#L50
    Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3,5}$"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L12
    Pattern.compile("I"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L18
    Pattern.compile("^abcDee"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L23
    Pattern.compile("^hello"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L25
    Pattern.compile("abcDeeF12Ghhiiiijkl99z"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L27
    Pattern.compile("ijkl99z$"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L28
    Pattern.compile("[aei]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L30
    Pattern.compile("[aei][Fj]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L31
    Pattern.compile("[Hh]arry"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L35
    Pattern.compile("[^ej]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L36
    Pattern.compile("[abcdef345678]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L37
    Pattern.compile("[a-fA-F3-8]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L38
    Pattern.compile("(?i)[a-f3-8]"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L41
    Pattern.compile("\\D"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L50
    Pattern.compile("\\w"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L53
    Pattern.compile("\\b"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L56
    Pattern.compile("^abcDe{2}"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L57
    Pattern.compile("^abcDe+"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L59
    Pattern.compile("^abcDe*"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L62
    Pattern.compile("^abcDe{2,5}"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L63
    Pattern.compile("h+i*j"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L72
    Pattern.compile("(<h2>)"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L84
    Pattern.compile("(<h2>.*?</h2>)"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L97
    Pattern.compile("(<h2>)(.+?)(</h2>)"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L105
    Pattern.compile("[H|h]arry"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L110
    Pattern.compile("t(?!v)"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L125
    Pattern.compile("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"),
    // https://github.com/Tarun-Uppal/Java-Udemy/blob/ebda2f03e69fbbca4610b9cc8dee8756d76be355/Section%2017/RegularExpressions/src/com/company/Main.java#L136
    Pattern.compile("^4[0-9]{12}([0-9]{3})?$"),
    // https://github.com/pig-mesh/pig/blob/0c7a679bfa333d8b60cb76bd64712935266a5cf7/pig-register/src/main/java/com/alibaba/nacos/controller/NamespaceController.java#L56
    Pattern.compile("^[\\w-]+"),
    // https://github.com/jeisi/BerettaCommitTool2/blob/22997a6c83fafac48cc44666be53fa9765c687bb/src/main/java/com/xrea/jeisi/berettacommittool2/gitthread/GitStatusCommand.java#L79
    Pattern.compile("^(.)(.) (.+)( -> (.+))?"),
    // https://github.com/jeisi/BerettaCommitTool2/blob/22997a6c83fafac48cc44666be53fa9765c687bb/src/main/java/com/xrea/jeisi/berettacommittool2/gitthread/BaseSingleGitCommand.java#L62
    Pattern.compile("(.+) doesn't exist."),
    // https://github.com/jeisi/BerettaCommitTool2/blob/22997a6c83fafac48cc44666be53fa9765c687bb/src/main/java/com/xrea/jeisi/berettacommittool2/JUtility.java#L32
    Pattern.compile("^([A-Za-z]:|~)?/.*"),
    // https://github.com/guyferguson/scan_only/blob/4bc4ee8859b7cef63b8bf76b081bf0ffaed101f1/prunedata/src/main/java/com/example/prunedata/repository/model/SearchResultsModel.java#L170
    Pattern.compile("(\\d*\\.?\\d+)\\s?(\\w+)"),
    // https://github.com/guyferguson/scan_only/blob/4bc4ee8859b7cef63b8bf76b081bf0ffaed101f1/prunedata/src/main/java/com/example/prunedata/repository/model/ApiResponse.java#L20
    Pattern.compile("<([^>]*)>[\\s]*;[\\s]*rel=\"([a-zA-Z0-9]+)\""),
    // https://github.com/guyferguson/scan_only/blob/4bc4ee8859b7cef63b8bf76b081bf0ffaed101f1/prunedata/src/main/java/com/example/prunedata/repository/model/ApiResponse.java#L21
    Pattern.compile("\\bpage=(\\d+)"),
    // https://github.com/falcon-computing/blaze/blob/1237bdcbbce5d768df494923af6363d63733fdfa/spark-1.5.1/examples/src/main/java/org/apache/spark/examples/JavaLogQuery.java#L58
    Pattern.compile("^([\\d.]+) (\\S+) (\\S+) \\[([\\w\\d:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) ([\\d\\-]+) \"([^\"]+)\" \"([^\"]+)\".*"),
    // https://github.com/OpenAPITools/openapi-generator/blob/3f75691da200c20764a860ae8eae9b7b458c6e62/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/PythonClientCodegen.java#L870
    Pattern.compile("^['\"].*?['\"]$"),
    // https://github.com/OpenAPITools/openapi-generator/blob/3f75691da200c20764a860ae8eae9b7b458c6e62/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/PythonClientCodegen.java#L1014
    Pattern.compile("^/?(.+?)/?.?$"),
    // https://github.com/izaanjahangir/instagram-clone-android-java/blob/67255dcc6cca4a9da121b6fc7cb1d39457c0dc88/app/src/main/java/com/izaan/instagramclone/SignupActivity.java#L93
    Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/jdeps/DotFileTest.java#L220
    Pattern.compile("(.*) -> +([^ ]*) (.*)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/jdeps/Basic.java#L194
    Pattern.compile(".*\r?\n"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/jdeps/Basic.java#L195
    Pattern.compile("\\s+ -> (\\S+) +(.*)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javap/T7004698.java#L48
    Pattern.compile("[0-9a-f, ]+//[-0-9a-z:, ]+"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javap/T7004698.java#L49
    Pattern.compile("(^$|[A-Z][A-Za-z0-9_]+:.*|})"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/net/WifiKey.java#L38
    Pattern.compile("(\".*\")|(0x[\\p{XDigit}]+)", Pattern.DOTALL),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/net/WifiKey.java#L41
    Pattern.compile("([\\p{XDigit}]{2}:){5}[\\p{XDigit}]{2}"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/net/UrlQuerySanitizer.java#L842
    Pattern.compile("[+%]"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/net/Proxy.java#L84
    Pattern.compile("^$|^[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*)*$"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/net/Proxy.java#L91
    Pattern.compile("^$|^[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*(,[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*)*$"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/database/sqlite/SQLiteQueryBuilder.java#L56
    Pattern.compile("(?i)(AVG|COUNT|MAX|MIN|SUM|TOTAL|GROUP_CONCAT)\\((.+)\\)"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/android/database/sqlite/SQLiteDatabaseConfiguration.java#L47
    Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+"),
    // https://github.com/CoboVault/cobo-vault-cold/blob/7f9f4a68c367dc9db714ddf7c1485175d7cd0a3b/app/src/main/java/com/cobo/cold/viewmodel/ElectrumViewModel.java#L71
    Pattern.compile("^signed_[0-9a-fA-F]{8}.txn$"),
    // https://github.com/dysen2014/MeHttp/blob/02ba8b38a98b6af050dbfc3a6faa718f65968048/Http/src/main/java/com/dysen/mehttp/util/CharacterHandler.java#L33
    Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/util/TextUrl.java#L31
    Pattern.compile("(http|https)://[a-z0-9A-Z%-]+(\\.[a-z0-9A-Z%-]+)+(:\\d{1,5})?(/[a-zA-Z0-9-_~:#@!&',;=%/\\*\\.\\?\\+\\$\\[\\]\\(\\)]+)?/?"),
    // https://github.com/philong1995/Module4/blob/822b5b1a7096cbecf02bf95127198a289491e11c/02_Spring_Controller/practice/email_validation/src/main/java/com/example/controller/EmailController.java#L18
    Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L95
    Pattern.compile("^/([^/{}\n\t]+)/([^/{}\n\t]+)$"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L101
    Pattern.compile("(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(\\.\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*)"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L103
    Pattern.compile("Array<(.*)>"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L105
    Pattern.compile("\\{ \\[key: string\\]: (.*); \\}"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L107
    Pattern.compile("^(string|number|boolean)"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/generator/VaadinConnectTsGenerator.java#L798
    Pattern.compile("^(?!(\\./|\\.|/))"),
    // https://github.com/vaadin/flow/blob/af83fa6165f1e3f427b483a7d6a781c152f82aa7/flow-server/src/main/java/com/vaadin/flow/server/connect/EndpointNameChecker.java#L55
    Pattern.compile(".*[\\s+].*"),
    // https://github.com/camelya58/materials-for-lectures/blob/a386f91e43367145eb0fe26bb05525f2a9fcded8/src/module02/lesson8_associations/Regex.java#L47
    Pattern.compile("\\p{Punct}"),
    // https://github.com/camelya58/materials-for-lectures/blob/a386f91e43367145eb0fe26bb05525f2a9fcded8/src/module02/lesson8_associations/Regex.java#L51
    Pattern.compile("\\bcat\\b"),
    // https://github.com/camelya58/materials-for-lectures/blob/a386f91e43367145eb0fe26bb05525f2a9fcded8/src/module02/lesson8_associations/Regex.java#L60
    Pattern.compile("\\Bcat\\B"),
    // https://github.com/camelya58/materials-for-lectures/blob/a386f91e43367145eb0fe26bb05525f2a9fcded8/src/module02/lesson8_associations/Regex.java#L77
    Pattern.compile("^\\+?[78][-(]?\\d{3}\\)?-?\\d{3}-?\\d{2}-?\\d{2}$"),
    // https://github.com/camelya58/materials-for-lectures/blob/a386f91e43367145eb0fe26bb05525f2a9fcded8/src/module02/lesson8_associations/Regex.java#L85
    Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])[A-Za-z\\d]{8}$"),
    // https://github.com/SouhardyaDas/GitDemoProject/blob/f39018c7f91f8917754795d7c324be8fb826913d/SeleniumProject/src/testngPack/Login.java#L26
    Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&-]+)@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"),
    // https://github.com/openequella/openEQUELLA/blob/2aca361ac168953307bd9a662b72459fa8765521/Source/Plugins/Core/com.equella.core/src/com/tle/core/imagemagick/ImageMagickServiceImpl.java#L240
    Pattern.compile(".*?(\\d+)x(\\d+).*?", Pattern.DOTALL),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L12
    Pattern.compile("-|\\+|="),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L14
    Pattern.compile("(\\/[a-zA-Z]+)|(([\\+-] )?([a-zA-Z]+|[0-9]+)( [\\+\\-=] ([a-zA-Z]+|[0-9]+))*)"),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L56
    Pattern.compile("\\/.*"),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L85
    Pattern.compile("\\++"),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L86
    Pattern.compile("(--){1,}-"),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L87
    Pattern.compile("(--)+"),
    // https://github.com/smathog/Hyperskill-Projects/blob/fca894a99990b2b9a252cfb3ac47926adafb3a05/Java%20Projects/Smart%20Calculator%20(Hard)/Stage%206/Calculator.java#L89
    Pattern.compile("=+"),
    // https://github.com/jnomada/AndroidStudioProjects/blob/d097e45f43c263dbf2804bd7d53e0324168419f8/GuessTheCelebrity/app/src/main/java/myapp/jsealey/guessthecelebrity/MainActivity.java#L145
    Pattern.compile("jpg\" alt=\"(.*?)\""),
    // https://github.com/jnomada/AndroidStudioProjects/blob/d097e45f43c263dbf2804bd7d53e0324168419f8/GuessTheCelebrity/app/src/main/java/myapp/jsealey/guessthecelebrity/MainActivity.java#L149
    Pattern.compile("<img onerror=\"ImageLoadError[(]this[)]\" src=\"(.*?)\""),
    // https://github.com/hasancbngl/myOldJavaCodes/blob/2f1d21dd41e2ca0aab93a0ea0a4ac8086216a8aa/stringManipulation.java#L40
    Pattern.compile("src=\"(.*?)\" d"),
    // https://github.com/blakbro2k/YokelTowersMVC/blob/134959af43582499c636afc64ce105276ad8c6e9/core/src/main/java/net/asg/games/utils/Log4LibGDXLogger.java#L24
    Pattern.compile("\\{[0-9]*}"),
    // https://github.com/rubionestor611/COP3330_rubio/blob/ae618c5f2939efff95f687ce8858d9ce30bdf034/rubio_p5/src/ContactItem.java#L71
    Pattern.compile("^(.+)@(.+).(.+)$"),
    // https://github.com/RalfBarkow/dmx-platform/blob/49fe78b5f2b345a870bce7addd0fcfc5c90bf26b/modules/dmx-files/src/main/java/systems/dmx/files/FilesPlugin.java#L69
    Pattern.compile("([A-Z]:)?\\/"),
    // https://github.com/RalfBarkow/dmx-platform/blob/49fe78b5f2b345a870bce7addd0fcfc5c90bf26b/modules/dmx-files/src/main/java/systems/dmx/files/FilesPlugin.java#L71
    Pattern.compile("/workspace-(\\d+).*"),
    // https://github.com/RalfBarkow/dmx-platform/blob/49fe78b5f2b345a870bce7addd0fcfc5c90bf26b/modules/dmx-files/src/main/java/systems/dmx/files/FilesPlugin.java#L894
    Pattern.compile("[A-Z]:.*"),
    // https://github.com/vi-teofilo/sistema/blob/bac6f6cdd24dc119c25e9cdac772a00a3c089f26/src/br/com/vitoria/sistema/util/Valida.java#L57
    Pattern.compile("^(([a-zA-Z ]|[���������])*)$"),
    // https://github.com/abfahr/efa220oh/blob/c52eee48bf2bd00e6a2828ae9e853211dbfd425d/src/de/nmichael/efa/gui/EfaBoathouseFrame.java#L997
    Pattern.compile("\\D*(\\d\\d*)x(\\d*).*"),
    // https://github.com/logreposit/logreposit-api/blob/12d956da56d07382fa20222fd18a4b3cf5f564e2/src/test/java/com/logreposit/logrepositapi/rest/controllers/IngressV2ControllerDataInsertionTests.java#L75
    Pattern.compile("^Data was accepted for processing in [0-9]+ milliseconds\\.$"),
    // https://github.com/bcgov/moh-keycloak-user-management/blob/402023decbce6fda915a223b84d0e8f2ce510580/backend/src/main/java/ca/bc/gov/hlth/mohums/controller/UsersController.java#L115
    Pattern.compile(".*/users/(.{8}-.{4}-.{4}-.{4}-.{12})"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javap/DescriptorTest.java#L51
    Pattern.compile("\\Qprivate E();\\E\\s+\\Qdescriptor: (Ljava/lang/String;I)V\\E"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javadoc/doclint/DocLintTest.java#L189
    Pattern.compile("[\r\n]+"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javadoc/doclint/DocLintTest.java#L215
    Pattern.compile("^(Building|Constructing|Generating|Loading|Standard|Starting| ) .*"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javadoc/doclint/DocLintTest.java#L216
    Pattern.compile("^([1-9]+) (error|warning)(s?)"),
    // https://github.com/kb-1000/jdk8u_langtools_upstream/blob/e9f2c59bf3c1fb0e2625c7c32c498dfeec2c95ea/test/tools/javadoc/TestScriptInComment.java#L128
    Pattern.compile("(?i)(<html>)?.*?(?:package ([a-z]+);.*?(?:class ([a-z]+).*)?)?"),
    // https://github.com/kielhong/crawler/blob/1131c968f4b83a9701169c83bdb54aea94846fd2/src/main/java/com/mhk/crawler/service/LezhinCrawlerService.java#L158
    Pattern.compile("product: (\\{.+\\})"),
    // https://github.com/William3365/Android/blob/ea499d24267b413a9e22f29ae852ff92e0aa6771/Project08/app/src/main/java/com/gizwits/opensource/appkit/MessageCenter.java#L73
    Pattern.compile("(^[a-zA-Z0-9\\-]{1,}\\.[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}\\:(\\d){1,}\\&(\\d){1,}$)|(^[a-zA-Z0-9\\-]{1,}\\.[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}$)"),
    // https://github.com/William3365/Android/blob/ea499d24267b413a9e22f29ae852ff92e0aa6771/Project08/app/src/main/java/com/gizwits/opensource/appkit/MessageCenter.java#L74
    Pattern.compile("(^([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}\\:(\\d){1,}\\&(\\d){1,}$)|(^([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$)"),
    // https://github.com/weibin268/my-autocode/blob/31df12a2f436b5cbc26e5e6def9eb8502c6f2252/my-autocode/src/main/java/com/zhuang/autocode/AutoCodeBuilder.java#L26
    Pattern.compile("(?<=\\{)[^\\{\\}]+(?=\\})"),
    // https://github.com/Editscode/HandleMobile/blob/deb53a647071c5351c334a274cba9de089ce91a7/app/src/main/java/com/healbe/healbe_example_andorid/enter/LoginFragment.java#L173
    Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"),
    // https://github.com/chengdb421/origins-asr-engine/blob/fc6ba81f9343825338cf25561d07a56f334db499/src/test/java/com/origins/qc/RegTest.java#L34
    Pattern.compile("(妈的)|(你妈)"),
    // https://github.com/JakeWa/Community-duty/blob/8eea212264af7fc4da7011bf151bb9416a75b459/ruoyi-system/src/main/java/com/ruoyi/system/service/impl/StaffServiceImpl.java#L142
    Pattern.compile("^(1[3-9]\\d{9}$)"),
    // https://github.com/CreateBy1995/study/blob/1291ef4c35331c2898c149d24eaca7cb2d0923b0/source-code/kafka/kafka2.0/clients/src/main/java/org/apache/kafka/common/utils/Sanitizer.java#L46
    Pattern.compile("[\\w-%\\. \t]*"),
    // https://github.com/CreateBy1995/study/blob/1291ef4c35331c2898c149d24eaca7cb2d0923b0/source-code/kafka/kafka2.0/clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerScopeUtils.java#L31
    Pattern.compile("[\\x23-\\x5B\\x5D-\\x7E\\x21]+"),
    // https://github.com/CreateBy1995/study/blob/1291ef4c35331c2898c149d24eaca7cb2d0923b0/source-code/kafka/kafka2.0/clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerClientInitialResponse.java#L35
    Pattern.compile("(?<scheme>[\\w]+)[ ]+(?<token>[-_\\.a-zA-Z0-9]+)"),
    // https://github.com/CreateBy1995/study/blob/1291ef4c35331c2898c149d24eaca7cb2d0923b0/source-code/kafka/kafka2.0/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosShortNamer.java#L36
    Pattern.compile("((DEFAULT)|((RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?(s/([^/]*)/([^/]*)/(g)?)?/?(L)?)))"),
    // https://github.com/CreateBy1995/study/blob/1291ef4c35331c2898c149d24eaca7cb2d0923b0/source-code/kafka/kafka2.0/clients/src/main/java/org/apache/kafka/common/config/ConfigTransformer.java#L56
    Pattern.compile("\\$\\{([^}]*?):(([^}]*?):)?([^}]*?)\\}"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/logging/log4j/core/layout/Rfc5424Layout.java#L78
    Pattern.compile("\\r?\\n"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/logging/log4j/core/layout/Rfc5424Layout.java#L82
    Pattern.compile("[\\\"\\]\\\\]"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/logging/log4j/core/appender/rolling/action/Duration.java#L67
    Pattern.compile("P?(?:([0-9]+)D)?(T?(?:([0-9]+)H)?(?:([0-9]+)M)?(?:([0-9]+)?S)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/logging/log4j/core/appender/rolling/FileSize.java#L42
    Pattern.compile("([0-9]+([\\.,][0-9]+)?)\\s*(|K|M|G)B?", Pattern.CASE_INSENSITIVE),
    // https://github.com/RohieOS/frameworks_opt_net_wifi/blob/ce3388b9684112aa47b80c0fbc460f2d4a33c195/service/java/com/android/server/wifi/SupplicantStaNetworkHal.java#L77
    Pattern.compile(":([0-9a-fA-F]+):([0-9a-fA-F]+)"),
    // https://github.com/RohieOS/frameworks_opt_net_wifi/blob/ce3388b9684112aa47b80c0fbc460f2d4a33c195/service/java/com/android/server/wifi/SupplicantStaNetworkHal.java#L83
    Pattern.compile("^:([0-9a-fA-F]+):([0-9a-fA-F]+):([0-9a-fA-F]+)$"),
    // https://github.com/RohieOS/frameworks_opt_net_wifi/blob/ce3388b9684112aa47b80c0fbc460f2d4a33c195/service/java/com/android/server/wifi/SupplicantStaNetworkHal.java#L89
    Pattern.compile("^:([0-9a-fA-F]+)$"),
    // https://github.com/RohieOS/frameworks_opt_net_wifi/blob/ce3388b9684112aa47b80c0fbc460f2d4a33c195/service/java/com/android/server/wifi/SupplicantStaIfaceHal.java#L101
    Pattern.compile("^(\\d{1,2})-([0-9a-fA-F]{8})-(\\d{1,2})$"),
    // https://github.com/vkmanojk/Orion/blob/5991aedfe70be0273cdf5f3768800785e18a1215/src/com/orion/user/UserRegistration.java#L74
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}$"),
    // https://github.com/ImSejin/lezhin-comics-downloader/blob/28ac00f223bae137029468ce4926b324b64042f8/src/main/java/io/github/imsejin/lzcodl/common/constant/URIs.java#L56
    Pattern.compile("\\{(.+?)}", Pattern.MULTILINE),
    // https://github.com/B-Mirzababaei/My-Conversational-Agent/blob/891f8c33b54c0f1634a58a0c178a3c24b1a8f918/Rebo4aiAgent/src/rebo4AI/MessageAnnotator/PostProcessAnnotations.java#L84
    Pattern.compile(" ( )+"),
    // https://github.com/B-Mirzababaei/My-Conversational-Agent/blob/891f8c33b54c0f1634a58a0c178a3c24b1a8f918/Rebo4aiAgent/src/rebo4AI/MessageAnnotator/PostProcessAnnotations.java#L93
    Pattern.compile("[^a-z ]"),
    // https://github.com/B-Mirzababaei/My-Conversational-Agent/blob/891f8c33b54c0f1634a58a0c178a3c24b1a8f918/Rebo4aiAgent/src/rebo4AI/MessageAnnotator/PostProcessAnnotations.java#L205
    Pattern.compile("([.\":,\\[\\]\\{\\}_\\\\\\/;\\-\\)\\(!?])"),
    // https://github.com/programmingwang/zzyglxt/blob/db30d0e62f14c01a751ab669b7eee9aaf51fc911/src/main/java/com/zyyglxt/util/MobileUtil.java#L23
    Pattern.compile("(?:^(?:\\+86)?1(?:3[4-9]|4[78]|5[0-27-9]|78|8[2-478]|98)\\d{8}$)|(?:^(?:\\+86)?1440\\d{7}$)|(?:^(?:\\+86)?170[356]\\d{7}$)"),
    // https://github.com/programmingwang/zzyglxt/blob/db30d0e62f14c01a751ab669b7eee9aaf51fc911/src/main/java/com/zyyglxt/util/MobileUtil.java#L17
    Pattern.compile("(?:^(?:\\+86)?1(?:3[0-2]|4[56]|5[56]|66|7[156]|8[56])\\d{8}$)|(?:^(?:\\+86)?170[47-9]\\d{7}$)"),
    // https://github.com/programmingwang/zzyglxt/blob/db30d0e62f14c01a751ab669b7eee9aaf51fc911/src/main/java/com/zyyglxt/util/MobileUtil.java#L12
    Pattern.compile("(?:^(?:\\+86)?1(?:33|49|53|7[37]|8[019]|99)\\d{8}$)|(?:^(?:\\+86)?1349\\d{7}$)|(?:^(?:\\+86)?1410\\d{7}$)|(?:^(?:\\+86)?170[0-2]\\d{7}$)"),
    // https://github.com/programmingwang/zzyglxt/blob/db30d0e62f14c01a751ab669b7eee9aaf51fc911/src/main/java/com/zyyglxt/util/MobileUtil.java#L96
    Pattern.compile("(\\d{3})\\d{4}(\\d{4})"),
    // https://github.com/programmingwang/zzyglxt/blob/db30d0e62f14c01a751ab669b7eee9aaf51fc911/src/main/java/com/zyyglxt/util/IDUtil.java#L138
    Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$"),
    // https://github.com/leksiq/java-contest-assistant/blob/51c79811fbd96cc5520377088788b434d4b700f8/src/net/leksi/contest/Preprocessor.java#L64
    Pattern.compile("^Compiled\\s+from\\s+\"([^.]+\\.java)\"$"),
    // https://github.com/leksiq/java-contest-assistant/blob/51c79811fbd96cc5520377088788b434d4b700f8/src/net/leksi/contest/Preprocessor.java#L65
    Pattern.compile("^Code:$"),
    // https://github.com/leksiq/java-contest-assistant/blob/51c79811fbd96cc5520377088788b434d4b700f8/src/net/leksi/contest/Preprocessor.java#L66
    Pattern.compile("(?:I|J|D|F|Z|C|V)+"),
    // https://github.com/leksiq/java-contest-assistant/blob/51c79811fbd96cc5520377088788b434d4b700f8/src/net/leksi/contest/Preprocessor.java#L67
    Pattern.compile("(?:public(?:\\s|$)+static|static(?:\\s|$)+public)(?:\\s|$)+void(?:\\s|$)+(main)(?:\\s|$)*\\(", Pattern.MULTILINE),
    // https://github.com/leksiq/java-contest-assistant/blob/51c79811fbd96cc5520377088788b434d4b700f8/src/net/leksi/contest/Preprocessor.java#L68
    Pattern.compile("(?:\\s|$)*(_+main)(?:\\s|$)*\\(", Pattern.MULTILINE),
    // https://github.com/trafka-katrin/academy/blob/9daee3e69938e7ecd97fa8405d35f88e42243a14/src/by/academy/home_work/HW_deal/validators/Date_validator.java#L22
    Pattern.compile("^(0(?=[1-9])|1|2|3(?=[01]))\\d(\\/(?!\\d{2}-)|-(?!\\d{2}\\/))(0(?=[1-9])|1(?=[012]))\\d[/-](1(?=9)|2(?=0))[90][\\d]{2}$"),
    // https://github.com/trafka-katrin/academy/blob/9daee3e69938e7ecd97fa8405d35f88e42243a14/src/by/academy/home_work/HW_deal/validators/Date_validator.java#L40
    Pattern.compile("[\\d]{2}-[\\d]{2}-[\\d]{4}"),
    // https://github.com/bhagyashribende/NeoQuant/blob/0bf1b565cae92489ad0f84fc383f04ac437c9538/QuizZz-master/src/test/java/jorge/rv/QuizZz/integration/utils/MailHelper.java#L19
    Pattern.compile(".*http://localhost:8080(.*)((\r\n)|(\n)).*"),
    // https://github.com/scireum/sirius-web/blob/0929cdf8f0e12f5d2d3062681319d2aeff3b6d33/src/test/java/sirius/tagliatelle/ReportBrokenTemplates.java#L64
    Pattern.compile(".*.pasta"),
    // https://github.com/scireum/sirius-web/blob/0929cdf8f0e12f5d2d3062681319d2aeff3b6d33/src/main/java/sirius/web/security/ScopeInfo.java#L397
    Pattern.compile("scope-conf/(.*?)\\.conf"),
    // https://github.com/scireum/sirius-web/blob/0929cdf8f0e12f5d2d3062681319d2aeff3b6d33/src/main/java/sirius/web/http/SendFile.java#L37
    Pattern.compile("bytes=(\\d+)?-(\\d+)?"),
    // https://github.com/wasylmowczan/file-comparator/blob/08366202a87e1788f27274d8af30bfb01764d001/src/main/java/com/wasylmowczan/matchers/excel/comparators/IgnoreCellComparator.java#L15
    Pattern.compile("^(\\w)(\\d)$"),
    // https://github.com/ipmpLiJiang/yb/blob/cb864c925eb0ebd00ba57668c125a8719c6d7441/backend/src/main/java/cc/mrbird/febs/com/controller/DataTypeHelpers.java#L63
    Pattern.compile("^[+-]?[0-9]+$"),
    // https://github.com/1115052994/HaobeiBuiness/blob/888afb16e36da3f9ac283ea714ff75d80f6860d8/buiness/src/main/java/com/netmi/workerbusiness/ui/dialog/Pay_Message_Dialog.java#L121
    Pattern.compile("[`~!#$%^&*()+=|{}':;',\\\\[\\\\]<>/?~！#￥%……&*（）——+|{}【】‘；：”“'。，、？]"),
    // https://github.com/Evervolv/android_frameworks_base/blob/4e8d6226883ed0fa9f479cc2163d0a86ec730348/core/java/android/os/FileUtils.java#L116
    Pattern.compile("[\\w%+,./=_-]+"),
    // https://github.com/Evervolv/android_frameworks_base/blob/4e8d6226883ed0fa9f479cc2163d0a86ec730348/core/java/android/nfc/cardemulation/CardEmulation.java#L54
    Pattern.compile("[0-9A-Fa-f]{10,32}\\*?\\#?"),
    // https://github.com/Evervolv/android_packages_providers_MediaProvider/blob/74f112ac4746f1cc905cf967916acd441b3a3649/src/com/android/providers/media/util/SQLiteQueryBuilder.java#L67
    Pattern.compile("(?i)(AVG|COUNT|MAX|MIN|SUM|TOTAL|GROUP_CONCAT|UNICODE)\\((.+)\\)"),
    // https://github.com/Evervolv/android_packages_providers_MediaProvider/blob/74f112ac4746f1cc905cf967916acd441b3a3649/src/com/android/providers/media/util/SQLiteQueryBuilder.java#L74
    Pattern.compile("(?i)%\\.(wmv|wm|wtv|asf|hls|mp4|m4v|mov|mp4v|3g2|3gp|3gp2|3gpp|mj2|qt|external|mov|asf|avi|divx|mpg|mpeg|mkv|webm|mk3d|mks|3gp|mpegts|ts|m2ts|m2t)"),
    // https://github.com/Evervolv/android_packages_providers_MediaProvider/blob/74f112ac4746f1cc905cf967916acd441b3a3649/src/com/android/providers/media/util/SQLiteQueryBuilder.java#L77
    Pattern.compile("(?i)%com\\.gopro\\.smarty%"),
    // https://github.com/Evervolv/android_packages_providers_MediaProvider/blob/74f112ac4746f1cc905cf967916acd441b3a3649/src/com/android/providers/media/util/SQLiteQueryBuilder.java#L80
    Pattern.compile("(?i)custom_[a-zA-Z]+"),
    // https://github.com/SmartUPDS/ETL-Controller/blob/dd4271f7ab5ffdbcc25506f6ccd65e2034c53c1a/src/main/java/com/smartupds/etlcontroller/etl/controller/impl/zeri/ZeriNormalizer.java#L151
    Pattern.compile("([0-9]*)\\/([0-9]*)\\.[a-zA-Z]*$"),
    // https://github.com/UNICORE-EU/unicorex/blob/46a98aa22dd5d884350d88d0f20d8eb1b55bb8ca/xnjs/src/main/java/de/fzj/unicore/xnjs/idb/GrounderImpl.java#L373
    Pattern.compile("\\s?(.*?)(\\$\\{?(\\w+)\\}?|%(\\w+?)%)(.*?)\\s*", Pattern.DOTALL),
    // https://github.com/UNICORE-EU/unicorex/blob/46a98aa22dd5d884350d88d0f20d8eb1b55bb8ca/uas-client/src/main/java/de/fzj/unicore/uas/json/Builder.java#L406
    Pattern.compile("(https||http)://(.*)/rest/core/storages/([^/]*)/files/(.*)"),
    // https://github.com/Gausus1/Family_Test/blob/0a499d531da31d8ef00c79a8a22dad851f5ef2c2/Family/src/main/java/IT/Entities/Gender2.java#L10
    Pattern.compile(".*(a)$"),
    // https://github.com/KnIfER/PolymPic/blob/a18c4fe3c23d60353804ec9273879f5b889dce76/ActivityLauncher/src/main/java/com/knziha/polymer/BrowserActivity.java#L167
    Pattern.compile("[\r\n|]"),
    // https://github.com/KnIfER/PolymPic/blob/a18c4fe3c23d60353804ec9273879f5b889dce76/ActivityLauncher/src/main/java/com/knziha/polymer/BrowserActivity.java#L583
    Pattern.compile("(([0-9]{1,3}\\.){3}[0-9]{1,3}):([0-9]?)(.*)"),
    // https://github.com/NO-7-term-of-Dr-tai-s-class/first/blob/36859263c7318be776d05e9ad52103a350755323/MentalhealthTestWechatWeb3/MentalhealthTestWechatWeb/src/main/java/com/MentalhealthTestWechatWeb/controller/baidu/ueditor/PathFormat.java#L24
    Pattern.compile("\\{([^\\}]+)\\}", Pattern.CASE_INSENSITIVE),
    // https://github.com/NO-7-term-of-Dr-tai-s-class/first/blob/36859263c7318be776d05e9ad52103a350755323/MentalhealthTestWechatWeb3/MentalhealthTestWechatWeb/src/main/java/com/MentalhealthTestWechatWeb/controller/baidu/ueditor/PathFormat.java#L67
    Pattern.compile("[\\/:*?\"<>|]"),
    // https://github.com/galasa-dev/managers/blob/ace3d97bb654b773e26b5420a9eca6ca5cdcc315/galasa-managers-parent/galasa-managers-cicsts-parent/dev.galasa.cicsts.cemt.manager/src/main/java/dev/galasa/cicsts/cemt/internal/CemtImpl.java#L31
    Pattern.compile("\\w*\\(\\s*[a-zA-z0-9]*\\s*\\)"),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.emc.bibtex/src/org/eclipse/epsilon/emc/bibtex/parser/BibtexPropertyValueCompleter.java#L59
    Pattern.compile("[^\\}]*"),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.emc.bibtex/src/org/eclipse/epsilon/emc/bibtex/parser/BibtexParser.java#L73
    Pattern.compile("@(\\w*)\\s*\\{(\\w*)([^@]*)"),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.emc.bibtex/src/org/eclipse/epsilon/emc/bibtex/parser/BibtexParser.java#L69
    Pattern.compile("(\\w*)\\s*=\\s*\\{([^\\}]*)\\}"),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.egl.engine/src/org/eclipse/epsilon/egl/formatter/language/LanguageFormatter.java#L39
    Pattern.compile("^", Pattern.MULTILINE),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.egl.engine/src/org/eclipse/epsilon/egl/formatter/language/JavaFormatter.java#L18
    Pattern.compile("\\{\\s*$", Pattern.MULTILINE),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.egl.engine/src/org/eclipse/epsilon/egl/formatter/language/JavaFormatter.java#L21
    Pattern.compile("^\\}", Pattern.MULTILINE),
    // https://github.com/Kieran-Thompson/EpsilonFork1/blob/53493f5e2a7bbe6ed324328077f17054557bf00f/plugins/org.eclipse.epsilon.common.dt.examples/src/org/eclipse/epsilon/common/dt/examples/WebGitFolder.java#L78
    Pattern.compile("href='(.*?)'"),
    // https://github.com/bowser0000/SkyblockMod/blob/016814851e46acdbc7a8fce44746eb67feef5905/src/main/java/me/Danker/TheMod.java#L964
    Pattern.compile("[^\\d]"),
    // https://github.com/bowser0000/SkyblockMod/blob/016814851e46acdbc7a8fce44746eb67feef5905/src/main/java/me/Danker/TheMod.java#L2577
    Pattern.compile(".*§c\\d.*"),
    // https://github.com/bowser0000/SkyblockMod/blob/016814851e46acdbc7a8fce44746eb67feef5905/src/main/java/me/Danker/TheMod.java#L2801
    Pattern.compile("\\[Lvl [\\d]{1,3}]"),
    // https://github.com/Shrunkie/Shadow-client/blob/78d365d5d6fa84998f03b66918713aeb48c1d2b7/src/minecraft/net/minecraft/src/NbtTagValue.java#L37
    Pattern.compile("^#[0-9a-f]{6}+$"),
    // https://github.com/Shrunkie/Shadow-client/blob/78d365d5d6fa84998f03b66918713aeb48c1d2b7/src/minecraft/net/minecraft/src/HttpPipelineConnection.java#L35
    Pattern.compile("^[a-zA-Z]+://.*"),
    // https://github.com/doveylovey/spring-framework-5.2.10.RELEASE/blob/ccb9402acb78644b134ceab5ca099333f5992d5d/spring-core/src/test/java/org/springframework/core/io/ClassPathResourceTests.java#L46
    Pattern.compile("^class path resource \\[(.+?)]$"),
    // https://github.com/rossonet/EdgeAgentAr4k/blob/1668e5252a256332dfc0b6fd90bb3edbdbefc574/ar4k-industrial/src/main/java/org/ar4k/agent/opcua/server/KeyStoreLoader.java#L29
    Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"),
    // https://github.com/fsancheztemprano/typescript-folding/blob/724e2f7db5929a35596193139467dfdc2a30020c/src/main/java/com/github/fsancheztemprano/typescriptfolding/TypescriptTreeStructureProvider.java#L17
    Pattern.compile("(.*)\\.(component|service|pipe|guard|directive)\\.(.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ug-dbg/mvn-npm-plugin/blob/17c625cb7ce436ac3a1f31f1898a382a8a8b8517/src/main/java/com/github/ug_dbg/AbstractMojo.java#L78
    Pattern.compile("([^\"]\\S*|\".+?\")\\s*"),
    // https://github.com/mogilka/kz.zvezdochet.export/blob/3a842985422e155657a3824a52c4fcb07a9c2b32/src/kz/zvezdochet/export/util/PDFUtil.java#L1109
    Pattern.compile("</li>"),
    // https://github.com/mogilka/kz.zvezdochet.export/blob/3a842985422e155657a3824a52c4fcb07a9c2b32/src/kz/zvezdochet/export/util/PDFUtil.java#L1109
    Pattern.compile("<li>"),
    // https://github.com/mogilka/kz.zvezdochet.export/blob/3a842985422e155657a3824a52c4fcb07a9c2b32/src/kz/zvezdochet/export/util/PDFUtil.java#L1110
    Pattern.compile("\\<.*?>"),
    // https://github.com/mogilka/kz.zvezdochet.export/blob/3a842985422e155657a3824a52c4fcb07a9c2b32/src/kz/zvezdochet/export/util/PDFUtil.java#L1187
    Pattern.compile("(?=(</p>))"),
    // https://github.com/Vrezer/AnimalScheltersApp/blob/3c89c52285ff4c19fdeaa41932167e66e933058b/app/src/main/java/com/example/animalscheltersapp/UserSettingsChangePassword.java#L131
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"),
    // https://github.com/JamFactoryInc/JamFacMod/blob/2f3764f415ec7730694fc7e43009b49fb09da868/Mod/build/tmp/expandedArchives/forge-1.16.3-34.1.0_mapped_snapshot_20200514-1.16-sources.jar_17c431d297a8751786c4d17c4408e346/net/minecraft/util/WorldOptimizer.java#L51
    Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$"),
    // https://github.com/JamFactoryInc/JamFacMod/blob/2f3764f415ec7730694fc7e43009b49fb09da868/Mod/build/tmp/expandedArchives/forge-1.16.3-34.1.0_mapped_snapshot_20200514-1.16-sources.jar_17c431d297a8751786c4d17c4408e346/net/minecraft/util/FileUtil.java#L15
    Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/JamFactoryInc/JamFacMod/blob/2f3764f415ec7730694fc7e43009b49fb09da868/Mod/build/tmp/expandedArchives/forge-1.16.3-34.1.0_mapped_snapshot_20200514-1.16-sources.jar_17c431d297a8751786c4d17c4408e346/net/minecraft/util/FileUtil.java#L24
    Pattern.compile("[./\"]"),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/xml/splitOnLines.java#L17
    Pattern.compile("(<[^/].+>)(.+?)?(<.+>)|(<.+[/]>)|(<[^/].+>)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/xml/XmlLexicalAnalyzer.java#L13
    Pattern.compile("(<[/].+[^/]>)|(<[^/].+[/]>)|(<[^/].*?[^/]>)"),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/text/Analysis/WordsLength.java#L18
    Pattern.compile("([^.]+)([!\\?.])"),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/text/Analysis/ParagraphSort.java#L18
    Pattern.compile("([^.]+\\?)|([^.]+!)|([^.]+\\.)"),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/text/Analysis/LexemeSort.java#L12
    Pattern.compile("[^.]+[.]"),
    // https://github.com/MikitaBrodau/Java/blob/e8f931026430c4a84f4796a051cc111f8c1120a7/text_Analysis/src/text/Analysis/LexemeSort.java#L23
    Pattern.compile("([^.\\s]+)"),
    // https://github.com/SiC42/GRAFS/blob/b13dcc2194e5b47fcb68e912609444db091dd435/grafs-dataset-setup/src/main/java/edu/leipzig/grafs/setup/kafka/AbstractProducer.java#L79
    Pattern.compile("^(.*):([\\d]{1,5})\\/([a-zA-Z0-9\\._\\-]+)$"),
    // https://github.com/SiC42/GRAFS/blob/b13dcc2194e5b47fcb68e912609444db091dd435/grafs-dataset-setup/src/main/java/edu/leipzig/grafs/setup/kafka/AbstractProducer.java#L87
    Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$"),
    // https://github.com/SiC42/GRAFS/blob/b13dcc2194e5b47fcb68e912609444db091dd435/grafs-dataset-setup/src/main/java/edu/leipzig/grafs/setup/kafka/AbstractProducer.java#L88
    Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"),
    // https://github.com/YanaKrukovska/system-programming/blob/140e8e689d2101bafefdcff841b0ebeb72233514/src/main/java/ua/edu/ukma/ykrukovska/PolishReverseNotation/Splitter.java#L11
    Pattern.compile("-?[0-9.]+|[A-Za-z]+|[-+*/()^,\\[\\]=]"),
    // https://github.com/badfic/phil-bot-java/blob/239374fd8720dc1725d19e631199c3f3225ea0b1/src/main/java/com/badfic/philbot/listeners/phil/swampy/SwampyCommand.java#L64
    Pattern.compile("\\b(nut|nice|simp|rep|daddy)\\b", Pattern.CASE_INSENSITIVE),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/core/java/android/os/Build.java#L1070
    Pattern.compile("(.*)\\/(.*)\\/(.*):(.*)\\/(.*)\\/(.*):(.*)\\/(.*)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-slingfeature-maven-plugin/src/main/java/org/apache/sling/feature/maven/mojos/ApisJarMojo.java#L375
    Pattern.compile("META-INF/maven/[^/]+/[^/]+/pom.properties"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-samples/org.apache.sling.graphql.samples.website/src/main/java/org/apache/sling/graphql/samples/website/tagresource/TagsResource.java#L48
    Pattern.compile("(\\w)+"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-validation-core/src/test/java/org/apache/sling/validation/impl/resourcemodel/ResourceValidationModelProviderImplTest.java#L136
    Pattern.compile(".*@validatingResourceType=\"([^\"]*)\".*"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-testing-sling-mock/core/src/main/java/org/apache/sling/testing/mock/sling/MockXSSAPIImpl.java#L36
    Pattern.compile("['\"]?auto['\"]?"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-testing-resourceresolver-mock/src/main/java/org/apache/sling/testing/resourceresolver/NamespaceMangler.java#L29
    Pattern.compile("/([^:/]+):"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-testing-resourceresolver-mock/src/main/java/org/apache/sling/testing/resourceresolver/NamespaceMangler.java#L30
    Pattern.compile("/_([^_/]+)_"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/graphics/java/android/graphics/Rect.java#L61
    Pattern.compile("(-?\\d+) (-?\\d+) (-?\\d+) (-?\\d+)"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/graphics/java/android/graphics/FontListParser.java#L114
    Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/google/android/util/AbstractMessageParser.java#L827
    Pattern.compile("(?i)http://video\\.google\\.[a-z0-9]+(?:\\.[a-z0-9]+)?/videoplay\\?.*?\\bdocid=(-?\\d+).*"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/google/android/util/AbstractMessageParser.java#L886
    Pattern.compile("(?i)http://(?:[a-z0-9]+\\.)?youtube\\.[a-z0-9]+(?:\\.[a-z0-9]+)?/watch\\?.*\\bv=([-_a-zA-Z0-9=]+).*"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/google/android/util/AbstractMessageParser.java#L972
    Pattern.compile("http://picasaweb.google.com/([^/?#&]+)/+((?!searchbrowse)[^/?#&]+)(?:/|/photo)?(?:\\?[^#]*)?(?:#(.*))?"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/google/android/util/AbstractMessageParser.java#L1036
    Pattern.compile("http://(?:www.)?flickr.com/photos/([^/?#&]+)/?([^/?#&]+)?/?.*"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/google/android/util/AbstractMessageParser.java#L1038
    Pattern.compile("http://(?:www.)?flickr.com/photos/([^/?#&]+)/(tags|sets)/([^/?#&]+)/?"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/server/BootReceiver.java#L100
    Pattern.compile("fs_stat,[^,]*/([^/,]+),(0x[0-9a-fA-F]+)"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/server/BootReceiver.java#L114
    Pattern.compile("powerctl_shutdown_time_ms:([0-9]+):([0-9]+)", Pattern.MULTILINE),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/server/BootReceiver.java#L102
    Pattern.compile("Pass ([1-9]E?):"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/server/BootReceiver.java#L104
    Pattern.compile("Inode [0-9]+ extent tree.*could be shorter"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/internal/widget/MessagingLayout.java#L74
    Pattern.compile("[\\p{C}\\p{Z}]"),
    // https://github.com/NurKeinNeid/frameworks_base/blob/de7b36ef86714912132897832441dcc64d6f316d/core/java/com/android/internal/widget/MessagingLayout.java#L76
    Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]"),
    // https://github.com/kieker-monitoring/kieker/blob/c06f7f11d89b9f5fd6a822975ec40881fba1ff70/kieker-monitoring/src/kieker/monitoring/core/signaturePattern/PatternParser.java#L616
    Pattern.compile("throws(\\s+)"),
    // https://github.com/ferryman-Li/test/blob/481474df1a0b85ea1c0cd9f0377d961453e92514/src/main/java/org/qnit/common/util/StringUtils.java#L49
    Pattern.compile("^\\w+$"),
    // https://github.com/ferryman-Li/test/blob/481474df1a0b85ea1c0cd9f0377d961453e92514/src/main/java/org/qnit/common/util/StringUtils.java#L60
    Pattern.compile("[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t"),
    // https://github.com/ferryman-Li/test/blob/481474df1a0b85ea1c0cd9f0377d961453e92514/src/main/java/org/qnit/common/util/StringUtils.java#L73
    Pattern.compile("^[A-Za-z]{1}[A-Za-z0-9]*$"),
    // https://github.com/SourceSources/SecobMod-clone/blob/0b1624ceb7b91eef368729d45de4580b1c4d6bb9/sp/src/thirdparty/protobuf-2.3.0/java/src/main/java/com/google/protobuf/TextFormat.java#L427
    Pattern.compile("(\\s|(#.*$))++", Pattern.MULTILINE),
    // https://github.com/SourceSources/SecobMod-clone/blob/0b1624ceb7b91eef368729d45de4580b1c4d6bb9/sp/src/thirdparty/protobuf-2.3.0/java/src/main/java/com/google/protobuf/TextFormat.java#L429
    Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|\'([^\'\n\\\\]|\\\\.)*+(\'|\\\\?$)", Pattern.MULTILINE),
    // https://github.com/SourceSources/SecobMod-clone/blob/0b1624ceb7b91eef368729d45de4580b1c4d6bb9/sp/src/thirdparty/protobuf-2.3.0/java/src/main/java/com/google/protobuf/TextFormat.java#L436
    Pattern.compile("-?inf(inity)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/SourceSources/SecobMod-clone/blob/0b1624ceb7b91eef368729d45de4580b1c4d6bb9/sp/src/thirdparty/protobuf-2.3.0/java/src/main/java/com/google/protobuf/TextFormat.java#L439
    Pattern.compile("-?inf(inity)?f?", Pattern.CASE_INSENSITIVE),
    // https://github.com/SourceSources/SecobMod-clone/blob/0b1624ceb7b91eef368729d45de4580b1c4d6bb9/sp/src/thirdparty/protobuf-2.3.0/java/src/main/java/com/google/protobuf/TextFormat.java#L442
    Pattern.compile("nanf?", Pattern.CASE_INSENSITIVE),
    // https://github.com/hissummer-mockserver/mockServer/blob/816e7023102bb9c559b9c72d1d52dfface47007d/src/main/java/com/hissummer/mockserver/mock/service/mockresponseconverters/CusotomVarReplacementConverterHandler.java#L35
    Pattern.compile("\\$\\{([^_]+?)\\}"),
    // https://github.com/hissummer-mockserver/mockServer/blob/816e7023102bb9c559b9c72d1d52dfface47007d/src/main/java/com/hissummer/mockserver/mock/service/mockresponseconverters/CusotomFunctionExecuteConverterHandler.java#L29
    Pattern.compile("\\$\\{__([a-zA-Z0-9]*)\\((.*?)\\)\\}"),
    // https://github.com/Xsardas665/JetBrains-Academy-Bulls-and-Cows/blob/7a5fd3a1c0743c42be02dbec1d86e68f08c4b5b6/src/bullscows/Game.java#L10
    Pattern.compile("[1-9]|[12][0-9]|3[0-6]"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L253
    Pattern.compile("@media[^{]+\\{([\\s\\S]+?\\})\\s*\\}"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L254
    Pattern.compile("~."),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L331
    Pattern.compile("background:url\\([\"'](.+?)[\"']\\)"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L348
    Pattern.compile("url\\([\"\'](.+?)[\"\']\\)"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L378
    Pattern.compile("(\\d+)\\s*px"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L440
    Pattern.compile("([+-]?\\d+|0)(px\\s|\\s)+(|([+-]?\\d+|0)(px|))"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L471
    Pattern.compile("([+-]?\\d+|0)(px\\s|\\s)+([+-]?\\d+|0)(px|)"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L473
    Pattern.compile("([+-]?\\d+|0)(%\\s|\\s)+([+-]?\\d+|0)(%|)"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L505
    Pattern.compile("([+-]?\\d+|0)\\/+([+-]?\\d+|0)(px|)"),
    // https://github.com/ccrama/Slide/blob/8925f2df9c2d12c9e580c3bc1a0b78a2fa0b6452/app/src/main/java/me/ccrama/redditslide/ImageFlairs.java#L646
    Pattern.compile("\\.flair-(\\w+)\\s*(\\{|\\,|\\:|)"),
    // https://github.com/Willian-Cueva/SistemaEdificio/blob/2a4c305a3b7315571fdda8f6f315432701dcf650/src/Vista/VentanaRegistrarPropietario.java#L399
    Pattern.compile("[A-Za-z0-9]+$"),
    // https://github.com/Willian-Cueva/SistemaEdificio/blob/2a4c305a3b7315571fdda8f6f315432701dcf650/src/Vista/VentanaAdministrador.java#L313
    Pattern.compile("[0-9]+$"),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/IpUtils.java#L164
    Pattern.compile("(10|172|192)\\.([0-1][0-9]{0,2}|[2][0-5]{0,2}|[3-9][0-9]{0,1})\\.([0-1][0-9]{0,2}|[2][0-5]{0,2}|[3-9][0-9]{0,1})\\.([0-1][0-9]{0,2}|[2][0-5]{0,2}|[3-9][0-9]{0,1})"),
    // https://github.com/Psylence0609/TrackAndTrigger/blob/47b62c5a536272c625fe55643fca72e264ac220f/app/src/main/java/com/example/trackandtrigger/PhoneNumber.java#L16
    Pattern.compile("^\\d{10}$"),
    // https://github.com/VafaTarighi/DataStructure/blob/f840e22ec8494f4f2fef12ad63dfc2a30dfe788d/src/main/java/mini_apps/SentenceReverser.java#L49
    Pattern.compile("\\w+|\\p{Punct}|\\s", Pattern.MULTILINE),
    // https://github.com/VafaTarighi/DataStructure/blob/f840e22ec8494f4f2fef12ad63dfc2a30dfe788d/src/main/java/calculator/Calculator.java#L81
    Pattern.compile("[^1^\\-×+÷/*()]|1\\(|\\)1|[^1)]\\)|\\([^1\\-(]|\\)\\(|[\\^\\-×+÷/*]{2,}"),
    // https://github.com/VafaTarighi/DataStructure/blob/f840e22ec8494f4f2fef12ad63dfc2a30dfe788d/src/main/java/calculator/Calculator.java#L117
    Pattern.compile("-\\("),
    // https://github.com/VafaTarighi/DataStructure/blob/f840e22ec8494f4f2fef12ad63dfc2a30dfe788d/src/main/java/calculator/Calculator.java#L119
    Pattern.compile("\\d+|\\D"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/pipe/modules/queryeditor/gui/EditPerformanceTreeNodeAction.java#L328
    Pattern.compile("^((((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+\\s*(\\<\\=|\\={2}|\\>\\=|>|<)\\s*\\s*((\\d+(\\.\\d+)?)|(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+)\\s*(\\s*(\\|{2}|\\&{2})\\s*(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+\\s*(\\<\\=|\\={2}|\\>\\=|>|<)\\s*\\s*((\\d+(\\.\\d+)?)|(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+)\\s*)*\\s*\\?\\s*\\s*((\\d+(\\.\\d+)?)|(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+)\\s*\\s*\\:\\s*\\s*((\\d+(\\.\\d+)?)|(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+)\\s*)+|(((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\)(\\s*[\\+\\-\\/\\*]\\s*((\\d+(\\.\\d+)?)\\s*[\\+\\-\\/\\*]\\s*)?#\\([\\w\\s]+\\))*)+$"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-ticket-decoder/src/main/java/com/armedia/caliente/cli/ticketdecoder/ExtractorLogic.java#L91
    Pattern.compile("^(?:([0-3]{1,4}):)?(?:([*]|[^*:@%]+)(?:%(.*?))?)?(?:@(old|new)(?:est)?)?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-ticket-decoder/src/main/java/com/armedia/caliente/cli/ticketdecoder/DctmTicketDecoder.java#L66
    Pattern.compile("^([^@]+)(?:@(.+))?$"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-query/src/main/java/com/armedia/caliente/cli/query/XmlResultsPersistor.java#L118
    Pattern.compile("^[\\w\\-\\.]+$"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-history/src/main/java/com/armedia/caliente/cli/history/History.java#L67
    Pattern.compile("^[0-9a-f]{16}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-datagen/src/main/java/com/armedia/caliente/cli/datagen/NodeGenerator.java#L98
    Pattern.compile("^dm[cir]?_.*$"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-datagen/src/main/java/com/armedia/caliente/cli/datagen/NodeGenerator.java#L99
    Pattern.compile("^[ria]_.*$"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/dctm-datagen/src/main/java/com/armedia/caliente/cli/datagen/DataGen.java#L72
    Pattern.compile("^([1-9][0-9]*)([mk]b?)?$", Pattern.CASE_INSENSITIVE),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/cli/caliente/src/main/java/com/armedia/caliente/cli/caliente/launcher/dctm/DqlQuery.java#L121
    Pattern.compile("(?:\\b(\\w+)\\b)"),
    // https://github.com/SSONI7/Allwell/blob/8564dbf11f6d27c83cdb224f36afa3f2b2003e57/AppiumTest/src/test/java/com/appium/base/HT_MyData_LovedOnes_AllWell_BasePage.java#L258
    Pattern.compile("\\d{10}"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/40fcb66590c535aab9c5b57ca1829a9e2a7d6dba/essentialprogramming-dash-fragmenter/src/main/java/com/helpers/DashHelper.java#L507
    Pattern.compile(".*[-_](.+)$"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/40fcb66590c535aab9c5b57ca1829a9e2a7d6dba/essentialprogramming-dash-fragmenter/src/main/java/com/dashfragmenter/trackoptions/InputOutputSelector.java#L39
    Pattern.compile("period-([0-9]+)"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/40fcb66590c535aab9c5b57ca1829a9e2a7d6dba/essentialprogramming-dash-fragmenter/src/main/java/com/dashfragmenter/trackoptions/InputOutputSelector.java#L234
    Pattern.compile("\\d+|\\.|\\s"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/40fcb66590c535aab9c5b57ca1829a9e2a7d6dba/essentialprogramming-dash-fragmenter/src/main/java/com/dashfragmenter/trackoptions/InputOutputHandler.java#L12
    Pattern.compile("(\\[.+\\])?([^\\[]+)(\\[.+\\])?"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/40fcb66590c535aab9c5b57ca1829a9e2a7d6dba/essentialprogramming-dash-fragmenter/src/main/java/com/dashfragmenter/trackoptions/InputOutputHandler.java#L13
    Pattern.compile("([^,\\[=]+)=([^,\\]]+)+"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/c646f5e409591c0b6752f7310eb2d5e8e909dfcd/essentialprogramming-util/src/main/java/com/util/web/URLHelper.java#L16
    Pattern.compile("([^\\s]+(\\.(?i)(png|jpeg|jpg|txt|doc|csv|pdf))$)"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/c646f5e409591c0b6752f7310eb2d5e8e909dfcd/essentialprogramming-mpd-parser/src/main/java/io/mpd/support/RatioDeserializer.java#L13
    Pattern.compile("^([0-9]*):([0-9]*)$"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/c646f5e409591c0b6752f7310eb2d5e8e909dfcd/essentialprogramming-mpd-parser/src/main/java/io/mpd/support/FrameRateDeserializer.java#L13
    Pattern.compile("^([0-9]+)(/[0-9]+)?$"),
    // https://github.com/essentialprogramming/MPEG-DASH/blob/c646f5e409591c0b6752f7310eb2d5e8e909dfcd/essentialprogramming-mpd-parser/src/main/java/io/mpd/support/DurationDeserializer.java#L21
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,12}))?S)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/jxnu-liguobin/cs-summary-reflection/blob/3d53880dc3d9ed96c54b6caca23a0175ba886c89/java-utils/src/main/java/io/github/dreamylost/utils/StringUtils.java#L344
    Pattern.compile("^[0-9]+"),
    // https://github.com/jxnu-liguobin/cs-summary-reflection/blob/3d53880dc3d9ed96c54b6caca23a0175ba886c89/java-utils/src/main/java/io/github/dreamylost/utils/StringUtils.java#L351
    Pattern.compile("[\\u4e00-\\u9fa5]"),
    // https://github.com/jxnu-liguobin/cs-summary-reflection/blob/3d53880dc3d9ed96c54b6caca23a0175ba886c89/java-utils/src/main/java/io/github/dreamylost/utils/StringUtils.java#L535
    Pattern.compile("^[1][3-8]\\d{9}$"),
    // https://github.com/eclipse-vertx/vert.x/blob/d7a63f739d017d93a591c6b811aeff558c436e7f/src/main/java/io/vertx/core/net/impl/KeyStoreHelper.java#L65
    Pattern.compile("-----BEGIN ([A-Z ]+)-----"),
    // https://github.com/eclipse-vertx/vert.x/blob/d7a63f739d017d93a591c6b811aeff558c436e7f/src/main/java/io/vertx/core/net/impl/KeyStoreHelper.java#L66
    Pattern.compile("-----END ([A-Z ]+)-----"),
    // https://github.com/AlexanderKnueppel/Skeditor/blob/92bd459b3c13d9fcfd0d1324efd1532da87b48a2/Plugins/de.tubs.skeditor/src/de/tubs/skeditor/synthesis/Requirement.java#L26
    Pattern.compile("([A-Za-z_]\\w*)"),
    // https://github.com/shiyi25928988/cortex/blob/4befcbe19977600860b237063adb8b52391cf5e1/src/main/java/org/cortex/ioc/ClassUtils.java#L176
    Pattern.compile("\\$[0-9][0-9]?[0-9]?$"),
    // https://github.com/scm-manager/scm-manager/blob/f390830e8343b52dff24de728fc7b232c3508e9e/scm-core/src/main/java/sonia/scm/repository/Branch.java#L50
    Pattern.compile("[\\w-,;\\]{}@&+=$#`|<>]([\\w-,;\\]{}@&+=$#`|<>/.]*[\\w-,;\\]{}@&+=$#`|<>])?"),
    // https://github.com/keycloak/keycloak/blob/833bf9864356abe6f2c9f672edf1438b8635f48c/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/arquillian/AuthServerTestEnricher.java#L482
    Pattern.compile("ERROR \\[|SEVERE \\[|Exception "),
    // https://github.com/keycloak/keycloak/blob/833bf9864356abe6f2c9f672edf1438b8635f48c/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/arquillian/AuthServerTestEnricher.java#L483
    Pattern.compile("Jetty ALPN support not found|org.keycloak.events"),
    // https://github.com/keycloak/keycloak/blob/833bf9864356abe6f2c9f672edf1438b8635f48c/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/arquillian/AuthServerTestEnricher.java#L656
    Pattern.compile("(\\$|\\{|\\}|(:.*$))"),
    // https://github.com/ulanovtrip/algorithms/blob/0ef11be1b513e5f61a7724b48ddb8344f0041206/src/tij4/examples/typeinfo/ShowMethods.java#L18
    Pattern.compile("\\w+\\."),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L82
    Pattern.compile("^MAC"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L83
    Pattern.compile("^KN"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L84
    Pattern.compile("^K"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L85
    Pattern.compile("^(PH|PF)"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L86
    Pattern.compile("^SCH"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L87
    Pattern.compile("(EE|IE)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/language/Nysiis.java#L88
    Pattern.compile("(DT|RT|RD|NT|ND)$"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/codec/digest/Sha2Crypt.java#L68
    Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*"),
    // https://github.com/ericchhuang/amazons/blob/896f6ead0bb96001d2652ce307a9ac5c6d257553/amazons/GUI.java#L39
    Pattern.compile("\\s*(-?\\d{1,18})\\s*$"),
    // https://github.com/ericchhuang/amazons/blob/896f6ead0bb96001d2652ce307a9ac5c6d257553/amazons/Controller.java#L158
    Pattern.compile("#.*"),
    // https://github.com/Keep-early-hours/ynk/blob/2e6da29afcad674b788fdad90cf28b75fd742564/src/main/java/com/ynk/base/util/PhoneUtils.java#L72
    Pattern.compile("0?(13|14|15|17|18|19)[0-9]{9}"),
    // https://github.com/Keep-early-hours/ynk/blob/2e6da29afcad674b788fdad90cf28b75fd742564/src/main/java/com/ynk/base/util/PhoneUtils.java#L75
    Pattern.compile("[0-9-()（）]{7,18}"),
    // https://github.com/LocalDogs/Repo1/blob/472f1b6c3284652340213cb029c400f0d00e3731/Codebase/app/src/main/java/com/example/localdogs/RegistrationPage.java#L119
    Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$"),
    // https://github.com/LocalDogs/Repo1/blob/472f1b6c3284652340213cb029c400f0d00e3731/Codebase/app/src/main/java/com/example/localdogs/RegistrationPage.java#L323
    Pattern.compile("(?=.*[a-zA-Z\\s]).{2,24}$"),
    // https://github.com/somoa-at-unist/se-assignment4/blob/fd4f8d65558ba95b689a2fa1fffab29be66c377a/examples/src/test/java/edu/berkeley/cs/jqf/examples/jdk/RegexTest.java#L61
    Pattern.compile("^(([a-z])+.)+[A-Z]([a-z])+$"),
    // https://github.com/wujun728/jun_springboot/blob/9edc1fd0379b2e6d5f7d500e97b26d292aa012b7/springboot_springside4/spring_springside4/modules/metrics/src/main/java/org/springside/modules/metrics/reporter/GraphiteReporter.java#L41
    Pattern.compile("[\\s]+"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L57
    Pattern.compile("-----BEGIN PRIVATE KEY-----\\\\n([a-z0-9/+=\\\\n]{32,})\\\\n-----END PRIVATE KEY-----", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L63
    Pattern.compile("\"privateKeyData\": \"([a-z0-9/+=\\\\n]{10,})\"", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/JetBrains/intellij-community/blob/4580864d68d0db2f89e9b6eac4cbea4c1ef5eb63/platform/platform-impl/src/com/intellij/ide/ui/search/SearchableOptionsRegistrarImpl.java#L59
    Pattern.compile("[\\W&&[^-]]+"),
    // https://github.com/JetBrains/intellij-community/blob/4580864d68d0db2f89e9b6eac4cbea4c1ef5eb63/java/compiler/impl/src/com/intellij/compiler/CompilerConfigurationImpl.java#L671
    Pattern.compile("(?:\\.\\*)+"),
    // https://github.com/Kareem20/News-Feed/blob/d8a38d398ac53c2e3c2278d78840ed6cc66e8bca/retrofit-master/retrofit/src/main/java/retrofit2/RequestBuilder.java#L50
    Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"),
    // https://github.com/DataGrip/mongo-jdbc-driver/blob/e44b8d556dc711089ca2d8a568776e4844a738ed/src/test/java/com/dbschema/mongo/TestUtil.java#L29
    Pattern.compile("[0-9a-f]{24}"),
    // https://github.com/DataGrip/mongo-jdbc-driver/blob/e44b8d556dc711089ca2d8a568776e4844a738ed/src/test/java/com/dbschema/mongo/TestUtil.java#L30
    Pattern.compile("[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}"),
    // https://github.com/DataGrip/mongo-jdbc-driver/blob/e44b8d556dc711089ca2d8a568776e4844a738ed/src/test/java/com/dbschema/mongo/TestDataReader.java#L14
    Pattern.compile("//\\s*(?<name>\\S+)(?<properties>(\\s+\\S+)+)?"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L55
    Pattern.compile("//(www.)?(youtube.com|youtu.be)"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L205
    Pattern.compile("url\\([\"' ]?+([^)\"']+)"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L219
    Pattern.compile("^.*?([0-9]+).*?$"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L230
    Pattern.compile("^https?://.*$"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L280
    Pattern.compile("(?:https?://)?(?:youtu\\.be/|(?:www\\.)?youtube\\.com/(?:watch(?:\\.php)?\\?.*v=|v/|embed/))([a-zA-Z0-9\\-_]+)"),
    // https://github.com/pagetronic/HubD/blob/c8ff9252f4ada6a8cbb6a756953b3a0ebc27fb83/hubd/src/live/page/web/utils/scrap/ScrapDataUtils.java#L347
    Pattern.compile("^.*\\.jpe?g$"),
    // https://github.com/gbif/dwca-validator3/blob/8935e81fd8ef70706c64e1e0accacb72dc58e633/src/main/java/org/gbif/dwca/action/ValidateAction.java#L76
    Pattern.compile("^\\s*(null|\\\\N|\\s)\\s*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/JCanning1/com2008-info-system/blob/d93ff8852143b1b94a0b7ccf891f2376ed7f687d/src/COM2008/Backend/User.java#L405
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}$"),
    // https://github.com/mohmed37/wattOfAfrica/blob/3cda11a1940f30e07560c562e634def530a0b0bb/microservice-utilisateur/src/main/java/com/microserviceuser/web/controller/AuthController.java#L46
    Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?=\\\\S+$).{6,12}", Pattern.CASE_INSENSITIVE),
    // https://github.com/spylinked/javastart2/blob/9fc0a3e3865f6233ffe3b271efb0d13a64bd4a63/src/Day_14/Task_3/Task3.java#L36
    Pattern.compile("\\S+ \\d+"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/io/input/XmlStreamReader.java#L669
    Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?"),
    // https://github.com/jason920612/Minecraft/blob/5bd5fb4dac36e23a2c16576118da15c4890a2dff/org/apache/commons/io/input/XmlStreamReader.java#L693
    Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L178
    Pattern.compile("\\$\\{USER_DISPLAY_NAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L179
    Pattern.compile("\\$\\{COMPANY_NAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L180
    Pattern.compile("\\$\\{RESET_PASSWORD_LINK\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L236
    Pattern.compile("\\$\\{SENDER_DISPLAY_NAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L238
    Pattern.compile("\\$\\{SPACE_DISPLAY_NAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L239
    Pattern.compile("\\$\\{EXTERNAL_REGISTRATION_LINK\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L319
    Pattern.compile("\\$\\{FIRST_NAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L320
    Pattern.compile("\\$\\{USERNAME\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/4ad524f3a12c01c6b54362d21f937170d6a10163/component/web/security/src/main/java/org/exoplatform/web/login/recovery/PasswordRecoveryServiceImpl.java#L344
    Pattern.compile("&\\{([a-zA-Z0-9\\.]+)\\}"),
    // https://github.com/chirag72763/itr_android/blob/1aec6544cb482f536fa6eb3b52b72babf1b3748c/app/src/main/java/com/codearlystudio/homedelivery/Address.java#L165
    Pattern.compile("^\\.|^@ |^_"),
    // https://github.com/chirag72763/itr_android/blob/1aec6544cb482f536fa6eb3b52b72babf1b3748c/app/src/main/java/com/codearlystudio/homedelivery/Address.java#L168
    Pattern.compile("^[a-zA-z0-9._-]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z]{2,4}$"),
    // https://github.com/RBMHTechnology/vind/blob/6496aa861c098becb1cb5721cf7c38d89a10385d/backend/elasticsearch/src/main/java/com/rbmhtechnology/vind/elasticsearch/backend/util/FieldUtil.java#L53
    Pattern.compile("U+0323"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/TextSelectionHint.java#L86
    Pattern.compile("\\*\\*.*\\*\\*"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L172
    Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L173
    Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L174
    Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L175
    Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L176
    Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L177
    Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L179
    Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L181
    Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L183
    Pattern.compile("\"sts\"\\s*:\\s*(\\d+)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L184
    Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L185
    Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\("),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L186
    Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\("),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L187
    Pattern.compile("var\\s"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L188
    Pattern.compile("return(?:\\s+|$)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L189
    Pattern.compile("[()]"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/WebPlayerView.java#L190
    Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Components/StickersAlert.java#L730
    Pattern.compile("@[a-zA-Z\\d_]{1,32}"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Charts/data/ChartData.java#L73
    Pattern.compile("(.*)(#.*)"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/SearchAdapterHelper.java#L420
    Pattern.compile("(^|\\s)#[^0-9][\\w@.]+"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/FiltersView.java#L269
    Pattern.compile("20[0-9]{1,2}"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/FiltersView.java#L270
    Pattern.compile("(\\w{3,}) ([0-9]{0,4})"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/FiltersView.java#L271
    Pattern.compile("([0-9]{0,4}) (\\w{2,})"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/FiltersView.java#L273
    Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/ui/Adapters/FiltersView.java#L274
    Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$"),
    // https://github.com/suxinwei/Telegram/blob/35c56aff37a54fd31c66f6eb88d29e04570161eb/TMessagesProj/src/main/java/org/telegram/messenger/Utilities.java#L28
    Pattern.compile("[\\-0-9]+"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/string/StringUtil.java#L1477
    Pattern.compile("(\\\\u(\\p{XDigit}{4}))"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/string/StringUtil.java#L1506
    Pattern.compile("AUTO_INCREMENT=(.*?) "),
    // https://github.com/fogbeam/zeppelin_mirror/blob/8730945dba100583f106cb44d58a58e3a90ecd2f/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/ParagraphTextParser.java#L70
    Pattern.compile("^(\\s*)%(\\w+(?:\\.\\w+)*)"),
    // https://github.com/graywolf/gecko-dev/blob/83462587a0fdc0c1477186e7f38f342181b0cdf4/mobile/android/geckoview/src/main/java/org/mozilla/gecko/GeckoProfile.java#L81
    Pattern.compile("(?:-P\\s*)(\\w*)(\\s*)"),
    // https://github.com/graywolf/gecko-dev/blob/83462587a0fdc0c1477186e7f38f342181b0cdf4/mobile/android/geckoview/src/main/java/org/mozilla/gecko/GeckoProfile.java#L89
    Pattern.compile("(?:-profile\\s*)(\\S*)(\\s*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/wifi/java/android/net/wifi/p2p/WifiP2pDevice.java#L138
    Pattern.compile("((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) (\\d+ )?p2p_dev_addr=((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) pri_dev_type=(\\d+-[0-9a-fA-F]+-\\d+) name='(.*)' config_methods=(0x[0-9a-fA-F]+) dev_capab=(0x[0-9a-fA-F]+) group_capab=(0x[0-9a-fA-F]+)( wfd_dev_info=0x([0-9a-fA-F]{12}))?"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/web/WebOperationRequestPredicate.java#L35
    Pattern.compile("(\\{\\*?).+?}"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/web/WebOperationRequestPredicate.java#L37
    Pattern.compile("^.*\\{\\*(.+?)}$"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/Sanitizer.java#L53
    Pattern.compile("\\[?[A-Za-z]+://.+:(.*)@.+$"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/EndpointId.java#L44
    Pattern.compile("[a-zA-Z0-9.-]+"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/EndpointId.java#L46
    Pattern.compile("[.-]+"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/EndpointId.java#L134
    Pattern.compile("[-.]+"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator-autoconfigure/src/test/java/org/springframework/boot/actuate/autoconfigure/endpoint/web/documentation/ScheduledTasksEndpointDocumentationTests.java#L58
    Pattern.compile("org.*\\.ScheduledTasksEndpointDocumentationTests\\$TestConfiguration"),
    // https://github.com/osmarleandro/spring-boot/blob/e07d5b2860ed0180bfe521767d15c3ff5f02f713/spring-boot-project/spring-boot-actuator-autoconfigure/src/test/java/org/springframework/boot/actuate/autoconfigure/endpoint/web/documentation/EnvironmentEndpointDocumentationTests.java#L75
    Pattern.compile("org/springframework/boot/actuate/autoconfigure/endpoint/web/documentation/"),
    // https://github.com/chojnackisara/Easy-Animator/blob/e8d5a1aea07fd59bf27c75c3862ee536b655fbc2/EasyAnimator/5004_hw10-master/src/cs5004/animator/model/AnimationReader.java#L39
    Pattern.compile("(\\p{Space}+|#.*)+"),
    // https://github.com/Suryabeam/Daleel_Al_Jahra/blob/5a7c50bb17250ef6cd55d8da4d2400b537f819b1/app/src/main/java/com/daleelpackage/myapp/home/AddNewAdPost.java#L1568
    Pattern.compile("(\\d+)$"),
    // https://github.com/guilhermebotossi/PhotoScraper/blob/690ff180f98d75310e9ce85847bdb80e1adc2e3f/src/main/java/br/botossi/photoscraper/services/DefaultPhotoScraperService.java#L57
    Pattern.compile("highres_url: '(https:\\/\\/.*?\\.jpg(?:\\?.*?)?)'"),
    // https://github.com/lingyajun/MyCoolWallet/blob/439c4a722e22864d0d324f9fa8eec52a01f37dff/app/src/main/java/com/bethel/mycoolwallet/fragment/WebFragment.java#L170
    Pattern.compile("objc://(\\w*)/?(.*?)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/opc/OPCService.java#L31
    Pattern.compile("(^pvenable\\d+$)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/opc/OPCService.java#L32
    Pattern.compile("(^pv\\d+$)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/opc/OPCService.java#L33
    Pattern.compile("(^ff\\d+$)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/opc/OPCService.java#L34
    Pattern.compile("(^mv\\d+$)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/opc/OPCService.java#L36
    Pattern.compile("([a-zA-Z]*)([0-9|.]*)"),
    // https://github.com/x1ng-z/alarmreport/blob/b67af141623f0f76fc88341436c9c8e14d9d938a/src/main/java/hs/alarmreport/device/DeviceMgr.java#L75
    Pattern.compile("\\d.*\\."),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L120
    Pattern.compile("\\s*$"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L121
    Pattern.compile("^\\s*"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L414
    Pattern.compile("(.*)°(.*)°(.+)°(.*)°\\((.*)\\)"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L417
    Pattern.compile("(.*)°(.*)°°(.*)°\\s*\\((.)\\)\\s*(.*)"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L431
    Pattern.compile("\\.\\./\\.\\./m/m\\d\\d/"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L590
    Pattern.compile("(.*)°(.*)°(.*)°(.*)"),
    // https://github.com/SerNet/verinice/blob/fd869a24ffce40f9ac38c0d5867bd79181468ea4/sernet.gs.service/src/sernet/gs/scraper/GSScraper.java#L601
    Pattern.compile("\\.\\./\\.\\./g/g\\d\\d/"),
    // https://github.com/graalvm/graalpython/blob/b19f9ea08077c95444d7a2b5e90e1b8b6f86fc42/graalpython/com.oracle.graal.python/src/com/oracle/graal/python/builtins/objects/str/StringBuiltins.java#L1347
    Pattern.compile("\\R"),
    // https://github.com/graalvm/graalpython/blob/b19f9ea08077c95444d7a2b5e90e1b8b6f86fc42/graalpython/com.oracle.graal.python/src/com/oracle/graal/python/builtins/Python3Core.java#L218
    Pattern.compile("^(print|exec) +([^(][^;]*).*"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWebSecurity/src/main/java/net/yadaframework/security/YadaSecurityConfig.java#L115
    Pattern.compile("^(GET|HEAD|TRACE|OPTIONS)$"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaWebUtil.java#L69
    Pattern.compile("[:,;=&!+~()@*$'\"\\s]"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaWebUtil.java#L405
    Pattern.compile("__"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaWebUtil.java#L406
    Pattern.compile("--"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaWebUtil.java#L407
    Pattern.compile("-+"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaUtil.java#L1006
    Pattern.compile("\\$\\{([^}]+)}"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaUtil.java#L2289
    Pattern.compile("--+"),
    // https://github.com/xtianus/yadaframework/blob/b229ae1567073502e29405d65f509344a93e88f6/YadaWeb/src/main/java/net/yadaframework/components/YadaUtil.java#L2289
    Pattern.compile("__+"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/2c9a4b2eb41d6912af7ca97214b6c33141ad5fb1/module2/src/Test3/Validate.java#L10
    Pattern.compile("^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)[ ])+[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/2c9a4b2eb41d6912af7ca97214b6c33141ad5fb1/module2/src/Test2/Validate.java#L7
    Pattern.compile("^[A-Za-z]+( )[A-Za-z]+$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/2c9a4b2eb41d6912af7ca97214b6c33141ad5fb1/module2/src/Test2/Validate.java#L8
    Pattern.compile("^[1-9][0-9]+$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/2c9a4b2eb41d6912af7ca97214b6c33141ad5fb1/module2/src/Test2/Validate.java#L10
    Pattern.compile("^(([A-Za-z]+)|([A-Za-z]+( )[A-Za-z]+))$"),
    // https://github.com/alesido/tvlaba/blob/539b40810fff8292be4ae9237d8b16b0f4bd3cfd/leanback/src/main/java/androidx/leanback/widget/StreamingTextView.java#L61
    Pattern.compile("\\S+"),
    // https://github.com/mingyang66/spring-parent/blob/2e0468610e976b335854b61bee1aeb40163edb53/sgrain-spring-boot-common/src/main/java/com/sgrain/boot/common/utils/RequestUtils.java#L89
    Pattern.compile("^(127\\.0\\.0\\.1)|(localhost)|(10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(172\\.((1[6-9])|(2\\d)|(3[01]))\\.\\d{1,3}\\.\\d{1,3})|(192\\.168\\.\\d{1,3}\\.\\d{1,3})$"),
    // https://github.com/redis/jedis/blob/72dc12e68947bb06c05b2d37d64c37e1ad367b45/src/main/java/redis/clients/jedis/util/Sharded.java#L27
    Pattern.compile("\\{(.+?)\\}"),
    // https://github.com/CoagulateSL/GPHUD/blob/9fe1fb6118549207093e7bc6be79abdc92d826b6/src/net/coagulate/GPHUD/Modules/GPHUDServer/Register.java#L72
    Pattern.compile("^.* \\(([0-9]+), ([0-9]+)\\)$"),
    // https://github.com/Nagisa12321/LeetCode/blob/b10a9520c663fa46c6b58708eb2220ced91fea6e/src/main/java/com/leetcode/algorithm/No8/Solution3.java#L18
    Pattern.compile("^\\s*([-+]?\\d+)"),
    // https://github.com/apache/nifi/blob/124cdbd3fe5446bff08346e5a28f2883f13e2848/nifi-nar-bundles/nifi-elasticsearch-bundle/nifi-elasticsearch-processors/src/main/java/org/apache/nifi/processors/elasticsearch/ScrollElasticsearchHttp.java#L122
    Pattern.compile("[0-9]+(m|h)"),
    // https://github.com/8440Gau/JavaAndSpring/blob/ef7f2023e7346bc6b11737458565c99a8b66669f/CoreJavaConceptandCode/src/main/java/com/person/learning/Excersie/RegularExpressions/PatternMatcher.java#L10
    Pattern.compile("Foo"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/media/java/android/media/ExifInterface.java#L1471
    Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/libs/WindowManager/Jetpack/src/androidx/window/sidecar/SettingsSidecarImpl.java#L52
    Pattern.compile("([a-z]+)-\\[(\\d+),(\\d+),(\\d+),(\\d+)]"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/graphics/java/android/graphics/fonts/FontVariationAxis.java#L90
    Pattern.compile("[\u0020-\u007E]{4}"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/graphics/java/android/graphics/fonts/FontVariationAxis.java#L104
    Pattern.compile("-?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/core/tests/benchmarks/src/android/text/util/LinkifyBenchmark.java#L40
    Pattern.compile("(?:\\b|$|^)http://[a-zA-Z0-9:\\.@\\?=#/]+(?:\\b|$|^)"),
    // https://github.com/jossiey/LinkChecker-CmdLC/blob/afc003a24c3e68605cc0dc9b8ce4d100b930cc30/src/main/java/osd/CmdLC.java#L133
    Pattern.compile("(https?)://[-a-zA-Z0-9+&@#/%?=~_|,!:.;]*[-a-zA-Z0-9+@#/%=&_|]"),
    // https://github.com/dawnyangcat/hc-utils/blob/dfd6c1f872adee1f35319e251750d2f76275ebd5/src/main/java/pers/dawnyang/common/util/oConvertUtils.java#L309
    Pattern.compile("\\s*|\t|\r|\n"),
    // https://github.com/darkeyes84/FairEmail/blob/7ab8aa3abc3fe09c6d777660c7db034f02c296ea/app/src/main/java/eu/faircode/email/HtmlHelper.java#L1399
    Pattern.compile("#+"),
    // https://github.com/darkeyes84/FairEmail/blob/7ab8aa3abc3fe09c6d777660c7db034f02c296ea/app/src/main/java/eu/faircode/email/HtmlHelper.java#L1398
    Pattern.compile("[^a-z0-9(),.%#]"),
    // https://github.com/openjdk/aarch64-port/blob/dee79d605334804118839e9f71151a7e8d1ad27b/src/java.sql/share/classes/java/sql/Statement.java#L1525
    Pattern.compile("[\\p{Alpha}][\\p{Alnum}_]*"),
    // https://github.com/openjdk/aarch64-port/blob/dee79d605334804118839e9f71151a7e8d1ad27b/src/java.sql/share/classes/java/sql/Statement.java#L1528
    Pattern.compile("^\".+\"$"),
    // https://github.com/openjdk/aarch64-port/blob/dee79d605334804118839e9f71151a7e8d1ad27b/src/java.sql/share/classes/java/sql/Statement.java#L1531
    Pattern.compile("[^\u0000\"]+"),
    // https://github.com/zengxiao-shuang/store-manage/blob/1647217ba63d1b705c5875570352177b164f4472/common/src/main/java/com/store/manage/common/utils/StringUtil.java#L239
    Pattern.compile("^((https|http|ftp|rtsp|mms)?://)?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?(([0-9]{1,3}\\.){3}[0-9]{1,3}|([0-9a-z_!~*'()-]+\\.)*([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\.[a-z]{2,6})(:[0-9]{1,5})?((/?)|(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-servlets-post/src/main/java/org/apache/sling/servlets/post/impl/SlingPostServlet.java#L286
    Pattern.compile("^(https?://[^/]+)(.*)$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-scripting-sightly-compiler/src/main/java/org/apache/sling/scripting/sightly/impl/html/MarkupUtils.java#L28
    Pattern.compile("^(style|(on.*))$", Pattern.CASE_INSENSITIVE),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/Mapping.java#L72
    Pattern.compile("(.+)([:<>])(.+)"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L46
    Pattern.compile("http/([^/]+)(\\.[^\\d/]+)(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L47
    Pattern.compile("https/([^/]+)(\\.[^\\d/]+)(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L53
    Pattern.compile("http/([^/]+)\\.80(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L54
    Pattern.compile("https/([^/]+)\\.443(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L55
    Pattern.compile("([^/]+)/([^/]+)\\.(\\d+)(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-resourceresolver/src/main/java/org/apache/sling/resourceresolver/impl/mapping/MapEntry.java#L56
    Pattern.compile("([^/]+)/([^/]+)(/.*)?$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-jcr-contentparser/src/test/java/org/apache/sling/jcr/contentparser/impl/mapsupport/ContentElementHandler.java#L34
    Pattern.compile("^((/[^/]+)*)(/([^/]+))$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-feature/src/main/java/org/apache/sling/feature/builder/FeatureBuilder.java#L48
    Pattern.compile("\\$\\{[a-zA-Z0-9.\\-_]+\\}"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/sling-org-apache-sling-feature-cpconverter/src/main/java/org/apache/sling/feature/cpconverter/vltpkg/VaultPackageAssembler.java#L72
    Pattern.compile("(jcr_root)?/apps/[^/]+/install(\\.([^/]+))?/.+\\.jar"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/core/convert/QueryMapper.java#L712
    Pattern.compile("\\$.*or"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/core/convert/QueryMapper.java#L805
    Pattern.compile("\\$\\[.*\\]"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/core/convert/QueryMapper.java#L917
    Pattern.compile("\\.\\$(\\[.*?\\])?|\\.\\d+"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/core/convert/QueryMapper.java#L918
    Pattern.compile("\\.\\d+"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb/src/main/java/ghost/framework/data/mongodb/config/MongoCredentialPropertyEditor.java#L45
    Pattern.compile("(\\\\?')(.*?)\\1"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.mongodb.jpa/src/main/java/ghost/framework/data/mongodb/jpa/repository/query/CollationUtils.java#L43
    Pattern.compile("\\?(\\d+)"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/query/StringQuery.java#L190
    Pattern.compile("\\?(\\d*+(?![#\\w]))"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/query/StringQuery.java#L813
    Pattern.compile("%.*%"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/query/SpelQueryContext.java#L46
    Pattern.compile("([:?])#\\{([^}]+)}"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/query/QueryUtils.java#L95
    Pattern.compile("select\\s+(.+)\\s+from", Pattern.CASE_INSENSITIVE),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L70
    Pattern.compile("^(find|read|get|query|search|stream|count|exists|delete|remove)((\\p{Lu}.*?))??By"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L285
    Pattern.compile("^count(\\p{Lu}.*?)??By"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L286
    Pattern.compile("^(exists)(\\p{Lu}.*?)??By"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L287
    Pattern.compile("^(delete|remove)(\\p{Lu}.*?)??By"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L290
    Pattern.compile("^(find|read|get|query|search|stream)(Distinct)?(First|Top)(\\d*)?(\\p{Lu}.*?)??By"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/PartTree.java#L372
    Pattern.compile("AllIgnor(ing|e)Case"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/Part.java#L43
    Pattern.compile("Ignor(ing|e)Case"),
    // https://github.com/guoshucan/mpaas/blob/4f4557c91bdba65bed60e25707406b28b0ce3116/ghost.framework.data.jdbc.jpa.plugin/src/main/java/ghost/framework/data/jdbc/jpa/plugin/repository/OrderBySource.java#L46
    Pattern.compile("(.+?)(Asc|Desc)?$"),
    // https://github.com/dhetong/MockingPattern/blob/345593aa6dca20ffa50aa7692f2d14af01885021/src/mockpattern/handlers/MethodVisitor.java#L44
    Pattern.compile("when\\(([^}]*)\\)\\."),
    // https://github.com/dhetong/MockingPattern/blob/345593aa6dca20ffa50aa7692f2d14af01885021/src/mockpattern/handlers/MethodVisitor.java#L83
    Pattern.compile("mock\\(([^}]*)\\.class\\)"),
    // https://github.com/razbasnet1992/Java1.8-Features/blob/71b96af24fee9efb68e442583ed56ed54ed2aeb0/src/com/java8/password/UserPassword.java#L11
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9_.][@.](!#$%&*()-+=^){8,30}$"),
    // https://github.com/razbasnet1992/Java1.8-Features/blob/71b96af24fee9efb68e442583ed56ed54ed2aeb0/src/com/java8/password/UserPassword.java#L37
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9_!@#$%&*()-+=^].{8,30}$"),
    // https://github.com/tebu1783/marioAI8/blob/1e5de5430f7475bacb52e4ba1cf76942032604ce/src/ch/idsia/tools/RandomCreatureGenerator.java#L89
    Pattern.compile("[gsfr]k?w?w?(:\\d+)?"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L165
    Pattern.compile("TEST-TOPIC-\\d"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L205
    Pattern.compile("not-a-match"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L265
    Pattern.compile("TEST-TOPIC-[A-Z]"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L297
    Pattern.compile("topic-\\d+"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L327
    Pattern.compile("topic-\\d"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L328
    Pattern.compile("topic-[A-D]"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L372
    Pattern.compile("partitioned-\\d"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L429
    Pattern.compile("foo.*"),
    // https://github.com/a0x8o/kafka/blob/e2bb38c2529f1ed965d9979acdc979fb9f8b614b/streams/src/test/java/org/apache/kafka/streams/integration/RegexSourceIntegrationTest.java#L430
    Pattern.compile("f.*"),
    // https://github.com/AbuZaitoun/SportLand/blob/bb089d3c59f809cf80d910d63a746ba831d04c5c/app/src/main/java/com/anaszaitoun/sportlandgym/Controllers/WorkoutRecyclerAdapter.java#L128
    Pattern.compile("(?<=watch\\?v=|/videos/|embed/|youtu.be/|/v/|/e/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200C\u200B2F|youtu.be%2F|%2Fv%2F)[^#&?\\n]*"),
    // https://github.com/FusionOS-org/android_art/blob/be7b7ab021a4b1a732905884a2812de2e787e782/tools/class2greylist/src/com/android/class2greylist/ApiResolver.java#L32
    Pattern.compile("\\{@link ([^\\}]+)\\}"),
    // https://github.com/FusionOS-org/android_art/blob/be7b7ab021a4b1a732905884a2812de2e787e782/tools/class2greylist/src/com/android/class2greylist/ApiResolver.java#L33
    Pattern.compile("\\{@code ([^\\}]+)\\}"),
    // https://github.com/FusionOS-org/android_art/blob/be7b7ab021a4b1a732905884a2812de2e787e782/test/911-get-stack-trace/src/art/PrintThread.java#L44
    Pattern.compile("Binder:|RenderThread|hwuiTask|Jit thread pool worker|Instr:|JDWP|Profile Saver|main|queued-work-looper|InstrumentationConnectionThread|intel_svc_streamer_thread|ForkJoinPool"),
    // https://github.com/FusionOS-org/android_art/blob/be7b7ab021a4b1a732905884a2812de2e787e782/test/911-get-stack-trace/src/art/PrintThread.java#L52
    Pattern.compile("Daemon|main"),
    // https://github.com/FusionOS-org/android_art/blob/be7b7ab021a4b1a732905884a2812de2e787e782/test/094-pattern/src/Main.java#L55
    Pattern.compile("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-zA-Z0-9\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\-]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnprwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eosuw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agksyz]|v[aceginu]|w[fs]|(?:\u03b4\u03bf\u03ba\u03b9\u03bc\u03ae|\u0438\u0441\u043f\u044b\u0442\u0430\u043d\u0438\u0435|\u0440\u0444|\u0441\u0440\u0431|\u05d8\u05e2\u05e1\u05d8|\u0622\u0632\u0645\u0627\u06cc\u0634\u06cc|\u0625\u062e\u062a\u0628\u0627\u0631|\u0627\u0644\u0627\u0631\u062f\u0646|\u0627\u0644\u062c\u0632\u0627\u0626\u0631|\u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629|\u0627\u0644\u0645\u063a\u0631\u0628|\u0627\u0645\u0627\u0631\u0627\u062a|\u0628\u06be\u0627\u0631\u062a|\u062a\u0648\u0646\u0633|\u0633\u0648\u0631\u064a\u0629|\u0641\u0644\u0633\u0637\u064a\u0646|\u0642\u0637\u0631|\u0645\u0635\u0631|\u092a\u0930\u0940\u0915\u094d\u0937\u093e|\u092d\u093e\u0930\u0924|\u09ad\u09be\u09b0\u09a4|\u0a2d\u0a3e\u0a30\u0a24|\u0aad\u0abe\u0ab0\u0aa4|\u0b87\u0ba8\u0bcd\u0ba4\u0bbf\u0baf\u0bbe|\u0b87\u0bb2\u0b99\u0bcd\u0b95\u0bc8|\u0b9a\u0bbf\u0b99\u0bcd\u0b95\u0baa\u0bcd\u0baa\u0bc2\u0bb0\u0bcd|\u0baa\u0bb0\u0bbf\u0b9f\u0bcd\u0b9a\u0bc8|\u0c2d\u0c3e\u0c30\u0c24\u0c4d|\u0dbd\u0d82\u0d9a\u0dcf|\u0e44\u0e17\u0e22|\u30c6\u30b9\u30c8|\u4e2d\u56fd|\u4e2d\u570b|\u53f0\u6e7e|\u53f0\u7063|\u65b0\u52a0\u5761|\u6d4b\u8bd5|\u6e2c\u8a66|\u9999\u6e2f|\ud14c\uc2a4\ud2b8|\ud55c\uad6d|xn\\-\\-0zwm56d|xn\\-\\-11b5bs3a9aj6g|xn\\-\\-3e0b707e|xn\\-\\-45brj9c|xn\\-\\-80akhbyknj4f|xn\\-\\-90a3ac|xn\\-\\-9t4b11yi5a|xn\\-\\-clchc0ea0b2g2a9gcd|xn\\-\\-deba0ad|xn\\-\\-fiqs8s|xn\\-\\-fiqz9s|xn\\-\\-fpcrj9c3d|xn\\-\\-fzc2c9e2c|xn\\-\\-g6w251d|xn\\-\\-gecrj9c|xn\\-\\-h2brj9c|xn\\-\\-hgbk6aj7f53bba|xn\\-\\-hlcj6aya9esc7a|xn\\-\\-j6w193g|xn\\-\\-jxalpdlp|xn\\-\\-kgbechtv|xn\\-\\-kprw13d|xn\\-\\-kpry57d|xn\\-\\-lgbbat1ad8j|xn\\-\\-mgbaam7a8h|xn\\-\\-mgbayh7gpa|xn\\-\\-mgbbh1a71e|xn\\-\\-mgbc0a9azcg|xn\\-\\-mgberp4a5d4ar|xn\\-\\-o3cw4h|xn\\-\\-ogbpf8fl|xn\\-\\-p1ai|xn\\-\\-pgbs0dh|xn\\-\\-s9brj9c|xn\\-\\-wgbh1c|xn\\-\\-wgbl6a|xn\\-\\-xkc2al3hye2a|xn\\-\\-xkc2dl3a5ee0h|xn\\-\\-yfro4i67o|xn\\-\\-ygbi2ammx|xn\\-\\-zckzah|xxx)|y[et]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)"),
    // https://github.com/punitbudania/UserRegistration/blob/ef3c5cc3edfbe50c675b3a9fb776dc461ac0bc30/src/samplePackage/UserRegistration.java#L12
    Pattern.compile("^[A-Z][a-z]{2,}"),
    // https://github.com/punitbudania/UserRegistration/blob/ef3c5cc3edfbe50c675b3a9fb776dc461ac0bc30/src/samplePackage/Password.java#L13
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&-+=()])(?=\\S+$).{8,}$", Pattern.MULTILINE),
    // https://github.com/punitbudania/UserRegistration/blob/ef3c5cc3edfbe50c675b3a9fb776dc461ac0bc30/src/samplePackage/MobileNo.java#L13
    Pattern.compile("[91]{2}\\s[789]{1}[0-9]{9}", Pattern.MULTILINE),
    // https://github.com/liufurisheng/AutoTest/blob/794dcab81dbf964358d03a09e6c19266d3f354d9/backend/src/main/java/io/metersphere/commons/utils/JsonPathUtils.java#L90
    Pattern.compile(".(\\d{1,3}).{0,1}"),
    // https://github.com/liufurisheng/AutoTest/blob/794dcab81dbf964358d03a09e6c19266d3f354d9/backend/src/main/java/io/metersphere/commons/utils/JsonPathUtils.java#L120
    Pattern.compile("[?*/]"),
    // https://github.com/mansimathpal/JSF/blob/b42eb75ab459c74115a49fb7e562ab3634604ace/JSF/grantuniversity/src/grantuniversity/RegistrationForm.java#L83
    Pattern.compile(".+@.+\\.[a-z]+"),
    // https://github.com/tiagoluzs/orgarq1-tp2/blob/1d41917d56030556de795f589e69d625aa45c5e2/trabalho/src/main/java/com/mycompany/trabalho/Montagem.java#L185
    Pattern.compile("([0-9]+)\\((\\$[a-z0-9]{2,4})\\)"),
    // https://github.com/tiagoluzs/orgarq1-tp2/blob/1d41917d56030556de795f589e69d625aa45c5e2/trabalho/src/main/java/com/mycompany/trabalho/Montagem.java#L199
    Pattern.compile("(\\$[a-z0-9]+)\\ *,\\ *(\\$[a-z0-9]+)\\ *,\\ *([a-z0-9]*)"),
    // https://github.com/tiagoluzs/orgarq1-tp2/blob/1d41917d56030556de795f589e69d625aa45c5e2/trabalho/src/main/java/com/mycompany/trabalho/Montagem.java#L215
    Pattern.compile("(\\$[a-z0-9]+)\\ *,\\ *([a-z0-9]*)"),
    // https://github.com/tiagoluzs/orgarq1-tp2/blob/1d41917d56030556de795f589e69d625aa45c5e2/trabalho/src/main/java/com/mycompany/trabalho/Montagem.java#L262
    Pattern.compile("^.+:.*$"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L13
    Pattern.compile("\\b(False|await|else|import|pass|None|break|except|in|raise|True|class|finally|is|return|and|continue|for|lambda|try|as|def|from|nonlocal|while|assert|del|global|not|with|async|elif|if|or|yield)\\b"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L19
    Pattern.compile("[,:;[->]{}()]"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L22
    Pattern.compile("\\b(\\d*[.]?\\d+)\\b"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L23
    Pattern.compile("'[a-zA-Z]'"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L24
    Pattern.compile("\".*\""),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L25
    Pattern.compile("0x[0-9a-fA-F]+"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L26
    Pattern.compile("#TODO[^\n]*"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L27
    Pattern.compile("\\.[a-zA-Z0-9_]+"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L28
    Pattern.compile(":|==|>|<|!=|>=|<=|->|=|>|<|%|-|-=|%=|\\+|\\-|\\-=|\\+=|\\^|\\&|\\|::|\\?|\\*"),
    // https://github.com/whilson03/PyTutor/blob/7cc9768d4565a1f99bd66c073f362487d509ebb5/app/src/main/java/com/olabode/wilson/pytutor/views/PythonSyntaxManager.java#L29
    Pattern.compile("#(?!TODO )[^\\n]*"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L399
    Pattern.compile("\\d{2}/\\d{2}/\\d{4}"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L413
    Pattern.compile("(.*[a-zA-Z].*)"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L412
    Pattern.compile("(.*[A-Z].*)"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L414
    Pattern.compile("(.*[0-9].*)"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L415
    Pattern.compile("(.*[ ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L416
    Pattern.compile("(.*[   ].*)"),
    // https://github.com/iamnouf/BikeServiceSystem/blob/c096b4f5b5a50995ddbcebf134bea3887f2c8151/src/bikeservicesystem/Register.java#L423
    Pattern.compile("[0-9]{10}"),
    // https://github.com/epam/cloud-pipeline/blob/506a550b2035500cb430b1c4ce2bce867c335bb2/billing-report-agent/src/main/java/com/epam/pipeline/billingreportagent/service/impl/converter/AzureEARawPriceLoader.java#L89
    Pattern.compile(".*skiptoken=([^&]+).*"),
    // https://github.com/epam/cloud-pipeline/blob/506a550b2035500cb430b1c4ce2bce867c335bb2/billing-report-agent/src/main/java/com/epam/pipeline/billingreportagent/service/impl/converter/AbstractAzureStoragePriceListLoader.java#L56
    Pattern.compile("(\\d+)\\s([\\w/]+)"),
    // https://github.com/E-anass/ReindeerOlympics/blob/e235366b401ce4313806d3a132759f6af28d12ea/src/com/timwiTest/Main.java#L35
    Pattern.compile("(\\w+) can fly (\\d+) km/s for (\\d+) seconds, but then must rest for (\\d+) seconds."),
    // https://github.com/arquivo/PwaSpellchecker/blob/64ad2f3a2f38ec1d7364d53ebef1864ebd8a0494/src/main/java/pt/arquivo/servlets/RegexSpellcheckerServlet.java#L31
    Pattern.compile("-?([^\"\\s-]+)"),
    // https://github.com/Evolveum/midpoint-studio/blob/8187124e5d830b87b81adb6ada524b21fcec8c88/studio-idea-plugin/src/main/java/com/evolveum/midpoint/studio/util/MidPointUtils.java#L77
    Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$"),
    // https://github.com/Evolveum/midpoint-studio/blob/8187124e5d830b87b81adb6ada524b21fcec8c88/studio-idea-plugin/src/main/java/com/evolveum/midpoint/studio/util/MidPointUtils.java#L89
    Pattern.compile("\\$(t|T|s|e|n|o)"),
    // https://github.com/xiaoyao9184/hj-t212-parser/blob/8af2c401a3a3413fca094eee17dd733e4ad91e2b/hj-t212-parser/src/jmh/java/com/xy/format/hbt212/core/BatchDefaultT212MapperBenchmark.java#L48
    Pattern.compile(".*\\.h212"),
    // https://github.com/x-ream/x7/blob/e2b9280e1c15df5648aa71ac903a9efcfb5e56d6/x7-reyc/src/main/java/io/xream/x7/reyc/internal/HttpClientResolver.java#L59
    Pattern.compile("\\{[\\w]*\\}"),
    // https://github.com/cerijerome/ceri/blob/8814cc57e3c5b1839405087162a78948c8bd3588/ceri-common/src/main/java/ceri/common/net/NetUtil.java#L19
    Pattern.compile("(?i)(localhost|0*127(?:\\.[0-9]+){0,2}\\.[0-9]+|(?:0*\\:)*?:?0*1)"),
    // https://github.com/ayabdi/chat-app-java/blob/bd75826e1fe94f41e6aeacda4c4cce9df1141a23/Server.java#L186
    Pattern.compile("#([0-9a-f]{3}|[0-9a-f]{6}|[0-9a-f]{8})"),
    // https://github.com/KrutikaBhatt/Mini_Projects/blob/8357d804d0347e8c4421ad0aa1939cd3f69f9ee7/Voting-Management_Portal/src/voting/management/UpdateVoter.java#L591
    Pattern.compile("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/filters/RemoteIpFilter.java#L653
    Pattern.compile("\\s*,\\s*"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/filters/RemoteIpFilter.java#L732
    Pattern.compile("10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|192\\.168\\.\\d{1,3}\\.\\d{1,3}|169\\.254\\.\\d{1,3}\\.\\d{1,3}|127\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|172\\.1[6-9]{1}\\.\\d{1,3}\\.\\d{1,3}|172\\.2[0-9]{1}\\.\\d{1,3}\\.\\d{1,3}|172\\.3[0-1]{1}\\.\\d{1,3}\\.\\d{1,3}|0:0:0:0:0:0:0:1|::1"),
    // https://github.com/ww530220264/apache-tomcat-9.0.37-src/blob/ca644c3a187dcc6c03e6b728bc4630d380f15429/java/org/apache/catalina/ant/DeployTask.java#L40
    Pattern.compile("\\w{3,5}\\:"),
    // https://github.com/nmrhtn7898/bread-project/blob/28bbda48f44c3058a02d9497b0a5d2dcf1991f70/bread-auth-module/src/test/java/com/bread/auth/config/CustomUriModifyingOperationPreprocessor.java#L114
    Pattern.compile("(http[s]?)://([^/:#?]+)(:[0-9]+)?"),
    // https://github.com/melkiimultic/user-app/blob/793f6ab6bc20e208ce628f39e6f99c0b45cd1e3e/src/main/java/com/julenka/molodec/userapplication/services/PasswordValidatorService.java#L15
    Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9]).{2,}$"),
    // https://github.com/onap/aai-traversal/blob/5a8b0ae790569882869247d768e5dea6348e6a2d/aai-traversal/src/main/java/org/onap/aai/rest/dsl/DslQueryBuilder.java#L247
    Pattern.compile("aai-node-type"),
    // https://github.com/Armedia/Caliente/blob/17ee7340dd77d4a3a0b927f0b0142146abf6d45b/engine/impl/local/src/main/java/com/armedia/caliente/engine/local/exporter/LocalQueryService.java#L93
    Pattern.compile("^((?:[\\w$&&[^\\d]][\\w$]*)(?:\\.[\\w$&&[^\\d]][\\w$]*)*)(?:::([\\w$&&[^\\d]][\\w$]*))?$"),
    // https://github.com/prestosql/presto/blob/28bc79b7dbb1428b1b4e6c845646db89778b9c9d/presto-plugin-toolkit/src/main/java/io/prestosql/plugin/base/security/FileBasedSystemAccessControl.java#L243
    Pattern.compile("system"),
    // https://github.com/moonlity/SpringSecurityTest/blob/7bf38094342a7c8ac867c2d22901e45ecb2ddf14/Animate/src/main/java/com/controller/AccountController.java#L176
    Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*?&`~'\"+=])[A-Za-z[0-9]$@$!%*?&`~'\"+=]{8,20}$"),
    // https://github.com/li16881935/gitResp02/blob/8182a11572ce1210fc6a9cd2d99dccf609eff61f/src/main/java/com/study/quickstart/Consumer_Group_2.java#L23
    Pattern.compile("^topic.*"),
    // https://github.com/paolo-simonetti/RegistrazioneDipendente/blob/0033cc28c085687a5333025355e2603cf62da17b/src/main/java/it/solvingteam/trastulliconstruts2/action/RegistrazioneAction.java#L92
    Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", Pattern.CASE_INSENSITIVE),
    // https://github.com/JetBrains/intellij-community/blob/e4f1c72dfde2077b191415c7d2effc91cd4de84b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchUtil.java#L40
    Pattern.compile("<[^<>]*>"),
    // https://github.com/JetBrains/intellij-community/blob/e4f1c72dfde2077b191415c7d2effc91cd4de84b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchUtil.java#L41
    Pattern.compile("\"([^\"]+)\""),
    // https://github.com/JetBrains/intellij-community/blob/e4f1c72dfde2077b191415c7d2effc91cd4de84b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchUtil.java#L42
    Pattern.compile("[\\W&&[^\\p{Punct}\\p{Blank}]]"),
    // https://github.com/JetBrains/intellij-community/blob/e4f1c72dfde2077b191415c7d2effc91cd4de84b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchUtil.java#L406
    Pattern.compile("[<[^<>]*>]*<[^<>]*"),
    // https://github.com/adminwangtc/springboot/blob/dd48ed2b928aa047baf5e1d8f6658d56d2f2c9bc/src/main/java/com/example/demo/utils/RegexUtils.java#L23
    Pattern.compile("^1[23456789][\\d]{9}$"),
    // https://github.com/jiutai/backend-java/blob/2ef8f3f531b0398658d9f60b54bb879c43d9eeee/src/main/java/blogstorm/backend/util/dataclean/CleanContent.java#L173
    Pattern.compile("<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/jiutai/backend-java/blob/2ef8f3f531b0398658d9f60b54bb879c43d9eeee/src/main/java/blogstorm/backend/util/dataclean/CleanContent.java#L175
    Pattern.compile("<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/jiutai/backend-java/blob/2ef8f3f531b0398658d9f60b54bb879c43d9eeee/src/main/java/blogstorm/backend/util/dataclean/CleanContent.java#L191
    Pattern.compile("[<>$&^*%\t\n: /=\"',.{}~()\0_]"),
    // https://github.com/jiutai/backend-java/blob/2ef8f3f531b0398658d9f60b54bb879c43d9eeee/src/main/java/blogstorm/backend/util/dataclean/CleanArticle.java#L192
    Pattern.compile("[`~!@#$%^&*()+=|{}:;\\\\[\\\\].<>/！￥…（）—【】‘；：”“’。，、？']"),
    // https://github.com/simonfox214/PtgAndroid/blob/72f6ca11f096b68f5edf8dbe6dcf5cc37bb0083a/app/src/main/java/com/simon/ptg/utils/StatusBarUtils.java#L159
    Pattern.compile("Flyme_OS_[4|5]", Pattern.CASE_INSENSITIVE),
    // https://github.com/collinharmon/d2fileparser/blob/b930a4d519e93a56846352f6d6f3757c34c7c62a/src/item/D2Item.java#L990
    Pattern.compile("stat"),
    // https://github.com/collinharmon/d2fileparser/blob/b930a4d519e93a56846352f6d6f3757c34c7c62a/src/item/D2Item.java#L1266
    Pattern.compile("<br>&#10;"),
    // https://github.com/collinharmon/d2fileparser/blob/b930a4d519e93a56846352f6d6f3757c34c7c62a/src/item/D2Item.java#L1267
    Pattern.compile("&#32;"),
    // https://github.com/collinharmon/d2fileparser/blob/b930a4d519e93a56846352f6d6f3757c34c7c62a/src/item/D2Item.java#L1268
    Pattern.compile("<[^>]*>"),
    // https://github.com/collinharmon/d2fileparser/blob/b930a4d519e93a56846352f6d6f3757c34c7c62a/src/item/D2Item.java#L2614
    Pattern.compile("[^\\(?](\\d+)"),
    // https://github.com/falcon-computing/gatk3/blob/8af612f4d649ccc00aa0c2ca90caf71cc1a4f7ab/public/gatk-utils/src/test/java/org/broadinstitute/gatk/utils/AutoFormattingTimeUnitTest.java#L105
    Pattern.compile("(\\s*\\d*)\\.(\\d*) \\w"),
    // https://github.com/falcon-computing/gatk3/blob/8af612f4d649ccc00aa0c2ca90caf71cc1a4f7ab/public/gatk-utils/src/main/java/org/broadinstitute/gatk/utils/report/GATKReportTable.java#L42
    Pattern.compile("[^a-zA-Z0-9_\\-\\.]"),
    // https://github.com/falcon-computing/gatk3/blob/8af612f4d649ccc00aa0c2ca90caf71cc1a4f7ab/public/gatk-utils/src/main/java/org/broadinstitute/gatk/utils/report/GATKReportTable.java#L247
    Pattern.compile("\\r|\\n"),
    // https://github.com/falcon-computing/gatk3/blob/8af612f4d649ccc00aa0c2ca90caf71cc1a4f7ab/public/gatk-utils/src/main/java/org/broadinstitute/gatk/utils/codecs/sampileup/SAMPileupCodec.java#L339
    Pattern.compile("([0-9]+).*"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/registry/common/route/RouteRule.java#L154
    Pattern.compile("([&!=,]*)\\s*([^&!=,\\s]+)"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/registry/common/route/RouteRule.java#L156
    Pattern.compile("(.*)=>(.*)"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/registry/common/route/ParseUtils.java#L45
    Pattern.compile("\\$\\s*\\{?\\s*([\\._0-9a-zA-Z]+)\\s*\\}?"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/registry/common/route/ParseUtils.java#L219
    Pattern.compile("([&=]?)\\s*([^&=\\s]+)"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/registry/common/route/ParseUtils.java#L290
    Pattern.compile("([^(_0-9A-Za-z)])"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/home/module/screen/Status.java#L49
    Pattern.compile("o(k)", Pattern.CASE_INSENSITIVE),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/home/module/screen/Shell.java#L54
    Pattern.compile("ok", Pattern.CASE_INSENSITIVE),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/home/module/screen/Shell.java#L56
    Pattern.compile("error", Pattern.CASE_INSENSITIVE),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Weights.java#L94
    Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3}$"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Weights.java#L97
    Pattern.compile("0{1,3}(\\.0{1,3}){3}$"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Overrides.java#L128
    Pattern.compile("\\&"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Overrides.java#L129
    Pattern.compile("([^=\\s]*)\\s*=\\s*(\\S*)"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/common/interceptor/RestfuleUrlRewriter.java#L73
    Pattern.compile("/+"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/common/interceptor/RestfuleUrlRewriter.java#L75
    Pattern.compile("[+\\d]+"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/common/interceptor/RestfuleUrlRewriter.java#L76
    Pattern.compile("/+pages/+"),
    // https://github.com/dengquanbo/dubbo/blob/816b4222f3d98e86b926a7df64ee43c669948a1f/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/common/interceptor/RestfuleUrlRewriter.java#L77
    Pattern.compile(".*/+pages/+\\d+$"),
    // https://github.com/Engineering-Research-and-Development/market4.0-ids_multipart_message_processor/blob/a853e9d441927b8045588586c0b7d8a12e989ce6/src/main/java/it/eng/idsa/multipart/processor/MultipartMessageProcessor.java#L31
    Pattern.compile("(.*?)boundary=(.*);.*"),
    // https://github.com/Engineering-Research-and-Development/market4.0-ids_multipart_message_processor/blob/a853e9d441927b8045588586c0b7d8a12e989ce6/src/main/java/it/eng/idsa/multipart/processor/MultipartMessageProcessor.java#L32
    Pattern.compile("(.*?)name=\"(.*)\"(.*?)"),
    // https://github.com/Engineering-Research-and-Development/market4.0-ids_multipart_message_processor/blob/a853e9d441927b8045588586c0b7d8a12e989ce6/src/main/java/it/eng/idsa/multipart/processor/MultipartMessageProcessor.java#L470
    Pattern.compile("UTC"),
    // https://github.com/fyarkiy/SpringBoot/blob/3de8d197033f4f1523e8dde9318be30e3aea5067/src/main/java/ma/boot/springboot/service/DatabaseSaver.java#L29
    Pattern.compile("[!._,'@? ]"),
    // https://github.com/chipOlin/05_block/blob/f789e9dd9697c551db0f9961a3fd5b981cc7a58d/homework_5.2/task_4/src/task_listEmails.java#L19
    Pattern.compile("([A-Z]+)\\s?(.+@.+\\..+)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/chipOlin/05_block/blob/f789e9dd9697c551db0f9961a3fd5b981cc7a58d/homework_5.2/task_4/src/task_listEmails.java#L19
    Pattern.compile("([A-Z]+)\\s?(.+@.+\\..+)?"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/IndexFetcher.java#L22
    Pattern.compile(".*?/index(?:/(\\D*?))?(?:/([0-9]*)(?:\\?.*)?)?$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/IndexFetcher.java#L23
    Pattern.compile(".*?/(?:(?:article)|(?:comments)|(?:amp)|(?:edit))/([0-9]*)(?:/[\\w\\-\\.\\(\\)\\[\\]\\{\\}\\+,%_]*/?)?(?:\\?.*)?(?:#.*)?$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L30
    Pattern.compile("<img (.+?)\\s?/?>"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L31
    Pattern.compile("^(.+)(\\..+)$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L32
    Pattern.compile("([^\\s=]+)(?:=['|\\\"](.*?)['|\\\"])?"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L33
    Pattern.compile(".*?(<p>.*?</p>).*"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L34
    Pattern.compile("</?a(?:\\s.*?)?>"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/toilet/src/java/toilet/ArticleProcessor.java#L37
    Pattern.compile("!?\\[\"?(.+?)\"?\\]\\(\\S+?(?:\\s\"?(.+?)\"?)?\\)"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/tag/AbstractInput.java#L28
    Pattern.compile("^[\\u000A\\u000D\\u0020-\\uFFFF\\u20000-\\u2FFFF]*$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/security/SecurityRepo.java#L49
    Pattern.compile("^((https?://)([^/]+))(/.*)?$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/security/GuardFilter.java#L51
    Pattern.compile("^/([A-Za-z\\-]+?)(?:(/.*?))?$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/rss/RssServlet.java#L37
    Pattern.compile("^.+?/rss/([^\\?]+?)(?:\\?.*)?$"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/file/BaseFileServlet.java#L39
    Pattern.compile("(?:.*? )?gzip(?:,.*)?"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/file/BaseFileServlet.java#L40
    Pattern.compile("(?:.*? )?br(?:,.*)?"),
    // https://github.com/theandrewbailey/toilet/blob/fcc5e3c750d512dde7e1f1895fe6065b0fd3f91a/libWebsiteTools/src/libWebsiteTools/file/BaseFileServlet.java#L43
    Pattern.compile("^(.*?)file(?:Immutable/([^/]+))?/([^\\?]+)\\??(.*)?"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L753
    Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L766
    Pattern.compile("^\\d{16}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L786
    Pattern.compile("^\\(?[\\d]{3}\\)?[\\s-]?[\\d]{3}[\\s-]?[\\d]{4}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L800
    Pattern.compile("^[\\w-]+(?:\\.[\\w-]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L812
    Pattern.compile("([\\/ .,:0-9a-zA-Z])+$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/session/ParameterParser.java#L824
    Pattern.compile("^(((https?)://)([-()_.!~*';/?:@&=+$,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/instructor/CrossSiteScripting/UpdateProfile_i.java#L64
    Pattern.compile("[a-zA-Z0-9,\\.\\- ]{0,80}"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L127
    Pattern.compile("\\[(?:[^]|]+\\|)?([^]]+)]"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L132
    Pattern.compile("#.*$"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L232
    Pattern.compile("Ä"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L233
    Pattern.compile("Ö"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L234
    Pattern.compile("Ü"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L235
    Pattern.compile("ä"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L236
    Pattern.compile("ö"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L237
    Pattern.compile("ü"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L238
    Pattern.compile("ß"),
    // https://github.com/denkbares/d3web-KnowWE/blob/09785809e13f02b1b36f5068e2187e88c8e9db71/KnowWE-Essentials/KnowWE-core/src/main/java/de/knowwe/core/utils/KnowWEUtils.java#L562
    Pattern.compile("/+$"),
    // https://github.com/hiphopsid/Bajao_MusicPlayer/blob/6285ff98829e183d3feff636b20448eb4eb28664/app/src/main/java/com/miniproject/bajao_music_player/model/lyrics/SynchronizedLyricsLRC.java#L7
    Pattern.compile("((?:\\[.*?\\])+)(.*)"),
    // https://github.com/hiphopsid/Bajao_MusicPlayer/blob/6285ff98829e183d3feff636b20448eb4eb28664/app/src/main/java/com/miniproject/bajao_music_player/model/lyrics/SynchronizedLyricsLRC.java#L8
    Pattern.compile("\\[(\\d+):(\\d{2}(?:\\.\\d+)?)\\]"),
    // https://github.com/hiphopsid/Bajao_MusicPlayer/blob/6285ff98829e183d3feff636b20448eb4eb28664/app/src/main/java/com/miniproject/bajao_music_player/model/lyrics/SynchronizedLyricsLRC.java#L9
    Pattern.compile("\\[(\\D+):(.+)\\]"),
    // https://github.com/DungeonMaster1990/112ProxyMonitoringBackend/blob/5f96008ee9ce5dd8c2a2803cec1b9d9e261b1271/src/main/java/ru/vtb/monitoring/vtb112/logging/CustomRequestInterceptor.java#L18
    Pattern.compile("[^|(\\d+.+\\d).]*$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/testing-modules/testing/src/test/java/com/baeldung/testing/truth/GoogleTruthUnitTest.java#L231
    Pattern.compile("[a-zA-Z\\s]+"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/testing-modules/testing/src/test/java/com/baeldung/javafaker/JavaFakerUnitTest.java#L69
    Pattern.compile("([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9]?[A-Za-z]))))\\s?[0-9][A-Za-z]{2})"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/testing-modules/testing/src/test/java/com/baeldung/javafaker/JavaFakerUnitTest.java#L75
    Pattern.compile("^\\d{5}(?:[-\\s]\\d{4})?$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/testing-modules/testing/src/test/java/com/baeldung/javafaker/JavaFakerUnitTest.java#L104
    Pattern.compile("\\w{4}\\d{2}@gmail.com"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/testing-modules/testing/src/test/java/com/baeldung/javafaker/JavaFakerUnitTest.java#L109
    Pattern.compile("[a-z1-9]{10}"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/spring-rest-query-language/src/main/java/com/baeldung/web/controller/UserController.java#L67
    Pattern.compile("(\\w+?)(:|<|>)(\\w+?),"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/spring-mvc-java/src/test/java/com/baeldung/aop/AopXmlConfigPerformanceIntegrationTest.java#L64
    Pattern.compile("Execution of findById took \\d+ ms"),
    // https://github.com/samod667/mmn13/blob/7e3a5992f9a688e593b6819cfb126a3decd59005/src/PolygonTester.java#L95
    Pattern.compile("\\([+-]?(\\d+([.]\\d*)?([eE][+-]?\\d+)?|[.]\\d+([eE][+-]?\\d+)?)\\,[+-]?(\\d+([.]\\d*)?([eE][+-]?\\d+)?|[.]\\d+([eE][+-]?\\d+)?)\\)"),
    // https://github.com/isaachambers/qa_exercise_cgm/blob/6dbb4eb88e4e953e79de8162f4b3602ecbf2aec9/src/main/java/cgmqa/demo/service/impl/QuestionExtractorImpl.java#L22
    Pattern.compile("\"([^\"]*)\""),
    // https://github.com/netarchivesuite/solrwayback/blob/d7f8c6e1d1aa7f80ed15561e94db6e48acc18de4/src/main/java/dk/kb/netarchivesuite/solrwayback/solr/NetarchiveSolrClient.java#L49
    Pattern.compile("[-_.a-zA-Z0-9Ã¦Ã¸Ã¥Ã†Ã˜Ã…]+"),
    // https://github.com/EurusHomles/isoftstone/blob/56e66e859ae0d8117be44cf7d9beef2e0d47dbea/src/com/isoftstone/pcis/java/learn/LearnPattern.java#L8
    Pattern.compile("\\{([^}]*)\\}"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-beans/src/test/java/org/springframework/beans/propertyeditors/CustomEditorTests.java#L673
    Pattern.compile("a.*"),
    // https://github.com/linlurui/entityQueryable/blob/20298394a4f08bb7a3791569452898acb2a17b38/src/entity/query/core/DataSourceFactory.java#L147
    Pattern.compile("&amp;"),
  };
}
