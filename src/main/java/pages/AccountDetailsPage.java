package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{
    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String fieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";

    public AccountDetailsPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isPageOpen(){
        return isExist(DETAILS_LINK);
    }

    public String getFieldValueByName(String fieldName) {
        driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();


    }
}
