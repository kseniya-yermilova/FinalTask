package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.Locale;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    ShoppingBagPage shoppingBagPage;
    SignInPage signInPage;
    ResetPasswordPage resetPasswordPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    ClothingTallPage clothingTallPage;
    //   CheckoutPage checkoutPage;
    PageFactoryManager pageFactoryManager;
    SaleSunglassesPage saleSunglassesPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }


    @After
    public void tearDown() {
        driver.close();
    }

    @Given("User opens {string} page")
    public void openHomePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void checkHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        Assert.assertTrue(homePage.isHeaderVisible());
    }

    @And("User checks footer visibility")
    public void checkFooterVisibility() {
        Assert.assertTrue(homePage.isFooterVisible());
    }

    @And("User checks search field visibility")
    public void checksSearchFieldVisibility() {
        Assert.assertTrue(homePage.isSearchFieldVisible());
    }

    @And("User checks sign in button visibility")
    public void checkSignInButtonVisibility() {
        Assert.assertTrue(homePage.isSignInButtonVisible());
    }

    @And("User checks shopping bag button visibility")
    public void checkShoppingBagButtonVisibility() {
        Assert.assertTrue(homePage.isShoppingBagButtonVisible());
    }

    @When("User opens shopping bag")
    public void openShoppingBag() {
        homePage.clickShoppingBagButton();
        shoppingBagPage = pageFactoryManager.getShoppingBagPage();
        shoppingBagPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        shoppingBagPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @Then("User checks empty bag title visibility")
    public void checkShoppingBagTitleVisibility() {
        Assert.assertTrue(shoppingBagPage.isEmptyBagTitleVisible());
    }

    @And("User clicks 'Sign In' button")
    public void clickSignInButton() {
        homePage.clickSignInButton();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSignInPopUp());
    }

    @And("User checks sign in popup visibility")
    public void checkSignInPopupVisibility() {
        Assert.assertTrue(homePage.isSignInPopUpVisible());
    }

    @And("User clicks 'Sign In' button at sign in popup")
    public void clickSignInButtonAtSignInPopup() {
        homePage.clickSignInButtonAtPopUp();
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User checks email and password fields visibility")
    public void checkEmailFieldVisibility() {
        Assert.assertTrue(signInPage.isEmailFieldVisible());
        Assert.assertTrue(signInPage.isPasswordFieldVisible());
    }

    @When("User enter {string}")
    public void enterEmail(final String email) {
        signInPage.enterEmail(email);
    }

    @And("User clicks 'Sign In' button at sign in page")
    public void clickSignInButtonAtSignInPage() {
        signInPage.clickSignInButton();
    }

    @Then("User checks that email error is visible")
    public void checkThatEmailErrorIsVisible() {
        Assert.assertTrue(signInPage.isEmailErrorVisible());
    }

    @Then("User checks that password error is visible")
    public void checkThatPasswordErrorIsVisible() {
        Assert.assertTrue(signInPage.isPasswordErrorVisible());
    }

    @And("User checks 'forgot password' button visibility")
    public void checkForgotPasswordButtonVisibility() {
        Assert.assertTrue(signInPage.isForgotPasswordVisible());
    }

    @When("User clicks 'Forgot password'")
    public void clickForgotPassword() {
        signInPage.clickForgotPasswordButton();
        resetPasswordPage = pageFactoryManager.getResetPasswordPage();
        resetPasswordPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User checks email field visibility")
    public void checkEmailFieldVisibilityAtResetPasswordPage() {
        Assert.assertTrue(resetPasswordPage.isEmailFieldVisible());
    }

    @And("User checks 'reset password' button visibility")
    public void checkResetPasswordButtonVisibility() {
        Assert.assertTrue(resetPasswordPage.isResetPasswordButtonVisible());
    }

    @When("User makes search by keyword {string}")
    public void makeSearchByKeyword(String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User clicks first product of search results")
    public void clickFirstProductOfSearchResults() {
        searchResultsPage.clickSearchResultsOnFirstProduct();
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User clicks add to bag button on product")
    public void clickAddToCartButtonOnProduct() {
        productPage.clickAddToBagButton();

    }

    @And("User checks that add to bag popup visible")
    public void checkAddToBagPopupVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddToBagPopup());
        Assert.assertTrue(productPage.isAddToBagPopupVisible());
    }

    @Then("User clicks main page button")
    public void clickMainPageButton() {
        productPage.clickMainPageButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User checks that amount of products in shopping bag are {string}")
    public void checkThatAmountOfProductsInShoppingBag(final String expectedAmount) {
        Assert.assertEquals(homePage.getAmountOfProductsInShoppingBag(), expectedAmount);
    }

    @And("User clicks Women button")
    public void clickWomenButton() {
        homePage.clickWomenButton();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User moves to Clothing button")
    public void moveToClothingButton() {
        homePage.moveToClothingButton();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getClothingPopUp());
    }

    @And("User checks Clothing pop up visibility")
    public void checkClothingPopUpVisibility() {
        Assert.assertTrue(homePage.isClothingPopupVisible());
    }

    @When("User clicks Tall button")
    public void clickTallButton() {
        homePage.clickTallButton();
        clothingTallPage = pageFactoryManager.getClothingTallPage();
        clothingTallPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }


    @Then("User checks that names of product contains word {string}")
    public void checkThatNamesOfProductContainsKeyword(String keyword) {
        clothingTallPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        for (WebElement webElement : clothingTallPage.getTallProducts()) {
            clothingTallPage.scrollPageToElement(webElement);
            Assert.assertTrue(webElement.getText().toLowerCase(Locale.ROOT).contains(keyword));
        }
    }

    @And("User clicks Men button")
    public void clickMenButton() {
        homePage.clickMenButton();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User moves to Sale button")
    public void clickSaleButton() {
        homePage.moveToSaleButton();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSalePopUp());
    }

    @And("User checks Sale pop up visibility")
    public void checkSalePopUpVisibility() {
        Assert.assertTrue(homePage.isSalePopUpVisible());
    }

    @When("User clicks Sale sunglasses button")
    public void clickSaleSunglassesButton() {
        homePage.clickSaleSunglassesButton();
        saleSunglassesPage = pageFactoryManager.getSaleSunglassesPage();
        saleSunglassesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User checks sale products have saleIcon")
    public void checkSaleProductsHaveSaleIcon() {
        saleSunglassesPage.checkSaleProductListHasSaleIcon();
    }
}
