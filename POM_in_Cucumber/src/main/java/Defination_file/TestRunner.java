package Defination_file;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = {"Feature Files"},
		glue={"Defination2"},
		//dryRun = true,
        plugin = {"pretty",
                  "html:target/report/cucumber.html",
                  "json:target/report/cucumber.json"
                 }  
	  //  tags= "@Smoke"

		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}

