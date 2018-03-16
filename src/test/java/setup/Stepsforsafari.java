package setup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import setup.SetupDriver;
//import setup.SetupDriver;


public class Stepsforsafari {

    @Given("^\\[safari\\] I open site with text \"([^\"]*)\"$")
    public void safari_I_open_site_with_text(String arg1) throws Throwable {
        SafariDriver driver = SetupDriver.safariDriver;
        driver.get("http://www.google.com");
        throw new PendingException();
    }
    @Given("^\\[safari\\] I close safari$")
    public void safariClose(){
        SafariDriver driver = SetupDriver.safariDriver;
        driver.close();
    }


}
