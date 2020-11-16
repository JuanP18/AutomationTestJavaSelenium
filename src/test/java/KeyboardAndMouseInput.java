import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));

        // this is to select the field before send keys.
        name.click();
        // this writes the message to the input field.
        name.sendKeys("Juan Pablo");

        // button element
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
