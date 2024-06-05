package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends BasePage{

	public SignUp(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath= "//input[@id=':r0:']")
		WebElement txt_mobilenumber;
		
		@FindBy(xpath= "//input[@id=':r1:']")
		WebElement txt_EmailID;
		
		@FindBy(xpath= "//button[@id=':r2:']")
		WebElement btn_genrateOTP;
		
		
		
		
		public void setMobileNumber() 
		{
			txt_mobilenumber.sendKeys("9146760280");
		}
		
		public void setEmailid() 
		{
			txt_EmailID.sendKeys("sarthaknaik07@gmail.com");
		}
		
       public void genrateOTP() 
	    {
	    	 btn_genrateOTP.click();
	    } 
	    
	    
	    
}

