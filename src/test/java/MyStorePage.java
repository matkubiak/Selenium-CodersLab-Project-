import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyStorePage {
    private static WebDriver driver;

    @FindBy(name = "alias")
    WebElement alias;

    @FindBy(name = "adress1")
    WebElement adress;

    @FindBy(name = "postcode")
    WebElement postcode;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(className = "id_country")
    WebElement country;

    @FindBy(css = ".alert.alert-success")
    WebElement successInformation;

    @FindBy(name = "phone")
    WebElement phone;



    public UserInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}