package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SaleSunglassesPage extends BasePage {

    @FindBy(xpath = "//div[@class='ERlP6Bx']")
    private List<WebElement> saleProductsList;

    @FindBy(xpath = "//div[@class='_1MVUcS8']")
    private List<WebElement> saleIconList;

    @FindBy(xpath = "//button[@aria-haspopup='listbox']")
    private WebElement sortButton;

    @FindBy(xpath = "//ul[@class='_43FyMjl']")
    private WebElement sortPopUp;

    @FindBy(xpath = "//li[@id='plp_web_sort_price_low_to_high']")
    private WebElement sortPriseLowToHigh;

    @FindBy(xpath = "//span[@class='_3VjzNxC']")
    private List<WebElement> priceList;

    public SaleSunglassesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkSaleProductListHasSaleIcon() {
        boolean result = false;
        for (int i = 0; i < saleIconList.size(); i++) {
            if (saleIconList.get(i).isDisplayed()) result = true;
        }
        return result;
    }

    public void clickSortButton() {
        sortButton.click();
    }

    public boolean isSortPopUpVisible() {
        return sortPopUp.isDisplayed();
    }

    public void selectSort() {
        sortPriseLowToHigh.click();
    }

}
