package Books;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import utils.JsonUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class TestWithFiles {


    public void addPlace() throws IOException {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").
                body(JsonUtils.fileConvertor()).when().post("/maps/api/place/add/json").
                then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js1 = JsonUtils.rawToJson(response);
        String place_id = js1.getString("place_id");
        System.out.println(place_id);
    }
}
