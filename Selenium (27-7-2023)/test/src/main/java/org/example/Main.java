package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends Thread{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:4200/sign-in");
        WebElement mail =  driver.findElement(By.id("username"));
        mail.click();
        mail.sendKeys("himavanthp@stgit.com");
        WebElement pass =  driver.findElement(By.id("password"));
        pass.sendKeys("Hima^1557");
//        pass.sendKeys(Keys.ENTER);

        try {
           sleep(10000);
        }catch(Exception e){
            System.out.println("oops");
        }

        // Navigate to the website and perform actions (add your test steps here)

        // Close the browser after the test
        driver.quit();
    }
}