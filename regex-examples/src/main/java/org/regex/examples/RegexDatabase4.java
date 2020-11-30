package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase4 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L216
    Pattern.compile(".*Warning: entity \".*\" doesn't end in ';'"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L217
    Pattern.compile(".*Warning: inserting implicit <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L218
    Pattern.compile(".*Warning: inserting missing 'title' element"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L219
    Pattern.compile(".*Warning: missing <!DOCTYPE> declaration"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L220
    Pattern.compile(".*Warning: missing <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L221
    Pattern.compile(".*Warning: missing </.*> before <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L222
    Pattern.compile(".*Warning: nested emphasis <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L223
    Pattern.compile(".*Warning: plain text isn't allowed in <.*> elements"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L224
    Pattern.compile(".*Warning: replacing <p> by <br>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L225
    Pattern.compile(".*Warning: replacing invalid numeric character reference .*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L226
    Pattern.compile(".*Warning: replacing unexpected .* by </.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L227
    Pattern.compile(".*Warning: trimming empty <.*>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L228
    Pattern.compile(".*Warning: unescaped & or unknown entity \".*\""),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L229
    Pattern.compile(".*Warning: unescaped & which should be written as &amp;"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L230
    Pattern.compile(".*Warning: using <br> in place of <p>"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L231
    Pattern.compile(".*Warning: <.*> element removed from HTML5"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L232
    Pattern.compile(".*Warning: <.*> attribute \".*\" not allowed for HTML5"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L233
    Pattern.compile(".*Warning: The summary attribute on the <table> element is obsolete in HTML5"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tidy/util/Main.java#L234
    Pattern.compile(".*Warning: replacing invalid UTF-8 bytes \\(char. code U\\+.*\\)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tool/PathsTest.java#L81
    Pattern.compile("package [a-z]+ does not exist"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/doclint/tool/PathsTest.java#L82
    Pattern.compile("bad HTML entity"),
    // https://github.com/samtingleff/dgrid/blob/47fb753159e5b6c538e70fef2903c8028d7cf897/java/src/api/com/dgrid/util/HTMLTagStrip.java#L7
    Pattern.compile("\\<.*?\\>"),
    // https://github.com/samtingleff/dgrid/blob/47fb753159e5b6c538e70fef2903c8028d7cf897/java/src/client/com/dgrid/util/webclient/jakarta/JakartaCommonsHttpGetClient.java#L39
    Pattern.compile("([a-zA-Z0-9\\-\\+\\.\\/]+)\\s*(.*)?"),
    // https://github.com/harlanji/soashable/blob/ad383f88ff7fc8dc1c407c8c0eb49a08c877f809/jhb/src/main/java/org/jabber/JabberHTTPBind/Session.java#L328
    Pattern.compile(".*<stream:stream[^>]*id=['|\"]([^'|^\"]+)['|\"][^>]*>.*", Pattern.DOTALL),
    // https://github.com/harlanji/soashable/blob/ad383f88ff7fc8dc1c407c8c0eb49a08c877f809/jhb/src/main/java/org/jabber/JabberHTTPBind/Session.java#L333
    Pattern.compile(".*<stream:stream[^>]*id=['|\"]([^'|^\"]+)['|\"][^>]*>.*(<stream.*)$", Pattern.DOTALL),
    // https://github.com/harlanji/soashable/blob/ad383f88ff7fc8dc1c407c8c0eb49a08c877f809/jhb/src/main/java/org/jabber/JabberHTTPBind/Session.java#L337
    Pattern.compile(".*<stream:stream[^>]*version=['|\"]1.0['|\"][^>]*>.*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/rails/core/deployers/RailsVersionDeployer.java#L67
    Pattern.compile("^\\s*MAJOR\\s*=\\s*([0-9]+)\\s*$"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/rails/core/deployers/RailsVersionDeployer.java#L68
    Pattern.compile("^\\s*MINOR\\s*=\\s*([0-9]+)\\s*$"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/rails/core/deployers/RailsVersionDeployer.java#L69
    Pattern.compile("^\\s*TINY\\s*=\\s*([0-9]+)\\s*$"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/api/TestSearchPaths.java#L618
    Pattern.compile("package\\s+(((?:\\w+\\.)*)(?:\\w+))"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/api/TestSearchPaths.java#L620
    Pattern.compile("(?:public\\s+)?(?:class|enum|interface)\\s+(\\w+)"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/ruby/core/util/StringUtils.java#L61
    Pattern.compile("([A-Z]+)([A-Z][a-z])"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/ruby/core/util/StringUtils.java#L62
    Pattern.compile("([a-z\\d])([A-Z])"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/ruby/core/util/StringUtils.java#L74
    Pattern.compile("\\/(.?)"),
    // https://github.com/bobmcwhirter/jboss-rails/blob/c0809da9a4ee8afad56b37547fafce25e2bc1232/src/main/java/org/jboss/ruby/core/util/StringUtils.java#L81
    Pattern.compile("(_)(.)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/MessageFile.java#L34
    Pattern.compile("[-\\\\'A-Z\\.a-z ]+( \\([A-Za-z 0-9]+\\))?"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/MessageFile.java#L128
    Pattern.compile(".*\\{[0-9]+\\}.*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/MessageFile.java#L137
    Pattern.compile("\\{([0-9]+)\\}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/RunExamples.java#L274
    Pattern.compile("(?s)(/\\*.*?Copyright.*?\\*/\n)\\s*(.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/diags/RunExamples.java#L276
    Pattern.compile("(?s)((?://\\s*[a-z]+:[^\n]*\n)+)\\s*(.*)"),
    // https://github.com/apache/geode/blob/880a9d614d1ac2418c5bace4fdbb8e255ab8e3dd/extensions/geode-modules/src/main/java/org/apache/geode/modules/util/ResourceManagerValidator.java#L29
    Pattern.compile("(\\d+|[^\\d]+)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/lib/combo/ComboParameter.java#L46
    Pattern.compile("#\\{([A-Z_][A-Z0-9_]*(?:\\[\\d+\\])?)(?:\\.([A-Z0-9_]*))?\\}"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/modules/GraphsTest.java#L163
    Pattern.compile("compiler\\.err.*(openO\\.O|openN\\.N|openL\\.L)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/options/xprefer/XPreferTest.java#L189
    Pattern.compile("\\[loading .*\\]"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javac/policy/test1/Test1b.java#L110
    Pattern.compile("([A-Z]+).*"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javap/T8038414.java#L116
    Pattern.compile(" +#\\d+ = String +#(\\d+) +// +(.*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/javap/T8038414.java#L129
    Pattern.compile(".* +"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/jdeprscan/tests/jdk/jdeprscan/TestPrims.java#L86
    Pattern.compile("^class "),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/langtools/tools/jdeprscan/tests/jdk/jdeprscan/TestPrims.java#L89
    Pattern.compile("^error: "),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/lib/jdk/test/lib/compiler/ModuleInfoMaker.java#L41
    Pattern.compile("module\\s+((?:\\w+\\.)*)"),
    // https://github.com/md-5/OpenJDK/blob/898644be29e5d2c5aaa22860e2d861e73fc4ef63/test/lib/sun/hotspot/cpuinfo/CPUInfo.java#L51
    Pattern.compile("([^(]*\\([^)]*\\)[^,]*),\\s*"),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/applications/party/src/main/java/org/apache/ofbiz/party/communication/CommunicationEventServices.java#L830
    Pattern.compile("[<>]"),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/applications/party/src/main/java/org/apache/ofbiz/party/communication/CommunicationEventServices.java#L1204
    Pattern.compile("^Action: (.*)$", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/applications/party/src/main/java/org/apache/ofbiz/party/communication/CommunicationEventServices.java#L1221
    Pattern.compile("^Message-Id: (.*)$", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/bmc/javautil/blob/a146ece36f6053bc287bf2cb42fbd427b23863c5/src/main/java/org/clapper/util/html/HTMLUtil.java#L158
    Pattern.compile("&(#?[^;\\s&]+);?"),
    // https://github.com/bmc/curn/blob/84d6f49245ae29a291b637442652b9053cfde723/src/main/java/org/clapper/curn/parser/ParserUtil.java#L482
    Pattern.compile("^[+-][0-9][0-9]:[0-9][0-9]$"),
    // https://github.com/earl/rhino-mirror/blob/014787f34aaa35b5dd4592e0f3cbc800d8f324c8/src/org/mozilla/javascript/RhinoException.java#L288
    Pattern.compile("_c_(.*)_\\d+"),
    // https://github.com/stm555/proof-of-concepts/blob/c9a84c8efcf09ea12bbaa7cc5774a3b7ecb24fc8/public/scripts/dojo/dojox/off/demos/editor/server/org/dojo/moxie/MoxieServlet.java#L319
    Pattern.compile("[\"]", Pattern.MULTILINE),
    // https://github.com/stm555/proof-of-concepts/blob/c9a84c8efcf09ea12bbaa7cc5774a3b7ecb24fc8/public/scripts/dojo/dojox/off/demos/editor/server/org/dojo/moxie/MoxieServlet.java#L324
    Pattern.compile("\n|\r", Pattern.MULTILINE),
    // https://github.com/bkayyar/StudioEndoOMS/blob/b3774f961b469767fba570461ec4960185ecea2c/framework/base/src/main/java/org/apache/ofbiz/base/util/UtilXml.java#L1075
    Pattern.compile("value '\\$\\{.*\\}'"),
    // https://github.com/earl/rhino-mirror/blob/014787f34aaa35b5dd4592e0f3cbc800d8f324c8/toolsrc/org/mozilla/javascript/tools/shell/Global.java#L531
    Pattern.compile("@[0-9a-fA-F]+"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/migrations/src/main/java/joist/codegen/Config.java#L402
    Pattern.compile("\\$entityType"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/migrations/src/main/java/joist/codegen/Config.java#L402
    Pattern.compile("\\$variableName"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/sourcegen/GClass.java#L25
    Pattern.compile("(([a-z][a-zA-Z0-9_]*\\.)*)([A-Z][a-zA-Z0-9_]+)"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/sourcegen/GClass.java#L397
    Pattern.compile("\\.$"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/util/StringBuilderr.java#L9
    Pattern.compile("_ +"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/util/Tick.java#L7
    Pattern.compile("(?<!')'(?!')"),
    // https://github.com/stephenh/joist/blob/13f5d564487f7cfc3b38cdf8adf2eb2b6a60c39a/util/src/main/java/joist/util/Tick.java#L8
    Pattern.compile("''"),
    // https://github.com/apache/storm/blob/21bb1388414d373572779289edc785c7e5aa52aa/examples/storm-loadgen/src/main/java/org/apache/storm/loadgen/SlowExecutorPattern.java#L32
    Pattern.compile("\\s*(?<slowness>[^:]+)\\s*(?::\\s*(?<count>[0-9]+))?\\s*"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DSLMappingFile.java#L41
    Pattern.compile("((\\[[^\\[]*\\])\\s*(\\[([^\\[]*)\\])?)?\\s*((\\\\=|[^=])*)=(.*)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DSLMappingFile.java#L126
    Pattern.compile("\\\\="),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultDSLMappingEntry.java#L43
    Pattern.compile("(^|[^\\\\])\\{([(\\\\\\{)|[^\\{]]*?)\\}", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultDSLMappingEntry.java#L48
    Pattern.compile("(^\\(|[^\\\\]\\(|\\G\\()"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java#L53
    Pattern.compile("((^\\s*rule.*?$.*?^\\s*when.*?)$(.*?)(^\\s*then.*?$)(.*?)(^\\s*end)|(^\\s*query.*?)$(.*?)(^\\s*end))", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java#L241
    Pattern.compile("[\n\r]"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/main/java/org/drools/rule/builder/dialect/java/JavaConsequenceBuilder.java#L49
    Pattern.compile("\\r\\n|\\r|\\n"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/test/java/org/drools/integrationtests/waltz/Waltz.java#L113
    Pattern.compile(".*make line \\^p1 ([0-9]*) \\^p2 ([0-9]*).*"),
    // https://github.com/apache/storm/blob/21bb1388414d373572779289edc785c7e5aa52aa/external/storm-kafka-client/src/test/java/org/apache/storm/kafka/spout/subscription/PatternTopicFilterTest.java#L48
    Pattern.compile("test-\\d+"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-compiler/src/test/java/org/drools/lang/dsl/ANTLRDSLTest.java#L43
    Pattern.compile("(\\W|^)where\\s+([\\S]+)\\s+is \"(.*?)\"(\\W|$)"),
    // https://github.com/apache/storm/blob/21bb1388414d373572779289edc785c7e5aa52aa/storm-client/src/jvm/org/apache/storm/blobstore/BlobStoreFile.java#L30
    Pattern.compile("^\\d+\\.tmp$"),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-dev/src/main/java/org/languagetool/dev/archive/UselessExampleFinder.java#L102
    Pattern.compile(".*id=[\"'](.*?)[\"'].*"),
    // https://github.com/kousen/grails_plugin_survey/blob/9b89fd5353b8243ef0ec43862c69512bf82b05d6/plugins/searchable-0.5-SNAPSHOT/src/java/org/codehaus/groovy/grails/plugins/searchable/compass/search/DefaultSuggestQueryMethod.java#L117
    Pattern.compile("\\+\\((.+)\\) \\+\\(alias:.+\\)"),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanUnpairedBracketsRule.java#L42
    Pattern.compile("\\d+|[a-zA-Z]", Pattern.UNICODE_CASE),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanUnpairedBracketsRule.java#L43
    Pattern.compile("\\d[\\d., ]+\\d|\\d{1,2}", Pattern.UNICODE_CASE),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-core/src/main/java/org/drools/workflow/instance/node/WorkItemNodeInstance.java#L44
    Pattern.compile("#\\{(\\S+)\\}", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-decisiontables/src/test/java/org/drools/decisiontable/ExternalSpreadsheetCompilerUnitTest.java#L78
    Pattern.compile(".*setIsValid\\(Y\\).*setIsValid\\(Y\\).*setIsValid\\(Y\\).*", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/dsl/editor/DSLAdapter.java#L46
    Pattern.compile("\\n\\s*expander\\s*(.*)\\.dsl\\s", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/DRLReconcilingStrategy.java#L27
    Pattern.compile("\\n\\s*(rule\\s+.*?\\n\\s*end)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/DRLReconcilingStrategy.java#L28
    Pattern.compile("\\n\\s*(template\\s+.*?\\n\\s*end)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/DRLReconcilingStrategy.java#L29
    Pattern.compile("\\n\\s*(query\\s+.*?\\n\\s*end)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/DRLReconcilingStrategy.java#L30
    Pattern.compile("\\n\\s*(function\\s+[^\\{]*\\{)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/DRLReconcilingStrategy.java#L31
    Pattern.compile("\\n\\s*((\\s*import\\s+[^\\s;]+;?[\\t\\x0B\\f\\r]*\\n)+)", Pattern.DOTALL),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-language-modules/km/src/main/java/org/languagetool/rules/km/KhmerSpaceBeforeRule.java#L35
    Pattern.compile("ដើម្បី|និង|ពីព្រោះ", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionContext.java#L24
    Pattern.compile(".*dialect\\s+\"mvel\".*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionContext.java#L27
    Pattern.compile(".*dialect\\s+\"java\".*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L13
    Pattern.compile("[\\.\\(\\{\\[]\\Z", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L16
    Pattern.compile("]\\)\\}\\]\\Z", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L19
    Pattern.compile(".*modify\\s*\\(\\s*(.*)\\s*\\)(\\s*\\{(.*)\\s*\\}?)?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L22
    Pattern.compile(".*[;{}]\\s*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L24
    Pattern.compile(".*[\\(]\\s*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/CompletionUtil.java#L241
    Pattern.compile("\\(\\)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/DefaultCompletionProcessor.java#L60
    Pattern.compile(".*\n\\W*import\\W[^;\\s]*", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/completion/DefaultCompletionProcessor.java#L63
    Pattern.compile(".*\n\\W*function\\s+(\\S+)\\s+(\\S+)\\s*\\(([^\\)]*)\\)\\s*\\{([^\\}]*)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L50
    Pattern.compile("\\n\\s*rule\\s+\"([^\"]+)\"", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L53
    Pattern.compile("\\n\\s*rule\\s+([^\\s;#\"]+)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L56
    Pattern.compile("\\s*package\\s+([^\\s;#]+);?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L59
    Pattern.compile("\\n\\s*function\\s+(\\S+)\\s+(\\S+)\\(.*?\\)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L62
    Pattern.compile("\\n\\s*template\\s+([^\\s;#\"]+)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L65
    Pattern.compile("\\n\\s*import\\s+([^\\s;#]+);?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L68
    Pattern.compile("\\n\\s*expander\\s+([^\\s;#]+);?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L71
    Pattern.compile("\\n\\s*global\\s+(\\S+)\\s+([^\\s;#]+);?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L74
    Pattern.compile("\\n\\s*query\\s+\"([^\"]+)\"", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/editors/outline/RuleContentOutlinePage.java#L77
    Pattern.compile("\\n\\s*query\\s+([^\\s;#\"]+)", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/flow/ruleflow/view/property/constraint/RuleFlowGlobalsDialog.java#L58
    Pattern.compile("\\n\\s*global\\s+([^\\s;#]+)\\s+([^\\s;#]+);?", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/wizard/rule/DRLGenerator.java#L21
    Pattern.compile("\\$package\\$"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/wizard/rule/DRLGenerator.java#L22
    Pattern.compile("\\$date\\$"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/wizard/rule/DRLGenerator.java#L23
    Pattern.compile("\\$functions\\$"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-eclipse/drools-eclipse-plugin/src/main/java/org/drools/eclipse/wizard/rule/DRLGenerator.java#L24
    Pattern.compile("\\$expander\\$"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-examples/drools-examples-drl/src/main/java/org/drools/benchmark/waltzdb/WaltzDbBenchmark.java#L75
    Pattern.compile(".*make label \\^type ([0-9a-z]*) \\^name ([0-9a-zA-Z]*) \\^id ([0-9]*) \\^n1 ([B+-]*) \\^n2 ([B+-]*)( \\^n3 ([B+-]*))?.*"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L220
    Pattern.compile("[^(]"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L220
    Pattern.compile("[^)]"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L278
    Pattern.compile(".*\u0007\u0007.*"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L53
    Pattern.compile("\u0007\u0007"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L301
    Pattern.compile("\\s*-\\s*"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L306
    Pattern.compile("\\s*(url\\s*[(]\\s*(['\"])(.*?)(\\2\\s*[)]))\\s*"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L307
    Pattern.compile("[/][*].*?[*][/]", Pattern.DOTALL),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L308
    Pattern.compile("\\.(.*?)\\{(.*?)\\}", Pattern.DOTALL),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L309
    Pattern.compile("(.*?)(['\"])\\s*([)])"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/EMML.java#L558
    Pattern.compile("^.*event:$", Pattern.CASE_INSENSITIVE),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/ElementsCore.java#L633
    Pattern.compile("Android (.*?);"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/ElementsCore.java#L634
    Pattern.compile("AppleWebKit/(.*?) "),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/ElementsCore.java#L1262
    Pattern.compile("^(?i)javascript:"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/KeyCodeRemapper.java#L62
    Pattern.compile("\\b0{1}([xX]{1})([a-fA-F\\d]{2})\\b"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/KeyCodeRemapper.java#L63
    Pattern.compile("\\b([\\d]{1,6})\\b"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/apd/ApdEngine.java#L174
    Pattern.compile("\\\\r"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/apd/ApdEngine.java#L175
    Pattern.compile("\\\\n"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/apd/ApdEngine.java#L54
    Pattern.compile("\\$\\$\\[CMD:([0-9A-Fa-f]{4})(,.*)*\\]\\$\\$"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/extensions/rhoelementsext/ext/rhoelementsext/platform/android/rhoelements_temp/src/com/rho/rhoelements/apd/transport/ApdBluetooth.java#L35
    Pattern.compile("([0-9A-Fa-f]{2}([:])){5}([0-9A-Fa-f]{2})"),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/IpaExtractor.java#L42
    Pattern.compile("'''?(.*?)'''?\\s+\\[?\\{\\{IPA\\|([^}]*)\\}\\}"),
    // https://github.com/languagetool-org/languagetool/blob/a59e098453f402ef4c7f774d2a0edecc3662224f/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/IpaExtractor.java#L43
    Pattern.compile("\\{\\{IPA\\|([^}]*)\\}\\}"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-guvnor/src/main/java/org/drools/guvnor/server/files/PackageDeploymentURIHelper.java#L51
    Pattern.compile(".*/(package|asset)/(.*)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-guvnor/src/main/java/org/drools/guvnor/server/util/ClassicDRLImporter.java#L55
    Pattern.compile("function\\s+.*\\s+(.*)\\(.*\\).*"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-process/drools-jpdl/src/main/java/org/drools/jpdl/JpdlParser.java#L38
    Pattern.compile("<template>(.*)</template>", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-process/drools-jpdl/src/main/java/org/drools/jpdl/JpdlParser.java#L39
    Pattern.compile("<actors>(.*)</actors>", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-process/drools-jpdl/src/main/java/org/drools/jpdl/JpdlParser.java#L40
    Pattern.compile("<to>(.*)</to>", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-process/drools-jpdl/src/main/java/org/drools/jpdl/JpdlParser.java#L41
    Pattern.compile("<subject>(.*)</subject>", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-process/drools-jpdl/src/main/java/org/drools/jpdl/JpdlParser.java#L42
    Pattern.compile("<text>(.*)</text>", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-server/src/main/java/org/drools/server/KnowledgeStatelessServlet.java#L53
    Pattern.compile(".*knowledgebase/(.*)"),
    // https://github.com/apache/geode/blob/880a9d614d1ac2418c5bace4fdbb8e255ab8e3dd/geode-junit/src/main/java/org/apache/geode/test/compiler/ClassNameExtractor.java#L22
    Pattern.compile("(?:public|private|protected)* *(?:abstract)* *(?:class|interface) +(\\w+)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-templates/src/main/java/org/drools/template/model/SnippetBuilder.java#L60
    Pattern.compile("(.*?[^\\\\])(,|\\z)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-templates/src/main/java/org/drools/template/parser/ColumnFactory.java#L30
    Pattern.compile("([a-zA-Z0-9_]*)(\\[\\])?(:\\s*([a-zA-Z]*)(\\[\\])?)?"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-templates/src/main/java/org/drools/template/parser/DefaultTemplateColumn.java#L38
    Pattern.compile("^(!?)([a-zA-Z0-9_]*)(\\[([0-9]+)\\])?\\s*(.*)"),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/drools-templates/src/main/java/org/drools/template/parser/RuleTemplate.java#L85
    Pattern.compile("@\\{(.[^}]*)\\}"),
    // https://github.com/robmyers/paintr/blob/ba42121a118048e9ce3856d449f28481138e8c11/paintr.java#L34
    Pattern.compile("fill:#(..)(..)(..)"),
    // https://github.com/robmyers/paintr/blob/ba42121a118048e9ce3856d449f28481138e8c11/paintr_fullscreen.java#L31
    Pattern.compile("</a> by (.+) which "),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/experimental/drools-update/src/main/java/org/drools/tools/update/drl/actions/MemoryActionsFix.java#L35
    Pattern.compile("(.*\\b)modify(\\s*\\(([^)]+)\\)(\\s*;.*))", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/experimental/drools-update/src/main/java/org/drools/tools/update/drl/actions/MemoryActionsFix.java#L37
    Pattern.compile("(.*\\b)assert(\\s*\\((.*)\\)(\\s*;.*))", Pattern.DOTALL),
    // https://github.com/bobmcwhirter/drools/blob/62a0a5907ca1f4505cea2f4c55302da846b1cc75/experimental/drools-update/src/main/java/org/drools/tools/update/drl/actions/MemoryActionsFix.java#L39
    Pattern.compile("(.*\\b)assertLogical(\\s*\\((.*)\\)(\\s*;.*))", Pattern.DOTALL),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/com/thoughtworks/selenium/SeleneseTestCase.java#L241
    Pattern.compile("exact:"),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/com/thoughtworks/selenium/SeleneseTestCase.java#L249
    Pattern.compile("glob:"),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/com/thoughtworks/selenium/SeleneseTestCase.java#L250
    Pattern.compile("([\\]\\[\\\\{\\}$\\(\\)\\|\\^\\+.])"),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/org/openqa/selenium/WebDriverBackedSelenium.java#L40
    Pattern.compile("^(\\p{Alpha}+)=(.*)"),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/org/openqa/selenium/WebDriverBackedSelenium.java#L41
    Pattern.compile("^(\\p{Alpha}+):(.*)"),
    // https://github.com/shs96c/webdriver/blob/d81b04813a9377eedd675517427104ab938bc06d/selenium/src/java/org/openqa/selenium/internal/NameLookupStrategy.java#L17
    Pattern.compile("^(\\p{Alpha}+)=(.+)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/core/plugins/org.eclipse.dltk.debug.ui/src/org/eclipse/dltk/debug/ui/ScriptDebuggerConsoleToFileHyperlink.java#L29
    Pattern.compile("\\t*#\\d+ +file:(.*) \\[(\\d+)\\]"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/Markup.java#L295
    Pattern.compile(":\\d+"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/MarkupParser.java#L71
    Pattern.compile("\\[if .+\\]>(.|\n|\r)*<!\\[endif\\]"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/MarkupParser.java#L440
    Pattern.compile("<pre>.*?</pre>", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/MarkupParser.java#L449
    Pattern.compile("[ \\t]+"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/MarkupParser.java#L450
    Pattern.compile("( ?[\\r\\n] ?)+"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/html/PackageResource.java#L96
    Pattern.compile(".*\\.css"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/markup/html/PackageResource.java#L104
    Pattern.compile(".*\\.js"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/protocol/http/request/CryptedUrlWebRequestCodingStrategy.java#L319
    Pattern.compile("\\w\\w\\w+"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/io/XmlReader.java#L40
    Pattern.compile("[\\s\\n\\r]*<\\?xml(\\s+.*)?\\?>"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/io/XmlReader.java#L44
    Pattern.compile("\\s+encoding\\s*=\\s*([\"\'](.*?)[\"\']|(\\S*)).*\\?>"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/lang/Bytes.java#L94
    Pattern.compile("([0-9]+([\\.,][0-9]+)?)\\s*(|K|M|G|T)B?", Pattern.CASE_INSENSITIVE),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/license/JavaLicenseHeaderHandler.java#L29
    Pattern.compile("^(.*?)package.*$", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/string/Strings.java#L64
    Pattern.compile("\\&\\#\\d+\\;"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/util/time/Duration.java#L117
    Pattern.compile("([0-9]+([.,][0-9]+)?)\\s+(millisecond|second|minute|hour|day)s?", Pattern.CASE_INSENSITIVE),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/validation/validator/UrlValidator.java#L133
    Pattern.compile("^[\\x00-\\x7F]+$"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/validation/validator/UrlValidator.java#L115
    Pattern.compile("^[a-zA-Z].*$"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/main/java/org/apache/wicket/validation/validator/UrlValidator.java#L129
    Pattern.compile("^(/[-\\w:@&?=+,.!/~*'%$_;]*)?$"),
    // https://github.com/astubbs/wicket.get-portals2/blob/6ceca0773ab057880643ba2bd87eb18855e04082/wicket/src/test/java/org/apache/wicket/ajax/AjaxRequestTargetTest.java#L136
    Pattern.compile(".*<header-contribution>(.*?)</header-contribution>.*", Pattern.DOTALL),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/javascript/plugins/org.eclipse.dltk.javascript.debug.ui/src/org/eclipse/dltk/javascript/internal/debug/ui/console/JavaScriptFileHyperlink.java#L151
    Pattern.compile("\\(file \"(.*)\""),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/javascript/plugins/org.eclipse.dltk.javascript.debug.ui/src/org/eclipse/dltk/javascript/internal/debug/ui/console/JavaScriptFileHyperlink.java#L173
    Pattern.compile("line (\\d*)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/python/plugins/org.eclipse.dltk.python.debug.ui/src/org/eclipse/dltk/python/internal/debug/ui/console/PythonFileHyperlink.java#L156
    Pattern.compile("File\\s*\"(.*)\""),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/releng/common/org.eclipse.dltk.common.build/src/org/eclipse/dltk/common/build/ChangeBundleClasspath.java#L130
    Pattern.compile("Bundle-ClassPath:(\\s*([^,\n\r]*)(?:,.*?(?=^\\S+:)|,.*)?)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/platform/android/Rhodes/src/com/rhomobile/rhodes/event/Event.java#L53
    Pattern.compile("^P((\\d+)D)??T??((\\d+)H)??((\\d+)M)??((\\d+)S)??$"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/core/RubyContentDescriber.java#L12
    Pattern.compile("#!\\s*.*ruby", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/core/RubyContentDescriber.java#L13
    Pattern.compile("#!\\s*/usr/bin/ruby", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/core/RubyContentDescriber.java#L14
    Pattern.compile("#!\\s*/usr/bin/env\\s*ruby", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L116
    Pattern.compile("\\.(?=[\\s,\\)\\]\\}]|$)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L117
    Pattern.compile("\\$(?=[\\s,\\)\\]\\}]|$)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L118
    Pattern.compile("@(?=[\\s,\\)\\]\\}]|$)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L119
    Pattern.compile("::(?=[\\s,\\)\\]\\}]|$)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L120
    Pattern.compile("(?:=>.*,[\\s]*)(:)(?=[\\s]*(?=[,}\\)]))", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L121
    Pattern.compile(":(?=[\\s]*(?=[,}\\)]))", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L122
    Pattern.compile("(?:=>.*,[\\s]*)(:)(?=[\\s]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L123
    Pattern.compile(":(?=[\\s]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L124
    Pattern.compile("@(])"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L125
    Pattern.compile("\\$(])"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L126
    Pattern.compile("(?:=>.*)(,)(?=[\\s)]*do)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L127
    Pattern.compile(",(?=[\\s)]*do)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L128
    Pattern.compile("(?:=>.*,[^=>\r\n]*)([\\:a-zA-Z0-9_!?])(?=[\\s)]*do)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L129
    Pattern.compile("(?:=>.*)(,)(?=[\\s]*[)][\\s]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L130
    Pattern.compile(",(?=[\\s]*[)][\\s]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L131
    Pattern.compile("(?:=>.*,[^=>\r\n]*)([\\:a-zA-Z0-9_!?])(?=[\\s]*[)][\\s]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L132
    Pattern.compile("(?:=>.*)(,)(?=[\\s)]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L133
    Pattern.compile(",(?=[\\s)]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L134
    Pattern.compile("(?:=>.*,[^=>\r\n]*)([\\:a-zA-Z0-9_!?])(?=[\\s)]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L135
    Pattern.compile("=>(?=[\\s)]*do)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L136
    Pattern.compile("=>(?=[\\s]*[,}\\)])", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L137
    Pattern.compile("=>(?=[\\s)]*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.core/src/org/eclipse/dltk/ruby/internal/parser/JRubySourceParser.java#L138
    Pattern.compile("^(?:\\s*)(\\s)(?:[a-zA-Z0-9_\"\':]+[\\s]*=>.*$)", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.debug.ui/src/org/eclipse/dltk/ruby/internal/debug/ui/console/RubyFileHyperlink.java#L192
    Pattern.compile("^(.+rb):(\\d+)$"),
    // https://github.com/gentoo-mirror/gentoo/blob/718e514351921e316be5e7aa9c4ba643ab04e37f/dev-java/java-dep-check/files/Main-0.3.java#L168
    Pattern.compile("^DEPEND=\"([^\"]*)\"$"),
    // https://github.com/gentoo-mirror/gentoo/blob/718e514351921e316be5e7aa9c4ba643ab04e37f/dev-java/java-dep-check/files/Main-0.3.java#L169
    Pattern.compile("^CLASSPATH=\"([^\"]*)\"$"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.ui/src/org/eclipse/dltk/ruby/internal/ui/documentation/RubyDocumentationProvider.java#L287
    Pattern.compile("\\*[_a-zA-Z0-9]+\\*"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.ui/src/org/eclipse/dltk/ruby/internal/ui/formatting/OldCodeFormatter.java#L66
    Pattern.compile("if|unless|while|until|rescue"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.ui/src/org/eclipse/dltk/ruby/internal/ui/formatting/OldCodeFormatter.java#L67
    Pattern.compile("[\\-,.+*/%&|\\^~=<>:]"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.ui/src/org/eclipse/dltk/ruby/internal/ui/formatting/OldCodeFormatter.java#L69
    Pattern.compile("(^|[\\s])(while|until|for|rescue)[\\s]"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/ruby/plugins/org.eclipse.dltk.ruby.ui/src/org/eclipse/dltk/ruby/internal/ui/formatting/OldCodeFormatter.java#L153
    Pattern.compile("^[\t ]*"),
    // https://github.com/aiwilliams/sails/blob/a0e88d396aaada469e296ea06b646a6d57434608/org.opensails.sails/core/org/opensails/sails/action/oem/TemplateActionResult.java#L10
    Pattern.compile("^(.*?)/(.*?)?"),
    // https://github.com/aiwilliams/sails/blob/a0e88d396aaada469e296ea06b646a6d57434608/org.opensails.sails/core/org/opensails/sails/event/oem/PostEvent.java#L18
    Pattern.compile(".*?\\.[x|y]$"),
    // https://github.com/aiwilliams/sails/blob/a0e88d396aaada469e296ea06b646a6d57434608/org.opensails.sails/core/org/opensails/sails/event/oem/PostEvent.java#L19
    Pattern.compile("\\.[x|y]$"),
    // https://github.com/aiwilliams/sails/blob/a0e88d396aaada469e296ea06b646a6d57434608/org.opensails.sails/core/org/opensails/sails/url/oem/ControllerUrlResolver.java#L13
    Pattern.compile("(\\w)[\\|/](\\w)"),
    // https://github.com/aiwilliams/sails/blob/a0e88d396aaada469e296ea06b646a6d57434608/org.opensails.sails/test/unit/org/opensails/sails/validation/constraints/PatternValidatorTests.java#L10
    Pattern.compile(".*patt.*"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L12
    Pattern.compile("#!\\s*.*tclsh", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L13
    Pattern.compile("#!\\s*/usr/bin/tclsh", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L14
    Pattern.compile("#!\\s*/usr/bin/expect", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L15
    Pattern.compile("#!\\s*/usr/bin/wish", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L18
    Pattern.compile("# ;;; Local Variables?: \\*\\*\\*\\s*\r*\n# ;;; mode: t|Tcl \\*\\*\\*\\s*\r*\n# ;;; End: \\*\\*\\*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L22
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n#.*\\\\s*\r*\nexec .*tclsh .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L26
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n#.*\\\\s*\r*\nexec .*expect .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L30
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n#.*\\\\s*\r*\nexec .*wish.* .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L33
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n\\s*exec .*wish.* .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L36
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n\\s*exec .*tclsh.* .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.core/src/org/eclipse/dltk/tcl/core/TclContentDescriber.java#L39
    Pattern.compile("#!\\s*/bin/(ba|tc)?sh\\s*\r*\n\\s*exec .*expect.* .*", Pattern.MULTILINE),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.tclchecker/src/org/eclipse/dltk/tcl/internal/tclchecker/TclCheckerHelper.java#L33
    Pattern.compile("((?:\\w:)?[^:]+):(\\d+)\\s+\\((\\w+)\\)\\s+(.*)"),
    // https://github.com/andreyvit/yoursway-dltk/blob/851a796d687e9a5c082ae1a820f2e428ce6242bb/tcl/plugins/org.eclipse.dltk.tcl.ui/src/org/eclipse/dltk/tcl/internal/ui/documentation/ManPagesLocationsBlock.java#L516
    Pattern.compile("<a\\s+href=\"([a-zA-Z_0-9]+\\.html?)\"\\s*>(\\w+)</a>", Pattern.CASE_INSENSITIVE),
    // https://github.com/proteomicsyates/PINT/blob/b87e8732d8ac0f4359e9b7594d420011de0447e3/pint.excel/src/main/java/edu/scripps/yates/excel/proteindb/importcfg/ExcelFileReader.java#L100
    Pattern.compile(".+##.+##(.+)"),
    // https://github.com/proteomicsyates/PINT/blob/b87e8732d8ac0f4359e9b7594d420011de0447e3/pint.excel/src/main/java/edu/scripps/yates/excel/proteindb/importcfg/ExcelFileReader.java#L110
    Pattern.compile(".+##(.+)##.+"),
    // https://github.com/proteomicsyates/PINT/blob/b87e8732d8ac0f4359e9b7594d420011de0447e3/pint.excel/src/main/java/edu/scripps/yates/excel/proteindb/importcfg/ExcelFileReader.java#L120
    Pattern.compile("(.+)##.+##.+"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/HTMLDecoder.java#L44
    Pattern.compile("&#(\\d+);"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/HTMLDecoder.java#L53
    Pattern.compile("&#x([0-9a-fA-F]+);"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L266
    Pattern.compile("\\n{2,}"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L284
    Pattern.compile("<([-.\\w]+\\@[-a-z0-9]+(\\.[-a-z0-9]+)*\\.[a-z]+)>"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L365
    Pattern.compile("lang:"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L465
    Pattern.compile("[*+-]"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L481
    Pattern.compile("\\s+$"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L556
    Pattern.compile("(\\n)?^([ \\t]*)([-+*]|\\d+[.])[ ]+((?s:.+?)(\\n{1,2}))(?=\\n*(\\z|\\2([-+\\*]|\\d+[.])[ \\t]+))", Pattern.MULTILINE),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L678
    Pattern.compile("([!]\\[(.*?)\\][ ]?(?:\\n[ ]*)?\\[(.*?)\\])"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L717
    Pattern.compile("(\\[(.*?)\\][ ]?(?:\\n[ ]*)?\\[(.*?)\\])"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L796
    Pattern.compile("(\\[([^\\[\\]]+)\\])", Pattern.DOTALL),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/main/java/org/markdownj/MarkdownProcessor.java#L807
    Pattern.compile("[ ]?\\n"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/test/java/org/markdownj/test/EdgeCases.java#L71
    Pattern.compile("x"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/test/java/org/markdownj/test/MarkupFileTester.java#L100
    Pattern.compile("# Test (\\w+) \\((.*)\\)"),
    // https://github.com/myabc/markdownj/blob/f8ed00caeb69fc602aa2209812d953c26c2a4263/core/src/test/java/org/markdownj/test/MarkupFileTester.java#L101
    Pattern.compile("# Result (\\w+)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/gui.swing/gui.swing-1/src/main/backup/java/xyz/cofe/gui/swing/ActionMapEditor.java#L113
    Pattern.compile("(?ui)^([\\w\\d_\\.-]+)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/gui.swing/gui.swing-1/src/main/java/xyz/cofe/gui/swing/FlatTextEditor.java#L220
    Pattern.compile("^([ \\t]+).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-base/src/main/java/xyz/cofe/http/DateTime.java#L272
    Pattern.compile("(?is)^(Mon|Tue|Wed|Thu|Fri|Sat|Sun),\\s+(\\d{2})\\s+(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s+(\\d{4})\\s+(\\d{2}):(\\d{2}):(\\d{2})\\s+GMT.*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-base/src/main/java/xyz/cofe/http/DateTime.java#L321
    Pattern.compile("(?is)^(Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday),\\s+(\\d{2})-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(\\d{2})\\s+(\\d{2}):(\\d{2}):(\\d{2})\\s+GMT.*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-base/src/main/java/xyz/cofe/http/DateTime.java#L380
    Pattern.compile("(?is)^(Mon|Tue|Wed|Thu|Fri|Sat|Sun)\\s+(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s+(\\d{1,2})\\s+(\\d{2}):(\\d{2}):(\\d{2})\\s+(\\d{4}).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-base/src/main/java/xyz/cofe/http/HttpHeaders.java#L587
    Pattern.compile("(?is)^\\s*bytes\\s+(\\d+)\\s*-\\s*(\\d+)\\s*/\\s*(\\d+).*?$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/http/http-downloader-cli/src/bak/java/xyz/cofe/http/cli/DownloaderCLI.java#L592
    Pattern.compile("\\{([^\\}]*)\\}"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/platform/shared/xruby/src/com/xruby/debug/cmd/CommandLineFrontEnd.java#L42
    Pattern.compile("run(\\s*)|stop(\\s*)|list(\\s*)|cont(\\s*)|next(\\s*)|clear(\\s*)|locals(\\s*)|where(\\s*)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/platform/shared/xruby/src/com/xruby/debug/cmd/CommandLineFrontEnd.java#L44
    Pattern.compile("(stop){1}\\s*(at|in)\\s*((([\\w\\$]+)(.rb)*){1}:(\\d+){1})*"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/platform/shared/xruby/src/com/xruby/debug/cmd/CommandLineFrontEnd.java#L46
    Pattern.compile("(list)\\s+(\\d+)?"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/platform/shared/xruby/src/com/xruby/debug/cmd/CommandLineFrontEnd.java#L48
    Pattern.compile("(clear)\\s+(\\d+)?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/files/ByteSize.java#L126
    Pattern.compile("(?is)\\s*(-|\\+)?\\s*(\\d+)\\s*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/files/ByteSize.java#L133
    Pattern.compile("(?is)\\s*(-|\\+)?\\s*0\\s*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/files/ByteSize.java#L141
    Pattern.compile("(?is)\\s*(-|\\+)?(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)?(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)?(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)?(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)?(\\s*(\\d+)(\\.(\\d+))?\\s*(b|kb|mb|gb|tb|pb|k|m|g|t|p)?)?"),
    // https://github.com/pippo-java/pippo/blob/ac97241a3088320c18e35e9d8ccdd26ea0605002/pippo-core/src/main/java/ro/pippo/core/DefaultUriMatcher.java#L42
    Pattern.compile("\\{(.*?)(:\\s(.*?))?\\}"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/files/PropertiesFile.java#L805
    Pattern.compile("(?is)^\\s*(((\\\\u\\d{4})|(\\\\.)|([^\\=\\:\\#\\!]))+)(=|\\:)\\s*(.*)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/AbstractCharsetDetector.java#L88
    Pattern.compile("(?is)\\s*(([\\w\\d-_]+)\\s*=\\s*'([^']*)').*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/AbstractCharsetDetector.java#L89
    Pattern.compile("(?is)\\s*(([\\w\\d-_]+)\\s*=\\s*\"([^\"]*)\").*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/AbstractCharsetDetector.java#L90
    Pattern.compile("(?is)\\s*([\\w\\d-_]+).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/AbstractCharsetDetector.java#L471
    Pattern.compile("(?is).*?(<\\?xml\\s+([^>]*)\\?>).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/AbstractCharsetDetector.java#L538
    Pattern.compile("(?is).*?(<meta\\s+([^>]*)/?>).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/inetools/http/HttpResponseHelper.java#L113
    Pattern.compile("(?is)\\s*([\\w\\d\\./]+)\\s+(\\d+)\\s+(.*)"),
    // https://github.com/pippo-java/pippo/blob/ac97241a3088320c18e35e9d8ccdd26ea0605002/pippo-core/src/main/java/ro/pippo/core/route/UrlResourceHandler.java#L38
    Pattern.compile("-ver-[0-9a-f]+\\."),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/logs/RotateLogNaming.java#L314
    Pattern.compile("^(?is)\\s*(index|i+)\\s*"),
    // https://github.com/pippo-java/pippo/blob/ac97241a3088320c18e35e9d8ccdd26ea0605002/pippo-core/src/main/java/ro/pippo/core/util/MimeTypes.java#L44
    Pattern.compile("^.*\\.([^.]+)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/text/Text.java#L433
    Pattern.compile("(?is)^\\s*(\\-|\\+)?\\s*\\d+(\\.(\\d+))?\\s*$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/text/Text.java#L647
    Pattern.compile("^(\\<|=|\\>)?([1-9][0-9]*)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/text/parser/lex/TagNameParser.java#L56
    Pattern.compile("^([\\w|\\d|\\-|_]+)(:([\\w\\d\\-_]+))?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/text/template/AlignFormatBuilder.java#L51
    Pattern.compile("(?is)^((<?|=|>)(\\d+)).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/text/template/AlignFormatBuilder.java#L114
    Pattern.compile("(?s)^(.*?)\\:(((<?|=|>)(\\d+)))$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/types/ColorConvertor.java#L58
    Pattern.compile("(?is)^\\#((\\d\\d\\d)|(\\d\\d\\d\\d\\d\\d))$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/main/java/xyz/cofe/types/FontConvertor.java#L67
    Pattern.compile("(?i)^(.*?)\\s+?((plain|bold|italic)(\\s+(plain|bold|italic)){0,2})\\s+?(\\d+)$"),
    // https://github.com/egonw/gtd/blob/8088b38fb0005e26af92c5f25cf78c4b6a24e3da/com.github.gittodo/src/main/org/openscience/gittodo/app/ImportFromSourceForge.java#L31
    Pattern.compile(".*<input\\s*name=\"artifact_id\"\\s*value=\"(.*)\"\\s*type.*"),
    // https://github.com/egonw/gtd/blob/8088b38fb0005e26af92c5f25cf78c4b6a24e3da/com.github.gittodo/src/main/org/openscience/gittodo/app/ImportFromSourceForge.java#L32
    Pattern.compile(".*value=\"([^\"]*)\".*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/java-common/src/test/java/xyz/cofe/text/RegexReplaceTest.java#L60
    Pattern.compile("abc"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-base/src/main/java/xyz/cofe/repo/ComponentID.java#L101
    Pattern.compile("(?is)^(maven\\s+)?(\\S[^/]*)/([^/]+)/(.+)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-base/src/main/java/xyz/cofe/repo/ComponentID.java#L274
    Pattern.compile("(?is)\\d+"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-base/src/main/java/xyz/cofe/repo/spi/LogsSizeSPI.java#L122
    Pattern.compile("(?is)^\\s*((\\d+)(\\.\\d+)?(b|kb|mb|gb|k|m|g)?)\\s*$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-cli/src/main/java/xyz/cofe/uplaunch/cli/ComponentContext.java#L174
    Pattern.compile("(?s)^xyz\\.cofe\\.(repo|run)\\.([a-zA-Z0-9]+)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/main/java/xyz/cofe/repo/http/HttpRepo.java#L353
    Pattern.compile("(?is)^\\.*?<\\?xml [^>]*(encoding\\s*=\\s*\"([^\"]+)\"|encoding\\s*=\\s*\'([^\']+)\')[^>]*\\?>.*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/main/java/xyz/cofe/uplaunch/cli/TimeInterval.java#L101
    Pattern.compile("(?is)^(\\d+)(ms|d|h|m|s)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/main/java/xyz/cofe/uplaunch/cli/TimeInterval.java#L102
    Pattern.compile("(?is)^(\\d+)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/main/java/xyz/cofe/uplaunch/cli/TimeInterval.java#L103
    Pattern.compile("(?is)^\\s*-\\s*\\(([^\\)]+)\\)\\s*$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/archive/uplauncher/uplaunch-http/src/test/java/xyz/cofe/http/test/DownloadTest.java#L238
    Pattern.compile("(?is)^(\\w+),\\s+(\\d+)\\s+(\\w{3})\\s+(\\d{4})\\s+(\\d{2}):(\\d{2}):(\\d{2})\\s+(GMT).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/common-base/common/src/main/java/xyz/cofe/fs/Glob.java#L318
    Pattern.compile("\\*{3,}"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L41
    Pattern.compile("(?i)url\\(\\s*([\"']?)data\\:"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L223
    Pattern.compile("!important"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L229
    Pattern.compile("(?i):first\\-(line|letter)(\\{|,)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L242
    Pattern.compile("(?i)^(.*)(@charset)( \"[^\"]*\";)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L252
    Pattern.compile("(?i)^((\\s*)(@charset)( [^;]+;\\s*))+"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L262
    Pattern.compile("(?i)@(font-face|import|(?:-(?:atsc|khtml|moz|ms|o|wap|webkit)-)?keyframe|media|page|namespace)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L272
    Pattern.compile("(?i):(active|after|before|checked|disabled|empty|enabled|first-(?:child|of-type)|focus|hover|last-(?:child|of-type)|link|only-(?:child|of-type)|root|:selection|target|visited)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L282
    Pattern.compile("(?i):(lang|not|nth-child|nth-last-child|nth-last-of-type|nth-of-type|(?:-(?:moz|webkit)-)?any)\\("),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L293
    Pattern.compile("(?i)([:,\\( ]\\s*)(attr|color-stop|from|rgba|to|url|(?:-(?:atsc|khtml|moz|ms|o|wap|webkit)-)?(?:calc|max|min|(?:repeating-)?(?:linear|radial)-gradient)|-webkit-gradient)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L303
    Pattern.compile("(?i)\\band\\("),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L312
    Pattern.compile("(?i)(^|[^0-9])(?:0?\\.)?0(?:px|em|%|in|cm|mm|pc|pt|ex|deg|g?rad|m?s|k?hz)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L323
    Pattern.compile("(?i)(background-position|webkit-mask-position|transform-origin|webkit-transform-origin|moz-transform-origin|o-transform-origin|ms-transform-origin):0(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L399
    Pattern.compile("(:|\\s)(#f00)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L401
    Pattern.compile("(:|\\s)(#000080)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L402
    Pattern.compile("(:|\\s)(#808080)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L403
    Pattern.compile("(:|\\s)(#808000)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L404
    Pattern.compile("(:|\\s)(#800080)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L405
    Pattern.compile("(:|\\s)(#c0c0c0)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L406
    Pattern.compile("(:|\\s)(#008080)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L407
    Pattern.compile("(:|\\s)(#ffa500)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L408
    Pattern.compile("(:|\\s)(#800000)(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L412
    Pattern.compile("(?i)(border|border-top|border-right|border-bottom|border-left|outline|background):none(;|})"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L425
    Pattern.compile("\\(([\\-A-Za-z]+):([0-9]+)\\/([0-9]+)\\)"),
    // https://github.com/rhomobile/rhodes/blob/3f5cf6ffa90cf8c648ac19c954932d101fc56b42/res/build-tools/yuicompressor-2.4.8.src/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L431
    Pattern.compile("___YUI_QUERY_FRACTION___"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/common-base/common/src/main/java/xyz/cofe/text/FullDecFormat.java#L886
    Pattern.compile("(?is)^(?<sign>\\+)?(?<num1>[0\\#` ]+)((?<a1><|>|=)(?<ac1>\\d+))?((?<fpoint>\\,|\\.)(?<num2>[0\\#` ]+))?((?<a2><|>|=)(?<ac2>\\d+))?(\\*(?<kof>[\\+\\-]?\\d+(\\.\\d+)?)(?<shiftNum>[\\+\\-]\\d+(\\.\\d+)?)?)?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/common-base/common/src/test/java/xyz/cofe/text/FullDecFormatTest.java#L140
    Pattern.compile("(?is)^(?<sign>\\+)?(?<num1>[0\\#`]+)((?<a1><|>|=)(?<ac1>\\d+))(?<fpoint>\\,|\\.)(?<num2>[0\\#`]+)((?<a2><|>|=)(?<ac2>\\d+))"),
    // https://github.com/collin/gist-live/blob/857e7ff260a62467f0ee6a080544765debbc6082/vendor/diff_match_patch/diff_match_patch.java#L946
    Pattern.compile("\\n\\r?\\n\\Z", Pattern.DOTALL),
    // https://github.com/collin/gist-live/blob/857e7ff260a62467f0ee6a080544765debbc6082/vendor/diff_match_patch/diff_match_patch.java#L948
    Pattern.compile("\\A\\r?\\n\\r?\\n", Pattern.DOTALL),
    // https://github.com/collin/gist-live/blob/857e7ff260a62467f0ee6a080544765debbc6082/vendor/diff_match_patch/diff_match_patch.java#L2052
    Pattern.compile("^@@ -(\\d+),?(\\d*) \\+(\\d+),?(\\d*) @@$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/cxconsole-parent/cxconsole-base/src/main/java/xyz/cofe/cxconsole/menu/MenuPathComponent.java#L125
    Pattern.compile("(?uis)[\\p{Alpha}][\\p{Alpha}\\d_]*"),
    // https://github.com/jlewallen/git-teamcity/blob/b5b2369f52b5f498e3e684c2232919554c3247d1/src/main/java/org/hivedb/teamcity/plugin/Commit.java#L77
    Pattern.compile("([^\\s><]+)@\\S+"),
    // https://github.com/jlewallen/git-teamcity/blob/b5b2369f52b5f498e3e684c2232919554c3247d1/src/main/java/org/hivedb/teamcity/plugin/commands/LogOutput.java#L19
    Pattern.compile("^(\\w)\\s+(.+)$"),
    // https://github.com/jlewallen/git-teamcity/blob/b5b2369f52b5f498e3e684c2232919554c3247d1/src/main/java/org/hivedb/teamcity/plugin/commands/LogOutput.java#L35
    Pattern.compile("commit"),
    // https://github.com/jlewallen/git-teamcity/blob/b5b2369f52b5f498e3e684c2232919554c3247d1/src/main/java/org/hivedb/teamcity/plugin/commands/LogOutput.java#L38
    Pattern.compile("Author:"),
    // https://github.com/jlewallen/git-teamcity/blob/b5b2369f52b5f498e3e684c2232919554c3247d1/src/main/java/org/hivedb/teamcity/plugin/commands/LogOutput.java#L40
    Pattern.compile("Date:"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/cxconsole-parent/cxscript/src/test/java/xyz/cofe/cxconsole/sysout/MThreadHookTest1.java#L47
    Pattern.compile("(?iuU)\\b\\p{Alpha}[\\p{Alnum}\",\\.]+"),
    // https://github.com/Laurian/powermagpie/blob/c8a58b79558078ca8bf3f3715c472538190fb2ee/BackEnd/src/main/java/uk/ac/open/powermagpie/util/LabelSplitter.java#L375
    Pattern.compile("[a-z]+"),
    // https://github.com/Laurian/powermagpie/blob/c8a58b79558078ca8bf3f3715c472538190fb2ee/BackEnd/src/main/java/uk/ac/open/powermagpie/util/LabelSplitter.java#L379
    Pattern.compile(".+[A-Z]+"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L158
    Pattern.compile(".*Hostname:.*<td>([^<]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L161
    Pattern.compile(".*IP Address:.*<td>([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L165
    Pattern.compile(".*Port:.*<td>([0-9]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L168
    Pattern.compile(".*ID:.*<td>0x([0-9a-f]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L171
    Pattern.compile(".*Uptime:.*<td>([0-9]*) (weeks|week|days|day|hours|hour|minutes|minute|seconds|second)(?: ([0-9]*) (days|day|hours|hour|minutes|minute|seconds|second))?(?: ([0-9]*) (hours|hour|minutes|minute|seconds|second))?(?: ([0-9]*) (minutes|minute|seconds|second))?(?: ([0-9]*) (seconds|second))?</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L180
    Pattern.compile(".*Virtual Coordinates:.*<td>(-?[0-9.]+), (-?[0-9.]+), (-?[0-9.]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L184
    Pattern.compile(".*Current Storage:.*<td>([0-9.]+) MBs</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L187
    Pattern.compile(".*Build:.*<td>([0-9]+)</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L190
    Pattern.compile(".*Estimated Network Size:.*<td>([0-9]+) nodes</td>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L193
    Pattern.compile(".*<tr><td align=\"center\">(-?[0-9]+)</td><td align=\"center\"><a href=\"[^\"]*\">([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+)</a></td><td align=\"center\">([0-9]+)</td><td align=\"center\">0x([0-9a-f]+)</td><td align=\"center\">([0-9]+)</td></tr>.*"),
    // https://github.com/eliasbaixas/bamboo/blob/9d3adc4717bb2a80b589bd3be04ffdada7d48664/src/bamboo/vis/FetchNodeInfoThread.java#L199
    Pattern.compile(".*<tr><td align=\"center\">([0-9]+)</td><td align=\"center\">([0-9]+)</td><td align=\"center\"><a href=\"[^\"]*\">([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+)</a></td><td align=\"center\">([0-9]+)</td><td align=\"center\">0x([0-9a-f]+)</td><td align=\"center\">([0-9]+)</td></tr>.*"),
    // https://github.com/iskigow/MyMaskUtils/blob/60f3d244c18fb86d9fdda97e168515915c5bacf2/Mascara.java#L69
    Pattern.compile("([#]+)"),
    // https://github.com/iskigow/MyMaskUtils/blob/60f3d244c18fb86d9fdda97e168515915c5bacf2/Mascara.java#L89
    Pattern.compile("^"),
    // https://github.com/iskigow/MyMaskUtils/blob/60f3d244c18fb86d9fdda97e168515915c5bacf2/Mascara.java#L107
    Pattern.compile("([^\\p{Alnum}])"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/groovy/sql/Sql.java#L1091
    Pattern.compile("\\?'\"\\?"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/org/codehaus/groovy/runtime/InvokerHelper.java#L600
    Pattern.compile("\\r"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/org/codehaus/groovy/runtime/InvokerHelper.java#L602
    Pattern.compile("\\f"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/org/codehaus/groovy/wiki/TestCaseRenderEngine.java#L60
    Pattern.compile("\\{code:groovy\\}"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/org/codehaus/groovy/wiki/TestCaseRenderEngine.java#L61
    Pattern.compile("\\{code:groovysh\\}"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/groovy-core/src/main/org/codehaus/groovy/wiki/TestCaseRenderEngine.java#L62
    Pattern.compile("\\{code\\}"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/ide/groovy-eclipse/GroovyBrowsing/src/org/codehaus/groovy/eclipse/codebrowsing/TextUtils.java#L47
    Pattern.compile("[_a-zA-Z][_a-zA-Z0-9]*"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/ide/groovy-eclipse/GroovyEclipse/src/org/codehaus/groovy/eclipse/editor/actions/ToggleComment.java#L55
    Pattern.compile("\\s*\\/\\/.*"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/ide/groovy-eclipse/GroovyEclipse/src/org/codehaus/groovy/eclipse/launchers/GroovyConsoleLineTracker.java#L27
    Pattern.compile("(.*)\\.groovy:(.*)"),
    // https://github.com/andreyvit/groovy/blob/fc08603686ab7060f613fd4218726c14d58a01dd/groovy/ide/groovy-eclipse/org.codehaus.groovy.eclipse.codeassist.hippie/src/org/codehaus/groovy/eclipse/codeassist/hippie/HippieCompletionEngine.java#L38
    Pattern.compile("[\\p{L}[\\p{Mn}[\\p{Pc}[\\p{Nd}[\\p{Nl}[\\p{Sc}]]]]]]+"),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/BSONObjectTest.java#L502
    Pattern.compile("foo*", Pattern.CASE_INSENSITIVE),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/BSONObjectTest.java#L515
    Pattern.compile("bar*", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/FindTest.java#L132
    Pattern.compile("eir"),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/FindTest.java#L133
    Pattern.compile("g"),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/FindTest.java#L134
    Pattern.compile("n"),
    // https://github.com/geir/mongo-java-driver/blob/ca5b3ab3c2ab1caf8918cc84902abb7b476ba52b/src/test/org/mongodb/driver/FindTest.java#L135
    Pattern.compile("ed"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/gui.swing/gui.swing/src/main/java/xyz/cofe/gui/swing/properties/editor/ComboBoxEditor.java#L311
    Pattern.compile("(?is)^variants\\s*[=:](?<vars>.*)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/gui.swing/gui.swing/src/main/java/xyz/cofe/gui/swing/properties/editor/ComboBoxEditor.java#L318
    Pattern.compile("(?is)^variants\\s+call\\s+(?<vcall>.+)"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/gui.swing/gui.swing/src/main/java/xyz/cofe/gui/swing/properties/editor/ComboBoxEditor.java#L378
    Pattern.compile("(?is)^\\s*(class\\s+(?<clsName>[\\w_][\\.\\w_\\d]+)\\s*)?(method\\s+(?<meth>[\\w_][\\w\\d_]+))"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/gui.swing/gui.swing/src/test/java/xyz/cofe/gui/swing/tree/TreeTableModelTest.java#L717
    Pattern.compile("(?is)^\\s*(\\d+)\\s*-\\s*(\\d+).*?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/gui.swing/gui.swing/src/test/java/xyz/cofe/gui/swing/tree/TreeTableModelTest.java#L718
    Pattern.compile("(?is)^\\s*(\\d+).*?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/ProcessList.java#L107
    Pattern.compile("^(\\d+)$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/FileDescriptorImpl.java#L82
    Pattern.compile("(?is)^socket:\\[(\\d+)\\].*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/FileDescriptorImpl.java#L83
    Pattern.compile("(?is)^pipe:\\[(\\d+)\\].*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/ProcessImpl.java#L494
    Pattern.compile("^\\s*([\\+\\-]\\s*)?\\d+\\s*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/SocketImpl.java#L179
    Pattern.compile("(?is)^\\s*(\\d+):\\s+(([0-9a-fA-F]+):([0-9a-fA-F]+))\\s+(([0-9a-fA-F]+):([0-9a-fA-F]+))\\s+([0-9a-fA-F]+)\\s+((\\w+):(\\w+))\\s+((\\w+):(\\w+))\\s+(\\w+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/StatusImpl.java#L79
    Pattern.compile("(?is)^\\s*([\\-\\+]?\\d+)\\s+([\\-\\+]?\\d+)\\s+([\\-\\+]?\\d+)\\s+([\\-\\+]?\\d+)\\s*$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/StatusImpl.java#L87
    Pattern.compile("(?is)^\\s*(0[0-7]+)\\s*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/StatusImpl.java#L143
    Pattern.compile("[\\-\\+]?\\d+"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/j-libc/src/main/java/xyz/cofe/unix/linux/proc/fs/StatusImpl.java#L200
    Pattern.compile("(?is)^\\s*(\\d+)(\\s+(b|kb|mb|gb|tg|k|m|g|t))?"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/logs/logs/src/main/java/xyz/cofe/logs/LogFilterBuilder.java#L106
    Pattern.compile("(?is).*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/logs/logs/src/test/java/xyz/cofe/logs/BaseLogFileWriterTest2.java#L238
    Pattern.compile("(?is)^\\[99\\].*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/logs/logs/src/test/java/xyz/cofe/logs/BaseLogFileWriterTest2.java#L241
    Pattern.compile("(?is)^\\[(\\d+)\\].*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/site/fastsite/src/main/java/xyz/cofe/fastsite/markdown/MarkdownServlet.java#L73
    Pattern.compile("(?is)^/resources/pages/.+\\.md$"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/site/fastsite/src/main/java/xyz/cofe/fastsite/markdown/MarkdownServlet.java#L106
    Pattern.compile("(?is)<h1>([^<]+)</h1>"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/site/repo/src/main/java/xyz/cofe/site/jsf/CatchedPage.java#L125
    Pattern.compile("(?is)^.*?<title>(.*?)</title>.*"),
    // https://github.com/gochaorg/cofe.xyz/blob/d5d71b92fa8a324ef335b7b30a5a2b03aed53ef7/site/repo/src/main/java/xyz/cofe/site/jsf/CatchedPage.java#L161
    Pattern.compile("(?is)^.*?<body>(.*?)</body>.*"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L96
    Pattern.compile("^$", Pattern.MULTILINE),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L148
    Pattern.compile("^\\w+?(?:[\\u002d\\u002e]\\w+?){0,}[\\u003a\\u0020].*\\u000a(?:^(?:[\\u0020\\u0009]){1,}.*$){0,}", Pattern.MULTILINE),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L148
    Pattern.compile("^\\w+?(?:[\\u002d\\u002e]\\w+?){0,}[\\u003a\\u0020]", Pattern.MULTILINE),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L148
    Pattern.compile("^\\w+?(?:[\\u002d\\u002e]\\w+?){0,}[\\u003a\\u0020]"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L160
    Pattern.compile("^(?:[\\u0020\\u0009]){1,}|\\u000a|\\u000d"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L164
    Pattern.compile("\\u0009"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L241
    Pattern.compile("(?i)multipart.*"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L244
    Pattern.compile("(?i).*boundary=.*"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L403
    Pattern.compile("(?i)(?m)boundary=.*$"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L406
    Pattern.compile("(?i)^(\\u0020){0,}boundary((?:=\")|(?:=))"),
    // https://github.com/mawiza/javaemail/blob/4587c10b88e9813fcf01c9fd532ef72dddff3831/dk/miles/messenger/message/MessageParser.java#L410
    Pattern.compile("(?m)((\";)|(\")|(;))((\\p{Space}){0,}|(\"){0,})$"),
    // https://github.com/awilhelm/izpack-with-ips/blob/1ec5942e0db99de065fb333649fc20e7e01a4ed9/src/lib/com/izforge/izpack/adaptator/impl/XMLElementImpl.java#L292
    Pattern.compile("^\\s+$"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/cmds/monkey/src/com/android/commands/monkey/MonkeyGetAppFrameRateEvent.java#L54
    Pattern.compile(".* ([0-9]*) frames rendered"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/cmds/monkey/src/com/android/commands/monkey/MonkeyGetFrameRateEvent.java#L53
    Pattern.compile(".*\\(([a-f[A-F][0-9]].*?)\\s.*\\)"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ChangeFontAction.java#L67
    Pattern.compile("\\t [^*]", Pattern.MULTILINE),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ChangeFontAction.java#L80
    Pattern.compile("\\S {3,}", Pattern.MULTILINE),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/EErrorsPanel.java#L32
    Pattern.compile("^make(?:\\[\\d+\\])?: Entering directory `(.*)'$", Pattern.MULTILINE),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/EErrorsPanel.java#L37
    Pattern.compile("([\\.\\w]+)(?:(?:\\$\\w+)*?\\.)[\\w\\$<>]+\\(\\w+\\.java(:\\d+)"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ETextWindow.java#L242
    Pattern.compile("(?m)^[<>]{7}"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ETextWindow.java#L482
    Pattern.compile("\\.[^.]+$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/Evergreen.java#L251
    Pattern.compile("[a-z]{2,}:/.*"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/Evergreen.java#L252
    Pattern.compile("file:/.*\\.html"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/Evergreen.java#L290
    Pattern.compile("^((?:[A-Za-z]:\\\\){0,1}.+?)((:\\d+)*)(:|:?$)"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/InsertInterfaceAction.java#L48
    Pattern.compile("(?x) .* \\b new \\s+ (\\S+?) \\s* \\(? $"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/InsertInterfaceAction.java#L56
    Pattern.compile("(?x) .* \\b add(\\S+?) \\s* \\(? $"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L16
    Pattern.compile("(?x) .* \\b new \\s+ ([A-Za-z0-9_]+) \\s* \\($"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L18
    Pattern.compile("(?x) \\b ([A-Za-z0-9_]+) \\.$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L63
    Pattern.compile("^[MCFEA]:(\\S+?)(\\(|\t).*$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L96
    Pattern.compile("([a-z])([A-Z])"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L158
    Pattern.compile("^[A-Z][A-Za-z0-9_]*$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L160
    Pattern.compile("^[a-z][A-Za-z0-9_]*$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L212
    Pattern.compile("import (.+)\\..+;"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/JavaResearcher.java#L267
    Pattern.compile("^.*/api/"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L36
    Pattern.compile("^(.*)\\.([23][A-Za-z]*)(\\.gz)?$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L64
    Pattern.compile("^(?:MANDATORY_)?MANPATH\\s+(.*)$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L135
    Pattern.compile("(?si)<hr><p>.*</ul>"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L137
    Pattern.compile("(?i)<a name=['\"]sect\\d+['\"] href=['\"]#toc\\d+['\"]>((.|\n)*?)</a>"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L138
    Pattern.compile("(?i)<a href=['\"]#toc['\"]>Table of Contents</a><p>"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/ManPageResearcher.java#L150
    Pattern.compile("^man:([A-Za-z0-9]+)\\((\\d+)\\)$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/StlDocumentationResearcher.java#L27
    Pattern.compile(".*<A href=\"(.+\\.html)\">([a-z0-9_]+)(&lt;.*&gt;)?</A></TD>.*"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/StlDocumentationResearcher.java#L80
    Pattern.compile("(?i)<head>"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/StlDocumentationResearcher.java#L82
    Pattern.compile("(?i)\n<tt>(.*?)</tt>\n</td>"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/StlDocumentationResearcher.java#L89
    Pattern.compile("^stl:([A-Za-z0-9_]+)$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/TagReader.java#L11
    Pattern.compile("([^\t]+)\t([^\t])+\t(\\d+);\"\t(\\w)(?:\t(.*))?"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/edit/TagReader.java#L12
    Pattern.compile("(?:struct|class|enum|interface|namespace):([^\t]+).*"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/ptextarea/FileType.java#L258
    Pattern.compile("^--- .*\n\\+\\+\\+ "),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/ptextarea/FileType.java#L263
    Pattern.compile("(?i)^<\\?xml"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/ptextarea/PEmailTextStyler.java#L27
    Pattern.compile("\n-- \n"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/ptextarea/PIndenter.java#L9
    Pattern.compile("(^[ \\t]*(?:\\*(?: |$))?).*$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/tools/WeatherWindow.java#L63
    Pattern.compile("^\\s+<title>BBC.* Forecast in .* for (\\S+),"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/tools/WeatherWindow.java#L64
    Pattern.compile("class=\"weatherday\".*strong>(\\S+)<br"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/tools/WeatherWindow.java#L65
    Pattern.compile("img src=\"(\\S+\\/fiveday_sym\\/\\d+\\S+)\""),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/tools/WeatherWindow.java#L66
    Pattern.compile("class=\"temptxt\"><strong>(\\d+)<.*Day "),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/tools/WeatherWindow.java#L67
    Pattern.compile("class=\"temptxt\">.*<strong>(\\d+)<.*Night "),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/util/FileUtilities.java#L39
    Pattern.compile("^~([^/]+)(.*)$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/util/IndentationGuesser.java#L13
    Pattern.compile("^(\\s+)[A-Za-z].*$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/util/IndentationGuesser.java#L14
    Pattern.compile("^(\\s*)[{}]$"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/util/SpellingChecker.java#L220
    Pattern.compile("^& .* \\d+ \\d+: ([^,]+)"),
    // https://github.com/orph/jujitsu/blob/5b7244ef8436303ce05a7ecd2147755244b62be1/src/e/util/SpellingChecker.java#L241
    Pattern.compile("^[&\\?] .* \\d+ \\d+: "),
    // https://github.com/chrislo/sourceclassifier/blob/c79886968c113033d692ab2d4998d1e7f0195135/sources/java/regexmatch.java-2.java#L12
    Pattern.compile("(^|^\\D*[^\\(\\d])((\\(\\d\\d\\d\\))|(\\d\\d\\d))[ ](\\d\\d\\d)[ -](\\d\\d\\d\\d)(\\D.*|$)"),
    // https://github.com/chrislo/sourceclassifier/blob/c79886968c113033d692ab2d4998d1e7f0195135/sources/java/wordfreq.java#L20
    Pattern.compile("\\p{Lower}+"),
    // https://github.com/gustavosoares/orb-object-migration/blob/5c2404263a7a5c6c861f5875f72bc6310257275e/src/ChatClient.java#L98
    Pattern.compile("^\\$(\\w+)(\\s+(.*))?$"),
    // https://github.com/gustavosoares/orb-object-migration/blob/5c2404263a7a5c6c861f5875f72bc6310257275e/src/CodecXml.java#L284
    Pattern.compile("<result kind=\"(.*?)\">"),
    // https://github.com/gustavosoares/orb-object-migration/blob/5c2404263a7a5c6c861f5875f72bc6310257275e/src/Test.java#L20
    Pattern.compile("<sequence>(\\s?(.*\\s?)+)</sequence>\\n?"),
    // https://github.com/gustavosoares/orb-object-migration/blob/5c2404263a7a5c6c861f5875f72bc6310257275e/src/XmlTest.java#L109
    Pattern.compile("<object>(.*?)</object>"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/MySampleRss/src/com/example/codelab/rssexample/RssService.java#L207
    Pattern.compile("<[\\s]*pubDate[\\s]*>(.+?)</pubDate[\\s]*>"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/Wiktionary/src/com/example/android/wiktionary/ExtendedWikiHelper.java#L53
    Pattern.compile("(verb|noun|adjective|pronoun|interjection)", Pattern.CASE_INSENSITIVE),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/Wiktionary/src/com/example/android/wiktionary/ExtendedWikiHelper.java#L60
    Pattern.compile("^=+(.+?)=+.+?(?=^=)", Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/Wiktionary/src/com/example/android/wiktionary/ExtendedWikiHelper.java#L67
    Pattern.compile("[^A-Za-z0-9 ]"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/Wiktionary/src/com/example/android/wiktionary/WordWidget.java#L72
    Pattern.compile("(?s)\\{\\{wotd\\|(.+?)\\|(.+?)\\|([^#\\|]+).*?\\}\\}"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/samples/XmlAdapters/src/com/example/android/xmladapters/XmlDocumentProvider.java#L349
    Pattern.compile("//"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/anr/AnrParser.java#L41
    Pattern.compile("ANR in (\\S+) \\((\\S+)/(\\S+)\\)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/anr/AnrParser.java#L43
    Pattern.compile("PID: (\\d+)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/anr/AnrParser.java#L45
    Pattern.compile("Reason: (.*)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/bugreport/BugreportParser.java#L42
    Pattern.compile("------ (.*?)(?: \\((.*)\\)) ------"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/bugreport/BugreportParser.java#L44
    Pattern.compile("------ ([^(]+) ------"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/bugreport/BugreportParser.java#L46
    Pattern.compile("------ (\\d+.\\d+)s was the duration of '(.*?)(?: \\(.*\\))?' ------"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/bugreport/MetadataParser.java#L36
    Pattern.compile("([^:]+): (.*)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/cpuinfo/CpuUsageParser.java#L34
    Pattern.compile("CPU usage from (-?\\d+)ms to (-?\\d+)ms ago \\((.*) to (.*)\\):"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/cpuinfo/CpuUsageParser.java#L36
    Pattern.compile(".*TOTAL:.*"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/inspector/Inspector.java#L764
    Pattern.compile("Application is not responding: .* It has been (\\d+\\.?\\d*)ms since event, (\\d+\\.?\\d*)ms since wait started.*"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/logcat/LogcatParser.java#L32
    Pattern.compile("--------- beginning of (.*)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/monkey/MonkeyLogParser.java#L37
    Pattern.compile("// NOT RESPONDING: \\S+ \\(pid \\d+\\)"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/monkey/MonkeyLogParser.java#L39
    Pattern.compile("\\*\\* Monkey aborted due to error\\."),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/stacks/ProcessSnapshotParser.java#L36
    Pattern.compile("----- pid (\\d+) at (\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) -----"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/stacks/ProcessSnapshotParser.java#L38
    Pattern.compile("----- end \\d+ -----"),
    // https://github.com/aosp-mirror/platform_development/blob/92a49746633afe4ad75ba6ced5ff5b4f4ae8215b/tools/bugreport/src/com/android/bugreport/stacks/ProcessSnapshotParser.java#L41
    Pattern.compile("Cmd line: (.*)"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/SVGElement.java#L664
    Pattern.compile("\\w+\\([^)]*\\)"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/SVGElement.java#L679
    Pattern.compile("[-.\\w]+"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/SVGElement.java#L746
    Pattern.compile("([MmLlHhVvAaQqTtCcSsZz])|([-+]?((\\d*\\.\\d+)|(\\d+))([eE][-+]?\\d+)?)"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/Text.java#L139
    Pattern.compile("\\s*"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/xml/ColorTable.java#L249
    Pattern.compile("rgb\\(\\s*(((\\d+)(\\.\\d*)?)|(\\.\\d+))(%)?\\s*,\\s*(((\\d+)(\\.\\d*)?)|(\\.\\d+))(%)?\\s*,\\s*(((\\d+)(\\.\\d*)?)|(\\.\\d+))(%)?\\s*\\)", Pattern.CASE_INSENSITIVE),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/xml/StyleAttribute.java#L60
    Pattern.compile("\\s*url\\((.*)\\)\\s*"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/xml/StyleAttribute.java#L63
    Pattern.compile("\\s*([-+]?((\\d*\\.\\d+)|(\\d+))([-+]?[eE]\\d+)?)\\s*(px|cm|mm|in|pc|pt|em|ex)\\s*"),
    // https://github.com/geogebra/geogebra/blob/d4b39be828a9e3823d473671abdfc787259bbcef/desktop/src/main/java/com/kitfox/svg/xml/StyleAttribute.java#L255
    Pattern.compile("[a-zA-Z]:!\\\\.*"),
    // https://github.com/johnhampton/maven-scm/blob/ece000df715c4f19e6bc045c4855b3118f3b9059/maven-scm-providers/maven-scm-provider-accurev/src/main/java/org/apache/maven/scm/provider/accurev/commands/add/AddCommandStreamConsumer.java#L36
    Pattern.compile("Added and kept element\\s*(.*)"),
    // https://github.com/johnhampton/maven-scm/blob/ece000df715c4f19e6bc045c4855b3118f3b9059/maven-scm-providers/maven-scm-provider-accurev/src/main/java/org/apache/maven/scm/provider/accurev/commands/checkout/AccuRevCheckOutUsingPopCommand.java#L84
    Pattern.compile("Populating element (.*)"),
    // https://github.com/johnhampton/maven-scm/blob/ece000df715c4f19e6bc045c4855b3118f3b9059/maven-scm-providers/maven-scm-provider-accurev/src/main/java/org/apache/maven/scm/provider/accurev/commands/checkout/AccuRevCheckOutWorkspaceCommand.java#L93
    Pattern.compile("Updating element (.*)"),
    // https://github.com/johnhampton/maven-scm/blob/ece000df715c4f19e6bc045c4855b3118f3b9059/maven-scm-providers/maven-scm-provider-accurev/src/test/java/org/apache/maven/scm/provider/accurev/commands/checkout/AccuRevScmTckTestCase.java#L289
    Pattern.compile("Workspace/ref:\\s*(.*)"),
    // https://github.com/johnhampton/maven-scm/blob/ece000df715c4f19e6bc045c4855b3118f3b9059/maven-scm-providers/maven-scm-provider-bazaar/src/main/java/org/apache/maven/scm/provider/bazaar/BazaarConfig.java#L184
    Pattern.compile("[\\d]+.?[\\d]*"),
    // https://github.com/kreide/spiderweb/blob/8f7327fd2cef5e70ef49b505fffc4ca5d0186c01/src/com/medallia/spider/SpiderServlet.java#L606
    Pattern.compile(".*\\.(.+)Task.*"),
    // https://github.com/donpdonp/whatismyip-android/blob/ab86f25ad2db6a5801acf8f25fe4a851ab4efbe3/src/org/donpark/whatismyip/System.java#L55
    Pattern.compile("^\\w+\\s+00000000.*"),
    // https://github.com/donpdonp/whatismyip-android/blob/ab86f25ad2db6a5801acf8f25fe4a851ab4efbe3/src/org/donpark/whatismyip/System.java#L91
    Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+"),
    // https://github.com/donpdonp/whatismyip-android/blob/ab86f25ad2db6a5801acf8f25fe4a851ab4efbe3/src/org/donpark/whatismyip/System.java#L102
    Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)"),
    // https://github.com/certik/jython/blob/8403817e5ee149ca95d9316138b00fa2465135f2/src/org/python/core/ParserFacade.java#L299
    Pattern.compile("coding[:=]\\s*([-\\w.]+)"),
    // https://github.com/certik/jython/blob/8403817e5ee149ca95d9316138b00fa2465135f2/src/org/python/modules/binascii.java#L958
    Pattern.compile("(?<!\r)\n"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.egit.ui/src/org/spearce/egit/ui/internal/components/RepositorySelectionPage.java#L381
    Pattern.compile("^(?:[1-9][0-9]*)?$"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.egit.ui/src/org/spearce/egit/ui/internal/history/CommitMessageViewer.java#L180
    Pattern.compile("([\\w.; \t])\n(\\w)"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.egit.ui/src/org/spearce/egit/ui/internal/history/CommitMessageViewer.java#L184
    Pattern.compile("\n([A-Z](?:[A-Za-z]+-)+by: [^\n]+)"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/fnmatch/FileNameMatcher.java#L82
    Pattern.compile("\\[[.:=]"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/fnmatch/GroupHead.java#L51
    Pattern.compile("([^-][-][^-]|\\[[.:=].*?[.:=]\\])"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/charsetmapping/SBCS.java#L38
    Pattern.compile("0x(\\p{XDigit}++)\\s++(?:U\\+|0x)?(\\p{XDigit}++)(?:\\s++#.*)?"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/transport/SideBandInputStream.java#L76
    Pattern.compile(".*?([\\w ]+): (\\d+)(, done)?.*", Pattern.DOTALL),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/transport/SideBandInputStream.java#L79
    Pattern.compile(".*?([\\w ]+):.*\\((\\d+)/(\\d+)\\).*", Pattern.DOTALL),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/transport/URIish.java#L54
    Pattern.compile("^(?:([a-z0-9+-]+)://(?:([^/]+?)(?::([^/]+?))?@)?(?:([^/]+?))?(?::(\\d+))?)?((?:[A-Za-z]:)?/.+)$"),
    // https://github.com/freeman/egit/blob/67463ae40222a00813d295dc3486fb46d02a7d79/org.spearce.jgit/src/org/spearce/jgit/transport/URIish.java#L57
    Pattern.compile("^(?:([^@]+?)@)?([^:]+?):(.+)$"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/generatecharacter/PropList.java#L61
    Pattern.compile("(\\p{XDigit}+)(?:\\.{2}(\\p{XDigit}+))?\\s*;\\s+(\\w+)\\s+#.*"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/spp/Spp.java#L108
    Pattern.compile("^#if\\[(!)?([a-zA-Z0-9]+)\\]"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/spp/Spp.java#L109
    Pattern.compile("^#else\\[(!)?([a-zA-Z0-9]+)\\]"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/spp/Spp.java#L110
    Pattern.compile("^#end\\[(!)?([a-zA-Z0-9]+)\\]"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/spp/Spp.java#L111
    Pattern.compile("\\{#if\\[(!)?([a-zA-Z0-9]+)\\]\\?([a-zA-Z0-9&;,.<>/#() \\?\\[\\]\\$]+)(:([a-zA-Z0-9&;,.<>/#() \\?\\[\\]\\$]+))?\\}|\\$([a-zA-Z0-9_\\-]+)\\$"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/spp/Spp.java#L112
    Pattern.compile("\\$([a-zA-Z0-9_\\-]+)\\$"),
    // https://github.com/AdoptOpenJDK/openjdk-jdk-archived/blob/e746e1590a061470bd59f09a0ebf6ffea8c4ae5f/make/jdk/src/classes/build/tools/tzdb/TzdbZoneRulesCompiler.java#L171
    Pattern.compile("tzdata(?<ver>[0-9]{4}[A-z])"),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L83
    Pattern.compile("^\\s*VIEW\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L84
    Pattern.compile("^\\s*TABLE\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L89
    Pattern.compile("^\\s*INOUT\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L90
    Pattern.compile("^\\s*IN\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L91
    Pattern.compile("^\\s*OUT\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L92
    Pattern.compile("^\\s*NOT\\s+NULL(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L93
    Pattern.compile("^\\s*NOT\\s+EMPTY(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L94
    Pattern.compile("^\\s*EMPTY(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L95
    Pattern.compile("^\\s*NULL(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L96
    Pattern.compile("^\\s*TRUE|FALSE(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L97
    Pattern.compile("^\\s*UNIQUE(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L99
    Pattern.compile("^\\s*DEFAULT\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L101
    Pattern.compile("^\\s*WHERE\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L103
    Pattern.compile("^\\s*THROW\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L104
    Pattern.compile("^\\s*\\-{0,1}[0-9]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L106
    Pattern.compile("^\\s*MATCH\\s+FUNC\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L107
    Pattern.compile("^\\s*MATCH\\s+PATTERN\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L110
    Pattern.compile("^\\s*FUNC\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L111
    Pattern.compile("^\\s*PATTERN\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L112
    Pattern.compile("^\\s*AS\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L113
    Pattern.compile("^\\s*MATCH\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L114
    Pattern.compile("^\\s*FROM\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L117
    Pattern.compile("^\\s*AS\\s+FUNC\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L119
    Pattern.compile("^\\s*AND\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L120
    Pattern.compile("^\\s*OR\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L123
    Pattern.compile("\\s*(#|//).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L126
    Pattern.compile("(`){0,1}[a-zA-Z_]+[\\w]*(`){0,1}", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L127
    Pattern.compile("^\\s*(`){0,1}[\\w\\.]+(`){0,1}(?=(\\,|\\(|\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L130
    Pattern.compile("^\\s*(('.*?(?<!\\\\)')|(\\\".*?(?<!\\\\)\\\"))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L133
    Pattern.compile("^\\s*\\-?[0-9]+(\\.[0-9]+)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L136
    Pattern.compile("^\\s*;", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L138
    Pattern.compile("^\\s*(\\(|@\\(@)", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L140
    Pattern.compile("^\\s*(\\)|@\\)@)", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L144
    Pattern.compile("^\\s*,", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L147
    Pattern.compile("^\\s*.+?\\s*(==|=|\\<=|\\>=|\\<|\\>|\\!=)\\s*.+?\\s*(?=(throw|and|or|\\n|\\r|\\,|@\\)|;))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L148
    Pattern.compile("^\\s*.+?\\s*MATCH\\s+FUNC\\s*", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L149
    Pattern.compile("^\\s*.+?\\s*MATCH\\s+PATTERN\\s*", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L150
    Pattern.compile("^\\s*.+?\\s+ORDER\\s+(ASC|DESC)(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L151
    Pattern.compile("^\\s*.+?\\s+GROUP(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L152
    Pattern.compile("^\\s*.+?\\s+IS\\s+(NOT\\s+){0,1}NULL(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L153
    Pattern.compile("^\\s*.+?\\s+IS\\s+(NOT\\s+){0,1}EMPTY(?=(\\,|@\\)|;|\\s))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L155
    Pattern.compile("^\\s*.+?\\s*(?=(==|=|\\<=|\\>=|\\<|\\>|\\!=))", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L156
    Pattern.compile("^\\s*.+?\\s*(==|=|\\<=|\\>=|\\<|\\>|\\!=)", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L160
    Pattern.compile("^\\s*NULL\\s*", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L161
    Pattern.compile("^\\s*TRUE|FALSE\\s*", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L174
    Pattern.compile("^\\s*BOOL\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L175
    Pattern.compile("^\\s*INT\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L176
    Pattern.compile("^\\s*LONG\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L177
    Pattern.compile("^\\s*FLOAT\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L178
    Pattern.compile("^\\s*DOUBLE\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L179
    Pattern.compile("^\\s*VARCHAR(\\([0-9]+\\)){0,1}\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L180
    Pattern.compile("^\\s*STRING\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L181
    Pattern.compile("^\\s*DATETIME\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L182
    Pattern.compile("^\\s*TIMESTAMP\\s+", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L195
    Pattern.compile("\\sNOW\\(\\)", Pattern.CASE_INSENSITIVE),
    // https://github.com/lingminjun/sfdl/blob/bcf45885994d6e7e5ec187c878ba446717027176/src/main/java/com/lmj/sfdl/compiler/consts/Consts.java#L196
    Pattern.compile("\\sDATETIME\\(\\)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Cmparounis/OpenCommerceDev/blob/3ffd6e9ab763fb2ca16881a05e4b34cd1b1bd19b/WEB_INF/classes/ocgr/DataValidation.java#L17
    Pattern.compile("[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]{8,}"),
    // https://github.com/Cmparounis/OpenCommerceDev/blob/3ffd6e9ab763fb2ca16881a05e4b34cd1b1bd19b/WEB_INF/classes/ocgr/DataValidation.java#L26
    Pattern.compile("[a-zA-Z ]{5,}"),
    // https://github.com/Cmparounis/OpenCommerceDev/blob/3ffd6e9ab763fb2ca16881a05e4b34cd1b1bd19b/WEB_INF/classes/ocgr/DataValidation.java#L35
    Pattern.compile("[a-zA-Z0-9 ]{5,}"),
    // https://github.com/Cmparounis/OpenCommerceDev/blob/3ffd6e9ab763fb2ca16881a05e4b34cd1b1bd19b/WEB_INF/classes/ocgr/DataValidation.java#L63
    Pattern.compile("[0-9]{9}"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L10
    Pattern.compile("[A-Z][a-z]+"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L38
    Pattern.compile(".+\\."),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L47
    Pattern.compile(".+\\.['.']+"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L55
    Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L65
    Pattern.compile("^([0-9]|([1-9][0-9][0-9])|200)$"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L75
    Pattern.compile("3D|4D|4DX|iMAX3D"),
    // https://github.com/LukashOleksii/OOP_-Java-/blob/268374927cd770d2a66a1fef6675fcb0af90a328/LAB_5/Lab_5/src/Matcher.java#L92
    Pattern.compile("^([0-9]|10)$"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L15
    Pattern.compile("==[^=]+==[^=]"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L16
    Pattern.compile("===[^=]+===[^=]"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L17
    Pattern.compile("====[^=]+====[^=]"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L18
    Pattern.compile("=====[^=]+=====[^=]"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L19
    Pattern.compile("======[^=]+======[^=]"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L20
    Pattern.compile("\\[\\[[^\\]]*\\]\\]", Pattern.CASE_INSENSITIVE),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L21
    Pattern.compile("(\\[){0,1}(http|https)://"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L22
    Pattern.compile("(http|https)://test.wikidelft.nl/ccscripts/imageproxyImageInPage.php"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L23
    Pattern.compile("\\[\\[(bestand|file|image):", Pattern.CASE_INSENSITIVE),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L24
    Pattern.compile("\\[\\[(categorie|category):([^\\]]*)\\]\\]", Pattern.CASE_INSENSITIVE),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L26
    Pattern.compile("<ref>"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L27
    Pattern.compile("'''''[^']+'''''[^']"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L28
    Pattern.compile("'''[^']+'''[^']"),
    // https://github.com/WISDelft/WUDE/blob/3f9dc3f1b7c3fac52a599ef8dedf0f68e1692490/COMMIT%20-%20WUDE/wiki.analyzer/src/main/java/nl/wisdelft/wiki/analysis/WikiMarkupAnalyzer.java#L29
    Pattern.compile("''[^']+''[^']"),
    // https://github.com/totalkyos/sonar-source/blob/bffb84b0bf225e83de16b7c8892fe37ffc29795b/java-checks/src/test/files/checks/Architecture.java#L8
    Pattern.compile("*.java"),
    // https://github.com/totalkyos/sonar-source/blob/bffb84b0bf225e83de16b7c8892fe37ffc29795b/java-checks/src/test/files/checks/Architecture.java#L11
    Pattern.compile("*"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L229
    Pattern.compile("%%"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L231
    Pattern.compile("%n"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L233
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?level"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L235
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?logger(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L237
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?caller(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L239
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?source"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L241
    Pattern.compile("%date(\\{(.*?)\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L243
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?\\("),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L245
    Pattern.compile("%d(\\{(.*?)\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L247
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?p"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L249
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?c(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L251
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?C(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L253
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?s"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L255
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?thread"),
    // https://github.com/somkiattha/opendatakit.androidcommon/blob/a1bf8e92fbd9956920da427afcc62eca61157a5a/androidcommon/src/com/noveogroup/android/log/Pattern.java#L257
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?t"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L9
    Pattern.compile("^([A-Za-zÀ-ž]+\\s?)*(\\d*)\\s*([A-Za-zÀ-ž]+(\\s?))*\\d*$"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L10
    Pattern.compile("^([A-Za-zÀ-ž]+\\s?)*(\\d*)\\s"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L11
    Pattern.compile("^\\s?([A-Za-zÀ-ž0-9]+(\\s?))*\\d*$"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L19
    Pattern.compile("^\\d*,?\\s?([A-Za-zÀ-ž]+\\s?)*$"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L20
    Pattern.compile("^\\d+,?"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L21
    Pattern.compile("\\s?([A-Za-zÀ-ž]+\\s?)*$"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L29
    Pattern.compile("^([A-Za-zÀ-ž]+\\s?)*(,?)(\\s*)\\d*\\s?([A-Za-z]?)$"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L30
    Pattern.compile("^([A-Za-zÀ-ž]+\\s?)*(,?)"),
    // https://github.com/SvitlanaShe/FridayCodeChallenge/blob/285f3b5336ecd753cd3d07c6a2a8867021920f65/src/main/java/PatternsLibrary.java#L31
    Pattern.compile("^\\s?\\d*\\s?([A-Za-z]?)$"),
    // https://github.com/Edw1x/OOP-LABS-JAVA-/blob/00f9cbcd6d19c886943ca87bf071e8dff4a4074a/laba5/Matcher.java#L82
    Pattern.compile("^(([0,1][0-9])|(2[0-3])):[0-5][0-9]$"),
    // https://github.com/Edw1x/OOP-LABS-JAVA-/blob/00f9cbcd6d19c886943ca87bf071e8dff4a4074a/laba5/Matcher.java#L96
    Pattern.compile("MP3|DVD|CD|DTS|WMA"),
    // https://github.com/Edw1x/OOP-LABS-JAVA-/blob/00f9cbcd6d19c886943ca87bf071e8dff4a4074a/laba5/Matcher.java#L124
    Pattern.compile("^([0-9]|([1-9][0-9])|100)$"),
    // https://github.com/sujiangming/NoticeManagers/blob/8e551ab954bb0c1387d0d61f0117eb19143a737c/app/src/main/java/com/jdry/noticemanagers/utils/JdryHtmlHandler.java#L29
    Pattern.compile("\\s*|\t|\r|\n", Pattern.CASE_INSENSITIVE),
    // https://github.com/sujiangming/NoticeManagers/blob/8e551ab954bb0c1387d0d61f0117eb19143a737c/app/src/main/java/com/jdry/noticemanagers/utils/JdryHtmlHandler.java#L92
    Pattern.compile("\\&[a-zA-Z]{1,10};", Pattern.CASE_INSENSITIVE),
    // https://github.com/sujiangming/NoticeManagers/blob/8e551ab954bb0c1387d0d61f0117eb19143a737c/app/src/main/java/com/jdry/noticemanagers/utils/JdryHtmlHandler.java#L122
    Pattern.compile("<(img|IMG)(.*?)(/>|></img>|>)"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L37
    Pattern.compile("实习"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L38
    Pattern.compile("兼职"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L39
    Pattern.compile("家教"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L40
    Pattern.compile("日薪"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L41
    Pattern.compile("\\bintern\\b", Pattern.CASE_INSENSITIVE),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L42
    Pattern.compile("\\binternship\\b", Pattern.CASE_INSENSITIVE),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L44
    Pattern.compile("全职"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L45
    Pattern.compile("社招"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L46
    Pattern.compile("\\bfull time\\b", Pattern.CASE_INSENSITIVE),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L48
    Pattern.compile("实习生"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L51
    Pattern.compile("/天"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L54
    Pattern.compile("\\d天以上"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L55
    Pattern.compile("\\d days per week", Pattern.CASE_INSENSITIVE),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L58
    Pattern.compile("正式"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L59
    Pattern.compile("校园招聘"),
    // https://github.com/madarou/bbs/blob/19234faa69942837df735cc5b1c25c0fb6c116c8/bbs-crawler/src/main/java/com/makao/bbs_crawler/ArticleCrawler.java#L60
    Pattern.compile("校招"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L24
    Pattern.compile("^[\\s\\u00a0]*$"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L23
    Pattern.compile("^-?\\d+(\\.\\d+)?$"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L27
    Pattern.compile("(?<=[^\\.])\\.(?=([\\s\\u00a0]*<[^>]+>)*[\"“”]?([\\s\\u00a0]*<[^>]+>)*$)"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L21
    Pattern.compile("&[\\w0-9]+;"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L22
    Pattern.compile("[\\s\\u00a0]+"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L31
    Pattern.compile("(^('|\\u2019|\\u2018))|(('|\\u2019|\\u2018)$)"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L32
    Pattern.compile("((C|c)an('|\\u2019|\\u2018)t)|(CAN('|\\u2019|\\u2018)T)$"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L33
    Pattern.compile("((W|w)on('|\\u2019|\\u2018)t)|(WON('|\\u2019|\\u2018)T)$"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L34
    Pattern.compile("(n('|\\u2019|\\u2018)t)|(N('|\\u2019|\\u2018)T)$"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L35
    Pattern.compile("(?<=[\\w0-9\\.])('|\\u2019|\\u2018)[\\w0-9\\.]+"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L16
    Pattern.compile("('|\\u2019|\\u2018)[\\w0-9\\.]+"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L37
    Pattern.compile("([\\w0-9\\.'\\u2019\\u2018]+-)+([\\w0-9\\.'\\u2019\\u2018]+)"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L19
    Pattern.compile("[^\\w0-9\\.'\\u2019\\u2018]+(?=[\\w0-9\\.'\\u2019\\u2018])"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L39
    Pattern.compile("(?<=[\\w0-9\\.'\\u2019\\u2018])[^\\w0-9\\.'\\u2019\\u2018]+"),
    // https://github.com/Steven-Owens/Writers-Toolbox/blob/8265099f4e5167ea4aa4677411b90e4482e7bd23/src/main/java/com/civprod/writerstoolbox/NaturalLanguage/util/CommonRegexPatterns.java#L40
    Pattern.compile("([^\\w0-9\\.'\\u2019\\u2018])\\1*"),
    // https://github.com/yiwg/traceSystem/blob/ffdc9e02294cdb73b1c5c2f60e37e9352fa12c0d/src/main/java/com/tmsps/traceback/util/html/HtmlTools.java#L29
    Pattern.compile("<[^>]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L179
    Pattern.compile("%(\\d+)?(\\.(\\d+))?level"),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L181
    Pattern.compile("%(\\d+)?(\\.(\\d+))?logger(\\{(\\d+)?(\\.(\\d+))?\\})?"),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L183
    Pattern.compile("%(\\d+)?(\\.(\\d+))?caller(\\{(\\d+)?(\\.(\\d+))?\\})?"),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L187
    Pattern.compile("%(\\d+)?(\\.(\\d+))?\\("),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L191
    Pattern.compile("%(\\d+)?(\\.(\\d+))?p"),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L193
    Pattern.compile("%(\\d+)?(\\.(\\d+))?c(\\{(\\d+)?(\\.(\\d+))?\\})?"),
    // https://github.com/snippetmodule/android-commonlog/blob/e9739019fdf731df02c664bfe24b42ecccdaff2e/commonlog/src/main/java/com/rain/lib/log/Pattern.java#L195
    Pattern.compile("%(\\d+)?(\\.(\\d+))?C(\\{(\\d+)?(\\.(\\d+))?\\})?"),
    // https://github.com/chenxianghua2014/Recruit/blob/f3a19282fb1e093cdb110fd81c8e797ecb9bbecd/Recruit/src/com/ttgis/recruit/utility/FilterStr.java#L25
    Pattern.compile("<[//s]*?script[^>]*?>[//s//S]*?<[//s]*?///[//s]*?script[//s]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/chenxianghua2014/Recruit/blob/f3a19282fb1e093cdb110fd81c8e797ecb9bbecd/Recruit/src/com/ttgis/recruit/utility/FilterStr.java#L26
    Pattern.compile("<[//s]*?style[^>]*?>[//s//S]*?<[//s]*?///[//s]*?style[//s]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/chenxianghua2014/Recruit/blob/f3a19282fb1e093cdb110fd81c8e797ecb9bbecd/Recruit/src/com/ttgis/recruit/utility/FilterStr.java#L37
    Pattern.compile("<\\s*img\\s+([^>]*)\\s*>"),
    // https://github.com/roland1996/MyProject/blob/314119bb59f91fa88df60319ab23dbf5de94a2ea/src/Parsing/Methods.java#L12
    Pattern.compile("\\p{Digit}{2}(:\\p{Digit}{2}){2}"),
    // https://github.com/roland1996/MyProject/blob/314119bb59f91fa88df60319ab23dbf5de94a2ea/src/Parsing/Methods.java#L21
    Pattern.compile("\\p{Digit}{4}(-\\p{Digit}{2}){2}"),
    // https://github.com/roland1996/MyProject/blob/314119bb59f91fa88df60319ab23dbf5de94a2ea/src/Parsing/Methods.java#L41
    Pattern.compile("-{0,1}\\p{Digit}+\\.{1}\\p{Digit}+"),
    // https://github.com/roland1996/MyProject/blob/314119bb59f91fa88df60319ab23dbf5de94a2ea/src/Parsing/Methods.java#L49
    Pattern.compile("\\p{Alpha}{2}"),
    // https://github.com/mbayesokhnathiam/soap-javafx-client/blob/b138c2ad9aec32d3c94ce9e3423d8ddca6655d1e/soap_client/src/sample/config/Validator.java#L118
    Pattern.compile("77(.*)"),
    // https://github.com/mbayesokhnathiam/soap-javafx-client/blob/b138c2ad9aec32d3c94ce9e3423d8ddca6655d1e/soap_client/src/sample/config/Validator.java#L118
    Pattern.compile("78(.*)"),
    // https://github.com/mbayesokhnathiam/soap-javafx-client/blob/b138c2ad9aec32d3c94ce9e3423d8ddca6655d1e/soap_client/src/sample/config/Validator.java#L118
    Pattern.compile("76(.*)"),
    // https://github.com/mbayesokhnathiam/soap-javafx-client/blob/b138c2ad9aec32d3c94ce9e3423d8ddca6655d1e/soap_client/src/sample/config/Validator.java#L118
    Pattern.compile("70(.*)"),
    // https://github.com/mbayesokhnathiam/soap-javafx-client/blob/b138c2ad9aec32d3c94ce9e3423d8ddca6655d1e/soap_client/src/sample/config/Validator.java#L130
    Pattern.compile("33(.*)"),
    // https://github.com/ArtemPeshko/Soccms/blob/7da3a5ec7eaa13053e3a0e4b1fbaa64539bc04dd/src/main/java/by/peshko/soccms/validator/FieldsValidatorUtils.java#L17
    Pattern.compile("[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])"),
    // https://github.com/ArtemPeshko/Soccms/blob/7da3a5ec7eaa13053e3a0e4b1fbaa64539bc04dd/src/main/java/by/peshko/soccms/validator/FieldsValidatorUtils.java#L24
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$"),
    // https://github.com/ArtemPeshko/Soccms/blob/7da3a5ec7eaa13053e3a0e4b1fbaa64539bc04dd/src/main/java/by/peshko/soccms/validator/FieldsValidatorUtils.java#L31
    Pattern.compile("\\d{7,15}"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L23
    Pattern.compile("(create)(\\s+)(table)(\\s+)(\\w+)(\\s*+)(\\()(\\s*+)(\\s*[\\w]+\\s+(int|varchar)\\s*(?:,\\s*[\\w]+\\s+(int|varchar)\\s*){0,})(\\s*+)(\\))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L24
    Pattern.compile("(create)(\\s+)(database)(\\s+)(\\w+)(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L25
    Pattern.compile("(create)(\\s+)(database)(\\s+)(([a-zA-Z]:)?(\\\\{0,2}[-@./#&+\\w\\s]+)+)(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L37
    Pattern.compile("(\\s*)(\\w+)(\\s*)(int|varchar)(\\s*)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L68
    Pattern.compile("(update)(\\s+)(\\w+)(\\s+)(set)(\\s*[\\w]+\\s*([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))\\s*(?:,\\s*[\\w]+\\s*([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))){0,})(\\s*)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L69
    Pattern.compile("(update)(\\s+)(\\w+)(\\s+)(set)(\\s*[\\w]+\\s*([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))\\s*(?:,\\s*[\\w]+\\s*([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))){0,})(\\s+)(where)(\\s+)(\\w+)(\\s*+)([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L79
    Pattern.compile("(\\s*)(\\w+)(\\s*)([=><])(\\s*)((?:\\'[\\s\\S]+\\')|\\d+)(\\s*)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L132
    Pattern.compile("(insert)(\\s+)(into)(\\s+)(\\w+)(\\s*+)(\\()(\\s*+)([\\w]+\\s*(?:,\\s*[\\w]+\\s*){0,})(\\s*+)(\\))(\\s*)(values)(\\s*)(\\()((?:(?:\\s*\\'\\s*[\\s\\S]+\\s*\\'\\s*)|(?:\\s*[\\d]+\\s*))(?:,(?:(?:\\s*\\'\\s*[\\s\\S]+\\s*\\'\\s*)|(?:\\s*[\\d]+\\s*))){0,})(\\))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L133
    Pattern.compile("(insert)(\\s+)(into)(\\s+)(\\w+)(\\s*+)(values)(\\s*)(\\()((?:(?:\\s*\\'\\s*[\\s\\S]+\\s*\\'\\s*)|(?:\\s*[\\d]+\\s*))(?:,(?:(?:\\s*\\'\\s*[\\s\\S]+\\s*\\'\\s*)|(?:\\s*[\\d]+\\s*))){0,})(\\))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L146
    Pattern.compile("(\\s*)(\\w+)(\\s*)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L151
    Pattern.compile("(\\s*)((?:\\'[\\s\\S]+\\')|\\d+)(\\s*)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L191
    Pattern.compile("(delete)(\\s+)(from)(\\s+)(\\w+)(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L192
    Pattern.compile("(delete)(\\s+)(from)(\\s+)(\\w+)(\\s+)(where)(\\s+)(\\w+)(\\s*+)([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L219
    Pattern.compile("(select)(\\s+)([*])(\\s+)(from)(\\s+)(\\w+)(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L220
    Pattern.compile("(select)(\\s+)([*])(\\s+)(from)(\\s+)(\\w+)(\\s+)(where)(\\s+)(\\w+)(\\s*+)([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L221
    Pattern.compile("(select)(\\s+)(\\s*[\\w]+\\s*(?:,\\s*[\\w]+\\s*){0,})(\\s+)(from)(\\s+)(\\w+)(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L222
    Pattern.compile("(select)(\\s+)(\\s*[\\w]+\\s*(?:,\\s*[\\w]+\\s*){0,})(\\s+)(from)(\\s+)(\\w+)(\\s+)(where)(\\s+)(\\w+)(\\s*+)([=><])(\\s*)((?:\\'[\\s\\S]+\\')|(?:\\d+))(\\s*+)"),
    // https://github.com/omarmohamedemam/DBMS-JDBC/blob/9dc1184622569c50a4fef324de06eee76e6e61f8/DBMS/src/eg/edu/alexu/csd/oop/db/Check.java#L305
    Pattern.compile("(drop)(\\s+)(table|database)(\\s+)(\\w+)(\\s*+)"),
    // https://github.com/DaoMinhHien/JAVA_CORE/blob/8a2779b8fc761423d0b94f8bf2844a6bbd4826ee/HienDM1_JavaCore_Assignment4/src/validation/Validation.java#L33
    Pattern.compile("^(AP)+[0-9]{5}$"),
    // https://github.com/DaoMinhHien/JAVA_CORE/blob/8a2779b8fc761423d0b94f8bf2844a6bbd4826ee/HienDM1_JavaCore_Assignment4/src/validation/Validation.java#L40
    Pattern.compile("^(FW)+[0-9]{5}$"),
    // https://github.com/DaoMinhHien/JAVA_CORE/blob/8a2779b8fc761423d0b94f8bf2844a6bbd4826ee/HienDM1_JavaCore_Assignment4/src/validation/Validation.java#L47
    Pattern.compile("^(RW)+[0-9]{5}$"),
    // https://github.com/DaoMinhHien/JAVA_CORE/blob/8a2779b8fc761423d0b94f8bf2844a6bbd4826ee/HienDM1_JavaCore_Assignment4/src/validation/Validation.java#L54
    Pattern.compile("[0-9a-z]{1,40}$"),
    // https://github.com/DaoMinhHien/JAVA_CORE/blob/8a2779b8fc761423d0b94f8bf2844a6bbd4826ee/HienDM1_JavaCore_Assignment4/src/validation/Validation.java#L61
    Pattern.compile("^(CAG)|(LGR)|(PRV)$"),
    // https://github.com/HSdevelop/coreJava/blob/5aa191e1934e877772de9caa3d80f4e0f1cdcf06/src/RegexDemo/RequestProcessingInterceptorNewDemo.java#L21
    Pattern.compile("\"assignee\":\"[а-яА-Яa-z_A-z0-9]+\""),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L34
    Pattern.compile("^42$"),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L40
    Pattern.compile("", Pattern.CANON_EQ),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L45
    Pattern.compile("", Pattern.CASE_INSENSITIVE),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L50
    Pattern.compile("", Pattern.COMMENTS),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L55
    Pattern.compile("", Pattern.DOTALL),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L66
    Pattern.compile("", Pattern.MULTILINE),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L72
    Pattern.compile("", Pattern.UNICODE_CASE),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L78
    Pattern.compile("", Pattern.UNICODE_CASE|Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L84
    Pattern.compile("", Pattern.UNIX_LINES),
    // https://github.com/kohanyirobert/ebson/blob/7eae5d15e033f3285ea80ee32c20699245044ee3/src/test/java/com/github/kohanyirobert/ebson/DefaultRegularExpressionReaderWriterTest.java#L89
    Pattern.compile("", Pattern.CASE_INSENSITIVE|Pattern.COMMENTS|Pattern.MULTILINE),
    // https://github.com/Aaryatech/ShivShambhoo/blob/59c51bc2335a35ab349bdb7b01ea6cc64e5a5a0b/app/src/main/java/com/ats/shivshambhoo/util/ValidationFile.java#L15
    Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}"),
    // https://github.com/Aaryatech/ShivShambhoo/blob/59c51bc2335a35ab349bdb7b01ea6cc64e5a5a0b/app/src/main/java/com/ats/shivshambhoo/util/ValidationFile.java#L22
    Pattern.compile("\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}\\d[Z]{1}[A-Z\\d]{1}"),
    // https://github.com/codergithut/SpiderRobot/blob/b1ca807448349ab9cd436dd3e45057acc1329f7f/src/main/java/util/FormatHtmlUtil.java#L25
    Pattern.compile("<a[^>]*>([^<]*)</a>"),
    // https://github.com/codergithut/SpiderRobot/blob/b1ca807448349ab9cd436dd3e45057acc1329f7f/src/main/java/util/FormatHtmlUtil.java#L101
    Pattern.compile("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+$"),
    // https://github.com/codergithut/SpiderRobot/blob/b1ca807448349ab9cd436dd3e45057acc1329f7f/src/main/java/util/FormatHtmlUtil.java#L20
    Pattern.compile("[\\w-]+\\.(com.cn|net.cn|gov.cn|org\\.nz|org.cn|com|net|org|gov|cc|biz|info|cn|co)\\b()*", Pattern.CASE_INSENSITIVE),
    // https://github.com/codergithut/SpiderRobot/blob/b1ca807448349ab9cd436dd3e45057acc1329f7f/src/main/java/util/FormatHtmlUtil.java#L216
    Pattern.compile("href=['\"]([^'\"]*)['\"]"),
    // https://github.com/ngocvu1807/HumanManagement/blob/2441fb4e370f65198836e4b0967ea9503d3f01ec/src/middleware/Validation.java#L26
    Pattern.compile("^[0-9]{10}$"),
    // https://github.com/ngocvu1807/HumanManagement/blob/2441fb4e370f65198836e4b0967ea9503d3f01ec/src/middleware/Validation.java#L32
    Pattern.compile("G(C|T)[0-9]{5}$"),
    // https://github.com/ngocvu1807/HumanManagement/blob/2441fb4e370f65198836e4b0967ea9503d3f01ec/src/middleware/Validation.java#L38
    Pattern.compile("^[a-zA-Z ]{1,100}$"),
    // https://github.com/ngocvu1807/HumanManagement/blob/2441fb4e370f65198836e4b0967ea9503d3f01ec/src/middleware/Validation.java#L44
    Pattern.compile("[0-9]{8}$"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L10
    Pattern.compile("\\w+(\\.\\w+)*@\\w+(\\.\\w+)+"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L18
    Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L37
    Pattern.compile("^\\d{5,13}$"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L41
    Pattern.compile("^[a-zA-Z][a-zA-Z\\d]{5,25}$"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L45
    Pattern.compile("^[a-zA-Z\\d]{6,25}$"),
    // https://github.com/dnjsguo/android_download/blob/b2c3924bb37277b68533b79f0e9b8f01b88583a3/appdear25/src/com/appdear/client/utility/VaildValue.java#L49
    Pattern.compile("^[a-zA-Z\\d]{6,16}$"),
    // https://github.com/enixlin/jrrc_mail_new/blob/df4fb55cbdb5bab4295dda00d2d6b435fb2a3e1e/src/enixlin/jrrc/mail/ui/FunctionMain.java#L121
    Pattern.compile("var d[0-9]{1,}.+?;"),
    // https://github.com/enixlin/jrrc_mail_new/blob/df4fb55cbdb5bab4295dda00d2d6b435fb2a3e1e/src/enixlin/jrrc/mail/ui/FunctionMain.java#L137
    Pattern.compile(" d[0-9]{0,}="),
    // https://github.com/enixlin/jrrc_mail_new/blob/df4fb55cbdb5bab4295dda00d2d6b435fb2a3e1e/src/enixlin/jrrc/mail/ui/FunctionMain.java#L138
    Pattern.compile("'[^0-9]{1,}'"),
    // https://github.com/enixlin/jrrc_mail_new/blob/df4fb55cbdb5bab4295dda00d2d6b435fb2a3e1e/src/enixlin/jrrc/mail/ui/FunctionMain.java#L139
    Pattern.compile("'[0-9]{1,}'"),
    // https://github.com/enixlin/jrrc_mail_new/blob/df4fb55cbdb5bab4295dda00d2d6b435fb2a3e1e/src/enixlin/jrrc/mail/ui/FunctionMain.java#L140
    Pattern.compile(",d[0-9]{1,}.+?;"),
    // https://github.com/qunxyz/netone-middleware/blob/b8bcfa687d0f8179b8d7a137ad54a922641c58e6/%20netone-middleware/fck/fck/src/oe/product/fck/common/REGUtil.java#L44
    Pattern.compile("<[^<|>]*>"),
    // https://github.com/qunxyz/netone-middleware/blob/b8bcfa687d0f8179b8d7a137ad54a922641c58e6/%20netone-middleware/fck/fck/src/oe/product/fck/common/REGUtil.java#L80
    Pattern.compile("&[a-z]+;", Pattern.CASE_INSENSITIVE),
    // https://github.com/qunxyz/netone-middleware/blob/b8bcfa687d0f8179b8d7a137ad54a922641c58e6/%20netone-middleware/fck/fck/src/oe/product/fck/common/REGUtil.java#L115
    Pattern.compile("��"),
    // https://github.com/bnodya/Test/blob/69a46ce63d008385591bef2395827c93737a2065/Restaurant/src/com/shaman/servlet/controller/validator/UserValidator.java#L20
    Pattern.compile("^[a-z0-9_-]{3,16}$"),
    // https://github.com/bnodya/Test/blob/69a46ce63d008385591bef2395827c93737a2065/Restaurant/src/com/shaman/servlet/controller/validator/UserValidator.java#L29
    Pattern.compile("^[a-z0-9_-]{3,18}$"),
    // https://github.com/1plwang/NewsSystem/blob/c93012ded84000e177783936ff12f30dd6368c22/newssystem/src/com/java1234/util/StringUtil.java#L52
    Pattern.compile("[\\d+\\s*`~!@#$%^&*\\(?~��@#��%����&*��������+|{}��������������_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/1plwang/NewsSystem/blob/c93012ded84000e177783936ff12f30dd6368c22/newssystem/src/com/java1234/util/StringUtil.java#L53
    Pattern.compile("[\\w[^\\W]*]", Pattern.CASE_INSENSITIVE),
    // https://github.com/nomad5modules/Log/blob/0773769f734d96c0fc1f534b70d0e839589cdd6a/log-runtime/src/main/java/com/nomad5/log/Handler/Pattern/PatternCompiler.java#L38
    Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?class(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?"),
    // https://github.com/danko-david/javaexperience-core/blob/72eee315fd39e06f38f12a7c985a08ac9e96b0aa/src/main/java/eu/javaexperience/regex/RegexTools.java#L30
    Pattern.compile(" *: *"),
    // https://github.com/danko-david/javaexperience-core/blob/72eee315fd39e06f38f12a7c985a08ac9e96b0aa/src/main/java/eu/javaexperience/regex/RegexTools.java#L36
    Pattern.compile("[/\\\\]+"),
    // https://github.com/danko-david/javaexperience-core/blob/72eee315fd39e06f38f12a7c985a08ac9e96b0aa/src/main/java/eu/javaexperience/regex/RegexTools.java#L38
    Pattern.compile("\\p{Cntrl}"),
    // https://github.com/danko-david/javaexperience-core/blob/72eee315fd39e06f38f12a7c985a08ac9e96b0aa/src/main/java/eu/javaexperience/regex/RegexTools.java#L55
    Pattern.compile("\\?<(\\w+)>"),
    // https://github.com/ManulaUluwatta/GrocerySystem/blob/512c47494c430ba4855c559888a576b245bec30d/src/lk/uwu/grocery/other/Validator.java#L63
    Pattern.compile("^(\\d{9}|\\d{12})[VvXx]$"),
    // https://github.com/normaan/javaee/blob/3fdbf9bb2033969b0b6bbbd8a857529f93014fdd/bbs_mini/src/com/zw/util/StringUtil.java#L58
    Pattern.compile("[\\d+\\s*`~!@#$%^&*\\(?~！@#￥%……&*（）——+|{}【】‘：”“’_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/alter-ego/advanced-android-logger/blob/6e70b79ac37c32f191685bd8b720e4712d7fa599/app/src/main/java/com/alterego/advancedandroidlogger/helpers/Pattern.java#L28
    Pattern.compile("\\(\\?<(\\w+)>"),
    // https://github.com/alter-ego/advanced-android-logger/blob/6e70b79ac37c32f191685bd8b720e4712d7fa599/app/src/main/java/com/alterego/advancedandroidlogger/helpers/Pattern.java#L30
    Pattern.compile("\\\\k<(\\w+)>"),
    // https://github.com/alter-ego/advanced-android-logger/blob/6e70b79ac37c32f191685bd8b720e4712d7fa599/app/src/main/java/com/alterego/advancedandroidlogger/helpers/Pattern.java#L31
    Pattern.compile("\\$\\{(\\w+)\\}"),
    // https://github.com/xiaolowe/orange/blob/cbd407bc8c6ad6ff81529b421a62d7cbd2307cf9/orange/src/com/orange/util/HtmlHelper.java#L69
    Pattern.compile("[\\s*`~!@#$%^&*\\(\\)\\+=|{}':;',\\[\\].<>~！@#￥%……&*（）——+|{}【】‘：”“’_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/xiaolowe/orange/blob/cbd407bc8c6ad6ff81529b421a62d7cbd2307cf9/orange/src/com/orange/util/HtmlHelper.java#L71
    Pattern.compile("[(A-Za-z)]", Pattern.CASE_INSENSITIVE),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L147
    Pattern.compile("\\b[Hh][Rr][: ]*[ wais]*\\d+[ ]*[Ii]*[/]*[Rr]*"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L169
    Pattern.compile("\\b[Rr][Rr][: ]*[ wais]*\\d+[ ]*[Ii]*[/]*[Rr]*"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L179
    Pattern.compile("\\b[Rr][Ee][Ss][Pp][: ]*[ wais]*\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L198
    Pattern.compile("\\b[Pp][Uu]*[Ll]*[Ss]*[Ee]*[ ]*[Oo][Xx]*[2]*[: ]*[ wais]*\\d+[ ]*[Ii]*[/]*[Rr]*"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L228
    Pattern.compile("\\b[Bb][/]*[Pp][: ]*[ wais]*\\d+/\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L261
    Pattern.compile("\\bblood pressure[: ]*[ wais]*\\d+/\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L299
    Pattern.compile("\\b[Hh][Ee]*[Ii]*[Gg]*[Hh]*[Tt][: ]*[ wais]*\\d+[.]*\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L321
    Pattern.compile("\\b[Ww][Ee]*[Ii]*[Gg]*[Hh]*[Tt][: ]*[ wais]*\\d+[.]*\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L343
    Pattern.compile("\\b[Hh][Ee]*[Aa]*[Dd]*[ ]*[Cc][irc]*[: ]*[ wais]*\\d+[.]*\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L365
    Pattern.compile("\\b[Tt][Ee]*[Mm]*[Pp]*[: ]*[ wais]*\\d+[.]*\\d+"),
    // https://github.com/Princeninja/Pm4.3-beyond/blob/5ec01334d246e4a8dee2324f9ff0c05e3ce13911/Pm/src/palmed/TransferVitals.java#L405
    Pattern.compile("\\d+[.]*\\d+"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L15
    Pattern.compile("^[A-Za-z]{2,15}$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L30
    Pattern.compile("^([ \u00c0-\u01ffa-zA-Z'])+$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L44
    Pattern.compile("^((0[1-9])|(1[0-2]))\\/(\\d{4})$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L76
    Pattern.compile("^\\d*[a-z][a-z0-9]*$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L106
    Pattern.compile("^\\d*[A-Za-z\\s][A-Za-z0-9\\s]*$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L123
    Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L138
    Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L155
    Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L180
    Pattern.compile("^(\\d{3}-?\\d{2}-?\\d{4}|XXX-XX-XXXX)$"),
    // https://github.com/mshah1819/Projects/blob/b05769fc2fcbf80832c047e19f3d1a1e19774ae3/Video%20Library%20Managment%20Project%20/Server%20Code/CMPE273VideoLibrary/src/services/Validation.java#L195
    Pattern.compile("^[0-9]\\d*(\\.\\d{0,2}+)?$"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L38
    Pattern.compile("[a-zA-Z][a-zA-Z _]*"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L45
    Pattern.compile("[a-zA-Z][a-zA-Z0-9._]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L55
    Pattern.compile("[a-zA-Z0-9]*"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L62
    Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L69
    Pattern.compile("(0[0-9]|1[01]):(0[1-9]|[12345][0-9]|00) (am|pm|AM|PM)"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L83
    Pattern.compile("[0-9]*|[0-9]*.[0-9]*"),
    // https://github.com/the-squad/auction-desktop-application/blob/793dd666b879f8745bb681b85beea2b474244b67/src/app/Validation.java#L94
    Pattern.compile("(01)[012][0-9]*"),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L69
    Pattern.compile("<!DOCTYPE.*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L71
    Pattern.compile("</{0,1}html[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L73
    Pattern.compile("</{0,1}a[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L54
    Pattern.compile("<\\s*meta\\s+([^>]*)\\s*/{0,1}>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L56
    Pattern.compile("<\\s*link\\s+([^>]*)\\s*/{0,1}>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L58
    Pattern.compile("<[\\s]*?head[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?head[\\s]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/zql3315/test1/blob/2b12c0a1ba03dca0cb5e8270f4401854a97a343c/base-framework/src/main/java/com/infosky/common/util/GetNoHTMLString.java#L62
    Pattern.compile("<\\s*script\\s+([^>]*)\\s*/>", Pattern.CASE_INSENSITIVE),
    // https://github.com/abigpush/guangyu_manager/blob/541bfb49e299b1c48af3959fec13e713ced9c510/src/main/java/com/bt/om/util/RegexUtil.java#L17
    Pattern.compile("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))"),
    // https://github.com/abigpush/guangyu_manager/blob/541bfb49e299b1c48af3959fec13e713ced9c510/src/main/java/com/bt/om/util/RegexUtil.java#L126
    Pattern.compile(" {2,}"),
    // https://github.com/abigpush/guangyu_manager/blob/541bfb49e299b1c48af3959fec13e713ced9c510/src/main/java/com/bt/om/util/RegexUtil.java#L131
    Pattern.compile("[\\t\\r\\n]{2,}"),
    // https://github.com/abigpush/guangyu_manager/blob/541bfb49e299b1c48af3959fec13e713ced9c510/src/main/java/com/bt/om/util/RegexUtil.java#L149
    Pattern.compile("(\\d+\\.{1}\\d+)"),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L12
    Pattern.compile("(?<!((Maxthon|Opera|Tencent|QQBrowser|TheWorld|360SE|MetaSr).+))\\bMSIE[\\s/]?(\\d*)(?!(.+(Maxthon|Opera|Tencent|QQBrowser|TheWorld|360SE|MetaSr)))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L13
    Pattern.compile("(?<!((Opera|Opera).+))\\bFirefox[\\s/]?(\\d*)(?!(.+(Opera)))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L14
    Pattern.compile("\\bChrome[\\s/]?(\\d*)(?!(.+(\\bSE.*MetaSr)))", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L15
    Pattern.compile("\\bOpera[\\s/]?(\\d*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L16
    Pattern.compile("\\bVersion[\\s/]?.*\\bSafari", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L17
    Pattern.compile("\\bMaxthon[\\s/]?(\\d*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L18
    Pattern.compile("\\bTencent\\s?Traveler[\\s/]?(\\d*)|(\\bTrident[\\s/]?.*\\bQQBrowser)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L19
    Pattern.compile("\\bSE.*MetaSr", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L20
    Pattern.compile("\\bTheWorld[\\s/]?(\\d*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L21
    Pattern.compile("\\b360SE", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L22
    Pattern.compile("\\bVersion[\\s/]?(\\d*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/youyoufish/ad-server-common/blob/de5c159e3ba1ca70768be02b1102ac3f29491f9d/src/main/java/com/hang/common/web/browser/BrowserUtil.java#L23
    Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE),
    // https://github.com/prography/mozimozi/blob/98e283e8b5400c669eec3f88dbd51a912084d9c2/app/src/main/java/com/prograpy/app1/appdev1/utils/Utils.java#L17
    Pattern.compile("^(.*[A-Z].*).$"),
    // https://github.com/prography/mozimozi/blob/98e283e8b5400c669eec3f88dbd51a912084d9c2/app/src/main/java/com/prograpy/app1/appdev1/utils/Utils.java#L21
    Pattern.compile("^((?=.*[0-9])(?=.*[a-z])).{8,16}$"),
    // https://github.com/prography/mozimozi/blob/98e283e8b5400c669eec3f88dbd51a912084d9c2/app/src/main/java/com/prograpy/app1/appdev1/utils/Utils.java#L41
    Pattern.compile("^((?=.*[0-9])(?=.*[a-z])|(?=.*[a-z])).{4,16}$"),
    // https://github.com/prography/mozimozi/blob/98e283e8b5400c669eec3f88dbd51a912084d9c2/app/src/main/java/com/prograpy/app1/appdev1/utils/Utils.java#L55
    Pattern.compile("^[ㄱ-힣\\s]*$"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L9
    Pattern.compile("\\d{1,5}(-\\d{1,5})?"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L12
    Pattern.compile("(\\d{1,3}(-\\d{1,3})?\\.){3}\\d{1,3}(-\\d{1,3})?(/\\d{1,2})?"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L15
    Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])(/\\d{1,2})?$"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L19
    Pattern.compile("Nmap done.*$"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L23
    Pattern.compile(".*About .*% done; ETC: .*"),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L32
    Pattern.compile(".*About "),
    // https://github.com/tr0id/Aegis/blob/28f5d4650d30c7cd10941ff22e5c2ff695759c2c/src/Specs/Constants.java#L35
    Pattern.compile("% done; ETC: .*"),
    // https://github.com/bclarkx2/count/blob/005314443f378a747b59e9bb030a66822c81906f/src/main/java/info/clarknet/count/counter/regex/Regex.java#L14
    Pattern.compile("[?!.]"),
    // https://github.com/bclarkx2/count/blob/005314443f378a747b59e9bb030a66822c81906f/src/main/java/info/clarknet/count/counter/regex/Regex.java#L15
    Pattern.compile("[\"]"),
    // https://github.com/bclarkx2/count/blob/005314443f378a747b59e9bb030a66822c81906f/src/main/java/info/clarknet/count/counter/regex/Regex.java#L16
    Pattern.compile("[-]+"),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L48
    Pattern.compile("<(no)?script[^>]*>.*?</(no)?script>", Pattern.DOTALL),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L49
    Pattern.compile("<style[^>]*>.*</style>", Pattern.DOTALL),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L50
    Pattern.compile("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>"),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L51
    Pattern.compile("<\\w+\\s+[^<]*\\s*>"),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L52
    Pattern.compile("&[^;]+;"),
    // https://github.com/bibaboo/wjava/blob/835cae0cad4f607e5ae17ccf14e9cd1605426e3e/src/regexUtils/RegexUtils.java#L53
    Pattern.compile("\\s\\s+"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L29
    Pattern.compile("[ \\t\\x0B\\xA0]"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L30
    Pattern.compile("(?:\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L31
    Pattern.compile("(?:[A-Z]\\p{javaJavaIdentifierPart}*)"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L34
    Pattern.compile("\\.\\.\\.\\s+(\\d+)\\s+(?:more|common frames omitted)"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L35
    Pattern.compile("(?:[\\p{javaJavaIdentifierStart}<][\\p{javaJavaIdentifierPart}>]*)"),
    // https://github.com/rollbar/samebug-eclipse-plugin/blob/01febfb1876a489911707faf9e435cf72e35ce1d/bundles/com.samebug.clients.eclipse.search/src/com/samebug/clients/eclipse/search/LineType.java#L36
    Pattern.compile("\\(([^\\)]*)\\)"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L28
    Pattern.compile("(^(-{1})(([a-zA-Z]\\w{0,100})|(\\d+))$)"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L31
    Pattern.compile("([a-zA-Z]\\w{0,100}(\\+{2}|-{2}))|((\\+{2}|-{2})[a-zA-Z]\\w{0,100} )"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L34
    Pattern.compile("(\\+{1}|-{1}|\\*{1}|\\/{1})(\\={1})"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L40
    Pattern.compile("(^\\d+\\w*(\\+{2}|-{2}))|(^(\\+{2}|-{2})\\d+\\w*)"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L43
    Pattern.compile("(=)"),
    // https://github.com/maayansam/Algorithms/blob/af40448af2fa7cecf95d8380d5edae99a8b7ec65/src/com/example/HomeTest/RegexExample.java#L11
    Pattern.compile("[a-zA-Z]\\w{0,100}"),
    // https://github.com/amolofos/FestoMpsOld/blob/5a065527c956bacb65e0b60f819e899f7c27c4b7/2011-11-08/NetBeans/Library/Tools/src/Tools/PatternFormatter.java#L27
    Pattern.compile("([0-5]?\\d?\\d?\\d?[1-9]|6[0-5][0-5][0-3][0-5])"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L19
    Pattern.compile("[ \n\r\t]+"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L28
    Pattern.compile("[*]"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L29
    Pattern.compile("[/]"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L30
    Pattern.compile("\\^"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L31
    Pattern.compile("[(]"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L32
    Pattern.compile("[)]"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L33
    Pattern.compile("([1-9][0-9]*)|(0)"),
    // https://github.com/RuslanKhalimov/MT/blob/4a757343ea34b815e8e200ce5ab8daf3411f05be/parser-generator/src/main/java/results/Arithmetic/ArithmeticLexer.java#L34
    Pattern.compile("$"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L50
    Pattern.compile("[^\\u4E00-\\u9FA5]*"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L58
    Pattern.compile("[^\\*]*"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L67
    Pattern.compile("^[1-9]\\d*$"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L78
    Pattern.compile(".*[a-zA-Z].*"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L80
    Pattern.compile(".*[^a-zA-Z0-9].*"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L114
    Pattern.compile("[\u4e00-\u9fa5]+"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L120
    Pattern.compile("[\\s\u4e00-\u9fa5]"),
    // https://github.com/Magic4Cloud/HooViewAndroid/blob/280b73a853402a05604e5ea3bc960a36269ce0dd/elapp/src/main/java/com/easyvaas/elapp/utils/ValidateParam.java#L142
    Pattern.compile("^1[34578]\\d{9}$"),
    // https://github.com/MordiJC/ActViewer/blob/5dd0b370bad87f4a40dd2ddb5b500fd4d3a863bc/src/main/java/io/github/mordijc/parser/actutils/ActPreparser.java#L22
    Pattern.compile("\\u00A9Kancelaria Sejmu.*"),
    // https://github.com/MordiJC/ActViewer/blob/5dd0b370bad87f4a40dd2ddb5b500fd4d3a863bc/src/main/java/io/github/mordijc/parser/actutils/ActPreparser.java#L23
    Pattern.compile("\\d{4}-\\d{2}-\\d{2}"),
    // https://github.com/MordiJC/ActViewer/blob/5dd0b370bad87f4a40dd2ddb5b500fd4d3a863bc/src/main/java/io/github/mordijc/parser/actutils/ActPreparser.java#L24
    Pattern.compile("Dz\\.U\\..*"),
    // https://github.com/MordiJC/ActViewer/blob/5dd0b370bad87f4a40dd2ddb5b500fd4d3a863bc/src/main/java/io/github/mordijc/parser/actutils/ActPreparser.java#L26
    Pattern.compile(".*\\(uchylony\\)\\s*"),
    // https://github.com/MordiJC/ActViewer/blob/5dd0b370bad87f4a40dd2ddb5b500fd4d3a863bc/src/main/java/io/github/mordijc/parser/actutils/ActPreparser.java#L27
    Pattern.compile(".*\\(pominięty\\)\\s*"),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L70
    Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L74
    Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L77
    Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L81
    Pattern.compile("</script>", Pattern.CASE_INSENSITIVE),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L85
    Pattern.compile("<script(.*?)>", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L89
    Pattern.compile("eval\\((.*?)\\)", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L93
    Pattern.compile("e­xpression\\((.*?)\\)", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L97
    Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L101
    Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE),
    // https://github.com/yongchongwu/jpa_demo/blob/bd61930bf62102fd6e26f98e3f44231af8d71cf6/src/main/java/com/ifuture/demo/util/HTMLUtil.java#L105
    Pattern.compile("onload(.*?)=", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL),
    // https://github.com/sevgigundogdu7834/Java-SE/blob/0081e97003cfcdde35a5dc759338a3c969be6334/chapter%209/src/_07_regex/RegexTest01.java#L60
    Pattern.compile("aba"),
    // https://github.com/wen-fei/choice/blob/5fa575a3f9213ff6ef7630a4a4e22e1eb85056d9/src/main/java/org/choice/utils/MLUtils.java#L55
    Pattern.compile("\\s*|\\t|\\r|\\n", Pattern.CASE_INSENSITIVE),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L23
    Pattern.compile("([a-z]+)"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L24
    Pattern.compile("([A-Z]+)"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L27
    Pattern.compile("(\\w+)\\W+(\\w+)\\W+([\\w\\.]+)"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L36
    Pattern.compile("(?m).*"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L37
    Pattern.compile("(?m).+"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L38
    Pattern.compile("(?m).*", Pattern.UNIX_LINES),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L47
    Pattern.compile("test.*"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L53
    Pattern.compile("test.+"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L54
    Pattern.compile(".*", Pattern.UNIX_LINES),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L55
    Pattern.compile(".*", Pattern.CASE_INSENSITIVE),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L102
    Pattern.compile("[\\\\$]+"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L109
    Pattern.compile("[a-f]"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L116
    Pattern.compile("[aeiou]"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L118
    Pattern.compile("((?<!\\\\)\".*?(?<!\\\\)\"|\\s+)"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L130
    Pattern.compile("ab"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L150
    Pattern.compile("[a-c]"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L158
    Pattern.compile("[a-c]+"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L172
    Pattern.compile("(?=\\d++)"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L206
    Pattern.compile("(?:(?<letter>[a-z]+)|(?<number>[0-9]+))"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L251
    Pattern.compile("(abc).*"),
    // https://github.com/cerijerome/ceri/blob/071665f0e6fd4a9509b153cf7219e4e41c654733/ceri-common/src/test/java/ceri/common/text/RegexUtilTest.java#L252
    Pattern.compile("abc.*"),
    // https://github.com/liujiaxiang/mb/blob/ef450f70a5aa90d3913dc48f3c9d91d816eaf55f/fcms/src/main/java/com/daymooc/fcms/common/kit/HtmlKit.java#L10
    Pattern.compile("</?[^>]+>"),
    // https://github.com/liujiaxiang/mb/blob/ef450f70a5aa90d3913dc48f3c9d91d816eaf55f/fcms/src/main/java/com/daymooc/fcms/common/kit/HtmlKit.java#L11
    Pattern.compile("<a>\\s*|\t|\r|\n</a>"),
    // https://github.com/liujiaxiang/mb/blob/ef450f70a5aa90d3913dc48f3c9d91d816eaf55f/fcms/src/main/java/com/daymooc/fcms/common/kit/HtmlKit.java#L59
    Pattern.compile("(<img.*src\\s*=\\s*(.*?)[^>]*?>)", Pattern.CASE_INSENSITIVE),
    // https://github.com/liujiaxiang/mb/blob/ef450f70a5aa90d3913dc48f3c9d91d816eaf55f/fcms/src/main/java/com/daymooc/fcms/common/kit/HtmlKit.java#L64
    Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)"),
    // https://github.com/Lid23/noodlesprojects/blob/c5855af6ba888f2cd65091e076c63369f1d5adbf/javabasic/src/main/java/com/noodles/regular/RegularExpression.java#L161
    Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL),
    // https://github.com/Lid23/noodlesprojects/blob/c5855af6ba888f2cd65091e076c63369f1d5adbf/javabasic/src/main/java/com/noodles/regular/RegularExpression.java#L169
    Pattern.compile("(?m)^ +"),
    // https://github.com/Lid23/noodlesprojects/blob/c5855af6ba888f2cd65091e076c63369f1d5adbf/javabasic/src/main/java/com/noodles/regular/RegularExpression.java#L196
    Pattern.compile("[frb][aiu][gx]"),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L34
    Pattern.compile("<[^>]*script[^>]*>.*</script[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L36
    Pattern.compile("<iframe[^>]*>.*</iframe[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L39
    Pattern.compile("<iframe[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L116
    Pattern.compile("([^>]*?)onload=([\"|']?(.+?)[\"|']?)", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L180
    Pattern.compile("<img.*?src.*?=\\s*?([^> ]+)\\s*.*?>", Pattern.CASE_INSENSITIVE|Pattern.DOTALL),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L187
    Pattern.compile("\"|'"),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L328
    Pattern.compile("'.*[\\+|=|-]'", Pattern.CASE_INSENSITIVE),
    // https://github.com/cloudwebsoft/yimioa/blob/07862525a6deaf09559339e73b4c8dcb15b8e232/QuickFramework/cn/js/fan/security/AntiXSS.java#L339
    Pattern.compile("--><"),
    // https://github.com/disbeat/camera_info/blob/d4aa2604e5ed2162785efdffee01a8c9ea9787d2/IS-Projecto4/src/is/parsing/CameraParser.java#L153
    Pattern.compile("(\\d+):(\\d+)"),
    // https://github.com/disbeat/camera_info/blob/d4aa2604e5ed2162785efdffee01a8c9ea9787d2/IS-Projecto4/src/is/parsing/CameraParser.java#L195
    Pattern.compile("(\\d+)\\sx\\s(\\d+)"),
    // https://github.com/disbeat/camera_info/blob/d4aa2604e5ed2162785efdffee01a8c9ea9787d2/IS-Projecto4/src/is/parsing/CameraParser.java#L222
    Pattern.compile("([^,]*),?"),
    // https://github.com/llldddbbb/Blog/blob/1d47ac80b173353b5c08fd69dbc5b3294a62cac2/src/main/java/com/blog/util/StringUtil.java#L42
    Pattern.compile("[*`~!@#$%^*\\(?~！@#￥%……*（）——+|{}【】‘：”“’_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L41
    Pattern.compile("BANDWIDTH=(\\d+)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L42
    Pattern.compile("CODECS=\"(.+?)\""),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L43
    Pattern.compile("RESOLUTION=(\\d+x\\d+)"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L44
    Pattern.compile("#EXTINF:([\\d.]+)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L45
    Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L46
    Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L47
    Pattern.compile("#EXT-X-VERSION:(\\d+)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L48
    Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L49
    Pattern.compile("METHOD=(NONE|AES-128)"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L50
    Pattern.compile("URI=\"(.+?)\""),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L51
    Pattern.compile("IV=([^,.*]+)"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L52
    Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L53
    Pattern.compile("LANGUAGE=\"(.+?)\""),
    // https://github.com/JairoBm13/crunchywomod/blob/90ad43cdf12e41fc6ff2323ec5d6d94cc45a1c52/crunchyroll/crunchyroll2-0-3/com/google/android/exoplayer/hls/HlsPlaylistParser.java#L54
    Pattern.compile("NAME=\"(.+?)\""),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L20
    Pattern.compile("^09[0-9]{8}|[1][3,4,5,6,7,8,9][0-9]{9}$"),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L42
    Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9_]+"),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L48
    Pattern.compile("^[a-zA-Z0-9_]+"),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L54
    Pattern.compile("^[\u4e00-\u9fa5]+$"),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L60
    Pattern.compile("^[\u4e00-\u9fa5\\w]+$"),
    // https://github.com/tq0818/schoolPC/blob/1b5aa4083cf42b73234d5871d6d753a362961748/yuxin-school-web/src/main/java/com/yuxin/wx/utils/ParameterUtil.java#L66
    Pattern.compile("[0-9X|x]*"),
    // https://github.com/wmydz1/CoolNews/blob/251f13207eeb1f3128b856c5f02570d67804a57c/src/com/logoocc/util/StringUtil.java#L52
    Pattern.compile("[\\d+\\s*`~!@#$%^&*\\(?~！@#￥%……&*（）――+|{}【】‘：”“’_]", Pattern.CASE_INSENSITIVE),
    // https://github.com/esahan/IklimsaServices/blob/eac582e76dcb0675ef39361dd7800a2c4fe070e7/src/main/java/com/iklimsa/util/ValidationClass.java#L21
    Pattern.compile("\\(\\d{3}\\)-\\d{3}-\\d{4}"),
    // https://github.com/xjdr/xrpc/blob/18bc9cb5d7b968c62567ca09043826be7f3fd893/src/main/java/com/xjeffrose/xrpc/http/Route.java#L13
    Pattern.compile("(:\\w+)"),
    // https://github.com/loveingenioustech/study/blob/094cf96019108d59908ec02adb415826694473f5/java-demo/src/regex/RegexAPIDemo.java#L33
    Pattern.compile("He"),
    // https://github.com/loveingenioustech/study/blob/094cf96019108d59908ec02adb415826694473f5/java-demo/src/regex/RegexAPIDemo.java#L47
    Pattern.compile("Hello.You", Pattern.CASE_INSENSITIVE|Pattern.COMMENTS|Pattern.MULTILINE|Pattern.DOTALL|Pattern.UNICODE_CASE),
    // https://github.com/loveingenioustech/study/blob/094cf96019108d59908ec02adb415826694473f5/java-demo/src/regex/RegexAPIDemo.java#L71
    Pattern.compile("<b>(.*?)</b>", Pattern.DOTALL),
    // https://github.com/loveingenioustech/study/blob/094cf96019108d59908ec02adb415826694473f5/java-demo/src/regex/RegexAPIDemo.java#L93
    Pattern.compile("<b>.*?</b>"),
    // https://github.com/loveingenioustech/study/blob/094cf96019108d59908ec02adb415826694473f5/java-demo/src/regex/RegexAPIDemo.java#L94
    Pattern.compile("before"),
    // https://github.com/nrvermore/DemoCodeBak/blob/9ebed9dbeed8077899564f9b683d7ffe26b25856/labwinner/src/main/java/com/labwinner/util/StringUtil.java#L23
    Pattern.compile("<!--.+?-->"),
    // https://github.com/estn/common/blob/768c4f7682b334cf84d6a4b6fd4954bae1ac2986/core/src/main/java/com/argyranthemum/common/core/util/HtmlUtil.java#L19
    Pattern.compile("<br\\s*/?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/orbitturner/Simplon-JEE-Briefs/blob/5fa76e3bfd348dcde5527343b007c957d77e0b64/ECLIPSE_WORKSPACE/SenForage_JSP_Servlet_1/src/services/MyValidator.java#L153
    Pattern.compile("(?=.[0-9])."),
    // https://github.com/orbitturner/Simplon-JEE-Briefs/blob/5fa76e3bfd348dcde5527343b007c957d77e0b64/ECLIPSE_WORKSPACE/SenForage_JSP_Servlet_1/src/services/MyValidator.java#L158
    Pattern.compile("(?=.[a-z])."),
    // https://github.com/orbitturner/Simplon-JEE-Briefs/blob/5fa76e3bfd348dcde5527343b007c957d77e0b64/ECLIPSE_WORKSPACE/SenForage_JSP_Servlet_1/src/services/MyValidator.java#L163
    Pattern.compile("(?=.[A-Z])."),
    // https://github.com/orbitturner/Simplon-JEE-Briefs/blob/5fa76e3bfd348dcde5527343b007c957d77e0b64/ECLIPSE_WORKSPACE/SenForage_JSP_Servlet_1/src/services/MyValidator.java#L168
    Pattern.compile("(?=.[~!@#$%^&()_-]).*"),
    // https://github.com/hortonworks/cloudbreak/blob/8b19e1905d7c2ee05478a131363f9c61f7cce468/mock-infrastructure/src/main/java/com/sequenceiq/mock/salt/response/GrainsRemoveSaltResponse.java#L33
    Pattern.compile(".*(tgt=([^&]+)).*"),
    // https://github.com/hortonworks/cloudbreak/blob/8b19e1905d7c2ee05478a131363f9c61f7cce468/mock-infrastructure/src/main/java/com/sequenceiq/mock/salt/response/GrainsRemoveSaltResponse.java#L34
    Pattern.compile(".*(arg=([^&]+)).*(arg=([^&]+)).*"),
    // https://github.com/hortonworks/cloudbreak/blob/8b19e1905d7c2ee05478a131363f9c61f7cce468/mock-infrastructure/src/main/java/com/sequenceiq/mock/salt/response/GrainGetSaltResponse.java#L49
    Pattern.compile(".*(arg=([^&]+)).*"),
    // https://github.com/hortonworks/cloudbreak/blob/8b19e1905d7c2ee05478a131363f9c61f7cce468/mock-infrastructure/src/main/java/com/sequenceiq/mock/salt/response/CmdRunSaltResponse.java#L19
    Pattern.compile("&tgt=([\\w\\.-]+)&"),
    // https://github.com/hortonworks/cloudbreak/blob/8b19e1905d7c2ee05478a131363f9c61f7cce468/common/src/main/java/com/sequenceiq/cloudbreak/util/HostUtil.java#L13
    Pattern.compile(".*\\d{4,5}/?(.*)/?"),
    // https://github.com/Judge-Girl/Code-Quality-Inspection/blob/684cc9b8d70659d643ce7425e7cb37f5985f253f/src/main/java/tw/waterball/judgegirl/cqi/cyclomatic/CyclomaticComplexityCalculatorImpl.java#L86
    Pattern.compile("([^0-9A-Za-z_]((if)|(case)|(for)|(while)|(catch))[^0-9A-Za-z_])|[&][&]|[|][|]|[?]"),
    // https://github.com/Judge-Girl/Code-Quality-Inspection/blob/684cc9b8d70659d643ce7425e7cb37f5985f253f/src/main/java/tw/waterball/judgegirl/cqi/cyclomatic/CyclomaticComplexityCalculatorImpl.java#L97
    Pattern.compile("\"(\\.|[^\"\n])*\""),
    // https://github.com/MerlinRdev/ax89x/blob/d847c4cfc37f7e1ce71d84d7c81975673f19510f/release/src/router/strongswan/src/frontends/android/app/src/main/java/org/strongswan/android/utils/SettingsWriter.java#L43
    Pattern.compile("[^#{}=\"\\n\\t ]+"),
    // https://github.com/MerlinRdev/ax89x/blob/d847c4cfc37f7e1ce71d84d7c81975673f19510f/release/src/router/strongswan/src/frontends/android/app/src/main/java/org/strongswan/android/security/LocalCertificateStore.java#L43
    Pattern.compile("^local:[0-9a-f]{40}$"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/QuotedValue.java#L20
    Pattern.compile("\\\".+\\\""),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L30
    Pattern.compile("[A-Z].{1,49}"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L154
    Pattern.compile("(some (books|papers|works) by .+)|(some of .+ (books|papers|works))"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L163
    Pattern.compile("some things .+ like[sd]?"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L171
    Pattern.compile(".+ (social network|friends|family)"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L179
    Pattern.compile(".+ (logs|events)"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L193
    Pattern.compile("(my|.+'s) stuff"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Person.java#L207
    Pattern.compile("(my|.+'s) belongings"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Organization.java#L26
    Pattern.compile("[A-Z].+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/LinkedConcept.java#L23
    Pattern.compile("[a-zA-Z0-9].+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/LinkedConcept.java#L25
    Pattern.compile("http://dbpedia.org/resource/.+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/ISBNReference.java#L11
    Pattern.compile("ISBN(-10|-13)?: .+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Document.java#L174
    Pattern.compile("the authors of .+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Document.java#L182
    Pattern.compile("some notes from .+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/DatedEvent.java#L57
    Pattern.compile(".+ was born on .+"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/Date.java#L12
    Pattern.compile("[12][0-9][0-9][0-9]-[012][0-9]-[0123][0-9]"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/BibtexReference.java#L12
    Pattern.compile("\\\\cite\\{[^\\n\\r\\t \\\"#%'(){}\\\\]+\\}"),
    // https://github.com/synchrony/smsn/blob/eff1b8de764f710291c43bb8369d33bbc7a48af6/brain/src/main/java/net/fortytwo/smsn/brain/rdf/classes/AbstractEvent.java#L53
    Pattern.compile("some people I .+ at .+"),
    // https://github.com/PixelExperience/frameworks_opt_telephony/blob/e16e86ee2656c8b93970b78e1e3417bad50138b7/src/java/com/android/internal/telephony/gsm/GsmMmiCode.java#L184
    Pattern.compile("((\\*|#|\\*#|\\*\\*|##)(\\d{2,3})(\\*([^*#]*)(\\*([^*#]*)(\\*([^*#]*)(\\*([^*#]*))?)?)?)?#)(.*)"),
    // https://github.com/PixelExperience/frameworks_opt_telephony/blob/e16e86ee2656c8b93970b78e1e3417bad50138b7/src/java/com/android/internal/telephony/MmiCode.java#L103
    Pattern.compile("\\*(\\d{2})(\\+{0,1})(\\d{0,})"),
    // https://github.com/PixelExperience/frameworks_opt_telephony/blob/e16e86ee2656c8b93970b78e1e3417bad50138b7/src/java/com/android/internal/telephony/GsmCdmaPhone.java#L1756
    Pattern.compile("^0*$"),
    // https://github.com/PixelExperience/frameworks_opt_telephony/blob/e16e86ee2656c8b93970b78e1e3417bad50138b7/src/java/com/android/internal/telephony/GsmCdmaPhone.java#L3571
    Pattern.compile("[,\\s]+"),
    // https://github.com/jxtxzzw/jxtxzzw.github.io/blob/2938334a362abd5da149189621c9845fd85ddfc2/data/coding/%E7%AE%97%E6%B3%95%E7%AB%9E%E8%B5%9B/ACM/2017%E6%9A%91%E5%81%87%E5%A4%9A%E6%A0%A1%E8%AE%AD%E7%BB%83%E8%B5%9B/2017%20Multi-University%20Training%20Contest%20-%20Team%209/1010.java#L13
    Pattern.compile("(.\\*)\\1{1,}"),
    // https://github.com/chloer-nico/WeatherForecast/blob/4d8dd5caf1f9795b666dee8d9c7f7fecdea46afd/app/src/main/java/com/example/weatherforecast/MainActivity.java#L82
    Pattern.compile("[0-9]{6}"),
    // https://github.com/ilpersi/BHBot/blob/e25c554caab1a783b6e15f7e19342f47af81ebb9/src/main/java/com/github/ilpersi/BHBot/DungeonThread.java#L39
    Pattern.compile("z(?<zone>\\d{1,2})d(?<dungeon>[1234])", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE),
    // https://github.com/xlate/property-inject/blob/c0cc4b94d7a6da928728bc7ddcc8391c3715c459/src/main/java/io/xlate/inject/PropertyFactory.java#L189
    Pattern.compile("\\$\\{env\\.([_a-zA-Z0-9]+)\\}"),
    // https://github.com/aerophobic/nlp-biographies/blob/238c690f4b3810e57445842c744471a6defb8aac/src/main/java/ch/zhaw/activities/Main.java#L209
    Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.COMMENTS|Pattern.MULTILINE),
    // https://github.com/mrdjun/fun-generator/blob/a9815a40ea29b4aa7ad1ff38f18f488b49034c30/generator/src/main/java/com/fun/generator/utils/TableParseUtil.java#L82
    Pattern.compile("\\ COMMENT '(.*?)\\'"),
    // https://github.com/mrdjun/fun-generator/blob/a9815a40ea29b4aa7ad1ff38f18f488b49034c30/generator/src/main/java/com/fun/generator/utils/TableParseUtil.java#L85
    Pattern.compile("\\ COMMENT '|\\'"),
    // https://github.com/mrdjun/fun-generator/blob/a9815a40ea29b4aa7ad1ff38f18f488b49034c30/generator/src/main/java/com/fun/generator/utils/TableParseUtil.java#L95
    Pattern.compile("[\\s]*PRIMARY KEY .*(\\),|\\))"),
    // https://github.com/mrdjun/fun-generator/blob/a9815a40ea29b4aa7ad1ff38f18f488b49034c30/generator/src/main/java/com/fun/generator/utils/TableParseUtil.java#L96
    Pattern.compile("[\\s]*UNIQUE KEY .*(\\),|\\))"),
    // https://github.com/mrdjun/fun-generator/blob/a9815a40ea29b4aa7ad1ff38f18f488b49034c30/generator/src/main/java/com/fun/generator/utils/TableParseUtil.java#L97
    Pattern.compile("[\\s]*KEY .*(\\),|\\))"),
    // https://github.com/Pin-Chyan/fixme/blob/7eb0590f080b8dc838114c40b692cfd1bc5bc432/broker/src/main/java/com/endlesshorizon/broker/Broker.java#L171
    Pattern.compile("(\\d{6})"),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L362
    Pattern.compile("[\u4E00-\u9FA5]"),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L376
    Pattern.compile("amp;"),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L378
    Pattern.compile("<(span)?\\sstyle.*?style>|(span)?\\sstyle=.*?>", Pattern.DOTALL),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L382
    Pattern.compile("(<[^>]+>)", Pattern.DOTALL),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L386
    Pattern.compile("(((http|https|ftp)(\\s)*((\\:)|：))(\\s)*(//|//)(\\s)*)?([\\sa-zA-Z0-9(\\.|．)(\\s)*\\-]+((\\:)|(:)[\\sa-zA-Z0-9(\\.|．)&%\\$\\-]+)*@(\\s)*)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])(\\.|．)(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)(\\.|．)(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)(\\.|．)(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([\\sa-zA-Z0-9\\-]+(\\.|．)(\\s)*)*[\\sa-zA-Z0-9\\-]+(\\.|．)(\\s)*[\\sa-zA-Z]*)((\\s)*(\\:)|(：)(\\s)*[0-9]+)?(/(\\s)*[^/][\\sa-zA-Z0-9\\.\\,\\?\\'\\\\/\\+&%\\$\\=~_\\-@]*)*", Pattern.DOTALL),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L399
    Pattern.compile("(if[\\s]*\\(|else|elseif[\\s]*\\().*?;"),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L401
    Pattern.compile("(&[^;]+;)", Pattern.DOTALL),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L406
    Pattern.compile("　"),
    // https://github.com/mygithub-xu/blog/blob/2f4a3c4823953b1bfc7dc978d72687269fe686c3/java/src/main/java/com/dhlg/utils/common/StringUtils.java#L404
    Pattern.compile("[\\pP‘’“”]"),
    // https://github.com/baron2020/Android/blob/fadd332524ea7bd39987d69e09c1f6cca7851dfb/%E9%9B%BB%E5%8D%93/code/MainActivity.java#L204
    Pattern.compile("([^0-9])"),
    // https://github.com/steventouba/TheBakeShop/blob/254191ad92d942ab0155cc9b17bb6dae2c4230f3/src/main/java/com/steven/willysbakeshop/util/annotations/EmailValidator.java#L12
    Pattern.compile("^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})$"),
  };
}
