package utils;

import org.testng.annotations.DataProvider;

public class DataUtils {

    @DataProvider(name = "sauceLoginData")
    public Object[][] getData() {

        return new Object[][] {

            // valid login
            {"standard_user", "secret_sauce", "success"},

            // valid user wrong pass
            {"standard_user", "wrong_pass", "error"},

            // invalid user valid pass
            {"wrong_user", "secret_sauce", "error"},

            // empty
            {"", "", "validation"},

            // locked out user
            {"locked_out_user", "secret_sauce", "locked"}

        };
    }
}