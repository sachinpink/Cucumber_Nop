package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UIPages.LoginPage;
import cucumber.api.java.en.*;

public class Steps 
	{
		WebDriver driver;
		LoginPage lp;

		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable
		{
			System.setProperty("webdriver.chrome.driver", "E://Selenium//selenium setup//drivers//chromedriver_win32//chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
		}

		@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable
		{
			lp=new LoginPage(driver);
		    lp.login("admin@yourstore.com","admin");
		    
		}

		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable 
		{
			lp.loogedUser();
		}
		
}


