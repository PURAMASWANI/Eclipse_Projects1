package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.DataUtils;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "sauceLoginData",
          dataProviderClass = DataUtils.class)

    public void loginTest(String username, String password, String exp) {

        LoginPage lp = new LoginPage();
        lp.login(username, password);

        if (exp.equals("success")) {

            Assert.assertTrue(lp.getCurrentURL().contains("inventory"),
                    "Expected successful login");
        	//Assert.assertTrue(lp.getCurrentURL().contains("wrongpage"));

        } else if (exp.equals("error")) {

            Assert.assertTrue(lp.getErrorMessage().contains("Username and password do not match"),
                    "Expected authentication error");

        } else if (exp.equals("validation")) {

            Assert.assertTrue(lp.getErrorMessage().contains("Username is required"),
                    "Expected validation for empty fields");

        } else if (exp.equals("locked")) {

            Assert.assertTrue(lp.getErrorMessage().contains("locked out"),
                    "Expected locked out message");
        }
    }
}