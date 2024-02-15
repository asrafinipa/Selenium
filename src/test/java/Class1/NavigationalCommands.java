package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        // initiate the instance of webDriver
        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //facebook.com
        driver.navigate().to("https://www.fb.com");
        driver.navigate().back();//going back to google
        Thread.sleep(2000);
        driver.navigate().forward();// going forward to facebook
        // refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.close();










    }
}
