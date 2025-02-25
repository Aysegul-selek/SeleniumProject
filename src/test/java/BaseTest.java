import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    PracticesFormPage practicesFormPage;

    @BeforeAll
    public  void Setup(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ayseg\\Desktop\\demo-automaton-test-1\\drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://demoqa.com/automation-practice-form");
   practicesFormPage=new PracticesFormPage(driver);
    }

}
