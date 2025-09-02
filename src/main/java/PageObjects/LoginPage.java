package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    // Locators
    @FindBy(xpath = "//*[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement loginCTA;

    // Constructor → Initialize PageFactory elements
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to enter login credentials
    public void enterLoginCredentials(String uname, String pwd) {
        username.sendKeys(uname);
        password.sendKeys(pwd);
    }

    // Method to click login button
    public void clickLogin() {
        loginCTA.click();
    }
}
