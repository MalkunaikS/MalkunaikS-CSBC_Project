package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenrateOTP extends BasePage{

	public GenrateOTP(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath ="//button[@id=':r5:']")
		WebElement btn_verifyOTP;
		
		public void ClickVerify() 
		{
			btn_verifyOTP.click();
		}
		
	

}
