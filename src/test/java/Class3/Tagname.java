package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
