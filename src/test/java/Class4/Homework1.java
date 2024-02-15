package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        Thread.sleep(4000);

        WebElement textBox1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        textBox1.sendKeys("Pride and prejudice");
        WebElement textBox2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        textBox2.sendKeys("Harry potter");
        WebElement textBox3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        textBox3.sendKeys("The Vinci code");
        Thread.sleep(4000);

        WebElement txtBox1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        txtBox1.sendKeys("The Vinci code");
        WebElement txtBox2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        txtBox2.sendKeys("Harry potter");
        WebElement txtBox3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        txtBox3.sendKeys("Pride and Prejudice");
        Thread.sleep(4000);

        WebElement granParent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        granParent.sendKeys("grandparent");
        WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("parent");
        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child");



    }
}
