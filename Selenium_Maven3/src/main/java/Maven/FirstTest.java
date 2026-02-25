package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

    public static void main(String[] args) {

        // Setup ChromeDriver using WebDriverManager (auto-downloads correct driver)
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser window (optional but recommended)
        driver.manage().window().maximize();

        // Open Google website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
