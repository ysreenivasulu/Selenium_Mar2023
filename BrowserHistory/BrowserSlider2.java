package BrowserHistory;



	import static org.testng.Assert.assertEquals;

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
 
	public class BrowserSlider2 {
		public static void main(String[] args) throws Throwable {
			
		
		WebDriver d=new FirefoxDriver();
			//Load web page
			d.get("https://www.amazon.in/");
	//		assertEquals(d.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			System.out.println(d.getTitle());
			
			while(isElementPresent(d,By.xpath("//img[@alt='Bluetooth Calling Smartwatch starts at ₹1,999']")))
			{
				((RemoteWebDriver) d).executeScript("window.scrollBy(0,30)");
				Thread.sleep(1000);

			}
			d.findElement(By.xpath("//img[@alt='Bluetooth Calling Smartwatch starts at ₹1,999']")).click();
			
				
//			for(int i=0;i<8;i++)
//			{
//				((RemoteWebDriver) d).executeScript("window.scrollBy(0,400)");
//				Thread.sleep(1000);
//			}
			//((RemoteWebDriver) d).executeScript("window.scrollTo(0,0)");
			
			
			
			
			Thread.sleep(3000);	
		
		}

		public static boolean isElementPresent(WebDriver driver, By locator)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			try
			{
				driver.findElement(locator);
				return false;
			}
			catch(NoSuchElementException   e)
			{
				return true;
			}
				
			
			
		}
		
		
		
/*		@BeforeMethod
		public void setUp()
		{
			//Launch browser
			d=new FirefoxDriver();
			//d =new ChromeDriver();
			//Maximize browser
			d.manage().window().maximize();
			//d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		@AfterMethod
		public void tearDown()
		{
			//Close browser
			d.quit();
		}
		
		*/


	}


