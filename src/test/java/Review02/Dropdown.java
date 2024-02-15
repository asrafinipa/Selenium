package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        //        initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
//       maximize
        driver.manage().window().maximize();
//        goto fb.com
        driver.get("https://www.fb.com");

//        get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);
//        find the dropdown
        WebElement DD = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel= new Select(DD);
        sel.selectByVisibleText("12");
        System.out.println(sel.isMultiple());

    }
}
