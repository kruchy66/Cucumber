import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"classpath:features/"})
public class RunTest extends AbstractTestNGCucumberTests {
}
