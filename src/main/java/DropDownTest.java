import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-form");
    }

    @Test
    public void dropTest() throws InterruptedException {
        Select s= new Select((driver.findElement(By.id("continents"))));
        s.selectByVisibleText("Asia");
        Thread.sleep(2000);
    }

    @Test
    public void dropTest1() throws InterruptedException {
        Select s= new Select((driver.findElement(By.id("continents"))));
        s.selectByIndex(5);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
