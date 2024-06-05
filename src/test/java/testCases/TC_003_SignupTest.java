package testCases;

import java.time.Duration;

//import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.GenrateOTP;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.SignUp;
import pageObject.SignupPersonalDetails;
import testBase.baseClass;

public class TC_003_SignupTest extends baseClass {
	
	
	@Test
	public void test_login_2() throws InterruptedException
	{
        HomePage hp=new HomePage(driver);
        hp.clicklogin();
        
        LoginPage lp=new LoginPage(driver);
        lp.Clicklnk();
          
        SignUp sp=new SignUp(driver);  
        sp.setMobileNumber();
        sp.setEmailid();
        sp.genrateOTP();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        GenrateOTP gt=new GenrateOTP(driver);
        gt.ClickVerify();
        
        SignupPersonalDetails spd = new SignupPersonalDetails(driver);
        spd.setFullName(randomeString());
        spd.setWhatsappNumber(randomeNumber());
        spd.setMail(randomAlphaNumeric());
        spd.setPincode(randomeNumber());
        spd.setadress(randomeString());
        spd.setcity(randomeString());
        spd.setdistrict(randomeString());
        spd.setstate();
        
         
	}
	
}
