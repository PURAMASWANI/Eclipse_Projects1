package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.RetryAnalyzer;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", true},
                {"standard_user", "wrong", false},
                {"wrong", "secret_sauce", false},
                {"", "", false}
        };
    }

    @Test(dataProvider = "loginData",
          retryAnalyzer = RetryAnalyzer.class)
    public void loginTest(String username,
                          String password,
                          boolean expected) {

        LoginPage login = new LoginPage(driver);

        login.enterUsername(username)
             .enterPassword(password)
             .clickLogin();

        if (expected) {
            Assert.assertTrue(
                    driver.getCurrentUrl().contains("inventory"));
        } else {
            Assert.assertTrue(login.isErrorDisplayed());
        }
    }
}