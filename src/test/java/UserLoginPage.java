import BaseTest.BaseClass;
import PageObjects.LoginPage;
import Utilities.ReadPropertyFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserLoginPage extends BaseClass {

    @BeforeMethod
    public void startBrowser() throws Exception {
        launchBrowser();
    }

    @Test
    public void loginTheUser() throws Exception {
        // Create object of LoginPage
        LoginPage login = new LoginPage();

        // Fetch credentials from config.properties
        String username = ReadPropertyFile.getProperty1("Admin_Username");
        String password = ReadPropertyFile.getProperty1("Admin_Password");

        // Perform login
        login.enterLoginCredentials(username, password);
        login.clickLogin();
    }
}
