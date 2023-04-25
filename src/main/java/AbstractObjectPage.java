import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractObjectPage {

    protected WebDriver driver;

    public AbstractObjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
