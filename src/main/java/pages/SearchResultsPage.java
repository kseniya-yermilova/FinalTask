package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='ERlP6Bx']")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//span[@class='_30BqGyh']")
    private List<WebElement> saveButtonList;

    @FindBy(xpath = "//span[@type='heartPrideFilled']")
    private WebElement savedItemsButton;

    @FindBy(xpath = "//li[@data-dropdown-id='sort']//button[@class='_1om7l06']")
    private WebElement sortDropDownList;

    @FindBy(xpath = "//ul[@class='_43FyMjl']")
    private WebElement sortPopUp;

    @FindBy(xpath = "//li[@id='plp_web_sort_price_low_to_high']")
    private WebElement sortLowToHighButton;

    @FindBy(xpath = "//div[@class='_3pQmLlY']")
    private WebElement products;

    @FindBy(xpath = "//span[@data-auto-id='productTileSaleAmount']")
    private List<WebElement> priceList;

    public SearchResultsPage(WebDriver driver) {super(driver);}

    public void clickSearchResultsOnFirstProduct(){
        searchResults.get(0).click();
    }

    public void clickSaveButtonOnFourthProduct(){
        saveButtonList.get(2).click();
    }

    public void clickSavedItemsButton(){
        savedItemsButton.click();
    }

    public WebElement getSavedItemsButton(){
        return savedItemsButton;
    }

    public void clickSortDropdownList(){
        sortDropDownList.click();
    }

    public WebElement getSortPopUp(){
        return sortPopUp;
    }

    public void clickSortLowToHighButton(){
        sortLowToHighButton.click();
    }

    public WebElement getProducts(){
        return products;
    }

    public boolean isPriceSort(){
        boolean result = false;
        double[] price = new double [priceList.size()];
        int i=0;
        for (WebElement element: priceList) {
            scrollPageToElement(element);
            price[i]=Double.parseDouble(element.getText().substring(1));
            i++;
        }
        for(i=0;i< priceList.size()-1;i++){
            if(price[i]<price[i+1])
                result = true;
            else result = false;
        }
        return result;
    }

    public WebElement getSaveButtonOnFourthProduct(){
        return saveButtonList.get(2);
    }
}
