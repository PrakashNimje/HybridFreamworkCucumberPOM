package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;


import pageObjects.CreateBusinessAccount;
import pageObjects.LoginPage;
import pageObjects.SearchWallets;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public CreateBusinessAccount CrtBusAcc;
	public SearchWallets Srwall;
	public Logger logger;
	
	//Created for generating random string for Unique email
    public static String randomestring() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
}
}

