package com.basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
protected WebDriver driver;

@BeforeTest
public void btest()
{
	driver=new ChromeDriver();
	driver.get("http://opencart.abstracta.us/");
	driver.manage().window().maximize();
}
}

