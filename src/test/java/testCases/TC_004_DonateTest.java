package testCases;


import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.DonatePage;
import pageObject.HomePage;
import testBase.baseClass;

public class TC_004_DonateTest extends baseClass {
	@Test
	public void test_donate() throws InterruptedException
	{
		HomePage hp=new HomePage (driver);
		hp.clickDonate();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DonatePage dp=new DonatePage (driver);
		

		dp.setName(randomeString());
		dp.setlName(randomeString());
		dp.setMail(randomAlphaNumeric());
		//dp.setMail("Sarthaknaik07@gmail.com");
		dp.setnum(randomeNumber());
		dp.setvalue();
		dp.clickdonate();
		//dp.ConfirmDonation();
		
	}

}
