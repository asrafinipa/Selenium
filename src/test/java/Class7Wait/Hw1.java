package Class7Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hw1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        driver.findElement(By.xpath("//input[@value='Option-1']")).click();
    }

}
