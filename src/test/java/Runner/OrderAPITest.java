package Runner;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import pojoclasses.orders.Order;
import testdata.OrderDataBuilder;

import static io.restassured.RestAssured.given;

public class OrderAPITest {
@Test
    public void createOrder(){

    RestAssured.baseURI="https://reqres.in";
    Order payload= OrderDataBuilder.createOrderPayload();
    given().log().all().header("Content-Type","application/json").body(payload)
            .when().post("/api/users").then().log().all().assertThat().statusCode(201).extract().response().asString();

    }
}
