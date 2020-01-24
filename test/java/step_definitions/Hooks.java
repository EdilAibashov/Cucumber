package step_definitions;

import org.junit.After;
import org.junit.Before;
import util.Driver;

public class Hooks {
    @Before
    public void beforeScenario(){
        Driver.getDriver();
        System.out.println("Starting scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("Ending scenario");
        Driver.quitDriver();
    }
}


