package cucumberlogin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class testme {
	WebDriver driver;
	@Given("Open the TestMeApp Application")
	public void open_the_TestMeApp_Application() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 
	}

	@Given("Enter username in username field {string}")
	public void enter_username_in_username_field(String un) {
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(un);

	}

	@Given("Enter password in password field {string}")
	public void enter_password_in_password_field(String psd) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(psd);

	}

	@Given("Click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		
	}
	

@Given("Check you are in home page")
public void check_you_are_in_home_page() {

		Assert.assertEquals("Home",driver.getTitle());
		driver.close();

	}



}
