package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class OrderTest extends BaseTest {

    @Test
    public void completeOrderTest() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("standard_user")
             .enterPassword("secret_sauce")
             .clickLogin();

        ProductsPage products = new ProductsPage(driver);
        products.addProductToCart()
                .goToCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterDetails("John","Doe","12345")
                .finishOrder();

        Assert.assertTrue(
                checkout.getSuccessMessage()
                        .contains("Thank you"));
    }
}