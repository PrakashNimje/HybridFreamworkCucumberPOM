package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions                  
        (
   features=".//Features//CreateBusinessAccount.feature",
   glue= {"stepDefinitions"}, 
   monochrome=true,
   dryRun=true,
   plugin= {"pretty","html:test-output"}	  
                		  )
   public class TestRunner {

	
}
