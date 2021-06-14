package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedItemsPage extends BasePage {

    @FindBy(xpath = "//div[@class='itemCount_3vWat']")
    private WebElement amountOfItems;

    public SavedItemsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAmountOfItems() {
        return amountOfItems;
    }

    public String getAmountOfSavedItems() {
        return amountOfItems.getText();
    }
}
