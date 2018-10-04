package cleartrip_groupid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	
	protected WebDriver driver ;
	Properties prop ;
	
	public WebDriver initializedriver() throws IOException
	{
		
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\30253.vendor\\cleartrip_artifactid\\src\\main\\java\\cleartrip_groupid\\property");
	prop.load(fis);
	String browser = prop.getProperty("browser");
	String url = prop.getProperty("url");
	if(browser.equals("Chrome"))
	    {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\30253.vendor\\Desktop\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		
	    }else if(browser.equals("Firefox"))
	       {
	         	/*Firefox*/
	       }else
	            {
		           /* Internet Explorer*/
	            }
	return driver;
	}	

}
