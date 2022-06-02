package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @Test(testName = "Print 'Your Privacy' text")
    public void test01() {

        homePage.privacyText.getText();
        homePage.closeBtn.click();

    }
}
