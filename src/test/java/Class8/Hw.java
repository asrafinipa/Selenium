package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        int count=1;
        for(WebElement col:ids){

            if(col.getText().equals("103250A")){
                //print the row number
                System.out.println(count);
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (count ) + "]/td[1]"));
                checkbox.click();
                break;
            }
            count++;

        }

    }
}
