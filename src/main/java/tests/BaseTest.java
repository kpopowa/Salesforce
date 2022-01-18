package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeOptions;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.Assert;
 import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    public static final String BASE_URL = "https://login.salesforce.com/";
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;

    @BeforeMethod
    public void setup() {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         loginPage = new LoginPage(driver);
         homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage  = new AccountModalPage(driver);
        accountDetailsPage  = new AccountDetailsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() { driver.quit();}

     @Override
    public abstract boolean isPageOpen(){
       return false;
    }



}
