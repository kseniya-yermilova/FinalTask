package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClothingTallPage extends BasePage{

    @FindBy(xpath = "//div[@class='_3J74XsK']//p")
    private List<WebElement> tallProducts;

    public ClothingTallPage(WebDriver driver){
        super(driver);
    }

    public List<WebElement> getTallProducts(){
        return tallProducts;
    }
}
