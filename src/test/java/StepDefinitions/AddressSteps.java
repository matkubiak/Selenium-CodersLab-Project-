package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;




public class AddressSteps {

    private WebDriver driver;

    @Given("^I open new chrome browser$")
    public void iOpenChromeBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }

    @When("^I navigate to login page$")
    public void iNavigateToLoginHtmlPage() throws Throwable {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        Thread.sleep(1000);
    }

    @And("^I provide username and password on login page$")
    public void iProvideUsernameAsHiAndPasswordAsHi() throws Throwable {
        WebElement webElement = driver.findElement(By.name("email"));
        webElement.sendKeys("d1616474@urhen.com");
        webElement = driver.findElement(By.name("password"));
        webElement.sendKeys("Szkolenie123");
        Thread.sleep(500);
    }

    @And("^I click login button$")
    public void iClickOnLoginButton() throws Throwable {
        WebElement webElement = driver.findElement(By.id("submit-login"));
        webElement.click();
        Thread.sleep(500);
    }

    @And("^I click on addreess button$")
    public void iClickOnAddreessButton() throws Throwable {
        driver.findElement(By.cssSelector("a[href*='addresses']")).click();
        Thread.sleep(500);
    }

    @And("^I add a new address$")
    public void iAddANewAddress() throws Throwable {
        driver.findElement(By.xpath("//*[contains(text(), 'Create new address')]")).click();
        Thread.sleep(1000);
    }

    @And("^I provide a keyword \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void iProvideAKeyword(String alias, String address, String city, String zip, String country, String phone) throws Throwable {

        WebElement aliasElement = driver.findElement(By.name("alias"));
        aliasElement.sendKeys(alias);
        Thread.sleep(500);


        WebElement addressElement = driver.findElement(By.name("address1"));
        addressElement.sendKeys(address);
        Thread.sleep(500);


        WebElement cityElement = driver.findElement(By.name("city"));
        cityElement.sendKeys(city);
        Thread.sleep(500);

        WebElement zipElement = driver.findElement(By.name("postcode"));
        zipElement.sendKeys(zip);
        Thread.sleep(500);

        new Select(driver.findElement(By.name("id_country"))).selectByVisibleText(country);

        WebElement phoneElement = driver.findElement(By.name("phone"));
        phoneElement.sendKeys(phone);
        Thread.sleep(500);
    }


    @Then("^I click on save address button$")
    public void iClickOnSaveAddreessButton() throws InterruptedException {

        WebElement webElement = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        webElement.click();
        Thread.sleep(500);
    }

    @And("^Delete address$")
    public void deleteAddress() {
        WebElement adresId = driver.findElement(By.xpath("//*[@id='content']/descendant::h4[position()=2]/following::span[position()=2]"));
        adresId.click();
    }


     @And("^Close browser$")
        public void closeBrowser () {
            driver.quit();
        }



}









