import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1
{
        WebDriver driver;

        @BeforeMethod
        void setup(){
            System.setProperty("webdriver.gecko.driver", "/Users/machd/Downloads/geckodriver");
            driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://wwww.google.com/");
        }

        @Test
        public void googleTitle() {
            String  title =driver.getTitle();
            System.out.println(title);
        }

        @Test
        public void googleLogo() {
            boolean b=	driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();

        }

        @Test
        public void mailinkTest() {
            boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
            driver.quit();

        }
}
