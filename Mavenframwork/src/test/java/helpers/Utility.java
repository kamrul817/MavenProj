package helpers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;






public class Utility {
	
	public static WebElement waitForWebElement(WebDriver driver,String string)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait .until(ExpectedConditions.visibilityOfElementLocated(string));
		wait .until(ExpectedConditions.elementToBeClickable(string));
		return driver.findElement(string);
	}
	
	public static WebElement waitForWebElement(WebDriver driver,By element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait .until(ExpectedConditions.visibilityOfElementLocated(element));
		wait .until(ExpectedConditions.elementToBeClickable(element));
		return driver.findElement(element);
	}
	
	

	public static void validateMessage(WebElement element,String msg);

	Assert.assertEquals(element.gettText(),msg);
	{
	
		
	}
	public static void validatePartialText(WebElement element,String msg)
		Assert.assertTrue(element.getText().contains(msg));
	
public static void validateTitle(WebDriver, String title)

boolean status=DriverWait(driver , 30)until(ExpectedConditions.titleIs(title));
Assert.assertTrue(status);


	}
public static void validateContainsTitle(WebDriver driver,String url)
{
	boolean status=new WebDriverWait(driver, 30)until(ExpectedConditions.title);
	Assert .assertTrue(status);
	
public static void verifyCurrentURL(WebDriver driver,String url)
boolean status=new WebDriverWait(driver, 30)until(ExpectedCoinditions.urlCondtions(url));
Assert.assertTrue(status);
}
public void dismissAlert(WebDriver driver)
new WebDriver(driver,30).until(ExpectedConditions.alertIsPresent()).dismiss()
}
new WebDriver(driver,30).until(ExpectedConditions.alertIsPresent()).accept();;


public void verifyAlertMsg(helper.WebDriver driver,String msg)

{
	



}
public void handleFrame(WebDriver driver , int index)
{
new WebDriver(driver,30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));


{
	public static String capturesScreenShot(WebDriver driver)
	
	{
		String time=getTime();
		String dest=System.getProperty("user.dir")+"/Screenshorts/AP"+time+.png";"
		Takes=Screenshot ts=(TakesScreenShot)driver;
		
		File src=ts.getsScreenshorAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File(dest));
		}	catch(IOExceptin e) {
			System.out.println("Screenshot Failed"+e.getMessage)));
			{
			return dest;
			
		}
		public static String getTime()
		{
			DateFormat dateFormate=new SimpleDateFormat("HH_mm_dd_MM_yyyy");
			return DateFormat.format(new Data());
			
		}
		
		FileHandler.copy(src, new getMessage));
				
	}
}
