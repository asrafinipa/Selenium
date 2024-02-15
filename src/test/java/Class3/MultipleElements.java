package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        //get all the links from ebay.com print on the console
        List<WebElement>allLinks= driver.findElements((By.tagName("a")));
        for (WebElement link:allLinks){
            //extract the text from the webElement
            String text=link.getText();
            //extract the link from the webElement
            String linkAddress= link.getAttribute("href");
            System.out.println(linkAddress);
        }

    }
}
