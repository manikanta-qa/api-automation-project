package Books;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.Request;
import utils.RequestSpecificationUtils;
import utils.RsponseSpecBuilderUtils;


import static io.restassured.RestAssured.given;

public class AddPlace {
    @Test
    public static void addPlace() {


        Response response = given().
                log().all().
                spec(RequestSpecificationUtils.requestSpecifications())
                .body(Request.payload())

                .when()
                .post("/maps/api/place/add/json")
                .then()
                .log().all()
                .spec(RsponseSpecBuilderUtils.responseSpecBuilder()).extract().response().as(Response.class);


        String place_id = "46713142a78d50ee779a3d94e0e158bc";

        //Update Place in ID

        String updatedresponse = given().log().all().spec(RequestSpecificationUtils.requestSpecifications()).body("{\n" +
                "\"place_id\":\"" + place_id + "\",\n" +
                "\"address\":\"70 winter walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n").when().put("/maps/api/place/update/json").then().log().all().spec(RsponseSpecBuilderUtils.responseSpecBuilder()).extract().response().asString();
    JsonPath js2 = new JsonPath(updatedresponse);
    js2.getString("place_id");
    //Get Place ID
    String getresponse = given().log().all().spec(RequestSpecificationUtils.requestSpecifications()).queryParam("place_id", place_id).when().get("/maps/api/place/get/json").then().log().all().extract().response().asString();
    JsonPath js3 = new JsonPath(getresponse);
    System.out.println(js3.getString("address"));

    }
}









