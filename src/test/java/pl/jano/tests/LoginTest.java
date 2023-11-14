package pl.jano.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.jano.pages.HomePage;

public class LoginTest extends BaseTest {
    @Test
    public void logInTest() {
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .loginValidData("test@test.pl", "test@test123.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void logInWithInvalidPassword() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .loginInvalidData("test@test.pl", "test@test123.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password"), "Expected error text doesn't match");
    }

}
