package fbPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuableAbstractmethods.Abstractcomp;


public class LoginPageObjectclss extends Abstractcomp {
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement userEmail;
	

	@FindBy(id="pass")
	WebElement userPassword;
	

	@FindBy(name="login")
	WebElement LoginButton;

	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	WebElement regButton;
	
	
	public LoginPageObjectclss(WebDriver driver) {
	super(driver);	 
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	  
	public void dologin(String x, String y) {
		maximize();
		implicitwait(5);
		userEmail.sendKeys(x);
	 userPassword.sendKeys(y);
		LoginButton.click();
		
	}
	
	
	public void goToLogin() {
		
		
	     driver.get("https://www.facebook.com/");
	}
	
	public void enterUnandPw(String x, String y) {
		maximize();
		implicitwait(5);
		userEmail.sendKeys(x);
	 userPassword.sendKeys(y);
		
	}
	public void goToRegister() {
		maximize();
		implicitwait(5);
		regButton.click();
		
	}
	
}
