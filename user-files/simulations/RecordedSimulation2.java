
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation2 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://opensource-demo.orangehrmlive.com")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("en-US,en;q=0.5")
      .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:101.0) Gecko/20100101 Firefox/101.0");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "none");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Sec-Fetch-Dest", "empty");
    headers_1.put("Sec-Fetch-Mode", "cors");
    headers_1.put("Sec-Fetch-Site", "cross-site");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_3.put("Origin", "https://opensource-demo.orangehrmlive.com");
    headers_3.put("Sec-Fetch-Dest", "document");
    headers_3.put("Sec-Fetch-Mode", "navigate");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    headers_3.put("Sec-Fetch-User", "?1");
    headers_3.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("Sec-Fetch-Dest", "empty");
    headers_4.put("Sec-Fetch-Mode", "cors");
    headers_4.put("Sec-Fetch-Site", "same-origin");
    headers_4.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_6.put("Sec-Fetch-Dest", "document");
    headers_6.put("Sec-Fetch-Mode", "navigate");
    headers_6.put("Sec-Fetch-Site", "same-origin");
    headers_6.put("Sec-Fetch-User", "?1");
    headers_6.put("Upgrade-Insecure-Requests", "1");
    
    String uri2 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs";
    
    String uri3 = "https://contile.services.mozilla.com/v1/tiles";

    ScenarioBuilder scn = scenario("RecordedSimulation2")
      .exec(
        http("Login Page")
          .get("/index.php/auth/login")
          .headers(headers_0)
      )
      .pause(6)
      .exec(
        http("request_1")
          .get(uri2 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")
          .headers(headers_1)
          .resources(
            http("request_2")
              .get(uri3)
              .headers(headers_1)
          )
      )
      .pause(15)
      .exec(
        http("Login With credentials")
          .post("/index.php/auth/validateCredentials")
          .headers(headers_3)
          .formParam("actionID", "")
          .formParam("hdnUserTimeZoneOffset", "5.5")
          .formParam("installation", "")
          .formParam("_csrf_token", "60786db6c5a78fcb39f885296e53e656")
          .formParam("txtUsername", "Admin")
          .formParam("txtPassword", "admin123")
          .formParam("Submit", "LOGIN")
      )
      .pause(3)
      .exec(
        http("request_4")
          .get("/index.php/dashboard/employeeDistribution")
          .headers(headers_4)
          .resources(
            http("request_5")
              .get("/index.php/dashboard/pendingLeaveRequests")
              .headers(headers_4)
          )
      )
      .pause(7)
      .exec(
        http("Logout page")
          .get("/index.php/auth/logout")
          .headers(headers_6)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
