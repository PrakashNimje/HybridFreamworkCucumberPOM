package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchWallets {

      public WebDriver ldriver;	
      WaitHelper waithelper; 
 
	public SearchWallets(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Wallets']")
	@CacheLookup
	WebElement lnkWallet;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Wallet']")
	@CacheLookup
	WebElement txtSearch1;
	
	public void Wallet() {
		lnkWallet.click();
	}
	
	public void Search1(String Sname) {
		waithelper.WaitForElement(txtSearch1,30);
		txtSearch1.sendKeys(Sname);
}
}