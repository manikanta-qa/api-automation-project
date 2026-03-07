package Runner;

import Pojo.AddUserPojo;
import Pojo.CreateEmployeePojo;
import Pojo.EmployeeAddressPojo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class AddUser {
    @Test
    public void addUsers() {
        RestAssured.baseURI = "https://reqres.in/";
        AddUserPojo addUserPojo = new AddUserPojo();
        addUserPojo.setName("janaki");
        addUserPojo.setJob("Software tester");
        //Convert javaObjects to json
        String response = given().log().all().header("User-Agent", "Mozilla/5.0").header("content-Type", "application/json").body(addUserPojo).when().post("api/users").
                then().log().all().assertThat().statusCode(201).extract().response().asString();

    }


    public void createEmployee() {

        RestAssured.baseURI = "https://reqres.in/";
        EmployeeAddressPojo empadd1 = new EmployeeAddressPojo();
        //create First Employee
        empadd1.setCity("Hyderabad");
        empadd1.setState("Telangana");
        empadd1.setZip(50072);
        //Create 2nd Employee
        EmployeeAddressPojo empadd2=new EmployeeAddressPojo();

        empadd2.setCity("Kamareddy");
        empadd2.setState("Telangana");
        empadd2.setZip(500085);


        CreateEmployeePojo createEmployeePojo1 = new CreateEmployeePojo();
        createEmployeePojo1.setName("mani");
        createEmployeePojo1.setAge(30);
        createEmployeePojo1.setSalary(78000);
        createEmployeePojo1.setAddress(empadd1);

        CreateEmployeePojo createEmployeePojo2=new CreateEmployeePojo();
        createEmployeePojo2.setName("Raghava");
        createEmployeePojo2.setAge(29);
        createEmployeePojo2.setSalary(79000);
        createEmployeePojo2.setAddress(empadd2);
//List of employees
        List<CreateEmployeePojo> emp= new ArrayList<CreateEmployeePojo>();
        emp.add(createEmployeePojo1);
        emp.add(createEmployeePojo2);

//Send list as an Array
        String response = given().log().all().headers("content-Type", "application/json").body(emp).when().post("api/users").

                then().log().all().assertThat().statusCode(201).extract().response().asString();



    }


}
