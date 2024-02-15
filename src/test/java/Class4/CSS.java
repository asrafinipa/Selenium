package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        Thread.sleep(4000);
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");
        driver.findElement(By.cssSelector("input#profileBox")).sendKeys("abcdef");

        driver.findElement(By.cssSelector("input.form-control.feedbackBox1")).sendKeys("hello abc");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[name*='contentInput']")).sendKeys("selenium");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name^='IntroInput556']")).sendKeys("blabla");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name$='Input']")).sendKeys("hurray");


    }
}
