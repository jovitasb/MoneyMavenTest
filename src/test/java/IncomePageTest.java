import org.junit.jupiter.api.Test;

public class IncomePageTest extends BaseTest {
    //    private WebDriver driver;
//    private IncomePage incomePage;
    @Test

    public void testSubmitIncome() {

        IncomePage incomePage = new IncomePage(driver);
        incomePage.clickAmount();
        incomePage.setAmount("1000");
        incomePage.clickDescription();
        incomePage.setDescription("Salary");
        incomePage.clickDate();
        incomePage.clickToday();
        incomePage.clickSubmitButton();
        // assert that the income is added successfully
    }

    @Test
    public void testSubmitIncomeWithInvalidData() {

        IncomePage incomePage = new IncomePage(driver);
        incomePage.clickAmount();
        incomePage.setAmount("");
        incomePage.clickDescription();
        incomePage.setDescription("Bonus");
        incomePage.clickDate();
        incomePage.clickToday();
        incomePage.clickSubmitButton();
        //    assert that the income is not added due to invalid data
    }
}

