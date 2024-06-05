package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.baseClass;

public class TC_002_LoginTest extends baseClass
{
	@Test
	public void test_login() throws InterruptedException
	{
		
		HomePage  hp=new HomePage(driver);
               hp.clicklogin();
                
        LoginPage lp=new LoginPage(driver);  
                   lp.setUserName(randomeNumber());
		           lp.setpassword(randomeString());
		           lp.ClickSignup();
		           lp.passwordVisiblity();
		           lp.clicklnk();
		           
		           
		           
	}
}