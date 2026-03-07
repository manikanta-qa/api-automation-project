package Runner;

import Pojo.EmployeeAddressPojo;
import Pojo.EmployeeDetailsPojo;
import Pojo.HouseDetailsPojo;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CreateEmployeeNestedJson {

    public void addEmployee() {
        RestAssured.baseURI = "https://reqres.in";
        //House Details
        HouseDetailsPojo houseDetailsPojo = new HouseDetailsPojo();
        houseDetailsPojo.setFlatNo(401);
        houseDetailsPojo.setStreet("Gokulflots");
        List<String> landmark = new ArrayList<>();
        landmark.add("9th Phase");
        landmark.add("KPHB");
        houseDetailsPojo.setLandmark(landmark);
        houseDetailsPojo.setAppartmentName("PMR Elite");


//Employee Address
        EmployeeAddressPojo employeeAddressPojo = new EmployeeAddressPojo();
        employeeAddressPojo.setZip(56789);
        employeeAddressPojo.setCity("Hyderabad");
        employeeAddressPojo.setState("Telangana");
        employeeAddressPojo.setHousedetails(houseDetailsPojo);

        //Employee Complete Details

        EmployeeDetailsPojo employeeDetailsPojo = new EmployeeDetailsPojo();
        employeeDetailsPojo.setName("Mani");
        employeeDetailsPojo.setAge(30);
        employeeDetailsPojo.setId(165);
        employeeDetailsPojo.setSalary(99000);
        employeeDetailsPojo.setMarries(true);
        employeeDetailsPojo.setCreatedAt("19th Oct");
        employeeDetailsPojo.setEmpAddress(employeeAddressPojo);
        List<String >banks=new ArrayList<>();

        banks.add("SBI");
        banks.add("ICICI");
        banks.add("HDFC");
        employeeDetailsPojo.setBanks(banks);

        given().log().all().headers("Content-Type", "application/json").body(employeeDetailsPojo).when().post("/api/users").
                then().assertThat().statusCode(201);

    }
}
