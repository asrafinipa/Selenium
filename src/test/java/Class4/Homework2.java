package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement feedback=driver.findElement(By.cssSelector("input[class='form-control feedbackBox2']"));
        feedback.sendKeys("awesome");
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("hello@yahoo.com");

    }
}
