package com.mychelantonacio.cqdb.uitest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

/*
This test is related to TC001
 */

public class GetSampleQuestion {
    public static void main(String[] args) throws InterruptedException {

        //Set up testing environment
        //Insert your user path
        System.setProperty("webdriver.chrome.driver","C:/Users/[user]/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://codingquestionsdb.com/");

        //Find Try First button
        WebElement button = driver.findElement(By.id("get-question"));

        //Test case - get two questions
        for (int i = 0; i < 2; i++) {
            button.click();
            Thread.sleep(10000);

            button.click();
            Thread.sleep(10000);
        }

        //Closes Chrome browser
        driver.quit();
    }
}