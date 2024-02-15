package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathYahoo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");
        Thread.sleep(4000);
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        Thread.sleep(4000);
        for (WebElement links:allLinks){
            String text=links.getText();
            String linkAddress=links.getAttribute("href");
            System.out.println(linkAddress);

        }
    }
}
