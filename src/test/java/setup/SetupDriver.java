package setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetupDriver {

     public static SafariDriver safariDriver;
     private static ChromeDriver Chromedriver;
     private static FirefoxDriver firefoxDriver;
     private static InternetExplorerDriver internetExplorerDriver;

     @Before("@safariFirst")
    public SafariDriver openSafariDriver(){

         safariDriver = new SafariDriver();
         return safariDriver;
     }

     @Before("@safari")
    public static SafariDriver getSafariDriver() {
        return safariDriver;
    }
    @After("@safariLast")
    public void  safariDriverClose() {
        safariDriver.close();

    }
}
