package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownNoSlelectTag {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        //find a dropdown and perform a click operation
        WebElement dd = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dd.click();
        //find all the options and select your desired destinations
        List<WebElement>options= driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
       //ul[@class='dropdown-menu']/li/a
        for (WebElement option:options){
          String OptionText= option.getText();
          if (OptionText.equals("japan")){
              option.click();
          }
        }
        /*
        1.we need to see if select tag is there-----yes----Select class from selenium
        a. Find the dropdown using a locator
        b. Select sel = new Select(WebElemnt dropDown)
        .selectByindex()
        .selectby value;
        selectbyvisible text
        if i want to check that the dd is multislect
        .is multiple();
        with mu
         */









    }
}
