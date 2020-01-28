package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import util.Driver;

public class HomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    public static void verifyTitle(){
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
    }
}
