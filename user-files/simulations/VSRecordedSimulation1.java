
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class VSRecordedSimulation1 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://test.victoriassecret.com")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_0.put("Accept-Encoding", "gzip, deflate, br");
    headers_0.put("Accept-Language", "en-GB,en;q=0.9");
    headers_0.put("Cache-Control", "max-age=0");
    headers_0.put("If-Modified-Since", "Thu, 16 Jun 2022 16:16:29 GMT");
    headers_0.put("If-None-Match", "W/\"62ab575d-363b\"");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "same-origin");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    headers_0.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_0.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_2.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Origin", "https://test.victoriassecret.com");
    headers_3.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_3.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("accept", "*/*");
    headers_9.put("accept-encoding", "gzip, deflate, br");
    headers_9.put("accept-language", "en-GB,en;q=0.9");
    headers_9.put("origin", "https://test.victoriassecret.com");
    headers_9.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "macOS");
    headers_9.put("sec-fetch-dest", "empty");
    headers_9.put("sec-fetch-mode", "cors");
    headers_9.put("sec-fetch-site", "same-site");
    headers_9.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("accept", "*/*");
    headers_10.put("accept-encoding", "gzip, deflate, br");
    headers_10.put("accept-language", "en-GB,en;q=0.9");
    headers_10.put("origin", "https://test.victoriassecret.com");
    headers_10.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "macOS");
    headers_10.put("sec-fetch-dest", "empty");
    headers_10.put("sec-fetch-mode", "cors");
    headers_10.put("sec-fetch-site", "same-site");
    headers_10.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_10.put("x-vs-api-origin", "cloud");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("accept", "*/*");
    headers_18.put("accept-encoding", "gzip, deflate, br");
    headers_18.put("accept-language", "en-GB,en;q=0.9");
    headers_18.put("content-type", "text/plain; charset=UTF-8");
    headers_18.put("origin", "https://test.victoriassecret.com");
    headers_18.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_18.put("sec-ch-ua-mobile", "?0");
    headers_18.put("sec-ch-ua-platform", "macOS");
    headers_18.put("sec-fetch-dest", "empty");
    headers_18.put("sec-fetch-mode", "cors");
    headers_18.put("sec-fetch-site", "same-site");
    headers_18.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_22 = new HashMap<>();
    headers_22.put("accept", "*/*");
    headers_22.put("accept-encoding", "gzip, deflate, br");
    headers_22.put("accept-language", "en-GB,en;q=0.9");
    headers_22.put("content-type", "text/plain; charset=UTF-8");
    headers_22.put("origin", "https://test.victoriassecret.com");
    headers_22.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_22.put("sec-ch-ua-mobile", "?0");
    headers_22.put("sec-ch-ua-platform", "macOS");
    headers_22.put("sec-fetch-dest", "empty");
    headers_22.put("sec-fetch-mode", "cors");
    headers_22.put("sec-fetch-site", "same-site");
    headers_22.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_22.put("x-vs-api-origin", "cloud");
    
    Map<CharSequence, String> headers_59 = new HashMap<>();
    headers_59.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_59.put("accept-encoding", "gzip, deflate, br");
    headers_59.put("accept-language", "en-GB,en;q=0.9");
    headers_59.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_59.put("sec-ch-ua-mobile", "?0");
    headers_59.put("sec-ch-ua-platform", "macOS");
    headers_59.put("sec-fetch-dest", "iframe");
    headers_59.put("sec-fetch-mode", "navigate");
    headers_59.put("sec-fetch-site", "cross-site");
    headers_59.put("upgrade-insecure-requests", "1");
    headers_59.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_60 = new HashMap<>();
    headers_60.put("accept", "*/*");
    headers_60.put("accept-encoding", "gzip, deflate, br");
    headers_60.put("accept-language", "en-GB,en;q=0.9");
    headers_60.put("content-type", "text/plain;charset=UTF-8");
    headers_60.put("origin", "https://test.victoriassecret.com");
    headers_60.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_60.put("sec-ch-ua-mobile", "?0");
    headers_60.put("sec-ch-ua-platform", "macOS");
    headers_60.put("sec-fetch-dest", "empty");
    headers_60.put("sec-fetch-mode", "cors");
    headers_60.put("sec-fetch-site", "same-site");
    headers_60.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_63 = new HashMap<>();
    headers_63.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_63.put("Accept-Encoding", "gzip, deflate, br");
    headers_63.put("Accept-Language", "en-GB,en;q=0.9");
    headers_63.put("Sec-Fetch-Dest", "iframe");
    headers_63.put("Sec-Fetch-Mode", "navigate");
    headers_63.put("Sec-Fetch-Site", "cross-site");
    headers_63.put("Upgrade-Insecure-Requests", "1");
    headers_63.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_63.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_63.put("sec-ch-ua-mobile", "?0");
    headers_63.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_64 = new HashMap<>();
    headers_64.put("accept", "*/*");
    headers_64.put("accept-encoding", "gzip, deflate, br");
    headers_64.put("accept-language", "en-GB,en;q=0.9");
    headers_64.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_64.put("origin", "https://test.victoriassecret.com");
    headers_64.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_64.put("sec-ch-ua-mobile", "?0");
    headers_64.put("sec-ch-ua-platform", "macOS");
    headers_64.put("sec-fetch-dest", "empty");
    headers_64.put("sec-fetch-mode", "cors");
    headers_64.put("sec-fetch-site", "cross-site");
    headers_64.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_67 = new HashMap<>();
    headers_67.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_67.put("accept-encoding", "gzip, deflate, br");
    headers_67.put("accept-language", "en-GB,en;q=0.9");
    headers_67.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_67.put("sec-ch-ua-mobile", "?0");
    headers_67.put("sec-ch-ua-platform", "macOS");
    headers_67.put("sec-fetch-dest", "image");
    headers_67.put("sec-fetch-mode", "no-cors");
    headers_67.put("sec-fetch-site", "cross-site");
    headers_67.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_83 = new HashMap<>();
    headers_83.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_83.put("accept-encoding", "gzip, deflate, br");
    headers_83.put("accept-language", "en-GB,en;q=0.9");
    headers_83.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_83.put("sec-ch-ua-mobile", "?0");
    headers_83.put("sec-ch-ua-platform", "macOS");
    headers_83.put("sec-fetch-dest", "image");
    headers_83.put("sec-fetch-mode", "no-cors");
    headers_83.put("sec-fetch-site", "same-site");
    headers_83.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_85 = new HashMap<>();
    headers_85.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_85.put("Accept-Encoding", "gzip, deflate, br");
    headers_85.put("Accept-Language", "en-GB,en;q=0.9");
    headers_85.put("Sec-Fetch-Dest", "image");
    headers_85.put("Sec-Fetch-Mode", "no-cors");
    headers_85.put("Sec-Fetch-Site", "same-origin");
    headers_85.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_85.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_85.put("sec-ch-ua-mobile", "?0");
    headers_85.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_86 = new HashMap<>();
    headers_86.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_86.put("Accept-Encoding", "gzip, deflate, br");
    headers_86.put("Accept-Language", "en-GB,en;q=0.9");
    headers_86.put("Sec-Fetch-Dest", "image");
    headers_86.put("Sec-Fetch-Mode", "no-cors");
    headers_86.put("Sec-Fetch-Site", "cross-site");
    headers_86.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_86.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_86.put("sec-ch-ua-mobile", "?0");
    headers_86.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_88 = new HashMap<>();
    headers_88.put("accept", "*/*");
    headers_88.put("accept-encoding", "gzip, deflate, br");
    headers_88.put("accept-language", "en-GB,en;q=0.9");
    headers_88.put("origin", "https://test.victoriassecret.com");
    headers_88.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_88.put("sec-ch-ua-mobile", "?0");
    headers_88.put("sec-ch-ua-platform", "macOS");
    headers_88.put("sec-fetch-dest", "empty");
    headers_88.put("sec-fetch-mode", "no-cors");
    headers_88.put("sec-fetch-site", "cross-site");
    headers_88.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_89 = new HashMap<>();
    headers_89.put("accept", "*/*");
    headers_89.put("accept-encoding", "gzip, deflate, br");
    headers_89.put("accept-language", "en-GB,en;q=0.9");
    headers_89.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_89.put("sec-ch-ua-mobile", "?0");
    headers_89.put("sec-ch-ua-platform", "macOS");
    headers_89.put("sec-fetch-dest", "script");
    headers_89.put("sec-fetch-mode", "no-cors");
    headers_89.put("sec-fetch-site", "cross-site");
    headers_89.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_98 = new HashMap<>();
    headers_98.put("accept", "*/*");
    headers_98.put("accept-encoding", "gzip, deflate, br");
    headers_98.put("accept-language", "en-GB,en;q=0.9");
    headers_98.put("content-type", "text/plain;charset=UTF-8");
    headers_98.put("origin", "https://test.victoriassecret.com");
    headers_98.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_98.put("sec-ch-ua-mobile", "?0");
    headers_98.put("sec-ch-ua-platform", "macOS");
    headers_98.put("sec-fetch-dest", "empty");
    headers_98.put("sec-fetch-mode", "cors");
    headers_98.put("sec-fetch-site", "cross-site");
    headers_98.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_125 = new HashMap<>();
    headers_125.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_125.put("Accept-Encoding", "gzip, deflate, br");
    headers_125.put("Accept-Language", "en-GB,en;q=0.9");
    headers_125.put("If-Modified-Since", "Thu, 16 Jun 2022 16:18:41 GMT");
    headers_125.put("If-None-Match", "W/\"62ab57e1-334f\"");
    headers_125.put("Sec-Fetch-Dest", "document");
    headers_125.put("Sec-Fetch-Mode", "navigate");
    headers_125.put("Sec-Fetch-Site", "same-origin");
    headers_125.put("Sec-Fetch-User", "?1");
    headers_125.put("Upgrade-Insecure-Requests", "1");
    headers_125.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    headers_125.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_125.put("sec-ch-ua-mobile", "?0");
    headers_125.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_249 = new HashMap<>();
    headers_249.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_249.put("accept-encoding", "gzip, deflate, br");
    headers_249.put("accept-language", "en-GB,en;q=0.9");
    headers_249.put("origin", "https://test.victoriassecret.com");
    headers_249.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_249.put("sec-ch-ua-mobile", "?0");
    headers_249.put("sec-ch-ua-platform", "macOS");
    headers_249.put("sec-fetch-dest", "iframe");
    headers_249.put("sec-fetch-mode", "navigate");
    headers_249.put("sec-fetch-site", "cross-site");
    headers_249.put("upgrade-insecure-requests", "1");
    headers_249.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    String uri01 = "https://login.dotomi.com/ucm/UCMController";
    
    String uri02 = "https://events.attentivemobile.com/e";
    
    String uri03 = "https://p.typekit.net/p.css";
    
    String uri04 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion";
    
    String uri05 = "https://www.googletagmanager.com/gtag/js";
    
    String uri06 = "https://servedby.flashtalking.com";
    
    String uri07 = "https://cdn2.smartgiftit.com";
    
    String uri09 = "https://data.adxcel-ec2.com/pixel";
    
    String uri10 = "https://www.googleadservices.com/pagead/conversion/1003574881";
    
    String uri11 = "https://insight.adsrvr.org/track/up";
    
    String uri12 = "https://tags.tiqcdn.com/utag/victoriassecret/vs-us/dev";
    
    String uri13 = "https://apitest.victoriassecret.com";
    
    String uri14 = "https://connect.facebook.net/signals";
    
    String uri15 = "https://cdn.attn.tv";
    
    String uri16 = "https://ct.pinterest.com/v3";
    
    String uri17 = "https://www.facebook.com/tr";
    
    String uri18 = "https://mi.victoriassecret.com/p/cp/-1/track.gif";
    
    String uri19 = "https://use.typekit.net/af";
    
    String uri20 = "https://6677913.fls.doubleclick.net";
    
    String uri21 = "https://api.likeshop.me/gallery-more";
    
    String uri22 = "https://images.dashhudson.com";
    
    String uri23 = "https://vspink.attn.tv/unrenderedCreative";
    
    String uri24 = "https://metrics.victoriassecret.com/b/ss/lbrandsvictoriassecret.dev";
    
    String uri25 = "https://www.google.com/pagead";
    
    String uri26 = "https://likeshop.me/static/img/video.svg";
    
    String uri27 = "https://match.adsrvr.org/track/upb";
    
    String uri28 = "https://www.google.co.in/pagead";
    
    String uri29 = "https://bat.bing.com/action/0";
    
    String uri30 = "https://adservice.google.com/ddm/fls/i";
    
    String uri31 = "https://4168207.fls.doubleclick.net";
    
    String uri32 = "https://service.force.com/embeddedservice/5.0/esw.html";
    
    String uri33 = "https://adservice.google.co.in/ddm/fls/i";

    ScenarioBuilder scn = scenario("VSRecordedSimulation1")
      .exec(
        http("request_0")
          .get("/us/")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri13 + "/experience/v3/feature-flags"),
            http("request_2")
              .get(uri03 + "?s=1&k=qma4xrt&ht=tk&f=39437.39433.39434.39435.39436&a=70458522&app=typekit&e=css")
              .headers(headers_2),
            http("request_3")
              .get(uri19 + "/cf4868/00000000000000007735bbdc/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=i4&v=3")
              .headers(headers_3),
            http("request_4")
              .get(uri19 + "/b00c42/00000000000000007735bbdf/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=n4&v=3")
              .headers(headers_3),
            http("request_5")
              .get(uri13 + "/settings/v2/countries?activeCountry=US"),
            http("request_6")
              .get(uri13 + "/settings/v2/languages?activeCountry=US"),
            http("request_7")
              .get(uri13 + "/navigations/v6/navigations?channel=victorias-secret-desktop-tablet-us&activeCountry=US"),
            http("request_8")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/settings.json?activeCountry=US"),
            http("request_9")
              .get(uri13 + "/auth/v17/token")
              .headers(headers_9),
            http("request_10")
              .get(uri13 + "/auth/v21/status?activeCountry=US")
              .headers(headers_10),
            http("request_11")
              .get(uri13 + "/analytics/v3/global?activeCountry=US")
              .headers(headers_9),
            http("request_12")
              .get(uri13 + "/orders/v25/bag/count?activeCountry=US")
              .headers(headers_10),
            http("request_13")
              .get(uri13 + "/categories/v10/page?categoryId=5843325d-f4f6-461d-b9e2-b8ea86543e3e&brand=vs&isPersonalized=true&activeCountry=US&cid=&platform=web&deviceType=&platformType=&perzConsent=true&tntId=e7c02f1c-79c8-4ff2-b4f4-871111a817ab.34_0&screenWidth=1440&screenHeight=900")
              .headers(headers_9),
            http("request_14")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/brand.svg"),
            http("request_15")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/main.svg"),
            http("request_16")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/third-party.svg"),
            http("request_17")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/exclude.svg"),
            http("request_18")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_19")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=167792%3A0%3A0%7C2%2C157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_20")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=159134%3A1%3A0%3A0%7C2%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_21")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_22")
              .post(uri13 + "/contentpersonalization/v2/monitor")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0022_request.json")),
            http("request_23")
              .post(uri13 + "/contentpersonalization/v2/offers")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0023_request.json")),
            http("request_24")
              .get(uri13 + "/brandstacks/v21/?brand=vs&collectionId=1c124f8d-10ec-4948-88d2-778111f7cf01&isPersonalized=true&stackId=647fdac4-29b0-4c45-a3f9-0e03b46b93f3&limit=12&activeCountry=US")
              .headers(headers_22),
            http("request_25")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0025_request.json")),
            http("request_26")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0026_request.json")),
            http("request_27")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_28")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0028_request.json")),
            http("request_29")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=167792%3A0%3A0%7C2%2C157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_30")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=160876%3A1%3A0%7C2%2C157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_31")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_32")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=158500%3A1%3A0%7C2%2C157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_33")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_34")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_35")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_36")
              .get(uri12 + "/utag.194.js?utv=ut4.46.202010292129"),
            http("request_37")
              .get(uri12 + "/utag.197.js?utv=ut4.46.201812120042"),
            http("request_38")
              .get(uri12 + "/utag.201.js?utv=ut4.46.202108042110"),
            http("request_39")
              .get(uri12 + "/utag.207.js?utv=ut4.46.202010141522"),
            http("request_40")
              .get(uri12 + "/utag.211.js?utv=ut4.46.202108042110"),
            http("request_41")
              .get(uri12 + "/utag.217.js?utv=ut4.46.202102031633"),
            http("request_42")
              .get(uri12 + "/utag.222.js?utv=ut4.46.202206032032"),
            http("request_43")
              .get(uri12 + "/utag.223.js?utv=ut4.46.202206032032"),
            http("request_44")
              .get(uri12 + "/utag.236.js?utv=ut4.46.202110011522"),
            http("request_45")
              .get(uri12 + "/utag.237.js?utv=ut4.46.202204261755"),
            http("request_46")
              .get(uri12 + "/utag.215.js?utv=ut4.46.202003171916"),
            http("request_47")
              .get(uri12 + "/utag.248.js?utv=ut4.46.202011061827"),
            http("request_48")
              .get(uri12 + "/utag.251.js?utv=ut4.46.202101142028"),
            http("request_49")
              .get(uri12 + "/utag.261.js?utv=ut4.46.202101142028"),
            http("request_50")
              .get(uri07 + "/merchants/victoriassecret/themes/widget/uat.json"),
            http("request_51")
              .get(uri12 + "/utag.265.js?utv=ut4.46.202101142028"),
            http("request_52")
              .get(uri12 + "/utag.268.js?utv=ut4.46.202203291439"),
            http("request_53")
              .get(uri07 + "/gift-basket/kendrascott/assets/close-danger.svg"),
            http("request_54")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_55")
              .get(uri03 + "?s=1&k=ekg2izq&ht=tk&f=12784.12785&a=96388487&app=typekit&e=css"),
            http("request_56")
              .get(uri05 + "?id=AW-1003574881"),
            http("request_57")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_58")
              .get(uri12 + "/utag.235.js?utv=ut4.46.202206091718"),
            http("request_59")
              .get(uri01 + "?dtm_com=28&dtm_fid=101&dtm_cid=2482&dtm_cmagic=f55cad&dtm_format=5&cli_promo_id=1&dtmc_category=us&dtmc_ref=https%3A//test.victoriassecret.com/us/account/signin&dtmc_loc=https%3A//test.victoriassecret.com/us/%23signedOut&dtm_user_token=")
              .headers(headers_59),
            http("request_60")
              .post(uri24 + "/10/JS-2.22.4/s7506233676442")
              .headers(headers_60)
              .body(RawFileBody("vsrecordedsimulation1/0060_request.dat")),
            http("request_61")
              .get(uri14 + "/plugins/identity.js?v=2.9.62"),
            http("request_62")
              .get(uri14 + "/config/439439406264366?v=2.9.62&r=stable"),
            http("request_63")
              .get(uri06 + "/container/14352;108187;10965;iframe/?U2=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&spotName=Victoria_Secret_Homepage&cachebuster=391511.5805189471")
              .headers(headers_63),
            http("request_64")
              .post(uri21)
              .headers(headers_64)
              .formParam("gallery_id", "50426")
              .formParam("page", "0")
              .formParam("page_size", "50")
              .formParam("slider", "1")
              .formParam("order", "date")
              .formParam("direction", "desc")
              .formParam("lazy", "false")
              .formParam("high_res", "true")
              .formParam("links_disabled", "false")
              .formParam("version", "20210622"),
            http("request_65")
              .get(uri15 + "/attn.js?v=4-latest_41597792d"),
            http("request_66")
              .get(uri15 + "/tag/4-latest/tag.js?v=4-latest_41597792d"),
            http("request_67")
              .get(uri29 + "?ti=5102745&Ver=2&mid=787f22e6-7ceb-421b-80eb-2321f2c1018c&sid=66a67fb0ed9511ecb6893b0c23452dc1&vid=66a6d340ed9511ecb420ede3c339e4ff&vids=0&pi=918639831&lg=en-GB&sw=1440&sh=900&sc=30&tl=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras,%20Panties,%20Lingerie,%20Sportswear,%20Swimsuits,%20Beauty%20and%20Accessories&p=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&lt=1068&evt=pageLoad&msclkid=N&sv=1&rn=325157")
              .headers(headers_67),
            http("request_68")
              .get(uri29 + "?ti=5102745&Ver=2&mid=787f22e6-7ceb-421b-80eb-2321f2c1018c&sid=66a67fb0ed9511ecb6893b0c23452dc1&vid=66a6d340ed9511ecb420ede3c339e4ff&vids=0&gc=USD&evt=custom&msclkid=N&rn=695020")
              .headers(headers_67),
            http("request_69")
              .get(uri16 + "/?tid=2619214552931&event=pagevisit&noscript=1")
              .headers(headers_67),
            http("request_70")
              .get(uri16 + "/?tid=2619214552931&noscript=1")
              .headers(headers_67),
            http("request_71")
              .get(uri05 + "?id=AW-870804336&l=dataLayer&cx=c"),
            http("request_72")
              .get(uri05 + "?id=DC-4168207&l=dataLayer&cx=c"),
            http("request_73")
              .get(uri05 + "?id=AW-857129350&l=dataLayer&cx=c"),
            http("request_74")
              .get(uri05 + "?id=DC-6677913&l=dataLayer&cx=c"),
            http("request_75")
              .get(uri11 + "?adv=21htoqm&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&upid=cl0lzxi&upv=1.1.0&td2=https://test.victoriassecret.com/us/%23signedOut")
              .headers(headers_59),
            http("request_76")
              .get(uri27 + "/?adv=21htoqm&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&upid=cl0lzxi&upv=1.1.0&td2=https://test.victoriassecret.com/us/%23signedOut")
              .headers(headers_59),
            http("request_77")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MzUxMjUyLjM1NDkxMjM1NDk1Ny5qcGVn.jpg?w=640&h=640&fit=cover"),
            http("request_78")
              .get(uri26),
            http("request_79")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MTc4MTg3Ljc3Mzc3MDM1MDc3OC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_80")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MjcyMjk3Ljk2OTExMzM3NjA3Mi5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_81")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0NjI1NDkyLjE5OTkyMTQyMjA0NC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_82")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0NTIyMzYzLjc2Njk2MDYxMzExMC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_83")
              .get(uri18 + "?t=1655398697827&mi_u=anon-1655398649427-9035699233&mi_cid=8160&page_title=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&referrer=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&timezone_offset=-330&event_type=pageview&cdate=1655398697825&ck=host&anon=true")
              .headers(headers_83),
            http("request_84")
              .get(uri32 + "?parent=https://test.victoriassecret.com/us/"),
            http("request_85")
              .get(uri06 + "/segment/modify/y3c;;pixel/?name=vs_homepage&valuePairs=c14352_homepage")
              .headers(headers_85),
            http("request_86")
              .get(uri09 + "/?ad_log=referer&action=lead&pixid=69b7d2da-f552-4f04-9184-33c368e8f5a3")
              .headers(headers_86),
            http("request_87")
              .get(uri17 + "/?id=439439406264366&ev=PageView&dl=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&rl=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&if=false&ts=1655398698286&sw=1440&sh=900&ud[em]=cac335bb965eee43de1f92cdc0f9ecf2ecc4cd2efd4694675329525bb3eade6a&v=2.9.62&r=stable&a=tmtealium&ec=0&o=30&fbp=fb.1.1655398657593.1077115236&it=1655398697579&coo=false&eid=9183db126e27dec0e33fa7275ac3a6e2&tm=1&exp=p0&rqm=GET")
              .headers(headers_67),
            http("request_88")
              .post(uri02 + "?v=4.14.18_79aa7fd44a&pd=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&u=1655568f9daf4255a9752723aa7a4146&c=vspink&ceid=TcV&lt=1655398698333&tag=modern&cs=3204175229&t=v&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&m=%7B%22source%22%3A%22a%22%7D&cb=1655398698349")
              .headers(headers_88),
            http("request_89")
              .get(uri04 + "/1003574881/?random=1655398698456&cv=9&fst=1655398698456&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_90")
              .get(uri10 + "/?random=1655398698461&cv=9&fst=1655398698461&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_91")
              .get(uri31 + "/activityi;src=4168207;type=home;cat=vsd_home;ord=1;num=8451318549579;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_92")
              .get(uri04 + "/870804336/?random=1655398698743&cv=9&fst=1655398698743&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_93")
              .get(uri04 + "/1003574881/?random=1655398698493&cv=9&fst=1655398698493&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_94")
              .get(uri04 + "/870804336/?random=1655398698749&cv=9&fst=1655398698749&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_95")
              .get(uri04 + "/857129350/?random=1655398698765&cv=9&fst=1655398698765&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_96")
              .get(uri04 + "/857129350/?random=1655398698770&cv=9&fst=1655398698770&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_97")
              .get(uri20 + "/activityi;dc_pre=CLyuo9u4svgCFYLOhwodWVkMeg;src=6677913;type=vsint0;cat=vs_ho0;ord=792857997718;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_98")
              .post(uri23 + "?v=e601ce97&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&id=1655568f9daf4255a9752723aa7a4146&pv=3&l=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&w=1427&h=397&ss_ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin")
              .headers(headers_98)
              .body(RawFileBody("vsrecordedsimulation1/0098_request.bin")),
            http("request_99")
              .get(uri30 + "/dc_pre=CKqwmdu4svgCFc7VhwodJ9EBWA;src=4168207;type=home;cat=vsd_home;ord=1;num=8451318549579;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_100")
              .get(uri04 + "/1003574881/?random=1655398698899&cv=9&fst=1655398698899&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_101")
              .get(uri04 + "/1003574881/?random=1144592551&cv=9&fst=1655398698461&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=KmGrYsWmJtSE28cPwtSMsAI&sscte=1&crd=")
              .headers(headers_67),
            http("request_102")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398698456&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=3520532998&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_103")
              .get(uri25 + "/1p-user-list/870804336/?random=1655398698743&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=3456564231&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_104")
              .get(uri30 + "/dc_pre=CLyuo9u4svgCFYLOhwodWVkMeg;src=6677913;type=vsint0;cat=vs_ho0;ord=792857997718;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_105")
              .get(uri25 + "/1p-user-list/870804336/?random=1655398698749&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=3008235324&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_106")
              .get(uri28 + "/1p-user-list/870804336/?random=1655398698743&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=3456564231&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_107")
              .get(uri28 + "/1p-user-list/870804336/?random=1655398698749&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=3008235324&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_108")
              .get(uri28 + "/1p-user-list/857129350/?random=1655398698770&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2306394255&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_109")
              .get(uri25 + "/1p-user-list/1003574881/?random=1655398698493&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=969981771&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_110")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398698493&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=969981771&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_111")
              .get(uri25 + "/1p-user-list/857129350/?random=1655398698770&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2306394255&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_112")
              .get(uri25 + "/1p-conversion/1003574881/?random=1144592551&cv=9&fst=1655398698461&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=KmGrYsWmJtSE28cPwtSMsAI&random=3367534301&resp=GooglemKTybQhCsO")
              .headers(headers_67),
            http("request_113")
              .get(uri25 + "/1p-user-list/1003574881/?random=1655398698899&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1683952297&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_114")
              .get(uri25 + "/1p-user-list/857129350/?random=1655398698765&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2398961132&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_115")
              .get(uri28 + "/1p-user-list/857129350/?random=1655398698765&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2398961132&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_116")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398698899&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1683952297&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_117")
              .get(uri33 + "/dc_pre=CLyuo9u4svgCFYLOhwodWVkMeg;src=6677913;type=vsint0;cat=vs_ho0;ord=792857997718;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_118")
              .get(uri28 + "/1p-conversion/1003574881/?random=1144592551&cv=9&fst=1655398698461&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=5&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=KmGrYsWmJtSE28cPwtSMsAI&random=3367534301&resp=GooglemKTybQhCsO&ipr=y&prhg=0")
              .headers(headers_67),
            http("request_119")
              .post(uri24 + "/10/JS-2.22.4/s72999646976456")
              .headers(headers_60)
              .body(RawFileBody("vsrecordedsimulation1/0119_request.dat")),
            http("request_120")
              .get(uri06 + "/container/14352;108187;10965;iframe/?U2=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut&spotName=Victoria_Secret_Homepage&cachebuster=33389.976011505285")
              .headers(headers_63),
            http("request_121")
              .get(uri31 + "/activityi;src=4168207;type=home;cat=vsd_home;ord=1;num=9093485606066;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F%23signedOut;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_122")
              .get(uri16 + "/?tid=2619214552931&noscript=1")
              .headers(headers_67),
            http("request_123")
              .get(uri16 + "/?tid=2619214552931&event=pagevisit&noscript=1")
              .headers(headers_67),
            http("request_124")
              .get(uri20 + "/activityi;src=6677913;type=vsint0;cat=vs_ho0;ord=6261656001159;gtm=2od6f0;auiddc=955750905.1655398648;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_125")
              .get("/us/account/signin")
              .headers(headers_125),
            http("request_126")
              .get(uri03 + "?s=1&k=qma4xrt&ht=tk&f=39437.39433.39434.39435.39436&a=70458522&app=typekit&e=css")
              .headers(headers_2),
            http("request_127")
              .get(uri19 + "/cf4868/00000000000000007735bbdc/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=i4&v=3")
              .headers(headers_3),
            http("request_128")
              .get(uri19 + "/b00c42/00000000000000007735bbdf/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=n4&v=3")
              .headers(headers_3),
            http("request_129")
              .get(uri13 + "/experience/v3/feature-flags")
              .headers(headers_9),
            http("request_130")
              .get(uri13 + "/settings/v2/countries?activeCountry=US"),
            http("request_131")
              .get(uri13 + "/settings/v2/languages?activeCountry=US"),
            http("request_132")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/settings.json?activeCountry=US"),
            http("request_133")
              .get(uri13 + "/auth/v17/token")
              .headers(headers_9),
            http("request_134")
              .get(uri13 + "/auth/v21/status?activeCountry=US")
              .headers(headers_10),
            http("request_135")
              .get(uri13 + "/analytics/v3/global?activeCountry=US")
              .headers(headers_9),
            http("request_136")
              .get(uri13 + "/orders/v25/bag/count?activeCountry=US")
              .headers(headers_10),
            http("request_137")
              .get(uri13 + "/navigations/v6/navigations?channel=victorias-secret-desktop-tablet-us&activeCountry=US")
              .headers(headers_9),
            http("request_138")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/brand.svg"),
            http("request_139")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/third-party.svg"),
            http("request_140")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/main.svg"),
            http("request_141")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/exclude.svg"),
            http("request_142")
              .get(uri12 + "/utag.215.js?utv=ut4.46.202003171916")
              .headers(headers_2),
            http("request_143")
              .get(uri12 + "/utag.235.js?utv=ut4.46.202206091718")
              .headers(headers_2),
            http("request_144")
              .post(uri24 + "/10/JS-2.22.4/s76159142463785")
              .headers(headers_60)
              .body(RawFileBody("vsrecordedsimulation1/0144_request.dat"))
          )
      )
      .pause(14)
      .exec(
        http("request_145")
          .post(uri24 + "/10/JS-2.22.4/s72425115957229")
          .headers(headers_60)
          .body(RawFileBody("vsrecordedsimulation1/0145_request.dat"))
          .resources(
            http("request_146")
              .post(uri13 + "/auth/v21/sign-in")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0146_request.bin")),
            http("request_147")
              .get(uri13 + "/account/v17/activeuseridentifier?activeCountry=US")
              .headers(headers_22),
            http("request_148")
              .get("/us/"),
            http("request_149")
              .get(uri03 + "?s=1&k=qma4xrt&ht=tk&f=39437.39433.39434.39435.39436&a=70458522&app=typekit&e=css")
              .headers(headers_2),
            http("request_150")
              .get(uri19 + "/cf4868/00000000000000007735bbdc/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=i4&v=3")
              .headers(headers_3),
            http("request_151")
              .get(uri19 + "/b00c42/00000000000000007735bbdf/30/l?primer=f592e0a4b9356877842506ce344308576437e4f677d7c9b78ca2162e6cad991a&fvd=n4&v=3")
              .headers(headers_3),
            http("request_152")
              .get(uri13 + "/experience/v3/feature-flags"),
            http("request_153")
              .get(uri13 + "/settings/v2/countries?activeCountry=US"),
            http("request_154")
              .get(uri13 + "/settings/v2/languages?activeCountry=US"),
            http("request_155")
              .get(uri13 + "/navigations/v6/navigations?channel=victorias-secret-desktop-tablet-us&activeCountry=US"),
            http("request_156")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/settings.json?activeCountry=US"),
            http("request_157")
              .get(uri13 + "/auth/v17/token")
              .headers(headers_9),
            http("request_158")
              .get(uri13 + "/analytics/v3/global?activeCountry=US")
              .headers(headers_9),
            http("request_159")
              .get(uri13 + "/auth/v21/status?activeCountry=US")
              .headers(headers_10),
            http("request_160")
              .get(uri13 + "/orders/v25/bag/count?activeCountry=US")
              .headers(headers_10),
            http("request_161")
              .get(uri13 + "/categories/v10/page?categoryId=5843325d-f4f6-461d-b9e2-b8ea86543e3e&brand=vs&isPersonalized=true&activeCountry=US&cid=6a93128ab91de69b8c685301eb1231d17de313ba45552887ba8a76e20fa47434&platform=web&deviceType=&platformType=&perzConsent=true&tntId=e7c02f1c-79c8-4ff2-b4f4-871111a817ab.34_0&screenWidth=1440&screenHeight=900")
              .headers(headers_9),
            http("request_162")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/brand.svg"),
            http("request_163")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/main.svg"),
            http("request_164")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/third-party.svg"),
            http("request_165")
              .get("/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/react/icon/exclude.svg"),
            http("request_166")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_167")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=167792%3A0%3A0%7C2%2C167792%3A0%3A0%7C1%2C157547%3A1%3A0%7C-1%2C156941%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C160037%3A0%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_168")
              .post(uri13 + "/contentpersonalization/v2/monitor")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0168_request.json")),
            http("request_169")
              .post(uri13 + "/contentpersonalization/v2/offers")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0169_request.json")),
            http("request_170")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_171")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=159134%3A1%3A0%3A0%7C0%2C159134%3A1%3A0%3A0%7C2%2C159134%3A1%3A0%3A0%7C1%2C156941%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_172")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_173")
              .get(uri13 + "/brandstacks/v21/?brand=vs&collectionId=1c124f8d-10ec-4948-88d2-778111f7cf01&isPersonalized=true&stackId=647fdac4-29b0-4c45-a3f9-0e03b46b93f3&limit=12&activeCountry=US")
              .headers(headers_22),
            http("request_174")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=167792%3A0%3A0%7C2%2C167792%3A0%3A0%7C1%2C157547%3A1%3A0%7C-1%2C156941%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C160037%3A0%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_175")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0175_request.json")),
            http("request_176")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=160876%3A1%3A0%7C2%2C160876%3A1%3A0%7C1%2C156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_177")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=157547%3A1%3A0%7C-1%2C156941%3A1%3A0%7C-1%2C161014%3A1%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C160037%3A0%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_178")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0178_request.json")),
            http("request_179")
              .post(uri13 + "/productrecommendations/v6/multi")
              .headers(headers_22)
              .body(RawFileBody("vsrecordedsimulation1/0179_request.json")),
            http("request_180")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_181")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_182")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=158500%3A1%3A0%7C2%2C158500%3A1%3A0%7C1%2C156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_183")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_184")
              .get("/videos/vsweb/397154ae-a61b-47c4-8c5c-a2a176c51dc7/111521-home-panty-party.mp4"),
            http("request_185")
              .get("/videos/vsweb/0e4a82f5-5d2b-42a9-90d0-7c280107fbe8/111221-sleep-robes-slippers-blanket.mp4"),
            http("request_186")
              .get("/videos/vsweb/289ba931-d120-4623-ad16-333968197174/00-111521-BTY-795-TMC-LD.mp4"),
            http("request_187")
              .get(uri12 + "/utag.194.js?utv=ut4.46.202010292129"),
            http("request_188")
              .get(uri12 + "/utag.197.js?utv=ut4.46.201812120042"),
            http("request_189")
              .get(uri12 + "/utag.201.js?utv=ut4.46.202108042110"),
            http("request_190")
              .get(uri12 + "/utag.207.js?utv=ut4.46.202010141522"),
            http("request_191")
              .get(uri12 + "/utag.211.js?utv=ut4.46.202108042110"),
            http("request_192")
              .get(uri12 + "/utag.217.js?utv=ut4.46.202102031633"),
            http("request_193")
              .get(uri12 + "/utag.222.js?utv=ut4.46.202206032032"),
            http("request_194")
              .get(uri12 + "/utag.223.js?utv=ut4.46.202206032032"),
            http("request_195")
              .get(uri12 + "/utag.236.js?utv=ut4.46.202110011522"),
            http("request_196")
              .get(uri12 + "/utag.237.js?utv=ut4.46.202204261755"),
            http("request_197")
              .get(uri12 + "/utag.215.js?utv=ut4.46.202003171916"),
            http("request_198")
              .get(uri12 + "/utag.248.js?utv=ut4.46.202011061827"),
            http("request_199")
              .get(uri12 + "/utag.251.js?utv=ut4.46.202101142028"),
            http("request_200")
              .get(uri12 + "/utag.261.js?utv=ut4.46.202101142028"),
            http("request_201")
              .get(uri12 + "/utag.265.js?utv=ut4.46.202101142028"),
            http("request_202")
              .get(uri12 + "/utag.268.js?utv=ut4.46.202203291439"),
            http("request_203")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_204")
              .get(uri24 + "/0/MOBILE-1.0?pe=tnt&tnta=156941%3A1%3A0%7C-1%2C157547%3A1%3A0%7C-1%2C160037%3A0%3A0%7C-1%2C174684%3A0%3A0%7C-1%2C161014%3A1%3A0%7C-1&mid=66537605553744314511993488921363569140&c.&a.&target.&sessionId=107d1c23-ebd7-44dd-a109-235c4416dc1e&.target&.a&.c&activeCountry=US")
              .headers(headers_18),
            http("request_205")
              .get("/videos/vsweb/662cd5ea-eab5-4ff8-a2eb-63fa250b4dd8/lovecloudteaser-bg-vid-desktop.mp4"),
            http("request_206")
              .get(uri07 + "/merchants/victoriassecret/themes/widget/uat.json"),
            http("request_207")
              .get(uri05 + "?id=AW-1003574881"),
            http("request_208")
              .get(uri13 + "/chatbot/v2/initialize?activeCountry=US")
              .headers(headers_22),
            http("request_209")
              .get(uri12 + "/utag.235.js?utv=ut4.46.202206091718"),
            http("request_210")
              .post(uri24 + "/10/JS-2.22.4/s76862461448582")
              .headers(headers_60)
              .body(RawFileBody("vsrecordedsimulation1/0210_request.dat")),
            http("request_211")
              .get(uri09 + "/?ad_log=referer&action=lead&pixid=69b7d2da-f552-4f04-9184-33c368e8f5a3")
              .headers(headers_86),
            http("request_212")
              .post(uri21)
              .headers(headers_64)
              .formParam("gallery_id", "50426")
              .formParam("page", "0")
              .formParam("page_size", "50")
              .formParam("slider", "1")
              .formParam("order", "date")
              .formParam("direction", "desc")
              .formParam("lazy", "false")
              .formParam("high_res", "true")
              .formParam("links_disabled", "false")
              .formParam("version", "20210622"),
            http("request_213")
              .get(uri06 + "/container/14352;108187;10965;iframe/?U2=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&spotName=Victoria_Secret_Homepage&cachebuster=64192.3821639645")
              .headers(headers_63),
            http("request_214")
              .get(uri01 + "?dtm_com=28&dtm_fid=101&dtm_cid=2482&dtm_cmagic=f55cad&dtm_format=5&cli_promo_id=1&dtmc_category=us&dtmc_ref=https%3A//test.victoriassecret.com/us/account/signin&dtmc_loc=https%3A//test.victoriassecret.com/us/&dtm_user_token=")
              .headers(headers_59),
            http("request_215")
              .get(uri07 + "/gift-basket/kendrascott/assets/close-danger.svg"),
            http("request_216")
              .get(uri14 + "/plugins/identity.js?v=2.9.62"),
            http("request_217")
              .get(uri14 + "/config/439439406264366?v=2.9.62&r=stable"),
            http("request_218")
              .get(uri15 + "/attn.js?v=4-latest_41597792d"),
            http("request_219")
              .get(uri15 + "/tag/4-latest/tag.js?v=4-latest_41597792d"),
            http("request_220")
              .get(uri29 + "?ti=5102745&Ver=2&mid=7ad1e634-8490-4a70-b892-b6410d1136cc&sid=66a67fb0ed9511ecb6893b0c23452dc1&vid=66a6d340ed9511ecb420ede3c339e4ff&vids=0&pi=918639831&lg=en-GB&sw=1440&sh=900&sc=30&tl=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras,%20Panties,%20Lingerie,%20Sportswear,%20Swimsuits,%20Beauty%20and%20Accessories&p=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&lt=491&evt=pageLoad&msclkid=N&sv=1&rn=431322")
              .headers(headers_67),
            http("request_221")
              .get(uri29 + "?ti=5102745&Ver=2&mid=7ad1e634-8490-4a70-b892-b6410d1136cc&sid=66a67fb0ed9511ecb6893b0c23452dc1&vid=66a6d340ed9511ecb420ede3c339e4ff&vids=0&gc=USD&evt=custom&msclkid=N&rn=562934")
              .headers(headers_67),
            http("request_222")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0NDQxMjU4LjkzMjcyMTk4OTE5MC5qcGVn.jpg?w=640&h=640&fit=cover"),
            http("request_223")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MzUxMjUyLjM1NDkxMjM1NDk1Ny5qcGVn.jpg?w=640&h=640&fit=cover"),
            http("request_224")
              .get(uri26),
            http("request_225")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MTc4MTg3Ljc3Mzc3MDM1MDc3OC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_226")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0MjcyMjk3Ljk2OTExMzM3NjA3Mi5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_227")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0NjI1NDkyLjE5OTkyMTQyMjA0NC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_228")
              .get(uri22 + "/aHR0cHM6Ly9jZG4uZGFzaGh1ZHNvbi5jb20vbWVkaWEvZnVsbC8xNjU0NTIyMzYzLjc2Njk2MDYxMzExMC5qcGVn.jpg?w=400&h=400&fit=cover"),
            http("request_229")
              .get(uri03 + "?s=1&k=ekg2izq&ht=tk&f=12784.12785&a=96388487&app=typekit&e=css"),
            http("request_230")
              .get(uri05 + "?id=AW-870804336&l=dataLayer&cx=c"),
            http("request_231")
              .get(uri05 + "?id=DC-4168207&l=dataLayer&cx=c"),
            http("request_232")
              .get(uri05 + "?id=AW-857129350&l=dataLayer&cx=c"),
            http("request_233")
              .get(uri05 + "?id=DC-6677913&l=dataLayer&cx=c"),
            http("request_234")
              .get(uri06 + "/segment/modify/y3c;;pixel/?name=vs_homepage&valuePairs=c14352_homepage")
              .headers(headers_85),
            http("request_235")
              .get(uri11 + "?adv=21htoqm&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&upid=cl0lzxi&upv=1.1.0&td2=https://test.victoriassecret.com/us/")
              .headers(headers_59),
            http("request_236")
              .get(uri27 + "/?adv=21htoqm&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&upid=cl0lzxi&upv=1.1.0&td2=https://test.victoriassecret.com/us/")
              .headers(headers_59),
            http("request_237")
              .get(uri16 + "/?tid=2619214552931&noscript=1")
              .headers(headers_67),
            http("request_238")
              .get(uri18 + "?t=1655398725136&mi_u=anon-1655398649427-9035699233&mi_cid=8160&page_title=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&referrer=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&timezone_offset=-330&event_type=pageview&cdate=1655398725134&ck=host&anon=true")
              .headers(headers_83),
            http("request_239")
              .get(uri17 + "/?id=439439406264366&ev=PageView&dl=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&rl=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&if=false&ts=1655398725292&sw=1440&sh=900&ud[em]=7b07b862605c156459044f434312eec9c579428e5920c5bc78d99b20f9604079&v=2.9.62&r=stable&a=tmtealium&ec=0&o=30&fbp=fb.1.1655398657593.1077115236&it=1655398724666&coo=false&eid=e71411b0cebe348763d1b8586d89a33c&tm=1&rqm=GET")
              .headers(headers_67),
            http("request_240")
              .post(uri02 + "?v=4.14.18_79aa7fd44a&pd=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&u=1655568f9daf4255a9752723aa7a4146&c=vspink&ceid=TcV&lt=1655398725234&tag=modern&cs=3204175229&t=v&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&m=%7B%22source%22%3A%22a%22%7D&cb=1655398725241")
              .headers(headers_88),
            http("request_241")
              .get(uri04 + "/1003574881/?random=1655398725485&cv=9&fst=1655398725485&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_242")
              .get(uri04 + "/1003574881/?random=1655398725512&cv=9&fst=1655398725512&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_243")
              .get(uri31 + "/activityi;src=4168207;type=home;cat=vsd_home;ord=1;num=3622886248098;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_244")
              .post(uri23 + "?v=e601ce97&r=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&id=1655568f9daf4255a9752723aa7a4146&pv=4&l=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&w=1427&h=397&ss_ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin")
              .headers(headers_98)
              .body(RawFileBody("vsrecordedsimulation1/0244_request.bin")),
            http("request_245")
              .get(uri20 + "/activityi;src=6677913;type=vsint0;cat=vs_ho0;ord=8865252060453;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_246")
              .get(uri04 + "/870804336/?random=1655398725795&cv=9&fst=1655398725795&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_247")
              .get(uri04 + "/857129350/?random=1655398725799&cv=9&fst=1655398725799&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_248")
              .get(uri04 + "/857129350/?random=1655398725802&cv=9&fst=1655398725802&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_249")
              .post(uri17 + "/")
              .headers(headers_249)
              .formParam("id", "439439406264366")
              .formParam("ev", "Microdata")
              .formParam("dl", "https://test.victoriassecret.com/us/")
              .formParam("rl", "https://test.victoriassecret.com/us/account/signin")
              .formParam("if", "false")
              .formParam("ts", "1655398725858")
              .formParam("cd[DataLayer]", "[]")
              .formParam("cd[Meta]", "{\"title\":\"\\t\\tVictoria’s Secret: The World’s Most Famous Bras, Panties, Lingerie, Sportswear, Swimsuits, Beauty and Accessories\",\"meta:description\":\"The world’s best bras, panties, and lingerie. Shop our favorite clothing from sleepwear and sportswear to beauty and swim. Only from Victoria’s Secret.\"}")
              .formParam("cd[OpenGraph]", "{\"og:type\":\"website\",\"og:site_name\":\"Victoria's Secret\",\"og:image\":\"https://test.victoriassecret.com/assets/5104-2f97ba67-575b-4f27-902d-0da6070bf7f3/images/default-share.png\",\"og:locale\":\"en_US\",\"og:url\":\"\",\"og:title\":\"Victoria’s Secret: The World’s Most Famous Bras, Panties, Lingerie, Sportswear, Swimsuits, Beauty and Accessories\",\"og:description\":\"The world’s best bras, panties, and lingerie. Shop our favorite clothing from sleepwear and sportswear to beauty and swim. Only from Victoria’s Secret.\"}")
              .formParam("cd[Schema.org]", "[]")
              .formParam("cd[JSON-LD]", "[{\"@context\":\"https://schema.org\",\"@type\":\"WebSite\",\"url\":\"test.victoriassecret.com\",\"potentialAction\":{\"@type\":\"SearchAction\",\"target\":{\"@type\":\"EntryPoint\",\"urlTemplate\":\"test.victoriassecret.com/us/vs/search?searchLocation=searchengine&q={search_term_string}\"},\"query-input\":\"required name=search_term_string\"}}]")
              .formParam("sw", "1440")
              .formParam("sh", "900")
              .formParam("ud[em]", "7b07b862605c156459044f434312eec9c579428e5920c5bc78d99b20f9604079")
              .formParam("v", "2.9.62")
              .formParam("r", "stable")
              .formParam("a", "tmtealium")
              .formParam("ec", "1")
              .formParam("o", "30")
              .formParam("fbp", "fb.1.1655398657593.1077115236")
              .formParam("it", "1655398724666")
              .formParam("coo", "false")
              .formParam("es", "automatic")
              .formParam("tm", "3")
              .formParam("rqm", "formPOST"),
            http("request_250")
              .get(uri31 + "/activityi;dc_pre=CMKdjei4svgCFZyDgwgdGSUBgA;src=4168207;type=home;cat=vsd_home;ord=1;num=3622886248098;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_251")
              .get(uri04 + "/1003574881/?random=1655398725989&cv=9&fst=1655398725989&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
              .headers(headers_89),
            http("request_252")
              .get(uri20 + "/activityi;dc_pre=CNC1lei4svgCFYjuhwod8NABXA;src=6677913;type=vsint0;cat=vs_ho0;ord=8865252060453;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F?")
              .headers(headers_59),
            http("request_253")
              .get(uri32 + "?parent=https://test.victoriassecret.com/us/"),
            http("request_254")
              .get(uri25 + "/1p-user-list/1003574881/?random=1655398725485&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2154404617&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_255")
              .get(uri25 + "/1p-user-list/1003574881/?random=1655398725512&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2687094511&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_256")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398725512&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2687094511&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_257")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398725485&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2154404617&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_258")
              .get(uri04 + "/1003574881/?random=642665819&cv=9&fst=1655398725489&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=RWGrYoOmMNKE28cP-dGIyA4&sscte=1&crd=")
              .headers(headers_67),
            http("request_259")
              .get(uri28 + "/1p-user-list/870804336/?random=1655398725795&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=2709549491&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_260")
              .get(uri25 + "/1p-user-list/870804336/?random=1655398725792&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1685797101&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_261")
              .get(uri28 + "/1p-user-list/870804336/?random=1655398725792&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1685797101&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_262")
              .get(uri25 + "/1p-user-list/857129350/?random=1655398725799&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1651367825&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_263")
              .get(uri28 + "/1p-user-list/857129350/?random=1655398725799&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=1651367825&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_264")
              .get(uri25 + "/1p-user-list/857129350/?random=1655398725802&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=841155649&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_265")
              .get(uri30 + "/dc_pre=CMKdjei4svgCFZyDgwgdGSUBgA;src=4168207;type=home;cat=vsd_home;ord=1;num=3622886248098;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_266")
              .get(uri30 + "/dc_pre=CNC1lei4svgCFYjuhwod8NABXA;src=6677913;type=vsint0;cat=vs_ho0;ord=8865252060453;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_267")
              .get(uri28 + "/1p-user-list/857129350/?random=1655398725802&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dpage_view&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=841155649&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_268")
              .get(uri25 + "/1p-user-list/1003574881/?random=1655398725989&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=483630653&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
              .headers(headers_67),
            http("request_269")
              .get(uri28 + "/1p-user-list/1003574881/?random=1655398725989&cv=9&fst=1655395200000&num=1&bg=ffffff&guid=ON&eid=376635470&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&data=event%3Dform_submit&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&async=1&fmt=3&is_vtc=1&random=483630653&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
              .headers(headers_67),
            http("request_270")
              .get(uri25 + "/1p-conversion/1003574881/?random=642665819&cv=9&fst=1655398725489&num=1&label=mdb4CO-c_4IDEOGsxd4D&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=900&u_w=1440&u_ah=835&u_aw=1440&u_cd=30&u_his=7&u_tz=330&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa6f0&sendb=1&ig=1&data=event%3Dconversion&frm=0&url=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F&ref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2Faccount%2Fsignin&tiba=Victoria%E2%80%99s%20Secret%3A%20The%20World%E2%80%99s%20Most%20Famous%20Bras%2C%20Panties%2C%20Lingerie%2C%20Sportswear%2C%20Swimsuits%2C%20Beauty%20and%20Accessories&auid=955750905.1655398648&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=RWGrYoOmMNKE28cP-dGIyA4&random=2225545314&resp=GooglemKTybQhCsO")
              .headers(headers_67),
            http("request_271")
              .get(uri33 + "/dc_pre=CMKdjei4svgCFZyDgwgdGSUBgA;src=4168207;type=home;cat=vsd_home;ord=1;num=3622886248098;gtm=2od6f0;auiddc=955750905.1655398648;u6=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59),
            http("request_272")
              .get(uri33 + "/dc_pre=CNC1lei4svgCFYjuhwod8NABXA;src=6677913;type=vsint0;cat=vs_ho0;ord=8865252060453;gtm=2od6f0;auiddc=955750905.1655398648;u3=EN;~oref=https%3A%2F%2Ftest.victoriassecret.com%2Fus%2F")
              .headers(headers_59)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
