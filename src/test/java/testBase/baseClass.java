package testBase;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import io.github.bonigarcia.wdm.WebDriverManager;
		public class baseClass {

			public static WebDriver driver;
			
			                                                  
			public ResourceBundle rb;                        

			@BeforeClass
			@Parameters("browser")
			public void setup(String br)
			{
				rb=ResourceBundle.getBundle("config");        // static 
				
			 //WebDriverManager.chromedriver().setup();				
				if (br.equals("chrome"))                 
				   driver=new ChromeDriver();
			   else 
				    driver=new EdgeDriver();  
				
				
			driver.get(rb.getString("appurl"));
			//driver.get("https://csbc.consisty.com");				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
			
		
			
		
			public String CapturedScreen(String ssname) throws IOException       //(this exception for simple date format)
			{
				
				                                                                        // genrating time stamp
				/*SimpleDateFormat df=new SimpleDateFormat();                           //java text and create object for simple date formT
				Date dt=new Date();                                                      //use method format
				String timestamp=df.format(dt);*/                                       
				
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				
				
				TakesScreenshot takesScreenshot=  (TakesScreenshot) driver;             //captured ss using take ss class
				File source = takesScreenshot.getScreenshotAs(OutputType.FILE);         //get ss will captured ss and stored in source
				
				
				String destination = System.getProperty("user.dir") + "\\screenshots\\" + ssname + "_" + timeStamp + ".png";    //source to own destination
				try 
				{
					FileUtils.copyFile(source, new File (destination));
				} 
				catch (Exception e) 
				{
					e.getMessage();
				}
				return destination;		
				
		
	    	 /*@AfterClass
		    public void shutdown()
		    {
	    		
				driver.quit();
			}*/
				 
		}
			
			public String randomeString()
			{
				String generatedString=RandomStringUtils.randomAlphabetic(5);
				return generatedString;
			}
			
			public String randomeNumber()
			{
				String generatedString=RandomStringUtils.randomNumeric(10);
				return generatedString;
			}
			
			public String randomAlphaNumeric()
			{
				String str=RandomStringUtils.randomAlphabetic(6);
				String num=RandomStringUtils.randomNumeric(2);
				
				return (str+num+"@gmail"+".com");
			}
	
		}

