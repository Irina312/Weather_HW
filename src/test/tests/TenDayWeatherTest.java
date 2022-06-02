package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SocialMediaPage;
import pages.TenDayWeatherPage;

public class TenDayWeatherTest extends BaseTest {
    TenDayWeatherPage tenDayWeatherPage;

    @BeforeMethod
    public void localSetUp() {
        tenDayWeatherPage = new TenDayWeatherPage(getDriver());
    }
    @Test(testName = "10 day weather")
    public void test05() {

        tenDayWeatherPage.dayBtn.click();
        System.out.println(tenDayWeatherPage.todayWeather.getText());
    }
}
