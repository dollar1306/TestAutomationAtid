package TheEnvironment_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {

    @Test
    public void test_1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("\n\nURL is :" + driver.getCurrentUrl());
        System.out.println("Title is :" + driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
