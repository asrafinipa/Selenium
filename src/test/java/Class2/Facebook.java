package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
      WebElement newAccount=driver.findElement(By.linkText("Create new account"));
      newAccount.click();
      Thread.sleep(2000);

      WebElement fname=driver.findElement(By.name("firstname"));
      Thread.sleep(2000);
      fname.sendKeys("fahmida");
      WebElement lName=driver.findElement(By.name("lastname"));
        Thread.sleep(2000);
      lName.sendKeys("fahmida");
      WebElement email= driver.findElement(By.name("reg_email__"));
        Thread.sleep(2000);
      email.sendKeys("abcdefgh@yahoo.com");
      WebElement password= driver.findElement(By.id("password_step_input"));
        Thread.sleep(2000);
       password.sendKeys("123456ae");

        Thread.sleep(2000);
        driver.quit();
    }
}
