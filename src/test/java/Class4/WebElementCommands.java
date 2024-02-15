package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
        WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
        //clear the text from the element
         textBox.clear();
        textBox.sendKeys("Welcome");
        WebElement option1= driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        boolean stateofOp1=option1.isSelected();
        if (!stateofOp1){
            option1.click();
        }
        //print out the state of the option1
        System.out.println("the state of option is selected "+option1.isSelected());

        //to check if the option2 is enabled or not enabled
        WebElement option2= driver.findElement(By.xpath("//input[@value='option2']"));
        boolean enabled=option2.isEnabled();
        if (enabled){
            System.out.println("the option is enabled and can be selected");
        }else{
            System.out.println("the option2 is not enabled and not clickable");
        }
        //check is option 3 is displayed or not
        // print the status on the console

        WebElement option3= driver.findElement(By.xpath("//input[@value='option3']"));
        boolean isDisplayedOpt3=option3.isDisplayed();
        if (isDisplayedOpt3){
            System.out.println("the radio button opt3 is displayed");
        }else{
            System.out.println("the radio opt 3 is not displayed");
        }
        WebElement textmsg=driver.findElement(By.xpath("//div[@id='textElement']"));
        String text=textmsg.getText();
        System.out.println(text);

        WebElement attribute=driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));

        String value=attribute.getAttribute("id");
        System.out.println(value);
        ////input[@id='favourite-book']/following-sibling::input[1] //advanced xpath
        ////input[@id='least-favorite']/preceding-sibling::input[1]
        ////div[@id='familyTree']/child::input[1]//parent child relation
        System.out.println("-----------HW----------");
        driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]")).sendKeys("Harry potter");



    }
}
