package testScriptt;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fbPageObject.LoginPageObjectclss;
public class Basictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.manage().window().maximize();
     
     LoginPageObjectclss lpo=new LoginPageObjectclss(driver);
     lpo.dologin("a@gmail.com", "abcds");
     
	}

}
