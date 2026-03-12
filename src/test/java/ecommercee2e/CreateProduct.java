package ecommercee2e;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateProduct {
    @Test
    public HashMap<String,String>  createproduct() {
        LoginApi loginApi = new LoginApi();
        HashMap<String, String> loginData = loginApi.login();
        String token = loginData.get("token");
        String userId = loginData.get("userId");


        HashMap<String, String> formData = new HashMap<>();
        formData.put("productName", "qwerty");
        formData.put("productAddedBy", userId);
        formData.put("productCategory", "fashion");
        formData.put("productSubCategory", "shirts");
        formData.put("productPrice", "11500");
        formData.put("productDescription", "Addias Originals");
        formData.put("productFor", "women");
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all()
                .formParams(formData)
                .multiPart("productImage", new File("src/main/java/utils/Item.jpg"))
                .header("Authorization", token)
                .when()
                .post("/api/ecom/product/add-product")
                .then().log().all().assertThat().statusCode(201).extract().response().asString();
        JsonPath js=new JsonPath(response);
        String productID=js.getString("productId");

        HashMap<String, String>data=new HashMap<>();
        data.put("token",token);
        data.put("productID",productID);
        return data;

    }
}
