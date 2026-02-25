package Test_NG;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_All {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://dummyjson.com";
    }

    @Test
    public void getAllProducts() {

        given()
        .when()
            .get("/products")
        .then()
            .statusCode(200)
            .log().all();
    }
}