package Generic_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods
{

	public void dragAndDRop(WebDriver driver,WebElement source,WebElement target) 
	{
		Actions a1=new Actions(driver);
		a1.dragAndDrop(source, target).perform();
	}
	
	public void mouseHoverAction(WebDriver driver,WebElement target) 
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(target).perform();
	}
	public void doubleClick(WebDriver driver,WebElement target) {
		Actions a1=new Actions(driver);
		a1.doubleClick(target).perform();
	}
	public void rightClick(WebDriver driver,WebElement target) {
		Actions a1=new Actions(driver);
	    a1.contextClick(target).perform();
	}
	
	public void dragAndDropToSpecificLocation(WebDriver driver,WebElement source,int x,int y)
	{
		   Actions a1=new Actions(driver);
		   a1.dragAndDropBy(source, x, y).perform();
	}

}
