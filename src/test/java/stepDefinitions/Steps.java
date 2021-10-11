package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateBusinessAccount;
import pageObjects.LoginPage;
import pageObjects.SearchWallets;

public class Steps extends BaseClass {
	 
    
	
	
//	Login Feature Step Defination
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		logger.info("********* Launching browser***************");
		driver =new ChromeDriver();
		
	    lp=new LoginPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
	  driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
	   lp.setUserName(email);
	   lp.setPassword(password);
	   Thread.sleep(2000);
		
	}

	@When("Click On Login")
	public void click_on_login() throws InterruptedException {
	   lp.clickSubmit();
	   Thread.sleep(2000);
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String title) {
	    if (driver.getPageSource().contains("Please check your email or password")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    } else
	    	Assert.assertEquals(title,driver.getTitle());
	    }

	@When("User click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
	  
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
	
	
//	Create Business Account Feature step Defination..............
	
	@Then("User can View DashBoard")
	public void user_can_view_dash_board() {
	   
		CrtBusAcc=new CreateBusinessAccount(driver);
		Assert.assertEquals("DashBoard Page",CrtBusAcc.getPageTitle());
		
	}
	@When("User click on Create Business Account")
	public void user_click_on_create_business_account() throws InterruptedException {
		Thread.sleep(2000);
		CrtBusAcc.CreateABusinessAccount();
		
	}
	@Then("User Can View Create New Business Account")
	public void user_can_view_create_new_business_account() throws InterruptedException {
	Assert.assertEquals("Create Business Account Page",CrtBusAcc.getPageTitle());
	Thread.sleep(2000);
	}
	
	@When("User Enter Customer info")
	public void user_enter_customer_info() throws InterruptedException {
	CrtBusAcc.BusinessName("Prakash Nimje");
	Thread.sleep(2000);
	String email = randomestring() + "@gmail.com"; 
	CrtBusAcc.BusinessEmail(email);
	Thread.sleep(2000);
	CrtBusAcc.Address("Near NIT Garden,Nagpur,Pin Code:441802");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(2000);
	CrtBusAcc.BusinessDroupDown();
	CrtBusAcc.SelectNGO();
	Thread.sleep(2000);
	CrtBusAcc.CopuntryDroupDown();
	CrtBusAcc.India();
	Thread.sleep(2000);
	CrtBusAcc.httpDroupDown();
	CrtBusAcc.Selecthttp();
	String webname = randomestring() + ".com"; 
	CrtBusAcc.WebName(webname);
	Thread.sleep(2000);
	CrtBusAcc.checkbox();
	
	}
	@When("Click On Add Account")
	public void click_on_add_account() throws InterruptedException {
	CrtBusAcc.ADDAccount();  
	Thread.sleep(2000);
	}
	@Then("User Can View Confirmation msg {string}")
	public void user_can_view_confirmation_msg(String msg) {
		
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
                .contains("Your Business Account has been created successfully!"));
		
	}
	
//	Steps for Searching a Wallets using a Wallets Names...
	
	@When("Click on wallets")
	public void click_on_wallets() {
		Srwall=new SearchWallets(driver);
		Srwall.Wallet();
	}
	@When("Click on Search Wallets")
	public void click_on_search_wallets() throws InterruptedException {
	    Srwall.Search1("Prakash");
	    Thread.sleep(2000);
	}
	
	@Then("User Should Found Wallets in Search Table")
	public void user_should_found_wallets_in_search_table() {
//		boolean status =Srwall.Search2("Prakash");
//		Assert.assertEquals(true,status);
		
	}

}
