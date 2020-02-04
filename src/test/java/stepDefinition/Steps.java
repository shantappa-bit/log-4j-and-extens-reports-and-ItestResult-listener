package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.LoginPage;

public class Steps extends Base {
	@Before
	public void setUp() throws FileNotFoundException, IOException {

		Properties p1 = new Properties();
		p1.load(new FileInputStream("./config.properties"));
		p1.getProperty("browser");

		if (p1.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", p1.getProperty("chropath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			System.setProperty("webdriver.gecko.driver", p1.getProperty("mozillapath"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	@Given("^user has opened the browser$")
	public void user_has_opened_the_browser() {

	}

	@When("^user enters a url as \"([^\"]*)\"$")
	public void user_enters_a_url_as(String arg1)

	{
		driver.get("https://ui.freecrm.com/");
	}

	@Then("^verify that login page should be displayed$")
	public void verify_that_login_page_should_be_displayed()

	{
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@When("^user enters user name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_user_name_as_and_password_as(String username, String password) {
		lp = new LoginPage(driver);
		lp.setusername(username);
		lp.setpwd(password);
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws IOException

	{
		lp.clickonLogin();
	}

	@Then("^verify that home page should be displayed$")
	public void verify_that_home_page_should_be_displayed()

	{

		Assert.assertEquals("Cogmento CRM", driver.getTitle());
	}

	@When("^user clicks on the log out link$")
	public void user_clicks_on_the_log_out_link() throws InterruptedException

	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//i[@class='settings icon'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
	}

	@Then("^verify that login page should be dispayed$")
	public void verify_that_login_page_should_be_dispayed() throws InterruptedException

	{
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^close the browser$")
	public void close_the_browser()

	{
		//driver.close();
	}
	/*
	 * //delas tab
	 * 
	 * @Given("^user has already landed on delas tab$") public void
	 * user_has_already_landed_on_delas_tab()
	 * 
	 * { System.out.println("useer done "); }
	 * 
	 * @When("^User clicks on the delas tab$") public void
	 * user_clicks_on_the_delas_tab() throws InterruptedException {
	 * Thread.sleep(4000);
	 * driver.findElement(By.xpath("//span[.='Deals']")).click();
	 * 
	 * }
	 * 
	 * @Then("^deals tab should be displayed$") public void
	 * deals_tab_should_be_displayed()
	 * 
	 * { System.out.println("hello"); }
	 * 
	 * @Then("^close the application$") public void close_the_application() throws
	 * InterruptedException { Thread.sleep(4000); driver.close(); } //email tab
	 * 
	 * @Given("^user has already on the home page$") public void
	 * user_has_already_on_the_home_page()
	 * 
	 * { System.out.println("opened the application"); }
	 * 
	 * @When("^user clicks on the email tab$") public void
	 * user_clicks_on_the_email_tab() throws InterruptedException
	 * 
	 * { Thread.sleep(4000);
	 * driver.findElement(By.xpath("//span[.='Email']")).click(); }
	 * 
	 * @Then("^email tab should be opened$") public void
	 * email_tab_should_be_opened() {
	 * System.out.println("email tab should be opened"); }
	 * 
	 * @Then("^user teas down the application$") public void
	 * user_teas_down_the_application() throws InterruptedException {
	 * Thread.sleep(4000); System.out.println("user closed the application");
	 * driver.close(); }
	 */
	
	@After
	public void teardown() 
	{
		//int count = res.getStatus();
		//System.out.println("number is intresting here that is :"+count);
		driver.close();
	}

}
