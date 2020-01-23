package Generic_Methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdriver {
	// here we have 11+2 methods
	public void enterURL(WebDriver driver, String url) 
	{
		driver.get(url);
	}

	public void closeApplication(WebDriver driver) 
	{
		driver.quit();

	}

	public void closeCurrenttab(WebDriver driver) 
	{
		driver.close();
	}

	public String TitleOfPage(WebDriver driver) 
	{
		return driver.getTitle();

	}

	public String getCurrentUrl(WebDriver driver) 
	{
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) 
	{
		return driver.getPageSource();
	}

	public String getParentID(WebDriver driver)
	{
		return driver.getWindowHandle();
	}

	public Set<String> getAllbrowserIDs(WebDriver driver)
	{
		return driver.getWindowHandles();

	}

	public void switchToSpecifictab(WebDriver driver, String ID) 
	{

		driver.switchTo().window(ID);
	}

	public void alternativeWaylaunchBrowser(WebDriver driver, String url) 
	{
		driver.navigate().to(url);

	}

	public void refreshPage(WebDriver driver) 
	{
		driver.navigate().refresh();
	}

	public void backwardAction(WebDriver driver) 
	{
		driver.navigate().back();
	}

	public void forwardAction(WebDriver driver)
	{
		driver.navigate().forward();
		
	}
	public void deleteCookies(WebDriver driver) 
	{
		driver.manage().deleteAllCookies();
	}
	

}
