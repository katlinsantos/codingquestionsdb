package com.mychelantonacio.cqdb.uitest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

/*
This test is related to TC002
 */

public class CloseSampleQuestion {
    public static void main(String[] args) throws InterruptedException {

        //Set up testing environment
        //Insert your user path
        System.setProperty("webdriver.chrome.driver","C:/Users/[user]/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://codingquestionsdb.com/");

        //Find Try First button
        WebElement tryfirst = driver.findElement(By.id("get-question"));
        tryfirst.click();
        Thread.sleep(5000);

        //Find Close button
        WebElement close = driver.findElement(By.id("get-question"));
        close.click();
        Thread.sleep(5000);

        //Closes Chrome browser
        driver.quit();
    }
}