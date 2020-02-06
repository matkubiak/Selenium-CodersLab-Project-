package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopSteps {

    public WebDriver driver;

    @Given("^I open chrome browser$")
    public void iOpenChromeBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(200);
    }

    @When("^I navigate to login\\.html page$")
    public void iNavigateToLoginHtmlPage() throws Throwable {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        Thread.sleep(200);
    }

    @And("^I provide username and password$")
    public void iProvideUsernameAsHiAndPasswordAsHi() throws Throwable {
        WebElement webElement = driver.findElement(By.name("email"));
        webElement.sendKeys("d1616474@urhen.com");
        webElement = driver.findElement(By.name("password"));
        webElement.sendKeys("Szkolenie123");
        Thread.sleep(200);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        WebElement webElement = driver.findElement(By.id("submit-login"));
        webElement.click();
        Thread.sleep(200);
    }

    @And("^I search \"([^\"]*)\"$")
    public void iSearch(String searchText) throws Throwable {
        WebElement poleWyszukiwarki = driver.findElement(By.name("s"));
        poleWyszukiwarki.click();
        poleWyszukiwarki.sendKeys(searchText);
        poleWyszukiwarki.click();
        Thread.sleep(300);
    }

    @And("^I click on product$")
    public void iClickOnProduct() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//*[contains(text(),'Hummingbird printed sweater')]"));
        webElement.click();
        Thread.sleep(500);
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) throws Throwable {
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText(size);
        Thread.sleep(500);
    }

    @And("^I select quantity$")
    public void iSelectQuantity() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='material-icons touchspin-up']"));
        for(int i=0; i<4; i++){
            webElement.click();
            Thread.sleep(500);
        }
    }


    @And("^I click add to cart$")
    public void iClickOnAddToCart() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[@data-button-action]"));
        webElement.click();
        Thread.sleep(500);
    }

    @And("^I click checkout$")
    public void iClickCheckout() throws Throwable {
       WebElement webElement = driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
        webElement.click();
        Thread.sleep(300);

    }
    @And("^I click proceed to checkout$")
    public void iClickProceedToCheckout() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
        webElement.click();
        Thread.sleep(300);
    }

    @And("^I click on continue address button$")
    public void iClickOnContinueAddressButton() throws Throwable {
        WebElement webElement = driver.findElement(By.name("confirm-addresses"));
        webElement.click();
        Thread.sleep(300);
    }

    @And("^I click on continue shipping button$")
    public void iClickOnContinueShippingButton() throws Throwable {
        WebElement webElement = driver.findElement(By.name("confirmDeliveryOption"));
        webElement.click();
        Thread.sleep(300);

    }

    @And("^I click on pay by check$")
    public void iClickOnPayByCheck() throws Throwable {
        WebElement webElement = driver.findElement(By.id("payment-option-1"));
        webElement.click();
        Thread.sleep(300);
    }

    @And("^I agree on term$")
    public void iClickOnAcceptTerm() throws Throwable {
        WebElement webElement = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        webElement.click();
        Thread.sleep(300);
    }

    @And("^I click on order button$")
    public void iClickOnOrderButton() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[contains(text(),'Order with an obligation to pay')]"));
        webElement.click();
        Thread.sleep(300);
    }

    @Then("^Take screenshot$")
    public void takeScreenshot() throws Throwable {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\\\Users\\mat_k\\Desktop\\Ćwiczenia\\Screenshot\\screen.jpg"));
        Thread.sleep(300);
    }



    @And("^close browser$")
    public void closeBrowser() { driver.quit(); }



}