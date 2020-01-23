package Generic_Methods;

import org.openqa.selenium.WebElement;

public class WebElement_methods 
{
	//here we need to implement 17 methods
	public String getText(WebElement ele) 
	{
		return ele.getText();
		
	}
	public void passdata(WebElement ele,String data) 
	{
	ele.sendKeys(data);	
	}
	public void clickSubmit(WebElement ele)
	{
		ele.submit();
	}
	public void clickOnElement(WebElement ele) 
	{
		ele.click();
	}
	
	public boolean isEnabled(WebElement ele) 
	{
		return ele.isEnabled();
	}
	public boolean isDisabled(WebElement  ele) {
		return ele.isDisplayed();
	}
	public boolean isSelected(WebElement ele) {
		return ele.isSelected();
	}
	
	public String getAttribute(WebElement ele,String value) {
		return ele.getAttribute(value);
	}
	public int getHeight(WebElement loc) {
		return loc.getSize().getHeight();
	}
	public int getWidth(WebElement loc) {
		return loc.getSize().getWidth();
	}
	public int getXAxis(WebElement ele) {
		return ele.getLocation().getX();
	}
public int getYAxis(WebElement ele) {
	return ele.getLocation().getY();
}
public void clearData(WebElement ele) {
	ele.clear();
}
public void getCSSValue(WebElement ele,String value) {
ele.getCssValue(value);	
}
	
	
	
	

}
