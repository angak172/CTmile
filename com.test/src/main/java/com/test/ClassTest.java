package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTest {
@Test
public void StartBrowser(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath(""));
driver.findElement(By.id(""));

}

}
