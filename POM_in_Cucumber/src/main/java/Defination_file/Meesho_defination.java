package Defination_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import BASE_CLASS.drivers123;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Meesho_defination {
	

WebDriver d=new FirefoxDriver();
@Given("check the  home page")
public void check_the_home_page() throws Throwable {
	
	d.get("https://www.meesho.com/");
	d.manage().window().maximize();
	Thread.sleep(2000);
    
}

@When("Click on mobles")
public void click_on_mobles() throws Throwable {
    
	Actions a=new Actions(d);
	a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Women Western')]"))).perform();
	a.moveToElement(d.findElement(By.xpath("//p[text()='Bra']"))).click().build().perform();
	
	Thread.sleep(3000);
}

@When("click on realme mobles")
public void click_on_realme_mobles() throws Throwable {
	WebElement ele=d.findElement(By.xpath("//span[text()='Bra']"));
	Thread.sleep(3000);
	if(ele.isDisplayed())
	{
		ele.click();
		
	}
	Thread.sleep(3000);
}

@When("click on N55 version")
public void click_on_n55_version() throws Throwable {
   
	d.findElement(By.xpath("(//p[text()='Sassy Women Bra'])[2]")).click();
    Thread.sleep(3000);
}

@Then("Verify logout links")
public void verify_logout_links() throws Throwable {
     
	d.findElement(By.xpath("//span[contains(text(),'40A')]")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//span[contains(text(),'Buy Now')]")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@type='tel']")).sendKeys("9502073301");
	d.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
		
		d.close();
}

}
