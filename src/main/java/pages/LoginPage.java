package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public static final By MENU_HOME_LINK = By.xpath("//span[@class = 'slds-truncate'][text()='Home']");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isPageOpen(){
        return isExist(LOGIN_BUTTON);
    }


    public LoginPage open(){
        driver.get(BASE_URL);
        return this;
    }

    public HomePage login(String username, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);

    }


}
