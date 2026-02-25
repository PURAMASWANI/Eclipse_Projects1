package Test_NG;
//package base;

import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;

public class API_Base {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://dummyjson.com";
    }
}