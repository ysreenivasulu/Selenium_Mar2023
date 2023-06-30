package stepdef;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import config.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QRCodePage;

public class QRCodeDef extends Driver{
	
	QRCodePage pageQRCode;
	@When("Click on Banking link")
	public void click_on_banking_link() {
		pageQRCode=new QRCodePage(d);
		pageQRCode.lnkBanking.click();
	}
	@When("Click on Receive QR-code")
	public void click_on_receive_qr_code() throws Exception {
		pageQRCode.lnkReceiveQRCode.click();
		Thread.sleep(1000);
	}
	@When("Enter amount as {string}")
	public void enter_amount_as(String amt) throws Exception {
		pageQRCode.txtAmt.sendKeys(amt);
	    Thread.sleep(1000);
	}
	@When("Click on Generate QR code")
	public void click_on_generate_qr_code() throws Exception {
		pageQRCode.btnGenerateQRCode.click();
	    Thread.sleep(2000);
	}
	@Then("Verify QR code and URL")
	public void verify_qr_code_and_url() {
	    assertTrue(pageQRCode.imgQRCode.isDisplayed());
	    assertTrue(pageQRCode.urlQRCode.isDisplayed());
	    // Close the browser
	    //closeBrowser();
	}

}
