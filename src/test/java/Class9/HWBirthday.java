package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static Utils.CommonMethods.selectFromDropDown;

public class HWBirthday {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        selectFromDropDown(month,"Oct");
        WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectFromDropDown(year,"1930");
        List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:dates)
            if (day.getText().equals("19")){
                day.click();
            }





    }

}
