package POM_Cucumber;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon2_pom {
	
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']") public WebElement homepage;
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")public WebElement moble;
	@FindBy(xpath="//span[text()='realme']") public WebElement Checkbox;
	@FindBy(xpath="//span[contains(text(),'realme narzo N53 (Feather Gold, 4GB+64GB) 33W Segm')]")public WebElement link;
	@FindBy(xpath="//input[@id='buy-now-button']")public WebElement buy;
	//@FindBy(id="logout-trigger")public WebElement lnkLogout;
	
	
	public Amazon2_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin()
	{
		homepage.click();
		moble.click();
		Checkbox.click();
		link.click();
		
		//buy.click();
	}
}
