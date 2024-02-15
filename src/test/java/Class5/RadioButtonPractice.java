package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement radiobutton= driver.findElement(By.xpath("//button[@id='buttoncheck']"));
        radiobutton.click();
        Thread.sleep(2000);
        WebElement maleButton=driver.findElement(By.xpath("//input[@value='Female']"));
        maleButton.click();
       // WebElement getvalue=driver.findElement(By.xpath("//button[@class='btn btn-default' and @onclick='getValues();']"));
       // getvalue.click();
        List<WebElement> radiobtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radio:radiobtns){
           String option= radio.getAttribute("value");
           if (option.equals("5 - 15")){
               radio.click();

               break;
           }
        }


    }
}
