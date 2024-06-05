package pageObject;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonatePage extends BasePage {

	public DonatePage(WebDriver driver) {
		super(driver);
	}
		
	

    @FindBy(xpath ="//input[@id=':r0:']")
	WebElement txt_name;
    
    @FindBy(xpath = "//input[@id=':r1:']")
    WebElement txt_lname;
    
    @FindBy(xpath = "//input[@id=':r2:']")
    WebElement txt_Mail;
  
    @FindBy(xpath ="//input[@id=':r3:']")
	WebElement txt_num;
    
    @FindBy(xpath ="//input[@id=':r4:']")
    WebElement txt_amt;
    
    @FindBy(xpath = "//button[@id=':r6:']")
    WebElement btn_donate;
    
   // @FindBy(xpath="//button[normalize-space()='Yes, Do Transaction']")
   // WebElement btn_confirm;
     
    public void scroll2window()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,5000)");
    }
    
    public void setName(String nme) 
    {
	    txt_name.sendKeys(nme);
    }
  
    public void setlName(String lnme) 
    {
	    txt_lname.sendKeys(lnme);
    }
 
    public void setMail(String mailid) 
    {
    	txt_Mail.sendKeys(mailid);
    }
    
    public void setnum(String numb) 
    {
    	txt_num.sendKeys(numb);
    }
    
    public void setvalue() 
    {
    	txt_amt.sendKeys("1000");
    }
    
    public void clickdonate() 
    {
    	btn_donate.click();
    }
    
    //public void ConfirmDonation() 
    //{
    //	btn_confirm.click();
    //}
    
  
}
