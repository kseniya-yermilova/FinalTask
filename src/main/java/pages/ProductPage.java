package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//button[@data-test-id='add-button']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//div[@class='_10AVfLf _23LM9fc']")
    private WebElement addToBagPopup;

    @FindBy(xpath = "//a[@class='_24SZgSx _6DZZlcW']")
    private WebElement mainPageButton;

    @FindBy(xpath = "//div[@class='product-price']")
    private WebElement productPrice;

    @FindBy(xpath = "//a[@class='show']")
    private WebElement showMoreButton;

    @FindBy(xpath = "//div[@class='product-description']")
    private WebElement productDetails;

    @FindBy(xpath = "//div[@class='product-code']")
    private WebElement productCode;

    @FindBy(xpath = "//div[@class='brand-description']")
    private WebElement brand;

    @FindBy(xpath = "//div[@class='care-info']")
    private WebElement lookAfterMe;

    @FindBy(xpath = "//div[@class='about-me']")
    private WebElement about;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToBagButton() {
        addToBagButton.click();
    }

    public boolean isAddToBagPopupVisible() {
        return addToBagButton.isDisplayed();
    }

    public WebElement getAddToBagPopup() {
        return addToBagPopup;
    }

    public void clickMainPageButton() {
        mainPageButton.click();
    }

    public boolean isProductPriceVisible() {
        return productPrice.isDisplayed();
    }

    public void clickShowMoreButton() {
        showMoreButton.click();
    }

    public WebElement getShowMoreButton() {
        return showMoreButton;
    }

    public boolean isProductDetailsVisible() {
        return productDetails.isDisplayed();
    }

    public boolean isProductCodeVisible() {
        return productCode.isDisplayed();
    }

    public boolean isBrandVisible() {
        return brand.isDisplayed();
    }

    public boolean isLookAfterMeVisible() {
        return lookAfterMe.isDisplayed();
    }

    public boolean isAboutVisible() {
        return about.isDisplayed();
    }
}
