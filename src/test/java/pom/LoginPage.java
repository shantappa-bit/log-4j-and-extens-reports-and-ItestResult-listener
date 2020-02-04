package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.waithelper;

public class LoginPage 
{
	public WebDriver driver;
	public waithelper help;
	
	//declaration
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="(//div[.='Login'])[2]")
	private WebElement loginbtn;
	
	
	//intialization 
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//utilization
	
	public void setusername(String uname) {
		username.sendKeys(uname);
	}
	public void setpwd(String password) 
	{
		pwd.sendKeys(password);
		
	}
	public void clickonLogin() throws IOException 
	{
		help=new waithelper();
		help.captureScreenshot(driver);
		help.waitforElement(driver, loginbtn);
		loginbtn.click();
	}

}
