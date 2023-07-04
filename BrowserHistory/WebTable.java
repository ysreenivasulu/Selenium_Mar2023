package BrowserHistory;


	import java.net.MalformedURLException;
	import java.net.URL;
	import java.time.Duration;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import static org.testng.Assert.*;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class WebTable {
		WebDriver d;
		@BeforeMethod
		public void setUp()
		{
			// Launch browser
			d=new FirefoxDriver();
			//d=new ChromeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			d.manage().window().maximize();
		}
		@AfterMethod
		public void tearDown()
		{
			// Close browser
			d.quit();
		}
		@Test
		public void dynamicTable()throws Exception
		{
			d.get("https://www.w3schools.com/html/html_tables.asp");
			assertEquals(d.getTitle(),"HTML Tables");
			
			
			// tr_collection means = collection of rows	
			// td_collection       = collection of colums
			
			List<WebElement> tr_collection=d.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
			int row_num=1,col_num=1;
	        for(WebElement trElement : tr_collection) // Rows
	        	
	        	
	        {
	            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
	            System.out.println("NUMBER OF COLUMNS in "+row_num+" Row:"+td_collection.size());
	            col_num=1;
	            for(WebElement tdElement : td_collection) // Cols
	            	
	           
	            {
	            	if(tdElement.getText().equals("UK"))                     // tdElement mean  = table data
	                {
	                	System.out.println("Text Found");
	                	break;
	                }


	               	col_num++;                                                  // For each type
	            }
	            row_num++;
	            
	        } 
	        Thread.sleep(2000);
		}
		
		

	}



