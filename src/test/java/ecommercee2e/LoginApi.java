package ecommercee2e;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pojoclasses.ecommerce.LoginApiPojo;
import utils.JsonUtils;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public  class LoginApi {

    public HashMap<String, String> login() {

        LoginApiPojo loginApiPojo = new LoginApiPojo();
        loginApiPojo.setUserEmail("manikanta6@gmail.com");
        loginApiPojo.setUserPassword("Test@123");
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String loginresponse = given()
                .contentType("application/json")
                .body(loginApiPojo)
                .when()
                .post("/api/ecom/auth/login")
                .then().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = JsonUtils.rawToJson(loginresponse);
        String loginToken = js.getString("token");
        String loginUserId = js.getString("userId");
        HashMap<String, String> loginData = new HashMap<>();
        loginData.put("token", loginToken);
        loginData.put("userId", loginUserId);

        return loginData;

    }

}

