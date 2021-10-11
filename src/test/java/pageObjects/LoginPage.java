package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;	
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement lnkLogin;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//body/app-root/app-layout/app-login/div/div/div/div/div/form/div/div/button[1]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/nav[1]/div[1]/a[14]/span[1]")
	@CacheLookup
	WebElement lnkLogout;
	
	public void clickLogin()
	
	{
		lnkLogin.click();
		
	}
	
	public void setUserName(String uname)
	{
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
		
	}
	

