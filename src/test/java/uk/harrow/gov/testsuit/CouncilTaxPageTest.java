package uk.harrow.gov.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.harrow.gov.pages.CouncilTaxPage;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

/**
 * Created By Bhavesh
 */
public class CouncilTaxPageTest extends TestBase {

    HomePage homePage;
    CouncilTaxPage councilTaxPage;

    @BeforeMethod (groups = "regression")
    public void setUp(){
        homePage = new HomePage();
        councilTaxPage = new CouncilTaxPage();
    }
    @Test(groups = "regression")

    public void userShouldNavigateToCouncilTaxPage(){
        homePage.clickOnCouncilTaxLink();
        String expectedText = "Council Tax";
        String actualText = councilTaxPage.councilTextPageText();
        Assert.assertEquals(expectedText, actualText);
    }
}
