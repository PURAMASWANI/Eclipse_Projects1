package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Post_Test {

    @Test
    public void createProductTest() {

        // Step 1: Create JSON request body
        String requestBody = "{ \"title\": \"iPhone 15\", \"price\": 999 }";

        // Step 2: Send POST request and validate response
        given()
            .header("Content-Type", "application/json")  // Tell server we are sending JSON
            .body(requestBody)                           // Attach JSON body
        .when()
            .post("https://dummyjson.com/products/add")  // Send POST request
        .then()
            .log().all()                                 // Print full JSON response
            .statusCode(201)                             // Validate status code
            .body("title", equalTo("iPhone 15"))         // Validate title
            .body("price", equalTo(999));                // Validate price
    }
}