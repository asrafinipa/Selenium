package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearchBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get ("https://www.google.com");
        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("books");

    }
}
