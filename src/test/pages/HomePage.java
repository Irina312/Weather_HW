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

    @FindBy(xpath = "//p[@class='PrivacyDataNotice--mainParagraph--1nQsp']")
    public WebElement privacyText;

    @FindBy(xpath = "(//div[@class='PrivacyDataNotice--notice--5SUaf'])[1]//svg[name='close']")
    public WebElement closeBtn;

    @FindBy(css = "a[aria-label='facebook, opens in new window']")
    public WebElement facebookBtn;

    @FindBy(css = " a[aria-label='twitter, opens in new window']")
    public WebElement twitterBtn;

}
