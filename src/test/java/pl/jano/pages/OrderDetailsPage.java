package pl.jano.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {


    @FindBy(xpath = "//td[contains(@class,'product-name')]")
    private WebElement productName;
    @FindBy(xpath ="//div[@class='woocommerce-order']//p" )
    private WebElement OrderNotice;
    private WebDriver driver;
    public OrderDetailsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public WebElement getOrderNotice() {
        return OrderNotice;
    }

    public WebElement getProductName() {
        return productName;
    }

}
