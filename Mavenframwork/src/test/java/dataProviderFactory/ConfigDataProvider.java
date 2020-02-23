package dataProviderFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		try {
			pro=new Properties();
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Configfiles/config.properties")));
		}catch(IOException e)
		{
			System.out.println("unable to upload file:"+e.getMessage());
			
		}
	}

	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	public String getStringURL()
	{
		return  pro.getProperty("stagingURL");
	}
	public String getValueFromProperties(String key)
	{
		return  pro.getProperty(key);
		
		
	
	}
}
