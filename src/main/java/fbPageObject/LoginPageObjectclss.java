package fbPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObjectclss {
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement userEmail;
	

	@FindBy(id="pass")
	WebElement userPassword;
	

	@FindBy(name="login")
	WebElement LoginButton;

	
	public LoginPageObjectclss(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void dologin(String x, String y) {
		
		userEmail.sendKeys(x);
	 userPassword.sendKeys(y);
		LoginButton.click();
		
	}
	
}
