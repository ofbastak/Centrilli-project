package com.centrilli.step_definitions;

import com.centrilli.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void teardownScenario(Scenario scenario){

        //Scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.callDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();


        // System.out.println("====Closing browser using cucumber @After");
        // System.out.println("====Scenario ended/ Take screenshot if failed!");
    }
}
