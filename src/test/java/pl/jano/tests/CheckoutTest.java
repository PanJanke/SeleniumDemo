package pl.jano.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.jano.models.Customer;
import pl.jano.pages.HomePage;
import pl.jano.pages.OrderDetailsPage;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductCart()
                .viewCart()
                .openAddresDetails()
                .fillAdressDetails(customer,"Some random comment");


        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(),"Thank you. Your order has been received.");
        Assert.assertTrue(orderDetailsPage.getProductName().getText().contains("Java Selenium WebDriver"));
    }


}
