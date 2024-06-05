package testCases;

//import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.baseClass;
import utilities.DataProviders;

public class TC_001_LoginDataDrivenTest extends baseClass {
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String username, String password,String exp) {
		
		
			
			HomePage  hp=new HomePage(driver);
	                  hp.clicklogin();
	                
	        LoginPage lp=new LoginPage(driver);  
	                  lp.setUserName(username);
			          lp.setpassword(password);
			          lp.ClickSignup();
			          lp.passwordVisiblity();
			          
			          
			          
		}
		
	
	}
	
