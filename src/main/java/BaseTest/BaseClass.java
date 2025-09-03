package BaseTest;
import java.lang.String;
import java.time.Duration;

import Utilities.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//BaseClass Containing all the common behaviours for browser setup.
public class BaseClass {
    public static WebDriver driver;


    //Launching the browser Method and navigate to the URL
    public static void launchBrowser() throws Exception{
        String browser = ReadPropertyFile.getProperty1("browser");
        String url = ReadPropertyFile.getProperty1("url");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);// ✅ Ignore SSL errors
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-software-rasterizer");
            driver = new ChromeDriver(options); // pass options here
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        // Maximizing the browser window
        driver.manage().window().maximize();
        driver.get(url);


    }
}
