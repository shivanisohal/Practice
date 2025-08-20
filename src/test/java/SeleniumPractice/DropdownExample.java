package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login"); // replace with your URL
// Locate drop-down element
        WebElement countryDropdown = driver.findElement(By.id("day"));
// Create Select object
        Select select = new Select(countryDropdown);
// 1. Select by Visible Text
        select.selectByVisibleText("2");
// 2. Select by Value
        select.selectByValue("7");
// 3. Select by Index (0 = first option)
        select.selectByIndex(2);
// Get all options
        System.out.println("Available options:");
        for (WebElement option : select.getOptions()) {
            System.out.println(option.getText());
        }
// Get selected option
        System.out.println("Currently selected: " + select.getFirstSelectedOption().getText());
        driver.quit();
    }
}

