import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticesFormPage {
    private WebDriver driver;
    private  final By name= By.id("firstName");
    private  final  By lastName= By.id("lastName");
    private  final  By email= By.id("userName");

    public PracticesFormPage(WebDriver driver){
        this.driver=driver;
    }
    public void setName(String nameAsString){
        WebElement nameSpace=driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);
    }
    public void setLastSurName(String lastSurNameAsString){
        WebElement nameSpace=driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(lastSurNameAsString);
    }
    public void setEmail(String mailAddress){
        WebElement nameSpace=driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(mailAddress);
    }


}
