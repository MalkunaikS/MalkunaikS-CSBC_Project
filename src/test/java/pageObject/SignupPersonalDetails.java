package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPersonalDetails extends BasePage
{

	public SignupPersonalDetails(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath= "//input[@id=':r7:']")
		WebElement txt_setPersonalFullName;
		
		@FindBy(xpath= "//input[@id=':r8:']")
		WebElement txt_setWhatsapNumber;
		
		@FindBy(xpath= "//input[@id=':r9:']")
		WebElement txt_setMailID;
		
		@FindBy(xpath= "//input[@id=':ra:']")
		WebElement txt_setPinCode;
		
		@FindBy(xpath= "//input[@id=':rb:']")
		WebElement lnk_setState;
		
		@FindBy(xpath= "//input[@id=':rd:']")
		WebElement txt_setAddress;
		
		@FindBy(xpath= "//input[@id=':re:']")
		WebElement txt_setDistrict;
		
		@FindBy(xpath= "//input[@id=':rf:']")
		WebElement txt_setCity;
		
		@FindBy(xpath= "//button[@id=':rg:']")
		WebElement btn_clear;
		
	
		
		public void setFullName(String fname) 
		{
			txt_setPersonalFullName.sendKeys(fname);
		}
		
		public void setWhatsappNumber(String whsnum) 
		{
			txt_setWhatsapNumber.sendKeys(whsnum);
		}
		
		public void setMail(String mailid) 
		{
			txt_setMailID.sendKeys(mailid);
		}
		
		public void setPincode(String pcode) 
		{
			txt_setPinCode.sendKeys(pcode);
		}
	    
		public void setstate() 
		{
			
			lnk_setState.click();
		}
		
		public void setadress(String adrs) 
		{
			txt_setAddress.sendKeys(adrs); 
		}
	    
	    public void setdistrict(String dist) 
	    {
	    	txt_setDistrict.sendKeys(dist);
	    }
	    
	    public void setcity(String city) 
	    {
	    	txt_setCity.sendKeys(city);
	    }
	
        public void clickclear() 
        {
        	btn_clear.click();
        }
        
        
}
