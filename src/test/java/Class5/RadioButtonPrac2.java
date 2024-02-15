package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonPrac2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://designsystem.digital.gov/components/radio-buttons/");
        Thread.sleep(2000);
       List<WebElement>radiobts= driver.findElements(By.xpath("//label[@class='usa-radio__label']"));
       for (WebElement radio:radiobts){
           String historicalOpt=radio.getAttribute("for");
           if (historicalOpt.equals("historical-washington")){
               radio.click();

               String text= radio.getText();
               System.out.println(text);//i want to get the historical radio button text printed on console
               break;

           }

       }

    }
}
