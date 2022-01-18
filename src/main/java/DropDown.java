import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    String dropDownLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]/div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class,'visible')]//a[text()='%s'";
    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option){
        System.out.println(String.format("Select Option'%s' into dropdown with label '%s'\n", this.label));
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }

}
