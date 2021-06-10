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
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import pages.ShoppingBagPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    ShoppingBagPage shoppingBagPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
 //   CheckoutPage checkoutPage;
    PageFactoryManager pageFactoryManager;

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
    public void checkShoppingCartTitleVisibility() {
        Assert.assertTrue(shoppingBagPage.isEmptyBagTitleVisible());
    }
}
