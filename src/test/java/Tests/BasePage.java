package Tests;

import Tests.RunTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    public static String baseUrl = "https://www.ucuzabilet.com/";

    @BeforeTest
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/testinium/Desktop/Gökhan/ProjectSelenium/UcuzaBilet/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to(baseUrl);

    }


    @AfterTest
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
