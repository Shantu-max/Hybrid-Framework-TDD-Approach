package Test_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Base_Class;
import Generic_Methods.Excel;
import POM.AdminPage;
import POM.orangehrmPage;

public class verify_LoginFunctionality  extends Base_Class
{
	@Test
	public void Logintest() throws Exception
	{
		orangehrmPage op=new orangehrmPage(driver);
		Excel.getvaluefromExcel("Sheet1", 1, 0);
		op.setusername(Excel.getvaluefromExcel("Sheet1", 1, 0));
		op.setpassword(Excel.getvaluefromExcel("Sheet1", 1, 1));
		op.clickOnLoginbtn();
		AdminPage ap=new AdminPage(driver);
		Thread.sleep(4000);
		ap.clickOnAdmin();
		Thread.sleep(2000);
		ap.clickonUsermanagement();
		Thread.sleep(4000);
		ap.clickonUsers();
		
	}

}
