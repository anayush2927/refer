import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoTouchExercise {

	public static void main(String[] args) {
		// Create Desired Capabilities
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY223RZBJ9");
		//mandatory
		cap.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		cap.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		
		AndroidDriver driver=null;
		try{
				driver=new AndroidDriver(new URL("http://localhost:4793/wd/hub"), cap);
				
				//steps
				
				
				//find dimension of screen
				Dimension dimension=driver.manage().window().getSize();
				int y=dimension.getHeight();
				int x=dimension.getWidth();
				System.out.println("x--"+x+"y--"+y);
				
				int x1=(int) (x*.5);
				int y1=(int) (y*0.25);
				
				int x2=(int) (x*.5);
				int y2=(int) (y*0.75);
				
				TouchAction t1=new TouchAction(driver);
				t1.longPress(x1, y1).waitAction(3000).release().perform();
				
				TouchAction t2=new TouchAction(driver);
				t2.longPress(x2, y2).waitAction(3000);
				
				MultiTouchAction m=new MultiTouchAction(driver);
				m.add(t1).add(t2).perform();
				
		}
		catch(Throwable t){
			t.printStackTrace();
		}
		finally{
			driver.quit();
		}
	}

}
