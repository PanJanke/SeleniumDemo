package pl.jano.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.jano.pages.HomePage;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {
        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductCart()
                .viewCart()
                .openAddresDetails();

    }


}
