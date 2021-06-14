package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingBagPage extends BasePage {

    @FindBy(xpath = "//h2[@class='empty-bag-title']")
    private WebElement emptyBagTitle;

    public ShoppingBagPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEmptyBagTitleVisible() {
        return emptyBagTitle.isDisplayed();
    }

    public WebElement getEmptyBagTitle() {
        return emptyBagTitle;
    }
}
