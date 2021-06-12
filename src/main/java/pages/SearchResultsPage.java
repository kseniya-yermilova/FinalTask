package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='ERlP6Bx']")
    private List<WebElement> searchResults;

    public SearchResultsPage(WebDriver driver) {super(driver);}

    public void clickSearchResultsOnFirstProduct(){
        searchResults.get(0).click();
    }
}
