package org.regex.examples;

import java.util.regex.Pattern;

@SuppressWarnings({"java:S103", "java:S104", "java:S1118", "java:S1120", "java:S1228", "java:S1309", "java:S1451", "java:S2386", "java:S4784", "java:S5843"})
public class RegexDatabase1 {
  public static final Pattern[] PATTERNS = {
    // https://github.com/androidx/androidx/blob/15b24a26ca155b7d0dc4cc3f74fc62f85142472d/exifinterface/exifinterface/src/main/java/androidx/exifinterface/media/ExifInterface.java#L3914
    Pattern.compile(".*[1-9].*"),
    // https://github.com/androidx/androidx/blob/15b24a26ca155b7d0dc4cc3f74fc62f85142472d/exifinterface/exifinterface/src/main/java/androidx/exifinterface/media/ExifInterface.java#L3917
    Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$"),
    // https://github.com/androidx/androidx/blob/15b24a26ca155b7d0dc4cc3f74fc62f85142472d/exifinterface/exifinterface/src/main/java/androidx/exifinterface/media/ExifInterface.java#L3920
    Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"),
    // https://github.com/androidx/androidx/blob/15b24a26ca155b7d0dc4cc3f74fc62f85142472d/exifinterface/exifinterface/src/main/java/androidx/exifinterface/media/ExifInterface.java#L3923
    Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"),
    // https://github.com/androidx/androidx/blob/15b24a26ca155b7d0dc4cc3f74fc62f85142472d/exifinterface/exifinterface/src/main/java/androidx/exifinterface/media/ExifInterface.java#L4241
    Pattern.compile("-"),
    // https://github.com/wuweiwei112345/CS401-project/blob/03b1ed85a4012f33c483da840867b135aa52062b/src/com/pro/application/MainApplication.java#L573
    Pattern.compile("[0-9]|[0-9]\\d+"),
    // https://github.com/yeshouyi-pd/pdwx/blob/17369657e63dc7968b03121b6f14e0dadfcc1eed/generator/src/main/java/com/pd/generator/util/DbUtil.java#L115
    Pattern.compile("_(\\w)"),
    // https://github.com/kazuokoko/DUAN1/blob/28ecc5abcc8af9eabde0dc1684e8e77dda315b7c/DA1/code/QLNXK/src/Helper/Helper.java#L52
    Pattern.compile("\\p{InCombiningDiacriticalMarks}+"),
    // https://github.com/kazuokoko/DUAN1/blob/28ecc5abcc8af9eabde0dc1684e8e77dda315b7c/DA1/code/QLNXK/src/Helper/Helper.java#L53
    Pattern.compile("Đ"),
    // https://github.com/SuspiciousActivity/ByteEdit/blob/d8096a4ec545b9cf13f0015611c4cada6066d26b/src/me/ByteEdit/main/Main.java#L121
    Pattern.compile("/"),
    // https://github.com/SuspiciousActivity/ByteEdit/blob/d8096a4ec545b9cf13f0015611c4cada6066d26b/src/me/ByteEdit/main/Main.java#L683
    Pattern.compile("^\t\t(?!//|\t+).+ .+"),
    // https://github.com/SuspiciousActivity/ByteEdit/blob/d8096a4ec545b9cf13f0015611c4cada6066d26b/src/me/ByteEdit/main/Main.java#L752
    Pattern.compile("^\t(?:[a-z]+ |0x[0-9a-fA-F]+ )*?(\\[*(?:V|Z|C|B|S|I|F|J|D|L.+?;)) ([^ ]+) ?.*"),
    // https://github.com/SuspiciousActivity/ByteEdit/blob/d8096a4ec545b9cf13f0015611c4cada6066d26b/src/me/ByteEdit/main/Main.java#L754
    Pattern.compile("^\t(?:[a-z]+ |0x[0-9a-fA-F]+ )*?([^ ]+) (\\((?:\\[*(?:V|Z|C|B|S|I|F|J|D|L.+?;))*\\)[^ ]+) .*\\{"),
    // https://github.com/SuspiciousActivity/ByteEdit/blob/d8096a4ec545b9cf13f0015611c4cada6066d26b/src/me/ByteEdit/edit/Assembler.java#L56
    Pattern.compile(" "),
    // https://github.com/primefaces/primefaces/blob/7fbeac7162934f24c397d9d58d38c08c994e7ced/src/main/java/org/primefaces/component/datatable/DataTable.java#L188
    Pattern.compile("^#\\{\\w+\\[(.+)]}$"),
    // https://github.com/markuskreth/clubhelper_backend_model/blob/f57600e7aa3cb4ca40bcf5850f7259913225c9e1/src/main/java/de/kreth/clubhelper/model/utils/EmailUtils.java#L8
    Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"),
    // https://github.com/KSzostko/JavaQuiz/blob/352f67846f3bba68770b89aae9cbf0285cc3abe2/src/com/company/TextView.java#L92
    Pattern.compile("[a-zA-Z]+[0-9]*"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L84
    Pattern.compile("(?i).+/photo/\\d+"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L85
    Pattern.compile("(?i).+/(embed)?gif/\\d+"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L500
    Pattern.compile("(?s)(playerObjList.+)"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L590
    Pattern.compile("^\\s*?(var.*?var qualityItems_[\\d]* =.*?)$", Pattern.MULTILINE),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L641
    Pattern.compile("( |\"|\\+)"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L1096
    Pattern.compile("(?i).+/embed/.+"),
    // https://github.com/mirror/jdownloader/blob/7e38a14ea3b87b42fb137dfbbbf0bcc10c0dee1f/src/jd/plugins/hoster/PornHubCom.java#L1163
    Pattern.compile("(/\\*.*?\\*/)"),
    // https://github.com/line/armeria/blob/2fce5d5b04743203ae5a63863c2c51f8585a3103/testing-internal/src/main/java/com/linecorp/armeria/internal/testing/webapp/WebAppContainerTest.java#L59
    Pattern.compile("[\\r\\n]"),
    // https://github.com/line/armeria/blob/33880cea58ea94bd8e0451fdcf2b53440a0cfbd7/spring/boot2-webflux-autoconfigure/src/main/java/com/linecorp/armeria/spring/web/reactive/AbstractServerHttpRequest.java#L65
    Pattern.compile("([^&=]+)(=?)([^&]+)?"),
    // https://github.com/odoepner/tippotle/blob/9e987eaddd7fe3f8d71f210c009575db001804bc/tippotle-impl/src/main/java/org/oldo/util/WordsOnly.java#L13
    Pattern.compile("\\s+"),
    // https://github.com/odoepner/tippotle/blob/9e987eaddd7fe3f8d71f210c009575db001804bc/tippotle-impl/src/main/java/org/oldo/util/WordsOnly.java#L14
    Pattern.compile("\\W"),
    // https://github.com/odoepner/tippotle/blob/9e987eaddd7fe3f8d71f210c009575db001804bc/tippotle-impl/src/main/java/org/oldo/resources/FileDownload.java#L24
    Pattern.compile("_"),
    // https://github.com/joaocmlima/gameNews/blob/333701315fcaf4f115b49041c6618bfc0037cda5/platforms/android/CordovaLib/src/org/apache/cordova/Whitelist.java#L123
    Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L47
    Pattern.compile("<!--(.*?)-->", Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L48
    Pattern.compile("^!--(.*)--$", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L49
    Pattern.compile("<(.*?)>", Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L50
    Pattern.compile("^/([a-z0-9]+)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L51
    Pattern.compile("^([a-z0-9]+)(.*?)(/?)$", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L52
    Pattern.compile("([a-z0-9]+)=([\"'])(.*?)\\2", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L53
    Pattern.compile("([a-z0-9]+)(=)([^\"\\s']+)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L54
    Pattern.compile("^([^:]+):", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L55
    Pattern.compile("&#(\\d+);?"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L56
    Pattern.compile("&#x([0-9a-f]+);?"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L57
    Pattern.compile("%([0-9a-f]{2});?"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L58
    Pattern.compile("&([^&;]*)(?=(;|&|$))"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L59
    Pattern.compile("(>|^)([^<]+?)(<|$)", Pattern.DOTALL),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L60
    Pattern.compile("^>"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L61
    Pattern.compile("<([^>]*?)(?=<|$)"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L62
    Pattern.compile("(^|>)([^<]*?)(?=>)"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L65
    Pattern.compile("&"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L66
    Pattern.compile("<"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L68
    Pattern.compile(">"),
    // https://github.com/yzgjssz/gulimall-complete/blob/a054781f4cbad1edabec98f784cb4c594ad8cd67/renren-fast/src/main/java/io/renren/common/xss/HTMLFilter.java#L69
    Pattern.compile("<>"),
    // https://github.com/qtqa/gerrit/blob/b442f2c399d33e8d3e50d09e88847f3d18be22b6/java/com/google/gerrit/httpd/restapi/RestApiServlet.java#L224
    Pattern.compile("[ ,;][ ,;]*"),
    // https://github.com/Uriel-OC/Directorio/blob/e2ac2351836d21048ce1359bf6b4b3e8b5f3a84e/Directorio.java#L350
    Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"),
    // https://github.com/Uriel-OC/Directorio/blob/e2ac2351836d21048ce1359bf6b4b3e8b5f3a84e/Directorio.java#L388
    Pattern.compile("^@.*"),
    // https://github.com/Uriel-OC/Directorio/blob/e2ac2351836d21048ce1359bf6b4b3e8b5f3a84e/Directorio.java#L518
    Pattern.compile("^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$"),
    // https://github.com/MWGuy/VGit/blob/f29321e9546aa607f8510e64798790aedb496fde/backend-impl/src/main/java/com/mwguy/vgit/VGitRegex.java#L6
    Pattern.compile("^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$"),
    // https://github.com/abfahr/efa220oh/blob/bf882c8cc2885458df010da268157f7bf3cfc0ee/src/de/nmichael/efa/data/PersonRecord.java#L93
    Pattern.compile("(.+) \\(([^\\(\\)]+)\\)"),
    // https://github.com/abfahr/efa220oh/blob/bf882c8cc2885458df010da268157f7bf3cfc0ee/src/de/nmichael/efa/data/PersonRecord.java#L1064
    Pattern.compile("@"),
    // https://github.com/Actelion/openchemlib/blob/46fc14320023e58a1275c91ae9df1dba645fcc7f/src/main/java/com/actelion/research/util/StringFunctions.java#L446
    Pattern.compile("[0-9a-zA-Z ]"),
    // https://github.com/lixiang2114/EmqxSource/blob/439d386d5c8a338b03cd40db58828cf778f93199/src/main/java/com/github/lixiang2114/flume/plugin/emqx/EmqxSource.java#L105
    Pattern.compile(":"),
    // https://github.com/lixiang2114/EmqxSource/blob/439d386d5c8a338b03cd40db58828cf778f93199/src/main/java/com/github/lixiang2114/flume/plugin/emqx/EmqxSource.java#L110
    Pattern.compile(","),
    // https://github.com/lixiang2114/EmqxSource/blob/439d386d5c8a338b03cd40db58828cf778f93199/src/main/java/com/github/lixiang2114/flume/plugin/emqx/EmqxSource.java#L115
    Pattern.compile("^[0-9]+$"),
    // https://github.com/lixiang2114/EmqxSource/blob/439d386d5c8a338b03cd40db58828cf778f93199/src/main/java/com/github/lixiang2114/flume/plugin/emqx/EmqxSource.java#L120
    Pattern.compile("^\\d+\\.\\d+\\.\\d+\\.\\d+$"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/test/java/com/mysql/cj/protocol/a/DebugBufferingPacketSenderTest.java#L64
    Pattern.compile("Packet payload:.*00 01 02 03 04 05 06 07", Pattern.DOTALL),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L89
    Pattern.compile("(?<scheme>[\\w\\+:%]+)\\s*(?://(?<authority>[^/?#]*))?\\s*(?:/(?!\\s*/)(?<path>[^?#]*))?(?:\\?(?!\\s*\\?)(?<query>[^#]*))?(?:\\s*#(?<fragment>.*))?"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L94
    Pattern.compile("(?<scheme>[\\w\\+:%]+).*"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L95
    Pattern.compile("^\\[(?<hosts>.*)\\]$"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L96
    Pattern.compile("^(?<host>.*?)(?::(?<port>[^:]*))?$"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L97
    Pattern.compile("[,\\s]*(?<key>[\\w\\.\\-\\s%]*)(?:=(?<value>[^,]*))?"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L98
    Pattern.compile("\\s*\\(\\s*(?<key>[\\w\\.\\-%]+)?\\s*(?:=(?<value>[^)]*))?\\)\\s*"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L99
    Pattern.compile("[&\\s]*(?<key>[\\w\\.\\-\\s%]*)(?:=(?<value>[^&]*))?"),
    // https://github.com/arnaumw/M03UF6_ArnauGarcia/blob/abeefb4060bec27fbea6d83af2857acf46d0d633/lib/mysql-connector-java-8.0.21/src/main/core-api/java/com/mysql/cj/conf/ConnectionUrlParser.java#L359
    Pattern.compile("(?i)^[\\dabcdef:]+$"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/SlashdotPolicy.java#L45
    Pattern.compile("[a-zA-Z]{2,20}"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L43
    Pattern.compile("(?:aqua|black|blue|fuchsia|gray|grey|green|lime|maroon|navy|olive|purple|red|silver|teal|white|yellow)"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L48
    Pattern.compile("(?:#(?:[0-9a-fA-F]{3}(?:[0-9a-fA-F]{3})?))"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L51
    Pattern.compile("[0-9]+%?"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L53
    Pattern.compile("(?:[\\p{L}\\p{N},'\\.\\s\\-_\\(\\)]|&[0-9]{2};)*"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L55
    Pattern.compile("[a-zA-Z0-9\\:\\-_\\.]+"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L58
    Pattern.compile("[\\p{L}\\p{N}\\s\\-_',:\\[\\]!\\./\\\\\\(\\)&]*"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L60
    Pattern.compile("[a-zA-Z0-9\\s,\\-_]+"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L63
    Pattern.compile("(?:[\\p{L}\\p{N}\\\\\\.\\#@\\$%\\+&;\\-_~,\\?=/!]+|\\#(\\w)+)"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L65
    Pattern.compile("\\s*(?:(?:ht|f)tps?://|mailto:)[\\p{L}\\p{N}][\\p{L}\\p{N}\\p{Zs}\\.\\#@\\$%\\+&;:\\-_~,\\?=/!\\(\\)]*+\\s*"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L69
    Pattern.compile("[+-]?(?:(?:[0-9]+(?:\\.[0-9]*)?)|\\.[0-9]+)"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L71
    Pattern.compile("[a-zA-Z0-9\\-_\\$]+"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L74
    Pattern.compile("(?i)center|left|right|justify|char"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L77
    Pattern.compile("(?i)baseline|bottom|middle|top"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L86
    Pattern.compile("(?:javascript:)?\\Qhistory.go(-1)\\E"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L89
    Pattern.compile(".?", Pattern.DOTALL),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L116
    Pattern.compile("[\\w;, \\-]+"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L144
    Pattern.compile("(?i)noresize"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/stringutils/EbayPolicy.java#L155
    Pattern.compile("(?i)(?:row|col)(?:group)?"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/excelimporter/reader/readers/replication/ExcelValueParser.java#L159
    Pattern.compile("^\\d{0,6}(\\.\\d{1,})$"),
    // https://github.com/shelterbox/shelterbox_mx_lib_bbcrm_actions/blob/41f950be70c6eaeaa9f45bd855802e78b19c58b4/javasource/communitycommons/StringUtils.java#L450
    Pattern.compile("\\p{M}"),
    // https://github.com/inkarnadin/cms-check-component/blob/452b8950011beed9081a79cdfbe664e0714e3a72/src/main/java/web/cms/datalife/DataLifeVersionProcessor.java#L51
    Pattern.compile("Актуальная версия скрипта: (.*)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L434
    Pattern.compile("([-]?[ ]?[0-9]*\\.?[0-9]+)[ ]?(e|x10)[ ]?([-|\\+]?[ ]?[0-9]+)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L438
    Pattern.compile("\\s"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L439
    Pattern.compile("\\+"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L522
    Pattern.compile("([0-9]),([0-9])"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L582
    Pattern.compile("([0-9]),([0-9]{3})"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L655
    Pattern.compile("(([a-zA-Z]+y[ ]?)?([a-zA-Z]+y[ ]?)?(in|im)?(so[l]?uble|miscible))( (in|with) )?[[ ]?\\.{3}]*"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L791
    Pattern.compile("[-]?[0-9]*\\.?[0-9]+"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L864
    Pattern.compile(".*?(ca. )?([-]?[ ]?[0-9]*\\.?[0-9]+)( ca. )([-]?[ ]?[0-9]*\\.?[0-9]+)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L904
    Pattern.compile("([-]?[ ]?[0-9]*\\.?[0-9]+)[ ]*([-]{1}|to|ca\\.)[ ]*([-]?[ ]?[0-9]*\\.?[0-9]+)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L920
    Pattern.compile(">[=]?[ ]?([-]?[ ]?[0-9]*\\.?[0-9]+)[ ]?<[=]?[ ]?([-]?[ ]?[0-9]*\\.?[0-9]+)"),
    // https://github.com/tmarti02/ghs-data-gathering/blob/e6bb46210fb23861ae6011d6c665307f0c9fdab4/src/gov/epa/exp_data_gathering/parse/Parse.java#L943
    Pattern.compile("[-]?[ ]?[0-9]*\\.?[0-9]+"),
    // https://github.com/oussamalahmidiDev/calculator-rmi-java/blob/3ebfcaf34523fe954a1c989af7b533ec13816fd9/ui/src/com/learn/Main.java#L49
    Pattern.compile("(\\d+)([+/*x\\-])(\\d+)"),
    // https://github.com/artipie/management-api/blob/8c322cdac002fa2f078d7696a5b48711d6869eb5/src/main/java/com/artipie/management/api/ApiRepoUpdateSlice.java#L65
    Pattern.compile("/api/repos/(?<user>[^/.]+)"),
    // https://github.com/AnvilPowered/Anvil/blob/107f9fa1da1d5e0f3a133302c129a509601eb80d/anvil-common/src/main/java/org/anvilpowered/anvil/common/util/CommonTextService.java#L77
    Pattern.compile("&[0-9a-fklmnor]"),
    // https://github.com/AnvilPowered/Anvil/blob/107f9fa1da1d5e0f3a133302c129a509601eb80d/anvil-common/src/main/java/org/anvilpowered/anvil/common/util/CommonTextService.java#L80
    Pattern.compile("\r\n|\r|\n"),
    // https://github.com/dbojaxhiu1/medRegister/blob/714f9831f561bf4a919e6ac742eb93ebc376c5a2/app/src/main/java/com/example/medregister/SignUpActivity.java#L34
    Pattern.compile("^[A-Za-z0-9+_.-]+@gmail\\.com$"),
    // https://github.com/dbojaxhiu1/medRegister/blob/714f9831f561bf4a919e6ac742eb93ebc376c5a2/app/src/main/java/com/example/medregister/SignUpActivity.java#L35
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"),
    // https://github.com/vanalex/streams-test/blob/76d7a4e5a97a5762d46b08025c67f90830b1e5cd/src/test/java/com/examples/streams/StreamexTest.java#L34
    Pattern.compile("b", Pattern.CASE_INSENSITIVE),
    // https://github.com/mottaghi7/Password/blob/ef1d1fbbdff8f336f198eadb90dac77ded1561ab/src/main/java/com/example/password/MainActivity.java#L44
    Pattern.compile("[A-Z]"),
    // https://github.com/mottaghi7/Password/blob/ef1d1fbbdff8f336f198eadb90dac77ded1561ab/src/main/java/com/example/password/MainActivity.java#L45
    Pattern.compile("[a-z]"),
    // https://github.com/mottaghi7/Password/blob/ef1d1fbbdff8f336f198eadb90dac77ded1561ab/src/main/java/com/example/password/MainActivity.java#L46
    Pattern.compile("[0-9]"),
    // https://github.com/mottaghi7/Password/blob/ef1d1fbbdff8f336f198eadb90dac77ded1561ab/src/main/java/com/example/password/MainActivity.java#L47
    Pattern.compile("[!\"#$%&'()*+,-./:;<=>?@^_`{|}~]"),
    // https://github.com/SEEDtk/threonine/blob/e837b7906e0a49df2f63fce2bec768c578b13ec5/src/main/java/org/theseed/threonine/SampleId.java#L66
    Pattern.compile("(\\d+)([Dd]\\S+)?(?:\\s+(p\\S+))?(?:\\s+\\+(\\S+))?"),
    // https://github.com/bhecquet/seleniumRobot/blob/a03ae24d41140644256483ec9d0869628661bf98/core/src/main/java/com/seleniumtests/uipage/htmlelements/HtmlElement.java#L1301
    Pattern.compile(".*(http://.*?)'\"?.*"),
    // https://github.com/bhecquet/seleniumRobot/blob/a03ae24d41140644256483ec9d0869628661bf98/core/src/main/java/com/seleniumtests/uipage/htmlelements/HtmlElement.java#L1307
    Pattern.compile(".*(http://.*?)\"'?.*"),
    // https://github.com/bhecquet/seleniumRobot/blob/a03ae24d41140644256483ec9d0869628661bf98/core/src/main/java/com/seleniumtests/uipage/htmlelements/HtmlElement.java#L1313
    Pattern.compile(".*(http://.*)"),
    // https://github.com/JabRef/jabref/blob/b19c3e4700f82d90a804a5cf3467aedf00385dad/src/main/java/org/jabref/logic/crawler/StudyRepository.java#L54
    Pattern.compile("[^A-Za-z0-9_.\\s=-]"),
    // https://github.com/Backbase/backbase-plaid/blob/734fb7f55723e9d52df02b120f18d8475d4de34a/plaid-service/src/test/java/com/backbase/proto/plaid/service/TransactionTests.java#L14
    Pattern.compile(".+?(?=Pasvolgnr:)"),
    // https://github.com/Backbase/backbase-plaid/blob/734fb7f55723e9d52df02b120f18d8475d4de34a/plaid-service/src/test/java/com/backbase/proto/plaid/service/TransactionTests.java#L30
    Pattern.compile("(?<=Transactie:\\s)(.*?)[?:\\s]"),
    // https://github.com/GonzaloMonte/parquimetros/blob/50fcec89e79787e5527d3dfcb4a3afe139fd9757/src/parquimetros/InterfazInspector.java#L382
    Pattern.compile("[a-zA-Z]{3}[0-9]{3}"),
    // https://github.com/AClearZhang/AlgorithmSlay/blob/592e2f4395ea478e7e51c01151637ef41ce7760c/Algorithm4Edition/Algs4JAVA/src/main/java/edu/princeton/cs/algs4/StdIn.java#L225
    Pattern.compile("\\p{javaWhitespace}+"),
    // https://github.com/AClearZhang/AlgorithmSlay/blob/592e2f4395ea478e7e51c01151637ef41ce7760c/Algorithm4Edition/Algs4JAVA/src/main/java/edu/princeton/cs/algs4/StdIn.java#L228
    Pattern.compile(""),
    // https://github.com/AClearZhang/AlgorithmSlay/blob/592e2f4395ea478e7e51c01151637ef41ce7760c/Algorithm4Edition/Algs4JAVA/src/main/java/edu/princeton/cs/algs4/StdIn.java#L231
    Pattern.compile("\\A"),
    // https://github.com/YoungBreezeM/yi_admin/blob/ff06ee7250b1591a198cfc6ae6747006be91b552/spider/src/test/java/com/fw/spider/SpiderApplicationTests.java#L63
    Pattern.compile("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×:]"),
    // https://github.com/YoungBreezeM/yi_admin/blob/ff06ee7250b1591a198cfc6ae6747006be91b552/spider/src/test/java/com/fw/spider/SpiderApplicationTests.java#L182
    Pattern.compile("(?<=<script>window.__playinfo__=).*?(?=</script>)"),
    // https://github.com/xuzhouyuan/project_powder/blob/26dd31658518dfc41643a938435236238fe199ed/submissions/assignment-3/powder_client/java-client-generated/src/main/java/io/swagger/client/ApiClient.java#L585
    Pattern.compile(".*[/\\\\]"),
    // https://github.com/xuzhouyuan/project_powder/blob/26dd31658518dfc41643a938435236238fe199ed/submissions/assignment-3/powder_client/java-client-generated/src/main/java/io/swagger/client/ApiClient.java#L600
    Pattern.compile("(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"),
    // https://github.com/xuzhouyuan/project_powder/blob/26dd31658518dfc41643a938435236238fe199ed/submissions/assignment-3/powder_client/java-client-generated/src/main/java/io/swagger/client/ApiClient.java#L782
    Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?"),
    // https://github.com/xlate/jsonapi-rvp/blob/1679482e071d89c7eee56de725f2e088703fe84d/src/main/java/io/xlate/jsonapi/rvp/internal/validation/boundary/JsonApiRequestValidator.java#L508
    Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_ -]*[a-zA-Z0-9]+$"),
    // https://github.com/gawronskimATWIT/DataStructures/blob/8130f543d475651985e3ccb0a796ff5ecc33aafd/DataStructures/src/DictionaryProject/TelephoneDirectory.java#L33
    Pattern.compile("[^,]+"),
    // https://github.com/gawronskimATWIT/DataStructures/blob/8130f543d475651985e3ccb0a796ff5ecc33aafd/DataStructures/src/DictionaryProject/TelephoneDirectory.java#L39
    Pattern.compile("[^\\s]+"),
    // https://github.com/MarekRa/Route/blob/621121ce0d29ae3f80a979e8f614c4df089ecf3e/src/main/java/info/raszewski/RouteCSVParser.java#L54
    Pattern.compile("\\[([0-9\\.,\\snull]+)"),
    // https://github.com/BeDa-Iv/java-ivanova-3sem/blob/05e5b75536fe02525ad11149b1de98f79489661e/src/AssociativeArrays.java#L49
    Pattern.compile("[А-Яа-я]+"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L567
    Pattern.compile("\\\\"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L568
    Pattern.compile("\""),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L569
    Pattern.compile("\n"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L570
    Pattern.compile("\r"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L571
    Pattern.compile("\t"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L572
    Pattern.compile("\b"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L573
    Pattern.compile("\f"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L574
    Pattern.compile("\u00a0"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L657
    Pattern.compile("version=[\"']([0-9]+.[0-9]+)[\"']"),
    // https://github.com/webern/exile/blob/ce6322780276ec0bdf161ab4f4d0d8f1367e3578/testgen/xmltestgen/src/main/java/com/matthewjamesbriggs/xmltestgen/ConfTestGenerator.java#L658
    Pattern.compile("encoding=[\"'](.+)[\"']"),
    // https://github.com/pokiuwu/v203.4/blob/afe89cf8d932b4a065d8beaf9f142200dce44f9a/src/main/java/net/swordie/ms/util/Util.java#L21
    Pattern.compile("^\\$2[a-z]\\$.{56}$"),
    // https://github.com/pokiuwu/v203.4/blob/afe89cf8d932b4a065d8beaf9f142200dce44f9a/src/main/java/net/swordie/ms/util/Util.java#L205
    Pattern.compile("-?\\d+(\\.\\d+)?"),
    // https://github.com/pokiuwu/v203.4/blob/afe89cf8d932b4a065d8beaf9f142200dce44f9a/src/main/java/net/swordie/ms/util/Util.java#L389
    Pattern.compile("[a-zA-Z0-9]+"),
    // https://github.com/pokiuwu/v203.4/blob/afe89cf8d932b4a065d8beaf9f142200dce44f9a/src/main/java/net/swordie/ms/util/Util.java#L393
    Pattern.compile("[a-zA-Z0-9`~!@#$%^&*()_+-={}|\\\\;':\",./<>?]*"),
    // https://github.com/pokiuwu/v203.4/blob/afe89cf8d932b4a065d8beaf9f142200dce44f9a/src/main/java/net/swordie/ms/util/Util.java#L397
    Pattern.compile("^-?[0-9]+"),
    // https://github.com/babyboomer53/Scientific-Notation/blob/a144ebd953140165cf678917d8a4d03604eff26e/src/FunWithScientificNotation/ScientificNotation.java#L8
    Pattern.compile("^(-?\\d*)(\\.?)(\\d*)([eE])([-\\+]?)(\\d+)$"),
    // https://github.com/babyboomer53/Scientific-Notation/blob/a144ebd953140165cf678917d8a4d03604eff26e/src/FunWithScientificNotation/ScientificNotation.java#L51
    Pattern.compile("\\."),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/test/org/wikipedia/miner/util/NgramExtraction.java#L25
    Pattern.compile("\\[\\[(\\d+)\\|(.*?)\\]\\]"),
    // https://github.com/Tony-Starkus/WikiMiner/blob/0100f0e5594fc0b1f9f56f5d7d26b7f98ad505db/utils/wikipedia-miner/test/org/wikipedia/miner/util/NgramExtraction.java#L26
    Pattern.compile("\"(.*?)\""),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/8f5915e5bf854f0edddb6b4e96e41b7405e908ba/module2/src/Thi/validate/Regex.java#L8
    Pattern.compile("^([1-9]|[1-2][0-9]|(30)|(31))\\/([1-9]|(1)[0-2])\\/((19)[0-9][0-9]|(200)[0-2])$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/8f5915e5bf854f0edddb6b4e96e41b7405e908ba/module2/src/Thi/validate/Regex.java#L9
    Pattern.compile("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/8f5915e5bf854f0edddb6b4e96e41b7405e908ba/module2/src/Thi/validate/Regex.java#L10
    Pattern.compile("^(84)\\d{10}$"),
    // https://github.com/tranhung1708/c0920g1-TranQuocHung/blob/8f5915e5bf854f0edddb6b4e96e41b7405e908ba/module2/src/Thi/validate/Regex.java#L11
    Pattern.compile("^\\d{9}$"),
    // https://github.com/Azure/azure-sdk-for-java/blob/cf261c41a7dfe2eb748ca1c21b26e61a2227000f/sdk/servicebus/azure-messaging-servicebus/src/main/java/com/azure/messaging/servicebus/ServiceBusClientBuilder.java#L101
    Pattern.compile("^[^:]+:\\d+"),
    // https://github.com/condyboy/IPClass/blob/afdb8a2117b8f5b58a09a79279a5d89acb060d39/IPClass/IPClass/ipService/src/test/java/cn/cnic/security/ipservice/IpSegmentTest.java#L34
    Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}"),
    // https://github.com/condyboy/IPClass/blob/afdb8a2117b8f5b58a09a79279a5d89acb060d39/IPClass/IPClass/ipService/src/main/java/cn/cnic/security/ipservice/common/utils/IPUtils.java#L80
    Pattern.compile(".*/"),
    // https://github.com/condyboy/IPClass/blob/afdb8a2117b8f5b58a09a79279a5d89acb060d39/IPClass/IPClass/ipService/src/main/java/cn/cnic/security/ipservice/common/utils/IPUtils.java#L82
    Pattern.compile("/.*"),
    // https://github.com/06110902002/Android_Multi_DataStruct/blob/5b3debe8f46ed7d461452fc09c5b735890dbb047/app/src/main/java/com/example/liuxiaobing/statemodel/utils/FileUtils.java#L886
    Pattern.compile("[\\w]+[\\.](jpeg|jpg|png|zip|tar)"),
    // https://github.com/charliexu07/Vulnerability-Challenge/blob/937fa3c72b7c3f570c8f03b349b7c61a56fbed28/src/test/java/com/mycompany/myapp/service/MailServiceIT.java#L51
    Pattern.compile("([a-z]{2})-([a-zA-Z]{4})-([a-z]{2})"),
    // https://github.com/charliexu07/Vulnerability-Challenge/blob/937fa3c72b7c3f570c8f03b349b7c61a56fbed28/src/test/java/com/mycompany/myapp/service/MailServiceIT.java#L52
    Pattern.compile("([a-z]{2})-([a-z]{2})"),
    // https://github.com/inkarnadin/cms-check-component/blob/bf52f8c159e6d2a1909929f0dcb2a02d40e6bb18/src/main/java/web/cms/yii/YiiCheckProcessor.java#L43
    Pattern.compile("<script src=\".*(yii.js).*\"></script>"),
    // https://github.com/qq5132834/unionpay/blob/6cb5c300aa7518e9784099f8cdd71e4a815d028e/ACPSample_B2C/src/com/unionpay/acp/sdk/AcpService.java#L97
    Pattern.compile("\\s*\"sign\"\\s*:\\s*\"([^\"]*)\"\\s*"),
    // https://github.com/qq5132834/unionpay/blob/6cb5c300aa7518e9784099f8cdd71e4a815d028e/ACPSample_B2C/src/com/unionpay/acp/sdk/AcpService.java#L102
    Pattern.compile("\\s*\"data\"\\s*:\\s*\"([^\"]*)\"\\s*"),
    // https://github.com/qq5132834/unionpay/blob/6cb5c300aa7518e9784099f8cdd71e4a815d028e/ACPSample_B2C/src/com/unionpay/acp/sdk/AcpService.java#L107
    Pattern.compile("cert_id=(\\d*)"),
    // https://github.com/UCL-PPLV/QUIC/blob/48765576a47740422ffd7742ad2beb2b57205e94/tcp-adapter/Mapper/src/Mapper.java#L155
    Pattern.compile("([A-Z+]+)\\(([0-9?]+),([0-9?]+),([0-9?]+)\\)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/network/InetValidator.java#L25
    Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/network/CookieRepository.java#L175
    Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/TorrentParser.java#L28
    Pattern.compile("<td colspan=\"5\"> &nbsp; <a href=\"([^\"]+)\"[^<]+>([^<]+)</a></td>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/SignInParser.java#L27
    Pattern.compile("<p>You are now logged in as: (.+?)<"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/SignInParser.java#L29
    Pattern.compile("(?:<h4>The error returned was:</h4>\\s*<p>(.+?)</p>)|(?:<span class=\"postcolor\">(.+?)</span>)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryPageUrlParser.java#L34
    Pattern.compile("([0-9a-f]{10})/(\\d+)-(\\d+)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryPageParser.java#L27
    Pattern.compile("<img[^>]*src=\"([^\"]+)\" style"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryPageParser.java#L28
    Pattern.compile("onclick=\"return nl\\('([^\\)]+)'\\)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryPageParser.java#L29
    Pattern.compile("<a href=\"([^\"]+)fullimg.php([^\"]+)\">"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryPageParser.java#L31
    Pattern.compile("var showkey=\"([0-9a-z]+)\";"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryListParser.java#L44
    Pattern.compile("\\d+px"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryListParser.java#L45
    Pattern.compile("height:(\\d+)px;width:(\\d+)px"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryListParser.java#L46
    Pattern.compile("background-color:rgba\\((\\d+),(\\d+),(\\d+),"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryListParser.java#L47
    Pattern.compile("(\\d+) page"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryListParser.java#L48
    Pattern.compile("page=(\\d+)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailUrlParser.java#L35
    Pattern.compile("(\\d+)/([0-9a-f]{10})(?:[^0-9a-f]|$)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L60
    Pattern.compile("<div class=\"d\">\n<p>([^<]+)</p>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L61
    Pattern.compile("var gid = (\\d+);.+?var token = \"([a-f0-9]+)\";.+?var apiuid = ([\\-\\d]+);.+?var apikey = \"([a-f0-9]+)\";", Pattern.DOTALL),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L62
    Pattern.compile("<a[^<>]*onclick=\"return popUp\\('([^']+)'[^)]+\\)\">Torrent Download \\( (\\d+) \\)</a>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L63
    Pattern.compile("<a[^<>]*onclick=\"return popUp\\('([^']+)'[^)]+\\)\">Archive Download</a>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L64
    Pattern.compile("width:(\\d+)px; height:(\\d+)px.+?url\\((.+?)\\)"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L65
    Pattern.compile("<tr><td[^<>]+>([\\w\\s]+):</td><td>(?:<div[^<>]+><a[^<>]+>[\\w\\s]+</a></div>)+</td></tr>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L66
    Pattern.compile("<div[^<>]+><a[^<>]+>([\\w\\s]+)</a></div>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L67
    Pattern.compile("<div class=\"c3\">Posted on ([^<>]+) by: &nbsp; <a[^<>]+>([^<>]+)</a>.+?<div class=\"c6\"[^>]*>(.+?)</div><div class=\"c[78]\""),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L68
    Pattern.compile("<tr><td[^<>]*>Length:</td><td[^<>]*>([\\d,]+) pages</td></tr>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L69
    Pattern.compile("<td[^>]+><a[^>]+>([\\d,]+)</a></td><td[^>]+>(?:<a[^>]+>)?&gt;(?:</a>)?</td>"),
    // https://github.com/ryoii/EhViewer/blob/c6b1ef28d1f7cddf99854b64e3713bc28a55a053/app/src/main/java/com/hippo/ehviewer/client/parser/GalleryDetailParser.java#L71
    Pattern.compile("<div class=\"gdtl\".+?<a href=\"(.+?)\"><img alt=\"([\\d,]+)\".+?src=\"(.+?)\""),
    // https://github.com/confluentinc/ksql/blob/6c7a4381b1ad389fd8ab6955ca792fc0b1b3f60f/ksqldb-cli/src/test/java/io/confluent/ksql/cli/CliTest.java#L132
    Pattern.compile("query with ID (\\S+)"),
    // https://github.com/confluentinc/ksql/blob/6c7a4381b1ad389fd8ab6955ca792fc0b1b3f60f/ksqldb-cli/src/test/java/io/confluent/ksql/cli/CliTest.java#L135
    Pattern.compile(".*The following queries write into this source: \\[(.+)].*", Pattern.DOTALL),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L77
    Pattern.compile("^[\t ]*negative:"),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L78
    Pattern.compile("^[\t ]*type: "),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L85
    Pattern.compile("flags: \\[((?:(?:, )?(?:\\w+))*)\\]"),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L86
    Pattern.compile("includes: \\[(.*)\\]"),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L87
    Pattern.compile("features: \\[(.*)\\]"),
    // https://github.com/graalvm/graaljs/blob/fb5dc28b8cbc0327a9a01577ec97fd98ba855884/graal-js/src/com.oracle.truffle.js.test.external/src/com/oracle/truffle/js/test/external/test262/Test262Runnable.java#L88
    Pattern.compile(",\\s*"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/servlets/BasePathServlet.java#L17
    Pattern.compile("(-?)([^:/]*):([^:/]*)/(.*)"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/negotiation/PubbyNegotiator.java#L21
    Pattern.compile("MSIE"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/negotiation/MediaRangeSpec.java#L17
    Pattern.compile("[\\x20-\\x7E&&[^()<>@,;:\\\"/\\[\\]?={} ]]+"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/negotiation/MediaRangeSpec.java#L22
    Pattern.compile("(?:0(?:\\.\\d{0,3})?|1(?:\\.0{0,3})?)"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/negotiation/MediaRangeSpec.java#L97
    Pattern.compile("\\\\(.)"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/negotiation/MediaRangeSpec.java#L101
    Pattern.compile("[\\\\\"]"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/Dataset.java#L53
    Pattern.compile(".*"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/Dataset.java#L353
    Pattern.compile("\\?"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/Dataset.java#L353
    Pattern.compile("#"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/Dataset.java#L357
    Pattern.compile("%3F"),
    // https://github.com/fazleh2010/GrammarAsService/blob/7f224ba8e1cb3a27a142661fe585324eba386de2/server/pubby/src/de/fuberlin/wiwiss/pubby/Dataset.java#L357
    Pattern.compile("%23"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/pipe/modules/queryresult/TextFileResultWrapper.java#L241
    Pattern.compile("\\s*\\S+\\s+\\S+"),
    // https://github.com/azumio/foodlens-sdk-android-public/blob/e0314c5cf5693c99ffe17f174b026162c044079b/src/main/java/com/azumio/android/foodlenslibrary/utils/TextUtils.java#L69
    Pattern.compile("\\s+[a-z]"),
    // https://github.com/smackem/ylangfx/blob/812ec130171885a7d428a73470f73dd6d4b1e59a/ylangfx-core/src/main/java/net/smackem/ylang/lang/Preprocessor.java#L16
    Pattern.compile("^#include \"(.+)\"$"),
    // https://github.com/zerosoft/CodeBroker/blob/00d2d250c5c9f0cb608d279f0fe28aef18faa645/CodeBroker/src/main/java/com/codebroker/util/zookeeper/ZookeeperURL.java#L9
    Pattern.compile("127(\\.\\d{1,3}){3}$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/lib/src/main/java/com/alphawallet/token/util/DateTimeFactory.java#L48
    Pattern.compile("(\\+\\d{4}|\\-\\d{4})"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/lib/src/main/java/com/alphawallet/token/entity/TSSelection.java#L27
    Pattern.compile("[$][{](\\w*)[}]$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/lib/src/main/java/com/alphawallet/token/entity/EventDefinition.java#L31
    Pattern.compile("\\$\\{([^}]+)\\}"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3j/StructuredDataEncoder.java#L54
    Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)((\\[([1-9]\\d*)?\\])+)$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3j/StructuredDataEncoder.java#L57
    Pattern.compile("^bytes[0-9][0-9]?$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3j/StructuredDataEncoder.java#L63
    Pattern.compile("\\[([1-9]\\d*)?\\]"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3j/StructuredDataEncoder.java#L68
    Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*(\\[([1-9]\\d*)*\\])*$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3j/StructuredDataEncoder.java#L71
    Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3/JsInjectorClient.java#L238
    Pattern.compile("^.*(?=;)"),
    // https://github.com/BitFlexFinTech/BitFlexWallet/blob/fd716015c3246b8cde1c00b74a7765c90191eaee/app/src/main/java/com/alphawallet/app/web3/JsInjectorClient.java#L246
    Pattern.compile("charset=([a-zA-Z0-9-]+)"),
    // https://github.com/kidozh/DiscuzHub/blob/cd7a41feb668c39905ecc8c8d420d8f5d4cebb0e/app/src/main/java/com/kidozh/discuzhub/adapter/PostAdapter.java#L217
    Pattern.compile("^<div class=\"reply_wrap\">(.+?)</div><br .>", Pattern.DOTALL),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StringUtils.java#L48
    Pattern.compile("^([\u4e00-\u9fa5]|[a-z]|[A-Z]){2,}$"),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StringUtils.java#L58
    Pattern.compile("^([\u4e00-\u9fa5]|[a-zA-Z])+$"),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StringUtils.java#L71
    Pattern.compile("^[1][0-9]{10}$"),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StringUtils.java#L85
    Pattern.compile("^[0-9]*$"),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StringUtils.java#L233
    Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StatusBarUtils.java#L198
    Pattern.compile("Flyme OS [4|5]", Pattern.CASE_INSENSITIVE),
    // https://github.com/AylongYang/yaofubase/blob/e80c3dda7b4a985359c0a59c3eb58484e2828f34/yaofubase/src/main/java/com/yaofu/basesdk/utils/StatusBarUtils.java#L207
    Pattern.compile("[vV]"),
    // https://github.com/yanhangren/javathelarva/blob/f3954fff2dc8b06378b3b976102580b82cb19fd4/proj2d/bearmaps/proj2d/Router.java#L113
    Pattern.compile("([a-zA-Z\\s]+) on ([\\w\\s]*) and continue for ([0-9\\.]+) miles\\."),
    // https://github.com/azwgit/azw/blob/525fee4e5e7fe51601b18bda92d478812cea5383/app/src/main/java/com/example/bq/edmp/utils/StringUtils.java#L23
    Pattern.compile("^1(3|5|7|8|4)\\d{9}"),
    // https://github.com/azwgit/azw/blob/525fee4e5e7fe51601b18bda92d478812cea5383/app/src/main/java/com/example/bq/edmp/utils/StringUtils.java#L35
    Pattern.compile(".{6,20}"),
    // https://github.com/azwgit/azw/blob/525fee4e5e7fe51601b18bda92d478812cea5383/app/src/main/java/com/example/bq/edmp/utils/StringUtils.java#L88
    Pattern.compile("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$"),
    // https://github.com/azwgit/azw/blob/525fee4e5e7fe51601b18bda92d478812cea5383/app/src/main/java/com/example/bq/edmp/utils/StringUtils.java#L100
    Pattern.compile("^0(10|2[0-5789]-|\\d{3})-?\\d{7,8}$"),
    // https://github.com/azwgit/azw/blob/525fee4e5e7fe51601b18bda92d478812cea5383/app/src/main/java/com/example/bq/edmp/utils/StringUtils.java#L111
    Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"),
    // https://github.com/ZhuoSir/common/blob/9dc8c475d31e90c0c94a7713575da17ade6e70e9/src/main/java/com/chen/utils/StringUtils.java#L65
    Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$"),
    // https://github.com/ZhuoSir/common/blob/9dc8c475d31e90c0c94a7713575da17ade6e70e9/src/main/java/com/chen/utils/StringUtils.java#L76
    Pattern.compile("^[\\u4e00-\\u9fa5]*$"),
    // https://github.com/ZhuoSir/common/blob/9dc8c475d31e90c0c94a7713575da17ade6e70e9/src/main/java/com/chen/utils/StringUtils.java#L115
    Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+"),
    // https://github.com/ZhuoSir/common/blob/9dc8c475d31e90c0c94a7713575da17ade6e70e9/src/main/java/com/chen/utils/StringUtils.java#L126
    Pattern.compile("^1[3|4|5|7|8][0-9]{9}$"),
    // https://github.com/wizzdi/wizzdi-setup/blob/a90a1a5d5fe4e707671ffd1e462be859d99fb910/src/main/java/com/flexicore/installer/model/InstallationTask.java#L210
    Pattern.compile("[^\\d.]"),
    // https://github.com/madrackwp/CZ2002-Project/blob/081905f90a8ba2f7559622b787a479d206c03e54/StaffDuties/StaffCreateCourseCtrl.java#L37
    Pattern.compile("(0[8-9]|1[0-9]|2[0-3]):30"),
    // https://github.com/Vikash313/flash/blob/1cff73353e92004b968d301b9b268d3d92fbf6f0/test/src/test/RegExDemo.java#L8
    Pattern.compile("a?"),
    // https://github.com/gbques2827/learnNote/blob/0dc93677f02337872b4750dc69d984f6ed9794b1/mall-tiny-07/src/main/java/com/gbques/ly/malltiny01/utils/FormUtils.java#L18
    Pattern.compile("^[1][3,4,5,7,8,9][0-9]{9}$"),
    // https://github.com/sxlvxh/LvxhDoc/blob/33b79c7d454f7cb19aa0563a77f35977520ab22d/plat/utils/hwPush/src/main/java/com/geesanke/plugin/huawei/push/util/CommonUtils.java#L182
    Pattern.compile("\\s*|\t*|\r*|\n*"),
    // https://github.com/sxlvxh/LvxhDoc/blob/33b79c7d454f7cb19aa0563a77f35977520ab22d/plat/utils/hwPush/src/main/java/com/geesanke/plugin/huawei/push/util/CommonUtils.java#L185
    Pattern.compile("}"),
    // https://github.com/daimaou69/OldStuffMarket/blob/ef2ce440c4e5b6be592d68bf892cafaff01e0f0e/app/src/main/java/com/example/oldstuffmarket/RegistrationActivity.java#L45
    Pattern.compile("^[a-z0-9]{3,8}$"),
    // https://github.com/mtsafe/Project-Euler/blob/cd35cf6dc4f659d8bde7ad7330b4a05ea37c6ec9/src/Number_4.java#L54
    Pattern.compile("(\\d)(\\d)(\\d)(\\3)(\\2)(\\1)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/util/EndpointUtil.java#L23
    Pattern.compile("(opc.tcp|http|https|opc.http|opc.https|opc.ws|opc.wss)://([^:/]+)(:\\d+)?(/.*)?"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L311
    Pattern.compile("ns=(\\d*);i=(\\d*)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L313
    Pattern.compile("i=(\\d*)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L315
    Pattern.compile("ns=(\\d*);s=(.*)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L317
    Pattern.compile("s=(.*)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L320
    Pattern.compile("ns=(\\d*);g=([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L323
    Pattern.compile("g=([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L325
    Pattern.compile("ns=(\\d*);b=([0-9a-zA-Z+/=]*)"),
    // https://github.com/wangyongxiao/ipc-milo/blob/a51153660659c5c4ee9180d78b338586c4f0780c/opc-ua-stack/stack-core/src/main/java/org/eclipse/milo/opcua/stack/core/types/builtin/NodeId.java#L327
    Pattern.compile("b=([0-9a-zA-Z+/=]*)"),
    // https://github.com/dhiddiSk/logicalProblems/blob/2df07b722922706734d18d49bcff4a9089375dbb/java/src/main/java/DaySeventeen.java#L78
    Pattern.compile("(?<!sub)subdir\\d*"),
    // https://github.com/onshape-public/api-generator/blob/3de98a3c0ce01ee5705029e0db5086aba340d9ec/onshape-java/api-base/src/main/java/com/onshape/api/types/OnshapeDocument.java#L41
    Pattern.compile("^(https:\\/\\/\\w+(?:\\.\\w+){1,})\\/documents\\/([0-9a-z]+)\\/([wvm])\\/([0-9a-z]+)\\/e\\/([0-9a-z]+)$"),
    // https://github.com/dbeaver/dbeaver/blob/596e24f95d818d4e46588a367abc47a0c549621b/plugins/org.jkiss.dbeaver.ui.editors.sql/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java#L146
    Pattern.compile("--\\s*CONNECTION:\\s*(.+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/CMPUT301F20T15/BookwormAdventuresDeluxe2/blob/c16c72bc088edab6f681f155d70520ceddc0b023/app/src/main/java/com/example/bookwormadventuresdeluxe2/CreateAccountActivity.java#L348
    Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/LonelVino/IT_documents/blob/c2e703538050251ddfab55a510993ae518b5be65/Android/_Android%E8%AF%95%E9%A2%98/Android%204.0%20%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B%E8%AF%A6%E8%A7%A3%E4%BB%A3%E7%A0%81/%E7%AC%AC5%E7%AB%A0%EF%BC%9AAndroid%E4%B8%AD%E7%9A%84%E7%BD%91%E7%BB%9C%E6%95%B0%E6%8D%AE%E4%B8%8B%E8%BD%BD%E5%8F%8AJSON%E7%9A%84%E6%93%8D%E4%BD%9C/MultipleThreadContinuableDownloaderForAndroid4/src/com/wangjialin/internet/service/downloader/FileDownloader.java#L140
    Pattern.compile(".*filename=(.*)"),
    // https://github.com/dbeaver/dbeaver/blob/2cb4bcf7a51772b3c1a0f7dc42f92312f9ed4e7c/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java#L91
    Pattern.compile("(\\$\\{([\\w\\.\\-]+)\\})", Pattern.CASE_INSENSITIVE),
    // https://github.com/sonargraph/sonar-sonargraph-integration/blob/18c7e4251c4d27e2e03ceb38c07d7e27b13f97de/src/main/java/com/hello2morrow/sonargraph/integration/sonarqube/SonargraphBase.java#L69
    Pattern.compile("[^a-z0-9\\+#\\-\\.]"),
    // https://github.com/sonargraph/sonar-sonargraph-integration/blob/18c7e4251c4d27e2e03ceb38c07d7e27b13f97de/src/main/java/com/hello2morrow/sonargraph/integration/sonarqube/SonargraphBase.java#L71
    Pattern.compile("-{2,}"),
    // https://github.com/batfish/batfish/blob/dc88f4ede463bb65ac3f3ec1aa2fab5bf8946d36/projects/batfish/src/main/java/org/batfish/representation/cisco/CiscoConfiguration.java#L387
    Pattern.compile("[A-Za-z][-A-Za-z0-9]*[A-Za-z]"),
    // https://github.com/batfish/batfish/blob/dc88f4ede463bb65ac3f3ec1aa2fab5bf8946d36/projects/batfish/src/main/java/org/batfish/representation/cisco/CiscoConfiguration.java#L1604
    Pattern.compile("^(.*)\\.(\\d+)$"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/erddap/dataset/EDDTableFromFileNames.java#L1845
    Pattern.compile("2\\d{3}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/erddap/LoadDatasets.java#L872
    Pattern.compile(".*waiting=(\\d+), inotify=(\\d+), other=(\\d+).*"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L575
    Pattern.compile("\\S [9]+(\\.[0]+)? "),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L595
    Pattern.compile(" +[M]+"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L1899
    Pattern.compile("<strong>[-]?[0-9]+\\.[0-9]+ [SN]\\s+[-]?[0-9]+\\.[0-9]+ [WE] \\(.*"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2425
    Pattern.compile("<a href=\".{10}\\.txt(\\.gz|)"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2531
    Pattern.compile("TIME = \\d+;"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2532
    Pattern.compile(":actual_range = 1.0887192E9, [\\d\\.]{9}E9"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2533
    Pattern.compile(":date_created = \"20..-..-..\";"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2534
    Pattern.compile(":date_issued = \"20..-..-..\";"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2535
    Pattern.compile(":time_coverage_end = \"20..-..-..T..:..:..Z\";"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2997
    Pattern.compile("TIME=\\d+"),
    // https://github.com/BobSimons/erddap/blob/a4f34f0ff08b8fbe4decab05224962325fc2444d/WEB-INF/classes/gov/noaa/pfel/coastwatch/pointdata/NdbcMetStation.java#L2998
    Pattern.compile(":actual_range = .* //"),
    // https://github.com/etamar258/graph-prediction/blob/f0cc7e4596506ddf1f30944c17a63309f55a8fa1/src/main/java/seed/raw/csv/movielens/MovieLensUserRatingObject.java#L57
    Pattern.compile("[(](\\d{4})[)]"),
    // https://github.com/LoomDev/Loom/blob/5fbf74596b58430930e7dd5ea720054e6ad64418/api/src/main/java/org/loomdev/api/plugin/PluginMetadata.java#L21
    Pattern.compile("[a-z][a-z0-9-]{0,63}"),
    // https://github.com/purrbot-site/PurrBot/blob/84c868893137c178523382148b018f195b8851bf/src/main/java/site/purrbot/bot/util/message/MessageUtil.java#L52
    Pattern.compile("(\\{(.+?)})", Pattern.CASE_INSENSITIVE),
    // https://github.com/purrbot-site/PurrBot/blob/84c868893137c178523382148b018f195b8851bf/src/main/java/site/purrbot/bot/util/message/MessageUtil.java#L53
    Pattern.compile("(\\{r_(name|mention):(\\d+)})", Pattern.CASE_INSENSITIVE),
    // https://github.com/purrbot-site/PurrBot/blob/84c868893137c178523382148b018f195b8851bf/src/main/java/site/purrbot/bot/util/message/MessageUtil.java#L54
    Pattern.compile("(\\{c_(name|mention):(\\d+)})", Pattern.CASE_INSENSITIVE),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/WhUserTypeValidator.java#L36
    Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/WhUserTypeValidator.java#L39
    Pattern.compile("\\w{10}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/UserValidator.java#L28
    Pattern.compile("[a-zA-z0-9]{6,20}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/UserValidator.java#L39
    Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/UomValidator.java#L41
    Pattern.compile("[A-Z \\t\\n\\x0B\\f\\r]{4,12}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/UomValidator.java#L44
    Pattern.compile("[a-zA-Z \\t\\n\\x0B\\f\\r]{10,255}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/ShipmentTypeValidator.java#L40
    Pattern.compile("[a-zA-Z \\t\\n\\x0B\\f\\r]{4,12}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/ShipmentTypeValidator.java#L46
    Pattern.compile("[a-zA-Z \\t\\n\\x0B\\f\\r]{8,255}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/PurchaseOrderValidator.java#L64
    Pattern.compile("[0-9]{4,12}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/PurchaseOrderValidator.java#L82
    Pattern.compile("[a-zA-Z \\t\\n\\x0B\\f\\r]{4,255}"),
    // https://github.com/Amir513/E-shoping/blob/d5ad243201e647902c969f89e121de4266995606/E-Shoping/src/main/java/com/amir/validator/OrderMethodValidator.java#L56
    Pattern.compile("[A-Za-z \\t\\n\\x0B\\f\\r]{8,255}"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/ReflectedXSS.java#L70
    Pattern.compile("^[0-9]{3}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L77
    Pattern.compile("^[a-z]{3}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L79
    Pattern.compile("^[a-zA-Z0-9 ]*$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L80
    Pattern.compile("^(one|two|three|four|five|six|seven|eight|nine)$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L82
    Pattern.compile("^\\d{5}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L83
    Pattern.compile("^\\d{5}(-\\d{4})?$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/JavaScriptValidation.java#L84
    Pattern.compile("^[2-9]\\d{2}-?\\d{3}-?\\d{4}$"),
    // https://github.com/sfc-gh-sca-sa/WebGoat-Legacy-sca/blob/b415df2605833029d7b551fc67163a232fa8f25b/src/main/java/org/owasp/webgoat/lessons/CrossSiteScripting/FindProfile.java#L217
    Pattern.compile("[a-zA-Z ]{0,20}"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/test/java/net/snowflake/client/jdbc/DatabaseMetaDataIT.java#L47
    Pattern.compile("^(\\d+)\\.(\\d+)(?:\\.\\d+)+\\s*.*"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/test/java/net/snowflake/client/core/IncidentTests.java#L32
    Pattern.compile("(\r\n)|(\r)|(\n)"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/test/java/net/snowflake/client/core/IncidentTests.java#L179
    Pattern.compile(".*/logs/gs_.*dmp"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L26
    Pattern.compile("([a-z0-9+/%]{18,})", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L31
    Pattern.compile("(aws_key_id|aws_secret_key|access_key_id|secret_access_key)(\\s*=\\s*)'([^']+)'", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L37
    Pattern.compile("(accessToken|tempToken|keySecret)\"\\s*:\\s*\"([a-z0-9/+]{32,}={0,2})\"", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L44
    Pattern.compile("(sig|signature|AWSAccessKeyId|password|passcode)=([a-z0-9%/+]{16,})", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L49
    Pattern.compile("(password|passcode|pwd)([\'\"\\s:=]+)([a-z0-9!\"#$%&'\\()*+,-./:;<=>?@\\[\\]^_`\\{|\\}~]{6,})", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L57
    Pattern.compile("-----BEGIN PRIVATE KEY-----\\\\n([a-z0-9/+=\\\\n]{32,})\\\\n-----END PRIVATE KEY-----", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L63
    Pattern.compile("\"privateKeyData\": \"([a-z0-9/+=\\\\n]{10,})\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L68
    Pattern.compile("(token|assertion content)(['\"\\s:=]+)([a-z0-9=/_\\-+]{8,})", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/util/SecretDetector.java#L116
    Pattern.compile(".*?(password|pwd|token|proxyuser).*?", Pattern.CASE_INSENSITIVE),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/loader/OnError.java#L12
    Pattern.compile("(?i)(?:ABORT_STATEMENT|CONTINUE|SKIP_FILE(?:_\\d+%?)?)"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2012/echannel/sources/2.0/eOMS/src/main/java/com/alltrust/ebiz/eoms/service/KnowledgeFulltextRetrievalService.java#L84
    Pattern.compile("(?><span>)([\\S\\s]*?)(?></span>)"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/widgets/login/LoginOperate.java#L615
    Pattern.compile("[^a-zA-Z0-9]"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/widgets/login/LoginOperate.java#L1278
    Pattern.compile("AGENCYID_PARAM"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/merge/api/au/core/CoreUtil.java#L24
    Pattern.compile("in\\s*\\(\\s*(\\@([\\w_]+))\\s*\\)"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/merge/api/au/core/CoreUtil.java#L193
    Pattern.compile("\\$\\{(\\w+?)\\}"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/merge/api/au/core/CoreUtil.java#L217
    Pattern.compile("\\,"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/merge/api/au/core/CoreUtil.java#L217
    Pattern.compile("\\]"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2011/01-%E5%BC%80%E5%8F%91%E5%BA%93/01-%E5%BC%80%E5%8F%91%E4%BB%A3%E7%A0%81/sesale/src/com/toft/merge/api/au/core/CoreUtil.java#L217
    Pattern.compile("\\["),
    // https://github.com/vittoriacassoni/four-paws/blob/865c7007e1ffe7cea7ca001985fbff6b22cc35ba/src/business/services/UserService.java#L81
    Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"),
    // https://github.com/haducloc/appslandia-plum/blob/073a273d1137bd276afe54d94abf2b2a17504f0f/src/main/java/com/appslandia/plum/tags/UrlTag.java#L111
    Pattern.compile("\\{[^}]+?}"),
    // https://github.com/sfc-gh-sca-sa/snowflake-jdbc-sca1/blob/bddaa6c44176e165575383317f1103abded3434d/src/main/java/net/snowflake/client/core/SFSessionProperty.java#L72
    Pattern.compile("^[A-Za-z][A-Za-z0-9\\.\\-_]{1,50}$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-devtools/src/main/java/org/springframework/boot/devtools/restart/server/DefaultSourceDirectoryUrlFilter.java#L39
    Pattern.compile(".*\\/(.+)\\.jar"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-devtools/src/main/java/org/springframework/boot/devtools/restart/server/DefaultSourceDirectoryUrlFilter.java#L41
    Pattern.compile("^-\\d+(?:\\.\\d+)*(?:[.-].+)?$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-devtools/src/main/java/org/springframework/boot/devtools/livereload/Connection.java#L44
    Pattern.compile("^Sec-WebSocket-Key:(.*)$", Pattern.MULTILINE),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-devtools/src/intTest/java/org/springframework/boot/devtools/tests/JvmLauncher.java#L42
    Pattern.compile("[^A-Za-z]+"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/servlet/SecurityFilterAutoConfigurationEarlyInitializationTests.java#L62
    Pattern.compile("^Using generated security password: (.*)$", Pattern.MULTILINE),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/kafka/KafkaAutoConfigurationIntegrationTests.java#L134
    Pattern.compile("test"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/servlet/UserDetailsServiceAutoConfiguration.java#L66
    Pattern.compile("^\\{.+}.*$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/web/servlet/WebMvcTags.java#L60
    Pattern.compile("/$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/web/servlet/WebMvcTags.java#L62
    Pattern.compile("//+"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/wifi/java/android/net/wifi/p2p/WifiP2pDevice.java#L155
    Pattern.compile("(p2p_dev_addr=)?((?:[0-9a-f]{2}:){5}[0-9a-f]{2})"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/wifi/java/android/net/wifi/p2p/WifiP2pDevice.java#L164
    Pattern.compile("(?:[0-9a-f]{2}:){5}[0-9a-f]{2} p2p_dev_addr=((?:[0-9a-f]{2}:){5}[0-9a-f]{2})"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tools/processors/view_inspector/src/java/android/processor/view/inspector/InspectablePropertyProcessor.java#L57
    Pattern.compile("\\Aget[A-Z]"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tools/processors/view_inspector/src/java/android/processor/view/inspector/InspectablePropertyProcessor.java#L62
    Pattern.compile("\\Ais[A-Z]"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tools/powermodel/src/com/android/powermodel/PowerProfile.java#L65
    Pattern.compile("cpu.cluster_power.cluster([0-9]*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tools/powermodel/src/com/android/powermodel/PowerProfile.java#L66
    Pattern.compile("cpu.core_speeds.cluster([0-9]*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tools/powermodel/src/com/android/powermodel/PowerProfile.java#L67
    Pattern.compile("cpu.core_power.cluster([0-9]*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/tests/ManagedProfileLifecycleStressTest/src/com/android/test/stress/ManagedProfileLifecycleStressTest.java#L49
    Pattern.compile("Success: created user id (\\d+)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/com/android/internal/telephony/SmsMessageBase.java#L39
    Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/android/telephony/PhoneNumberUtils.java#L119
    Pattern.compile("[\\+]?[0-9.-]+"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/android/telephony/PhoneNumberUtils.java#L944
    Pattern.compile("(^[#*])(.*)([#*])(.*)(#)$"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/android/telephony/PhoneNumberUtils.java#L970
    Pattern.compile("(^[#*])(.*)([#*])(.*)"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/android/telephony/PhoneNumberUtils.java#L2641
    Pattern.compile(" +"),
    // https://github.com/ezio84/abc_frameworks_base/blob/458260ebf38534f9fa27b8112ec1f44bbed2f43b/telephony/java/android/telephony/PhoneNumberUtils.java#L2831
    Pattern.compile("[+]"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/web/reactive/client/WebClientExchangeTags.java#L46
    Pattern.compile("^https?://[^/]+/"),
    // https://github.com/Dalao-DaiDaiWo/Caiji_seckill_springboot/blob/a49daaf260ca99ef378fffb9dfae329fa75af333/src/main/java/com/fyh/seckill/util/ValidatorUtil.java#L14
    Pattern.compile("1\\d{10}"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L67
    Pattern.compile("\\s*//[^\\r\\n]*[\\r\\n]*"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L69
    Pattern.compile("\\s*(/\\*)([^\\*]*|\\*[^/])*\\*/"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L71
    Pattern.compile("if \\([^}]+\\}"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L73
    Pattern.compile("\\s*public[^({]*[(][^}]*[}]"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L75
    Pattern.compile("protected|private"),
    // https://github.com/Sebastian-Rostock/java.bee-creative/blob/f53f4f1caa00386f2bb74e04af524e5bf75edf9c/src/main/java/bee/creative/xml/XMLCleaner.java#L77
    Pattern.compile(" (List<[^;]+);"),
    // https://github.com/trolommonm/CZ2002-Stars/blob/090cc7f56cf514a4d79165893817dd91468ed786/src/view/AdminUi.java#L244
    Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE),
    // https://github.com/r3kapig/WCTF-2020/blob/c97523faeee84dc75b7fed02f379b7cbbfe53277/thymeleaf-problem/src/thymeleaf-problem/src/main/java/me/threedr3am/thymeleaf/filter/URISpelInjectFilter.java#L17
    Pattern.compile("'|\""),
    // https://github.com/HornbillOS/frameworks_base/blob/1e5e19ab361777cfc4e881395422e496057f1e82/wifi/java/android/net/wifi/p2p/WifiP2pGroup.java#L87
    Pattern.compile("ssid=\"(.+)\" freq=(\\d+) (?:psk=)?([0-9a-fA-F]{64})?(?:passphrase=)?(?:\"(.{0,63})\")? go_dev_addr=((?:[0-9a-f]{2}:){5}[0-9a-f]{2}) ?(\\[PERSISTENT\\])?"),
    // https://github.com/TheInfinity007/RouteFinder/blob/06c05c797524382e7eaaaa0af83a2381f4fc55d3/src/util/GraphLoader.java#L578
    Pattern.compile("[^\\s\"']+|\"([^\"]*)\""),
    // https://github.com/sgoenko/betadvisor/blob/03dbbd2a3dabbbe916b1097e1547cbf5a4887513/src/main/java/com/hay/betadvisor/scrape/WilliamHillScrapper.java#L52
    Pattern.compile("([0-9]+)/([0-9]+)"),
    // https://github.com/herrsalmi/IntOmics/blob/48cb75b515094dea606fea340a8ad806a7651d63/src/main/java/org/pmoi/business/pathway/WikiPathwaysMapper.java#L199
    Pattern.compile("(?:\\d*\\.){3}\\d+"),
    // https://github.com/herrsalmi/IntOmics/blob/48cb75b515094dea606fea340a8ad806a7651d63/src/main/java/org/pmoi/business/pathway/WikiPathwaysMapper.java#L200
    Pattern.compile("(^[\\w-]+)"),
    // https://github.com/herrsalmi/IntOmics/blob/48cb75b515094dea606fea340a8ad806a7651d63/src/main/java/org/pmoi/business/pathway/KEGGPathwayMapper.java#L174
    Pattern.compile("[0-9]+ {2}(.+)(?=;)"),
    // https://github.com/ritika1003/CogniCrypt_DOC/blob/92fec3464f334ce93e03225a4b61035205a0a0bb/src/main/java/de/upb/docgen/Order.java#L370
    Pattern.compile("\\("),
    // https://github.com/ritika1003/CogniCrypt_DOC/blob/92fec3464f334ce93e03225a4b61035205a0a0bb/src/main/java/de/upb/docgen/Order.java#L494
    Pattern.compile("\\]$"),
    // https://github.com/ritika1003/CogniCrypt_DOC/blob/92fec3464f334ce93e03225a4b61035205a0a0bb/src/main/java/de/upb/docgen/Order.java#L494
    Pattern.compile("[\\[\\]]"),
    // https://github.com/ritika1003/CogniCrypt_DOC/blob/92fec3464f334ce93e03225a4b61035205a0a0bb/src/main/java/de/upb/docgen/Order.java#L493
    Pattern.compile(",(?=[^\\)]*(?:\\(|$))"),
    // https://github.com/dimtim/optaplanner/blob/d456efebde820ce11c4898016b6674dee9820269/src/main/java/org/optaplanner/examples/common/persistence/AbstractXlsxSolutionFileIO.java#L64
    Pattern.compile("(?U)^[\\w&\\-\\.\\/\\(\\)\\'][\\w&\\-\\.\\/\\(\\)\\' ]*[\\w&\\-\\.\\/\\(\\)\\']?$"),
    // https://github.com/dimtim/optaplanner/blob/d456efebde820ce11c4898016b6674dee9820269/src/main/java/org/optaplanner/examples/common/persistence/AbstractXlsxSolutionFileIO.java#L66
    Pattern.compile("(?U)^[\\w\\-\\.\\/\\(\\)]+$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-tools/spring-boot-buildpack-platform/src/main/java/org/springframework/boot/buildpack/platform/docker/LogUpdateEvent.java#L33
    Pattern.compile("\u001B\\[[;\\d]*m"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-tools/spring-boot-buildpack-platform/src/main/java/org/springframework/boot/buildpack/platform/docker/LogUpdateEvent.java#L35
    Pattern.compile("\\n$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-tools/spring-boot-buildpack-platform/src/main/java/org/springframework/boot/buildpack/platform/build/ApiVersion.java#L32
    Pattern.compile("^v?(\\d+)\\.(\\d*)$"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/spring-boot-project/spring-boot-test-autoconfigure/src/main/java/org/springframework/boot/test/autoconfigure/properties/AnnotationsPropertySource.java#L46
    Pattern.compile("([^A-Z-])([A-Z])"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L810
    Pattern.compile("'"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1063
    Pattern.compile("^[+]?(([0-9]\\d*[.]?)|(0.))(\\d{0,2})?$"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1089
    Pattern.compile("[0-9]{4}-[0-9]{2}"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1113
    Pattern.compile("^\\d+$"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1152
    Pattern.compile("0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1178
    Pattern.compile("^[0-9]+(.[0-9]{0,2})?$"),
    // https://github.com/liurunkaiGit/asset/blob/83268a6df9a3298726bd1aa821f7d9d5c6374517/assets-package/src/main/java/com/ruoyi/assetspackage/util/RepaymentDataImportUtil.java#L1195
    Pattern.compile("\\d{15}(\\d{2}[0-9xX])?"),
    // https://github.com/ISEL-HGU/ChangeVectorCollector/blob/cffff3ff66cd088bae3e5eadd398d2eefa6f806b/src/main/java/change/vector/collector/Utils.java#L113
    Pattern.compile(".*/(.+)\\.git"),
    // https://github.com/ISEL-HGU/ChangeVectorCollector/blob/cffff3ff66cd088bae3e5eadd398d2eefa6f806b/src/main/java/change/vector/collector/Utils.java#L156
    Pattern.compile("\\S"),
    // https://github.com/structr/structr/blob/9b6f6cb33a6a3a52718f9a45b871868842b9b3d1/structr-core/src/main/java/org/structr/core/script/Scripting.java#L53
    Pattern.compile("^\\$\\{(\\w+)\\{(.*)\\}\\}$", Pattern.DOTALL),
    // https://github.com/SpoonLabs/sorald/blob/ac3232cf1adfb7d80538d0fbed0e93cd6029e3eb/src/test/java/sorald/processor/ProcessorTestHelper.java#L62
    Pattern.compile("Check$"),
    // https://github.com/SpoonLabs/sorald/blob/ac3232cf1adfb7d80538d0fbed0e93cd6029e3eb/src/test/java/sorald/processor/ProcessorTestHelper.java#L81
    Pattern.compile("\\s*package\\s+?(\\S+)\\s*;"),
    // https://github.com/ISEL-HGU/DPMiner/blob/0bfd8af1329c101d9f3319131397239b8b3720fc/src/main/java/edu/handong/csee/isel/metric/metadata/Utils.java#L133
    Pattern.compile(".+\\[.+,(.+),.+\\]"),
    // https://github.com/ISEL-HGU/DPMiner/blob/0bfd8af1329c101d9f3319131397239b8b3720fc/src/main/java/edu/handong/csee/isel/metric/metadata/MetricCollector.java#L131
    Pattern.compile("(.+)/.+"),
    // https://github.com/ISEL-HGU/DPMiner/blob/0bfd8af1329c101d9f3319131397239b8b3720fc/src/main/java/edu/handong/csee/isel/metric/metadata/CommitCollector.java#L348
    Pattern.compile("@.+\\{(.+)"),
    // https://github.com/ISEL-HGU/DPMiner/blob/0bfd8af1329c101d9f3319131397239b8b3720fc/src/main/java/edu/handong/csee/isel/metric/collector/Test.java#L14
    Pattern.compile("\\{.+\\,\\d+\\s(.+)\\}", Pattern.CASE_INSENSITIVE),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/buildSrc/src/main/java/org/springframework/boot/build/bom/bomr/version/LeadingZeroesDependencyVersion.java#L32
    Pattern.compile("0*([0-9]+)\\.0*([0-9]+)\\.0*([0-9]+)"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/buildSrc/src/main/java/org/springframework/boot/build/bom/bomr/version/CombinedPatchAndQualifierDependencyVersion.java#L32
    Pattern.compile("([0-9]+\\.[0-9]+\\.[0-9]+)([A-Za-z][A-Za-z0-9]+)"),
    // https://github.com/ajayb95/NovemberChallenge/blob/420e5ba087819480737eaf2aef01b7319a179257/src/main/java/nc/selenium_automation/P8_Flipkart.java#L64
    Pattern.compile("\\d+"),
    // https://github.com/roel0064/software-design-repo/blob/f82e0e0386b24dd615e9413e08cf49e9ca3fe221/Rename/src/main/java/io/javalin/plugin/rendering/vue/VueDependencyResolver.java#L33
    Pattern.compile("<\\s*([a-z|-]*)\\s*.*>"),
    // https://github.com/roel0064/software-design-repo/blob/f82e0e0386b24dd615e9413e08cf49e9ca3fe221/Rename/src/main/java/io/javalin/plugin/rendering/vue/VueDependencyResolver.java#L34
    Pattern.compile("Vue.component\\(\\s*[\"|'](.*)[\"|']\\s*,.*"),
    // https://github.com/fkmurphy/firmador/blob/0d6a758e513caa9e678e134bb2ee6e33a5422bd0/src/main/java/org/openjfx/Main/Start.java#L134
    Pattern.compile("firmador://"),
    // https://github.com/fkmurphy/firmador/blob/0d6a758e513caa9e678e134bb2ee6e33a5422bd0/src/main/java/org/openjfx/Main/Start.java#L148
    Pattern.compile("="),
    // https://github.com/osivia/index-cloud-ens/blob/f71c874fa42ae41926b23532b12372d0acfbb4c8/index-cloud-ens-portal/index-cloud-ens-portal-ws/src/main/java/fr/index/cloud/ens/ws/DriveRestController.java#L98
    Pattern.compile("([^/\\\\:*?\\\"<>|])*"),
    // https://github.com/520MianXiangDuiXiang520/SimpleCA/blob/937953a033ab8e50e3f7721f29a74d3c72feb79d/codeSignTool/src/src/top/junebao/RSA_PEM.java#L182
    Pattern.compile("--+.+?--+|[\\s\\r\\n]+"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/libraries-data/src/test/java/com/baeldung/kafkastreams/KafkaStreamsLiveTest.java#L41
    Pattern.compile("\\W+", Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/SubstringUnitTest.java#L38
    Pattern.compile("\\d{2}\\-\\d{2}-\\d{4}"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/StringContainingCharactersUnitTest.java#L17
    Pattern.compile(".*[A-Z].*"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/StringContainingCharactersUnitTest.java#L18
    Pattern.compile(".*[a-z].*"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/StringContainingCharactersUnitTest.java#L19
    Pattern.compile(".*\\d.*"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/StringContainingCharactersUnitTest.java#L20
    Pattern.compile(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/StringContainingCharactersUnitTest.java#L14
    Pattern.compile("^(?=.*?\\p{Lu})(?=.*?\\p{Ll})(?=.*?\\d)(?=.*?[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?]).*$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/RemovingEmojiFromStringUnitTest.java#L49
    Pattern.compile("[\\x{0001f300}-\\x{0001f64f}]|[\\x{0001f680}-\\x{0001f6ff}]"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/string/RemovingEmojiFromStringUnitTest.java#L56
    Pattern.compile("[\ud83c\udf00-\ud83d\ude4f]|[\ud83d\ude80-\ud83d\udeff]"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-strings/src/test/java/com/baeldung/java/countingChars/CountCharsExampleUnitTest.java#L48
    Pattern.compile("[^e]*e"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-streams/src/test/java/com/baeldung/java8/Java8StreamApiUnitTest.java#L98
    Pattern.compile(", "),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/gregorian/MonthsOf31DaysMatcher.java#L10
    Pattern.compile("^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"),
    // https://github.com/imcvk/code-master/blob/82781c20131a7c22b3dd6a63f4e8a59e20264e20/java-dates/src/main/java/com/baeldung/regexp/datepattern/gregorian/MonthsOf30DaysMatcher.java#L10
    Pattern.compile("^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$"),
    // https://github.com/HornbillOS/frameworks_base/blob/1e5e19ab361777cfc4e881395422e496057f1e82/core/java/android/accessibilityservice/util/AccessibilityUtils.java#L69
    Pattern.compile("(?i)<img\\s+(?!src\\s*=\\s*\"(?-i)R.drawable.)"),
    // https://github.com/HornbillOS/frameworks_base/blob/1e5e19ab361777cfc4e881395422e496057f1e82/cmds/statsd/tools/localtools/src/com/android/statsd/shelltools/Utils.java#L219
    Pattern.compile("^(.*)\tdevice$"),
    // https://github.com/HornbillOS/frameworks_base/blob/1e5e19ab361777cfc4e881395422e496057f1e82/cmds/incident_helper/java/com/android/commands/incident/sections/PersistLogSection.java#L54
    Pattern.compile("logcat(\\.\\d+)?"),
    // https://github.com/HornbillOS/frameworks_base/blob/1e5e19ab361777cfc4e881395422e496057f1e82/cmds/incident_helper/java/com/android/commands/incident/sections/PersistLogSection.java#L56
    Pattern.compile("--------- (?:beginning of|switch to) (.*)"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L23
    Pattern.compile("<img.*src\\s*=\\s*(.*?)[^>]*?>", Pattern.CASE_INSENSITIVE),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L25
    Pattern.compile("src=\"?'?(.*?)(\"|'|>|\\s+)"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L27
    Pattern.compile("data-img-width=\"\\d+\""),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L29
    Pattern.compile("data-img-heigth=\"\\d+\""),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L21
    Pattern.compile("\\[@(.*?)\\]"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/utils/RegxUtil.java#L164
    Pattern.compile("<a\\s.*?href=\"([^\"]+)\"[^>]*>(.*?)</a>"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/validate/Validator.java#L338
    Pattern.compile("[0-9A-Za-z]*"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/validate/Validator.java#L356
    Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/validate/Validator.java#L371
    Pattern.compile("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[0,1,6,7,8])|(18[0-9]))\\d{8}$"),
    // https://github.com/Dercharles/springboot2/blob/0d54e8b23c9fac046be9dade615ba0d89cba6593/src/main/java/com/example/springboot2/yang/common/modules/validate/Validator.java#L382
    Pattern.compile("^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$"),
    // https://github.com/ghostwolf300/TokenService/blob/71dbd2b3d5d92a251398bafa1af82a67b822f4c3/TokenService/src/main/java/org/jd/robot/JDRobot.java#L215
    Pattern.compile("(?<=code=)(.*)(?=&)"),
    // https://github.com/MateuszKoszewski/kursSDA/blob/cb47746f12c0e28c4f92c5c0dd40e92099f3fe5a/car_project/src/main/java/UserRental.java#L43
    Pattern.compile("^\\d{11}$"),
    // https://github.com/mikemccand/luceneutil/blob/f83fd45adb9193deb5a112eb41b4c1a078055fb7/src/main/perf/TaskParser.java#L91
    Pattern.compile(" \\+filter=([0-9\\.]+)%"),
    // https://github.com/mikemccand/luceneutil/blob/f83fd45adb9193deb5a112eb41b4c1a078055fb7/src/main/perf/TaskParser.java#L92
    Pattern.compile(" \\+minShouldMatch=(\\d+)($| )"),
    // https://github.com/nette-intellij/intellij-latte/blob/ee0f9c49077d13652ad15f4e5d800fae10815b96/src/main/java/com/jantvrdik/intellij/latte/psi/LatteFileViewProvider.java#L27
    Pattern.compile("^\\{contentType [^}]*xml[^}]*}.*"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L40
    Pattern.compile("url\\(\\s*([\"']?)data\\:"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L134
    Pattern.compile("(\"([^\\\\\"]|\\\\.|\\\\)*\")|(\'([^\\\\\']|\\\\.|\\\\)*\')"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L150
    Pattern.compile("(?i)progid:DXImageTransform.Microsoft.Alpha\\(Opacity="),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L209
    Pattern.compile("(^|\\})(([^\\{:])+:)+([^\\{]*\\{)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L214
    Pattern.compile("\\$"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L220
    Pattern.compile("\\s+([!{};:>+\\(\\)\\],])"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L222
    Pattern.compile("___YUICSSMIN_PSEUDOCLASSCOLON___"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L225
    Pattern.compile(":first\\-(line|letter)(\\{|,)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L228
    Pattern.compile("\\*/ "),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L231
    Pattern.compile("^(.*)(@charset \"[^\"]*\";)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L232
    Pattern.compile("^(\\s*@charset [^;]+;\\s*)+"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L236
    Pattern.compile("\\band\\("),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L239
    Pattern.compile("([!{}:;>+\\(\\[,])\\s+"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L242
    Pattern.compile(";+}"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L245
    Pattern.compile("([\\s:])(0)(px|em|%|in|cm|mm|pc|pt|ex)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L248
    Pattern.compile(":0 0 0 0(;|})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L249
    Pattern.compile(":0 0 0(;|})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L250
    Pattern.compile(":0 0(;|})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L256
    Pattern.compile("(?i)(background-position|transform-origin|webkit-transform-origin|moz-transform-origin|o-transform-origin|ms-transform-origin):0(;|})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L265
    Pattern.compile("(:|\\s)0+\\.(\\d+)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L269
    Pattern.compile("rgb\\s*\\(\\s*([0-9,\\s]+)\\s*\\)"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L295
    Pattern.compile("(\\=\\s*?[\"']?)?#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])(:?\\}|[^0-9a-fA-F{][^{]*?\\})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L333
    Pattern.compile("(?i)(border|border-top|border-right|border-bottom|border-right|outline|background):none(;|})"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L345
    Pattern.compile("[^\\}\\{/;]+\\{\\}"),
    // https://github.com/GiovanibCorrea/testesb/blob/2f26c1e4991511b8dd423040956da0760616fc50/wp-content/plugins/w3-total-cache/lib/Minify/Minify/YUI/CssCompressor.java#L369
    Pattern.compile(";;+"),
    // https://github.com/catapult04/20201-crawl-newspaper/blob/69252078520a9d97580c58101e4926b02478fbde/src/crawler/Crawler.java#L22
    Pattern.compile("\\\\R"),
    // https://github.com/gunnerrrr/multithread/blob/5601423d81018af0dcb306fa290e157658c5e240/src/main/java/TaskLab4/Main.java#L14
    Pattern.compile(".+jpg$"),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L108
    Pattern.compile("select\\s+(?:distinct\\s+)?(.+)\\s+from", Pattern.CASE_INSENSITIVE),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L110
    Pattern.compile("\\D+"),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L116
    Pattern.compile(".*order\\s+by\\s+.*", Pattern.CASE_INSENSITIVE),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L97
    Pattern.compile("(?<![:\\\\]):[._$[\\P{Z}&&\\P{Cc}&&\\P{Cf}&&\\P{Punct}]]+|#[._$[\\P{Z}&&\\P{Cc}&&\\P{Cf}&&\\P{Punct}]]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L129
    Pattern.compile(".*((?![._])[\\p{Punct}|\\s])"),
    // https://github.com/spring-projects/spring-data-jpa/blob/76f216d0733a479950555e4c22e7cdf3327709df/src/main/java/org/springframework/data/jpa/repository/query/QueryUtils.java#L104
    Pattern.compile("(?iu)\\s+order\\s+by\\s+.*"),
    // https://github.com/wujun728/jdep_boot/blob/1362ed986c7c20567f078a900c954e4ae29e9ea9/jdep_process/jdep-common/src/main/java/com/ruoyi/common/utils/bean/BeanUtils.java#L20
    Pattern.compile("get(\\p{javaUpperCase}\\w*)"),
    // https://github.com/wujun728/jdep_boot/blob/1362ed986c7c20567f078a900c954e4ae29e9ea9/jdep_process/jdep-common/src/main/java/com/ruoyi/common/utils/bean/BeanUtils.java#L23
    Pattern.compile("set(\\p{javaUpperCase}\\w*)"),
    // https://github.com/AbuZaitoun/SportLand/blob/bb089d3c59f809cf80d910d63a746ba831d04c5c/app/src/main/java/com/anaszaitoun/sportlandgym/Controllers/Luxury.java#L20
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/streamsets/datacollector/blob/d67a55df4ebdb0c8d31ee100f59691d6120d063a/jdbc-protolib/src/main/java/com/streamsets/pipeline/stage/origin/jdbc/cdc/oracle/OracleCDCSource.java#L251
    Pattern.compile("(CREATE|ALTER|DROP|TRUNCATE).*", Pattern.CASE_INSENSITIVE),
    // https://github.com/TGAC/grassroots-lucene/blob/1ed1e13b016a5d809cbbcc6640feaa94b9283d11/src/uk/ac/earlham/grassroots/document/json/GrassrootsJSON.java#L20
    Pattern.compile("<b>(\\S+)</b>"),
    // https://github.com/TGAC/grassroots-lucene/blob/1ed1e13b016a5d809cbbcc6640feaa94b9283d11/src/uk/ac/earlham/grassroots/document/json/GrassrootsJSON.java#L74
    Pattern.compile("</b>"),
    // https://github.com/TGAC/grassroots-lucene/blob/1ed1e13b016a5d809cbbcc6640feaa94b9283d11/src/uk/ac/earlham/grassroots/document/json/GrassrootsJSON.java#L74
    Pattern.compile("<b>"),
    // https://github.com/jline/jline3/blob/bb5e85afd9009e9d3d917a19dcb0deab4b9b0922/reader/src/main/java/org/jline/reader/impl/LineReaderImpl.java#L5217
    Pattern.compile(".*\\W"),
    // https://github.com/galaxybruce/LKAndroidCodeTemplateForAS/blob/b241dd493b1fca51da1eac9f47795e13dfa0c2fb/src/com/galaxybruce/android/codegenerator/plugin/util/FileUtils.java#L79
    Pattern.compile("[A-Z]([a-z\\d]+)?"),
    // https://github.com/hanbellgp/Hanbell-EAP/blob/03d38aaa8476eba0eeb2c452eea41623536f9853/Hanbell-JWS/src/java/cn/hanbell/jws/TimerBean.java#L3130
    Pattern.compile("[\\s·`!！@#￥$%^……&*（()）\\+【\\[\\]】｛{}｝\\|、\\\\；;：:‘'“”\"，,《<。.》>、/？?]"),
    // https://github.com/hanbellgp/Hanbell-EAP/blob/03d38aaa8476eba0eeb2c452eea41623536f9853/Hanbell-JWS/src/java/cn/hanbell/jws/TimerBean.java#L3144
    Pattern.compile("^[0-9]$"),
    // https://github.com/OpenSrcDeveloper/webrtc-live/blob/a54d59e4ff9d26761c6cffeff5a2de15a7cbc7cf/webrtc-live-common/src/main/java/com/opendev/utils/MobileEmailUtils.java#L9
    Pattern.compile("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$"),
    // https://github.com/guyuetftb/guyue-java18-source/blob/3a082e2cc5069edf556d434ef3ae54da0b128284/src/main/java/javax/xml/datatype/DatatypeFactory.java#L116
    Pattern.compile("[^DT]*"),
    // https://github.com/guyuetftb/guyue-java18-source/blob/3a082e2cc5069edf556d434ef3ae54da0b128284/src/main/java/javax/xml/datatype/DatatypeFactory.java#L119
    Pattern.compile("[^YM]*[DT].*"),
    // https://github.com/YouHaveTrouble/ServerBasics/blob/ee76dbdacc4eab2bd705e3e63395ed55c189a2fe/src/main/java/eu/endermite/serverbasics/ServerBasics.java#L76
    Pattern.compile("([a-z]{1,3}_[a-z]{1,3})(\\.yml)", Pattern.CASE_INSENSITIVE),
    // https://github.com/YouHaveTrouble/ServerBasics/blob/ee76dbdacc4eab2bd705e3e63395ed55c189a2fe/src/main/java/eu/endermite/serverbasics/ServerBasics.java#L96
    Pattern.compile("([a-z]{1,3}_[a-z]{1,3})(\\.yml)"),
    // https://github.com/SkaberenWorm/backend-el-desquite/blob/2b490fa83a996f40f4c841fab101d0b363c6212a/src/main/java/cl/desquite/backend/utils/Util.java#L47
    Pattern.compile("[a-zA-ZñÑáÁéÉíÍóÓúÚ ]{2,200}"),
    // https://github.com/SkaberenWorm/backend-el-desquite/blob/2b490fa83a996f40f4c841fab101d0b363c6212a/src/main/java/cl/desquite/backend/utils/Util.java#L53
    Pattern.compile("[0-9kK-]{2,50}"),
    // https://github.com/SkaberenWorm/backend-el-desquite/blob/2b490fa83a996f40f4c841fab101d0b363c6212a/src/main/java/cl/desquite/backend/utils/Util.java#L59
    Pattern.compile("[a-zA-Z0-9ñÑáÁéÉíÍóÓúÚ #,-]{2,200}"),
    // https://github.com/SkaberenWorm/backend-el-desquite/blob/2b490fa83a996f40f4c841fab101d0b363c6212a/src/main/java/cl/desquite/backend/utils/Util.java#L65
    Pattern.compile("[0-9+]{1,20}"),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/WebUtils.java#L22
    Pattern.compile("(\\w*\\.?){1}\\.(com.cn|net.cn|gov.cn|org\\.nz|org.cn|com|net|org|gov|cc|biz|info|cn|co)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/WebUtils.java#L25
    Pattern.compile("(\\w*\\.?){2}\\.(com.cn|net.cn|gov.cn|org\\.nz|org.cn|com|net|org|gov|cc|biz|info|cn|co)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/WebUtils.java#L28
    Pattern.compile("(\\w*\\.?){3}\\.(com.cn|net.cn|gov.cn|org\\.nz|org.cn|com|net|org|gov|cc|biz|info|cn|co)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/CheckUtils.java#L23
    Pattern.compile("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"),
    // https://github.com/javacxyxbc/yunheng_blog/blob/d6f3330f0a1a6767c1b2137ecaa3479c218783bd/hy_utils/src/main/java/com/moxi/hyblog/utils/CheckUtils.java#L42
    Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$"),
    // https://github.com/kriskrishna/cafe-common/blob/b395eadcacd06ecab518780c7d9e66aa8494c666/src/main/java/com/example/PatternUtils.java#L35
    Pattern.compile("[2-9][0-9]"),
    // https://github.com/kriskrishna/cafe-common/blob/b395eadcacd06ecab518780c7d9e66aa8494c666/src/main/java/com/example/PatternUtils.java#L44
    Pattern.compile("OK"),
    // https://github.com/MatheusY/kafka/blob/92dc38517afd23d6163a39a1e1375c2940e343cd/src/main/java/br/com/alura/ecommerce/LogService.java#L17
    Pattern.compile("ECOMMERCE.*"),
    // https://github.com/sajalverma17/Spring/blob/d88326b03eb06e5125ea988ce997af9611f8fdec/app/src/main/java/com/rarecase/presenter/presenters/SongListPresenter.java#L139
    Pattern.compile(".*(http.*)"),
    // https://github.com/treeSkychen/Test/blob/df3f29cebd28fa1aa17ce71f4d03d86274bdf67f/src/main/java/ltd/newbee/mall/util/NumberUtil.java#L25
    Pattern.compile("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0-8])|(18[0-9]))\\d{8}$"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java#L419
    Pattern.compile("<\\/script"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java#L454
    Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L75
    Pattern.compile("\"\\\\\"}\\\\\"\""),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L91
    Pattern.compile("___PSEUDOCLASSCOLON___"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L97
    Pattern.compile("([^;\\}])}"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L103
    Pattern.compile(":0 0 0 0;"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L104
    Pattern.compile(":0 0 0;"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L105
    Pattern.compile(":0 0;"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L107
    Pattern.compile("background-position:0;"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L138
    Pattern.compile("([^\"'=\\s])(\\s*)#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L155
    Pattern.compile("[^\\}]+\\{;\\}"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/vendor/yuicompressor-2.4.2/src/com/yahoo/platform/yui/compressor/CssCompressor.java#L176
    Pattern.compile("___PSEUDOCLASSBMH___"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/util/FileCache.java#L16
    Pattern.compile("(\\.[a-zA-Z0-9]+)[^\\.]*$"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/util/FileCache.java#L205
    Pattern.compile("^[0-9-]+$"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/service/OriginalTextService.java#L21
    Pattern.compile("<img[^>]*src=(['\"])((?:(?!\\1).)*)\\1[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/serialization/StoryTypeAdapter.java#L26
    Pattern.compile("[\\uFFFC\\u000A\\u000B\\u000C\\u000D]"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/serialization/StoryTypeAdapter.java#L27
    Pattern.compile("(?:http):\\//"),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/fragment/ReadingItemFragment.java#L814
    Pattern.compile("<img[^>]*src=(['\"])((?:(?!\\1).)*)\\1[^>]*alt=(['\"])((?:(?!\\3).)*)\\3[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/fragment/ReadingItemFragment.java#L815
    Pattern.compile("<img[^>]*alt=(['\"])((?:(?!\\1).)*)\\1[^>]*src=(['\"])((?:(?!\\3).)*)\\3[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/fragment/ReadingItemFragment.java#L816
    Pattern.compile("<img[^>]*src=(['\"])((?:(?!\\1).)*)\\1[^>]*title=(['\"])((?:(?!\\3).)*)\\3[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/fragment/ReadingItemFragment.java#L817
    Pattern.compile("<img[^>]*title=(['\"])((?:(?!\\1).)*)\\1[^>]*src=(['\"])((?:(?!\\3).)*)\\3[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/fragment/ReadingItemFragment.java#L849
    Pattern.compile("<img[^>]*(src\\s*=\\s*)\"([^\"]*)\"[^>]*>", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/domain/Story.java#L289
    Pattern.compile("youtube\\.com\\/embed\\/([A-Za-z0-9_-]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/domain/Story.java#L290
    Pattern.compile("youtube\\.com\\/v\\/([A-Za-z0-9_-]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/domain/Story.java#L291
    Pattern.compile("ytimg\\.com\\/vi\\/([A-Za-z0-9_-]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/back8/github_samuelclay_NewsBlur/blob/e5fa0cdd643ef7b451a3a4ddb1ee303eb7b1c4ec/clients/android/NewsBlur/src/com/newsblur/domain/Story.java#L292
    Pattern.compile("youtube\\.com\\/watch\\?v=([A-Za-z0-9_-]+)", Pattern.CASE_INSENSITIVE),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/independent-projects/resteasy-reactive/common/runtime/src/main/java/org/jboss/resteasy/reactive/common/util/URLUtils.java#L54
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:.*"),
    // https://github.com/andrealcalde98/ExamenUF5/blob/396262670a7bf89b8e55b3f41f7363da6ad6e4cd/src/examen/Examen.java#L41
    Pattern.compile("^ref\\d{3}"),
    // https://github.com/DariusRain/Java-Blackjack/blob/81a4a2136407e5035c3bcc1cc4c7dbe95e5036c9/src/blackjack/utils/UserInteractions/Parser.java#L21
    Pattern.compile("♡|♣|♠|♢"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/webs/resources-importer-web/docroot/WEB-INF/src/com/liferay/resourcesimporter/util/FileSystemImporter.java#L1893
    Pattern.compile("\\[\\$FILE=([^\\$]+)\\$\\]"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L266
    Pattern.compile("&lt;c:if test=\"false\"&gt;([\\s|\\S]*?)&lt;/c:if&gt;"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L280
    Pattern.compile("&lt;c:when test=\"false\"&gt;([\\s|\\S]*?)&lt;/c:when&gt;"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L261
    Pattern.compile("&lt;c:choose&gt;([\\s|\\S]*?)&lt;/c:choose&gt;"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L269
    Pattern.compile("&lt;c:if test=\"true\"&gt;([\\s|\\S]*?)&lt;/c:if&gt;"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L275
    Pattern.compile("&lt;c:otherwise&gt;([\\s|\\S]*?)&lt;/c:otherwise&gt;"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L286
    Pattern.compile("\\$\\{([0-9a-zA-Z\\.]+)( (==|\\*) ([0-9a-zA-Z\\.]+)){0,1}\\}"),
    // https://github.com/gamerson/evp-portlet-upgrade/blob/7002a6a63888316e1cee8d18a724e104a8739475/liferay-plugins-sdk-6.2-ee-sp20/portlets/evp-portlet/docroot/WEB-INF/src/com/liferay/evp/hook/service/impl/EVPJournalArticleLocalServiceImpl.java#L283
    Pattern.compile("&lt;c:when test=\"true\"&gt;([\\s|\\S]*?)&lt;/c:when&gt;"),
    // https://github.com/AAFC-BICoE/seqdb-api/blob/e617b92471b93edcf21552eb3a64e68dbe4a6651/src/main/java/ca/gc/aafc/seqdb/api/util/NumberLetterMappingUtils.java#L9
    Pattern.compile("[^A-Z]"),
    // https://github.com/Philtard/DiscordCodeFormatter/blob/6de5d67cf48e6a56698b9adbe53456da43131d4d/src/main/java/io/horrorshow/discordcodeformatter/DiscordMessage.java#L15
    Pattern.compile("```[\\s\\S]*?(```)"),
    // https://github.com/spyridon97/Buzz-For-Pc/blob/bb0408636d4e3457d2ccc0f3cd01ed5d8901d43c/marathon/support/snakeyaml/src/test/java/org/yaml/snakeyaml/resolver/ResolverTest.java#L42
    Pattern.compile("\\d\\d-\\d\\d-\\d\\d\\d"),
    // https://github.com/spyridon97/Buzz-For-Pc/blob/bb0408636d4e3457d2ccc0f3cd01ed5d8901d43c/marathon/support/snakeyaml/src/test/java/org/yaml/snakeyaml/resolver/ResolverTest.java#L65
    Pattern.compile("x\\d_y\\d"),
    // https://github.com/liuxiaohui1221/druid-code-lean/blob/c7f58a5c93b1f508b457bf7621833576aa1d3dd5/server/src/test/java/org/apache/druid/segment/loading/LocalDataSegmentPusherTest.java#L125
    Pattern.compile(".*/ds/1970-01-01T00:00:00\\.000Z_1970-01-01T00:00:00\\.001Z/v1/0/[A-Za-z0-9-]{36}/index\\.zip"),
    // https://github.com/liuxiaohui1221/druid-code-lean/blob/c7f58a5c93b1f508b457bf7621833576aa1d3dd5/server/src/main/java/org/apache/druid/segment/indexing/DataSchema.java#L58
    Pattern.compile("(?s).*[^\\S ].*"),
    // https://github.com/liuxiaohui1221/druid-code-lean/blob/c7f58a5c93b1f508b457bf7621833576aa1d3dd5/processing/src/main/java/org/apache/druid/query/groupby/having/HavingSpecMetricComparator.java#L36
    Pattern.compile("[-|+]?\\d+"),
    // https://github.com/liuxiaohui1221/druid-code-lean/blob/c7f58a5c93b1f508b457bf7621833576aa1d3dd5/processing/src/main/java/org/apache/druid/query/filter/LikeDimFilter.java#L48
    Pattern.compile("[\\w\\d\\s-]"),
    // https://github.com/SuperLaKer/spring-boot-base/blob/4d19a35ffc44d0818eee977e191693a24f40f688/buildSrc/src/main/java/org/springframework/boot/build/bom/bomr/version/ReleaseTrainDependencyVersion.java#L31
    Pattern.compile("([A-Z][a-z]+)-([A-Z]+)([0-9]*)"),
    // https://github.com/Khangbt/qlts/blob/e3394bf9fe716b4bd833f8a774e82fdeb0b4d834/services/project-service/src/main/java/com/hust/qlts/project/service/impl/HumanResourcesServiceImpl.java#L906
    Pattern.compile("^[a-zA-Z0-9]+$"),
    // https://github.com/wujun728/jdep_boot/blob/1362ed986c7c20567f078a900c954e4ae29e9ea9/jdepplus/jdep-common/src/main/java/com/ruoyi/common/json/JSONObject.java#L22
    Pattern.compile("(\\w+)((\\[\\d+\\])+)"),
    // https://github.com/Johnnydaboy/LazyReader/blob/94fedcc2a0c101d8c820da95f05cd8713f8f6677/src/edu/mit/jwi/item/Version.java#L406
    Pattern.compile("\\Q.\\E"),
    // https://github.com/Johnnydaboy/LazyReader/blob/94fedcc2a0c101d8c820da95f05cd8713f8f6677/src/edu/mit/jwi/item/Version.java#L410
    Pattern.compile("WordNet\\s+\\d+\\Q.\\E\\d+(\\Q.\\E\\d+)?\\s+Copyright"),
    // https://github.com/liershuang/mutool-view/blob/2cf4844511497a824348d8b373fc235fdea03f69/mutool-box-plugin/code-tools/WebSourcesTool/src/main/java/com/xwintop/xJavaFxTool/services/codeTools/WebSourcesToolService.java#L35
    Pattern.compile("src *= *['\"]*(\\S+)[\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/liershuang/mutool-view/blob/2cf4844511497a824348d8b373fc235fdea03f69/mutool-box-plugin/code-tools/WebSourcesTool/src/main/java/com/xwintop/xJavaFxTool/services/codeTools/WebSourcesToolService.java#L36
    Pattern.compile("href *= *['\"]*(\\S+)[\"']", Pattern.CASE_INSENSITIVE),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L14
    Pattern.compile(".s"),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L32
    Pattern.compile("[abc]"),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L37
    Pattern.compile("[abc]?"),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L42
    Pattern.compile("[A..Z]"),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L47
    Pattern.compile("[abc]*"),
    // https://github.com/Revina3105/bootcamp-java/blob/e5921ea6547baaf3974a62d56a48e09214b1e9f2/tests/co/g2academy/regex/RegexTest.java#L52
    Pattern.compile("[abc]+"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.file.storage.composition/src/com/openexchange/file/storage/composition/FilenameValidationUtils.java#L148
    Pattern.compile("(<)|(>)|(:)|(\\/)|(\\?)|(\\*)|(\\\")|(\\\\)|(\\|)"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.file.storage.composition/src/com/openexchange/file/storage/composition/FilenameValidationUtils.java#L150
    Pattern.compile("(^CON$)|(^PRN$)|(^AUX$)|(^NUL$)|(^COM[1-9]$)|(^LPT[1-9]$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.file.storage.composition/src/com/openexchange/file/storage/composition/FilenameValidationUtils.java#L152
    Pattern.compile("(^\\.$)|(^\\.\\.$)"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.file.storage.composition/src/com/openexchange/file/storage/composition/FilenameValidationUtils.java#L154
    Pattern.compile("(.*\\.$)|(.*\\s$)"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.admin/src/com/openexchange/admin/tools/GenericChecks.java#L247
    Pattern.compile("\\{"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.admin/src/com/openexchange/admin/tools/GenericChecks.java#L247
    Pattern.compile("\\}"),
    // https://github.com/open-xchange/appsuite-middleware/blob/5c28c5c9fef99adefc9cce7da39b400c3547e28d/com.openexchange.admin/src/com/openexchange/admin/tools/AdminCache.java#L592
    Pattern.compile("[\\?\\&]([\\p{ASCII}&&[^=\\&]]*)=([\\p{ASCII}&&[^=\\&]]*)"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L49
    Pattern.compile("\\$\\{([\\w\\d\\.\\:\\-]*)\\}"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L50
    Pattern.compile("(\\$\\{[\\w\\d\\.\\:\\-]*\\})"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L189
    Pattern.compile("\\{\\}"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L251
    Pattern.compile("\\/{2,}"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L281
    Pattern.compile("\\/"),
    // https://github.com/burningwave/core/blob/4d6b71774ba8cc5a1dd236477e6a76ebf246fb2c/src/main/java/org/burningwave/core/Strings.java#L341
    Pattern.compile("\\.(.*?)!\\/"),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestCounter.java#L87
    Pattern.compile("aaaaa"),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestCounter.java#L396
    Pattern.compile("a*"),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/main/java/net/bull/javamelody/internal/web/html/JavaHTMLizer.java#L45
    Pattern.compile("/\\*(.*?)\\*/", Pattern.DOTALL),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/main/java/net/bull/javamelody/internal/web/html/JavaHTMLizer.java#L48
    Pattern.compile("//(.*?)<br />", Pattern.DOTALL),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/main/java/net/bull/javamelody/internal/web/html/JavaHTMLizer.java#L51
    Pattern.compile("&quot;(.*?)&quot;"),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/main/java/net/bull/javamelody/internal/model/ProcessInformations.java#L36
    Pattern.compile("................"),
    // https://github.com/javamelody/javamelody/blob/e12d9c78d152229c976a91c7bf75bec0f45459b0/javamelody-core/src/main/java/net/bull/javamelody/internal/model/ProcessInformations.java#L37
    Pattern.compile("[0-9:]*"),
    // https://github.com/PEXPlugins/PermissionsEx/blob/805c3a7f12a54a2b638c046b5db39b66bc484f71/core/src/main/java/ca/stellardrift/permissionsex/backend/sql/dao/LegacyDao.java#L34
    Pattern.compile("\\{([^}]+)\\}"),
    // https://github.com/PEXPlugins/PermissionsEx/blob/805c3a7f12a54a2b638c046b5db39b66bc484f71/core/src/main/java/ca/stellardrift/permissionsex/backend/ConversionUtils.java#L29
    Pattern.compile("\\((.*?)\\)"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-websecurityscanner/v1/1.31.0/com/google/api/services/websecurityscanner/v1/WebSecurityScanner.java#L199
    Pattern.compile("^projects/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-websecurityscanner/v1/1.31.0/com/google/api/services/websecurityscanner/v1/WebSecurityScanner.java#L338
    Pattern.compile("^projects/[^/]+/scanConfigs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-websecurityscanner/v1/1.31.0/com/google/api/services/websecurityscanner/v1/WebSecurityScanner.java#L1148
    Pattern.compile("^projects/[^/]+/scanConfigs/[^/]+/scanRuns/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-websecurityscanner/v1/1.31.0/com/google/api/services/websecurityscanner/v1/WebSecurityScanner.java#L2042
    Pattern.compile("^projects/[^/]+/scanConfigs/[^/]+/scanRuns/[^/]+/findings/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-vectortile/v1/1.31.0/com/google/api/services/vectortile/v1/SemanticTile.java#L179
    Pattern.compile("^featuretiles/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-vectortile/v1/1.31.0/com/google/api/services/vectortile/v1/SemanticTile.java#L728
    Pattern.compile("^terraintiles/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-toolresults/v1beta3/1.31.0/com/google/api/services/toolresults/ToolResults.java#L2504
    Pattern.compile("^projects/[^/]+/histories/[^/]+/executions/[^/]+/steps/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-smartdevicemanagement/v1/1.31.0/com/google/api/services/smartdevicemanagement/v1/SmartDeviceManagement.java#L199
    Pattern.compile("^enterprises/[^/]+/devices/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-smartdevicemanagement/v1/1.31.0/com/google/api/services/smartdevicemanagement/v1/SmartDeviceManagement.java#L468
    Pattern.compile("^enterprises/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-smartdevicemanagement/v1/1.31.0/com/google/api/services/smartdevicemanagement/v1/SmartDeviceManagement.java#L691
    Pattern.compile("^enterprises/[^/]+/structures/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-smartdevicemanagement/v1/1.31.0/com/google/api/services/smartdevicemanagement/v1/SmartDeviceManagement.java#L1045
    Pattern.compile("^enterprises/[^/]+/structures/[^/]+/rooms/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v2/1.31.0/com/google/api/services/remotebuildexecution/v2/RemoteBuildExecution.java#L187
    Pattern.compile("^.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v2/1.31.0/com/google/api/services/remotebuildexecution/v2/RemoteBuildExecution.java#L1734
    Pattern.compile("^operations/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v1alpha/1.31.0/com/google/api/services/remotebuildexecution/v1alpha/RemoteBuildExecution.java#L338
    Pattern.compile("^projects/[^/]+/instances/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v1alpha/1.31.0/com/google/api/services/remotebuildexecution/v1alpha/RemoteBuildExecution.java#L1150
    Pattern.compile("^projects/[^/]+/instances/[^/]+/workerpools/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v1alpha/1.31.0/com/google/api/services/remotebuildexecution/v1alpha/RemoteBuildExecution.java#L1807
    Pattern.compile("^projects/[^/]+/operations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-remotebuildexecution/v1/1.31.0/com/google/api/services/remotebuildexecution/v1/RemoteBuildExecution.java#L818
    Pattern.compile("^operations$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-oslogin/v1beta/1.31.0/com/google/api/services/oslogin/v1beta/CloudOSLogin.java#L178
    Pattern.compile("^users/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-oslogin/v1beta/1.31.0/com/google/api/services/oslogin/v1beta/CloudOSLogin.java#L522
    Pattern.compile("^users/[^/]+/projects/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/21c11eb71a187214850eba280a1f29f592b7197c/clients/google-api-services-oslogin/v1beta/1.31.0/com/google/api/services/oslogin/v1beta/CloudOSLogin.java#L686
    Pattern.compile("^users/[^/]+/sshPublicKeys/[^/]+$"),
    // https://github.com/dddygin/intentional-learning/blob/aa80d942777a2bd5cadf7aacfe2d86fc1db86b7a/gupao3/spring/spring30/src/main/java/com/gin/spring/formework/webmvc/GDView.java#L34
    Pattern.compile("￥\\{[^\\}]+\\}", Pattern.CASE_INSENSITIVE),
    // https://github.com/dddygin/intentional-learning/blob/aa80d942777a2bd5cadf7aacfe2d86fc1db86b7a/gupao3/spring/spring30/src/main/java/com/gin/spring/formework/webmvc/GDView.java#L38
    Pattern.compile("￥\\{|\\}"),
    // https://github.com/palantir/palantir-java-format/blob/828e3d2fc5ef43333038c037c68fa2a15949547d/palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java#L3188
    Pattern.compile("%|\\{[0-9]\\}"),
    // https://github.com/15706058532/JavaApiDocs/blob/d577c98bd1e48011594d95043e74d3f1a3b0b8f4/src/main/java/com/citrsw/core/ApiContext.java#L915
    Pattern.compile("set"),
    // https://github.com/15706058532/JavaApiDocs/blob/d577c98bd1e48011594d95043e74d3f1a3b0b8f4/src/main/java/com/citrsw/core/ApiContext.java#L921
    Pattern.compile("get"),
    // https://github.com/15706058532/JavaApiDocs/blob/d577c98bd1e48011594d95043e74d3f1a3b0b8f4/src/main/java/com/citrsw/core/ApiContext.java#L923
    Pattern.compile("is"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/Workspace.java#L50
    Pattern.compile("Key event: KeyEvent.*?action=ACTION_DOWN.*?keyCode=KEYCODE_W.*?metaState=META_CTRL_ON"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/Workspace.java#L53
    Pattern.compile("Key event: KeyEvent.*?action=ACTION_UP.*?keyCode=KEYCODE_W.*?metaState=META_CTRL_ON"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/Workspace.java#L55
    Pattern.compile("onWorkspaceItemLongClick"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/Widget.java#L30
    Pattern.compile("Widgets.onLongClick"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/OverviewTask.java#L34
    Pattern.compile("startActivityFromRecentsAsync"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/LauncherInstrumentation.java#L101
    Pattern.compile("pilferPointers"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/LauncherInstrumentation.java#L102
    Pattern.compile("start:"),
    // https://github.com/HornbillOS/packages_apps_Launcher3/blob/7778bb5d834a1678669241dde7869703286b9fba/tests/tapl/com/android/launcher3/tapl/Background.java#L40
    Pattern.compile("onOverviewToggle"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/pipe/handlers/StringHelper.java#L135
    Pattern.compile("#\\([\\w\\s]+\\)"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/pipe/handlers/StringHelper.java#L144
    Pattern.compile("[#\\(\\)]"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/parser/ExprEvaluator.java#L152
    Pattern.compile(".*ceil\\(.*[0-9]*\\.+[0-9]+.*\\).*"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/parser/ExprEvaluator.java#L153
    Pattern.compile(".*[0-9]*\\.+[0-9]+.*"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/parser/ExprEvaluator.java#L156
    Pattern.compile(".*floor\\(.*[0-9]*\\.+[0-9]+.*\\).*"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/parser/ExprEvaluator.java#L165
    Pattern.compile(".*ceil\\(.*/.*\\).*"),
    // https://github.com/arutprakash/Petrinet-Analysis-on-WSN/blob/24bdaa6d07f06bb85df395ab5e9247c781ef8d7d/tools-src/PIPE-4.3.2/src/main/java/parser/ExprEvaluator.java#L167
    Pattern.compile(".*floor\\(.*/.*\\).*"),
    // https://github.com/apache/velocity-engine/blob/15429af72cf83b28859c3817d017aead4548b252/velocity-engine-core/src/test/java/org/apache/velocity/test/OldPropertiesTestCase.java#L68
    Pattern.compile("^([a-z._]+)\\s*=\\s*[^#]+.*$", Pattern.CASE_INSENSITIVE),
    // https://github.com/apache/velocity-engine/blob/15429af72cf83b28859c3817d017aead4548b252/velocity-engine-core/src/test/java/org/apache/velocity/test/OldPropertiesTestCase.java#L69
    Pattern.compile("^\\s*\\[warn\\]\\s*configuration key '([a-z._]+)' has been deprecated in favor of '([a-z._]+)'$", Pattern.CASE_INSENSITIVE),
    // https://github.com/henryodinaka/api-gateway/blob/a1bdc812fccc80a2791cfa3c36edf0f5789e27a5/src/main/java/ng/min/gateway/utils/Validation.java#L61
    Pattern.compile("[a-zA-Z]+"),
    // https://github.com/henryodinaka/api-gateway/blob/a1bdc812fccc80a2791cfa3c36edf0f5789e27a5/src/main/java/ng/min/gateway/utils/Validation.java#L89
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"),
    // https://github.com/henryodinaka/api-gateway/blob/a1bdc812fccc80a2791cfa3c36edf0f5789e27a5/src/main/java/ng/min/gateway/utils/Validation.java#L120
    Pattern.compile("[0-9]+"),
    // https://github.com/hammii/CatEmotion/blob/e83c1898385ad2b6c106b57fa79ca3267fc624ac/app/src/main/java/com/example/catemotion/SignUpActivity.java#L38
    Pattern.compile("^[a-zA-Z0-9!@.#$%^&*?_~]{4,16}$"),
    // https://github.com/inkarnadin/cms-check-component/blob/c118a495eebdd9dc31cc9327f733090984f83052/src/main/java/web/http/ResponseBodyHandler.java#L36
    Pattern.compile(".*charset=(.*)", Pattern.CASE_INSENSITIVE),
    // https://github.com/Mathieu-94/audit/blob/4a49364dde1f8953f7ee12d77fac33b7b477240f/src/main/java/fr/gendarmerie/stsisi/audit/controles/JsonControl.java#L23
    Pattern.compile("json.java"),
    // https://github.com/Mathieu-94/audit/blob/4a49364dde1f8953f7ee12d77fac33b7b477240f/src/main/java/fr/gendarmerie/stsisi/audit/controles/JavaControl.java#L15
    Pattern.compile("[\\w*].java"),
    // https://github.com/Mathieu-94/audit/blob/4a49364dde1f8953f7ee12d77fac33b7b477240f/src/main/java/fr/gendarmerie/stsisi/audit/controles/JavaControl.java#L31
    Pattern.compile("(.*)(ErrorJava)[\\s]*[=]{2}[\\s]*(-1)", Pattern.CASE_INSENSITIVE),
    // https://github.com/sepinf-inc/IPED/blob/580db86bb942ddd28a59946928925ca84689fd6c/iped-parsers/iped-parsers-impl/src/main/java/dpf/mg/udi/gpinf/whatsappextractor/WhatsAppParser.java#L117
    Pattern.compile("msgstore-\\d{4}-\\d{2}-\\d{2}"),
    // https://github.com/sepinf-inc/IPED/blob/580db86bb942ddd28a59946928925ca84689fd6c/iped-engine/src/main/java/dpf/sp/gpinf/indexer/process/task/LedKFFTask.java#L108
    Pattern.compile(" \\*"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L69
    Pattern.compile(",]"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L77
    Pattern.compile("[<](.+)[:]"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L79
    Pattern.compile("([a-zA-Z0-9]+[.][a-zA-Z0-9]+)\\$[0-9]+"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L80
    Pattern.compile("\\[(.+)\\]"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L81
    Pattern.compile("\\(\\)\\>\\[(\\d+)\\]"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L82
    Pattern.compile("<((?:[a-zA-Z0-9]+))>"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L83
    Pattern.compile("((?:[a-zA-Z0-9_]+))\\("),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L84
    Pattern.compile("\"{1}(.+)\"{1}"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L85
    Pattern.compile("^\\s?\\/{1}\\*{1}"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/src/main/java/util/Utils.java#L86
    Pattern.compile("^\\s?\\*{1}"),
    // https://github.com/dmcgrath19/Stocks/blob/a0ca29fa1d121fd680dad024020a73fbd95093ea/src/processing/java/util/DateTime.java#L26
    Pattern.compile("(?:(?:(\\d{4})[-\\s/](\\d{1,2})[-\\s/](\\d{1,2}))|(?:(\\d{1,2})[-\\s/](\\d{1,2})[-\\s/](\\d{4})))[.\\r\\n]*"),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/Notebook/Custom_Android_Tests/Signal-Android-3.5.0/src/org/thoughtcrime/securesms/service/SmsListener.java#L41
    Pattern.compile(".*Your TextSecure verification code: ([0-9]{3,4})-([0-9]{3,4}).*", Pattern.DOTALL),
    // https://github.com/CryptoGuardOSS/cryptoguard/blob/92551eebc9c9afbcd7c9556c3ae8ed268dbd6685/Notebook/Custom_Android_Tests/Signal-Android-3.5.0/src/org/thoughtcrime/securesms/database/XmlBackup.java#L155
    Pattern.compile("[^\u0020-\uD7FF]"),
    // https://github.com/smunozpintor/SDAIFramework/blob/b57581d903256c0d6cfefc7d9dd92e06dfe32eab/src/sdai/com/sis/utilidades/Util.java#L58
    Pattern.compile("^[-+]?\\d+(\\,\\d+)?$"),
    // https://github.com/smunozpintor/SDAIFramework/blob/b57581d903256c0d6cfefc7d9dd92e06dfe32eab/src/sdai/com/sis/utilidades/Util.java#L72
    Pattern.compile("\\d+$"),
    // https://github.com/gokulbhaveshjoshi/MSME/blob/8d422036bb6e134d50d745b90b23da625980e143/app/src/main/java/com/example/msme/PaymentActivity.java#L81
    Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]"),
    // https://github.com/SXS-PRIVATE/blog/blob/a65fba470155c0c71dee40e127979db7f65cfcde/src/main/java/cn/shu/blog/utils/HtmlUtil.java#L40
    Pattern.compile("<[pPhH][1]?>[^<>]+</[pPhH][1]?>"),
    // https://github.com/PetDiary/PetDiary/blob/880fec8696f29da19f36dc78ceb6b66b9935138c/PetDiary/app/src/main/java/com/example/petdiary/activity/SignUpActivity.java#L158
    Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$"),
    // https://github.com/PetDiary/PetDiary/blob/880fec8696f29da19f36dc78ceb6b66b9935138c/PetDiary/app/src/main/java/com/example/petdiary/activity/SignUpActivity.java#L169
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*\\W)(?=\\S+$).{8,20}$"),
    // https://github.com/PetDiary/PetDiary/blob/880fec8696f29da19f36dc78ceb6b66b9935138c/PetDiary/app/src/main/java/com/example/petdiary/activity/SignUpActivity.java#L180
    Pattern.compile("^[a-zA-Z0-9]*$"),
    // https://github.com/WoJiaoChaDi/youdaoDownload/blob/3970a0daa09f99d7a1fb65c3004112e70b46f9b7/src/main/java/Application.java#L87
    Pattern.compile("^\\b\\w*\\b"),
    // https://github.com/vaadin/flow/blob/18ee55985eaafba645535560d0ee7954406e2aa3/flow-server/src/main/java/com/vaadin/flow/server/StaticFileServer.java#L53
    Pattern.compile("^/frontend[-\\w/]*/webjars/"),
    // https://github.com/gocd/gocd/blob/45e25f04c9d74cd44f606250d081ad8074888ff0/server/src/test-integration/java/com/thoughtworks/go/config/CachedGoConfigIntegrationTest.java#L318
    Pattern.compile("^.*\\[(.*),\\s(.*)\\].*$"),
    // https://github.com/gocd/gocd/blob/45e25f04c9d74cd44f606250d081ad8074888ff0/server/src/test-integration/java/com/thoughtworks/go/config/CachedGoConfigIntegrationTest.java#L351
    Pattern.compile("^.*\\[(.*),\\s(.*)\\].*$", Pattern.MULTILINE | Pattern.DOTALL),
    // https://github.com/Softmotions/softmotions-java-commons/blob/4ca336ee9e2e63f73a874262e6164242a1f0efdc/weboot-jaxrs/src/main/java/com/softmotions/weboot/jaxrs/validator/JaxrsMethodValidator.java#L491
    Pattern.compile("^[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}$"),
    // https://github.com/Softmotions/softmotions-java-commons/blob/4ca336ee9e2e63f73a874262e6164242a1f0efdc/weboot-jaxrs/src/main/java/com/softmotions/weboot/jaxrs/validator/JaxrsMethodValidator.java#L529
    Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})$"),
    // https://github.com/Smiyu-web/java-FinalProject/blob/cdfd1687817c67e9c988e919be7d115ac120a260/Validator.java#L10
    Pattern.compile("^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$"),
    // https://github.com/Smiyu-web/java-FinalProject/blob/cdfd1687817c67e9c988e919be7d115ac120a260/Validator.java#L17
    Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$"),
    // https://github.com/LettuceFoot/Data-Communications/blob/f11f8e40387c4ba78cf4a6efb0aa310a6f26ce28/src/HTTPclient.java#L166
    Pattern.compile("[\\{\\}]"),
    // https://github.com/horseshoe/horseshoe/blob/4b827996389ace57775a049d53e3c7f5efde9d80/src/main/java/horseshoe/internal/Expression.java#L96
    Pattern.compile("(?:/(?s:/[^\\n\\x0B\\x0C\\r\\u0085\\u2028\\u2029]*|[*].*?[*]/)\\s*)", Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/4b827996389ace57775a049d53e3c7f5efde9d80/src/main/java/horseshoe/internal/Expression.java#L100
    Pattern.compile("(?:(?<hexsign>[-+]?)0[xX](?<hexadecimal>[0-9A-Fa-f_']+)|(?<decimal>[-+]?[0-9][0-9_']*))(?<isLong>[lL])?\\s*", Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/4b827996389ace57775a049d53e3c7f5efde9d80/src/main/java/horseshoe/internal/Expression.java#L104
    Pattern.compile("~/(?<nounicode>\\(\\?-U\\))?(?<regex>(?:[^/\\\\]|\\\\.)*)/\\s*", Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/4b827996389ace57775a049d53e3c7f5efde9d80/src/main/java/horseshoe/internal/Expression.java#L105
    Pattern.compile("(?:\"(?<string>(?:[^\"\\\\]|\\\\[\\\\\"'btnfr{}0]|\\\\x[0-9A-Fa-f]|\\\\u[0-9A-Fa-f]{4}|\\\\U[0-9A-Fa-f]{8})*)\"|'(?<unescapedString>(?:[^']|'')*)')\\s*", Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/horseshoe/horseshoe/blob/4b827996389ace57775a049d53e3c7f5efde9d80/src/main/java/horseshoe/internal/Expression.java#L1173
    Pattern.compile("\\s*[.]\\s*", Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS),
    // https://github.com/noear/Water/blob/6e0485b47c1f267616b6c04be0be386f48470449/wateradmin/src/main/java/wateradmin/controller/tool/ReportController.java#L38
    Pattern.compile("\\s+limit\\s+(\\d+)"),
    // https://github.com/roschel/senac-estrutura-de-dados/blob/5fe9535dc7052c6ea15261d941e93c769ba7c152/src/Projeto_Conta_Palavras/FreqPalavras.java#L92
    Pattern.compile("[^a-zA-Z0-9áàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]"),
    // https://github.com/mosmetro-android/mosmetro-android/blob/779e36adf9df312fe9421a23937483a433155d32/app/src/main/java/pw/thedrhax/mosmetro/authenticator/providers/MosMetroV2WV.java#L165
    Pattern.compile("https?://auth\\.wi-fi\\.ru/(auth|metro|(spb/)?new)(\\?.*)?"),
    // https://github.com/Wrongass/TvoiSosed/blob/dfe53ba6d0dd59421a36b04bcd3b9aa2d4ac6729/app/src/main/java/com/example/moisosed/Validation.java#L15
    Pattern.compile("^(?=.*[0-9]).{1,}$"),
    // https://github.com/Wrongass/TvoiSosed/blob/dfe53ba6d0dd59421a36b04bcd3b9aa2d4ac6729/app/src/main/java/com/example/moisosed/Validation.java#L16
    Pattern.compile("^(?=.*[a-z,а-я])(?=.*[A-Z,А-Я]).{1,}$"),
    // https://github.com/Wrongass/TvoiSosed/blob/dfe53ba6d0dd59421a36b04bcd3b9aa2d4ac6729/app/src/main/java/com/example/moisosed/Validation.java#L17
    Pattern.compile("^(?=\\S+$).{1,}$"),
    // https://github.com/Wrongass/TvoiSosed/blob/dfe53ba6d0dd59421a36b04bcd3b9aa2d4ac6729/app/src/main/java/com/example/moisosed/Validation.java#L18
    Pattern.compile("^.{6,25}$"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2012/%E9%94%80%E5%94%AE%E7%AE%A1%E7%90%86/%E4%BB%A3%E7%A0%81/sesale/src/com/toft/widgets/sys/io/check/BUsinessNewRateCheck.java#L13
    Pattern.compile("^\\d+\\.\\d+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1p4beta1/1.31.0/com/google/api/services/cloudasset/v1p4beta1/CloudAsset.java#L184
    Pattern.compile("^[^/]+/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1beta1/1.31.0/com/google/api/services/cloudasset/v1beta1/CloudAsset.java#L184
    Pattern.compile("^folders/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1beta1/1.31.0/com/google/api/services/cloudasset/v1beta1/CloudAsset.java#L352
    Pattern.compile("^folders/[^/]+/operations/[^/]+/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1beta1/1.31.0/com/google/api/services/cloudasset/v1beta1/CloudAsset.java#L521
    Pattern.compile("^organizations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1beta1/1.31.0/com/google/api/services/cloudasset/v1beta1/CloudAsset.java#L937
    Pattern.compile("^organizations/[^/]+/operations/[^/]+/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1beta1/1.31.0/com/google/api/services/cloudasset/v1beta1/CloudAsset.java#L1522
    Pattern.compile("^projects/[^/]+/operations/[^/]+/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1/1.31.0/com/google/api/services/cloudasset/v1/CloudAsset.java#L329
    Pattern.compile("^[^/]+/[^/]+/feeds/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/954417cda5566b9c68dc5afd6cb33139b7bae98e/clients/google-api-services-cloudasset/v1/1.31.0/com/google/api/services/cloudasset/v1/CloudAsset.java#L950
    Pattern.compile("^[^/]+/[^/]+/operations/[^/]+/.*$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-deploymentmanager/v2beta/1.31.0/com/google/api/services/deploymentmanager/DeploymentManager.java#L178
    Pattern.compile("(?:(?:[-a-z0-9]{1,63}\\.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?))"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-deploymentmanager/v2beta/1.31.0/com/google/api/services/deploymentmanager/DeploymentManager.java#L181
    Pattern.compile("[a-z](?:[-a-z0-9_.]{0,61}[a-z0-9])?"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-deploymentmanager/v2beta/1.31.0/com/google/api/services/deploymentmanager/DeploymentManager.java#L1299
    Pattern.compile("[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-deploymentmanager/v2beta/1.31.0/com/google/api/services/deploymentmanager/DeploymentManager.java#L1794
    Pattern.compile("(?:(?:[-a-z0-9]{1,63}\\.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-deploymentmanager/v2beta/1.31.0/com/google/api/services/deploymentmanager/DeploymentManager.java#L1797
    Pattern.compile("[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L329
    Pattern.compile("^projects/[^/]+/annotationSpecSets/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L969
    Pattern.compile("^projects/[^/]+/datasets/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L1729
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/annotatedDatasets/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L2248
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/annotatedDatasets/[^/]+/dataItems/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L2632
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/annotatedDatasets/[^/]+/examples/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L3042
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/annotatedDatasets/[^/]+/feedbackThreads/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L3690
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/annotatedDatasets/[^/]+/feedbackThreads/[^/]+/feedbackMessages/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L4207
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/dataItems/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L4591
    Pattern.compile("^projects/[^/]+/datasets/[^/]+/evaluations/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L5550
    Pattern.compile("^projects/[^/]+/evaluationJobs/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-datalabeling/v1beta1/1.31.0/com/google/api/services/datalabeling/v1beta1/DataLabeling.java#L6933
    Pattern.compile("^projects/[^/]+/instructions/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-containeranalysis/v1beta1/1.31.0/com/google/api/services/containeranalysis/v1beta1/ContainerAnalysis.java#L494
    Pattern.compile("^projects/[^/]+/notes/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-containeranalysis/v1beta1/1.31.0/com/google/api/services/containeranalysis/v1beta1/ContainerAnalysis.java#L2091
    Pattern.compile("^projects/[^/]+/occurrences/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-containeranalysis/v1alpha1/1.31.0/com/google/api/services/containeranalysis/v1alpha1/ContainerAnalysis.java#L4113
    Pattern.compile("^providers/[^/]+$"),
    // https://github.com/googleapis/google-api-java-client-services/blob/85d00238f96a3139ed8a76be64020c0e1f2dadb2/clients/google-api-services-containeranalysis/v1alpha1/1.31.0/com/google/api/services/containeranalysis/v1alpha1/ContainerAnalysis.java#L4279
    Pattern.compile("^providers/[^/]+/notes/[^/]+$"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/transport/handler/AbstractHttpSendingTransportHandler.java#L51
    Pattern.compile("[0-9A-Za-z_\\.]*"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-webmvc/src/main/java/org/springframework/web/servlet/view/RedirectView.java#L89
    Pattern.compile("\\{([^/]+?)\\}"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-webmvc/src/main/java/org/springframework/web/servlet/resource/AbstractVersionStrategy.java#L123
    Pattern.compile("-(\\S*)\\."),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/util/pattern/RegexPathElement.java#L38
    Pattern.compile("\\?|\\*|\\{((?:\\{[^/]+?\\}|[^/{}]|\\\\[{}])+?)\\}"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L92
    Pattern.compile("^(([^:/?#]+):)?(//(([^@\\[/?#]*)@)?(\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]|[^\\[/?#:]*)(:(\\d*(?:\\{[^/]+?\\})?))?)?([^?#]*)(\\?([^#]*))?(#(.*))?"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L96
    Pattern.compile("^(?i)(http|https):(//(([^@\\[/?#]*)@)?(\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]|[^\\[/?#:]*)(:(\\d*(?:\\{[^/]+?\\})?))?)?([^?#]*)(\\?(.*))?"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L99
    Pattern.compile("host=\"?([^;,\"]+)\"?"),
    // https://github.com/Mshuyan/kaikeba/blob/6c89de0e980bec13265ba9222532bc8da33cd215/3.VIP%E8%AF%BE%E7%A8%8B/01.Spring/%E8%AF%BE%E4%BB%B6/2020-09-30/19%E6%9C%9FSpring%200930/spring-framework-5.1.x/spring-web/src/main/java/org/springframework/web/util/UriComponentsBuilder.java#L101
    Pattern.compile("proto=\"?([^;,\"]+)\"?"),
    // https://github.com/quarkusio/quarkus/blob/4db67556839a7ef7072515539d226b872e2467c6/extensions/hibernate-validator/deployment/src/main/java/io/quarkus/hibernate/validator/deployment/HibernateValidatorProcessor.java#L111
    Pattern.compile("\\$List$"),
    // https://github.com/sailfishos-mirror/icu/blob/1aa229daff95302f87f2abe6355aaf6e57a5df80/icu4j/main/tests/core/src/com/ibm/icu/dev/test/util/ULocaleTest.java#L1026
    Pattern.compile("^\\p{Lower}{2,3}$"),
    // https://github.com/sailfishos-mirror/icu/blob/1aa229daff95302f87f2abe6355aaf6e57a5df80/icu4j/main/classes/core/src/com/ibm/icu/util/ULocale.java#L122
    Pattern.compile("^und(?=$|[_-])", Pattern.CASE_INSENSITIVE),
    // https://github.com/sailfishos-mirror/icu/blob/1aa229daff95302f87f2abe6355aaf6e57a5df80/icu4j/main/classes/core/src/com/ibm/icu/util/ULocale.java#L3664
    Pattern.compile("[0-9a-zA-Z]+"),
    // https://github.com/sailfishos-mirror/icu/blob/1aa229daff95302f87f2abe6355aaf6e57a5df80/icu4j/main/classes/core/src/com/ibm/icu/util/ULocale.java#L3709
    Pattern.compile("[0-9a-zA-Z]+([_/\\-][0-9a-zA-Z]+)*"),
    // https://github.com/lvzitao/code-note/blob/d6db6e7ea70178334ee328d951d196583a0d8870/src/main/java/com/lvzitao/code/util/encode/EncodeUtils.java#L27
    Pattern.compile("[\\u4E00-\\u9FA5]+"),
    // https://github.com/hosudan/ParsingTeamDanSebastian/blob/f4f4de13f96e95ec62423fa44f7e356c3e214da7/src/ubbcluj/Model/SScanner.java#L89
    Pattern.compile("^[a-zA-Z][a-zA-Z0-9]{0,249}"),
    // https://github.com/hosudan/ParsingTeamDanSebastian/blob/f4f4de13f96e95ec62423fa44f7e356c3e214da7/src/ubbcluj/Model/SScanner.java#L101
    Pattern.compile("\"(\\.|[^\"])*\""),
    // https://github.com/hosudan/ParsingTeamDanSebastian/blob/f4f4de13f96e95ec62423fa44f7e356c3e214da7/src/ubbcluj/Model/SScanner.java#L107
    Pattern.compile("^'[a-zA-Z0-9]*'$"),
    // https://github.com/hosudan/ParsingTeamDanSebastian/blob/f4f4de13f96e95ec62423fa44f7e356c3e214da7/src/ubbcluj/Model/SScanner.java#L112
    Pattern.compile("[-]?\\d+"),
    // https://github.com/hosudan/ParsingTeamDanSebastian/blob/f4f4de13f96e95ec62423fa44f7e356c3e214da7/src/ubbcluj/Model/SScanner.java#L244
    Pattern.compile("[^\\S\\r\\n]+"),
    // https://github.com/openrewrite/rewrite-java-8/blob/b9acf3eac38fe2c67175acdc3ee9f663f6b489a5/src/main/java/org/openrewrite/java/ReloadableJava8ParserVisitor.java#L887
    Pattern.compile("\\G(\\s*)\\[(\\s*)]"),
    // https://github.com/openrewrite/rewrite-java-8/blob/b9acf3eac38fe2c67175acdc3ee9f663f6b489a5/src/main/java/org/openrewrite/java/ReloadableJava8ParserVisitor.java#L1200
    Pattern.compile("(\\s*)\\.{3}"),
    // https://github.com/kuldipbharadva/andylib/blob/a52768b8898e6dc41d06edec82261b64bd121ae4/app/src/main/java/com/example/libusage/utilities/Validations.java#L70
    Pattern.compile("[$&+:;=\\\\?@#|/'<>^*()%!]"),
    // https://github.com/TheBusyBiscuit/CS-CoreLib2/blob/c9626437a538f9672b97b6a2483146b9eef0dea0/src/main/java/io/github/thebusybiscuit/cscorelib2/players/MinecraftAccount.java#L23
    Pattern.compile("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})"),
    // https://github.com/TheBusyBiscuit/CS-CoreLib2/blob/c9626437a538f9672b97b6a2483146b9eef0dea0/src/main/java/io/github/thebusybiscuit/cscorelib2/players/MinecraftAccount.java#L26
    Pattern.compile("[\\w_]+"),
    // https://github.com/gradle/gradle/blob/19d5204ae9bc43b22c276ece0965ba7ef91c5da3/subprojects/dependency-management/src/main/java/org/gradle/api/internal/std/DefaultDependenciesAccessors.java#L70
    Pattern.compile("[a-z]([a-z0-9\\-])*"),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/tokenize/blocks/PlainTokenizeToTextBlocksPipe.java#L532
    Pattern.compile("^\\[(.*)\\]\\s+"),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L29
    Pattern.compile("^(•)(\\s+\\w|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L34
    Pattern.compile("^(X{0,1}(IX|IV|V?I{0,3}))\\.(\\s+\\w|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L39
    Pattern.compile("^\\((X{0,1}(IX|IV|V?I{0,3}))\\)(\\s+\\w|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L45
    Pattern.compile("^([a-z0-9])\\.(\\s+\\w|$)"),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L49
    Pattern.compile("^\\(([A-Z0-9][0-9]{0,1})\\)(\\s+\\w|$)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/ItemizeItemModule.java#L55
    Pattern.compile("^([A-Z0-9])\\.(\\s+\\w|$)"),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/CaptionModule.java#L29
    Pattern.compile("^(fig(\\.?|ure)|abbildung)\\s*\\d+", Pattern.CASE_INSENSITIVE),
    // https://github.com/ad-freiburg/pdfact/blob/23de3c14a62cdde638532e77f131164cd889aa1d/pdfact-core/src/main/java/pdfact/core/pipes/semanticize/modules/CaptionModule.java#L33
    Pattern.compile("^(table|tabelle)\\s*\\d+(\\.|:)", Pattern.CASE_INSENSITIVE),
    // https://github.com/ThuyNguyen2601/Appium/blob/7e2265edacc8e177b202139c1308ea0066cb5ce6/sources/demoMavenProject/libs/log4j-1.2.17/apache-log4j-1.2.17/tests/src/java/org/apache/log4j/util/EnhancedLineNumberFilter.java#L28
    Pattern.compile("\\(.*:\\d{1,4}\\)"),
    // https://github.com/ThuyNguyen2601/Appium/blob/7e2265edacc8e177b202139c1308ea0066cb5ce6/sources/demoMavenProject/libs/log4j-1.2.17/apache-log4j-1.2.17/tests/src/java/org/apache/log4j/util/EnhancedLineNumberFilter.java#L29
    Pattern.compile("\\(Native Method\\)"),
    // https://github.com/thomasstodonte/Ligue1Statistant/blob/6d6a6d41194b7aa71186c8303bd31517f87199d0/src/com/statistant/ligue1/utils/Ligue1Utils.java#L329
    Pattern.compile("^[0-9]-[0-9]$"),
    // https://github.com/nlm-malaria/MalariaScreener/blob/b0658cd8c9ad70100e13374035b114af05198e4b/app/src/main/java/gov/nih/nlm/malaria_screener/frontEnd/baseClass/PatientInfoBaseActivity.java#L85
    Pattern.compile("^[a-zA-Z ]+$"),
    // https://github.com/DotOS/android_packages_apps_Settings/blob/9204d2f044adb187c20cc09f3a89107a92a37ed4/tests/robotests/src/com/android/settings/testutils/shadow/ShadowOs.java#L35
    Pattern.compile("^\\d{1,3}(\\.\\d{1,3}){3}$"),
    // https://github.com/DotOS/android_packages_apps_Settings/blob/9204d2f044adb187c20cc09f3a89107a92a37ed4/tests/robotests/src/com/android/settings/testutils/shadow/ShadowOs.java#L37
    Pattern.compile("^[0-9a-f]{1,4}(:[0-9a-f]{0,4}){0,6}$"),
    // https://github.com/DotOS/android_packages_apps_Settings/blob/9204d2f044adb187c20cc09f3a89107a92a37ed4/tests/robotests/src/com/android/settings/core/codeinspection/ClassScanner.java#L43
    Pattern.compile(".*\\$\\d+.*"),
    // https://github.com/DotOS/android_packages_apps_Settings/blob/9204d2f044adb187c20cc09f3a89107a92a37ed4/tests/perftests/src/com/android/settings/tests/perf/LaunchSettingsTest.java#L59
    Pattern.compile("TotalTime:\\s[0-9]*"),
    // https://github.com/TimurDubov/JavaRush/blob/7786877b7a81496ef46498a1c911352cc8eb4cc8/questtwo/ninthlevel/lecture5/Punctuation.java#L12
    Pattern.compile("\\p{P}"),
    // https://github.com/Efaker/FakerAndroid/blob/13ecf9e384907259b59798ee4de7abbba0f2be00/brut.apktool/apktool-lib/src/main/java/brut/androlib/Androlib.java#L839
    Pattern.compile("(jpg|jpeg|png|gif|wav|mp2|mp3|ogg|aac|mpg|mpeg|mid|midi|smf|jet|rtttl|imy|xmf|mp4|m4a|m4v|3gp|3gpp|3g2|3gpp2|amr|awb|wma|wmv|webm|mkv)$"),
    // https://github.com/johndee850/property_recommender/blob/3dc48128b70b09d210bcc46f86175d6328aab6ac/app/src/main/java/com/example/johndee/myapplication/HtmlLinks.java#L240
    Pattern.compile("[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]"),
    // https://github.com/johndee850/property_recommender/blob/3dc48128b70b09d210bcc46f86175d6328aab6ac/app/src/main/java/com/example/johndee/myapplication/HtmlLinks.java#L241
    Pattern.compile("[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]"),
    // https://github.com/johndee850/property_recommender/blob/3dc48128b70b09d210bcc46f86175d6328aab6ac/app/src/main/java/com/example/johndee/myapplication/HtmlLinks.java#L242
    Pattern.compile("[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]"),
    // https://github.com/DDFipZ/Sem5SoftwareMaintenance/blob/e6efae746242372a68d95f1353e83ae32d307477/JHotDraw/src/main/java/org/jhotdraw/text/ColorFormatter.java#L79
    Pattern.compile("^\\s*#\\s*([0-9a-fA-F]{3,6})\\s*$"),
    // https://github.com/DDFipZ/Sem5SoftwareMaintenance/blob/e6efae746242372a68d95f1353e83ae32d307477/JHotDraw/src/main/java/org/jhotdraw/text/ColorFormatter.java#L83
    Pattern.compile("^\\s*([0-9]{1,3})\\s*,\\s*([0-9]{1,3}),\\s*([0-9]{1,3})\\s*$"),
    // https://github.com/spdx/LicenseListPublisher/blob/23ff8ef1a8bf5aff20944b2e2571c28f44056f14/src/org/spdx/htmltemplates/LicenseHTMLFile.java#L61
    Pattern.compile("http://(.*)\\.(.*)(\\.org|\\.com|\\.net|\\.info)"),
    // https://github.com/guanhaixie/bitQL/blob/0a29246764b7ed1a7fbdbdd15f8bb06dccf7d4a9/xuanYue-seach/src/main/java/com/xuanyue/db/xuan/antlr/BitQLexer.java#L105
    Pattern.compile("parallel\\s*?\\(\\s*?(\\d+?)\\s*?\\)"),
    // https://github.com/guanhaixie/bitQL/blob/0a29246764b7ed1a7fbdbdd15f8bb06dccf7d4a9/xuanYue-seach/src/main/java/com/xuanyue/db/xuan/antlr/BitQLexer.java#L106
    Pattern.compile("/\\*(.*?)\\*/"),
    // https://github.com/polygloat/server/blob/72584b708e0d7b5acb1aa68395e6e1be40ee805c/src/main/java/io/polygloat/helpers/TextHelper.java#L34
    Pattern.compile("\\\\?\\\\?"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L137
    Pattern.compile("^.+(.JPEG|.jpeg|.JPG|.jpg|.PNG|.png|.GIF|.gif)$"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L150
    Pattern.compile("drop\\s|alter\\s|grant\\s|insert\\s|replace\\s|delete\\s|truncate\\s|update\\s|remove\\s"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L153
    Pattern.compile("((?i)WITH[\\s\\S]+(?i)AS?\\s*\\([\\s\\S]+\\))\\s*(?i)SELECT"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L159
    Pattern.compile("(?ms)('(?:''|[^'])*')|--.*?$|/\\*[^+]*?\\*/"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L165
    Pattern.compile("^.*\\s*\\(.*\\)$"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L167
    Pattern.compile("jdbc:\\w+"),
    // https://github.com/edp963/davinci/blob/a0578f36e1638c9f29ff0c7fd576521e8a730697/server/src/main/java/edp/core/consts/Consts.java#L196
    Pattern.compile("[\\!\\\\\\/\\?\\*\\[\\]\\:]"),
    // https://github.com/VuiTung/javaassignment/blob/f1faa7509baee5bf9c8ec0e67b151c7ff166f8fd/javaassignment/src/main/java/emailvalidation.java#L10
    Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"),
    // https://github.com/YiChat/RongYunServer/blob/b3280f7ccdbb2f5309339ec5009d8b43bf0e8539/yichat-service/service-utils/src/main/java/com/zf/yichat/utils/common/GeneralUtils.java#L307
    Pattern.compile("[\u4e00-\u9fa5]"),
    // https://github.com/YiChat/RongYunServer/blob/b3280f7ccdbb2f5309339ec5009d8b43bf0e8539/yichat-service/service-utils/src/main/java/com/zf/yichat/utils/common/GeneralUtils.java#L334
    Pattern.compile(";\\s?(\\S*?\\s?\\S*?)\\s?(Build)?/"),
    // https://github.com/YiChat/RongYunServer/blob/b3280f7ccdbb2f5309339ec5009d8b43bf0e8539/yichat-service/service-utils/src/main/java/com/zf/yichat/utils/common/GeneralUtils.java#L366
    Pattern.compile("/[\\x{10000}-\\x{10FFFF}]/u"),
    // https://github.com/EricTownsChina/es_test/blob/4068fbce489a488aef668d8fd5728195e17bcdaf/src/main/java/com/fh/xhzx/znwd/common/utils/DateValidateUtil.java#L24
    Pattern.compile("^(\\d{4})(\\-)(\\d{2})(\\-)(\\d{2})(\\s+)(\\d{2})(\\:)(\\d{2})(\\:)(\\d{2})$"),
    // https://github.com/EricTownsChina/es_test/blob/4068fbce489a488aef668d8fd5728195e17bcdaf/src/main/java/com/fh/xhzx/znwd/common/utils/ContentOriginalUtil.java#L30
    Pattern.compile("(src|SRC)=(\"|\')(.*?)(\"|\')"),
    // https://github.com/jenkinsci/teamconcert-git-plugin/blob/f8d62c8985486b04092eb0031a042a8c5bc422da/com.ibm.team.git.build.hjplugin/src/main/java/com/ibm/team/git/build/hjplugin/http/HttpUtils.java#L157
    Pattern.compile("^[Jj][Aa][Uu][Tt][Hh]\\s+.*"),
    // https://github.com/jenkinsci/teamconcert-git-plugin/blob/f8d62c8985486b04092eb0031a042a8c5bc422da/com.ibm.team.git.build.hjplugin/src/main/java/com/ibm/team/git/build/hjplugin/http/HttpUtils.java#L159
    Pattern.compile("^[Bb][Aa][Ss][Ii][Cc]\\s+.*"),
    // https://github.com/jenkinsci/teamconcert-git-plugin/blob/f8d62c8985486b04092eb0031a042a8c5bc422da/com.ibm.team.git.build.hjplugin/src/main/java/com/ibm/team/git/build/hjplugin/http/HttpUtils.java#L1143
    Pattern.compile("(.*)bearer(.*)"),
    // https://github.com/TAJIKISTAN1/Java_TP_Labs_Work/blob/44781d6970aa5aa4df6855d704fa27cdd337bd70/Lab_3/%D0%9F%D1%80%D0%BE%D0%B5%D0%BA%D1%82/UrlScan.java#L7
    Pattern.compile("href=\"http://.+?\""),
    // https://github.com/mizjel/assignments/blob/b057d2847d7b195c8a222679536d5fb3eb839522/users/java-opdrachten/src/main/java/nl/sogyo/javaopdrachten/PasswordHelper.java#L7
    Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])"),
    // https://github.com/ChernykhVyacheslav/sprint14-spring-mvc/blob/618d6d09897c0a5726eb8a71f5f5fb75fcac264e/src/main/java/com/softserve/sprint14/dto/UserDTO.java#L40
    Pattern.compile("(?<=id=).+(?=, isClosed=)"),
    // https://github.com/ChernykhVyacheslav/sprint14-spring-mvc/blob/618d6d09897c0a5726eb8a71f5f5fb75fcac264e/src/main/java/com/softserve/sprint14/dto/UserDTO.java#L45
    Pattern.compile("(?<=id=).+"),
    // https://github.com/JetBrains/intellij-community/blob/122a70ff4d2b1add99a8da3db532a8ad99b0d348/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUtil.java#L126
    Pattern.compile("maven-\\d+\\.\\d+\\.\\d+-uber\\.jar"),
    // https://github.com/JetBrains/intellij-community/blob/122a70ff4d2b1add99a8da3db532a8ad99b0d348/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUtil.java#L127
    Pattern.compile("maven-model-builder-\\d+\\.\\d+\\.\\d+\\.jar"),
    // https://github.com/JetBrains/intellij-community/blob/122a70ff4d2b1add99a8da3db532a8ad99b0d348/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUtil.java#L405
    Pattern.compile("\\$\\{(.*)\\}"),
    // https://github.com/Meeds-io/gatein-portal/blob/2a4bd21accd5e188d97ba0782e007f8b3512cd03/component/web/security/src/main/java/org/exoplatform/web/login/externalRegistration/ExternalRegistrationHandler.java#L334
    Pattern.compile("[^\\p{ASCII}]"),
    // https://github.com/kelvinchua1998/OODP/blob/d87c99573fb46c9b5e77a9a43ff05e3271772f8b/classes/Main.java#L2381
    Pattern.compile("([01]?[0-9]|2[0-3])[0-5][0-9]"),
    // https://github.com/GSI-CS-CO/chart-fx/blob/a36e779ffa2dad469caec34c08837f4bfdc01536/chartfx-chart/src/main/java/de/gsi/chart/utils/StyleParser.java#L32
    Pattern.compile("[\"\']"),
    // https://github.com/GSI-CS-CO/chart-fx/blob/a36e779ffa2dad469caec34c08837f4bfdc01536/chartfx-chart/src/main/java/de/gsi/chart/utils/StyleParser.java#L33
    Pattern.compile("[=:]"),
    // https://github.com/fujaba/fulibMockups/blob/5a4c6cb5ae60e85b10839ef6109074a98ed0cc31/src/main/java/org/fulib/mockups/HtmlTool.java#L31
    Pattern.compile(".*?(\\d+)\\.html"),
    // https://github.com/fujaba/fulibMockups/blob/5a4c6cb5ae60e85b10839ef6109074a98ed0cc31/src/main/java/org/fulib/mockups/HtmlTool.java#L32
    Pattern.compile(".*?(\\d+)-(\\d+)\\.mockup\\.html"),
    // https://github.com/sorachan/MailmanMod/blob/6d533054620dde8e8bafd877d4f02f1b8444f056/app/src/main/java/me/dillbox/mailmanmod/MailmanParser.java#L53
    Pattern.compile("\\n\\t"),
    // https://github.com/sorachan/MailmanMod/blob/6d533054620dde8e8bafd877d4f02f1b8444f056/app/src/main/java/me/dillbox/mailmanmod/MailmanParser.java#L60
    Pattern.compile("(((\"(.*?)\"|(.*?)) )?<(.*?)>|(.*))"),
    // https://github.com/sorachan/MailmanMod/blob/6d533054620dde8e8bafd877d4f02f1b8444f056/app/src/main/java/me/dillbox/mailmanmod/MailmanParser.java#L63
    Pattern.compile("\\\\\""),
    // https://github.com/sorachan/MailmanMod/blob/6d533054620dde8e8bafd877d4f02f1b8444f056/app/src/main/java/me/dillbox/mailmanmod/MailmanParser.java#L87
    Pattern.compile("; (\\w{3}, [ ]?\\d{1,2} \\w{3} \\d{4} \\d{2}:\\d{2}:\\d{2} [+-]\\d{4})( \\(\\w{3,4}\\))?"),
    // https://github.com/sorachan/MailmanMod/blob/6d533054620dde8e8bafd877d4f02f1b8444f056/app/src/main/java/me/dillbox/mailmanmod/MailmanParser.java#L104
    Pattern.compile("(\\?|&)msgid=(\\d*)"),
    // https://github.com/bsilva3/EasyBDI/blob/214d9c85dbe41222991f6b6c353347d12b698b57/src/main/java/main_app/query_ui/QueryUI.java#L1540
    Pattern.compile("[0-9]\\s*=\\s*[0-9]"),
    // https://github.com/bsilva3/EasyBDI/blob/214d9c85dbe41222991f6b6c353347d12b698b57/src/main/java/main_app/query_ui/QueryUI.java#L1616
    Pattern.compile(";"),
    // https://github.com/bsilva3/EasyBDI/blob/214d9c85dbe41222991f6b6c353347d12b698b57/src/main/java/main_app/query_ui/QueryUI.java#L1617
    Pattern.compile("(?i)where"),
    // https://github.com/bananasmoothii/ScriptCommands/blob/dd1cb14cf84b3a956bcbdbc593e62af941ffc112/src/main/java/fr/bananasmoothii/scriptcommands/core/execution/StackTraceUtils.java#L8
    Pattern.compile("^(\\[*)(?:[^(]+\\.)?([^.(\\[<>]+(?:\\.<init>)?)(?:\\(.*\\))?$"),
    // https://github.com/feketebence/graph-coloring-GA/blob/0dc5757f53738963839feb54a4b8e515683043b8/src/main/java/communication/JsonParser.java#L37
    Pattern.compile("(\\{\"color\": [0-9]+, \"fixed\": (false|true), \"idx\": [0-9]+})"),
    // https://github.com/feketebence/graph-coloring-GA/blob/0dc5757f53738963839feb54a4b8e515683043b8/src/main/java/communication/JsonParser.java#L71
    Pattern.compile("(\\[[0-9]+, [0-9]+])+(,|)( |)"),
    // https://github.com/feketebence/graph-coloring-GA/blob/0dc5757f53738963839feb54a4b8e515683043b8/src/main/java/communication/JsonParser.java#L101
    Pattern.compile("\"GRID_SIZE\": [0-9]+"),
    // https://github.com/feketebence/graph-coloring-GA/blob/0dc5757f53738963839feb54a4b8e515683043b8/src/main/java/communication/JsonParser.java#L121
    Pattern.compile("\"SQ_GRID\": [0-9]+"),
    // https://github.com/Cristhiancd10/PasantiasAppFinal/blob/53305d433704bbb976d85bb7ca067d5da22e4943/platforms/android/CordovaLib/src/org/apache/cordova/ConfigXmlParser.java#L134
    Pattern.compile("^[a-z-]+://"),
    // https://github.com/denverallam/FoodVerse2.0/blob/760940f917ad09a9d0be846f08b6b07cd846c3ab/app/src/main/java/com/example/Food/app/Signup.java#L95
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$"),
    // https://github.com/denverallam/FoodVerse2.0/blob/760940f917ad09a9d0be846f08b6b07cd846c3ab/app/src/main/java/com/example/Food/app/Signup.java#L105
    Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"),
    // https://github.com/Legyver/logmire/blob/66daf0474615b4c06fbfcacb6a5555182b402d6b/src/main/java/com/legyver/logmire/task/openlog/LogLineAccumulator.java#L15
    Pattern.compile("^\\d{4}-\\d{2}-\\d{2}"),
    // https://github.com/Legyver/logmire/blob/66daf0474615b4c06fbfcacb6a5555182b402d6b/src/main/java/com/legyver/logmire/task/openlog/LogLineAccumulator.java#L27
    Pattern.compile("\\((([A-Za-z0-9.])*:(([0-9])*))\\)"),
    // https://github.com/Legyver/logmire/blob/66daf0474615b4c06fbfcacb6a5555182b402d6b/src/main/java/com/legyver/logmire/task/openlog/LogLineAccumulator.java#L31
    Pattern.compile("^\\d{1,2}:\\d{2}:\\d{2},\\d{3}"),
    // https://github.com/Legyver/logmire/blob/66daf0474615b4c06fbfcacb6a5555182b402d6b/src/main/java/com/legyver/logmire/task/openlog/LogLineAccumulator.java#L40
    Pattern.compile("\r\n"),
    // https://github.com/ayush-jaipuriar/1000DaysOfCode/blob/1f72d83fbfe0b9f7a6db2303a69157275af81878/tagContentExtractor.java#L15
    Pattern.compile("<(.+)>([^<]+)</\\1>"),
    // https://github.com/lucky-you/YoumaMall/blob/782a3a31b7bdc6ed5c4bd0a586ca2ea4f6e8bcd1/base_library/src/main/java/com/zhowin/base_library/utils/SpanUtils.java#L1430
    Pattern.compile("<script[^>]*?>[\\s\\S]*?<\\/script>", Pattern.CASE_INSENSITIVE),
    // https://github.com/lucky-you/YoumaMall/blob/782a3a31b7bdc6ed5c4bd0a586ca2ea4f6e8bcd1/base_library/src/main/java/com/zhowin/base_library/utils/SpanUtils.java#L1431
    Pattern.compile("<style[^>]*?>[\\s\\S]*?<\\/style>", Pattern.CASE_INSENSITIVE),
    // https://github.com/lucky-you/YoumaMall/blob/782a3a31b7bdc6ed5c4bd0a586ca2ea4f6e8bcd1/base_library/src/main/java/com/zhowin/base_library/utils/SpanUtils.java#L1432
    Pattern.compile("<[^>]+>", Pattern.CASE_INSENSITIVE),
    // https://github.com/pacinete/dspace-nuevainterfaz/blob/8a70fd7fd41bfce88614a94561ab4cbfd4626166/dspace-api/src/main/java/org/dspace/app/bulkedit/DSpaceCSV.java#L318
    Pattern.compile("([\\\\*+\\[\\](){}\\$.?\\^|])"),
    // https://github.com/pacinete/dspace-nuevainterfaz/blob/8a70fd7fd41bfce88614a94561ab4cbfd4626166/dspace-api/src/main/java/org/dspace/app/bulkedit/DSpaceCSV.java#L530
    Pattern.compile("\"\""),
    // https://github.com/cBioPortal/cbioportal/blob/94a822dab16b7dca6104711d7dbad158b32dab10/core/src/main/java/org/mskcc/cbio/portal/scripts/ImportTabDelimData.java#L909
    Pattern.compile("(p[STY][0-9]+(?:_[STY][0-9]+)*)"),
    // https://github.com/cBioPortal/cbioportal/blob/94a822dab16b7dca6104711d7dbad158b32dab10/core/src/main/java/org/mskcc/cbio/portal/dao/DaoMutation.java#L1361
    Pattern.compile("\\(\\s*(\\d+)\\s*,"),
    // https://github.com/danyavol/web-chat-server/blob/8c63cade78178af57137c343f6cf16438398455e/src/main/java/com/danvol/webchat/validation/UserValidation.java#L12
    Pattern.compile("(^[А-Я][а-я]{2,14}$|^[A-Z][a-z]{2,14}$)"),
    // https://github.com/danyavol/web-chat-server/blob/8c63cade78178af57137c343f6cf16438398455e/src/main/java/com/danvol/webchat/validation/UserValidation.java#L23
    Pattern.compile("^[a-z][0-9a-z]{3,9}$"),
    // https://github.com/danyavol/web-chat-server/blob/8c63cade78178af57137c343f6cf16438398455e/src/main/java/com/danvol/webchat/validation/UserValidation.java#L34
    Pattern.compile("^[0-9a-zA-Z]{4,20}$"),
    // https://github.com/spring-cloud/issue-bot/blob/2cba45feb2d7418cbfcd3ff4e65fac68e9ae4815/src/main/java/io/spring/issuebot/github/RegexLinkParser.java#L33
    Pattern.compile("<(.+)>; rel=\"(.+)\""),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/test/jdk/tools/jpackage/helpers/jdk/jpackage/test/LinuxHelper.java#L662
    Pattern.compile("\\s--size\\s+(\\d+)\\b"),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/test/jdk/tools/jpackage/helpers/jdk/jpackage/test/JPackageCommand.java#L861
    Pattern.compile("^\\[\\d\\d:\\d\\d:\\d\\d.\\d\\d\\d\\] "),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/src/jdk.jpackage/macosx/classes/jdk/jpackage/internal/MacBaseInstallerBundler.java#L179
    Pattern.compile("\"alis\"<blob>=\"([^\"]+)\""),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/src/jdk.jpackage/linux/classes/jdk/jpackage/internal/LinuxRpmBundler.java#L70
    Pattern.compile("[a-z\\d\\+\\-\\.\\_]+", Pattern.CASE_INSENSITIVE),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/src/jdk.jpackage/linux/classes/jdk/jpackage/internal/LinuxRpmBundler.java#L130
    Pattern.compile(" (\\d+\\.\\d+)"),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/src/jdk.jpackage/linux/classes/jdk/jpackage/internal/LinuxDebBundler.java#L68
    Pattern.compile("^[a-z][a-z\\d\\+\\-\\.]+"),
    // https://github.com/openjdk/mobile/blob/cfada56278fa6e04d27201744c6ff19c31ec5975/src/jdk.jpackage/linux/classes/jdk/jpackage/internal/LinuxDebBundler.java#L190
    Pattern.compile("^(^\\S+):"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L208
    Pattern.compile("^(,+)$"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L278
    Pattern.compile("[\",\\s]+"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L599
    Pattern.compile("[-+.^:,]"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L1147
    Pattern.compile("(?m)^([,]+)$"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L1430
    Pattern.compile("(\\((?:[^)(]+|\\((?:[^)(]+|\\([^)(]*\\))*\\))*\\))"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L1606
    Pattern.compile("(YN)|(NY)|N|Y"),
    // https://github.com/logbasex/a-little-bit-about-spring/blob/1321065f738ff9c0495c756c38c38ff79327d82f/src/main/java/com/tellyouiam/alittlebitaboutspring/service/note/v1/NoteServiceImpl.java#L2012
    Pattern.compile("[-]"),
    // https://github.com/eclipse/kitalpha/blob/ac329934973993089443166fb340bc325c566814/Docgen/business/plugins/org.polarsys.kitalpha.doc.gen.business.core/src/org/polarsys/kitalpha/doc/gen/business/core/task/IndexingConceptsTask.java#L76
    Pattern.compile("<table>(.*?)</table>", Pattern.DOTALL),
    // https://github.com/eclipse/kitalpha/blob/ac329934973993089443166fb340bc325c566814/Docgen/business/plugins/org.polarsys.kitalpha.doc.gen.business.core/src/org/polarsys/kitalpha/doc/gen/business/core/task/IndexingConceptsTask.java#L77
    Pattern.compile("<title>(.*)</title>", Pattern.DOTALL),
    // https://github.com/eclipse/kitalpha/blob/ac329934973993089443166fb340bc325c566814/Docgen/business/plugins/org.polarsys.kitalpha.doc.gen.business.core/src/org/polarsys/kitalpha/doc/gen/business/core/task/IndexingConceptsTask.java#L78
    Pattern.compile("<h1>(.*)</h1>", Pattern.DOTALL),
    // https://github.com/eclipse/kitalpha/blob/ac329934973993089443166fb340bc325c566814/Docgen/business/plugins/org.polarsys.kitalpha.doc.gen.business.core/src/org/polarsys/kitalpha/doc/gen/business/core/task/IndexingConceptsTask.java#L79
    Pattern.compile("<p>(.*?)</p>", Pattern.DOTALL),
    // https://github.com/eclipse/kitalpha/blob/ac329934973993089443166fb340bc325c566814/Docgen/business/plugins/org.polarsys.kitalpha.doc.gen.business.core/src/org/polarsys/kitalpha/doc/gen/business/core/task/IndexingConceptsTask.java#L80
    Pattern.compile("((<ul.*?>)|(</ul>))", Pattern.DOTALL),
    // https://github.com/Lv-549-TAQC-Java/codewarsTasks549/blob/2a545dfefa63d17332627648f5bd5df148babd48/src/com/ss/ita/kata/implementation/AndriiTurianskyi/SixImpl.java#L39
    Pattern.compile("\n|\r\n"),
    // https://github.com/Lv-549-TAQC-Java/codewarsTasks549/blob/2a545dfefa63d17332627648f5bd5df148babd48/src/com/ss/ita/kata/implementation/AndriiTurianskyi/SixImpl.java#L96
    Pattern.compile("(\\d+.\\d+)"),
    // https://github.com/start-cat/SMS-1/blob/c4bd429bda881b9f4facff8e3c1708f109270021/2012/%E9%94%80%E5%94%AE%E7%AE%A1%E7%90%86/%E4%BB%A3%E7%A0%81/sesale/src/com/isoftstone/modules/service/businessProcess/businessPersonWageMg/earningsTuneService.java#L745
    Pattern.compile("^[+-]?\\d*\\.?\\d{1,3}$"),
    // https://github.com/lwjhn/domino2sql/blob/504fa3090f76462c14922ceeea0c23d940788195/test/testArc.java#L133
    Pattern.compile("\\.[0-9a-z]+$", Pattern.CASE_INSENSITIVE),
    // https://github.com/FabioPetry18/senac-dd-20201-Projeto/blob/cec5c462fe252fc404fc11d2d33a64d05618d1b4/src/main/java/controller/PessoaController.java#L40
    Pattern.compile("^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE),
    // https://github.com/CMPUT301F20T04/BookAtMeNow/blob/3c2726df5807d0f08926afc892e2cde78b1c7ffd/app/src/main/java/ca/ualberta/cmput301f20t04/bookatmenow/ProfileActivity.java#L59
    Pattern.compile("^[\\w+&*-]+(?:\\.[\\w+&*-]+)*@(?:[\\p{Alnum}-]+\\.)+[a-zA-Z]{2,7}$"),
    // https://github.com/CMPUT301F20T04/BookAtMeNow/blob/3c2726df5807d0f08926afc892e2cde78b1c7ffd/app/src/main/java/ca/ualberta/cmput301f20t04/bookatmenow/ProfileActivity.java#L81
    Pattern.compile("^[\\w+&*-]+"),
    // https://github.com/pixelempiresmc/tinyempires/blob/469d78c650ba4ce9f159dc2d21df779867281647/src/main/java/dev/sucrose/tinyempires/discord/DiscordBot.java#L250
    Pattern.compile("[0-9]{3}-[0-9]{3}"),
    // https://github.com/bazelbuild/bazel/blob/72cd5b2de6c178077bd5178587de6a20e278dbe9/src/main/java/com/google/devtools/build/lib/actions/ExecutionRequirements.java#L132
    Pattern.compile("cpu:(.+)"),
    // https://github.com/splicemachine/spliceengine/blob/1483b89f360761ad57ac6ccffe4f39c3c8c9d1f9/splice_machine/src/test/java/com/splicemachine/derby/test/framework/SpliceUnitTest.java#L45
    Pattern.compile("totalCost=[0-9]+\\.?[0-9]*"),
    // https://github.com/splicemachine/spliceengine/blob/1483b89f360761ad57ac6ccffe4f39c3c8c9d1f9/splice_machine/src/test/java/com/splicemachine/derby/test/framework/SpliceUnitTest.java#L46
    Pattern.compile("outputRows=[0-9]+\\.?[0-9]*"),
    // https://github.com/splicemachine/spliceengine/blob/1483b89f360761ad57ac6ccffe4f39c3c8c9d1f9/splice_machine/src/test/java/com/splicemachine/derby/test/framework/SpliceUnitTest.java#L47
    Pattern.compile("scannedRows=[0-9]+\\.?[0-9]*"),
    // https://github.com/gradle/test-retry-gradle-plugin/blob/4746bee9acbbb6543b048e0aa2312e7a685ea641/plugin/src/main/java/org/gradle/testretry/internal/filter/GlobPattern.java#L23
    Pattern.compile("\\*"),
    // https://github.com/iTitus/advent-of-code/blob/788a95c7da342f10971c6244999cb0cb788cd6f0/src/main/java/io/github/ititus/aoc/aoc18/day04/Day04.java#L122
    Pattern.compile("\\[(?<y>\\d+)-(?<m>\\d+)-(?<d>\\d+) (?<h>\\d+):(?<min>\\d+)] Guard #(?<id>\\d+) begins shift"),
    // https://github.com/iTitus/advent-of-code/blob/788a95c7da342f10971c6244999cb0cb788cd6f0/src/main/java/io/github/ititus/aoc/aoc18/day04/Day04.java#L125
    Pattern.compile("\\[(?<y>\\d+)-(?<m>\\d+)-(?<d>\\d+) (?<h>\\d+):(?<min>\\d+)] falls asleep"),
    // https://github.com/iTitus/advent-of-code/blob/788a95c7da342f10971c6244999cb0cb788cd6f0/src/main/java/io/github/ititus/aoc/aoc18/day04/Day04.java#L128
    Pattern.compile("\\[(?<y>\\d+)-(?<m>\\d+)-(?<d>\\d+) (?<h>\\d+):(?<min>\\d+)] wakes up"),
    // https://github.com/iTitus/advent-of-code/blob/788a95c7da342f10971c6244999cb0cb788cd6f0/src/main/java/io/github/ititus/aoc/aoc18/day03/Day03.java#L117
    Pattern.compile("#(?<id>\\d+) @ (?<posX>\\d+),(?<posY>\\d+): (?<sizeX>\\d+)x(?<sizeY>\\d+)"),
    // https://github.com/cac2333/zookeeper/blob/a29e499cf160767cffd4dc97a78ca1a1e492de31/dist/DistProcess.java#L70
    Pattern.compile("([^/]+$)"),
    // https://github.com/DenizenScript/Denizen-Core/blob/a03e44fe085163e95b4fe631ddda086405559fb8/src/main/java/com/denizenscript/denizencore/objects/core/ElementTag.java#L205
    Pattern.compile("%"),
    // https://github.com/DenizenScript/Denizen-Core/blob/a03e44fe085163e95b4fe631ddda086405559fb8/src/main/java/com/denizenscript/denizencore/objects/core/ElementTag.java#L218
    Pattern.compile("(%)|(\\.\\d+)"),
    // https://github.com/SyedAnas26/chessgame/blob/3848c0cf41073463dc728e202ede1b329f3597bd/src/GameLogic/Managers/PlayPgnFileManager.java#L80
    Pattern.compile("\\[.*]"),
    // https://github.com/SyedAnas26/chessgame/blob/3848c0cf41073463dc728e202ede1b329f3597bd/src/GameLogic/Managers/PlayPgnFileManager.java#L84
    Pattern.compile("\\{.*?}"),
    // https://github.com/SyedAnas26/chessgame/blob/3848c0cf41073463dc728e202ede1b329f3597bd/src/GameLogic/Managers/PlayPgnFileManager.java#L88
    Pattern.compile(" \"\\\\(.*?)\""),
    // https://github.com/basicworld/rabbit-fast/blob/d6a1fcae3735b74fd5f67d2c95e6f15d2a28d727/src/main/java/com/rabbit/common/util/valid/ValidUtils.java#L24
    Pattern.compile("^[1]\\d{10}$"),
    // https://github.com/basicworld/rabbit-fast/blob/d6a1fcae3735b74fd5f67d2c95e6f15d2a28d727/src/main/java/com/rabbit/common/util/valid/ValidUtils.java#L39
    Pattern.compile("^\\s*?(.+)@(.+?)\\s*$"),
    // https://github.com/basicworld/rabbit-fast/blob/d6a1fcae3735b74fd5f67d2c95e6f15d2a28d727/src/main/java/com/rabbit/common/util/valid/ValidUtils.java#L104
    Pattern.compile("[0-9]*"),
    // https://github.com/Andres0x90/FinalProjectCS/blob/ee0fb1c09c0d2f45cb39a6bfa1d0d1748917e2c2/src/interfaz/frmReporte.java#L92
    Pattern.compile("(.)*\\:(\\d)(.)*"),
    // https://github.com/Flashrow/VotingSystem/blob/caf9fc1d5d298b653d77b4726b89fe29005734ac/src/pl/polsl/lab/testing/VotingTest.java#L84
    Pattern.compile("^\\d\\d\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$"),
    // https://github.com/MassBank/MassBank-web/blob/73d3eb07e841d250a1e6a3cebe85c945e0c01d1b/MassBank-Project/MassBank-lib/src/main/java/massbank/Record.java#L536
    Pattern.compile(".*(10\\.\\d{3,9}\\/[\\-\\._;\\(\\)\\/:a-zA-Z0-9]+[a-zA-Z0-9]).*"),
    // https://github.com/MassBank/MassBank-web/blob/73d3eb07e841d250a1e6a3cebe85c945e0c01d1b/MassBank-Project/MassBank-lib/src/main/java/massbank/Record.java#L537
    Pattern.compile(".*(PMID:[ ]?\\d{8,8}).*"),
    // https://github.com/exedio/util/blob/961f121ad59ca2161f4f49ac4218c530349c9d14/src/com/exedio/cope/util/Properties.java#L68
    Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})"),
    // https://github.com/chenjian-520/sparkDemo/blob/fe72e222460b792d6086972d2ae49f13c2543704/data-engine/src/test/java/com/foxconn/dpm/AppTest.java#L38
    Pattern.compile("DL.*"),
    // https://github.com/chenjian-520/sparkDemo/blob/fe72e222460b792d6086972d2ae49f13c2543704/data-engine/src/test/java/com/foxconn/dpm/AppTest.java#L42
    Pattern.compile("^\\d{4}\\-\\d{2}\\-\\d{2}$"),
    // https://github.com/chenjian-520/sparkDemo/blob/fe72e222460b792d6086972d2ae49f13c2543704/data-engine/src/main/java/com/foxconn/dpm/util/beanstruct/BeanGetter.java#L805
    Pattern.compile("[\\d]+"),
    // https://github.com/chenjian-520/sparkDemo/blob/fe72e222460b792d6086972d2ae49f13c2543704/data-engine/src/main/java/com/foxconn/dpm/util/batchData/BatchGetter.java#L1189
    Pattern.compile("^[\\d]+-[\\d]+-[\\d]+$"),
    // https://github.com/chenjian-520/sparkDemo/blob/fe72e222460b792d6086972d2ae49f13c2543704/data-engine/src/main/java/com/foxconn/dpm/util/batchData/BatchGetter.java#L1197
    Pattern.compile("^[\\d]+\\[\\d]+\\[\\d]+$"),
    // https://github.com/gnembon/fabric-carpet/blob/3aa646f5637dfe85badac8abb343ccc606d62342/src/main/java/carpet/utils/Messenger.java#L33
    Pattern.compile("#([0-9a-fA-F]{6})"),
    // https://github.com/HMHelloWorld/CCSLSketch/blob/b37e24397f05e7b95e74ae969fd27c11ed5a474f/src/SketchSynthesizer.java#L74
    Pattern.compile(".*void check\\(.*\\).*\\{"),
    // https://github.com/HMHelloWorld/CCSLSketch/blob/b37e24397f05e7b95e74ae969fd27c11ed5a474f/src/SketchSynthesizer.java#L77
    Pattern.compile(".*get([A-z]*)Count\\((.*)_count.*, (.*)_count.*,.*,.*, ([0-9]*), (.*)_count.*\\);"),
    // https://github.com/HMHelloWorld/CCSLSketch/blob/b37e24397f05e7b95e74ae969fd27c11ed5a474f/src/SketchSynthesizer.java#L108
    Pattern.compile(".*check([A-z]*)\\((.*)_count.*, (.*)_count.*,.*\\);"),
    // https://github.com/HMHelloWorld/CCSLSketch/blob/b37e24397f05e7b95e74ae969fd27c11ed5a474f/src/SketchSynthesizer.java#L118
    Pattern.compile(".*\\{.*"),
    // https://github.com/HMHelloWorld/CCSLSketch/blob/b37e24397f05e7b95e74ae969fd27c11ed5a474f/src/SketchSynthesizer.java#L123
    Pattern.compile(".*\\}.*"),
    // https://github.com/wangying929123925/old_security_android/blob/ab61f619d182fcb89a163454ad7b52d5fec88e14/app/src/main/java/com/example/ananops_android/util/BaseUtils.java#L447
    Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"),
    // https://github.com/wangying929123925/old_security_android/blob/ab61f619d182fcb89a163454ad7b52d5fec88e14/app/src/main/java/com/example/ananops_android/util/BaseUtils.java#L462
    Pattern.compile("^((13[0-9])|(15[^4,\\D])|(17[^4,\\D])|(18[0-9]))\\d{8}$"),
    // https://github.com/Isaac52/parallel_computing_lab/blob/f47afd466f5c97d57b0645b72d8736058bd3921c/test_harness.java#L14
    Pattern.compile(".*alt=\"([^\"]*)\".*"),
    // https://github.com/LuMolinari/Couch_Potato/blob/59509cde08fc3e099585307b33cbe40a788bb1bc/app/src/main/java/com/example/couchpotato/AccountSettingsFragment.java#L147
    Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}"),
    // https://github.com/GoogleCloudPlatform/functions-framework-java/blob/0921c6ca6e7d53e9f3195e87966bb6069d7a72af/invoker/core/src/test/java/com/google/cloud/functions/invoker/IntegrationTest.java#L452
    Pattern.compile("java-function-invoker-testfunction-.*-tests\\.jar"),
    // https://github.com/Zlimon/RuneManager-Plugin/blob/46fd6f29e9c1127d278220e3caf834d859c42df0/src/main/java/com/runemanager/RuneManagerPlugin.java#L74
    Pattern.compile("Obtained: <col=(.+?)>([0-9]+)/([0-9]+)</col>"),
    // https://github.com/Zlimon/RuneManager-Plugin/blob/46fd6f29e9c1127d278220e3caf834d859c42df0/src/main/java/com/runemanager/RuneManagerPlugin.java#L75
    Pattern.compile("(.+?): <col=(.+?)>([0-9]+)</col>"),
    // https://github.com/Zlimon/RuneManager-Plugin/blob/46fd6f29e9c1127d278220e3caf834d859c42df0/src/main/java/com/runemanager/RuneManagerPlugin.java#L76
    Pattern.compile("<col=(.+?)>(.+?)</col>"),
    // https://github.com/Zlimon/RuneManager-Plugin/blob/46fd6f29e9c1127d278220e3caf834d859c42df0/src/main/java/com/runemanager/RuneManagerPlugin.java#L77
    Pattern.compile(".*Your ([a-zA-Z]+) (?:level is|are)? now (\\d+)\\."),
    // https://github.com/Zlimon/RuneManager-Plugin/blob/46fd6f29e9c1127d278220e3caf834d859c42df0/src/main/java/com/runemanager/RuneManagerPlugin.java#L276
    Pattern.compile("[+.^:,']"),
    // https://github.com/VikalpRusia/MPsir/blob/d7f70f6652c5de567f41ed63c5fd67296ef2a938/src/main/java/controller/Controller.java#L1144
    Pattern.compile("^(.*?);*$"),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L121
    Pattern.compile("^(.*\\W?subject:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L134
    Pattern.compile("^(.*\\W?department:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L147
    Pattern.compile("^(.*\\W?area:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L160
    Pattern.compile("^(.*\\W?classification:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L173
    Pattern.compile("^(.*\\W?clasf:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L186
    Pattern.compile("^(.*\\W?major:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L189
    Pattern.compile("area:[ ]?\"([^\\\"]*)\"|area:[ ]?(\\w*)"),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L203
    Pattern.compile("^(.*\\W?course:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L206
    Pattern.compile("subject:[ ]?\"([^\\\"]*)\"|subject:[ ]?(\\w*)"),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L220
    Pattern.compile("^(.*\\W?number:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L238
    Pattern.compile("^(.*\\W?group:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L251
    Pattern.compile("^(.*\\W?accommodation:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L264
    Pattern.compile("^(.*\\W?student:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L274
    Pattern.compile("^(.*\\W?assigned:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L287
    Pattern.compile("^(.*\\W?scheduled:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L300
    Pattern.compile("^(.*\\W?waitlist:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L313
    Pattern.compile("^(.*\\W?waitlisted:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L326
    Pattern.compile("^(.*\\W?reservation:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L339
    Pattern.compile("^(.*\\W?reserved:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L352
    Pattern.compile("^(.*\\W?consent:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L403
    Pattern.compile("^(.*\\W?user:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L423
    Pattern.compile("^(.*\\W?operation:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L435
    Pattern.compile("^(.*\\W?op:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L447
    Pattern.compile("^(.*\\W?result:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L465
    Pattern.compile("^(.*\\W?status:[ ]?)(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L484
    Pattern.compile("^(.*[^: ][ ]+)?(\\w*)$", Pattern.CASE_INSENSITIVE),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L721
    Pattern.compile("^0+(?!$)"),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L853
    Pattern.compile("([0-9]+\\.?[0-9]*)([^0-9\\.].*)"),
    // https://github.com/UniTime/unitime/blob/78ed9c5beec71823314571b0b817824f204341ed/JavaSource/org/unitime/timetable/onlinesectioning/status/StatusPageSuggestionsAction.java#L872
    Pattern.compile("([0-9]+\\.?[0-9]*)\\.\\.([0-9]+\\.?[0-9]*)([^0-9].*)"),
    // https://github.com/atex-community-plugins/camel-post-to-escenic/blob/ef2b5b9bcfa7541db301043931f2471fdb930a38/src/main/java/com/atex/onecms/app/dam/integration/camel/component/escenic/EscenicImageProcessor.java#L72
    Pattern.compile("/*/"),
    // https://github.com/atex-community-plugins/camel-post-to-escenic/blob/ef2b5b9bcfa7541db301043931f2471fdb930a38/src/main/java/com/atex/onecms/app/dam/integration/camel/component/escenic/EscenicImageProcessor.java#L523
    Pattern.compile("escenic/content"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L26
    Pattern.compile("math\\.calc:.+"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L56
    Pattern.compile(".*[+\\-*/^]{2}.*"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L59
    Pattern.compile(".*(\\([^)]*|\\[[^]]*)"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L60
    Pattern.compile("([^(]*\\)|[^\\[]*]).*"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L64
    Pattern.compile("(\\(.+\\)|\\[.+])"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L68
    Pattern.compile("\\|.+\\|"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L72
    Pattern.compile("(\\(.+\\)|\\[.+]|\\|.+\\|)"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/variables/MathVariable.java#L127
    Pattern.compile("\\d+(\\.\\d+)?"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/utils/Utils.java#L164
    Pattern.compile("(?<!\\\\)\\\\n"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/utils/Utils.java#L212
    Pattern.compile("((?<!\\\\)\\\\n|\n)"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/utils/Utils.java#L212
    Pattern.compile("[&§][A-Ra-r0-9]"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/utils/Utils.java#L456
    Pattern.compile("&(?=[A-Ra-r0-9])"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/utils/Utils.java#L479
    Pattern.compile("(?:(?:(\\S*)(?:\")([^\"]*?)(?:\"))|(\\S+))\\s*"),
    // https://github.com/BetonQuest/BetonQuest/blob/a7d96024e79342882ef8759ff972ce2d3a5be4f1/src/main/java/pl/betoncraft/betonquest/Instruction.java#L31
    Pattern.compile("(?:\\s|\\G|^)((\\+|-)?\\d+)(?:\\s|$)"),
    // https://github.com/yohrdy243/EncomiendaApp/blob/d958200b8985afac6f93300e240e0010c2b6b377/EncomiendaApp/src/main/java/org/hashids/Hashids.java#L190
    Pattern.compile("^[0-9a-fA-F]+$"),
    // https://github.com/yohrdy243/EncomiendaApp/blob/d958200b8985afac6f93300e240e0010c2b6b377/EncomiendaApp/src/main/java/org/hashids/Hashids.java#L194
    Pattern.compile("[\\w\\W]{1,12}"),
    // https://github.com/Hunterszone/MyJavaGames/blob/54612fc98485af169ef707e3bdb0c4de7bf20c28/EvilGalaxy/src/main/java/util/ConsoleContent.java#L131
    Pattern.compile(".*\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b"),
    // https://github.com/andresfbastidas/qabackend/blob/9c2eb9e11d23004b969d26461cdee854cad523ed/src/main/java/co/edu/usbcali/wordsqa/utility/Utilities.java#L31
    Pattern.compile("[^0-9',.\\s]"),
    // https://github.com/andresfbastidas/qabackend/blob/9c2eb9e11d23004b969d26461cdee854cad523ed/src/main/java/co/edu/usbcali/wordsqa/utility/Utilities.java#L48
    Pattern.compile("(\\d){1,8}\\.(\\d){0,2}"),
    // https://github.com/andresfbastidas/qabackend/blob/9c2eb9e11d23004b969d26461cdee854cad523ed/src/main/java/co/edu/usbcali/wordsqa/utility/Utilities.java#L115
    Pattern.compile("[^A-Za-z0-9',.\\s]"),
    // https://github.com/smonier/tmdb-provider-b4/blob/b08db7139df549dfdcb57d17b6cdc157de5a1b13/src/main/java/org/jahia/modules/tmdbprovider/TMDBDataSource.java#L52
    Pattern.compile("[0-9]{4,4}"),
    // https://github.com/smonier/tmdb-provider-b4/blob/b08db7139df549dfdcb57d17b6cdc157de5a1b13/src/main/java/org/jahia/modules/tmdbprovider/TMDBDataSource.java#L53
    Pattern.compile("[0-9]{4,4}/[0-9]{2,2}"),
    // https://github.com/smonier/tmdb-provider-b4/blob/b08db7139df549dfdcb57d17b6cdc157de5a1b13/src/main/java/org/jahia/modules/tmdbprovider/TMDBDataSource.java#L341
    Pattern.compile("[a-z0-9]+"),
    // https://github.com/apache/hadoop/blob/f813f14b5b8f04824c1a04a29110b352f3493b34/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/job/impl/TaskAttemptImpl.java#L1872
    Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"),
    // https://github.com/rabestro/sololearn-challenges/blob/b826bde174db742e9318cdfd29cdb268409fd2ba/hard/pro-mathematics/Mathematics.java#L24
    Pattern.compile("(?<before>.*?)\\((?<inside>[^()]+)\\)(?<after>.*)"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L6
    Pattern.compile("[A-Z]{1}[A-za-z]{2,}"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L8
    Pattern.compile("^[a-z0-9]{1,}([_+.-][a-z0-9]){0,}@[a-z]{1,}.[a-z]{1,}(.[a-z])*"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L9
    Pattern.compile("^[1-9][0-9]\\s[1-9][0-9]{9}"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L10
    Pattern.compile(".{8,}"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L11
    Pattern.compile("(?=.*[A-Z]).{8,}$"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L12
    Pattern.compile("(?=.*[0-9])(?=.*[A-Z]).{8,}$"),
    // https://github.com/arjun17697/regex/blob/07a70739c7a94d3f77677ff4c8f95a8a8b1e92b2/com.bridgelabz/src/test/java/com/bridgelabz/UserValidator.java#L13
    Pattern.compile("^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$"),
    // https://github.com/takashiharano/util/blob/f88ef05d630cfe00cb10565f133777aa3cd23bd2/java/src/main/java/com/takashiharano/util/StrUtil.java#L389
    Pattern.compile("^0+"),
    // https://github.com/takashiharano/util/blob/f88ef05d630cfe00cb10565f133777aa3cd23bd2/java/src/main/java/com/takashiharano/util/StrUtil.java#L396
    Pattern.compile("0+$"),
    // https://github.com/GoogleCloudPlatform/cloud-spanner-r2dbc/blob/407355fa41e34a95ba8a74954ae32ac67e686f7c/cloud-spanner-r2dbc/src/main/java/com/google/cloud/spanner/r2dbc/SpannerConnectionConfiguration.java#L42
    Pattern.compile("projects\\/([\\w\\-]+)\\/instances\\/([\\w\\-]+)\\/databases\\/([\\w\\-]+)$"),
    // https://github.com/danielwahrn/market/blob/b0382ca63d06a7fe3774feb9123e1acefe82c496/app/src/main/java/com/brian/market/profile/EditProfile.java#L292
    Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"),
    // https://github.com/luciam9/universidad/blob/a4ab43975c6d67e8acf342eb39c2016419462e87/modelado/use-6.0.0/src/main/org/tzi/use/uml/sys/MSystemState.java#L432
    Pattern.compile("[$a-zA-Z_][a-zA-Z_0-9]*"),
    // https://github.com/luciam9/universidad/blob/a4ab43975c6d67e8acf342eb39c2016419462e87/modelado/use-6.0.0/src/main/org/tzi/use/main/shell/ShellUtil.java#L44
    Pattern.compile("([\"'])(.+?)\\1"),
    // https://github.com/luciam9/universidad/blob/a4ab43975c6d67e8acf342eb39c2016419462e87/modelado/use-6.0.0/src/main/org/tzi/use/main/shell/ShellUtil.java#L71
    Pattern.compile("[^\\s]"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Scanner.java#L382
    Pattern.compile("(?s).*"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Scanner.java#L386
    Pattern.compile("[\\p{javaDigit}&&[^0-9]]"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Scanner.java#L406
    Pattern.compile("true|false", Pattern.CASE_INSENSITIVE),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Scanner.java#L454
    Pattern.compile("\r\n|[\n\r\u2028\u2029\u0085]"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Scanner.java#L455
    Pattern.compile(".*(\r\n|[\n\r\u2028\u2029\u0085])|.+$"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Formatter.java#L2538
    Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/util/Currency.java#L265
    Pattern.compile("([A-Z]{3})\\s*,\\s*(\\d{3})\\s*,\\s*(\\d+)\\s*,?\\s*(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})?"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/time/Period.java#L150
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/time/Duration.java#L152
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", Pattern.CASE_INSENSITIVE),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/security/SecureRandom.java#L589
    Pattern.compile("\\s*([\\S&&[^:,]]*)(\\:([\\S&&[^,]]*))?\\s*(\\,(.*))?"),
    // https://github.com/bennieniu/catniu-service-study/blob/4774429385cbdc5b590b4a266108c7705a6b391d/src-jdk8/src/main/java/java/security/PKCS12Attribute.java#L44
    Pattern.compile("^[0-9a-fA-F]{2}(:[0-9a-fA-F]{2})+$"),
    // https://github.com/lightgh/code-gyming/blob/24cdac34a929e2a95eacdd855b91bacfe8318fb8/src/com/chinakalight/oraclepractice/exceptions/ScanInt1.java#L178
    Pattern.compile("^[0-9]+.*[0-9]+"),
    // https://github.com/realityforge/webtack/blob/35b05c516976a9c1d2ced3cbe71c6cb4ca6fd1a6/jsinterop-generator/src/main/java/org/realityforge/webtack/jsinterop/JsinteropAction.java#L78
    Pattern.compile("\\{@link ([^ }]*)"),
    // https://github.com/ninhnguyen375/DoAnLTM1/blob/a6e79c305c18cc1be47c608dce4a5e529efbf1fa/src/main/java/client/CPUSchedule/App/EastPanel_AddProcessPanel.java#L154
    Pattern.compile("^\\w+ \\d \\d$"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/idegen/src/com/android/idegen/DirectorySearch.java#L51
    Pattern.compile("values-..(-.*)*"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/idegen/src/Eclipse.java#L54
    Pattern.compile("^(?!out/)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L36
    Pattern.compile("\"(.*)\" sysTid=(\\d+)(.*)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L38
    Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L40
    Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+(\\(not attached\\))"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L43
    Pattern.compile("  \\| (.*)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L45
    Pattern.compile("  \\| (held mutexes=\\s*(.*))"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L47
    Pattern.compile("  (?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s+\\((.*)\\+(\\d+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L49
    Pattern.compile("  (?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L51
    Pattern.compile("  kernel: (.*)\\+0x([0-9a-fA-F]+)/0x([0-9a-fA-F]+)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L53
    Pattern.compile("  kernel: \\(couldn't read /proc/self/task/\\d+/stack\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L55
    Pattern.compile("  at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L57
    Pattern.compile("  at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L59
    Pattern.compile("  - locked \\<0x([0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L61
    Pattern.compile("  - sleeping on \\<0x([0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L63
    Pattern.compile("  - waiting on \\<0x([0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L65
    Pattern.compile("  - waiting to lock \\<0x([0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L67
    Pattern.compile("  - waiting to lock \\<0x([0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L70
    Pattern.compile("  - waiting to lock an unknown object"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L72
    Pattern.compile("  (\\(no managed stack frames\\))"),
    // https://github.com/RohieOS/platform_development/blob/c51f3d44cbc85eef01f765b58fe1e417c1958632/tools/bugreport/src/com/android/bugreport/stacks/ThreadSnapshotParser.java#L77
    Pattern.compile("  \\| sysTid=(\\d+) .*"),
  };
}
