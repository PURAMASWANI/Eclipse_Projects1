package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(className = "complete-header")
    WebElement successMsg;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CheckoutPage enterDetails(String f, String l, String p) {
        firstName.sendKeys(f);
        lastName.sendKeys(l);
        postalCode.sendKeys(p);
        continueBtn.click();
        return this;
    }

    public CheckoutPage finishOrder() {
        finishBtn.click();
        return this;
    }

    public String getSuccessMessage() {
        return successMsg.getText();
    }
}