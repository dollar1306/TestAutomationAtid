package TheEnvironment_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Objects;

public class Drivers_Methods_Exercise {

    @Test
    public void test_1(){
        String urlName = "https://www.imdb.com/";
        String urlTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");

        driver.navigate().refresh();

        assert Objects.equals(urlTitle, driver.getTitle());
        assert Objects.equals(urlName, driver.getCurrentUrl());

        driver.quit();
    }

    @Test
    public void test_2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.bing.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println(driver.getTitle());
        if(driver.getPageSource().contains("bubble"))
            System.out.println("Exists");
        else
            System.out.println("Not Exists");
        driver.quit();
    }

}
