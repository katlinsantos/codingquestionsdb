package com.mychelantonacio.cqdb.uitest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SendEmail {
    public static void main(String[] args) throws InterruptedException {

        //Set up testing environment
        System.setProperty("webdriver.chrome.driver","C:/dev/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://codingquestionsdb.com/");

        WebElement button = driver.findElement(By.id("contact"));
        button.click();
        Thread.sleep(30000);

        driver.quit();
    }
}
