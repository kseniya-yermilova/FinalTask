package manager;

import io.cucumber.java.ro.Si;
import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

    public ResetPasswordPage getResetPasswordPage() {
        return new ResetPasswordPage(driver);
    }

    public ShoppingBagPage getShoppingBagPage() {
        return new ShoppingBagPage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }

    public ClothingTallPage getClothingTallPage() {
        return new ClothingTallPage(driver);
    }

    public SaleSunglassesPage getSaleSunglassesPage() { return new SaleSunglassesPage(driver); }

    //   public CheckoutPage getCheckoutPage() { return new CheckoutPage(driver); }
}
