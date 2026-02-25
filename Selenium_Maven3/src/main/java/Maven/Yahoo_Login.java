package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo_Login {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open Yahoo Login Page
        driver.get("https://login.yahoo.com/");

        // Enter Username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Aswani")))
                .sendKeys("Aswani");

        driver.findElement(By.id("login-signin")).click();

        // Enter Password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("1234")))
                .sendKeys("1234");

        driver.findElement(By.id("login-signin")).click();

        System.out.println("Login Attempted Successfully!");

        // Optional: wait few seconds before closing
        try { Thread.sleep(3000); } catch (Exception e) {}

        driver.quit();
    }
}
