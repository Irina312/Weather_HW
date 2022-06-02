package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage extends BasePage {
    protected WebDriver driver;

    public SocialMediaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[aria-label='facebook, opens in new window']")
    public WebElement facebookBtn;

    @FindBy(css = "a[aria-label='twitter, opens in new window']")
    public WebElement twitterBtn;

    @FindBy(css = "a[aria-label='youtube, opens in new window']")
    public WebElement youtubeBtn;
}
