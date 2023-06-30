package stepdef;

import config.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario()
	{
		System.out.println("********** Before each scenario ************");
		Driver.launchBrowser();
	}
	@After
	public void afterScenario()
	{
		System.out.println("********** After each scenario ************");
		Driver.closeBrowser();
	}
	@Before("@DB")
	public void beforeScenario1()
	{
		System.out.println("********** Connecting data base ************");
	}
	@After("@DB")
	public void afterScenario1()
	{
		System.out.println("********** Close data base connection ************");
	}

}
