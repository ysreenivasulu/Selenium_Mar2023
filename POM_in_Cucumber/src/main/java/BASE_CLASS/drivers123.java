package BASE_CLASS;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivers123 {
	
	WebDriver d;
  String browser="FF";
	public static String url="https://www.amazon.in/";
	 String url2="https://www.meesho.com/";
	
	public  void launchBrowser()
	{
		// Launch the browser
		if(browser.equals("FF"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equals("GC"))
		{
			d=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			d=new EdgeDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	}
	public void closeBrowser()
	{
		d.quit();
	}

}
