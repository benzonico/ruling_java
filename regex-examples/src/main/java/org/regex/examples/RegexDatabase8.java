package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase8 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/3%E7%A5%A8%E5%8A%A1%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/AccWebTk/src/com/goldsign/acc/app/query/controller/TicketStorageQueryController.java#L564
    Pattern.compile("(?sm)(\"(\"))"),
    // https://github.com/wuqq-20191129/wlmq/blob/ae26d439af09097b65c90cad8d22954cd91fe5f5/3%E7%A5%A8%E5%8A%A1%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/AccWebTk/src/com/goldsign/acc/app/query/controller/TicketStorageQueryController.java#L563
    Pattern.compile("(?sm)\"?([^\"]*(\"{2})*[^\"]*)\"?.*,"),
    // https://github.com/alaindesilets/iutools/blob/5577c087e1c9ad1d89bb7af75db2ba1c86730aaa/iutools-core/src/main/java/ca/pirurvik/iutools/corpus/CompiledCorpus.java#L51
    Pattern.compile(".*?(^|[^/\\\\.]*)\\.ES\\.json$"),
    // https://github.com/alaindesilets/iutools/blob/5577c087e1c9ad1d89bb7af75db2ba1c86730aaa/iutools-core/src/main/java/ca/pirurvik/iutools/corpus/CompiledCorpus.java#L743
    Pattern.compile("(.)"),
    // https://github.com/alaindesilets/iutools/blob/5577c087e1c9ad1d89bb7af75db2ba1c86730aaa/iutools-core/src/main/java/ca/pirurvik/iutools/concordancer/WebConcordancer.java#L413
    Pattern.compile("(.*?)/(iu|in|fr|en)?(/?)"),
    // https://github.com/alaindesilets/iutools/blob/5577c087e1c9ad1d89bb7af75db2ba1c86730aaa/iutools-core/src/main/java/ca/pirurvik/iutools/concordancer/WebConcordancer.java#L424
    Pattern.compile("/en/?$"),
    // https://github.com/alaindesilets/iutools/blob/5577c087e1c9ad1d89bb7af75db2ba1c86730aaa/iutools-core/src/main/java/ca/inuktitutcomputing/lib/cgi_lib.java#L134
    Pattern.compile("^c=([a-zA-Z]+)(&.+)$"),
    // https://github.com/elgayedamir/taste-of-spring-batch/blob/9a5b59a9f8a5e8019fad2f634dc6e7af447a619c/src/main/java/com/elgayed/rest/EvaluationController.java#L32
    Pattern.compile("url\\d+"),
    // https://github.com/Daglas69/AdopteUnSport/blob/c09c4775db508873730861e09cca5c090b6d6131/AdopteUnSport/src/main/java/fr/univlyon1/m1if/m1if10/gr14/util/PasswordHelper.java#L18
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?!=\\s+).{5,30}$"),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L303
    Pattern.compile(": "),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L330
    Pattern.compile(" says: "),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L335
    Pattern.compile("INFO] <"),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L336
    Pattern.compile("> "),
    // https://github.com/codieradical/MineOnline/blob/f9922f365b6a7e84689f706f69a1eef48885fc45/src/gg/codie/mineonline/server/MinecraftServerLauncher.java#L341
    Pattern.compile("INFO]: <"),
    // https://github.com/Joseplh/CSCapstone2020/blob/9f4a7ecde47ebf32347a97d896b117052d1b28a9/Dragons%20Lair/src/main/java/Customers.java#L306
    Pattern.compile("[a-zA-z0-9_.!#$%&'*+-/=?^_`{|}~;]+@[\\w]+.[\\w]+.{0,1}[\\w]+"),
    // https://github.com/Joseplh/CSCapstone2020/blob/9f4a7ecde47ebf32347a97d896b117052d1b28a9/Dragons%20Lair/src/main/java/Customers.java#L307
    Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{4}"),
    // https://github.com/Joseplh/CSCapstone2020/blob/9f4a7ecde47ebf32347a97d896b117052d1b28a9/Dragons%20Lair/src/main/java/Customers.java#L369
    Pattern.compile("^$|[a-zA-z0-9_.!#$%&'*+-/=?^_`{|}~;]+@[\\w]+\\.[\\w]+.{0,1}[\\w]"),
    // https://github.com/Joseplh/CSCapstone2020/blob/9f4a7ecde47ebf32347a97d896b117052d1b28a9/Dragons%20Lair/src/main/java/Customers.java#L370
    Pattern.compile("^$|\\(\\d{3}\\)\\d{3}\\-\\d{4}"),
    // https://github.com/divvydev/crypto-conditions/blob/c45740ae5ff60f6a1a90720ce5774cc78c474ecb/crypto-conditions/src/main/java/com/ripple/cryptoconditions/CryptoConditionUri.java#L50
    Pattern.compile("^ni://([A-Za-z0-9_-]?)/sha-256;([a-zA-Z0-9_-]{0,86})\\?(.+)$"),
    // https://github.com/liuyu3412/jeesite2.0/blob/c79d5bda3cd804979fee46fb08df9e1da87b11e6/src/main/java/com/thinkgem/jeesite/modules/cms/service/DianUserService.java#L137
    Pattern.compile("^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$"),
    // https://github.com/liuyu3412/jeesite2.0/blob/c79d5bda3cd804979fee46fb08df9e1da87b11e6/src/main/java/com/thinkgem/jeesite/common/utils/SendMailUtil.java#L62
    Pattern.compile("\\w+@(\\w+)(\\.\\w+){1,2}"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-indexer/indexer-core/src/main/java/org/apache/maven/index/artifact/VersionUtils.java#L34
    Pattern.compile("^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$|^([0-9]{8}.[0-9]{6})-([0-9]+)$|^(.*)([0-9]{8}.[0-9]{6})-([0-9]+)$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-indexer/indexer-core/src/main/java/org/apache/maven/index/artifact/M1GavCalculator.java#L39
    Pattern.compile("^([^0-9]+)-([0-9].+)\\.([^0-9]+)(\\.md5|\\.sha1){0,1}$"),
    // https://github.com/kupl/NPE-Injected-Benchmarks/blob/1224fd5ff53782548c3232cb96038b6f13adfc36/benchmarks/maven-indexer/indexer-core/src/main/java/org/apache/maven/index/artifact/M1GavCalculator.java#L42
    Pattern.compile("^([a-z0-9-_]+)-([0-9-].+)\\.([^0-9]+)(\\.md5|\\.sha1){0,1}$"),
    // https://github.com/cadpage/cadpage-parsers/blob/552c01dc39cb35df0158d9ba2624205d3a358f2e/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/NC/NCStanlyCountyBParser.java#L76
    Pattern.compile("(?:ROOM|APT|LOT|RM) +(.*)|[A-Z]?\\d{1,4}[A-Z]?"),
    // https://github.com/cadpage/cadpage-parsers/blob/552c01dc39cb35df0158d9ba2624205d3a358f2e/cadpage-parsers/src/main/java/net/anei/cadpage/parsers/NC/NCStanlyCountyBParser.java#L104
    Pattern.compile("([A-Z0-9]+)-(\\S.*)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L34
    Pattern.compile("(\\d+)?d(\\d+)(?>k(l)?(\\d+))?"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L36
    Pattern.compile("(\\+|-|\\*|×|/|÷|≤|⩽|<=|≥|⩾|>=|==|≠|<>|=/=|!=|<|>)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L38
    Pattern.compile("(\\*|×)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L39
    Pattern.compile("(/|÷)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L40
    Pattern.compile("(≤|⩽|<=)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L41
    Pattern.compile("(≥|⩾|>=)"),
    // https://github.com/Justis-Lamanna/Fracktail_3/blob/729ad8317f399e73d7b126a0388ce8e9b3158771/src/main/java/com/github/lucbui/fracktail3/dicebot/DiceBot.java#L42
    Pattern.compile("(≠|<>|=/=|!=)"),
    // https://github.com/badalsarkar/Blink/blob/4d1d8780548af640e0363664f973181576df62d6/src/test/java/com/badalsarkar/blink/test/TestExtractor.java#L19
    Pattern.compile("(http|https):\\/\\/[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L13
    Pattern.compile("\\(long\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L14
    Pattern.compile("\\(int\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L15
    Pattern.compile("\\(short\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L16
    Pattern.compile("\\(double\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L17
    Pattern.compile("\\(byte\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L18
    Pattern.compile("\\(boolean\\)"),
    // https://github.com/Acrylic125/AcrylicMinecraftLib/blob/001ec047cbfe32a040b3ec134aef14358d1f4f84/Universal/src/main/java/com/acrylic/universal/files/parsers/ConfigIdentifiers.java#L19
    Pattern.compile("\\(float\\)"),
    // https://github.com/GiansCode/SellChest/blob/a22288628d5148e937aa31809db57a9af2e9267e/src/main/java/com/thesquadmc/sellchest/listener/InteractListener.java#L40
    Pattern.compile(".* ([0-9]+)/([0-9]+)"),
    // https://github.com/teamfx/openjfx-10-dev-tests/blob/0dbf565fbe0c9ad222b81701892fea02a03e929e/functional/appBundlerTestsJDK9/appBundlerTestsJDK9/src/com/oracle/appbundlers/utils/installers/MacAbstractBundlerUtils.java#L259
    Pattern.compile("\\s+-+\\s+"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/domain/src/main/java/org/fao/geonet/domain/ISODate.java#L423
    Pattern.compile("T"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/domain/src/main/java/org/fao/geonet/domain/ISODate.java#L521
    Pattern.compile("-|/"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/services/src/main/java/org/fao/geonet/api/records/formatters/groovy/template/TNodeFactoryRepeat.java#L59
    Pattern.compile("\\s+in\\s+"),
    // https://github.com/andreyvit/yoursway-sadr/blob/d4d5728c9935ef995e3f08031f2cb4f5dd65dabb/com.yoursway.sadr.python.analysis/src/com/yoursway/sadr/python/analysis/unused/typeannotations/AnnotationParser.java#L50
    Pattern.compile("[\\s]*,[\\s]*"),
    // https://github.com/camptocamp/geocat/blob/bcfb95292f40257c9ceaab23cf973e37b06d06cc/wro4j/src/main/java/org/fao/geonet/wro4j/GeonetWroModelFactory.java#L671
    Pattern.compile("WEB-INF/"),
    // https://github.com/biblelamp/JavaExercises/blob/6625a4600663e78942bdce5c687a6ad8ced36104/Java%202/bot/SimpleBot.java#L100
    Pattern.compile("[ {,|.}?]+"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/java.base/unix/classes/sun/nio/fs/MimeTypesFileTypeDetector.java#L172
    Pattern.compile("[\\p{Blank}\\p{Punct}]+"),
    // https://github.com/agentcoops/gridsweeper/blob/53289d7abd0486d8aa9f6549b96f7961e743b6e5/trunk/src/edu/umich/lsa/cscs/gridsweeper/GridSweeperTool.java#L231
    Pattern.compile("\\s*:\\s*"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/BuildSamplesList.java#L182
    Pattern.compile("([ \\t]*\\n[ \\t]*\\*[ \\t]*)+"),
    // https://github.com/javafxports/openjdk-jfx/blob/4f0addff16de7182752bc60541f44baeb0e99d2a/apps/samples/Ensemble8/src/compiletime/java/ensemble/compiletime/BuildSamplesList.java#L201
    Pattern.compile("\\s+\\("),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/src/jdk.jshell/share/classes/jdk/internal/jshell/tool/Feedback.java#L71
    Pattern.compile("\u241E"),
    // https://github.com/davetron5000/vimdoclet/blob/ab5955dc48fbd8f2a27f1898df609eaae00c6beb/src/java/com/naildrivin5/applications/vimdoclet/Main.java#L557
    Pattern.compile("\n *\n+"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/MessageFile.java#L233
    Pattern.compile(" or "),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/framework/base/src/main/java/org/apache/ofbiz/base/util/StringUtil.java#L329
    Pattern.compile("\\,\\s"),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/framework/base/src/main/java/org/apache/ofbiz/base/util/StringUtil.java#L331
    Pattern.compile("\\="),
    // https://github.com/earl/rhino-mirror/blob/014787f34aaa35b5dd4592e0f3cbc800d8f324c8/toolsrc/org/mozilla/javascript/tools/shell/Global.java#L438
    Pattern.compile("[\n\r]+"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/util/Inflector.java#L25
    Pattern.compile(" |_"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L557
    Pattern.compile("\\s*;\\s*"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-guvnor/src/main/java/org/drools/guvnor/server/ServiceImplementation.java#L874
    Pattern.compile(",\\s?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-base/src/main/java/xyz/cofe/http/HttpHeaders.java#L423
    Pattern.compile("\\s*=\\s*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/main/java/xyz/cofe/uplaunch/cli/TimeInterval.java#L118
    Pattern.compile("\\s+,\\s+|\\s+"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/StatusImpl.java#L139
    Pattern.compile("\\,?\\s+"),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L18
    Pattern.compile("\\+|\\-|\\*|/|％|(\\+\\+)|(\\-\\-)|&|\\||\\^|〜|(\\<\\<)|(\\>\\>\\>)|(\\>\\>)|\\(|\\)"),
    // https://github.com/ErmakMichael/javatraning/blob/adf315411a3962211133f91def2708493306ee9f/src/com/intexsoft/practic2/Task1.java#L24
    Pattern.compile("[0-9,A-F]X"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L16
    Pattern.compile("^\\d{11}+$"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L43
    Pattern.compile("^\\d{2,4}\\-\\d{7,8}+$"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L70
    Pattern.compile("^\\d{6,7}+$"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L83
    Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L144
    Pattern.compile("[a-zA-Z]+$"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L165
    Pattern.compile("[0-9]+(.[0-9]+)?"),
    // https://github.com/hejackey/heproject/blob/3efad5550a9d7500b808d0d8cc7d384267ef2785/commonutil/src/main/java/com/bfb/commons/validator/ValidatorUtil.java#L187
    Pattern.compile("[0-9]+?"),
    // https://github.com/chris-tzehong/eduhub/blob/8c14577d5bab2f748ac7f2794c6976bc003b0ab3/app/src/main/java/com/example/android/eduhub/InformationValidation.java#L62
    Pattern.compile("^.{8,}$"),
    // https://github.com/gokuisashark/ESCIBM/blob/dcd486b7286ecae3d558d832d2bf4309c893a173/ESCIBM/app/src/main/java/com/example/fish/escpart1/InputChecker.java#L66
    Pattern.compile("^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)[0-9a-zA-Z]{8,}$"),
    // https://github.com/gokuisashark/ESCIBM/blob/dcd486b7286ecae3d558d832d2bf4309c893a173/ESCIBM/app/src/main/java/com/example/fish/escpart1/InputChecker.java#L76
    Pattern.compile("^[STFG]\\d{7}[A-Z]$"),
    // https://github.com/gokuisashark/ESCIBM/blob/dcd486b7286ecae3d558d832d2bf4309c893a173/ESCIBM/app/src/main/java/com/example/fish/escpart1/InputChecker.java#L83
    Pattern.compile("^[0-9]{6}$"),
    // https://github.com/gokuisashark/ESCIBM/blob/dcd486b7286ecae3d558d832d2bf4309c893a173/ESCIBM/app/src/main/java/com/example/fish/escpart1/InputChecker.java#L90
    Pattern.compile("^[0-9]{8}$"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L100
    Pattern.compile("(?<=(((?<=(\\+{1}|-{1}|\\*{1}|\\/{1})(\\={1}))|(?=(\\+{1}|-{1}|\\*{1}|\\/{1})(\\={1}))))|([()\\/*%^=])|(([a-zA-Z]\\w{0,100}(\\+{2}|-{2}))|((\\+{2}|-{2})[a-zA-Z]\\w{0,100} ))|(((?<!\\+{1})\\+{1}(?!\\+{1}))|(?<!-{1})(-{1}(?!-{1}))))|(?=(((?<=(\\+{1}|-{1}|\\*{1}|\\/{1})(\\={1}))|(?=(\\+{1}|-{1}|\\*{1}|\\/{1})(\\={1}))))|([()\\/*%^=])|(([a-zA-Z]\\w{0,100}(\\+{2}|-{2}))|((\\+{2}|-{2})[a-zA-Z]\\w{0,100} ))|(((?<!\\+{1})\\+{1}(?!\\+{1}))|(?<!-{1})(-{1}(?!-{1}))))"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L60
    Pattern.compile("(?<=#\\w+)|(?=#\\w+)"),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L12
    Pattern.compile("Windows\\s?(NT|XP)(\\s*)((\\d*\\.\\d*)|(\\d*))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L13
    Pattern.compile("(?<!(Android).{1,100})Linux(?!(.+(Android)))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L14
    Pattern.compile("(?<!(iPad|iPod|iPhone).{1,100})(\\bMac\\s?OS(\\s*)([A-Z]*)(\\s*)((\\d*[\\._]\\d*)|(\\d*)))(?!(.+(iPad|iPod|iPhone)))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L15
    Pattern.compile("(ipad|ipod|iphone)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L16
    Pattern.compile("Android(\\s*)((\\d*\\.\\d*)|(\\d*))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L17
    Pattern.compile("windows ce", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/os/OperatingSystemUtil.java#L18
    Pattern.compile("windows phone", Pattern.CASE_INSENSITIVE),
    // https://github.com/BreakChir/translation-methods/blob/876148a4d598d0ef7589779fe950146943c5bce6/parser-generator/src/main/java/results/ru/breakchir/hw2/hw2Lexer.java#L22
    Pattern.compile("[ \n\t\r]+"),
    // https://github.com/BreakChir/translation-methods/blob/876148a4d598d0ef7589779fe950146943c5bce6/parser-generator/src/main/java/results/ru/breakchir/hw2/hw2Lexer.java#L30
    Pattern.compile("[|]"),
    // https://github.com/BreakChir/translation-methods/blob/876148a4d598d0ef7589779fe950146943c5bce6/parser-generator/src/main/java/results/ru/breakchir/hw2/hw2Lexer.java#L33
    Pattern.compile("[!]"),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L45
    Pattern.compile("(.*?)(\\|)|(.*?\r)", Pattern.CANON_EQ),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L47
    Pattern.compile("(.*?)(\\^)", Pattern.CANON_EQ),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L175
    Pattern.compile("(.*?)(\\^)|(.*[^\\^])", Pattern.CANON_EQ),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L300
    Pattern.compile("(?:\\^FD)([^\\^]*)(?:\\^FS)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L325
    Pattern.compile("(?sm)(\\x0B)([^\\x1C].*)(\\x1C\\x0D|\\x1C)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L349
    Pattern.compile("([^\\|]*)?(\\|)?", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L376
    Pattern.compile("([^\\^]*)?(\\^)?", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L424
    Pattern.compile("(MSH|PID|PV1|ORC)"),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L431
    Pattern.compile("(OBR)"),
    // https://github.com/tims1107/RepairInbound/blob/90f734590b2875140c20cfcaa37c03d9cc33fabf/src/main/java/utils/ParseUtil.java#L444
    Pattern.compile("(DG1|OBX)"),
    // https://github.com/tq0818/schoolApp/blob/c23765043f075c0269b309ed8a6a47e5dad5e96a/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L18
    Pattern.compile("^1[3|4|5|6|7|8|9][0-9]{9}$"),
    // https://github.com/gh289054531/machine_learning_and_data_mining/blob/2945faf35bf0896ccffb0b0fae99d8baaf11116c/Similar%20items%20finding/src/com/similar_items_finding/core/Html2Text.java#L31
    Pattern.compile("[\\d+\\s*`~!@#$%^&*\\(\\)\\+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘：”“’_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/pigcsy/onepig-service/blob/ce0b9ce7c7670973f902d35c0ebc2076be1bd8e2/pig-core/src/main/java/com/one/pig/core/util/text/TextValidator.java#L36
    Pattern.compile("^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(16[6])|(17[0,1,3,5-8])|(18[0-9])|(19[8,9]))\\d{8}$"),
    // https://github.com/Ding-Y1/sy4/blob/a8dbd34f6fe52d02803982c715a3c75f4de96152/Test.java#L77
    Pattern.compile("[0-9a-zA-Z]"),
    // https://github.com/machenggong1996/spring-boot-2.2.x/blob/606e601da962c3a9279e60d9fd9f03cd6bcf1e98/spring-boot-project/spring-boot-tools/spring-boot-maven-plugin/target/maven-plugin-plugin-sources/org.apache.maven.plugins/maven-shade-plugin/3.2.4/sources/org/apache/maven/plugins/shade/DefaultShader.java#L606
    Pattern.compile("(\\[*)?L(.+);"),
    // https://github.com/simonpoole/preset-utils/blob/e889483d7852356bd459a9a812141a3109eebdef/src/main/java/ch/poole/osm/presetutils/ListIcons.java#L70
    Pattern.compile("^\\$\\{ICONPATH\\}(.+)(_[0-9]+)\\.\\$\\{ICONTYPE\\}$"),
    // https://github.com/simonpoole/preset-utils/blob/e889483d7852356bd459a9a812141a3109eebdef/src/main/java/ch/poole/osm/presetutils/ListIcons.java#L71
    Pattern.compile("^\\$\\{ICONPATH\\}(.+)\\.\\$\\{ICONTYPE\\}$"),
    // https://github.com/simonpoole/preset-utils/blob/e889483d7852356bd459a9a812141a3109eebdef/src/main/java/ch/poole/osm/presetutils/ListIcons.java#L72
    Pattern.compile("^(.*\\/)(.+)\\.(.+)$"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L104
    Pattern.compile(".*/visu_config_?(oh_)?([^\\.]+)?\\.xml"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L105
    Pattern.compile("config/visu_config_oh_([a-z0-9_]+)\\.xml"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L255
    Pattern.compile(".*editor/dataproviders/.+\\.(php|json)$"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L256
    Pattern.compile(".*designs/get_designs\\.php$"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L637
    Pattern.compile("^bytes=\\d*-\\d*(,\\d*-\\d*)*$"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L1066
    Pattern.compile("\\s*(,|;)\\s*"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/servlet/CometVisuServlet.java#L1069
    Pattern.compile("/.*$"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/backend/rest/HiddenConfigResource.java#L76
    Pattern.compile("\\$data\\s*=\\s*'(.+)';", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/backend/rest/HiddenConfigResource.java#L77
    Pattern.compile("\\s*(//)?\'([^']+)\'\\s*=>\\s*array\\s*\\(([^\\)]+)\\),?"),
    // https://github.com/openhab/openhab-webui/blob/43b7f5279884e928ff57db8916a6940eacf9be01/bundles/org.openhab.ui.cometvisu/src/main/java/org/openhab/ui/cometvisu/internal/backend/rest/HiddenConfigResource.java#L78
    Pattern.compile("\'([^']+)\'\\s*=>\\s*\\'([^']+)\\',?"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L15
    Pattern.compile("I want a bike."),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L16
    Pattern.compile("I want a (bike|ball)."),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L19
    Pattern.compile("I want a \\w+."),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L53
    Pattern.compile("[abcdefg]+"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L54
    Pattern.compile("[a-g]+"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L55
    Pattern.compile("a{3}bc{8}d{3}ef{3}g"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L61
    Pattern.compile("^a{3}bc{8}d{3}ef{3}g$"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L66
    Pattern.compile("^[A-z]+.[0-9]+$"),
    // https://github.com/Rafal-Stefanski/Git/blob/80ea9388947cacf897cbd97365903dc5355068bf/src/main/java/udemy/java_programming_masterclass/section17/challenge1/Main.java#L68
    Pattern.compile("^[A-z][a-z]+\\.\\d+$"),
    // https://github.com/NeoD1m/MIREAparser/blob/5fefe5508049cd378c9fc535b59f4f3e300688bd/src/com/company/Main.java#L78
    Pattern.compile("[а-яА-Яa-zA-Z 0-9]+\\.[jpgn]+"),
    // https://github.com/oradian/monohash/blob/bf03a897e67e310503eccfad085da4b83b78ec4e/src/main/java/com/oradian/infra/monohash/HashPlan.java#L159
    Pattern.compile("[ \t]*([\r\n]+|$)"),
    // https://github.com/M4TT3O-91/math-server/blob/03ade029be1141c5288288f31aa34e1cc3ab81f9/src/main/java/it/units/MatteoFranco/app/interprete/parser/VariableValuesParser.java#L43
    Pattern.compile("[a-z][a-z0-9]*"),
    // https://github.com/M4TT3O-91/math-server/blob/03ade029be1141c5288288f31aa34e1cc3ab81f9/src/main/java/it/units/MatteoFranco/app/interprete/parser/VariableValuesParser.java#L49
    Pattern.compile("\\-?([0-9]+(\\.[0-9]+)*)"),
    // https://github.com/sb15551/TrainingTasks/blob/ee9f45672b02673a2dd281d74eb482815972ca1d/11_Multithreading/parseSite/src/main/java/Sitemap.java#L24
    Pattern.compile("\\?.+"),
    // https://github.com/scijava/script-editor/blob/ea3389f7455f01a36e18b84e76b4c3a3c2573ad5/src/main/java/org/scijava/ui/swing/script/autocompletion/JythonAutoCompletion.java#L50
    Pattern.compile("^(from[ \\t]+([a-zA-Z_][a-zA-Z0-9._]*)[ \\t]+|)import[ \\t]+([a-zA-Z_][a-zA-Z0-9_]*[ \\ta-zA-Z0-9_,]*)[ \\t]*([\\\\]*|)[  \\t]*(#.*|)$"),
    // https://github.com/bochkov/transmission-remote/blob/c81a0a95376f0d116c5b8645083266adfb1ed84b/src/main/java/com/sb/transmissionremote/AppProperties.java#L23
    Pattern.compile("(?<protocol>https?://)(?<username>.*?):(?<password>.*?)@(?<host>.*?):(?<port>\\d+)/(?<path>.*)"),
    // https://github.com/bochkov/transmission-remote/blob/c81a0a95376f0d116c5b8645083266adfb1ed84b/src/main/java/com/sb/transmissionremote/AppProperties.java#L24
    Pattern.compile("(?<protocol>https?://)(?<host>.*?):(?<port>\\d+)/(?<path>.*)"),
    // https://github.com/apache/camel/blob/2a0abf84740b430a0b7c31c140cdfbb88693f59d/components/camel-salesforce/camel-salesforce-maven-plugin/src/main/java/org/apache/camel/maven/GenerateMojo.java#L308
    Pattern.compile("\\w+\\.{1}\\w+"),
    // https://github.com/apache/camel/blob/2a0abf84740b430a0b7c31c140cdfbb88693f59d/components/camel-salesforce/camel-salesforce-maven-plugin/src/main/java/org/apache/camel/maven/GenerateMojo.java#L316
    Pattern.compile("(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*\\.)+\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*"),
    // https://github.com/scwang90/CodeSmither/blob/49ed85e4e3dd5dba68a423ec29768fdbcfff0063/smither-project-base/src/main/java/com/code/smither/project/base/impl/DefaultModelBuilder.java#L36
    Pattern.compile("^(\\S{2,}?)(?::\\n|：\\n|\\s+|:|：|,|，|\\n|\\(|（)((?:.|\\n)+?)[)）]?$"),
    // https://github.com/scwang90/CodeSmither/blob/49ed85e4e3dd5dba68a423ec29768fdbcfff0063/smither-project-base/src/main/java/com/code/smither/project/base/impl/DefaultModelBuilder.java#L332
    Pattern.compile("^[A-Z0-9]{5,}$"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L35
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=viewthread&tid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L36
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=viewthread&tid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L37
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=redirect&goto=findpost&ptid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L38
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=redirect&goto=findpost&ptid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L39
    Pattern.compile("(http|https)://bbs\\.stuhome\\.net/forum\\.php\\?mod=viewthread&tid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L40
    Pattern.compile("(http|https)://bbs\\.stuhome\\.net/forum\\.php\\?mod=viewthread&tid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L41
    Pattern.compile("(http|https)://bbs\\.stuhome\\.net/read\\.php\\?tid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L42
    Pattern.compile("(http|https)://bbs\\.stuhome\\.net/read\\.php\\?tid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L44
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/home\\.php\\?mod=space&uid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L45
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/home\\.php\\?mod=space&uid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L47
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=forumdisplay&fid=(\\d+)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L48
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=forumdisplay&fid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L50
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=collection&action=view&ctid=(\\d+)(&)(.*)"),
    // https://github.com/scatl/UestcBBS-MVP/blob/859b16b2d707f4d3ed560d0cdf14b773d2049d21/app/src/main/java/com/scatl/uestcbbs/util/ForumUtil.java#L51
    Pattern.compile("(http|https)://bbs\\.uestc\\.edu\\.cn/forum\\.php\\?mod=collection&action=view&ctid=(\\d+)"),
    // https://github.com/ogierpaul/testtemptalend/blob/1f9fcefc021c7600ef3f67ef105c33cee368b889/TESTGITCLOUDADMIN/code/routines/system/DqStringHandling_0.1.item#L24
    Pattern.compile("^[A-Z]([. &-/|][A-Z])*[. &-/|]?$"),
    // https://github.com/ogierpaul/testtemptalend/blob/1f9fcefc021c7600ef3f67ef105c33cee368b889/TESTGITCLOUDADMIN/code/routines/system/DQTechnical_0.1.item#L46
    Pattern.compile("^\\s?((Mr|Mrs|Ms|Miss|Dr|Herr|Monsieur|Hr|Frau|A V M|Admiraal|Admiral|Air Cdre|Air Commodore|Air Marshal|Air Vice Marshal|Alderman|Alhaji|Ambassador|Baron|Barones|Brig|Brig Gen|Brig General|Brigadier|Brigadier General|Brother|Canon|Capt|Captain|Cardinal|Cdr|Chief|Cik|Cmdr|Col|Col Dr|Colonel|Commandant|Commander|Commissioner|Commodore|Comte|Comtessa|Congressman|Conseiller|Consul|Conte|Contessa|Corporal|Councillor|Count|Countess|Crown Prince|Crown Princess|Dame|Datin|Dato|Datuk|Datuk Seri|Deacon|Deaconess|Dean|Dhr|Dipl Ing|Doctor|Dott|Dott sa|Dr|Dr Ing|Dra|Drs|Embajador|Embajadora|En|Encik|Eng|Eur Ing|Exma|Sra|Exmo Sr|F|O|Father|First Lieutient|First Officer|Flt Lieut|Flying Officer|Fr|Frau|Fraulein|Fru|Gen|Generaal|General|Governor|Graaf|Gravin|Group Captain|Grp Capt|H E Dr|H H|H M|H R H|Hajah|Haji|Hajim|Her Highness|Her Majesty|Herr|High Chief|His Highness|His Holiness|His Majesty|Hon|Hr|Hra|Ing|Ir|Jonkheer|Judge|Justice|Khun Ying|Kolonel|Lady|Lcda|Lic|Lieut|Lieut Cdr|Lieut Col|Lieut Gen|Lord|M|M L|M R|Madame|Mademoiselle|Maj Gen|Major|Master|Mevrouw|Miss|Mlle|Mme|Monsieur|Monsignor|Mr|Mrs|Ms|Mstr|Nti|Pastor|President|Prince|Princess|Princesse|Prinses|Prof|Prof Dr|Prof Sir|Professor|Puan|Puan Sri|Rabbi|Rear Admiral|Rev|Rev Canon|Rev Dr|Rev Mother|Reverend|Rva|Senator|Sergeant|Sheikh|Sheikha|Sig|Sig na|Sig ra|Sir|Sister|Sqn Ldr|Sr|Sr D|Sra|Srta|Sultan|Tan Sri|Tan Sri Dato|Tengku|Teuku|Than Puying|The Hon Dr|The Hon Justice|The Hon Miss|The Hon Mr|The Hon Mrs|The Hon Ms|The Hon Sir|The Very Rev|Toh Puan|Tun|Vice Admiral|Viscount|Viscountess|Wg Cdr)\\.?\\s)(.*)$"),
    // https://github.com/ogierpaul/testtemptalend/blob/1f9fcefc021c7600ef3f67ef105c33cee368b889/TESTGITCLOUDADMIN/code/routines/system/DQTechnical_0.1.item#L121
    Pattern.compile("\\s([a-zA-Z]+)$"),
    // https://github.com/ogierpaul/testtemptalend/blob/1f9fcefc021c7600ef3f67ef105c33cee368b889/TESTGITCLOUDADMIN/code/routines/system/DQTechnical_0.1.item#L158
    Pattern.compile("^(.*)?\\s(Jr.|Sr.|Jr|Sr.|III|IV|V)$"),
    // https://github.com/ogierpaul/testtemptalend/blob/1f9fcefc021c7600ef3f67ef105c33cee368b889/TESTGITCLOUDADMIN/code/routines/system/DQTechnical_0.1.item#L191
    Pattern.compile("^\\s?([A-Z].? )?[A-Z][a-z]* ([A-Z].? )?[A-Z][a-z]*\\s?$"),
    // https://github.com/eclipse-vertx/vert.x/blob/bafe6d469a604b37f6e8e10889c22298d19c8bfb/src/main/java/io/vertx/core/net/impl/KeyStoreHelper.java#L206
    Pattern.compile("[,;]"),
    // https://github.com/himanshuyadav9/USerRegisterationLambda/blob/05aff5d8ac49656a7d8f850460ceccb7a58628e9/com/registration/UserRegistration.java#L12
    Pattern.compile("^[A-Z]{1}[a-z]{2,}$"),
    // https://github.com/himanshuyadav9/USerRegisterationLambda/blob/05aff5d8ac49656a7d8f850460ceccb7a58628e9/com/registration/UserRegistration.java#L46
    Pattern.compile("^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$"),
    // https://github.com/himanshuyadav9/USerRegisterationLambda/blob/05aff5d8ac49656a7d8f850460ceccb7a58628e9/com/registration/UserRegistration.java#L61
    Pattern.compile("^[+]?[0-9]{2}[ ][0-9]{10}$"),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspServer.java#L472
    Pattern.compile("trackID=(\\w+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspServer.java#L487
    Pattern.compile("client_port=(\\d+)-(\\d+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspServer.java#L574
    Pattern.compile("(\\w+) (\\S+) RTSP", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspServer.java#L576
    Pattern.compile("(\\S+):(.+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspClient.java#L529
    Pattern.compile("RTSP/\\d.\\d (\\d+) (\\w+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspClient.java#L533
    Pattern.compile("realm=\"(.+)\",\\s+nonce=\"(\\w+)\"", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/streaming/rtsp/RtspClient.java#L537
    Pattern.compile("client_port=(\\d+)-(\\d+).+server_port=(\\d+)-(\\d+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/EliottDo/SpyDroid/blob/8219603310ddcb2fa61089b6bd884616a9a1304b/app/src/main/java/net/majorkernelpanic/spydroid/ui/OptionsActivity.java#L140
    Pattern.compile("([0-9]+)x([0-9]+)"),
    // https://github.com/eXist-db/exist/blob/9a165b5add655358f5e97bbbc0d9d0542bcf98d3/exist-core/src/main/java/org/exist/xquery/value/DecimalValue.java#L52
    Pattern.compile("(\\-|\\+)?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))"),
    // https://github.com/eXist-db/exist/blob/9a165b5add655358f5e97bbbc0d9d0542bcf98d3/exist-core/src/main/java/org/exist/source/URLSource.java#L50
    Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)"),
    // https://github.com/eXist-db/exist/blob/9a165b5add655358f5e97bbbc0d9d0542bcf98d3/exist-core/src/main/java/org/exist/security/internal/Password.java#L55
    Pattern.compile("\\{([A-Z0-9]+)\\}(.*)"),
    // https://github.com/SanthohsJackson/payment-rest-service/blob/55e18b948ab701184aafd03a08f3ebdec7caff30/src/main/java/com/payment/credit/service/CreditCardServiceImpl.java#L105
    Pattern.compile("^[0-9]\\d*$"),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L117
    Pattern.compile("SEPARATOR"),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L143
    Pattern.compile("\\band\\b"),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L149
    Pattern.compile("\\bwith\\b"),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L195
    Pattern.compile("\\[\\]"),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L196
    Pattern.compile("\\]\\["),
    // https://github.com/joshua81/phonoteke/blob/9d45d427ba7f296e77070523ea536c366ff2218f/src/main/java/org/phonoteke/loader/HumanBeats.java#L235
    Pattern.compile("\\p{C}"),
    // https://github.com/beijixing0202/apache-jmeter-3.3/blob/d8b84307fdb3c8c3f3cfd334cf081aa2be1ed196/src/components/org/apache/jmeter/visualizers/RenderAsJSON.java#L40
    Pattern.compile("((\"(\\\\[\"\\\\/bfnrt]|\\\\u[0-9A-Fa-f]{4}|[^\"\\\\])*+\"\\s*:)?\\s*(\"(\\\\[\"\\\\/bfnrt]|\\\\u[0-9A-Fa-f]{4}|[^\"\\\\])*+\"|[^\\{\\[\\]\\}\\,]*)\\s*,?\\s*)"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L107
    Pattern.compile("^CREATE DATABASE \\w+;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L110
    Pattern.compile("^USE \\w+;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L113
    Pattern.compile("^CREATE TABLE \\w+\\(\\w+(\\, \\w+)*\\);$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L116
    Pattern.compile("^INSERT INTO \\w+ VALUES\\('[a-zA-Z0-9 ]+'(, '[a-zA-Z0-9 ]+')*\\);$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L119
    Pattern.compile("^UPDATE \\w+ SET \\w+ = '[a-zA-Z0-9 ]+'(, \\w+ = '[a-zA-Z0-9 ]+')*;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L122
    Pattern.compile("^UPDATE \\w+ SET \\w+ = '[a-zA-Z0-9 ]+'(, \\w+ = '[a-zA-Z0-9 ]+')* WHERE \\w+ = '[a-zA-Z0-9 ]+';$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L125
    Pattern.compile("^SELECT \\* FROM \\w+;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L128
    Pattern.compile("^SELECT \\w+(, [a-zA-Z0-9 ]+)* FROM \\w+;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L131
    Pattern.compile("^DELETE FROM \\w+;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L134
    Pattern.compile("^DELETE FROM \\w+ WHERE \\w+ = '\\w+';$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L137
    Pattern.compile("^SHOW TABLES ;$"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L244
    Pattern.compile("USE "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L245
    Pattern.compile("\\;"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L273
    Pattern.compile("CREATE DATABASE "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L303
    Pattern.compile("CREATE TABLE "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L347
    Pattern.compile("INSERT INTO "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L349
    Pattern.compile(" VALUES\\("),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L388
    Pattern.compile("SELECT \\* FROM "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L420
    Pattern.compile("SELECT "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L422
    Pattern.compile(" FROM "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L455
    Pattern.compile("UPDATE "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L456
    Pattern.compile(" SET "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L458
    Pattern.compile(" = "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L491
    Pattern.compile("SET "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L526
    Pattern.compile("WHERE"),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L560
    Pattern.compile("DELETE FROM "),
    // https://github.com/ManonCbz/DataBaseProject/blob/038410854ac9def35cd8740eba87be03b7a27fe5/src/main/java/menu/Programme2.java#L583
    Pattern.compile("WHERE "),
    // https://github.com/Corvus-ROM/android_packages_apps_Settings/blob/d34563c501ad994459bdd95890f5ef6f282adb30/src/com/android/settings/du/Changelog.java#L60
    Pattern.compile("(={20}|\\d{4}-\\d{2}-\\d{2})"),
    // https://github.com/Corvus-ROM/android_packages_apps_Settings/blob/d34563c501ad994459bdd95890f5ef6f282adb30/src/com/android/settings/du/Changelog.java#L61
    Pattern.compile("([a-f0-9]{7})"),
    // https://github.com/Corvus-ROM/android_packages_apps_Settings/blob/d34563c501ad994459bdd95890f5ef6f282adb30/src/com/android/settings/du/Changelog.java#L62
    Pattern.compile("\\[(\\D.*?)]"),
    // https://github.com/Corvus-ROM/android_packages_apps_Settings/blob/d34563c501ad994459bdd95890f5ef6f282adb30/src/com/android/settings/du/Changelog.java#L63
    Pattern.compile("(\\R\\s+[\\*]\\s.*)"),
    // https://github.com/claudius108/css2xslfo/blob/b6e75bb0bd2828f8d51f7bdd9ef80fb640afb2a3/src/main/java/be/re/util/Util.java#L89
    Pattern.compile("\\p{Digit}{2}:?\\p{Digit}{2}"),
    // https://github.com/claudius108/css2xslfo/blob/b6e75bb0bd2828f8d51f7bdd9ef80fb640afb2a3/src/main/java/be/re/util/Util.java#L93
    Pattern.compile("\\p{Digit}{4}(-\\p{Digit}{2}(-\\p{Digit}{2}(T\\p{Digit}{2}:\\p{Digit}{2}(:\\p{Digit}{2}(.(\\p{Digit})+)?)?(Z|((\\+|-)\\p{Digit}{2}:?\\p{Digit}{2}))?)?)?)?"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/third/insurance/xiaoniu/NiuNiuDealUtil.java#L69
    Pattern.compile("[\u4e00-\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{5}"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/SendSMSUtils.java#L106
    Pattern.compile("<mdsmssendResult>(.*)</mdsmssendResult>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/SendSMSUtils.java#L224
    Pattern.compile("达牛信息"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/SendSMSUtils.java#L224
    Pattern.compile("http://t.cn/RG9TOvp"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/SendSMSUtils.java#L224
    Pattern.compile("400-006-2587"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/MessageHandlingUtil.java#L140
    Pattern.compile("\\#.*?\\#"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu56/common/utils/CommonUtil.java#L191
    Pattern.compile("\"userAgent\":\"(.*?)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L264
    Pattern.compile("\\\\＋"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L265
    Pattern.compile("\\\\＋|/＋"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L523
    Pattern.compile("&yen;"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L524
    Pattern.compile("￥"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L525
    Pattern.compile("\\t*|\r|\n"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/core/src/main/java/com/xiaoniu/modules/utils/StringUtils.java#L528
    Pattern.compile("\\\r\\\n"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("/+(.*)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("(\\([^(]*)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("[‒-―－]\\p{Z}*(.+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("\\.+\\p{Z}*([^.]+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L13
    Pattern.compile("\\p{Z}+(\\P{Z}+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L17
    Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L18
    Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L19
    Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L20
    Pattern.compile(":[0-5]\\d"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java#L50
    Pattern.compile("[(\\[（［+＋]"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/AsYouTypeFormatter.java#L13
    Pattern.compile(" "),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/AsYouTypeFormatter.java#L14
    Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/AsYouTypeFormatter.java#L17
    Pattern.compile("[- ]"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/AsYouTypeFormatter.java#L122
    Pattern.compile("9"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/android/timezone/distro/DistroVersion.java#L11
    Pattern.compile("(\\d{3})\\.(\\d{3})"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/android/timezone/distro/DistroVersion.java#L14
    Pattern.compile("(\\d{3})"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/android/timezone/distro/DistroVersion.java#L16
    Pattern.compile("(\\d{4}\\w)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/android/server/wm/ColorIntentInterceptManager.java#L34
    Pattern.compile("keyword=(.*?)&"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L18
    Pattern.compile("(.+?)(\\d+)-(\\d+)\\[+(.+?)\\]"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L19
    Pattern.compile("(.+?)\\[+(.+)\\]"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L20
    Pattern.compile("\\[{2,}|\\]{2,}"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L68
    Pattern.compile("(?<major>.+?)(?<year>\\d+)-(?<classno>\\d+)(?:[~-](?<classnoTo>\\d+))?(?:[\\[\\(（]+(?<degree>.+?)[\\]\\)）])?"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L175
    Pattern.compile("(\\d+)(-(\\d+))?(单|双)?\\((\\d+),(\\d+)\\)"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L258
    Pattern.compile("(\\d+)(?:[^\\d]+(\\d+))?"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L273
    Pattern.compile("(\\s*)?[\r\n]+(\\s*)?"),
    // https://github.com/langlan/timetable/blob/fa67965e622f7a37c298ca66a64291153d5e9cfe/src/main/java/com/jytec/cs/excel/TextParser.java#L286
    Pattern.compile("(\\d{4,})[^\\d]+(?:\\d{4,}.*([1|一]学期)|[2|二]学期|(秋)|春)"),
    // https://github.com/Baijq/biubiu-framework/blob/b5bab0115541e83cf8e20b90a3b1d89d1d537ffd/biubiu-blog/src/main/java/com/biubiu/blog/util/FormatUtil.java#L10
    Pattern.compile("\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}"),
    // https://github.com/ricoyu/awesome-loser/blob/60f2604d5987b05657fdf101c7e99d4455cc5535/loser-web/src/main/java/com/loserico/web/advice/RestExceptionAdvice.java#L59
    Pattern.compile("\\{(.+)\\}"),
    // https://github.com/ricoyu/awesome-loser/blob/60f2604d5987b05657fdf101c7e99d4455cc5535/commons-lang/src/main/java/com/loserico/common/lang/utils/ReflectionUtils.java#L84
    Pattern.compile("[-_\\s]"),
    // https://github.com/1074685590/myproject/blob/5791f544f996754442bf1817cfe4992216d5c4cd/app/src/main/java/com/liumeng/gaobo/java/Main.java#L139
    Pattern.compile("[abcdH]"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L893
    Pattern.compile("^[a-zA-Z0-9가-힣ㄱ-ㅎㅏ-ㅣ\u318D\u119E\u11A2\u2022\u2025a\u00B7\uFE55]+$"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L931
    Pattern.compile("^[a-zA-Z0-9\\@\\.]+$"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L947
    Pattern.compile("^[a-fA-F0-9]+$"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L988
    Pattern.compile("([0-9]{3})([0-9]{3,4})([0-9]{4})"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L1000
    Pattern.compile("([0-9]{3})"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L1001
    Pattern.compile("([0-9]{3})-([0-9]{3,4})"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L1002
    Pattern.compile("([0-9]{3})-([0-9]{3,4})-([0-9]{4})"),
    // https://github.com/kisoojo/ksbaseapp/blob/a3d5c5069cd841e49e541b812ec83ff0737fc353/library/src/main/java/com/zenoation/library/utils/Utils.java#L1003
    Pattern.compile("([0-9]{3})-([0-9]{3})-([0-9])([0-9]{4})"),
    // https://github.com/EvgenusT/ClientChat/blob/d93abf0eb6b837d2d67c0a1d90d777c165be3f8b/src/main/java/Controller/Controller.java#L179
    Pattern.compile("\\-(?:([^\\-]+))\\:"),
    // https://github.com/ZhangJiaWeiDEV/PracticalProject/blob/28253f78a5c68decabf5a4d81651147101680001/orderManage/order/src/main/java/com/example/order/service/UserServiceImpl.java#L39
    Pattern.compile("^((13[0-9])|(14[1]|[4-9])|(15([0-3]|[5-9]))|(16[2]|[5-7])|(17[0-3]|[5-8])|(18[0-9])|(19[1|8|9]))\\d{8}$"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/webservice/openapi/utils/ValidatedHandler.java#L55
    Pattern.compile("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0,1,3,6-8])|(18[0-9])|(19[8,9])|(166))[0-9]{8}$"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/webservice/openapi/utils/ValidatedHandler.java#L69
    Pattern.compile("^0\\d{9,11}|^0\\d{2,3}-\\d{6,8}$"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/operate/impl/UploadOrderRecordServiceImpl2.java#L1414
    Pattern.compile("^(\\d{6})(19|20)(\\d{2})(1[0-2]|0[1-9])(0[1-9]|[1-2][0-9]|3[0-1])(\\d{3})(\\d|X|x)?$"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L1729
    Pattern.compile("<Financiallist>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L1729
    Pattern.compile("<ShippingNoteList>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L1764
    Pattern.compile("RootCapitalFlowSc"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2097
    Pattern.compile("<financialList>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2097
    Pattern.compile("<shippingNoteList>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2100
    Pattern.compile("gdCfRoot"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2163
    Pattern.compile("</Financiallist>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2162
    Pattern.compile("</ShippingNoteList>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2170
    Pattern.compile("</BodyCapitalFlowTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2170
    Pattern.compile("<BodyCapitalFlowTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/capitalFlow/impl/CapitalFlowServiceImpl2.java#L2509
    Pattern.compile("<(/*[A-Za-z]+)>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L653
    Pattern.compile("RootVehicleSc"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L691
    Pattern.compile("RootDriverSc"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L798
    Pattern.compile("RootPositionSc"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L882
    Pattern.compile("<GoodsInfo>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L923
    Pattern.compile("</Driver>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L923
    Pattern.compile("<Driver>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L922
    Pattern.compile("</GoodsInfo>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L928
    Pattern.compile("</BodyShippingNoteTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L928
    Pattern.compile("<BodyShippingNoteTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L2558
    Pattern.compile("<stOrderGoods>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L2559
    Pattern.compile("gdRoot"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3173
    Pattern.compile("</BodyVehicleSc>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3173
    Pattern.compile("<BodyVehicleSc>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3264
    Pattern.compile("</BodyDriverSc>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3264
    Pattern.compile("<BodyDriverSc>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3652
    Pattern.compile("</Apps>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3652
    Pattern.compile("<Apps>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3651
    Pattern.compile("</BodyEnterpriseTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/service/Logink/impl/LoginkUploadServiceImpl2.java#L3651
    Pattern.compile("<BodyEnterpriseTj>"),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L117
    Pattern.compile("\"formatted_address\":\"(.*?)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L152
    Pattern.compile("\"adcode\":\"(.*?)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L190
    Pattern.compile("\"location\":\"(\\d+\\.\\d+),(\\d+\\.\\d+)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L247
    Pattern.compile("\"province\":\"(.*?)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L249
    Pattern.compile("\"city\":\"(.*?)\""),
    // https://github.com/xiaowen1993/bigniu/blob/00c3fcb3fcf50e7c9f3de8ba9df9dd787906337d/xiaoniu-niu/src/main/java/com/xiaoniu56/common/utils/GPSUtls.java#L251
    Pattern.compile("\"district\":\"(.*?)\""),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/aee/ExceptionLogImpl.java#L45
    Pattern.compile("\n+"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/aee/ExceptionLogImpl.java#L46
    Pattern.compile("^Process:\\s+(.*)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/mediatek/aee/ExceptionLogImpl.java#L47
    Pattern.compile("^Package:\\s+(.*)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/android/graphics/fonts/FontVariationAxis.java#L12
    Pattern.compile("[ -~]{4}"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/org/junit/runner/Description.java#L14
    Pattern.compile("([\\s\\S]*)\\((.*)\\)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/org/hamcrest/core/DescribedAs.java#L9
    Pattern.compile("%([0-9]+)"),
    // https://github.com/PhoenixXC/XLG-qqBot/blob/a98fe8415d15b051f6460e3716f10d78a629a1ee/service/src/main/java/org/xiyoulinux/qqbot/framework/service/online/OnlineService.java#L38
    Pattern.compile("^小组.*(没)?有.*人"),
    // https://github.com/18132201324/Android-BigHomework/blob/db913d440aca0a84a3310cdab7bf58224af04fef/app/src/main/java/com/example/smartcommunityapplication/activities/LoginActivity.java#L194
    Pattern.compile("[1][358]\\d{9}"),
    // https://github.com/LakshanViranga/Covid-JavaFX/blob/3e508899b92ed5720ef725195edc4fb26114efb9/src/covid/json/JSONObject.java#L159
    Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?"),
    // https://github.com/uxdeliv21/submission/blob/15c343f8b3397d5273903db7ee40e61bb066f87e/fbchecker/src/main/java/submission_package/MethodCallExpressionVisitor.java#L64
    Pattern.compile("((https?:\\/\\/[-a-zA-Z0-9]+\\.firebaseio\\.com\\/?)([-a-zA-Z0-9@:%_\\+.~#?&\\/=]*))"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/lexer/Lexer.java#L26
    Pattern.compile("^[\\s\\S]+\\.[A-Z]+\\w+$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L14
    Pattern.compile("^(\\w+\\.)+\\w+$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L15
    Pattern.compile("^@[A-Z]+\\w+(\\([\\s\\S]+\\))?$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L19
    Pattern.compile("^(void|boolean|char|short|int|long|float|double|byte)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L20
    Pattern.compile("^(void|boolean|char|short|int|long|float|double|byte)\\[\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L21
    Pattern.compile("^[A-Z]+\\w*$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L22
    Pattern.compile("^[A-Z]+\\w*\\[\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L23
    Pattern.compile("^[A-Z]+\\w*<[\\s\\S]+>$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L25
    Pattern.compile("^(void|boolean|char|short|int|long|float|double|byte)\\[\\d+\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L26
    Pattern.compile("^(void|boolean|char|short|int|long|float|double|byte)\\[\\]\\{[\\s\\S]*\\}$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L27
    Pattern.compile("^[A-Z]+\\w*\\[\\d+\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L28
    Pattern.compile("^[A-Z]+\\w*\\[\\]\\{[\\s\\S]*\\}$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L29
    Pattern.compile("^[A-Z]+\\w*(<[\\s\\S]+>)?\\([\\s\\S]*\\)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L31
    Pattern.compile("^null$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L32
    Pattern.compile("^(true|false)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L33
    Pattern.compile("^'[\\s\\S]*'$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L35
    Pattern.compile("^\\d+L$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L37
    Pattern.compile("^\"[\\s\\S]*\"$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L38
    Pattern.compile("^\\[[\\s\\S]*\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L39
    Pattern.compile("^\\{[\\s\\S]*\\}$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L41
    Pattern.compile("^\\([\\s\\S]+\\)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L42
    Pattern.compile("^[a-z]+\\w*$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L43
    Pattern.compile("^[A-Z_]{2,}$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L44
    Pattern.compile("^[a-z]+\\w*\\([\\s\\S]*\\)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L45
    Pattern.compile("^\\.[a-z]+\\w*$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L46
    Pattern.compile("^\\.[a-z]+\\w*\\([\\s\\S]*\\)$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L47
    Pattern.compile("^\\.[a-z]+\\w*\\[\\d+\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L48
    Pattern.compile("^[a-z]+\\w*\\[\\d+\\]$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/build/AbsSemanticParser.java#L50
    Pattern.compile("^(\\.)?\\w+$"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/AutoImporter.java#L18
    Pattern.compile("(\\b[A-Z]+\\w+\\b)"),
    // https://github.com/chentaoah/spirit/blob/69692a383f1e71eccf827f6b416c05be0890d42b/spirit-core/src/main/java/com/sum/spirit/core/AutoImporter.java#L36
    Pattern.compile("(?<=\").*?(?=\")"),
    // https://github.com/turlygazhy/arabic-for-all/blob/fe50d869e288a32a4fbde0df0b71f8b5fd4c8e0a/tatoebaimporter/src/main/java/info/puzz/a10000sentences/importer/importers/EuImporter.java#L19
    Pattern.compile("[\\.\\!\\?](?=\\s+\\p{javaUpperCase})"),
    // https://github.com/turlygazhy/arabic-for-all/blob/fe50d869e288a32a4fbde0df0b71f8b5fd4c8e0a/tatoebaimporter/src/main/java/info/puzz/a10000sentences/importer/importers/EuImporter.java#L21
    Pattern.compile("^\\d+\\.$"),
    // https://github.com/turlygazhy/arabic-for-all/blob/fe50d869e288a32a4fbde0df0b71f8b5fd4c8e0a/tatoebaimporter/src/main/java/info/puzz/a10000sentences/importer/WordUtils.java#L35
    Pattern.compile("[^\\p{Mn}]"),
    // https://github.com/kremlsa/JSON_-_XML_converter_Java_Hyperskill/blob/0237635230c3c662988e5e0fcae4b182f8748b53/JSON%20-%20XML%20converter/task/src/converter/XParser.java#L84
    Pattern.compile("(?<=>).*(?=<\\/>)"),
    // https://github.com/DaiJiChen/Android_Learning/blob/9649edeca0c048fd8ddec740280cde9ec343cad5/Udemy_Android_Dev/ud851-Sunshine-student/S07.03-Solution-ConflictResolutionPolicy/app/src/androidTest/java/com/example/android/sunshine/data/TestUtilities.java#L296
    Pattern.compile("No field (\\w*) in class L.*/(\\w*\\$?\\w*);"),
    // https://github.com/prestosql/presto/blob/14e24360438db823d4ac18fbebdb092e6ba01211/presto-hive/src/main/java/io/prestosql/plugin/hive/BackgroundHiveSplitLoader.java#L125
    Pattern.compile("bucket_(\\d+)(_\\d+)?$"),
    // https://github.com/prestosql/presto/blob/14e24360438db823d4ac18fbebdb092e6ba01211/presto-hive/src/main/java/io/prestosql/plugin/hive/BackgroundHiveSplitLoader.java#L129
    Pattern.compile("\\d{8}_\\d{6}_\\d{5}_[a-z0-9]{5}_bucket-(\\d+)(?:[-_.].*)?"),
    // https://github.com/prestosql/presto/blob/14e24360438db823d4ac18fbebdb092e6ba01211/presto-hive/src/main/java/io/prestosql/plugin/hive/BackgroundHiveSplitLoader.java#L131
    Pattern.compile("(\\d+)_\\d+.*"),
    // https://github.com/kkviks/Listicle/blob/9ea793b7d8ebfd58ec26f4b83dd984ef6f0420cd/app/src/main/java/com/example/trackandtrigger/SignUp.java#L151
    Pattern.compile("^[A-Za-z]\\w{5,29}$"),
    // https://github.com/momosecurity/momo-code-sec-inspector-java/blob/5c0cdf68b297b3254fc0ff04bd7f739ff3a2d48b/src/main/java/com/immomo/momosec/lang/java/rule/momosecurity/HardcodedCredentials.java#L38
    Pattern.compile("passwd|pass|password|pwd|secret|token", Pattern.CASE_INSENSITIVE),
    // https://github.com/momosecurity/momo-code-sec-inspector-java/blob/5c0cdf68b297b3254fc0ff04bd7f739ff3a2d48b/src/main/java/com/immomo/momosec/lang/java/rule/momosecurity/HardcodedCredentials.java#L39
    Pattern.compile("password=(.*?)($|&)", Pattern.CASE_INSENSITIVE),
    // https://github.com/liferay/liferay-portal/blob/a10b049baa9f4b31888c99fc4827693c93c6db1b/modules/apps/static/portal-lpkg-deployer/portal-lpkg-deployer-impl/src/main/java/com/liferay/portal/lpkg/deployer/internal/LPKGBundleTrackerCustomizer.java#L932
    Pattern.compile("([a-zA-Z0-9_\\-\\.]+?)-\\d+[\\.\\d+]?[\\.\\d+]?(\\.[a-zA-Z0-9_-]+)*(\\..+)"),
    // https://github.com/rainchat/MenuRpg/blob/2bbd3733d71cbe565785021a1a3342cacb95da4e/src/main/java/main/menurpg/utility/Executor.java#L25
    Pattern.compile("(?iu)(tell|console|player|closemenu|openmenu)([:])(.*)"),
    // https://github.com/gbif/embl-adapter/blob/d9b1d4d0ae1843d98eb621ade69db3e74ff78d57/src/main/java/org/gbif/embl/util/EmblAdapterConstants.java#L33
    Pattern.compile("([0-9.]+\\s+\\w)\\s+([0-9.]+\\s+\\w)"),
    // https://github.com/IceTeaIsLife/edu_java/blob/79fc7e9ea8688f72fddae6f7b3634b184ebd7652/Projects/src/main/java/Practice_23_24/Worker.java#L109
    Pattern.compile("(?<foperand>[-]*\\d+)(?<operator>[-+*/])(?<soperand>[-]*\\d+)"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/core-java-modules/core-java-regex/src/test/java/com/baeldung/replacetokens/ReplacingTokensUnitTest.java#L58
    Pattern.compile("[<(\\[{\\\\^\\-=$!|\\]})?*+.>]"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/core-java-modules/core-java-regex/src/test/java/com/baeldung/replacetokens/ReplacingTokensUnitTest.java#L68
    Pattern.compile("\\$\\{(?<placeholder>[A-Za-z0-9-_]+)}"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/core-java-modules/core-java-regex/src/test/java/com/baeldung/regexp/EscapingCharsUnitTest.java#L33
    Pattern.compile("\\Q|\\E"),
    // https://github.com/Xbc-gressor/Practice_BigData/blob/092d66e864a664e1fc7ff56957de2e0669c16c61/01%E6%8A%80%E6%9C%AF%E5%AD%A6%E4%B9%A0/day0203/HadoopTest/src/com/demo/salary/SalaryMapper.java#L26
    Pattern.compile("\\u7ecf\\u9a8c"),
    // https://github.com/Xbc-gressor/Practice_BigData/blob/092d66e864a664e1fc7ff56957de2e0669c16c61/01%E6%8A%80%E6%9C%AF%E5%AD%A6%E4%B9%A0/day0203/HadoopTest/src/com/demo/salary/SalaryMapper.java#L36
    Pattern.compile("/[\\u5e74\\u6708]"),
    // https://github.com/eurosatura/Bulls_and_Cows/blob/a04122b7d2ade08bf92ab63c248b046ba1b71907/Bulls%20and%20Cows/task/test/BullsCowsTest.java#L158
    Pattern.compile("\\[|\\]|, "),
    // https://github.com/eurosatura/Bulls_and_Cows/blob/a04122b7d2ade08bf92ab63c248b046ba1b71907/Bulls%20and%20Cows/task/test/BullsCowsTest.java#L192
    Pattern.compile("\\b[nN]one\\b"),
    // https://github.com/eurosatura/Bulls_and_Cows/blob/a04122b7d2ade08bf92ab63c248b046ba1b71907/Bulls%20and%20Cows/task/test/BullsCowsTest.java#L193
    Pattern.compile("\\b\\d [cC]ows?"),
    // https://github.com/eurosatura/Bulls_and_Cows/blob/a04122b7d2ade08bf92ab63c248b046ba1b71907/Bulls%20and%20Cows/task/test/BullsCowsTest.java#L194
    Pattern.compile("\\b\\d [bB]ulls?"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L31
    Pattern.compile("(\\p{Nd})"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L42
    Pattern.compile("\\(?\\$1\\)?"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L43
    Pattern.compile("(\\$\\d)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L52
    Pattern.compile("(\\D+)"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L55
    Pattern.compile("[+＋]+"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L63
    Pattern.compile("[\\\\/] *x"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L65
    Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L66
    Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L69
    Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L71
    Pattern.compile("[, \\[\\]]"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L72
    Pattern.compile("(?:.*?[A-Za-z]){3}.*"),
    // https://github.com/dstmath/OppoFramework/blob/ebe39acabf5eae49f5f991c5ce677d62b683f1b6/A72n_10_0_0/src/main/java/com/google/i18n/phonenumbers/PhoneNumberUtil.java#L76
    Pattern.compile("[+＋\\p{Nd}]"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-data/src/test/java/com/baeldung/kafkastreams/KafkaStreamsLiveTest.java#L41
    Pattern.compile("\\W+", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-6/src/main/java/com/baeldung/reflections/ReflectionsApp.java#L59
    Pattern.compile(".*pom\\.xml"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-3/src/main/java/com/baeldung/jcommander/usagebilling/cli/validator/UUIDValidator.java#L11
    Pattern.compile("[0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-2/src/main/java/com/baeldung/crawler4j/ImageCrawler.java#L12
    Pattern.compile(".*(\\.(css|js|xml|gif|png|mp3|mp4|zip|gz|pdf))$"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-2/src/main/java/com/baeldung/crawler4j/ImageCrawler.java#L14
    Pattern.compile(".*(\\.(jpg|jpeg))$"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/libraries-2/src/main/java/com/baeldung/crawler4j/HtmlCrawler.java#L13
    Pattern.compile(".*(\\.(css|js|xml|gif|jpg|png|mp3|mp4|zip|gz|pdf))$"),
    // https://github.com/shydesky/tutorials/blob/13c601c4e4e271f6e379a8ff7166ac5b5ac033c3/json-2/src/test/java/com/baeldung/moshi/SimpleAdapterUnitTest.java#L39
    Pattern.compile("^(.*) <(.*)>$"),
    // https://github.com/whyhardpickname/introJava10e/blob/854ac59aa4a781445f35f9c1924fcab56c762767/ch12/exercises/ex28.java#L21
    Pattern.compile("Exercise[0-9]+_[0-9]+\\.java"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/PageHeader.java#L416
    Pattern.compile("<(f[0-9]{1,3}(r|v)[0-9]?|fRos)>(\\s+<!((\\s+\\$[QPIKLHX]=.)*)\\s*>)?"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffText.java#L165
    Pattern.compile("#=IVTFF (.{4}) ([0-9]+\\.[0-9]+)(\\.[0-9]+)?"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffText.java#L174
    Pattern.compile("<f[0-9]{1,3}[rv][0-9]?>|<fRos>"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L93
    Pattern.compile("<(f[0-9]{1,3}[rv][0-9]?|fRos)\\.([0-9]{1,3}[a-z]?),([\\+\\*\\-=&~@/][PLCR].)(;.)?>"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L142
    Pattern.compile("<\\->"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L179
    Pattern.compile("<[^>]{1,2}>"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L193
    Pattern.compile("<![^>]*>"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L204
    Pattern.compile("@[0-9]{3};"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L234
    Pattern.compile("\\[[^\\]]*\\]"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L244
    Pattern.compile("\\[([^\\]:]*)(:[^\\]:]*)+\\]"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L301
    Pattern.compile("\\{|\\}"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L303
    Pattern.compile("%+"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/text/ivtff/IvtffLine.java#L305
    Pattern.compile("!+"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/support/BuildBibleTranscription.java#L30
    Pattern.compile("<seg id=[\"'][^'\"]*[\"'] type=[\"']verse[\"']>([^<]+)</seg>"),
    // https://github.com/mzattera/v4j/blob/c8976cdd194707cb84a64b1f613eb84ca819e89d/org.v4j/src/main/java/io/github/mattera/v4j/support/BuildBibleTranscription.java#L60
    Pattern.compile(".xml"),
    // https://github.com/yuanhawk/InfoSys1D/blob/74f3303da43e8f1a31bfc90c0ec7ed6f2308bd65/LandingPage/PUG/app/src/test/java/tech/sutd/pickupgame/Utils.java#L19
    Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/slicktorchen/slicktorchen.github.io/blob/fc321b0c4c889c813d1e1259814d499700897c18/vendor/bundle/ruby/2.7.0/gems/http_parser.rb-0.6.0/ext/ruby_http_parser/vendor/http-parser-java/src/test/http_parser/lolevel/TestLoaderNG.java#L67
    Pattern.compile("(\\S+)\\s*:(.*)"),
    // https://github.com/slicktorchen/slicktorchen.github.io/blob/fc321b0c4c889c813d1e1259814d499700897c18/vendor/bundle/ruby/2.7.0/gems/http_parser.rb-0.6.0/ext/ruby_http_parser/vendor/http-parser-java/src/test/http_parser/lolevel/TestLoaderNG.java#L118
    Pattern.compile("\\{ ?\"([^\"]*)\": ?\"(.*)\"}"),
    // https://github.com/Wizard2069/Quan-ly-dan-pho/blob/8a282aa84865ffcdcb700b8cbeaba973a8288c50/quanlydanpho-server/qldp-people-service/src/main/java/com/company/qldp/peopleservice/domain/validation/phone/PhoneConstraintValidator.java#L16
    Pattern.compile("(03|07|08|09|01[2|6|8|9])+([0-9]{8})\\b"),
    // https://github.com/dongyinuo/spring-boot-analysis/blob/50c8eb5fc77f910e0abc6e991cef3d0b8e942d05/spring-boot-project/spring-boot-tools/spring-boot-test-support/src/main/java/org/springframework/boot/testsupport/runner/classpath/ModifiedClassPathRunner.java#L71
    Pattern.compile(".*classpath(\\d+)?\\.jar"),
    // https://github.com/bali-ibrahim/school/blob/4f0520944af65c0188fdf43b9f06c0be67985d4e/Computer%20Networks%20(CSE-571)/TCP/services/http/HTTPService.java#L75
    Pattern.compile("HTTP\\/(\\S*?) (\\S*?) (.*?)(?:\\n|\\r)+", Pattern.MULTILINE),
    // https://github.com/NextSap/AzSounder/blob/df86ba9647dca3cbebaa06d45edd4c1525af751d/src/main/java/com/nextsap/sounder/utils/SplitUtils.java#L7
    Pattern.compile("([a-zA-Z0-9_]{3,16})"),
    // https://github.com/NextSap/AzSounder/blob/df86ba9647dca3cbebaa06d45edd4c1525af751d/src/main/java/com/nextsap/sounder/utils/SplitUtils.java#L24
    Pattern.compile("] "),
    // https://github.com/NextSap/AzSounder/blob/df86ba9647dca3cbebaa06d45edd4c1525af751d/src/main/java/com/nextsap/sounder/utils/SplitUtils.java#L24
    Pattern.compile(" -> "),
    // https://github.com/NextSap/AzSounder/blob/df86ba9647dca3cbebaa06d45edd4c1525af751d/src/main/java/com/nextsap/sounder/utils/SplitUtils.java#L26
    Pattern.compile("([A-D][0-9]{1,6})"),
    // https://github.com/ddraco-d/JavaLabs/blob/6baf79e41a8d362e3c34c0a2050f7b1ad81b42a3/src/main/java/com/company/Lab23_24/Worker.java#L71
    Pattern.compile("(?<first>[-]*\\d+)(?<operator>[+-/*])(?<second>[-]*\\d+)"),
    // https://github.com/Md-Maqsood/Workshop_HotelReservationProgram/blob/800fd8f3b4d7a19af9d376c4823736673d4df64a/src/main/java/com/bridgeLabs/hotelReservation/HotelReservation.java#L23
    Pattern.compile("[0-9]{2}[A-Z][a-z]{2}[0-9]{4}"),
    // https://github.com/Md-Maqsood/Workshop_HotelReservationProgram/blob/800fd8f3b4d7a19af9d376c4823736673d4df64a/src/main/java/com/bridgeLabs/hotelReservation/HotelReservation.java#L24
    Pattern.compile("Re[gw][ua][lr][ad][rs]"),
    // https://github.com/Md-Maqsood/Workshop_HotelReservationProgram/blob/800fd8f3b4d7a19af9d376c4823736673d4df64a/src/main/java/com/bridgeLabs/hotelReservation/HotelReservation.java#L22
    Pattern.compile("^((Regular)|(Rewards)){1}[:]{1}([0-9]{2}[A-Z][a-z]{2}[0-9]{4}[,][ ])*([0-9]{2}[A-Z][a-z]{2}[0-9]{4}){1}$"),
    // https://github.com/rudani-c/MoviesChart/blob/4e18495741a1423219b2e61832ecafec148f2f08/app/src/main/java/com/rudanic/movieschart/utils/Utils.java#L88
    Pattern.compile("^https?://.*(?:youtu.be/|v/|u/\\w/|embed/|watch?v=)([^#&?]*).*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/qianmua/note-rubbish/blob/35f178324dadd37084e8d7874a5ab3710dbc43b3/src/main/java/_java_jsonp_/Init.java#L56
    Pattern.compile("objURL\":\"http://.+?\\.jpg"),
    // https://github.com/ScheduleMate/ScheduleMate-User/blob/49060bf1e1386ec004911041dfcd956af35e062c/app/src/main/java/com/schedulemate/schedulemate_user/ui/community/CommunityRecyclerViewAdapter.java#L25
    Pattern.compile("([0-9]{4})-([0-9]{2})-([0-9]{2})\\s([0-9]{2}):([0-9]{2})"),
    // https://github.com/MegaMek/mekhq/blob/eaf437a76113422e9a77da001f1981e1f5cd9a02/MekHQ/src/mekhq/gui/sorter/RankSorter.java#L43
    Pattern.compile("id=\"([^\"]+)\""),
    // https://github.com/unicode-org/icu/blob/b11e4bcba1103c08e2fcb501e90f7a9905ce1e01/icu4j/main/classes/core/src/com/ibm/icu/util/LocalePriorityList.java#L78
    Pattern.compile("\\s*(\\S*)\\s*;\\s*q\\s*=\\s*(\\S*)"),
    // https://github.com/dongyinuo/spring-boot-analysis/blob/50c8eb5fc77f910e0abc6e991cef3d0b8e942d05/spring-boot-project/spring-boot-tools/spring-boot-loader/src/main/java/org/springframework/boot/loader/jar/Handler.java#L51
    Pattern.compile("/./"),
    // https://github.com/panp85/webrtc-win/blob/f7ae294295bb5db9d54ecf10ec0a104673db55c7/examples/androidapp/src/org/appspot/apprtc/DirectRTCClient.java#L37
    Pattern.compile("(((\\d+\\.){3}\\d+)|\\[((([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?)\\]|\\[(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4})\\]|((([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?)|(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4})|localhost)(:(\\d+))?"),
    // https://github.com/i-zanis/RestaurantAPP/blob/c84198dc974e875ed860297ceff39b3e00fd3745/src/PackageFiles/StoreDBManager.java#L89
    Pattern.compile("^\\d{10,11}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/i-zanis/RestaurantAPP/blob/c84198dc974e875ed860297ceff39b3e00fd3745/src/PackageFiles/StoreDBManager.java#L117
    Pattern.compile("^\\w+@(\\w+.[a-zA-Z]+|\\w+.[a-zA-Z]+.[a-zA-Z]+)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/CptAndy/mota_p5/blob/5c7830480ef8e177ebba9c89f98e93236a66e32c/src/ContactListTest.java#L118
    Pattern.compile("\\d{3}-\\d{3}-\\d{4}"),
    // https://github.com/genny-project/prj_genny/blob/681883acedfd2e03a14436e1cf7c25aa763db697/achrive/utils/JunitCache.java#L45
    Pattern.compile(".*value\\\":\\\"(.*)\\\"\\}"),
    // https://github.com/genny-project/prj_genny/blob/681883acedfd2e03a14436e1cf7c25aa763db697/achrive/utils/GennyKieSession.java#L619
    Pattern.compile("(FRM_[A-Z0-9_-]+|THM_[A-Z0-9_-]+)"),
    // https://github.com/genny-project/prj_genny/blob/681883acedfd2e03a14436e1cf7c25aa763db697/achrive/utils/GennyKieSession.java#L621
    Pattern.compile("\\.[^.]*$"),
    // https://github.com/genny-project/prj_genny/blob/681883acedfd2e03a14436e1cf7c25aa763db697/achrive/utils/GennyKieSession.java#L970
    Pattern.compile("PER_SERVICE"),
    // https://github.com/TwitchRecover/TwitchRecover/blob/7842a8888145874ddbbbe19a548100db344069fe/src/MainCLI.java#L358
    Pattern.compile("twitchtracker\\.com\\/([a-zA-Z0-9]*)\\/streams\\/(\\d*)"),
    // https://github.com/TwitchRecover/TwitchRecover/blob/7842a8888145874ddbbbe19a548100db344069fe/src/MainCLI.java#L397
    Pattern.compile("(twitchtracker\\.com\\/([a-z]*)\\/streams\\/(\\d*))"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/scanner/ScannerImpl.java#L1260
    Pattern.compile("[^0-9A-Fa-f]"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L113
    Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L114
    Pattern.compile("^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L115
    Pattern.compile("^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L116
    Pattern.compile("^(?:<<)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L117
    Pattern.compile("^(?:~|null|Null|NULL| )$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L119
    Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L120
    Pattern.compile("^(?:=)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/resolver/Resolver.java#L121
    Pattern.compile("^(?:!|&|\\*)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/representer/SafeRepresenter.java#L85
    Pattern.compile("\n|\u0085|\u2028|\u2029"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor.java#L171
    Pattern.compile("\\p{Alpha}.*\\s*\\((?:,?\\s*(?:(?:\\w*)|(?:\\p{Alpha}\\w*\\s*=.+))\\s*)+\\)"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor.java#L172
    Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor.java#L173
    Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/emitter/Emitter.java#L1049
    Pattern.compile("^![-_\\w]*!$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/emitter/Emitter.java#L1050
    Pattern.compile("^[-_\\w]*$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/constructor/SafeConstructor.java#L185
    Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/yaml/snakeyaml/constructor/SafeConstructor.java#L186
    Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$"),
    // https://github.com/WarriorCrystal/Zenith-0.7-src/blob/34fd7a76d0e1b59518c813da6f5dd339a0425d58/org/spongepowered/tools/obfuscation/AnnotatedMixins.java#L100
    Pattern.compile("^([A-Z0-9\\-_\\.]+)=([0-9]+)$"),
    // https://github.com/thomasstodonte/Ligue1Statistant/blob/ba6535cdaaf67bcfaa27d28576000722f05a27c0/src/com/statistant/ligue1/view/resources/fxml/NewConfrontationOverviewController.java#L143
    Pattern.compile("^[A-Z0-9]+-[A-Z0-9]+$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/InternetBrowser.java#L319
    Pattern.compile(".*\\[LINK\\].*"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/InternetBrowser.java#L324
    Pattern.compile(".*\\[IMAGE\\].*"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L396
    Pattern.compile("(?is)<a href=['\\\"]([^'\\\"]*?)['\\\"] title=['\\\"][^'\\\"]*?\\.(p00|prg|zip|t64|d64|d71|d81|d82|d64\\.gz|d71\\.gz|d81\\.gz|d82\\.gz|t64\\.gz)['\\\"]>"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L399
    Pattern.compile("(?is).*=\\s*[\\\"'][^\\\"']*\\.(p00|prg|zip|t64|d64|d71|d81|d82|d64\\.gz|d71\\.gz|d81\\.gz|d82\\.gz|t64\\.gz)[^\\\"']*[\\\"'].*"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L401
    Pattern.compile("(?is)^.*id=([0-9a-zA-Z_\\-]+).*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L402
    Pattern.compile("(?is)^.*Released by:\\s*<a [^>]*>(.*?)<.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L403
    Pattern.compile("(?is)^.*Type:\\s*[^>]*>(.*?)<.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L482
    Pattern.compile("(?is)^.*<title>\\[CSDb\\] - Search for.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L483
    Pattern.compile("(?is)^.*<font size=6>([^<\\n]+?)</font.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L484
    Pattern.compile("^.*There are no downloads because.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L487
    Pattern.compile("(?is)^.*<a href=\"/voteview.php\\?type=release&id=([^\"'\\n']+?)\">.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L490
    Pattern.compile("(?is)^.*<b>Type :</b><br><a href=\"[^\"\\n]+?\">([^<]+?)<.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L490
    Pattern.compile("(?is)^.*<b>Type :</b><br><a href=\"[^\"\\n]+?\">([^<]+)<.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L491
    Pattern.compile("(?is)^.*<b>Released by :</b><br><a href=\"[^\"]+?\">([^<\\n]+?)</a>.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L492
    Pattern.compile("(?is)^.*<b>Release Date :</b><br>.*?<font [^>\\n]+?>([^<\\n]+?)</font>.*$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L497
    Pattern.compile("<li>\\s*<a href=\"([^\\\"]+?)\">\\s*<img .*?Download.*?>\\s*</a>\\s*<a href=\"([^\\\"]+?)\">([^<]+?)</a>\\s*\\(([^\\)]+?)\\)(\\s*by\\s*.*?<font .*?>([^<]+?)<)?([^\\(\\n]*?\\(([^\\)]+?)\\))?.*?<br>"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L504
    Pattern.compile("(?is)^.*/\\?id=(.*)$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L528
    Pattern.compile("^.*\\.([^\\.]+)$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/CsdbReleasesSD2IEC.java#L590
    Pattern.compile("<a href=\"(download\\.php\\?id=[^\"]+?)\">([^<]+?)</a>( \\(downloads: [0-9]+\\))?"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/ArnoldC64.java#L186
    Pattern.compile("(?is)\\.[a-z0-9]+(\\.gz)?$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/ArnoldC64.java#L264
    Pattern.compile("(?is)href=\"(ftp://[^\"]+\\.(p00|prg|d64|zip|t64|d71|d81|d82|d64\\.gz|t64\\.gz|d81\\.gz|d82\\.gz|d71\\.gz))\""),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/ArnoldC64.java#L269
    Pattern.compile("(?is)^.*href=\".*?embedder=arnold&amp;page=([0-9]+)\">[0-9]+</a>\\s*<div class=\"footer\".*?$"),
    // https://github.com/sblendorio/petscii-bbs/blob/4a9bd31ff541a358bc4fe204aa75ef4b4e5b8dae/src/main/java/eu/sblendorio/bbs/tenants/petscii/ArnoldC64.java#L270
    Pattern.compile("\\s|\n|\r"),
    // https://github.com/RamanSB/HackerRank/blob/4da34dafad9b13200f8c4671f18e133a5d2e6a96/Java/src/TagContentExtractor.java#L54
    Pattern.compile("<(.|[^<>]+)>([^<>]+)</\\1>"),
    // https://github.com/tranhuythang/FullStackJavaCourse/blob/adb8ef257c57c06e35e3411198f84b21f99318dc/Phase1/src/Lesson1/Project_Calculator.java#L22
    Pattern.compile("\\d+([+-x/]\\d+)+"),
    // https://github.com/tranhuythang/FullStackJavaCourse/blob/adb8ef257c57c06e35e3411198f84b21f99318dc/Phase1/src/Lesson1/Project_Calculator.java#L28
    Pattern.compile("[x/+-]"),
    // https://github.com/NuclearVGA/EhViewer/blob/5eaf771bdfc157116fb405f482dca7bf1551f423/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L66
    Pattern.compile("<a[^<>]*onclick=\"return popUp\\('([^']+)'[^)]+\\)\">Torrent Download[^<]+(\\d+)[^<]+</a"),
    // https://github.com/NuclearVGA/EhViewer/blob/5eaf771bdfc157116fb405f482dca7bf1551f423/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L76
    Pattern.compile(", added (.+?)<br />"),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Years.java#L88
    Pattern.compile("([-+]?)P([-+]?[0-9]+)Y", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Weeks.java#L88
    Pattern.compile("([-+]?)P([-+]?[0-9]+)W", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Seconds.java#L100
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(?:T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)S)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Months.java#L92
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Minutes.java#L94
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(?:T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Hours.java#L90
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(?:T(?:([-+]?[0-9]+)H)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThreeTen/threeten-extra/blob/e1faf52caae627354e1ef951eb6b6f0c0093038e/src/main/java/org/threeten/extra/Days.java#L92
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/EugeneM5/academy-new/blob/fa046cba85d2e166d2257c591c87b2d032e5407a/academy-new/src/by/academy/homework/hw3/Deal/Person.java#L57
    Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}"),
    // https://github.com/EugeneM5/academy-new/blob/fa046cba85d2e166d2257c591c87b2d032e5407a/academy-new/src/by/academy/homework/hw3/Deal/Person.java#L69
    Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}"),
    // https://github.com/a0x8o/iceberg/blob/573efd1d2e19aa67c4760dacb9fddbdc1da6afc8/core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java#L61
    Pattern.compile("v([^\\.]*)\\..*"),
    // https://github.com/a0x8o/iceberg/blob/573efd1d2e19aa67c4760dacb9fddbdc1da6afc8/core/src/main/java/org/apache/iceberg/MetricsModes.java#L36
    Pattern.compile("truncate\\((\\d+)\\)"),
    // https://github.com/a0x8o/iceberg/blob/573efd1d2e19aa67c4760dacb9fddbdc1da6afc8/aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java#L36
    Pattern.compile("^[a-z0-9_]{1,252}$"),
    // https://github.com/a0x8o/iceberg/blob/573efd1d2e19aa67c4760dacb9fddbdc1da6afc8/aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java#L37
    Pattern.compile("^[a-z0-9_]{1,255}$"),
    // https://github.com/boomzin/JavaRushTasks/blob/61b373926d07a3efbb17ad03b4629d52ca5363e2/4.JavaCollections/src/com/javarush/task/task39/task3913/LogParser.java#L37
    Pattern.compile("([0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3})"),
    // https://github.com/boomzin/JavaRushTasks/blob/61b373926d07a3efbb17ad03b4629d52ca5363e2/4.JavaCollections/src/com/javarush/task/task39/task3913/LogParser.java#L38
    Pattern.compile("([0-9]{1,2}[.][0-9]{1,2}[.][0-9]{2,4}[\\s][0-9]{1,2}[:][0-9]{1,2}[:][0-9]{1,2})"),
    // https://github.com/boomzin/JavaRushTasks/blob/61b373926d07a3efbb17ad03b4629d52ca5363e2/4.JavaCollections/src/com/javarush/task/task39/task3913/LogParser.java#L39
    Pattern.compile("(?<=\\s)\\w+\\z"),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L98
    Pattern.compile("(?:/(?s:/[^\\n\\x0B\\x0C\\r\\u0085\\u2028\\u2029]*|[*].*?[*]/)\\s*)", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L99
    Pattern.compile("(?<double>[-+]Infinity|[-+]?(?:[0-9][0-9_']*[fFdD]|(?:[0-9][0-9_']*[.]?[eE][-+]?[0-9_']+|[0-9][0-9_']*[.][0-9_']+(?:[eE][-+]?[0-9_']+)?|0[xX](?:[0-9A-Fa-f_']+[.]?|[0-9A-Fa-f_']+[.][0-9A-Fa-f_']+)[pP][-+]?[0-9_']+)[fFdD]?))\\s*", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L102
    Pattern.compile("(?:(?<hexsign>[-+]?)0[xX](?<hexadecimal>[0-9A-Fa-f_']+)|(?<decimal>[-+]?[0-9][0-9_']*))(?<isLong>[lL])?\\s*", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L106
    Pattern.compile("~/(?<nounicode>\\(\\?-U\\))?(?<regex>(?:[^/\\\\]|\\\\.)*)/\\s*", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L107
    Pattern.compile("(?:\"(?<string>(?:[^\"\\\\]|\\\\[\\\\\"'btnfr{}0]|\\\\x[0-9A-Fa-f]|\\\\u[0-9A-Fa-f]{4}|\\\\U[0-9A-Fa-f]{8})*)\"|'(?<unescapedString>(?:[^']|'')*)')\\s*", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/internal/Expression.java#L1175
    Pattern.compile("\\s*[.]\\s*", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/Runner.java#L63
    Pattern.compile("\"(?<string>(?:[ -\\x{10FFFF}&&[^\"\\\\]]|\\\\[\"\\\\/bfnrt]|\\\\u[0-9A-Fa-f]{4})*)\"|(?<raw>[!-\\x{10FFFF}&&[^\"&*:,\\[\\]{}]]+)"),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/Runner.java#L65
    Pattern.compile("&[ \t\r\n]*(?<anchor>[!-\\x{10FFFF}&&[^\"&*:,\\[\\]{}]]+)"),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/Runner.java#L66
    Pattern.compile("[*][ \t\r\n]*(?<alias>[!-\\x{10FFFF}&&[^\"&*:,\\[\\]{}]]+)"),
    // https://github.com/horseshoe/horseshoe/blob/02b7cb623c7205345a1bdded6f5c76fabe50014e/src/main/java/horseshoe/Runner.java#L70
    Pattern.compile("(?<value>-?(?:0|[1-9][0-9]*)(?<double>(?:[.][0-9]+)?[eE][-+]?[0-9]+|[.][0-9]+)?)"),
    // https://github.com/TsvetanovM/Java-Fundamentals-Course/blob/a02fef069315d6e330a75447cd28846993645cff/Lecture%2032/ExtractEmails#L10
    Pattern.compile("\\b[A-Za-z0-9]+([-._][A-Za-z0-9]+)?@[A-Za-z]+(-[A-Za-z]+)?(\\.[A-Za-z]+(-[A-Za-z]+)?)*\\b"),
    // https://github.com/amazingProj/TravelsApplication/blob/19ac661868a0e5de901ddc52a2a7dedea85dc692/app/src/main/java/com/example/travelsapplication/Models/Travel.java#L115
    Pattern.compile("(0[0-9]*)"),
    // https://github.com/amazingProj/TravelsApplication/blob/19ac661868a0e5de901ddc52a2a7dedea85dc692/app/src/main/java/com/example/travelsapplication/Models/Travel.java#L132
    Pattern.compile("(.*)@(.*)"),
    // https://github.com/Kizhyk/HTPJava/blob/f2d3080a2e2da9955a58f76190fc0a84de40ff62/HomeWork/src/com/kizhyk/homework7/NBRBLoader.java#L44
    Pattern.compile("\"Cur_OfficialRate\":(\\d+\\.\\d+)"),
    // https://github.com/curcinb/OpenPGP-aplikacija/blob/cd09e5ad41209c55d3dac2b99d013bf0be97927f/src/etf/openpgp/cb160549/Verifikator.java#L32
    Pattern.compile("-----BEGIN PGP SIGNED MESSAGE-----\\r?\\n.*?\\r?\\n\\r?\\n(.*)\\r?\\n(-----BEGIN PGP SIGNATURE-----\\r?\\n.*-----END PGP SIGNATURE-----)", Pattern.DOTALL|Pattern.CANON_EQ),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L40
    Pattern.compile("^([0-9]{0}|[0-9]{8}|[0-9]{12,14}|SEM GTIN)$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L49
    Pattern.compile("^[0-9]{6,14}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L68
    Pattern.compile("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L168
    Pattern.compile("^([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}|[A-Z]{3}[0-9][A-Z][0-9]{2})$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L186
    Pattern.compile("^[0-9]{14}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L205
    Pattern.compile("^[0-9]{11}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L224
    Pattern.compile("^(ISENTO|[0-9]{2,14}|)$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L233
    Pattern.compile("^([0-9]{2,14}|)$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L642
    Pattern.compile("^([A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12})$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L651
    Pattern.compile("^([0-9]{2}|[0-9]{8})$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L725
    Pattern.compile("^[A-Z]{2}[0-9]{4}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L734
    Pattern.compile("^\\d{2}\\.\\d{2}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/validadores/DFStringValidador.java#L762
    Pattern.compile("^ID\\d{41}$"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/nfe400/classes/nota/NFNotaInfoCana.java#L48
    Pattern.compile("[0-9]{4}"),
    // https://github.com/wmixvideo/nfe/blob/e00482f570069064721ac757da0ee7283ae70661/src/main/java/com/fincatto/documentofiscal/nfe400/classes/nota/NFNotaInfoCana.java#L48
    Pattern.compile("[0-9]{4}/[0-9]{4}"),
    // https://github.com/Dvassily/SPARQLEngine/blob/de4a6a50ecf6977cbc57cf09fdc821fc04b6f553/src/main/java/nosqlRDF/requests/SPARQLRequestParser.java#L41
    Pattern.compile("[^\\{]+\\{[^\\}]+\\}"),
    // https://github.com/Razania/HMIN321-CompleteExtensionAlgoritm/blob/db9ed44b68298c35063155804c3e904c8eaf3483/src/Solver.java#L46
    Pattern.compile("arg\\((\\w+)\\)\\."),
    // https://github.com/Razania/HMIN321-CompleteExtensionAlgoritm/blob/db9ed44b68298c35063155804c3e904c8eaf3483/src/Solver.java#L59
    Pattern.compile("att\\(\\s*(\\w+)\\s*,\\s*(\\w+)\\s*\\)\\."),
    // https://github.com/liferay/liferay-portal/blob/1c5bab211a3ec4b463a80469ae57ee6e8edf5bc5/modules/apps/portal-remote/portal-remote-cors-test/src/testIntegration/java/com/liferay/portal/remote/cors/client/test/PortalConfigurationCORSClientTest.java#L192
    Pattern.compile("Liferay.authToken\\s*=\\s*(['\"])(((?!\\1).)*)\\1;"),
    // https://github.com/Pgirardin/lab7/blob/a2e402cb7edd200cc36df3aa7e785bc7414a61f9/labbb7/src/URLDepthPair.java#L10
    Pattern.compile("([\\da-zа-я\\.-]+)\\.([a-zа-я\\.]{2,6})"),
    // https://github.com/Pgirardin/lab7/blob/a2e402cb7edd200cc36df3aa7e785bc7414a61f9/labbb7/src/URLDepthPair.java#L9
    Pattern.compile("(http://)([\\da-zа-я\\.-]+)\\.([a-zа-я\\.]{2,6})([/\\wа-я\\.-]*)*\\/?"),
    // https://github.com/Pgirardin/lab7/blob/a2e402cb7edd200cc36df3aa7e785bc7414a61f9/labbb7/src/Crawler.java#L10
    Pattern.compile("(<a).*?>"),
    // https://github.com/Pgirardin/lab7/blob/a2e402cb7edd200cc36df3aa7e785bc7414a61f9/labbb7/src/Crawler.java#L9
    Pattern.compile("(href=\").*?\""),
    // https://github.com/delos001/DS_Recipes/blob/f5d986692dfbc4a0e359787fbe558b4ca01e66c3/RegularExpressions/TutorialData/Regex.java#L11
    Pattern.compile("fooa*bar"),
    // https://github.com/DirtPowered/DirtMultiversion/blob/21c4c617836ce181715b453cfa646f5697e5adbd/src/main/java/com/github/dirtpowered/dirtmv/data/utils/ChatUtils.java#L128
    Pattern.compile("(?i)§[0-9A-FK-OR]"),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/81cff1f374daf9643811474ea64e57971c6d845f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/releasegroup/WikidataReleaseGroupEnricher.java#L47
    Pattern.compile(".+/(?<id>Q\\d+)$"),
    // https://github.com/FelixRilling/musicbrainz-enricher/blob/81cff1f374daf9643811474ea64e57971c6d845f/src/main/java/org/felixrilling/musicbrainzenricher/enrichment/releasegroup/DiscogsReleaseGroupEnricher.java#L25
    Pattern.compile("http(?:s?)://www\\.discogs\\.com/master/(?<id>\\d+)"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-state/src/main/java/org/socyno/webfwk/state/field/OptionSystemUserAuth.java#L22
    Pattern.compile("^([^,]+),(\\d+),(\\d+)$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/vcs/change/VcsChangeInfoService.java#L262
    Pattern.compile("([^A-Z])([A-Z])"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/vcs/change/VcsChangeInfoService.java#L458
    Pattern.compile("^([^/]+)/([^/]+/)?(.*)?$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/vcs/change/VcsChangeInfoService.java#L627
    Pattern.compile("\\_([^\\_]+)$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/datachart/DataChartUtil.java#L42
    Pattern.compile("[0-9]+.?[0-9]+"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/datachart/DataChartUtil.java#L96
    Pattern.compile("^\\s*(@Y|@M|@d)\\s*$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/datachart/DataChartUtil.java#L110
    Pattern.compile("^\\s*([+-]?)(\\d*)([YMd]?)(@Y|@M|@d)?\\s*"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-module/src/main/java/org/socyno/webfwk/module/app/form/ApplicationService.java#L684
    Pattern.compile("^([1-9][0-9]*)\\.([0-9]+)\\.([0-9]+)$"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-gateway/src/main/java/org/socyno/webfwk/gateway/websocket/WebSocketRedirectorToBackend.java#L18
    Pattern.compile("^(http)s?:", Pattern.CASE_INSENSITIVE),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-gateway/src/main/java/org/socyno/webfwk/gateway/websocket/WebSocketRedirectorToBackend.java#L26
    Pattern.compile("^.*?/ws/+"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-executor/src/main/java/org/socyno/webfwk/executor/controller/ApplicationBuildController.java#L51
    Pattern.compile("\\{package\\:"),
    // https://github.com/socyno/socyno-webfwk-allinone/blob/a0b5ff9b87e382e5e26035012fcdb9e62ad2beab/socyno-webfwk-executor/src/main/java/org/socyno/webfwk/executor/controller/ApplicationBuildController.java#L52
    Pattern.compile("\\:package\\}"),
    // https://github.com/nblxa/turntables/blob/b6bc2301744c6910e3cffaa868a336062169d3a7/assert-assertj/src/main/java/io/github/nblxa/turntables/assertj/assertj/AssertionErrorAssert.java#L22
    Pattern.compile("\\n(EXPECTED: ).*?\\n(BUT: WAS ).*", Pattern.DOTALL),
    // https://github.com/wangchunyu-9546/gy2/blob/f914c183eecb94bc9857c7c282428790b77f3e1e/src/main/java/com/hjsj/hrms/businessobject/report/formulaAnalyse/ReportSpaceGridFormulaAnalyse.java#L174
    Pattern.compile("[1-9]\\d*\\:[1-9]\\d*"),
    // https://github.com/Anthony9624/Airplane/blob/d0e5915a84112429d84dbdd00762f7bef3b745f9/app/src/main/java/com/airticket/client/utils/StringUtil.java#L14
    Pattern.compile("^[1][3-9]\\d{9}$"),
    // https://github.com/LmaaMiracle/StudentAssistantBot/blob/ad0fb69c2e5f3bec786dbf949879448b21c95be9/documentation/4_Software_Construction/4.2_Construction_of_Program%20Modules/4.2.3%20%D0%9E%D1%81%D0%BE%D0%B1%D0%BB%D0%B8%D0%B2%D0%BE%D1%81%D1%82%D1%96%20%D1%81%D1%82%D0%B2%D0%BE%D1%80%D0%B5%D0%BD%D0%BD%D1%8F%20%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BD%D0%B8%D1%85%20%D0%BA%D0%BB%D0%B0%D1%81%D1%96%D0%B2/BotState.java#L374
    Pattern.compile("([01][0-9]|2[0-3]):[0-5][0-9]"),
    // https://github.com/dearcode2018/file/blob/857c774411c3689f2613d2c8d945b8b78e3214d2/poi/src/main/java/com/hua/util/POIUtil.java#L512
    Pattern.compile("\\(.+\\)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L166
    Pattern.compile(".", Pattern.DOTALL),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L168
    Pattern.compile("[^A-Za-z0-9!\"$'()*,/:<>@\\[\\\\\\]^`{|}~]"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L169
    Pattern.compile("[^A-Za-z0-9\"<>\\[\\\\\\]^`{|}]"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L170
    Pattern.compile("[^ !#$&=~/,@+*|0-9A-Za-z\\[\\]\\(\\)\\{\\}?-]"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L192
    Pattern.compile("([0-9a-zA-Z\\*_\\+\\.-]|%([0-9a-fA-F]{2}))+"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L194
    Pattern.compile("([0-9a-zA-Z+/\r\n])+={0,2}"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L195
    Pattern.compile("([0-9a-zA-Z_\\-\r\n])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L196
    Pattern.compile("begin\\s[0-6]{3}\\s\\w+"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L197
    Pattern.compile("=([0-9a-fA-F]{2})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L198
    Pattern.compile("xn--[0-9a-zA-Z_\\.]+"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L199
    Pattern.compile("%([0-9a-fA-F]{2})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L200
    Pattern.compile("(&#(\\d+);)|(&(lt|gt|amp|quot);)|(&#[xX]([0-9a-fA-F]+);)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L201
    Pattern.compile("%[uU]([0-9a-fA-F]{4})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L202
    Pattern.compile("\\\\[uU]([0-9a-fA-F]{4})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L203
    Pattern.compile("\\\\[xX]([0-9a-fA-F]{2})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L204
    Pattern.compile("\\\\([0-9a-fA-F]{2})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L205
    Pattern.compile("\\\\(0[0-9]{1,})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L206
    Pattern.compile("\\\\([0-9]{1,})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L207
    Pattern.compile("\\x1f\\x8b"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1138
    Pattern.compile("(\\\\[uU][dD][89abAB][0-9a-fA-F]{2}\\\\[uU][dD][c-fC-F][0-9a-fA-F]{2})|(\\\\[uU][0-9a-fA-F]{4})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1161
    Pattern.compile("((\\\\[xX][0-9a-fA-F]{2})+)|((\\\\[0-9]{1,3})+)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1203
    Pattern.compile("((\\\\[xX][0-9a-fA-F]{2})+)|((\\\\[0-9a-fA-F]{2})+)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1270
    Pattern.compile("(%[uU][dD][89abAB][0-9a-fA-F]{2}%[uU][dD][c-fC-F][0-9a-fA-F]{2})|(%[uU][0-9a-fA-F]{4})"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1402
    Pattern.compile("\\\\([\\\\\\.\\+\\*\\?\\[\\^\\]\\$\\(\\)\\{\\}\\=\\!\\<\\>\\|\\:\\-])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1407
    Pattern.compile("(&(?:(#\\d+)|(#[xX][0-9a-fA-F]+)|(\\w+));)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1604
    Pattern.compile("(\\\\[rnbftv\\\\])|(\\\\x[0-9a-fA-F]{2})|((\\\\u[dD][89abAB][0-9a-fA-F]{2}\\\\u[dD][c-fC-F][0-9a-fA-F]{2})|(\\\\u[0-9a-fA-F]{4}))"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1674
    Pattern.compile("([\\\\\"'])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1684
    Pattern.compile("\\\\([\\\\\"'])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1694
    Pattern.compile("([\\\\\"])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1704
    Pattern.compile("\\\\([\\\\\"])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/extend/util/external/TransUtil.java#L1714
    Pattern.compile("([\'])"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/burp/BurpExtender.java#L470
    Pattern.compile("^(.*?\\s+)(.*?)(\\s+.*)"),
    // https://github.com/raise-isayan/YaguraExtender/blob/04d52bd802c91ef4ffb957898badb03248fa0724/src/main/java/burp/BurpExtender.java#L471
    Pattern.compile("\\r\\n\\r\\n"),
    // https://github.com/kb-1000/jdk8u_hotspot_upstream/blob/02d30fd6ce80f4c8f937cc7e7d9199bdf599626f/test/gc/arguments/TestMaxHeapSizeTools.java#L195
    Pattern.compile("Minimum heap \\d+ Initial heap \\d+ Maximum heap \\d+ Space alignment \\d+ Heap alignment \\d+"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/services/updates/githubUpdates/src/main/java/com/shatteredpixel/shatteredpixeldungeon/services/updates/GitHubUpdates.java#L38
    Pattern.compile("(.*?)(\r\n|\n|\r)(\r\n|\n|\r)---", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/services/updates/githubUpdates/src/main/java/com/shatteredpixel/shatteredpixeldungeon/services/updates/GitHubUpdates.java#L39
    Pattern.compile("internal version number: ([0-9]*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/services/news/shatteredNews/src/main/java/com/shatteredpixel/shatteredpixeldungeon/services/news/ShatteredNews.java#L77
    Pattern.compile("v[0-9]+"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/desktop/src/main/java/com/shatteredpixel/shatteredpixeldungeon/desktop/DesktopPlatformSupport.java#L158
    Pattern.compile("\\p{InHangul_Syllables}|\\p{InCJK_Unified_Ideographs}|\\p{InCJK_Symbols_and_Punctuation}|\\p{InHalfwidth_and_Fullwidth_Forms}|\\p{InHiragana}|\\p{InKatakana}"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/desktop/src/main/java/com/shatteredpixel/shatteredpixeldungeon/desktop/DesktopPlatformSupport.java#L212
    Pattern.compile("(?<=\n)|(?=\n)|(?<=_)|(?=_)|(?<=\\p{InHiragana})|(?=\\p{InHiragana})|(?<=\\p{InKatakana})|(?=\\p{InKatakana})|(?<=\\p{InCJK_Unified_Ideographs})|(?=\\p{InCJK_Unified_Ideographs})|(?<=\\p{InCJK_Symbols_and_Punctuation})|(?=\\p{InCJK_Symbols_and_Punctuation})"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/desktop/src/main/java/com/shatteredpixel/shatteredpixeldungeon/desktop/DesktopPlatformSupport.java#L220
    Pattern.compile("(?<= )|(?= )|(?<=\n)|(?=\n)|(?<=_)|(?=_)|(?<=\\p{InHiragana})|(?=\\p{InHiragana})|(?<=\\p{InKatakana})|(?=\\p{InKatakana})|(?<=\\p{InCJK_Unified_Ideographs})|(?=\\p{InCJK_Unified_Ideographs})|(?<=\\p{InCJK_Symbols_and_Punctuation})|(?=\\p{InCJK_Symbols_and_Punctuation})"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L332
    Pattern.compile("\\p{InHangul_Syllables}"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L333
    Pattern.compile("\\p{InCJK_Unified_Ideographs}|\\p{InCJK_Symbols_and_Punctuation}|\\p{InHalfwidth_and_Fullwidth_Forms}"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L334
    Pattern.compile("\\p{InHiragana}|\\p{InKatakana}"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L389
    Pattern.compile("(?<=\n)|(?=\n)|(?<=_)|(?=_)|(?<=\\p{InHiragana})|(?=\\p{InHiragana})|(?<=\\p{InKatakana})|(?=\\p{InKatakana})|(?<=\\p{InCJK_Unified_Ideographs})|(?=\\p{InCJK_Unified_Ideographs})|(?<=\\p{InCJK_Symbols_and_Punctuation})|(?=\\p{InCJK_Symbols_and_Punctuation})|(?<=\\p{InHalfwidth_and_Fullwidth_Forms})|(?=\\p{InHalfwidth_and_Fullwidth_Forms})"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L398
    Pattern.compile("(?<= )|(?= )|(?<=\n)|(?=\n)|(?<=_)|(?=_)|(?<=\\p{InHiragana})|(?=\\p{InHiragana})|(?<=\\p{InKatakana})|(?=\\p{InKatakana})|(?<=\\p{InCJK_Unified_Ideographs})|(?=\\p{InCJK_Unified_Ideographs})|(?<=\\p{InCJK_Symbols_and_Punctuation})|(?=\\p{InCJK_Symbols_and_Punctuation})|(?<=\\p{InHalfwidth_and_Fullwidth_Forms})|(?=\\p{InHalfwidth_and_Fullwidth_Forms})"),
    // https://github.com/Ryuse/My-Pixel-Dungeon/blob/4b9641e3bcf67bf46c7c467353455ba579e270db/android/src/main/java/com/shatteredpixel/shatteredpixeldungeon/android/AndroidPlatformSupport.java#L407
    Pattern.compile("(?<= )|(?= )|(?<=\n)|(?=\n)|(?<=_)|(?=_)|(?!\\p{InHangul_Syllables})|(?<!\\p{InHangul_Syllables})"),
    // https://github.com/confusinguser/ConfusingAddons/blob/14b1d17f389c0a20d65daeb0234f1b52205f82a3/src/main/java/com/confusinguser/confusingaddons/utils/Utils.java#L37
    Pattern.compile("(?:§2Guild|§aFriend) > §[0-9a-f]\\w{3,16} (?:§e|)(?:left|joined)\\."),
    // https://github.com/confusinguser/ConfusingAddons/blob/14b1d17f389c0a20d65daeb0234f1b52205f82a3/src/main/java/com/confusinguser/confusingaddons/utils/Utils.java#L38
    Pattern.compile("\\d\\d/\\d\\d/\\d\\d (?:M|mega)\\d{1,4}\\w"),
    // https://github.com/confusinguser/ConfusingAddons/blob/14b1d17f389c0a20d65daeb0234f1b52205f82a3/src/main/java/com/confusinguser/confusingaddons/utils/Utils.java#L39
    Pattern.compile("§aYour new API key is §b[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}"),
    // https://github.com/confusinguser/ConfusingAddons/blob/14b1d17f389c0a20d65daeb0234f1b52205f82a3/src/main/java/com/confusinguser/confusingaddons/utils/Utils.java#L40
    Pattern.compile(" \\d:"),
    // https://github.com/confusinguser/ConfusingAddons/blob/14b1d17f389c0a20d65daeb0234f1b52205f82a3/src/main/java/com/confusinguser/confusingaddons/utils/Utils.java#L41
    Pattern.compile("[^a-zA-Z-0-9/ ]"),
    // https://github.com/inkarnadin/cms-check-component/blob/f575bbbacf2bf783e63ca5a3214fa0aef0923f65/src/main/java/web/cms/tilda/TildaCheckProcessor.java#L30
    Pattern.compile("data-tilda-project-id"),
    // https://github.com/inkarnadin/cms-check-component/blob/f575bbbacf2bf783e63ca5a3214fa0aef0923f65/src/main/java/web/cms/tilda/TildaCheckProcessor.java#L31
    Pattern.compile("data-tilda-page-id"),
    // https://github.com/inkarnadin/cms-check-component/blob/f575bbbacf2bf783e63ca5a3214fa0aef0923f65/src/main/java/web/cms/tilda/TildaCheckProcessor.java#L32
    Pattern.compile("data-tilda-formskey"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/os/WindowsUtil.java#L45
    Pattern.compile("[\\s\"]"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/os/WindowsUtil.java#L85
    Pattern.compile("[()%!^\"<>&|]"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/model/FileParameterValue.java#L67
    Pattern.compile(".*[\\\\/]\\.\\.[\\\\/].*"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/model/Computer.java#L1671
    Pattern.compile("slave-(.*)\\.log(\\.[0-9]+)?"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/console/UrlAnnotator.java#L44
    Pattern.compile("\\b(http|https|file|ftp)://[^\\s<>]+[^\\s<>,\\.:\"'()\\[\\]=]"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/Util.java#L139
    Pattern.compile("\\$([A-Za-z0-9_]+|\\{[A-Za-z0-9_.]+\\}|\\$)"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/Util.java#L410
    Pattern.compile(".*CreateProcess.*error=([0-9]+).*"),
    // https://github.com/hli37685/jenkins/blob/f54863fdcb84b30a78815484bd15355050c421b0/core/src/main/java/hudson/ProxyConfiguration.java#L219
    Pattern.compile("[ \t\n,|]+"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-sybase/src/main/java/org/jetbrains/dekaf/jdbc/SybaseIntermediateProvider.java#L36
    Pattern.compile("^jdbc:(?:jtds:sybase|sybase:Tds):.+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-sybase/src/main/java/org/jetbrains/dekaf/jdbc/SybaseIntermediateFacade.java#L104
    Pattern.compile("/(\\d{2}(\\.\\d{1,3}){1,5})"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-sybase-tests/src/test/java/org/jetbrains/dekaf/jdbc/SybaseExceptionRecognizerTest.java#L44
    Pattern.compile("password=(.*)(;|$)"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-sqlite/src/main/java/org/jetbrains/dekaf/jdbc/SqliteIntermediateProvider.java#L29
    Pattern.compile("^jdbc:sqlite:.+$"),
    // https://github.com/JetBrains/dekaf/blob/4e899cef2abe47f5367df06ce45d3cbc29a0d3d3/old/dekaf-redshift/src/main/java/org/jetbrains/dekaf/jdbc/RedshiftIntermediateProvider.java#L20
    Pattern.compile("^jdbc:redshift://.+$"),
    // https://github.com/sblendorio/petscii-bbs/blob/65cf0c9323add1b409d9bf8b40e935652e074f60/src/main/java/eu/sblendorio/bbs/core/HtmlUtils.java#L9
    Pattern.compile("(?is)<pre[^>]*>(([^\n]+)\n?|\n)(.*?)</pre[^>]*>"),
    // https://github.com/jmpessoa/lazandroidmodulewizard/blob/dc870afdb5c009cccc4348d13eee7027ce1ff548/android_wizard/smartdesigner/java/Controls.java#L1568
    Pattern.compile("[\\p{InCombiningDiacriticalMarks}]"),
    // https://github.com/D-Coder135/Regular_Expressions_JAVA/blob/2b697fe5e9bcc90af2d9c0017e1e49ce3b4c8676/src/Scratch5.java#L15
    Pattern.compile("\\d{4}"),
    // https://github.com/D-Coder135/Regular_Expressions_JAVA/blob/2b697fe5e9bcc90af2d9c0017e1e49ce3b4c8676/src/Scratch2.java#L16
    Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$"),
    // https://github.com/SimeonKazandzhiev/RegExp/blob/8dfe215a946b16168a619a6b65c280d3dd45f6d6/src/MirrorWords.java#L11
    Pattern.compile("([@#])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1"),
    // https://github.com/SimeonKazandzhiev/RegExp/blob/8dfe215a946b16168a619a6b65c280d3dd45f6d6/src/FancyBarcodes.java#L9
    Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+"),
    // https://github.com/SimeonKazandzhiev/RegExp/blob/8dfe215a946b16168a619a6b65c280d3dd45f6d6/src/EmojiDetector.java#L13
    Pattern.compile("(?>([:]{2}|[*]{2})([A-Z][a-z]{2,})\\1)"),
    // https://github.com/SimeonKazandzhiev/RegExp/blob/8dfe215a946b16168a619a6b65c280d3dd45f6d6/src/DestinationMapper.java#L10
    Pattern.compile("([=|/])(?<destination>[A-Z][A-Za-z]{2,})\\1"),
    // https://github.com/SimeonKazandzhiev/RegExp/blob/8dfe215a946b16168a619a6b65c280d3dd45f6d6/src/AdAstra.java#L9
    Pattern.compile("([#|])(?<name>[A-Za-z\\s]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<cal>\\d{1,5})\\1"),
    // https://github.com/scwang90/CodeSmither/blob/09fe0f70eab48f5def3e24f9c93dec0e3eb9297e/smither-engine/src/main/java/com/code/smither/engine/Engine.java#L34
    Pattern.compile("\\$if\\{([^=]+)=([^}]+)}"),
    // https://github.com/TeamDlog/Dlog_workspace/blob/7c5c73620210586527caf6a97ed396f97e789645/dlogProject/src/main/java/com/kh/dlog/member/controller/MemberController.java#L77
    Pattern.compile("^(?=.*[a-z])(?=.*[0-9])(?=.*[$@$!%*?&`~'\\\"+=])[a-z[0-9]$@$!%*?&`~'\\\"+=]{8,15}$"),
    // https://github.com/MidasHub/jean_fineract/blob/8c5cc51b9c794be681a233494a8ac19bf51ca0b8/fineract-provider/src/main/java/org/apache/fineract/infrastructure/bulkimport/populator/AbstractWorkbookPopulator.java#L42
    Pattern.compile("[ @#&()<>,;.:$£€§°\\\\/=!\\?\\-\\+\\*\"\\[\\]]"),
    // https://github.com/MidasHub/jean_fineract/blob/8c5cc51b9c794be681a233494a8ac19bf51ca0b8/fineract-provider/src/main/java/org/apache/fineract/infrastructure/bulkimport/populator/AbstractWorkbookPopulator.java#L71
    Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}"),
    // https://github.com/MidasHub/jean_fineract/blob/8c5cc51b9c794be681a233494a8ac19bf51ca0b8/fineract-provider/src/main/java/org/apache/fineract/infrastructure/bulkimport/populator/AbstractWorkbookPopulator.java#L73
    Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}"),
    // https://github.com/MidasHub/jean_fineract/blob/8c5cc51b9c794be681a233494a8ac19bf51ca0b8/fineract-provider/src/main/java/org/apache/fineract/infrastructure/bulkimport/populator/AbstractWorkbookPopulator.java#L75
    Pattern.compile("\\d{1,2} \\w{3,12} \\d{4}"),
    // https://github.com/Tristan971/kmdah/blob/853c1707266e124c3b4a72e4125d1abb6051a233/src/main/java/moe/tristan/kmdah/service/images/validation/ImageRequestReferrerValidator.java#L14
    Pattern.compile("^((.+[.])?mangadex(\\.org|\\.network))|(mdah\\.tristan\\.moe)$"),
    // https://github.com/sabri/HackRankJava/blob/903e44791d7be8256b0e000db7058ddeeb09a53d/src/Strings/TagContentExtractor.java#L63
    Pattern.compile("(<[^>]*>)"),
    // https://github.com/Singularity-Coder/InstaNews/blob/8fe05d5853a38ee7cb4002c17990895acda7b722/NewsTime/app/src/main/java/com/singularitycoder/newstime/helper/AppUtils.java#L359
    Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8,}$"),
    // https://github.com/Singularity-Coder/InstaNews/blob/8fe05d5853a38ee7cb4002c17990895acda7b722/NewsTime/app/src/main/java/com/singularitycoder/newstime/helper/AppUtils.java#L370
    Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"),
    // https://github.com/quoctrung1012/C0720G1-TruongQuocTrung/blob/6cca7c1fd3055b76cedd12898f6455556f3226cc/Module%202/src/_qly_Sdt/commons/Validate.java#L16
    Pattern.compile("[A-Z][a-z]+(\\s[A-Z][a-z]*)*"),
    // https://github.com/quoctrung1012/C0720G1-TruongQuocTrung/blob/6cca7c1fd3055b76cedd12898f6455556f3226cc/Module%202/src/_qly_Sdt/commons/Validate.java#L17
    Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$"),
    // https://github.com/IT-CAMP3/2020.11.07-bookStore/blob/9aa7f47a2652f2723eb732eed21acf69a3b342c4/src/main/java/pl/camp/it/book/store/controllers/UserController.java#L43
    Pattern.compile(".{3}.*"),
    // https://github.com/IT-CAMP3/2020.11.07-bookStore/blob/9aa7f47a2652f2723eb732eed21acf69a3b342c4/src/main/java/pl/camp/it/book/store/controllers/UserController.java#L83
    Pattern.compile("[A-Z]{1}[A-Za-z]*"),
    // https://github.com/LeonardoPantani/Progetto_Java_PR2-UNIPI/blob/74f6fc3c412b2a0aa974edf4739a6d65c5d4df55/src/app/SocialNetwork.java#L400
    Pattern.compile("[A-Za-z0-9_.]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/PeterBowman/wikibot/blob/56b61aa93f9925037cfb5c131f483660b391744d/wikibot/src/main/java/com/github/wikibot/parsing/plwikt/Section.java#L28
    Pattern.compile("^(.*?) *?\\(\\{\\{(.+?)(?:\\|[^\\}]*?)?\\}\\}\\)$"),
    // https://github.com/PeterBowman/wikibot/blob/56b61aa93f9925037cfb5c131f483660b391744d/wikibot/src/main/java/com/github/wikibot/parsing/plwikt/Section.java#L85
    Pattern.compile("^język "),
    // https://github.com/self-xdsd/self-core/blob/eb8f40c6b898f6f10eb2510cd462d5117beb7bcd/self-core-impl/src/main/java/com/selfxdsd/core/LabelsEstimation.java#L50
    Pattern.compile("^([1-9]+[0-9]*)[ ]*(minutes|min|m)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/KONFIRSA/bombona-user/blob/71d376148ccd924e7511318f0d5f0802ccd8a30d/app/src/main/java/com/bombona/user/utils/Utils.java#L190
    Pattern.compile("((?=.*[a-zA-Z])(?=.*[0-9]).{6,15})"),
    // https://github.com/KONFIRSA/bombona-user/blob/71d376148ccd924e7511318f0d5f0802ccd8a30d/app/src/main/java/com/bombona/user/utils/Utils.java#L301
    Pattern.compile("^[1-9][0-9 ]*$"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/publisher/visitor/UpdateVersion.java#L17
    Pattern.compile("(<version>\\d*.\\d*.\\d*-)(\\w*)(</version>\\s*<properties>)"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/publisher/visitor/UpdateVersion.java#L18
    Pattern.compile("(<version>\\d*.\\d*.\\d*-)(\\w*)(</version>)"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/publisher/visitor/UpdateVersion.java#L19
    Pattern.compile("(<version>\\d*-)(\\w*)(</version>)"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/publisher/visitor/UpdateVersion.java#L21
    Pattern.compile("(<artifactId>jsweet-maven-plugin</artifactId>\\s*<version>)(\\d*.\\d*.\\d*-\\w*)(</version>)"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/publisher/visitor/UpdateVersion.java#L23
    Pattern.compile("(<jsweet.transpiler.version>)(\\d*.\\d*.\\d*)(</jsweet.transpiler.version>)"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/input/typescriptdef/util/Util.java#L174
    Pattern.compile("/// *<reference .*path *= *\"(.*)\".*"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/input/typescriptdef/util/Util.java#L652
    Pattern.compile("[.-]"),
    // https://github.com/cincheo/jsweet/blob/b394250635bf9a77c24268796b81941908fbd304/candy-generator/src/main/java/org/jsweet/input/typescriptdef/TypescriptDef2Java.java#L156
    Pattern.compile("^///\\p{Blank}*<.*$"),
    // https://github.com/conceptant/gsrs-vip-parser/blob/f2d08f3d825a0bbb587fd718c60a9f7ab4da900b/src/main/java/gov/hhs/fda/ohi/gsrsnetworkmaker/NetworkMaker.java#L373
    Pattern.compile("\\[\\d+\\]\\['\\w+'\\]$"),
    // https://github.com/Perococco/aoc2020/blob/3d9bba8e3131b6b2c180ef3e5c44485dfb470556/perococco.aoc.input/src/main/java/perococco/aoc/input/SmartSolver.java#L16
    Pattern.compile("Day([0-9]+)Part([12]).+"),
    // https://github.com/laurawacrenier/Apache-PDFBox/blob/5b5e34a2a91cd36bab8121191fa0d41a104a3b3f/pdfbox/src/main/java/org/apache/pdfbox/util/PDFHighlighter.java#L122
    Pattern.compile("a[0-9]{1,3}"),
    // https://github.com/laurawacrenier/Apache-PDFBox/blob/5b5e34a2a91cd36bab8121191fa0d41a104a3b3f/pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFParser.java#L257
    Pattern.compile("\\d+\\s+\\d+\\s+obj.*", Pattern.DOTALL),
    // https://github.com/laurawacrenier/Apache-PDFBox/blob/5b5e34a2a91cd36bab8121191fa0d41a104a3b3f/pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFParser.java#L60
    Pattern.compile("%PDF-\\d.\\d"),
    // https://github.com/laurawacrenier/Apache-PDFBox/blob/5b5e34a2a91cd36bab8121191fa0d41a104a3b3f/pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFParser.java#L61
    Pattern.compile("%FDF-\\d.\\d"),
    // https://github.com/laurawacrenier/Apache-PDFBox/blob/5b5e34a2a91cd36bab8121191fa0d41a104a3b3f/pdfbox/src/main/java/org/apache/pdfbox/ConvertColorspace.java#L280
    Pattern.compile("^(.*):\\((.*)\\)=(.*):\\((.*)\\)$"),
    // https://github.com/darshitpp/url-shortener/blob/8149f8e8fac5c39cf1d942863bf120f8d2b071fb/src/main/java/dev/darshit/urlshortener/utils/UUIDUtils.java#L8
    Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L32
    Pattern.compile("\\(.*\\)"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L80
    Pattern.compile("Α"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L81
    Pattern.compile("α"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L82
    Pattern.compile("Β"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L83
    Pattern.compile("β"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L84
    Pattern.compile("Γ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L85
    Pattern.compile("γ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L86
    Pattern.compile("Δ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L87
    Pattern.compile("δ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L88
    Pattern.compile("Ε"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L89
    Pattern.compile("ε"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L90
    Pattern.compile("Ζ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L91
    Pattern.compile("ζ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L92
    Pattern.compile("Η"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L93
    Pattern.compile("η"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L94
    Pattern.compile("Θ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L95
    Pattern.compile("θ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L96
    Pattern.compile("Ι"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L97
    Pattern.compile("ι"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L98
    Pattern.compile("Κ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L99
    Pattern.compile("κ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L100
    Pattern.compile("Λ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L101
    Pattern.compile("λ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L102
    Pattern.compile("Μ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L103
    Pattern.compile("μ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L104
    Pattern.compile("Ν"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L105
    Pattern.compile("ν"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L106
    Pattern.compile("Ξ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L107
    Pattern.compile("ξ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L108
    Pattern.compile("Ο"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L109
    Pattern.compile("ο"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L110
    Pattern.compile("Π"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L111
    Pattern.compile("π"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L112
    Pattern.compile("Ρ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L113
    Pattern.compile("ρ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L114
    Pattern.compile("Σ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L115
    Pattern.compile("σ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L116
    Pattern.compile("ς"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L117
    Pattern.compile("Τ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L118
    Pattern.compile("τ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L119
    Pattern.compile("Υ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L120
    Pattern.compile("υ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L121
    Pattern.compile("Φ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L122
    Pattern.compile("φ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L123
    Pattern.compile("Χ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L124
    Pattern.compile("χ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L125
    Pattern.compile("Ψ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L126
    Pattern.compile("ψ"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L127
    Pattern.compile("Ω"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L128
    Pattern.compile("ω"),
    // https://github.com/benben28405678/ancient-greek-translator/blob/2d902852532fc73c2386d7ac5fd3a1852e08a957/src/com/benmyers/translator/GreekTranslator.java#L187
    Pattern.compile("\\(([^\\)]+)\\)"),
    // https://github.com/xxxlxy2008/dubbo/blob/463eaa4df4b296004c13bae49e1d3c3ba51acc7f/dubbo-metadata/dubbo-metadata-definition-protobuf/src/main/java/org/apache/dubbo/metadata/definition/protobuf/ProtobufTypeBuilder.java#L41
    Pattern.compile("^java\\.util\\.Map<(\\S+), (\\S+)>$"),
    // https://github.com/xxxlxy2008/dubbo/blob/463eaa4df4b296004c13bae49e1d3c3ba51acc7f/dubbo-metadata/dubbo-metadata-definition-protobuf/src/main/java/org/apache/dubbo/metadata/definition/protobuf/ProtobufTypeBuilder.java#L42
    Pattern.compile("^java\\.util\\.List<(\\S+)>$"),
    // https://github.com/xxxlxy2008/dubbo/blob/463eaa4df4b296004c13bae49e1d3c3ba51acc7f/dubbo-config/dubbo-config-api/src/main/java/org/apache/dubbo/config/utils/ConfigValidationUtils.java#L161
    Pattern.compile("[:*,\\s/\\-._0-9a-zA-Z]+"),
    // https://github.com/xxxlxy2008/dubbo/blob/463eaa4df4b296004c13bae49e1d3c3ba51acc7f/dubbo-config/dubbo-config-api/src/main/java/org/apache/dubbo/config/utils/ConfigValidationUtils.java#L522
    Pattern.compile("\\s*[,]+\\s*"),
    // https://github.com/rednblackgames/hyperlap2d-runtime-libgdx/blob/70d1966fb826e05df1bdfb06262669654eb22ab9/src/main/java/games/rednblack/editor/renderer/components/ShaderComponent.java#L14
    Pattern.compile("uniform +(int|float|vec2|vec3|vec4) +([^\\s]*) *(=.*)?;", Pattern.MULTILINE),
    // https://github.com/andersonarc/xtelepatch/blob/df5457da9b1cb904e71b00fac92c507a4c1b1744/TMessagesProj/src/main/java/org/telegram/messenger/MessageObject.java#L3387
    Pattern.compile("\\b(?:(\\d{1,2}):)?(\\d{1,3}):([0-5][0-9])\\b"),
    // https://github.com/andersonarc/xtelepatch/blob/df5457da9b1cb904e71b00fac92c507a4c1b1744/TMessagesProj/src/main/java/org/telegram/messenger/MessageObject.java#L3392
    Pattern.compile("(^|\\s|\\()@[a-zA-Z\\d_.]{1,32}|(^|\\s|\\()#[\\w.]+"),
    // https://github.com/andersonarc/xtelepatch/blob/df5457da9b1cb904e71b00fac92c507a4c1b1744/TMessagesProj/src/main/java/org/telegram/messenger/MessageObject.java#L3397
    Pattern.compile("(^|\\s)/[a-zA-Z@\\d_]{1,255}|(^|\\s|\\()@[a-zA-Z\\d_]{1,32}|(^|\\s|\\()#[^0-9][\\w.]+|(^|\\s)\\$[A-Z]{3,8}([ ,.]|$)"),
    // https://github.com/andersonarc/xtelepatch/blob/df5457da9b1cb904e71b00fac92c507a4c1b1744/TMessagesProj/src/main/java/org/telegram/messenger/MessageObject.java#L5599
    Pattern.compile("\\P{L}+"),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/color/ColorUtils.java#L34
    Pattern.compile("#[0-9a-f]{6}", Pattern.CASE_INSENSITIVE),
    // https://github.com/KilJaeeun/checkIssueReplyUser/blob/9bc94aa86a4313b61bc6943b496036113f3ae0c8/conqat/src/main/java/org/conqat/lib/commons/cache4j/CacheFactory.java#L70
    Pattern.compile("([^\\s]+)\\s*->\\s*([^\\s:]+):([^\\s:]+):([0-9]+)"),
    // https://github.com/MiRON-project/MIRON-Modeling-Tools/blob/715a2e78b9e1d2b1ba0f5846998f236f8ba250b6/miron.editor.ui/src/org/xtext/miron/ui/syntaxcolor/MIRoNAntlrTokenToAttributeIdMapper.java#L18
    Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE),
    // https://github.com/MiRON-project/MIRON-Modeling-Tools/blob/715a2e78b9e1d2b1ba0f5846998f236f8ba250b6/miron.editor.ui/src/org/xtext/miron/ui/syntaxcolor/MIRoNAntlrTokenToAttributeIdMapper.java#L20
    Pattern.compile("\\p{Punct}*"),
    // https://github.com/pasindups/2193290/blob/19faf2f509d1c1146878b644cf383cb43173d899/app/src/main/java/com/kathri/DeviceListActivity.java#L83
    Pattern.compile("(.{18}).*\\[(.+)\\] class is 0x00 - skip it."),
    // https://github.com/austinhyou/jeecg-boot-parent/blob/7851f684fcd9e766c5eeaab50716401792546b5c/jeecg-boot-base-common/src/main/java/org/jeecg/common/util/dynamic/db/FreemarkerParseFactory.java#L46
    Pattern.compile("(?ms)/\\*.*?\\*/|^\\s*//.*?$"),
    // https://github.com/austinhyou/jeecg-boot-parent/blob/7851f684fcd9e766c5eeaab50716401792546b5c/jeecg-boot-base-common/src/main/java/org/jeecg/common/util/dynamic/db/FreemarkerParseFactory.java#L150
    Pattern.compile("\\s{1,}"),
    // https://github.com/austinhyou/jeecg-boot-parent/blob/7851f684fcd9e766c5eeaab50716401792546b5c/jeecg-boot-base-common/src/main/java/org/jeecg/common/util/ReflectHelper.java#L55
    Pattern.compile("set(\\w+)"),
    // https://github.com/austinhyou/jeecg-boot-parent/blob/7851f684fcd9e766c5eeaab50716401792546b5c/jeecg-boot-base-common/src/main/java/org/jeecg/common/util/BrowserUtils.java#L202
    Pattern.compile("(phone|pad|pod|iphone|ipod|ios|ipad|android|mobile|blackberry|iemobile|mqqbrowser|juc|fennec|wosbrowser|browserng|webos|symbian|windows phone)"),
    // https://github.com/Netlighter/java-practice/blob/3ada72d9aac187acb45b0443e778e49892dad11f/src/com/netlight/lab23_24/Worker.java#L161
    Pattern.compile("(?<firstNumber>^-?\\d*(\\.\\d+)?\\s*)(?<firstOperand>\\s*[+\\-*/])(?<secondNumber>\\s*-?\\d*(\\.\\d+)?$)"),
    // https://github.com/katyagibova/java_proj/blob/fa372706a5bcc318090a2ba9625fb2288ec761ce/Java_project/src/main/java/proj_23_24/Worker.java#L66
    Pattern.compile("(?<one>[-]*\\d+)(?<sign>[*+/-])(?<two>[-]*\\d+)"),
    // https://github.com/duckulaj/SpringVideoDownloader/blob/f522f2716c4cdb2ffc53a082fa440be8f39c0c6f/SpringVideoDownload/src/main/java/com/hawkins/m3u/M3UtoStrm.java#L66
    Pattern.compile("S\\d\\d E\\d\\d", Pattern.CASE_INSENSITIVE),
    // https://github.com/Er-Iftekhar/BootAppIn-22-04-2018/blob/744a2e8bab0a4f0290ef8c2b89c6b1b8627c63d0/BootAppIn-22-04-2018/src/main/java/com/sathyatech/app/controller/multipart/validator/WhUserTypeMultipartValidator.java#L38
    Pattern.compile("[A-Z\\t\\n\\x0B\\f\\r]{4,12}"),
    // https://github.com/Er-Iftekhar/BootAppIn-22-04-2018/blob/744a2e8bab0a4f0290ef8c2b89c6b1b8627c63d0/BootAppIn-22-04-2018/src/main/java/com/sathyatech/app/controller/multipart/validator/WhUserTypeMultipartValidator.java#L44
    Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"),
    // https://github.com/Er-Iftekhar/BootAppIn-22-04-2018/blob/744a2e8bab0a4f0290ef8c2b89c6b1b8627c63d0/BootAppIn-22-04-2018/src/main/java/com/sathyatech/app/controller/multipart/validator/WhUserTypeMultipartValidator.java#L67
    Pattern.compile("\\w{2,20}"),
    // https://github.com/VictorPetrakov/Notepad_App/blob/8937c5d7fd4eb367ac21299409b6418ba1264a53/src/com/victorp/validator/impl/ValidatorImpl.java#L13
    Pattern.compile("(375)+\\d{2}+\\s?\\d{7}"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1143
    Pattern.compile("^\\{(?<plurals>.*)\\}$"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1145
    Pattern.compile("(zero|one|two|few|many|other):((' '|[^ ])+)[ ]*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1192
    Pattern.compile(":.*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1193
    Pattern.compile("[^:]+:"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1209
    Pattern.compile("(zero|one|two|few|many):\\s*([niftvw]{1})\\s*(([/\\%])\\s*(\\d+))*\\s*(!{0,1}=)\\s*((\\d+)\\.\\.(\\d+)|\\d+)\\s*(\\,\\s*((\\d+)\\.\\.(\\d+)|\\d+))*(\\s*(and|or)\\s*([niftvw]{1})\\s*(([/\\%])\\s*(\\d+))*\\s*(!{0,1}=)\\s*((\\d+)\\.\\.(\\d+)|\\d+)\\s*(\\,\\s*((\\d+)\\.\\.(\\d+)|\\d+))*)*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L1718
    Pattern.compile("\\p{Nd}+"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L2407
    Pattern.compile("or"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L2409
    Pattern.compile("and"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L2414
    Pattern.compile("(?<op>[niftvw]{1})\\s*((?<div>[/\\%])\\s*(?<val>\\d+))*"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L2415
    Pattern.compile("(?<rel>!{0,1}=)"),
    // https://github.com/requestlib/myRepository/blob/20c869cf7eb48eb0d329122ec14e9a9b652d17ec/src/java.base/java/text/CompactNumberFormat.java#L2416
    Pattern.compile("(?<start>\\d+)\\.\\.(?<end>\\d+)|(?<value>\\d+)"),
    // https://github.com/bingfengyiqie/netty-study/blob/c801f50b8c19d65aad21ae9ee81d6b288e60d9a7/codec-http/src/main/java/io/netty/handler/codec/http/HttpVersion.java#L35
    Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L60
    Pattern.compile("<[a-z].+>"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L75
    Pattern.compile("</[a-z].+>"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L187
    Pattern.compile("<[^/].+"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L199
    Pattern.compile("</.+"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L211
    Pattern.compile("<[a-z]+>"),
    // https://github.com/Gazda70/HTML_Analizer/blob/9b9fd214e44d16bd62a1b4a4bd8f3e6c11d64cca/Laboratorium%201%20-%20analizator%20poprawno%C5%9Bci%20HTML/src/Model/Analyzer.java#L223
    Pattern.compile("</[a-z]+>"),
    // https://github.com/Thusi-fdo/WMA_SL/blob/37d64272fc349d067126ffcc039aff703c244513/WMA_Recycling/src/Code/Resident.java#L66
    Pattern.compile("^[0-9]{9}[vVxX]|[0-9]{12}$"),
    // https://github.com/nomorec/console.roulette/blob/f9b094322b0ec4ee617033518761bbd25801f1eb/console.roulette/src/main/java/com/playsafe/console/roulette/util/PlayerBetHandler.java#L20
    Pattern.compile("[1-9]|1[0-9]|2[0-9]|3[0-6]"),
    // https://github.com/nomorec/console.roulette/blob/f9b094322b0ec4ee617033518761bbd25801f1eb/console.roulette/src/main/java/com/playsafe/console/roulette/util/PlayerBetHandler.java#L21
    Pattern.compile("ODD"),
    // https://github.com/nomorec/console.roulette/blob/f9b094322b0ec4ee617033518761bbd25801f1eb/console.roulette/src/main/java/com/playsafe/console/roulette/util/PlayerBetHandler.java#L22
    Pattern.compile("EVEN"),
    // https://github.com/HAISHEN-CapstonDesign/CRUNCH-backend/blob/70345818b8bf78cc83305f6e91afe957b6bbc369/backend/crunch_server/src/main/java/com/crunch/crunch_server/domain/commit/service/ModifyService.java#L297
    Pattern.compile(",| |@@"),
    // https://github.com/Loic-Mathieu/Persea-Management/blob/3db261178d46cb55e742d3436bb32314fff5871d/SERVER/src/main/java/be/hers/info/persea/controller/courtCase/CreateDocumentController.java#L43
    Pattern.compile("<<(.+?)>>", Pattern.DOTALL),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/sun/security/krb5/auto/BadKdc.java#L41
    Pattern.compile(">>> KDCCommunication: kdc=kdc.rabbit.hole UDP:(\\d)...., timeout=(\\d+),"),
    // https://github.com/qiuzj/jdk7u60_jdk/blob/a3c5500fe0b0ddc6a93362af38730121a70a8356/test/sun/nio/cs/FindEncoderBugs.java#L197
    Pattern.compile(".*BOM.*"),
    // https://github.com/mengxianming/myknowhow/blob/34d3ad7731243a67221909bb0c51fdf59c47a752/simplemybatis/src/main/java/my/study/sprintbootabc/vo/User.java#L153
    Pattern.compile("\\{([_a-zA-z][_a-zA-Z0-9\\.]*)\\}"),
  };
}
