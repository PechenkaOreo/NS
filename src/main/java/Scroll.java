import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Scroll {

    public static void scrollSeveralTimes(MobileElement element, int i) {//скролит (int i) указанное количество раз
        try {
            element.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UISelector().scrollable(true)).scrollToEnd(" + i + ")"));
        } catch (Exception ignore) {
        }
    }
    public static void scrollByText(MobileElement element, String text){//скролит пока не найдет указанный текст
        try {
            element.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UISelector().scrollable(true))"+
                            ".scrollIntoView(newUISelector().textContains("+text+"))"));
        } catch (Exception ignore) {
        }
    }

    public static MobileElement scrollIntoViewByText(AndroidDriver driver, String listViewResourceId, String className, String text){//скролит по списку елементо и ищет указанный элемент
        return (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UISelector().resourceId("+listViewResourceId+")).getChildByText("
                        +"new UISelector().className("+className+"),"+text+")"));
    }


}