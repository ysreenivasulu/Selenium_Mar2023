package stepdef;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Driver;
import io.cucumber.java.en.*;
import pages.LoginPageOR;

public class LoginDef extends Driver{
	
	LoginPageOR loginPage;
	@Given("If user is on home page")
	public void if_user_is_on_home_page() {
        loginPage=new LoginPageOR(d);
		// Load web page
		d.get(url);
		// Verify Home page
		assertTrue(loginPage.txtHome.isDisplayed());
	}

	@When("Click on login link")
	public void click_on_login_link() {
		loginPage.lnkLogin.click();
	}
	
	@When("Enter user name as {string} and password as {string}")
	public void enter_user_name_as_and_password_as(String uname, String password) throws Exception {
		loginPage.fillLogin(uname, password);
		Thread.sleep(2000);
	}

	@Then("Verify logout link")
	public void verify_logout_link() throws Exception {
		assertTrue(loginPage.lnkLogout.isDisplayed());
		Thread.sleep(2000);
		//closeBrowser();
	}


}
