package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.CSVReaderUtil;

public class LoginModuleTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        String path = System.getProperty("user.dir") + "/loginData.csv";
        return CSVReaderUtil.getCSVData(path);
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        LoginPage lp = new LoginPage();
        lp.login(username, password);

        // Intentionally fail invalid login for demo
        Assert.assertTrue(lp.getCurrentURL().contains("inventory"),
                "Login failed for user: " + username);
    }
}