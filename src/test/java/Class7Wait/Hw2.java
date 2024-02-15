package Class7Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        //click on the display button
        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        //click on the enable button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-body']/button[1]"))).click();

        //click on the display enable button
        driver.findElement(By.xpath("//button[@id='enable_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default' and text()='Button' ]"))).click();

        //click on the checkbox
        driver.findElement(By.xpath("//button[@id='checkbox_button' ]")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox' ]")));
        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox' ]")).isSelected());







    }
}
