package Class10Webcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php");
        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='image-file']"));
//        please place your own file path in here
        uploadFile.sendKeys("C:\\Nipa_Selenium\\download.jpg");
    }
}
