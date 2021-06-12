package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//input[@name='Username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@class='qa-password-textbox']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signin']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='EmailAddress-error']")
    private WebElement emailError;

    @FindBy(xpath = "//span[@id='Password-error']")
    private WebElement passwordError;

    @FindBy(xpath = "//a[@class='qa-forgot-password adobeTrackedButton']")
    private WebElement forgotPasswordButton;

    public SignInPage(WebDriver driver) {super(driver);}

    public boolean isEmailFieldVisible(){
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible(){
        return passwordField.isDisplayed();
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public boolean isEmailErrorVisible(){
        return emailError.isDisplayed();
    }

    public boolean isPasswordErrorVisible(){
        return passwordError.isDisplayed();
    }

    public boolean isForgotPasswordVisible(){
        return forgotPasswordButton.isDisplayed();
    }

    public void clickForgotPasswordButton(){
        forgotPasswordButton.click();
    }
}
