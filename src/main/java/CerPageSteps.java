import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class CerPageSteps {
    static WebDriver driver = new ChromeDriver();

    CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);

    @When("^I open the \"([^\"]*)\" page$")
    public void i_open_the_page(String arg1) throws Throwable {
        driver.navigate().to(arg1);
    }
    @And("^Set the code \"([^\"]*)\"$")
    public void setTheCode(String cer) throws Throwable {
        certificatePage.getCerMessage(cer);

    }

    @Then("Check results")
    public void checkResults() {
        Assert.assertTrue(certificatePage.check());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
