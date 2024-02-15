package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='Topic']")).sendKeys("hello");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@class='cb1-element']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(animal);
        select.selectByValue("big baby cat");

    }
}
