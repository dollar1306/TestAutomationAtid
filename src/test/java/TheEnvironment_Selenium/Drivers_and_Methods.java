package TheEnvironment_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Drivers_and_Methods {

    @Test
    public void test_1_chrome(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://chrome.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
    @Test
    public void test_2_firefox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://firefox.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
