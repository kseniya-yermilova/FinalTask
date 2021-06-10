package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='_25fsaDO _2zC79ar']")
    private WebElement header;

    @FindBy(xpath = "//div[@class='_3RUU0vJ']")
    private WebElement footer;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//span[@type='accountUnfilled']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@type='bagUnfilled']")
    private WebElement shoppingBagButton;

    public HomePage(WebDriver driver) {super(driver);}

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean isHeaderVisible(){
        return header.isDisplayed();
    }

    public boolean isFooterVisible(){
        return footer.isDisplayed();
    }

    public boolean isSearchFieldVisible(){
        return searchField.isDisplayed();
    }

    public boolean isSignInButtonVisible(){
        return signInButton.isDisplayed();
    }

    public boolean isShoppingBagButtonVisible(){
        return shoppingBagButton.isDisplayed();
    }

    public void clickShoppingBagButton(){
        shoppingBagButton.click();
    }
}
