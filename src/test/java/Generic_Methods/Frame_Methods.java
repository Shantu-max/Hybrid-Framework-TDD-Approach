package Generic_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame_Methods
{
	public void switchFrameIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchFramevalue(WebDriver driver,String value) 
	{
		//we can see pass either id or name
		driver.switchTo().frame(value);
	}
	
	public void switchFrameElementAddress(WebDriver driver,WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	public void switchToParentFrame(WebDriver driver) 
	{
		driver.switchTo().parentFrame();
	}
	
	public void switchToPreviousFrame(WebDriver driver) {
driver.switchTo().defaultContent();
	}
	

}
