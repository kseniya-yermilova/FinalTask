package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SaleSunglassesPage extends BasePage{

    @FindBy(xpath = "//div[@class='ERlP6Bx']")
    private List <WebElement> saleProductsList;

    @FindBy(xpath = "//div[@class='_1MVUcS8']")
    private List <WebElement> saleIconList;

    public SaleSunglassesPage(WebDriver driver){
        super(driver);
    }

    public boolean checkSaleProductListHasSaleIcon(){
        boolean result=false;
        for (int i =0;i<saleProductsList.size();i++) {
            if(saleIconList.get(i).isDisplayed()) result = true;
        }
        return result;
    }
}
