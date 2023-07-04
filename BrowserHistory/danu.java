package BrowserHistory;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class danu {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.selenium.dev/");
		//assertEquals(d.getTitle(),"Selenium");
		d.manage().window().maximize();
	//	d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		//assertEquals(d.getTitle(),"Selenium");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
	//	d.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/p[1]/a[1]")).click();
		
		Thread.sleep(1000);
		d.quit();
	
	}

}
