package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Site_UC {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        //  Login 
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

        //Add Items to Cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        Thread.sleep(2000);

        // Go to Cart 
        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(2000);

        // Checkout 
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2000);

        // Enter details
        driver.findElement(By.id("first-name")).sendKeys("Venkat");
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("postal-code")).sendKeys("500001");

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        // Finish
        driver.findElement(By.id("finish")).click();

        System.out.println("Order Placed Successfully!");

        Thread.sleep(2000);

        driver.quit();
    }
}
