package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;




public class AddressSteps {

    public static WebDriver webDriver;
    private WebDriver driver;

    @Given("^I open chrome browser$")
    public void iOpenChromeBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("^I navigate to login\\.html page$")
    public void iNavigateToLoginHtmlPage() throws Throwable {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
    }

    @When("^I provide username and password$")
    public void iProvideUsernameAsHiAndPasswordAsHi() throws Throwable {
        WebElement webElement = webDriver.findElement(By.name("email"));
        webElement.sendKeys("d1616474@urhen.com");
        webElement = webDriver.findElement(By.name("password"));
        webElement.sendKeys("Szkolenie123");
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        WebElement webElement = webDriver.findElement(By.id("submit-login"));
        webElement.click();
    }

    @Then("^User name should be visible$")
    public void nameShouldBeVisible() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//span[text()='Mateusz Kubiak']"));


        @And("^I click on addreess button$")
        public void iClickOnAddreessButton () {
            WebElement webElement = webDriver.findElement(By.id("address-link"));
            webElement.click();
        }


        @And("^I provide <alias> <address> <city> <zip> <country> and <phone>$")
        public void iProvideAliasAddressCityZipCountryAndPhone () {

            WebElement alias = driver.findElement(By.name("alias"));
            alias.sendKeys(alias);

            WebElement address = driver.findElement(By.name("address1"));
            address.sendKeys(address);

            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys(city);

            WebElement zip = webDriver.findElement(By.name("postcode"));
            zip.sendKeys(zip);

            WebElement country = driver.findElement(By.name("id_country"));
            country.sendKeys(country);

            WebElement phone = driver.findElement(By.name("phone"));
            phone.sendKeys(phone);

        }

        @Then("^I click on save addreess button$")
        public void iClickOnSaveAddreessButton () {

            WebElement webElement = webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
            webElement.click();
        }

        @And("^close browser$")
        public void closeBrowser () {
            driver.quit();
        }

    }







