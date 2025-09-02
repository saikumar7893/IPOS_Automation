package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCloseStore extends BaseClass {

    @FindBy(xpath = "//*[@id=\"store_type\"]")
    WebElement ClickStoreType;

    @FindBy(xpath = "//*[text()=\"Store Open\"]")
    WebElement OpenStore;

    @FindBy(xpath = "//*[text()=\"Store Close\"]")
    WebElement CloseStore;

    @FindBy(xpath = "(//*[@id=\"selfStrSubmitButton\"])[2]")
    WebElement submitButton;

    @FindBy(xpath = "//button[text()=\"OK\"]")
    WebElement OkCTA;

    @FindBy(xpath = "value=\"Back\"")
    WebElement BackCTA;



    public OpenCloseStore() {
        PageFactory.initElements(driver, this);
    }



}
