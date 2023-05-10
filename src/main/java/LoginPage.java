import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractObjectPage{
        private By usernameInput = By.xpath("//input[@name='username']");
        private By passwordInput = By.xpath("//input[@name='password']");
        private By loginButton = By.cssSelector("button[type='submit']");
        //private By errorMessage = By.id("error-message");

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void clickUsername(){
            WebElement usernameField = driver.findElement(usernameInput);
            usernameField.click();

        }
        public void setUsername(String username) {
            WebElement usernameField = driver.findElement(usernameInput);
            usernameField.sendKeys(username);
        }

    public void clickPassword(){
        WebElement passwordField = driver.findElement(passwordInput);
        passwordField.click();

    }
        public void setPassword(String password) {
            WebElement passwordField = driver.findElement(passwordInput);
            passwordField.sendKeys(password);
        }

        public void clickLoginButton() {
            WebElement loginBtn = driver.findElement(loginButton);
            loginBtn.click();
        }

//        public String getErrorMessage() {
//            WebElement errorMessage = driver.findElement(this.errorMessage);
//            return errorMessage.getText();
//        }
    }


