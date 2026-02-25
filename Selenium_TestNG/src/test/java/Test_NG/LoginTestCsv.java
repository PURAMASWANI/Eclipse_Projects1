package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestCsv {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider ="CSV Data")
    public void loginTest(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "CSV Data")
    public Object[][] getExcelData() throws Exception {
        // Update the path to match your CSV file location
        String filePath = "C:\\Users\\aswin\\eclipse-workspace\\Selenium_TestNG\\CSVData\\CsvFile.csv";
        return CSVFile.getCSVData(filePath);
    }
}