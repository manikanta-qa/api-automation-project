package Books;

import io.restassured.path.json.JsonPath;
import utils.Request;

public class ComplexJson {
    public static void complexJson() {
        JsonPath js3 = new JsonPath(Request.complexjson());

        //1. Print No of courses returned by API

        int coursesize = js3.getInt("courses.size()");
        System.out.println("course size is:" + coursesize);

        //2.Print Purchase Amount
        System.out.println(js3.getInt("dashboard.purchaseAmount"));

        // 3. Print Title of the first course
        System.out.println(js3.getString("courses[0].title"));

        // 4. Print All course titles and their respective Prices

        for (int i = 0; i < coursesize; i++) {
            System.out.println(js3.getString("courses[" + i + "].title"));
            System.out.println(js3.getString("courses[" + i + "].price"));
        }

        //5. Print no of copies sold by RPA Course
        for (int i = 0; i < coursesize; i++) {
            String coursetitle = js3.getString("courses[" + i + "].title");
            if (coursetitle.equalsIgnoreCase("RPA")) {
                int rpacopies = js3.getInt("courses[" + i + "].copies");
                System.out.println(rpacopies);

            }
            break;
        }
        //6. Verify if Sum of all Courses prices matches with Purchase amount
        int totalAmount = js3.getInt("dashboard.purchaseAmount");
        int courseSum = 0;
        for (int i = 0; i < coursesize; i++) {

            int coursePrices = js3.getInt("courses[" + i + "].price");
            int corseCopies = js3.getInt("courses[" + i + "].copies");
            courseSum = courseSum + (coursePrices * corseCopies);

        }
        System.out.println(courseSum);

        if (totalAmount == courseSum) {
            System.out.println(" The Sum of all course values are matched");
        } else {
            System.out.println("The Sum is mismatched with the Total purchase value amount");
        }
    }


    public static void main(String args[]) {

        ComplexJson.complexJson();
    }
}






