import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("nipa");
    }
}
