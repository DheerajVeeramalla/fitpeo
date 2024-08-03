package com.fitpeo.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public String baseUrl="https://www.fitpeo.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
