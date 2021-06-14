package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='_25fsaDO _2zC79ar']")
    private WebElement header;

    @FindBy(xpath = "//div[@class='_3RUU0vJ']")
    private WebElement footer;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='kH5PAAC _1KRfEms']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@type='accountUnfilled']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@type='bagUnfilled']")
    private WebElement shoppingBagButton;

    @FindBy(xpath = "//div[@class='_10AVfLf _23LM9fc']")
    private WebElement signInPopUp;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    private WebElement signInButtonAtPopUp;

    @FindBy(xpath = "//span[@class='_1z5n7CN']")
    private WebElement shoppingBagProductsCount;

    @FindBy(xpath = "//a[@id='women-floor']")
    private WebElement womenButton;

    @FindBy(xpath = "//a[@id='men-floor']")
    private WebElement menButton;

    @FindBy(xpath = "//button[@data-id='96b432e3-d374-4293-8145-b00772447cde']")
    private WebElement clothingButton;

    @FindBy(xpath = "//div[@id='96b432e3-d374-4293-8145-b00772447cde']")
    private WebElement clothingPopUp;

    @FindBy(xpath = "//*[@id='96b432e3-d374-4293-8145-b00772447cde']//div[@title='Maternity']")
    private WebElement maternityButton;

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//span[text()='Sale']")
    private WebElement saleButton;

    @FindBy(xpath = "//div[@id='c223e1a9-dc0f-42f5-afca-5cf5988c716b']")
    private WebElement salePopUp;

    @FindBy(xpath = "//div[@id='c223e1a9-dc0f-42f5-afca-5cf5988c716b']//a[text()='SALE Sunglasses']")
    private WebElement saleSunglassesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public boolean isSignInButtonVisible() {
        return signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public boolean isShoppingBagButtonVisible() {
        return shoppingBagButton.isDisplayed();
    }

    public void clickShoppingBagButton() {
        shoppingBagButton.click();
    }

    public WebElement getSignInPopUp() {
        return signInPopUp;
    }

    public boolean isSignInPopUpVisible() {
        return signInPopUp.isDisplayed();
    }

    public void clickSignInButtonAtPopUp() {
        signInButtonAtPopUp.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getAmountOfProductsInShoppingBag() {
        return shoppingBagProductsCount.getText();
    }

    public void clickWomenButton() {
        womenButton.click();
    }

    public void moveToClothingButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(clothingButton).build().perform();
    }

    public boolean isClothingPopupVisible() {
        return clothingPopUp.isDisplayed();
    }

    public WebElement getClothingPopUp() {
        return clothingPopUp;
    }

    public void clickMaternityButton() {
        maternityButton.click();
    }

    public void clickMenButton() {
        menButton.click();
    }

    public void moveToSaleButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(saleButton).build().perform();
    }

    public boolean isSalePopUpVisible() {
        return salePopUp.isDisplayed();
    }

    public WebElement getSalePopUp() {
        return salePopUp;
    }

    public void clickSaleSunglassesButton() {
        saleSunglassesButton.click();
    }

    public WebElement getSaleSunglassesButton() {
        return saleSunglassesButton;
    }
}
