package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div//h2[text()='Your Privacy']")
    public WebElement privacyText;

    @FindBy(xpath = "//*[@class='Icon--icon--3wCKh Icon--actionTheme--sZu_q PrivacyDataNotice--closeButton--1fBzh']")
    public WebElement closeBtn;

    @FindBy(css = "a[aria-label='facebook, opens in new window']")
    public WebElement facebookBtn;

    @FindBy(css = "a[aria-label='twitter, opens in new window']")
    public WebElement twitterBtn;

    @FindBy(xpath = "//span[text()='10 Day']")
    public WebElement dayBtn;

    @FindBy(xpath = "//span[@class='DailyContent--temp--3d4dn'][normalize-space()='63°']")
    public WebElement todayWeather;

}
