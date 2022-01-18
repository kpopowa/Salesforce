package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{

    public static final By BREADCRUMS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span")

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
      return   isExist(BREADCRUMS_LABEL);
    }

    public AccountListPage open(){
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public AccountModalPage clickNew(){
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }


}
