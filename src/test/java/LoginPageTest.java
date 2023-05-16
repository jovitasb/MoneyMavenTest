import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTest extends BaseTest{
        @Test
        public void testLoginWithValidCredentials() {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.clickUsername();
            loginPage.setUsername("test");
            loginPage.clickPassword();
            loginPage.setPassword("test..");
            loginPage.clickLoginButton();

            String expectedUrl = "http://localhost:3000/";
            String actualUrl = driver.getCurrentUrl();
            assertEquals(expectedUrl, actualUrl);
        }

//        @Test
//        public void testLoginWithIncorrectPassword() {
//            LoginPage loginPage = new LoginPage(driver);
//            driver.get("http://localhost:3000/");
//
//            loginPage.setUsername("test2");
//            loginPage.setPassword("test222");
//            loginPage.clickLoginButton();
//
//            String expectedErrorMessage = "Invalid email or password";
//            String actualErrorMessage = loginPage.getErrorMessage();
//            assertEquals(expectedErrorMessage, actualErrorMessage);
//        }
    }


