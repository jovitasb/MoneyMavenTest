import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpensePageTest extends BaseTest {
    @Test

    public void testSubmitExpense() {
        ExpensePage expensePage = new ExpensePage(driver);

        for (int i = 0; i < 10; i++) {

            expensePage.clickType();
            expensePage.selectType("Presents");
            expensePage.clickAmount();
            expensePage.setAmount("1000");
            expensePage.clickDescription();
            expensePage.setDescription("Presents for developers");
            expensePage.clickDate();
            expensePage.clickToday();
            expensePage.clickSubmitButton();

            driver.get("http://localhost:3000/expense");
            WebElement createNewButton = driver.findElement(By.xpath("//button[normalize-space()='Create new']"));
            createNewButton.click();

            // assert that the expense is added successfully
        }
    }
}

