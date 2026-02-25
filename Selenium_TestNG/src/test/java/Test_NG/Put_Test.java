package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Put_Test {

    @Test
    public void updateProductTest() {

        // Step 1: Create JSON request body
        String requestBody = "{ \"title\": \"iPhone 15 Pro\", \"price\": 1200 }";

        // Step 2: Send PUT request and validate response
        given()
            .header("Content-Type", "application/json")   // Sending JSON
            .body(requestBody)                            // Attach body
        .when()
            .put("https://dummyjson.com/products/1")      // Update product with ID 1
        .then()
            .log().all()                                  // Print full JSON response
            .statusCode(200)                              // Validate status code
            .body("id", equalTo(1))                       // Validate ID
            .body("title", equalTo("iPhone 15 Pro"))      // Validate title
            .body("price", equalTo(1200));                // Validate price
    }
}