package utilitypkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutility {
	
	WebDriver driver;
	public Screenshotutility(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void techScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot scr=(TakesScreenshot) driver;
		File source=scr.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Cloud Laptop\\OneDrive\\Desktop\\SCNN\\SC1.png");
		FileUtils.copyFile(source, destination);
		
		
		
	}

}
