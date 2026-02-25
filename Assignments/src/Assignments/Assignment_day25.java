package Assignments;
package Assignments;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import java.net.URL;
 
public class Assignment_day25 {
 
    @Parameters("browser")
    @Test
    public void gridTest(String browser) throws Exception {
 
        // Step 1: Create DesiredCapabilities object
        DesiredCapabilities capabilities = new DesiredCapabilities();
 
        // Step 2: Set platform to WINDOWS
        capabilities.setPlatform(Platform.WINDOWS);
 
        // Step 3: Set browser name based on parameter
        if (browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }
 
        // Step 4: Initialize RemoteWebDriver with Grid URL
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                capabilities
        );
 
        // Step 5: Navigate to Google
        driver.get("https://www.google.com");
 
        // Step 6: Capture page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
 
        // Step 7: Assert title contains "Google"
        Assert.assertTrue(title.contains("Google"),
                "Title does not contain Google");
 
        // Step 8: Quit browser
        driver.quit();
    }
}