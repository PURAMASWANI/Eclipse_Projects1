package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenshotUtil;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        // Take screenshot ONLY if test fails
        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
        }

        driver.quit();
    }
}