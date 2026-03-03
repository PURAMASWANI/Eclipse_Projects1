package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;

    @FindBy(className = "inventory_item_name")
    WebElement product;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductsPage addProductToCart() {
        addToCart.click();
        return this;
    }

    public ProductsPage goToCart() {
        cart.click();
        return this;
    }

    public boolean isProductDisplayed() {
        return product.isDisplayed();
    }
}