package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithelper 
{
	
	public void waitforElement(WebDriver driver,WebElement ele) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public void captureScreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		Date date=new Date();
		String stformar=date.toString();
		String replaced1=stformar.replaceAll(":", "-");
		String path="./screenshots/";
		
		File ram = shot.getScreenshotAs(OutputType.FILE);
		File f=new File(path+replaced1+".jpeg");
		FileUtils.copyFile(ram, f);
		
	}

}
