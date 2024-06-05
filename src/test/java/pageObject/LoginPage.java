package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name=\"UserName\"]")
	WebElement txt_username;
	
	
	@FindBy(xpath = "//input[@name=\"Password\"]")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	WebElement btn_toggledpass;
	
	@FindBy(xpath="//button[@id=':r2:']")
	WebElement btn_Signup;
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']")
	WebElement lnk_signup;
	
	@FindBy(linkText="Forgot password?")
	WebElement lnk_click;
	
	
	
	public void setUserName(String uname)
	{
		txt_username.sendKeys(uname);
	}

	public void setpassword(String pwd)

	{
		txt_password.sendKeys(pwd);
	}	
	
	public void passwordVisiblity() 
	{
		btn_toggledpass.click();
	}
	
	public void ClickSignup()
	{
		btn_Signup.click();
	}
	
	public void Clicklnk() 
	{
		lnk_signup.click();
	}
	
	public void clicklnk() 
    {
    	lnk_click.click();
    }
}
