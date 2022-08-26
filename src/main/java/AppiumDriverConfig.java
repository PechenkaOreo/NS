import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriverConfig {

    public static AndroidDriver initAndroidDriver(){
        AndroidDriver androidDriver=null;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");//указываем версию Android
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Имя OS
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1800);
        caps.setCapability("appPackage","com.weather.Weather");
        caps.setCapability("appActivity","com.weather.Weather.app.SplashScreenActivity");
//        caps.setCapability(MobileCapabilityType.NO_RESET,true);//открывает сесию с последней остановки, а не с самого начала

        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), caps);
            /*Activity activity=new Activity("com.weather.Weather","com.weather.Weather.app.SplashScreenActivity");
            androidDriver.startActivity(activity.setAppWaitActivity("com.weather.Weather.app.SplashScreenActivity"));*/


        } catch (Exception e) {
            e.printStackTrace();
        }
        return androidDriver;
    }

}
