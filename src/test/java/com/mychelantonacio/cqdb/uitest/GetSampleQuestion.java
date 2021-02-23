package com.mychelantonacio.cqdb.uitest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class GetSampleQuestion {
    public static void main(String[] args) throws InterruptedException {

        //Set up testing environment
        System.setProperty("webdriver.chrome.driver","/Users/Kät/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://codingquestionsdb.com/");

        WebElement button = driver.findElement(By.id("get-question"));

        //Test case - get two questions
        for (int i = 0; i < 2; i++) {
            button.click();
            Thread.sleep(30000);

            button.click();
            Thread.sleep(30000);
        }

        driver.quit();
    }
}