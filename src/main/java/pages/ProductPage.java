package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//button[@data-test-id='add-button']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//div[@class='_10AVfLf _23LM9fc']")
    private WebElement addToBagPopup;

    @FindBy(xpath = "//a[@class='_24SZgSx _6DZZlcW']")
    private WebElement mainPageButton;

    public ProductPage(WebDriver driver) {super(driver);}

    public void clickAddToBagButton(){
        addToBagButton.click();
    }

    public boolean isAddToBagPopupVisible(){
        return addToBagButton.isDisplayed();
    }

    public WebElement getAddToBagPopup(){
        return addToBagPopup;
    }

    public void clickMainPageButton(){
        mainPageButton.click();
    }
}
