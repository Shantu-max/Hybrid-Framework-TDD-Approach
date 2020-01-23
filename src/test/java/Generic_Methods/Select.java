package Generic_Methods;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Select
{
	public void selectvaluebyIndex(WebElement element,int index) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.selectByIndex(index);
		
	}
	public void selectvaluebyvalue(WebElement element,String value) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.selectByValue(value);
		
	}
	
	public void selectvaluebyText(WebElement element,String text) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public boolean isMultiple(WebElement element)
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		return s.isMultiple();
	}
	
	public void deselectAllvalues(WebElement element) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.deselectAll();
		
	}
	public void deselectvaluebyIndex(WebElement element,int index) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.deselectByIndex(index);
		
	}
	public void delectvaluebyvalue(WebElement element,String value) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.deselectByValue(value);
		
	}
	
	public void delectvaluebyText(WebElement element,String text) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		s.deselectByVisibleText(text);
		
	}
	public void getAllSelectedOptions(WebElement element)
    {
		
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		 List<WebElement> address=s.getAllSelectedOptions();
		// String[] value1=new String[address.size()];
		 for(int i=0;i<address.size();i++) 
		 {
			 String value = address.get(i).getText();
			 
			
			 
			 
			 
		 }
	}
	
	public String getFirstSelectedOptions(WebElement element) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		WebElement list = s.getFirstSelectedOption();
		return list.getText();
	
		}
	
	public int countNumberOfOptionsDropDown(WebElement element) 
	{
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(element);
		List<WebElement> count = s.getOptions();
		return count.size();
	}
	
	
	
	

}
