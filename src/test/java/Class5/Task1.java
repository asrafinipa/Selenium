package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    click on enable button and
    check if the male radio button is enabled
    if yes click on it
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        Thread.sleep(2000);
        WebElement EnableButton=driver.findElement(By.xpath("//button[@id='enabledradio']"));
        EnableButton.click();
        Thread.sleep(2000);
        WebElement maleButton= driver.findElement(By.xpath("//input[@value='gender-male' and @name='gender-identity']"));
        maleButton.click();

        if (maleButton.isEnabled()){
            System.out.println("male button enabled and clicked");
        }else {
            System.out.println("not enabled and clicked");
        }
    }
}
