package Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        //wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        enableBtn.click();

// another way of above
        WebElement element=driver.findElement(By.xpath("//button[text()='Enabled']"));
        wait.until(ExpectedConditions.visibilityOf(element));


    }
}
