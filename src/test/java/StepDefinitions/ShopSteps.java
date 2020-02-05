package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopSteps {

    public static WebDriver webDriver;
    public WebDriver driver;

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


    @When("^I click on pay by check$")
    public void iClickOnPayByCheck() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//span[text()='Pay by Check']"));
        webElement.click();
    }

    @When("^I agree on term$")
    public void iClickOnAcceptTerm() throws Throwable {
        WebElement webElement = webDriver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        webElement.click();
    }

    @When("^I click on order button$")
    public void iClickOnOrderButton() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//button[contains(text(),'Order with an obligation to pay')]"));
        webElement.click();
    }

    @When("^I click on logo$")
    public void iClickOnLogo() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        webElement.click();
    }

    @When("^I click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String productName) throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath(String.format("//*[text()='%s']", productName)));
        webElement.click();
    }

    @When("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) throws Throwable {
        new Select(webDriver.findElement(By.id("group_1"))).selectByVisibleText(size);
    }

    @When("^I select quantity$")
    public void iSelectQuantity() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//*[@class='material-icons touchspin-up']"));
        for(int i=0; i<4; i++){
            webElement.click();
        }
    }

    @When("^I click add to cart$")
    public void iClickOnAddToCart() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//button[@data-button-action]"));
        webElement.click();
    }

    @When("^I click checkout$")
    public void iClickCheckout() throws Throwable {
        Thread.sleep(2000);
        WebElement webElement = webDriver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
        webElement.click();
    }


    @Then("^Address should be: alias as \"([^\"]*)\" and address as \"([^\"]*)\" and zip \"([^\"]*)\" and city \"([^\"]*)\" and country \"([^\"]*)\"$")
    public void addressShouldBe(String alias, String address, String city, String zip, String country) throws Throwable {
        WebElement webElementAlias = webDriver.findElement(By.xpath("//h4"));
        WebElement webElementAddress = webDriver.findElement(By.xpath("//address"));

        try {
            assertThat(webElementAlias.getText()).isEqualTo(alias);
            assertThat(webElementAddress.getText()).contains(address);
            assertThat(webElementAddress.getText()).contains(city);
            assertThat(webElementAddress.getText()).contains(zip);
            assertThat(webElementAddress.getText()).contains(country);
        } finally {
            webDriver.quit();
        }
    }

    @Then("^Take screenshot$")
    public void takeScreenshot() throws Throwable {
            TakesScreenshot scrShot =((TakesScreenshot)webDriver);
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SrcFile, new File ("c:\\\\Users\\mat_k\\Desktop\\Ćwiczenia\\screenshot.png"));
    }

    @When("^I click on continue address button$")
    public void iClickOnContinueAddressButton() throws Throwable {
        WebElement webElement = webDriver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        webElement.click();
    }

    @When("^I click on continue shipping button$")
    public void iClickOnContinueShippingButton() throws Throwable {
        WebElement webElement = webDriver.findElement(By.name("confirmDeliveryOption"));
        webElement.click();

    }

    @And("^close browser$")
    public void closeBrowser() { driver.quit(); }

}