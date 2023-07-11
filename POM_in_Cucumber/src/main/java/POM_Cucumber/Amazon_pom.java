package POM_Cucumber;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Amazon_pom {
	
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]") public WebElement lnkLogin;
	@FindBy(xpath="//span[contains(text(),'Mobile Accessories')]")public WebElement tfUname;
	@FindBy(xpath="//span[contains(text(),'Power banks')]")public WebElement tfPassword;
	@FindBy(xpath="//span[contains(text(),'Headsets')]")public WebElement btnSumit;
	//@FindBy(xpath="//div[text()='Home']")public WebElement txtHome;
	//@FindBy(id="logout-trigger")public WebElement lnkLogout;
	
	
	public Amazon_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void fillLogin()
	{
		lnkLogin.click();
		tfUname.click();
		tfPassword.click();
		btnSumit.click();
	//	lnkLogout.click();
	}
}
