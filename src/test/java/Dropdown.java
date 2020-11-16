import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenuButton.click();

        List<WebElement> menuListDropDown = driver.findElements(By.className("dropdown-item"));

        for ( WebElement element: menuListDropDown){
            if(element.getText().equals("Buttons")){
                element.click();
            }
        }

        driver.quit();
    }
}
