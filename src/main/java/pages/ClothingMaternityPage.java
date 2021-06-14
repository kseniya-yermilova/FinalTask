package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClothingMaternityPage extends BasePage {

    @FindBy(xpath = "//div[@class='_3J74XsK']//p")
    private List<WebElement> tallProducts;

    public ClothingMaternityPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getTallProducts() {
        return tallProducts;
    }

}
