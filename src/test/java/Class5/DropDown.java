package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        /*
        check if the dropdown has a select tag
        if yes!!
        then u can select class from selenium to deal with it.
        1. find the drop down ...........using locator
        2. declare the object of select class and in the parameter pass the webElement

        Select sel= new Select(WebElement);
        sel.selectByIndex();
        sel.selectByValue();
        sek.selectByVisibleText();

         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the dropdown

        WebElement dd = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //use select class
        Select sel=new Select(dd);

        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("Sunday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");
        //multiselect dropdown
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        // select class
        Select Sel1=new Select(dropdown);

        //whether the dropdown is multi select or not
        System.out.println("the drop down is multiselect"+Sel1.isMultiple());

        Sel1.selectByValue("New York");

        Sel1.selectByVisibleText("Florida");
        Thread.sleep(2000);
        Sel1.deselectByValue("New York");
































    }
}
