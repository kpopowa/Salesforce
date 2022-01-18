package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.LoginPage.*;

public class LogInTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("popowa.kri2021-9mhf@force.com", "misha.11")
                .isPageOpen();


        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
        //loginPage = new LoginPage(driver);
    }
}