package uk.harrow.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.harrow.gov.utility.Utility;

/**
 * Created By Bhavesh
 */
public class CouncilTaxPage extends Utility {
    private static final Logger log = LogManager.getLogger(CouncilTaxPage.class.getName());



    @FindBy (xpath ="//h1[contains(text(),'Council Tax')]" )
    WebElement _welcomeText;

    public String councilTextPageText(){
        Reporter.log("Getting text from : " + _welcomeText.toString() + "<br>");
        log.info("Getting text from " +_welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }


}
