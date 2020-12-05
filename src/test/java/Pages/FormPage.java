package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Jhon");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/02/2020");
        // closed  the datepicker
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        // click submit button
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
