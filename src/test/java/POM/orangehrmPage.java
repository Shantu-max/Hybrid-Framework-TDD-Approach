package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Methods.WebElement_methods;

public class orangehrmPage   extends WebElement_methods
{
	 public WebElement_methods ele=new WebElement_methods();
	 
	// Decalration of WebObjects
	@FindBy(name = "txtUsername")
	private WebElement username;

	@FindBy(name = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginbutton;

	// Intialization of WebObjects
	public orangehrmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization of WebObjects

	public void setusername(String uname) 
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
		
		ele.passdata(username, uname);
		

	}

	public void setpassword(String pwd)
	{
		 ele.passdata(password, pwd);

	}

	public void clickOnLoginbtn()
	{
		 ele.clickOnElement(loginbutton);

	}

}
