package com.pagepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

By myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
By clicklogin= By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
By email= By.id("input-email");
By pass= By.id("input-password");
By login= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

public LoginPage(WebDriver driver) {
	this.driver=driver;
}

public void loginclick() {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(myaccount).click();
	driver.findElement(clicklogin).click();
}

public void logging(String emailid, String password) {
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(pass).sendKeys(password);
	driver.findElement(login).click();
}
}
