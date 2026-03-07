package utils;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
@Test
public class OauthToken {

        public static String getToken() {
            RestAssured.baseURI = "https://rahulshettyacademy.com";
            String getToken = given().log().all().formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com", "client_secret", "erZOWM9g3UtwNRj340YYaK_W", "grant_type", "client_credentials", "scope", "trust").
                    when().log().all().post("/oauthapi/oauth2/resourceOwner/token").then().assertThat().statusCode(200).extract().response().asString();

            JsonPath js=new JsonPath(getToken);

            String access_token = js.getString("access_token");

            return access_token;


        }
    }


