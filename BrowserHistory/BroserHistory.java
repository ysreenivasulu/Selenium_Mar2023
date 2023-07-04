package BrowserHistory;


	import static org.testng.Assert.assertEquals;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
	

	public class BroserHistory {
		
		WebDriver d;
		@Test
		public void testBrowserHistory()throws Exception
		{
			d.navigate().to("https://www.selenium.dev/");
			//assertEquals(d.getTitle(),"Selenium");
			d.findElement(By.linkText("Documentation")).click();
			Thread.sleep(2000);
			d.navigate().back();
			Thread.sleep(2000);
			d.navigate().forward();
			Thread.sleep(2000);
			d.navigate().refresh();
			Thread.sleep(2000);
			System.out.println(d.getTitle());
		} 
		@BeforeMethod
		public void setUp()
		{
			//Launch browser
			d=new FirefoxDriver();
			//d =new ChromeDriver();
			//Maximize browser
			d.manage().window().maximize();
			//d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.manage().deleteAllCookies();
		}
		@AfterMethod
		public void tearDown()
		{
			//Close browser
			d.quit();
		}

	}



