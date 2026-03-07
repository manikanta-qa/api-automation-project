package Books;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utils.request;

import static io.restassured.RestAssured.given;

public class AddPlace {
    public static void addPlace() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParams("key", "qaclick123").headers("Content-type", "application/json").body(request.payload()).

                when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js1 = new JsonPath(response);
        String place_id = js1.getString("place_id");
        js1.getString("scope");
        js1.getString("id");

        //Update Place in ID

        String updatedresponse = given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json").body("{\n" +
                "\"place_id\":\"" + place_id + "\",\n" +
                "\"address\":\"70 winter walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n").when().put("/maps/api/place/update/json").then().log().all().extract().response().asString();
        JsonPath js2 = new JsonPath(updatedresponse);
        //Get Place ID
        String getresponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id).when().get("/maps/api/place/get/json").then().log().all().extract().response().asString();
        JsonPath js3 = new JsonPath(getresponse);
        //js3.getString("place_id");
        System.out.println(js3.getString("address"));

    }

    public static void main(String args[]) {
        AddPlace.addPlace();

    }

}

