package uk.harrow.gov.testbase;

import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.harrow.gov.basepage.BasePage;
import uk.harrow.gov.browserselector.BrowserSelector;
import uk.harrow.gov.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/*
Created By Bhavesh
*/public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod (groups = "regression")
    public void openBrowser(){

        browserSelector.selectBrowser(browser);
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod (groups = "regression")
    public void tearDown() {
        driver.quit();
    }
}
