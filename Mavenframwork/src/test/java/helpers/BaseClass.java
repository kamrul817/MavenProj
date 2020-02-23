package helpers;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import dataProviderFactory.DataProviderFactory;

public class BaseClass {
  //we are creating object so we can reference back to them 
//instead of calling the jar files every time 
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setupReport() {
	System.out.println("LOG: INFO- Before Suite Running- Setting up Report");
	}
	{
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir"+"/Reports/AP_"+Utility.getTime()+".html")));
	report = new ExtentReports();
	report.attachReporter(reporter);
	

	System.out.println("LOG:INFO- After Suite Running - Reports are rady to use");
	}
	@BeforeClass
	public void setupBrowser() {
	System.out.println("LOG:INFO: Creating Browser Session");
	driver = BrowserfFactories.startBrowser(
	DataProviderFactory.getConfig().getBrowser(),
	       DataProviderFactory.getConfig().getStringURL());
	       System.out.println("LOG:INFO: Browser Session Created");
	}
	@AfterMethod
	public void appendReport(ITestResult result)
	{
	System.out.println("Test Name "+result.getName());
	System.out.println("LOG:INFO- After method Running - Generating test Report");
	int status = result.getStatus();
	if(status==ITestResult.SUCCESS)
	{
	try {
	logger.pass("Test Scenario Passed", MediaEntityBuilder.createScreenCaptureFromPath(Utility.capturesScreenShot(driver)).build());
	}catch(IOException e) {
	
		
	System.out.println("Not able to attach Screenshot "+e.getMessage());
	
	}
	}
	else if(status==ITestResult.FAILURE)
	{
	try {
logger.fail("Test Failed "+result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(Utility.capturesScreenShot(driver)).build());
	}catch(IOException e) {
	System.out.println("Not able to attach Screenshot "+e.getMessage());
	}
	}
	else if(status==ITestResult.SKIP)
	{
	logger.skip("Test Scenario skipped");
	}
	report.flush();
	System.out.println("LOG:INFO -After method Executed- Test Result appended to ");

	}
     @AfterClass 
     public void closeSession()
     {
    System.out.println("LOG:INFO -closing the browser session");
    driver.quit();
    System.out.println("LOG:INFO:Browser session Closed");
    
     }
}

