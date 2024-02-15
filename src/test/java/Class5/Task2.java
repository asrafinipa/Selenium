package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        //click on enable checkboxes and select checkbox 1 and 4

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        //Thread.sleep(2000);
        WebElement Enablecheckbox=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        Enablecheckbox.click();
        //Thread.sleep(4000);
       List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
       for (WebElement checkBox:checkboxes){
           String S=checkBox.getAttribute("value");
           if (S.equals("Checkbox-1") || S.equals("Checkbox-4")){
               checkBox.click();


           }
       }
    }
}
