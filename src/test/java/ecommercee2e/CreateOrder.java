package ecommercee2e;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import pojoclasses.ecommerce.CreateOrderPojo;
import pojoclasses.ecommerce.OrdersPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public  class CreateOrder {

    public void createOrder() {
        CreateProduct createProduct = new CreateProduct();

        HashMap<String, String> details = createProduct.createproduct();
        String token = details.get("token");
        String productID = details.get("productID");


        OrdersPojo ordersPojo = new OrdersPojo();
        ordersPojo.setCountry("INDIA");
        ordersPojo.setProductOrderedId(productID);

        CreateOrderPojo createOrderPojo = new CreateOrderPojo();
        List<OrdersPojo> order = new ArrayList<>();
        order.add(ordersPojo);
        createOrderPojo.setOrders(order);
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String responseOrderID = given().log().all()
                .header("Authorization", token).body(createOrderPojo).contentType("application/json")
                .when().post("/api/ecom/order/create-order")
                .then().extract().response().asString();


    }
    public static void main( String args[]){
        CreateOrder createOrder= new CreateOrder();
        createOrder.createOrder();

    }

}
