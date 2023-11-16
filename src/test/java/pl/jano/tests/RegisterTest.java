package pl.jano.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.jano.pages.HomePage;

public class RegisterTest extends BaseTest {


    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @BeforeTest
    public void generateEmail() {
        int random = (int) (Math.random() * 1000);
        setEmail("test" + random + "@test.pl");
    }

    @Test
    public void registerUserTest() {
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData(getEmail(), "test@test123.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test(dependsOnMethods = {"registerUserTest"})
    public void registerUserWithSameEmailTest() {

        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUserInvalidData(getEmail(), "test@test123.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));
    }

}
