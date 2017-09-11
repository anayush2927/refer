import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalcAutomation {
        public static void main (String[] args){
                //launch calc on phone

                /*start appium server
                 * use desired capabilities object : device name,
app_package, app_activity
                 * Android Driver
                 * to get app activity and app package from command prompt
                 * go to ANDROID_HOME path and run "adb devices"
                 * then "adb shell"
                 * then open the app in the emulator or the actual phone
                 * and execute "dumpsys window windows | grep -E
'mCurrentFocus|mFocusedApp'" in the command prompt
                 * the text inside "<" after u0 is the
appPackage/appActivity
                 *
                 * APKINfo app from play store
                 * "API Demos" from play store
                 *
                 */

                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY223RZBJ9");
                cap.setCapability("appActivity","com.android.calculator2.CalculatorGoogle");
                cap.setCapability("appPackage", "com.android.calculator2");
                AndroidDriver driver = null;
                try{
                        driver = new AndroidDriver(new URL("http://localhost:4793/wd/hub"), cap);
                /*      driver.manage().timeouts().implicitlyWait(10L,
TimeUnit.SECONDS);
                        //click 5 -- locate the android element

driver.findElementById("com.android.calculator2:id/digit_5").click();
                        //click +

//driver.findElementByXPath("//android.widget.ImageButton[contains@resource-
id=plus]").click();

driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'op
_add')]").click();
                        //click 3 -- locate the android element
                        driver.findElementByAndroidUIAutomator("new
UiSelector().resourceId(\"com.android.calculator2:id/digit_3\")").click();
                        //driver.findElementByAndroidUIAutomator("new
UiSelector().resourceID(\"com.android.calculator2:id/digit3").click();

                        // click =

driver.findElement(By.id("com.android.calculator2:id/eq")).click();
                        //capture result and print
                        String text =
driver.findElement(By.className("android.widget.EditText")).getText();
                        System.out.println("text= "+ text);*/
                }catch(Throwable t){
                        t.printStackTrace();
                }finally{
                        driver.quit();
                }
        }

}