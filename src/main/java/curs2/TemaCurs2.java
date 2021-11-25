package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TemaCurs2 {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "D:\\autotest2\\cursSelenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://keybooks.ro/");
        driver.manage().window().maximize();

    }

    @Test
    public void openLoginForm(){
        checkLoginFieldsAreDisplayed(false);

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        checkLoginFieldsAreDisplayed(true);
    }

    public void checkLoginFieldsAreDisplayed(boolean isDisplayed){
        assertEquals(driver.findElement(By.xpath("//input[@id='log']")).isDisplayed(), isDisplayed);
        assertEquals(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed(), isDisplayed);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
