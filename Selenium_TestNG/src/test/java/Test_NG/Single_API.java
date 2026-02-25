package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Single_API {

    @Test
    public void getSingleProduct() {

        given()
        .when()
            .get("https://dummyjson.com/products/1")
        .then()
            .log().all()
            .statusCode(200)
            .body("id", equalTo(1));
    }
}