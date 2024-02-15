package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathTry {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("abcdef");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Click Here']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]")).sendKeys("whats up");
        Thread.sleep(4000);
        WebElement Partial=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));
        String text =Partial.getText();
        System.out.println(text);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]")).sendKeys("123 456");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]")).sendKeys("hello@yahoo.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='customField' and @class='form-control']")).sendKeys("im good");



    }

}
