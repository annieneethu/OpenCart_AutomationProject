package com.testpackage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.basepackage.Baseclass;
import com.pagepackage.AddToCartPage;
import com.pagepackage.CheckoutPage;
import com.pagepackage.LoginPage;

public class OpenCartTest extends Baseclass{

@Test
public void test1() {
	
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	LoginPage ob=new LoginPage(driver);
	ob.loginclick();
	ob.logging("anamikajosh23@gmail.com", "anamikajosh@2023");

	AddToCartPage ob1=new AddToCartPage(driver);
	ob1.addingtocart("16");
	
	CheckoutPage ob2=new CheckoutPage(driver);
	ob2.checkingout();
	ob2.billingdetails("Anamika", "Josh", "church street", "Coimbatore", "709802", "99", "1503");
	ob2.deliverydetails();
	ob2.paymentmethod();
}
}
