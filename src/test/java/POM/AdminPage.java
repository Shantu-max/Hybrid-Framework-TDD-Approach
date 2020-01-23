package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Methods.Actions_Methods;
import Generic_Methods.WebElement_methods;

public class AdminPage  extends WebElement_methods
{
	public WebDriver driver;
	public WebElement_methods ele=new WebElement_methods();
	public Actions_Methods action=new Actions_Methods();
	@FindBy(xpath="//b[.='Admin']")
	private WebElement adminTab;
	
	@FindBy(xpath="//a[.='User Management']")
	private WebElement usermngmt;
	
	@FindBy(xpath="//a[.='Users']")
	private WebElement users;
	
	public AdminPage(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
		
	}
	
	public void clickOnAdmin() 
	{
		action.mouseHoverAction(driver, adminTab);
	}
	
	public void clickonUsermanagement() 
	{
		action.mouseHoverAction(driver, usermngmt);
	}
	
	public void clickonUsers()
	{
		ele.clickOnElement(users);
	}

}
