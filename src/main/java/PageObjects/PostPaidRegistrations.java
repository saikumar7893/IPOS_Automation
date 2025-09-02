package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPaidRegistrations extends BaseClass {

    @FindBy(xpath = "//button[@id=\"msisdnSearchButton\"]")
    public WebElement SearchCTA;

    @FindBy(xpath = "(//*[@aria-describedby=\"list_bill_payment_list_msisdn\"])[4]")
    WebElement selectFirstMSISDN;

    @FindBy(xpath = "//*[@onclick=\"proceed()\"]")
    WebElement proceedCTA;



    public PostPaidRegistrations() {
        PageFactory.initElements(driver, this);
    }


    public void clickSearchCTA() {
        SearchCTA.click();
    }

    public void selectFirstMSISDN() {
        selectFirstMSISDN.click();
    }

    public  void clickProceedCTA() {
        proceedCTA.click();
    }

}
