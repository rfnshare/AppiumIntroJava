import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        File appDir = new File("apk");
        File app =  new File(appDir, "ApiDemos-debug.apk");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI P30 Lite");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.UDID, "8RBDU19325003729");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }


}