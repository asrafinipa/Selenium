package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //click on the radio button if it's selected or not and print the selection on the console
        //find the checkbox
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio' ]"));
//        click on it
        radioButton.click();
        if (radioButton.isSelected()) {
            System.out.println("button selected and clicked");
        } else {
            System.out.println("not selected and hasn't been clicked");

        }
        // find all the radio buttons(write down the locator in such a way it selects all desired elements
        // get them in a lists
        // select the age
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radio : radioBtns) {
            String option = radio.getAttribute("value");
            if (option.equals("15 - 50")) {
                radio.click();
                break;
            }


        }
    }
}
