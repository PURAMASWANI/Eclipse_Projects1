/*package saucedemo;

public class LoginTest {

}*/
package saucedemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() {

        log.info("Opening SauceDemo Website");
        driver.get("https://www.saucedemo.com/");

        log.info("Entering Username");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        log.info("Entering Password");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        log.info("Clicking Login Button");
        driver.findElement(By.id("login-button")).click();

        boolean success =
                driver.findElement(By.className("inventory_list")).isDisplayed();

        Assert.assertTrue(success);
        log.info("Login Successful - Test Passed");
    }
}
