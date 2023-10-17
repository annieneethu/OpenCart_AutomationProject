package com.pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {
WebDriver driver;

By cameraclick =By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
By itemclick=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
By availableOption= By.xpath("//*[@id=\"input-option226\"]");
By addtocart=By.xpath("//*[@id=\"button-cart\"]");


public AddToCartPage(WebDriver driver) {
	this.driver=driver;
}


public void addingtocart(String val) {
	driver.findElement(cameraclick).click();
	driver.findElement(itemclick).click();
	
	WebElement availopt=driver.findElement(availableOption);
	Select sc=new Select(availopt);
	sc.selectByValue(val);
	
	driver.findElement(addtocart).click();
}
}
