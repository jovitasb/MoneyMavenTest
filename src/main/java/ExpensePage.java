import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ExpensePage extends AbstractObjectPage {
    private By typeInput = By.xpath("//select[@name='expenseTypeName']");
    private By amountInput = By.name("expenseAmount");
    private By descriptionInput = By.name("expenseDescription");
    private By dateInput = By.cssSelector("button.react-datetime-picker__calendar-button > svg");
    private By todayInput = By.cssSelector(".react-calendar__tile--now");
    private By submitButton = By.xpath("//button[normalize-space()='Submit']");

    public ExpensePage(WebDriver driver) {
        super(driver);
    }


    public void clickType(){
        WebElement typeField = driver.findElement(typeInput);
        typeField.click();
    }

    public void selectType(String s) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='expenseTypeName']"));
        Select select = new Select(dropdown);
        select.selectByIndex(7);
        WebElement selectedOption = select.getFirstSelectedOption();
        selectedOption.click();
    }
    public void clickAmount(){
                WebElement amountField = driver.findElement(amountInput);
        amountField.click();
    }
    public void setAmount(String amount) {
        WebElement amountField = driver.findElement(amountInput);
        amountField.sendKeys(amount);
    }

    public void clickDescription(){
        WebElement descriptionField = driver.findElement(descriptionInput);
        descriptionField.click();
    }
    public void setDescription(String description) {
        WebElement descriptionField = driver.findElement(descriptionInput);
        descriptionField.sendKeys(description);
    }

    public void clickDate(){
        WebElement dateField = driver.findElement(dateInput);
        dateField.click();
    }

    public void clickToday(){
        WebElement todayField = driver.findElement(todayInput);
        todayField.click();
    }

    public void clickSubmitButton() {
        WebElement submitBtn = driver.findElement(submitButton);
        submitBtn.click();
    }
}

