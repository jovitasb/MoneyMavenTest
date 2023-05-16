import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage{
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
            super(driver);
        }
        public void clickUsername(){
            usernameInput.click();

        }
        public void setUsername(String username) {
            usernameInput.sendKeys(username);
        }

    public void clickPassword(){
            passwordInput.click();

    }
        public void setPassword(String password) {
            passwordInput.sendKeys(password);
        }

        public void clickLoginButton() {
            loginButton.click();
        }

//        public String getErrorMessage() {
//            WebElement errorMessage = driver.findElement(this.errorMessage);
//            return errorMessage.getText();
//        }
    }


