package pl.jano.tests;

import org.testng.annotations.Test;
import pl.jano.models.Customer;
import pl.jano.pages.HomePage;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {
        Customer customer = new Customer();
        customer.setFirstName("Jan");
        customer.setLastName("Testowy");
        customer.setCompanyName("TESTEX");
        customer.setCountry("Poland");
        customer.setStreet("Testowa");
        customer.setFlatNumber("12");
        customer.setZipCode("86320");
        customer.setCity("Kraków");
        customer.setPhone("663227254");
        customer.setEmail("random@gmail.com");

        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductCart()
                .viewCart()
                .openAddresDetails()
                .fillAdressDetails(customer,"Some random comment");

    }


}
