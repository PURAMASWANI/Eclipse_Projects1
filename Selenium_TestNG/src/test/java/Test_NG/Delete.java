package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Delete {

    @Test
    public void deleteProductTest() {

        given()
        .when()
            .delete("https://dummyjson.com/products/1")
        .then()
            .log().all()                     // 👈 Prints full JSON response
            .statusCode(200)                 // 👈 Validates status code
            .body("isDeleted", equalTo(true)); // 👈 Validates delete success
    }
}