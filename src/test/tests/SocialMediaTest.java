package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SocialMediaPage;

public class SocialMediaTest extends BaseTest {
    SocialMediaPage socialMediaPage;

    @BeforeMethod
    public void localSetUp() {
        socialMediaPage = new SocialMediaPage(getDriver());
    }
    @Test(testName = "Facebook page title")
    public void test02(){

        socialMediaPage.facebookBtn.click();
        System.out.println(getDriver().getTitle());
    }

    @Test(testName = "Twitter page title")
    public void test03() {

        socialMediaPage.twitterBtn.click();
        System.out.println(getDriver().getTitle());

    }

    @Test(testName = "Youtube page title")
    public void test04() {

        socialMediaPage.youtubeBtn.click();
        System.out.println(getDriver().getTitle());

    }

}
