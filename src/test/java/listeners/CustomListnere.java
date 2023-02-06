	package listeners;
	
	import java.io.IOException;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;
	
	import com.relevantcodes.extentreports.LogStatus;

import Base.Page;

	
	public class CustomListnere  extends Page implements ITestListener
	{
		
		public void onTestFailure(ITestResult arg0)
		{
			System.out.println(test);
			test.log(LogStatus.FAIL,arg0.getName().toUpperCase()+"FALL");	
			Page.test.log(LogStatus.FAIL,Page.test.addScreenCapture(Testutil.screenshotname));	
			rep.endTest(test);
			rep.flush();
			// For the simple report
			System.setProperty("org.uncommons.reportng.escape-output","false");
			Reporter.log("This is successfully executed");
			Reporter.log("<a target=\"_blank\" href= \""+Testutil.scrrenshot+">screenshot</a>");
			Reporter.log("<br>");
			
			
			try {
				Testutil.takscreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	
		public void onTestSuccess(ITestResult arg0)
		{
			
			System.out.println("Hello I am here");
				test.log(LogStatus.PASS,arg0.getName().toUpperCase()+"PASS");	
				rep.endTest(test);
				rep.flush();
			
		
		}
		
		public void onTestStart(ITestResult arg0)
		{
			System.out.println("heloo I am in onTestStart");
		Page.test= Page.rep.startTest(arg0.getName().toUpperCase()+"PASS");
		}
		
		
		
		
	}
	
