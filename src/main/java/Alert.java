import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(5000);
    }

    @Test
    public void alterTest() throws InterruptedException {
        driver.findElement(By.name("cusid")).sendKeys("071083");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(200);
        driver.switchTo().alert();
        String message =  driver.switchTo().alert().getText();
        System.out.println(message);
        driver.switchTo().alert().accept();
        String message1 =  driver.switchTo().alert().getText();
        System.out.println(message1);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }

}