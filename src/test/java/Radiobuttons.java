import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // By ID
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        // Css selector
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        // Xpath muestra la ruta para llegar a ese elemento en el DOM y el numero del div en el que se encuentra el input
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}
