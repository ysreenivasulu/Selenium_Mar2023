package POM_Cucumber;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon3_POM {
	
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']") public WebElement homepage;
	@FindBy(xpath="//a[text()='Books']")public WebElement Books;
	@FindBy(xpath="(//span[text()='English'])[1]") public WebElement Checkbox_ENG;
	@FindBy(xpath="//span[contains(text(),'Rubik’s Cube: How To Solve The Famous Cube In 3 Ea')]")public WebElement link;
	@FindBy(xpath="//input[@value='Buy now']")public WebElement buy;
	//@FindBy(id="logout-trigger")public WebElement lnkLogout;
	
	
	public Amazon3_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin()
	{
		homepage.click();
		Books.click();
		Checkbox_ENG.click();
		link.click();
		
	//	buy.click();
	}
}
