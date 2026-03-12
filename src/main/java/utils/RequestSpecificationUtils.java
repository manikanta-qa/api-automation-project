package utils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationUtils {


        public static RequestSpecification requestSpecifications() {
            RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                    .addQueryParam("key", "qaclick123")
                    .addHeader("Content-Type", "application/json")
                    .build();
            return req;
        }
    }

