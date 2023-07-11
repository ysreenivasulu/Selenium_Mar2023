package Defination_file;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_defination_file  {
	
	WebDriver d=new FirefoxDriver();
@Given("If user is on home page")
public void if_user_is_on_home_page() {
	
    d.get("https://www.amazon.in/");
}

@When("Click on moble")
public void click_on_moble() {
	
	d.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
    
}

@When("click on realme moble")
public void click_on_realme_moble() throws Throwable {
	
	//d.findElement(By.xpath("//div[5]//ul[1]//li[2]//span[1]//a[1]//div[1]//label[1]//i[1]")).click();
	
	WebElement checkbox = d.findElement(By.xpath("//div[5]//ul[1]//li[2]//span[1]//a[1]//div[1]//label[1]//i[1]"));
	
	//pre-validation to confirm that checkbox is displayed.
	if(checkbox.isDisplayed())
	{
		System.out.println("Checkbox is displayed. Clicking on it now");
		checkbox.click();
	}
	
	Thread.sleep(5000);
    
}

@When("click on N53 version")
public void click_on_n53_version() throws Throwable {
	
	d.findElement(By.xpath("//span[contains(text(),'Redmi 12C (Royal Blue, 4GB RAM, 28GB Storage) | Hi')]")).click();
	Thread.sleep(3000);
    
}

@Then("Verify logout link")
public void verify_logout_link() throws Throwable {
	ArrayList<String> ar=new ArrayList<String> (d.getWindowHandles());
	d.switchTo().window(ar.get(1));
	
	d.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	
	Thread.sleep(2000);
	
	d.quit();
    
}

}
