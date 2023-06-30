package Robot_class;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class download {

	public static void main(String[] args) throws Throwable {
		
		
		       // Launch browser
				WebDriver d = new FirefoxDriver();
		
				
				d.get("https://www.selenium.dev/downloads/");
			//	d.findElement(By.linkText("4.10.0")).click();
				d.findElement(By.partialLinkText("4.10.0 (June 07, 2023)")).click();
				Thread.sleep(2000);
				
				d.quit();

				


	}

}
