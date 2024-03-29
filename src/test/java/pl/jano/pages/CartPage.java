package pl.jano.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.jano.utils.SeleniumHelper;

public class CartPage {

    private WebDriver driver;
    @FindBy(partialLinkText = "Proceed to checkout")
    private WebElement proceedToCheckoutButton;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AddresDetailsPage openAddresDetails() {
        SeleniumHelper.waitForClickable(proceedToCheckoutButton,driver);
        proceedToCheckoutButton.click();
        return new AddresDetailsPage(driver);

    }
}
