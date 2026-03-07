package Runner;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.path.json.JsonPath;
import pojoclasses.courses.*;

import utils.OauthToken;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;

public class GetCourseRunner {
    @Test
    public void getBook() {

        GetCourses getCourses = new GetCourses();
        getCourses.setInstructor("RahuShetty");
        getCourses.setUrl("www.rahulshetty.com");
        getCourses.setExpertise("Automation");
        getCourses.setLinkedIn("linkedin.url");
        getCourses.setServices("ProjectManagement");

        WebAutomation webauto = new WebAutomation();
        webauto.setCourseTitle("Selenium");
        webauto.setPrice("40");
        WebAutomation webauto1 = new WebAutomation();
        webauto1.setCourseTitle("Cypress");
        webauto1.setPrice("80");
        WebAutomation webauto2 = new WebAutomation();
        webauto2.setCourseTitle("Playwright");
        webauto2.setPrice("90");
        webauto.setCourseTitle("Selenium");
        webauto.setPrice("40");
//Add Api Course Details
        Api api1 = new Api();
        api1.setCourseTitle("RestAssured");
        api1.setPrice("200");

        Api api2 = new Api();
        api2.setCourseTitle("Postman");
        api2.setPrice("150");
        //Add mobile course details
        Mobile mobile1 = new Mobile();
        mobile1.setCourseTitle("Appium");
        mobile1.setPrice("250");


        List<WebAutomation> weblist = new ArrayList<>();
        weblist.add(webauto);
        weblist.add(webauto1);
        weblist.add(webauto2);

        List<Api> apilist = new ArrayList<>();
        apilist.add(api1);
        apilist.add(api2);

        List<Mobile> mobile = new ArrayList();
        mobile.add(mobile1);


        Courses courses = new Courses();
        courses.setWebAutomation(weblist);
        courses.setApi(apilist);
        courses.setMobile(mobile);

        getCourses.setCourses(courses);

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        GetCourses response = given().log().all().queryParam("access_token", OauthToken.getToken()).
                when().get("/oauthapi/getCourseDetails").
                then().extract().as(GetCourses.class);
        System.out.println(response.getInstructor());
        System.out.println(response.getUrl());
        System.out.println(response.getServices());
        System.out.println(response.getExpertise());

        String response1 = given().log().all().queryParam("access_token", OauthToken.getToken()).
                when().get("/oauthapi/getCourseDetails").
                then().extract().asString();
        JsonPath js = new JsonPath(response1);
        int count = js.getInt(courses.webAutomation.size());

        //Print course titles in WebAutomation

        for (int i = 0; i < count; i++) {
           String courseTitles= courses.webAutomation["+i+"].courseTitle);
            String coursePrice=courses.webAutomation["+i+"].price);

            System.out.println(courseTitles);
            System.out.println(coursePrice);
        }
        String coursePrices=coursePrice;
        //I want sum of the WebAUtomation course Prices
        for (int i=0;i<coursePrice;i++){
            System.out.println("Hyderabad");
            System.out.println("Hyderabad");



        }









    }


}

