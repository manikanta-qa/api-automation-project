package utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class RsponseSpecBuilderUtils {
    public static ResponseSpecification responseSpecBuilder(){
        ResponseSpecification res=new ResponseSpecBuilder().expectStatusCode(200)
                        .expectHeader("Content-Type", "application/json")
                .build();
        return res;
    }
}
