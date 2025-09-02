import BaseTest.BaseClass;
import PageObjects.*;
import Utilities.ReadPropertyFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostPaidEvent extends BaseClass {

    @BeforeMethod
    public void startBrowser() throws Exception {
        launchBrowser();
    }

    @Test
    public void MakePostPaidEvent() throws Exception {
        LoginPage login = new LoginPage();
        Dashboard dashboard = new Dashboard();
        PostPaidRegistrations registrations = new PostPaidRegistrations();
        ProductPagePostPaid pack = new ProductPagePostPaid();
        UploadFiles upload = new UploadFiles();
        Payment payment = new Payment();


        String username = ReadPropertyFile.getProperty1("Team_Lead_Username");
        String password = ReadPropertyFile.getProperty1("Team_Lead_Password");
        String Package = ReadPropertyFile.getProperty1("PostPaidPackage");
        login.enterLoginCredentials(username, password);
        login.clickLogin();


        dashboard.clickPostPaidRegistration();

        registrations.clickSearchCTA();
        registrations.selectFirstMSISDN();
        registrations.clickProceedCTA();
        pack.ClickEsim();
        Thread.sleep(2000);
        pack.selectPostPaidPackage(ReadPropertyFile.getProperty1("PostPaidPackage"));
        pack.selectPackage();
        Thread.sleep(2000);
        pack.selectEsimProduct(ReadPropertyFile.getProperty1("EsimPostPaidProduct"));
        pack.selectPackage();
        pack.clickNextCTA();
        pack.enterEmailID(ReadPropertyFile.getProperty1("Email"));
        pack.SendOTP();
        pack.EnterOTP(ReadPropertyFile.getProperty1("OTP"));
        pack.ValidateOTP();
        Thread.sleep(2000);
        pack.clickOKButton();

        pack.clickNationalitydropdown(ReadPropertyFile.getProperty1("Nationality"));
        upload.uploadIDProof(ReadPropertyFile.getProperty1("fileName"));
        upload.uploadSelfie(ReadPropertyFile.getProperty1("fileName2"));
        pack.Toggle_The_OCR();
        pack.clickReadOCR();
        pack.clickContactNumber(ReadPropertyFile.getProperty1("Contact"));
//        pack.clickEmailAddress(ReadPropertyFile.getProperty1("Email"));
        Thread.sleep(2000);


        pack.enterBuildingName(ReadPropertyFile.getProperty1("Building"));
        pack.enterStreetAddress(ReadPropertyFile.getProperty1("Address"));


        pack.enterProvince(ReadPropertyFile.getProperty1("Province"));
        pack.enterCity(ReadPropertyFile.getProperty1("City"));
        pack.enterPostalCode(ReadPropertyFile.getProperty1("PostalCode"));

        pack.EnterRefranceName(ReadPropertyFile.getProperty1("RefName"));
        pack.enterRefContactNo(ReadPropertyFile.getProperty1("RefContact"));
        pack.enterRefRelationship(ReadPropertyFile.getProperty1("RefRelationship"));
        Thread.sleep(3000);
        pack.EnterNokId(ReadPropertyFile.getProperty1("NokId"));
        pack.enterValidateKYCId();
        pack.clickOKButton();
        pack.clickNextCTA();

//        pack.clickDownloadFAB();
        upload.uploadFABDocument(ReadPropertyFile.getProperty1("fileName3"));
        pack.clickOKButton();
        pack.clickAddToCartCTA();
        Thread.sleep(2000);
        pack.clickOKButton();
        Thread.sleep(2000);
        pack.clickCartIcon();

        payment.clickPayAmount();
        payment.clickEmail(ReadPropertyFile.getProperty1("PaymentEmail"));
        payment.clickPaymentSelId(ReadPropertyFile.getProperty1("PaymentId"));
        payment.clickAddCheck();
        payment.clickSubmitPayCTA();
        pack.clickOKButton();
        payment.ClickTransaction();


    }
}
