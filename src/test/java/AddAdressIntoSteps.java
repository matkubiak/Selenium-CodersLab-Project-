import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AddAdressIntoSteps {
    MyStorePage myStorePage;
    WebDriver driver;


    @Given("^User is logged in to CodersLab shop$")
    public void userIsLooggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("d1616474@urhen.com", "Szkolenie123");
        myStorePage = new MyStorePage(driver);
    }


    @When("^User goes to the page with the shipping addresses$")
    }

    @And("^User goes to the page with the form using the \"([^\"]*)\" button$")
        }

    @And("^User correctly enters keywords the required fields$")
    public void userCorrectlyEntersKeywordsTheRequiredFields()
        }


    @And("^User saves the data with the \"([^\"]*)\" button$")
        }

    @Then("^User receives information about the correct entry of the address, and close browser$")
    public void userReceivesInformationAboutTheCorrectEntryOfTheAddressAndCloseBrowser() {
        Assert.assertEquals(message, userInfoPage.getUpdateInformation());
        driver.quit();
         }

}