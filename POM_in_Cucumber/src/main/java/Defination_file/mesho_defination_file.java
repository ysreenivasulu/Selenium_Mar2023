package Defination_file;

import BASE_CLASS.BaseClass;
import POM_Cucumber.Amazon2_pom;
import POM_Cucumber.Amazon3_POM;
import POM_Cucumber.Amazon_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mesho_defination_file extends BaseClass{

	


@Given("go to home page")
public void go_to_home_page() {
    BaseClass.setup();
	
}

@Given("go to on moble button")
public void go_to_on_moble_button() {
    
	//Amazon_pom am=new Amazon_pom(d);
	Amazon_pom lognpage=new Amazon_pom(d);
	lognpage.fillLogin();
}

@When("click on moble future")
public void click_on_moble_future() {
	Amazon2_pom log2=new Amazon2_pom(d);
	log2.fillLogin();
	
}

@When("go to next aaction")
public void go_to_next_aaction() {
    
	Amazon3_POM log3=new Amazon3_POM(d);
	log3.fillLogin();
}

@When("click on oppo version")
public void click_on_oppo_version() {
    d.navigate().back();
	
 }

@Then("i validate the buy futere")
public void i_validate_the_buy_futere() {
    d.navigate().forward();
	
}

@Then("check the buy outcomes")
public void check_the_buy_outcomes() {
    
	BaseClass.closeApplication();
}
}
