package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QRCodePage {
	
	@FindBy(linkText="Banking") public WebElement lnkBanking;
	@FindBy(linkText="Receive QR-code") public WebElement lnkReceiveQRCode;
	@FindBy(xpath="//input") public WebElement txtAmt;
	@FindBy(xpath="//span[contains(.,'Generate QR code')]") public WebElement btnGenerateQRCode;
	@FindBy(xpath="//receive-qr-payment-step-pending/div/img") public WebElement imgQRCode;
	@FindBy(xpath="//label-value[3]/div/div/div") public WebElement urlQRCode;
	public QRCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
