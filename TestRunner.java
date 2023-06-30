package stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = {"Feature Files"},
		glue={"stepdef"},
		//dryRun = true,
        plugin = {"pretty",
                  "html:target/report/cucumber.html",
                  "json:target/report/cucumber.json"
                 },
	    tags= "@Sanity"

		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}

