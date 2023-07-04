  package BrowserHistory;



	import static org.testng.Assert.assertEquals;

	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.time.Duration;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class BrokenLinks {
		
		public static void main(String[] args) {
			
		WebDriver d=new FirefoxDriver();
			// Load web page
			d.get("https://www.selenium.dev/");
			// Verify page title
	//		assertEquals(d.getTitle(),"Selenium");
			List<WebElement> l=d.findElements(By.className("nav-link"));
			
			System.out.println("No of links:"+l.size());
			System.out.println();
			
			// 7 link is there mining
			
			System.out.println(d.getTitle());
			
			for(WebElement e:l)                                   // for each use transfor ( storage value )is one position to other position 
			{
				try
				{
					
					if(e.getAttribute("href")!=null)
					{
						URL u=new URL(e.getAttribute("href"));
						//e.click();
						HttpURLConnection con=(HttpURLConnection)u.openConnection();
						con.setConnectTimeout(6000);
						con.connect();
						//System.out.println("Response code:"+u+"--->"+con.getResponseCode() );
						if(con.getResponseCode() == 200)
						{
							System.out.println("Link:"+u+"---> is working fine");           // if 7 links 200 code is there give is working fine 
						}
						else
						{
							System.out.println("Link:"+u+"---> is not working");	
						}
					}
					
				}
				catch(Exception io)
				{
					System.out.println(io);                                                   // catch the all links(7)
				}
				
			}
			d.quit();
		}	
		}
/*		@BeforeMethod
		public void setUp()
		{
			// Launch the browser
			d=new FirefoxDriver();
			//d=new ChromeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
		}
		@AfterMethod
		public void tearDown()
		{
			// Close the browser
			d.quit();
		}
*/
	



