package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPagePostPaid extends BaseClass {

    @FindBy(xpath = "//*[@id=\"ESIM\"]")
    WebElement esim;

    @FindBy(xpath = "//tr[@id='2']//input[@placeholder='Select product']")
    WebElement ProductSelectbox;

    @FindBy(xpath = "(//input[@placeholder='Select product'])[3]")
    WebElement EsimProductSelectbox;

    @FindBy(xpath = "(//*[@class=\"ui-menu-item\"])[1]")
    WebElement selectPackage;

    @FindBy(xpath = "(//*[@placeholder=\"Serial Number\"])[3]")
    WebElement serialNumber;

    @FindBy(xpath = "//*[@class=\"ui-menu-item\"]")
    WebElement selectProduct;

    @FindBy(xpath = "//*[@id=\"EmailId\"]")
    WebElement emailId;

    @FindBy(xpath = "//*[@id=\"sendOtpBtn\"]")
    WebElement sendOtpBtn;

    @FindBy(xpath = "//*[@id=\"OTPValue\"]")
    WebElement OTPValue;

    @FindBy(xpath = "//*[@id=\"validateOTP\"]/button")
    WebElement validateOtpBtn;

    @FindBy(xpath = "//*[@id=\"goNextPageId\"]")
    WebElement NextCTA;

    @FindBy(xpath = "//input[@name=\"read_Via_Card_Reader\"]")
    WebElement ToggleOCR;

    @FindBy(xpath = "//*[@id=\"cust_type\"]")
    WebElement Nationalitydropdown;

    @FindBy(xpath = "//*[text()=\"Read Card Reader\"]")
    WebElement ReadCardReader;

    @FindBy(xpath = "//*[text()=\"Read OCR\"]")
    WebElement ReadOCR;

    @FindBy(xpath = "//*[@id=\"contact_number\"]")
    WebElement ContactNumber;

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    WebElement EmailAddress;

    @FindBy(xpath = "//*[@name=\"NIK\"]")
    WebElement NikId;

    @FindBy(xpath = "//*[@id=\"nokk_id\"]")
    WebElement NokkId;

    @FindBy(xpath = "//input[@id=\"building_name_res\"]")
    WebElement BuildingName;

    @FindBy(xpath = "//*[@id=\"street_address_res1\"]")
    WebElement StreetAddress;

    @FindBy(xpath = "//*[@id=\"province_res\"]")
    WebElement Province;

    @FindBy(xpath = "//*[@id=\"city_res\"]")
    WebElement City;

    @FindBy(xpath = "//*[@id=\"postal_code_res\"]")
    WebElement PostalCode;

    @FindBy(xpath = "//*[@id=\"ref_name\"]")
    WebElement RefName;

    @FindBy(xpath = "//*[@id=\"ref_contact_no\"]")
    WebElement RefContactNo;

    @FindBy(xpath = "//*[@id=\"ref_relationship\"]")
    WebElement RefRelationship;

    @FindBy(xpath = "//*[text()=\"Validate\"]")
    WebElement ValidateKYC;

    @FindBy(xpath = "//button[text()=\"OK\"]")
    WebElement OKButton;

    @FindBy(xpath = "//*[@id=\"download_fab\"]")
    WebElement DownloadFAB;

    @FindBy(xpath = "//*[@class=\"fa fa-shopping-cart\"]")
    WebElement AddToCartCTA;

    @FindBy(xpath = "//*[@class=\" fa fa-cart-plus fa-2x\"]")
    WebElement CartIcon;


    public ProductPagePostPaid() {
        PageFactory.initElements(driver, this);
    }

    public void ClickEsim() {
        esim.click();
    }

    public void selectPostPaidPackage(String PackagePostPaid) throws InterruptedException {
        ProductSelectbox.sendKeys(PackagePostPaid);
        ProductSelectbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void selectEsimProduct(String Esim) throws InterruptedException {
        EsimProductSelectbox.sendKeys(Esim);
        EsimProductSelectbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


    }

    public void selectPackage() {
        selectPackage.click();
    }

    public void enterEmailID(String EmailID) throws InterruptedException {
        emailId.sendKeys(EmailID);
    }

    public void SendOTP() {
        sendOtpBtn.click();
    }

    public void EnterOTP(String OTP) throws InterruptedException {
        OTPValue.sendKeys(OTP);
    }


    public void ValidateOTP() {
        validateOtpBtn.click();
    }

    public void Toggle_The_OCR() {
        ToggleOCR.click();
    }

    public void EnterSerialNumber(String SerialNumber) {
        serialNumber.sendKeys(SerialNumber);
        serialNumber.sendKeys(Keys.ENTER);
    }

    public void selectPostPaidProduct() {
        selectProduct.click();
    }

    public void clickNextCTA() {
        NextCTA.click();
    }


    public void clickNationalitydropdown(String Nationality) {
        Select select = new Select(Nationalitydropdown);
        select.selectByVisibleText(Nationality);
    }

    public void clickReadCardReader() {
        ReadCardReader.click();
    }

    public void clickReadOCR() {
        ReadOCR.click();
    }

    public void clickContactNumber(String number) {
        ContactNumber.sendKeys(number);
    }

    public void clickEmailAddress(String mailid) {
        EmailAddress.sendKeys(mailid);
    }

    public String getSerialNumber() {
        return NikId.getText();
    }

    public void EnterNokId(String nikId) {
        NokkId.sendKeys(nikId);
    }

    public void enterBuildingName(String buildingName) {
        BuildingName.sendKeys(buildingName);
    }

    public void enterStreetAddress(String streetAddress) {
        StreetAddress.sendKeys(streetAddress);
    }

    public void enterProvince(String province) {
        Select select = new Select(Province);
        select.selectByVisibleText(province);
    }

    public void enterCity(String city) {
        Select select = new Select(City);
        select.selectByVisibleText(city);
    }

    public void enterPostalCode(String postalCode) {
        Select select = new Select(PostalCode);
        select.selectByVisibleText(postalCode);
    }

    public void EnterRefranceName(String Name) {
        RefName.sendKeys(Name);
    }

    public void enterRefContactNo(String contactNo) {
        RefContactNo.sendKeys(contactNo);
    }

    public void enterRefRelationship(String relationship) {
        Select select = new Select(RefRelationship);
        select.selectByVisibleText(relationship);
    }

    public void enterValidateKYCId() {
        ValidateKYC.click();
    }

    public void clickOKButton() {
        OKButton.click();
    }

    public void clickDownloadFAB() {
        DownloadFAB.click();
    }

    public void clickAddToCartCTA() {
        AddToCartCTA.click();
    }

    public void clickCartIcon() {
        CartIcon.click();
    }


}
