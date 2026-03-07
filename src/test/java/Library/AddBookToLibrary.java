package Library;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.request;
import utils.JsonUtils;

import static io.restassured.RestAssured.given;

public class AddBookToLibrary {

    @Test
    public void addBook() {
        RestAssured.baseURI = "http://216.10.245.166";

        String adddBookResponse = given().log().all().headers("Content-Type", "application/json").body(request.addBook("hdhd","2455")).when()
                .post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js1 = JsonUtils.rawToJson(adddBookResponse);
        String bookId = js1.getString("ID");
        System.out.println(bookId);
        String getBookResponse = given().log().all().queryParam("ID", "" + bookId + "").when().
                get("/Library/GetBook.php").
                then().log().all().extract().response().asString();
        JsonPath js2 = JsonUtils.rawToJson(getBookResponse);
        js2.getString("author");
        String actual_isbn = js2.getString("[0].isbn");
        String actual_aisle = js2.getString("[0].aisle");
        System.out.println(actual_isbn);
        System.out.println(actual_aisle);

        String actualBookId = actual_isbn + actual_aisle;
        System.out.println(actualBookId);
        Assert.assertEquals(actualBookId, bookId);
        String deleteResponse = given().log().all().header("Content-Type", "application/json").body("{\n" +
                " \n" +
                "   \"ID\": \"" + bookId + "\"\n" +
                "\n" +
                " \n" +
                "} \n").when().post("/Library/DeleteBook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
        JsonPath js3 = JsonUtils.rawToJson(deleteResponse);
        String deleteMessage = js3.getString("msg");
        System.out.println(deleteMessage);
        Assert.assertEquals(deleteMessage, "book is successfully deleted");

        String actual_bookId = given().log().all().queryParam("ID", "" + bookId + "").when().get("/Library/GetBook.php").then().assertThat().statusCode(404).extract().response().asString();

        JsonPath js4 = JsonUtils.rawToJson(actual_bookId);
        String actualmsg = js4.getString("msg");

        Assert.assertEquals(actualmsg, "The book by requested bookid / author name does not exists!");

    }

}
