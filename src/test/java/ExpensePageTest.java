import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExpensePageTest extends BaseTest {
    @Test

    public void testSubmitExpense() {
        ExpensePage expensePage = new ExpensePage(driver);

        for (int i = 0; i < 3; i++) {

            expensePage.clickType();
            expensePage.selectType("Healthcare");
            expensePage.clickAmount();
            expensePage.setAmount("20");
            expensePage.clickDescription();
            expensePage.setDescription("Vitamins");
            expensePage.clickDate();
            expensePage.clickToday();
            expensePage.clickSubmitButton();

            driver.get("http://localhost:3000/expense");

            // Find the element that you want to scroll to
             WebElement createNewButton = driver.findElement(By.xpath("//button[normalize-space()='Create new']"));

             // Create an instance of the JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll the page to the element
            js.executeScript("arguments[0].scrollIntoView();", createNewButton);

        //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Create new']")));

            createNewButton.click();
        }
    }
}

