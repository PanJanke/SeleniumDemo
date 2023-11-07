package pl.jano.tests;

import org.testng.annotations.Test;
import pl.jano.pages.HomePage;

public class RegisterTest extends BaseTest{
    @Test
    public void registerUserTest(){
      new HomePage(driver).openMyAccountPage()
                          .registerUser("test@test123.pl","test@test123.pl");

    }
}
