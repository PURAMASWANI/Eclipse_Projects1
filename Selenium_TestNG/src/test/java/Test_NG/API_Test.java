package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class API_Test {

    @Test
    public void getUserTest() {

        given()
        .when()
            .get("https://dummyjson.com/products")
        .then()
            .statusCode(200)
            .body("products[1].id", equalTo(2));   // Correct path
    }
}