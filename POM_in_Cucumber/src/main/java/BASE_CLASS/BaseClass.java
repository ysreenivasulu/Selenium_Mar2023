package BASE_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	public static WebDriver d;
	@BeforeMethod
	public static void setup()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public static void closeApplication()
	{
		d.quit();
	}

}
