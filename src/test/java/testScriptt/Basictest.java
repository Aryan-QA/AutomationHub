package testScriptt;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import fbPageObject.LoginPageObjectclss;
import utilitypkg.Screenshotutility;
public class Basictest extends GenericTestforall{

	
	@Test
	public void m1() throws IOException {
		
		// launchandLogin();
		 tryloginandgotoreg(); 
		 doRegistarion(); 
		 
		 //Assert.assertTrue(false);
		 }

	 
	 
	 @AfterMethod
	 
	 
	 public void breakDown(ITestResult result) throws IOException {
		 
		 
		 if(ITestResult.FAILURE==result.getStatus()) {
			 
			 Screenshotutility su=new Screenshotutility(driver);
			 su.techScreenshot(driver); 
		 }
		 
		 
	 }
	 
}
