package Test_NG;

//package Test_NG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CRUD_Api {

    String baseUrl = "https://dummyjson.com";

    // 1️⃣ GET ALL PRODUCTS
    @Test(priority = 1)
    public void getAllProducts() {

        given()
        .when()
            .get(baseUrl + "/products")
        .then()
            .statusCode(200)
            .body("products.size()", greaterThan(0));
    }

    // 2️⃣ GET SINGLE PRODUCT
    @Test(priority = 2)
    public void getSingleProduct() {

        given()
        .when()
            .get(baseUrl + "/products/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }

    // 3️⃣ POST (Create Product)
    @Test(priority = 3)
    public void createProduct() {

        String requestBody = "{ \"title\": \"iPhone 15\", \"price\": 999 }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post(baseUrl + "/products/add")
        .then()
            .statusCode(201)
            .body("title", equalTo("iPhone 15"));
    }

    // 4️⃣ PUT (Update Product)
    @Test(priority = 4)
    public void updateProduct() {

        String requestBody = "{ \"title\": \"iPhone 15 Pro\" }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .put(baseUrl + "/products/1")
        .then()
            .statusCode(200)
            .body("title", equalTo("iPhone 15 Pro"));
    }

    // 5️⃣ DELETE PRODUCT
    @Test(priority = 5)
    public void deleteProduct() {

        given()
        .when()
            .delete(baseUrl + "/products/1")
        .then()
            .statusCode(200)
            .body("isDeleted", equalTo(true));
    }
}