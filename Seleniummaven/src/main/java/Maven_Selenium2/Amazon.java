package Maven_Selenium2;
//package Maven_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open local login page
        driver.get("file:///C:/Users/YourName/Desktop/login.html");

        // 1️⃣ Login
        driver.findElement(By.id("email")).sendKeys("user@gmail.com");
        driver.findElement(By.id("password")).sendKeys("user@123");
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(2000);

        // 2️⃣ Select Category
        driver.findElement(By.id("category")).sendKeys("Electronics");

        // 3️⃣ Search Product
        driver.findElement(By.id("searchBox")).sendKeys("Laptop");
        driver.findElement(By.id("searchBtn")).click();

        // 4️⃣ Add to Cart
        driver.findElement(By.id("addCart")).click();

        // 5️⃣ Checkout
        driver.findElement(By.id("checkout")).click();

        // 6️⃣ Logout
        driver.findElement(By.id("logout")).click();

        Thread.sleep(2000);

        // 7️⃣ Close All Tabs
        driver.quit();
    }
}
