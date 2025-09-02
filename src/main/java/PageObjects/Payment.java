package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment extends BaseClass {

    @FindBy(xpath = "//*[@data-bind=\"click : payAmount\"]")
    WebElement payAmount;

    @FindBy(xpath = "//select[@id=\"paymentSelId\"]")
    WebElement paymentSelId;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"addPaymentClk\"]")
    WebElement addCheck;

    @FindBy(xpath = "//*[@id=\"submitpay\"]")
    WebElement submitPayCTA;

    @FindBy(xpath = "//*[@id=\"viewTrasnBtn\"]")
    WebElement viewTrasaction;


    public Payment() {
        PageFactory.initElements(driver, this);
    }

    public void clickPayAmount(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", payAmount);
    }


    public void clickPaymentSelId(String payType){
        Select select = new Select(paymentSelId);
        select.selectByVisibleText(payType);
    }

    public void clickEmail(String EmailID){
        email.sendKeys(EmailID);
    }

    public void clickAddCheck(){
        addCheck.click();
    }

    public void clickSubmitPayCTA(){
        submitPayCTA.click();
    }

    public void ClickTransaction(){
        viewTrasaction.click();
    }



}
