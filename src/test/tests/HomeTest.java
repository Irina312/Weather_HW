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

        System.out.println(homePage.privacyText.getText());
        homePage.closeBtn.click();
    }


    @Test(testName = "10 day weather")
    public void test05() {

        homePage.dayBtn.click();
        System.out.println(homePage.todayWeather.getText());
    }


}
