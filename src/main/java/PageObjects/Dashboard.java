package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BaseClass {

    @FindBy(xpath = "//*[@class=\"fas fa-cash-register fa-lg\"]")
    WebElement CashboxLogo;

    @FindBy(xpath = "//*[text()=\"Open/Close CashBox\"]")
    WebElement OpenOrcloseCashBoxLogo;

    @FindBy(xpath = "//*[text()=\"Store Open/Close\"]")
    WebElement StoreOpenCloseCTA;

    //Registrations

    @FindBy(xpath = "(//*[text()=\"Postpaid\"])[1]")
    WebElement PostPaidRegistration;

    @FindBy(xpath = "(//*[text()=\"Prepaid\"])[1]")
    WebElement PrepaidRegistration;


public Dashboard() {
    PageFactory.initElements(driver, this);
}

    public void hover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    // Call hover on CashboxLogo
    public void HoverOnCashBox() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CashboxLogo);

        Actions actions = new Actions(driver);
        actions.moveToElement(CashboxLogo).perform();
    }
    //Selecting the Open/CloseCashBox
    public void clickOpenCloseCashBox() {
        OpenOrcloseCashBoxLogo.click();
    }

    public void clickStoreOpenCloseCTA() {
        StoreOpenCloseCTA.click();
    }

    public void clickPostPaidRegistration() {
    PostPaidRegistration.click();
    }

    public void clickPrepaidRegistration() {
    PrepaidRegistration.click();
    }




}
