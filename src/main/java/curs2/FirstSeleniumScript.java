package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumScript {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "D:\\autotest2\\cursSelenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://keybooks.ro");
        driver.manage().window().maximize();

    }

    @Test
    public  void test1() throws InterruptedException {

        String webPageTitle = driver.getTitle();
        String sloganText = driver.findElement(By.className("logo_slogan")).getText();
        System.out.println(sloganText);


    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
