  package BrowserHistory;



import static org.testng.Assert.assertEquals;


import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessController;
import java.security.AccessControlContext;
import java.security.CodeSource;
import java.security.Policy;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class sree {
	WebDriver d;

	
	@BeforeMethod
	public void setup()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	
	@Test
	public void testfb() throws Exception
	{
		d.get("https://www.selenium.dev/");
		//assertEquals(d.getTitle(),"Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
		//assertEquals(d.getTitle(),
		System.out.println(d.getTitle());
		List<WebElement> l= d.findElements(By.className("nav-link"));
		System.out.println("total element:"+l.size());
		Thread.sleep(1000);
		
		for(WebElement e:l)
			
		{
			try
			{
				if( e.getAttribute("href") !=null);
				{
					URL u=new URL(e.getAttribute("href"));
					HttpURLConnection con=(HttpURLConnection)u.openConnection();
					con.setConnectTimeout(3000);
					con.connect();
					if(con.getResponseCode() ==200)
					{
						System.out.println("Link:"+u+"----->is working fine");
						
					}
					else
					{
						System.out.println("Link:"+u+"-------->is not working");
						
					}
				}
			}
			catch(Exception ie)
			{
				System.out.println(ie);
			}
		}
		
		
	/*	for(WebElement e:l)                                   
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
			catch(Exception ie)
			{
				System.out.println(ie);                                                   // catch the all links(7)
			}
			
		}*/
		
	
		
		
	
	}
	@AfterMethod
	public void teardown()
	{
		d.quit();
	}

	
}
