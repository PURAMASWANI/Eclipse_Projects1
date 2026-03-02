package saucedemo;
//package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    protected WebDriver driver;
    protected static final Logger log = LogManager.getLogger(BaseClass.class);

    @BeforeClass
    public void setup() {

        log.info("Setting up Chrome Driver");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        log.info("Browser Launched");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
        log.info("Browser Closed");
    }
}