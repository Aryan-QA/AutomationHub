package testScriptt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fbPageObject.LoginPageObjectclss;
import fbPageObject.Regpageobjectclss;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericTestforall {
   WebDriver driver;
   
	public WebDriver initialisedriver() throws IOException {
	Properties prop=new Properties();	
	FileInputStream fis=new FileInputStream("C:\\Users\\Cloud Laptop\\eclipse-workspace\\Autoframwork\\src\\main\\java\\resources\\globaldata.properties");
	prop.load(fis);
	String browsername =prop.getProperty("browser");
      System.out.println(browsername);
	if(browsername.equals("chrome")) {
		 driver=new ChromeDriver();
		 
	}
	else if(browsername.equalsIgnoreCase("firefox"));
	{
		 driver=new FirefoxDriver();
	}
	return driver;
	
	}
	
	
	//public  void launchapp() throws IOException {
	//driver=	initialisedriver();	
	//	LoginPageObjectclss lg=new LoginPageObjectclss(driver);
	//lg.goToLogin();
	//}
	
	public void launchandLogin() throws IOException {
	    initialisedriver();	
		LoginPageObjectclss lg=new LoginPageObjectclss(driver);
	lg.goToLogin();
	//lg.dologin("abvc","342");
		
	}
	
	public void tryloginandgotoreg() throws IOException {
		initialisedriver();	
		LoginPageObjectclss lg=new LoginPageObjectclss(driver);
		lg.goToLogin();
		lg.enterUnandPw("abcd","2345");
		lg.goToRegister();
		
	}
	
	public void doRegistarion() {
	
		
		Regpageobjectclss rgo=new Regpageobjectclss(driver);
		rgo.register("abcd","def","123");
	}
	
	
	
	}
	
	

