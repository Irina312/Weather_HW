package tests;

import base.BaseTest;
import jdk.nashorn.internal.AssertsEnabled;
import org.openqa.selenium.By;
import org.testng.Assert;
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

    @Test(testName = "Facebook page title")
    public void test02(){

        homePage.facebookBtn.click();
        System.out.println(getDriver().getTitle());
    }

    @Test(testName = "Twitter page title")
    public void test03() {

        homePage.twitterBtn.click();
        System.out.println(getDriver().getTitle());
    }



}
