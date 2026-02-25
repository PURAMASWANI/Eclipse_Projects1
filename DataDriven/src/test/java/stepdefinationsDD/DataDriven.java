package stepdefinationsDD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataDriven {

    WebDriver driver;

    @Given("Launch the browser")
    public void launch_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter the following credentials")
    public void i_enter_the_following_credentials(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        for (List<String> row : data) {

            String username = row.get(0);
            String password = row.get(1);

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("password")).clear();

            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();

            driver.navigate().back(); // go back for next iteration
        }
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}