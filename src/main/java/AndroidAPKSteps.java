import appium.BaseAppiumSteps;
import appium.util.Scroll;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AndroidAPKSteps extends BaseAppiumSteps {
    @When("^I click Next button$")
    public void iClickNextButton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        androidDriver.findElement(By.id("com.weather.Weather:id/ok_button")).click();
    }

    @And("^I click Agree button$")
    public void iClickAgreeButton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MobileElement element= (MobileElement) androidDriver.findElement(By.id("com.weather.Weather:id/description_scroll_view"));
        Scroll.scrollSeveralTimes(element,3);
        androidDriver.findElement(By.id("com.weather.Weather:id/next_button_text")).click();
    }

}
