package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WebElementExample {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "D:\\cursSelenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://keybooks.ro/");
        driver.manage().window().maximize();

    }

    @Test
    public  void test1() throws InterruptedException {

       WebElement email = driver.findElement(By.id("email"));
       email.isEnabled();
       email.click();
       email.sendKeys("TestUser");
       Thread.sleep(4000);

    }



    @Test
    public  void linkTextLocatorExample() throws InterruptedException {

        WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
        booksLink.click();
        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");

    }


//    @Test(dependsOnMethods = "linkTextLocatorExample")
//    public  void partialLinkTextLocatorExample() throws InterruptedException {
//
//        WebElement booksLink = driver.findElement(By.partialLinkText("Cooking "));
//        booksLink.click();
//        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 2px solid red')", productTitle);
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
