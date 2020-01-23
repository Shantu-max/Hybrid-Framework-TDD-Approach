package Generic_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class 
{
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() 
	{
		System.setProperty("webdriver.chrome.driver",Framework_Constant.Chromepath);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get(Framework_Constant.URl);
		
	}
	
	@AfterMethod
	public void CloseApplication() 
	{
		try {
		Thread.sleep(4000);
		}
		catch(Exception handled) {
			
		}
		driver.close();
	}
	
	

}
