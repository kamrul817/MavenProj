package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.Utility;


public class LoginTest {
	
	WebDriver driver;
	
	public LoginTest(WebDriver Idriver)
	{
		this.driver=Idriver;
	}
@FindBy(xpath="//a[contains(text(),'Sign in')]") WebElement SignIn;
@FindBy(xpath="//*[@id='email']") WebElement Email;
@FindBy(name="passwd") WebElement password;
@FindBy(id="SubmitLogin") WebElement Loginbutton;//3


public class LoginTest ;
	
	

	public class LoginTest extands Baseclass; 
		Login login;
	}
	
		
		@Test(description=")", priority=1)
	public void loginToAP() {
		login = PageFactoryiniteElements(driver,Login.class);
		login = report.createTest("Login test for AP");
		login.validateHomePage();
		login.enterPass("Home page validated");
		login.enterUserName();
		login.info("UserName enterd");
		login.info("clicked of login Button");
		{	
		
		
		
		
	}
		@DataProvider(name="LoginData") 
		public Object[][] getDataFormSources()
		System.out.println("LOG INFO:Running Data Provider First to generate the data")
		{
		int row=DataProviderFactory.getExcel().getRows("Login");
		System.out.println("Total rows in Excel "+rows );
		
		object[][]arr=new object[rows-1][2];
		
		for (int i=0;i<rows-1;i++)
		{
			arr[i][0]=DataProviderFactory.getExcel().getCellData("Login", i+1,)
			arr[i][0]=DataProviderFactory.getExcel().getCellData("Login", i+1,)
		
		System.out.println("LOG:INFO-Data provider is ready for usage")"
		
		
	
		return arr;
			
		}
	
	}







