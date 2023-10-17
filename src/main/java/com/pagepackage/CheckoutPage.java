package com.pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
WebDriver driver;

By shoppingcart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a");
By checkout=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");

By newaddress=By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input");

By billingfname=By.xpath("//*[@id=\"input-payment-firstname\"]");
By billinglname=By.xpath("//*[@id=\"input-payment-lastname\"]");
By billingaddress=By.xpath("//*[@id=\"input-payment-address-1\"]");
By billingcity= By.xpath("//*[@id=\"input-payment-city\"]");
By billingpostcode=By.xpath("//*[@id=\"input-payment-postcode\"]");
By billingcountry=By.xpath("//*[@id=\"input-payment-country\"]");
By billingstate=By.xpath("//*[@id=\"input-payment-zone\"]");
By billingcontinue=By.xpath("//*[@id=\"button-payment-address\"]");

By deliverycontinue=By.xpath("//*[@id=\"button-shipping-address\"]");
By methodcontinue=By.xpath("//*[@id=\"button-shipping-method\"]");

By cashondelivery=By.xpath("//input[@value='cod']");
By terms=By.xpath("//input[@name='agree']");
By paymentcontinue=By.xpath("//*[@id=\"button-payment-method\"]");

By confirmorder=By.xpath("//*[@id=\"button-confirm\"]");

By orderdone=By.xpath("//*[@id=\"content\"]/div/div/a");

public CheckoutPage(WebDriver driver) {
	this.driver=driver;
}

public void checkingout() {
    driver.findElement(shoppingcart).click();
	driver.findElement(checkout).click();
}
public void billingdetails(String fname, String lname, String address, String city, String postcode, String country, String state) {
	
	driver.findElement(newaddress).click();
	driver.findElement(billingfname).sendKeys(fname);
	driver.findElement(billinglname).sendKeys(lname);
	driver.findElement(billingaddress).sendKeys(address);
	driver.findElement(billingcity).sendKeys(city);
	driver.findElement(billingpostcode).sendKeys(postcode);
	
	WebElement con=driver.findElement(billingcountry);
	Select sc=new Select(con);
	sc.selectByValue(country);
	
	WebElement region=driver.findElement(billingstate);
	Select se=new Select(region);
	se.selectByValue(state);
	
	driver.findElement(billingcontinue).click();
}

public void deliverydetails() {
	driver.findElement(deliverycontinue).click();
	
	driver.findElement(methodcontinue).click();
}

public void paymentmethod() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(cashondelivery));
	driver.findElement(cashondelivery).click();
	
	WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.presenceOfElementLocated(terms));
	driver.findElement(terms).click();
	
	driver.findElement(paymentcontinue).click();
	
	driver.findElement(confirmorder).click();
	
	driver.findElement(orderdone).click();
	
}
}
