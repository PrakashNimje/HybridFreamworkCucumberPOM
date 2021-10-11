package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateBusinessAccount {


	WebDriver ldriver;

	public CreateBusinessAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	By lnkCreateBusinessAccount=By.xpath("//a[normalize-space()='Create a Business Account']");
	By txtBusinessName=By.xpath("//input[@formcontrolname='businessName']");
	
	By txtBusinessEmail=By.xpath("//input[@formcontrolname='businessEmail']");
	By txtAddress=By.xpath("//input[@formcontrolname='address']");
	
	By BusinessDroupDown=By.xpath("//mat-select[@formcontrolname='nature_business']//div//div//div");
	By SelectNGO=By.xpath("//span[@class='mat-option-text'][normalize-space()='NGO']");
	By SelectStore=By.xpath("//span[normalize-space()='STORE']");
	
	By CountryDroupDown=By.xpath("//mat-form-field[5]//div[1]//div[1]//div[3]//mat-select[1]//div[1]//div[2]");
	By SelectIndia=By.xpath("//span[normalize-space()='India']");
	
	By httpDroupDown=By.xpath("//mat-select[@formcontrolname='websiteProtocol']//div//div//div");
	By Selecthttp=By.xpath("//span[normalize-space()='http://']");
	
	By txtwebsiteName=By.xpath("//input[@formcontrolname='websiteAddress']");
    By clickcheckbox=By.xpath("//span[@class='mat-checkbox-inner-container']");
    
    By btnAddAccount=By.xpath("//button[normalize-space()='Add Account']");
    
//    Action Methods
	
    public String getPageTitle()
    {
    	return ldriver.getTitle();
    }
    
    public void CreateABusinessAccount() {
		ldriver.findElement(lnkCreateBusinessAccount).click();
    }
    
    
    public void BusinessName(String Bname) {
		ldriver.findElement(txtBusinessName).sendKeys(Bname);

	}

	public void BusinessEmail(String Bemail) {
		ldriver.findElement(txtBusinessEmail).sendKeys(Bemail);

	}

	public void Address(String Add) {
		ldriver.findElement(txtAddress).sendKeys(Add);
	}

	public void BusinessDroupDown() {
		ldriver.findElement(BusinessDroupDown).click();
    }
	
	public void SelectNGO() {
		ldriver.findElement(SelectNGO).click();

	}
	public void SelectStore() {
		ldriver.findElement(SelectStore).click();

	}
	public void CopuntryDroupDown() {
		ldriver.findElement(CountryDroupDown).click();
	}

	public void India() {
		ldriver.findElement(SelectIndia).click();
	}

	public void httpDroupDown() {
		ldriver.findElement(httpDroupDown).click();	
	}

	public void Selecthttp() {
		ldriver.findElement(Selecthttp).click();
	}
	public void WebName(String webname) {
		ldriver.findElement(txtwebsiteName).sendKeys(webname);
	}

	public void checkbox() {
		ldriver.findElement(clickcheckbox).click();

	}

	public void ADDAccount() {
		ldriver.findElement(btnAddAccount).click();

	}
	
	
}	
	
	