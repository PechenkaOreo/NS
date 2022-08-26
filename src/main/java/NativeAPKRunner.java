import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/appium/features",
        glue = "appium.steps",
        tags = "@APK",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE)

public class NativeAPKRunner {
    @BeforeClass
    public static void initNative(){
        BaseAppiumSteps.androidDriver= AppiumDriverConfig.initAndroidDriver();
    }
    @AfterClass
    public static void closeAndroidDriver(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BaseAppiumSteps.androidDriver.quit();
    }

}
