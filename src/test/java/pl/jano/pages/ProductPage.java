package pl.jano.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(xpath = "//div[@class='woocommerce-message']//a[text()='View cart']")
    private WebElement viewCartButton;

    @FindBy(name = "add-to-cart")
    private WebElement addToCartButton;
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage addProductCart() {
        addToCartButton.click();
        return this;
    }

    public CartPage viewCart() {
        viewCartButton.click();
        return new CartPage(driver);
    }
}
