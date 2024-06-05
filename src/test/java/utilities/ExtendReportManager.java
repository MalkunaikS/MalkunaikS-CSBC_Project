package utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Properties;
//import javax.print.DocFlavor.URL;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import testBase.baseClass;


	public class ExtendReportManager implements ITestListener {
		public ExtentSparkReporter sparkReporter;
		public ExtentReports extent;
		public ExtentTest test;
	

		String repName;

		public void onStart(ITestContext testContext)
		{
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			repName = "Test-Report-" + timeStamp + ".html";

			sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);        //  location

			sparkReporter.config().setDocumentTitle("CSBC Automation Report");       
			sparkReporter.config().setReportName("CSBC Functional Testing");          
			sparkReporter.config().setTheme(Theme.DARK);

			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			extent.setSystemInfo("Project", "CSBC");
			extent.setSystemInfo("Module", "Login Funcitionlity");// Donate Funcitionlity ,
			extent.setSystemInfo("Sub Module", "Sign In Page");
			extent.setSystemInfo("Operating System", System.getProperty("os.name"));
			extent.setSystemInfo("User Name", "Sarthak Malkunaik");
		 // extent.setSystemInfo("User Name", System.getProperty("user.name"));
			extent.setSystemInfo("Environemnt", "QA");	
		    }
	
		   public void onTestSuccess(ITestResult result) 
		    {
			test = extent.createTest(result.getName());
			test.log(Status.PASS, "Test Passed"); 
		    }
	
		    public void onTestFailure(ITestResult result)
		    {
			test = extent.createTest(result.getName());
			test.log(Status.FAIL, "Test Failed");
			test.log(Status.FAIL, result.getThrowable().getMessage());

			try 
			    {
				String imgPath = new baseClass().CapturedScreen(result.getName());
				test.addScreenCaptureFromPath(imgPath);
			    }
	      catch (IOException e1)
			    {
				e1.printStackTrace();
			    }
		}
		
		public void onTestSkipped(ITestResult result) 
		{
			test = extent.createTest(result.getName());
			test.log(Status.SKIP, "Test Skipped");
			test.log(Status.SKIP, result.getThrowable().getMessage());
		}

		public void onFinish(ITestContext testContext) 
		
			{
			extent.flush();
	        } 

	}
			
		
		
		 
		
		
	
	
	
	


