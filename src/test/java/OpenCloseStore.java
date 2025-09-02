import BaseTest.BaseClass;
import PageObjects.Dashboard;
import PageObjects.LoginPage;
import Utilities.ReadPropertyFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OpenCloseStore extends BaseClass {

    @BeforeMethod
    public void startBrowser() throws Exception {
        launchBrowser();
    }

    @Test
    public void OpenStore() throws Exception {

        //Login Page Creds
        LoginPage login = new LoginPage();
        Dashboard dashboard = new Dashboard();
        String username = ReadPropertyFile.getProperty1("Admin_Username");
        String password = ReadPropertyFile.getProperty1("Admin_Password");
        login.enterLoginCredentials(username, password);
        login.clickLogin();

        //Open the Store
        dashboard.HoverOnCashBox();
        dashboard.clickStoreOpenCloseCTA();

        System.out.println("Yes ");





    }

}
