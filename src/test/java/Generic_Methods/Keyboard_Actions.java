package Generic_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	public void click_Buttonkeyboard() 
	{
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception a1) {

		}

	}

	public void pressTab() 
	{
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		} catch (Exception a1) {

		}

	}

	public void clearDataKeyboard(WebElement ele) 
	{

		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.DELETE);
	}
	
	public void rightClickAndOpenNewTab(WebDriver driver,WebElement address) 
	{
		Actions a1=new Actions(driver);
		a1.contextClick(address).perform();
		try {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			
		}
		
	}

}
