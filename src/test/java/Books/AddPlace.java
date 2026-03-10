package Books;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.Request;
import utils.RequestSpecificationUtils;
import utils.RsponseSpecBuilderUtils;


import static io.restassured.RestAssured.given;

public class AddPlace {
    public static void addPlace() {


        AddPlace response = given().
                log().all().
                spec(RequestSpecificationUtils.requestSpecifications())
                .body(Request.payload())

                .when()
                .post("/maps/api/place/add/json")
        .then()
                .log().all()
        .spec(RsponseSpecBuilderUtils.responseSpecBuilder()).extract().response().as(AddPlace.class);


    }

        //Update Place in ID

       /* String updatedresponse = given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json").body("{\n" +
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

    }*/

        public static void main (String args[]){
            addPlace();

        }

    }


