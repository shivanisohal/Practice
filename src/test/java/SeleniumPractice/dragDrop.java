package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class dragDrop {
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement element2=driver.findElement(By.className("ui-droppable"));

        Actions action= new Actions(driver);
        action.clickAndHold(element).moveToElement(element2).release().build().perform();


    }
}
