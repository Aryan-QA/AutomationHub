package testScriptt;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fbPageObject.LoginPageObjectclss;
public class Basictest extends GenericTestforall{

	 @Test
	public void m1() throws IOException {
		
		// launchandLogin();
		 tryloginandgotoreg(); 
		 doRegistarion(); 
		 }

}
