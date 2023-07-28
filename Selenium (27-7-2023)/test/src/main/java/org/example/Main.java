package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends Thread{
    static void aagu(Long time){
        try {
            sleep(time);
        }catch(Exception e){
            System.out.println("oops");
        }
    }
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:4200");
        WebElement mail =  driver.findElement(By.id("username"));
        WebElement pass =  driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.id("login"));

        mail.click();
        aagu(5000L);
        pass.click();
        aagu(5000L);
        mail.click();
        aagu(5000L);
        button.click();
        aagu(5000L);
        mail.click();

        mail.sendKeys("himavanthp@stgit.com");
        aagu(5000L);
        pass.sendKeys("password");
        aagu(5000L);
        pass.sendKeys(Keys.ENTER);
        aagu(10000L);
        WebElement logout =  driver.findElement(By.id("logout-button"));
        aagu(5000L);
        logout.click();
        aagu(5000L);
        driver.quit();
    }
}