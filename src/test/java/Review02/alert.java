package Review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alert {
    public static void main(String[] args) {
        //        initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
//       maximize
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

// click on the button to make the alert appear
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch to the alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("abchderk");
        alert.accept();

    }
}
