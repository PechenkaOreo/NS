import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatePage {

    @FindBy(name = "certificate")
    WebElement cerfield;
    @FindBy(xpath = "//button[contains(@class,'btn') and contains(@class, 'certificate-check_submit')]")
    WebElement buttonSubmit;
    @FindBy(className = "certificate-check_message")
    WebElement message;
    public void  getCerMessage(String cer){
        cerfield.sendKeys(cer);
        buttonSubmit.click();

    }

    public boolean check() {
        return !message.getText().equals("Сертифікат не знайдено");
    }
}
