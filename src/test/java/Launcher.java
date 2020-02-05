import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/address.feature", "src/Cucumber/Features/buy.feature",
        glue = "StepDefinitions",
        plugin = {"pretty","html:out"})

public class Launcher {

}