package pageObject;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class HomePage extends BasePage {

		public HomePage(WebDriver driver) {
			super(driver); // passing the driver instance   //to call constructor use super keyword
		}

		
		@FindBy(xpath = "//a[normalize-space()='LOG IN']")
		WebElement btn_login;
		
		@FindBy(xpath = "//a[normalize-space()='DONATE']")
        WebElement btn_donate;
		
		public void clicklogin()
		{
			btn_login.click();
		}
		
		public void clickDonate() 
		{
			btn_donate.click();
		}

		
		
	}