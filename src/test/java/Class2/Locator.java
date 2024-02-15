package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        //find the element input

       WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("abcefghijk@yahoo.com");

// find the element password and send the password
     WebElement password= driver.findElement(By.name("pass"));

     password.sendKeys("123456K");
      WebElement  login=driver.findElement(By.name("login"));
//login.click();

       //WebElement createAccount=  driver.findElement(By.linkText("Create new account"));
      // createAccount.click();
        WebElement createAccount=  driver.findElement(By.partialLinkText("new account"));
        createAccount.click();


    }
}
