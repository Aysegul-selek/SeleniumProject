import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.SysexMessage;

public class Test1 {
    public static void  main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ayseg\\Desktop\\demo-automaton-test-1\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement sendElement=driver.findElement(By.id("userName"));//webelemnt bu şekilde is ile bulunuyor.
        sendElement.click();
        sendElement.sendKeys( "Ayşegül");

        WebElement email=driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys( "aysegul.selek03@gmail.com");

        WebElement currentAddress=driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys( "Afyon, Türkiye");
        WebElement permanentAddress=driver.findElement( By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys( "Afyon, Türkiye");

        WebElement submintButton=driver.findElement(new By.ByCssSelector("button.btn"));
        submintButton.click();

        /// web elementteki text getir
        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
        String name=nameText.getText();
        System.out.println(name);
    }
}
