package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenDayWeatherPage extends BasePage {
    protected WebDriver driver;

    public TenDayWeatherPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='10 Day']")
    public WebElement dayBtn;

    @FindBy(xpath = "//span[@class='DailyContent--temp--3d4dn'][normalize-space()='63°']")
    public WebElement todayWeather;
}
