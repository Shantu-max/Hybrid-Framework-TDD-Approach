package Generic_Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Pop_Alert 
{

	public void acceptAlert(WebDriver driver) 
	{
		Alert ele = driver.switchTo().alert();
		ele.accept();
	}
	public void dismissAlert(WebDriver driver) 
	{
		Alert ele = driver.switchTo().alert();
		ele.dismiss();
	}
	public String getTextOnPop_Up(WebDriver driver) 
	{
		Alert ele = driver.switchTo().alert();
		return ele.getText();
	}

}
