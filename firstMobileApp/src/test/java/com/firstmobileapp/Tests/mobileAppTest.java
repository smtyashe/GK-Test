package com.firstmobileapp.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.firstmobileApp.MobileApp;

public class mobileAppTest extends MobileApp{

		@Test
		public void testCalculator() throws Exception {
			// locate the Text on the calculator by using By.name()
			WebElement two = driver.findElement(By.name("2"));
			two.click();
			WebElement plus = driver.findElement(By.name("+"));
			plus.click();
			WebElement four = driver.findElement(By.name("4"));
			four.click();
			WebElement equalTo = driver.findElement(By.name("="));
			equalTo.click();
			// locate the edit box of the calculator by using By.tagName()
			WebElement results = driver.findElement(By.tagName("EditText"));
			// Check the calculated value on the edit box
			assert results.getText().equals("6") : "Actual value is : "
					+ results.getText() + " did not match with expected value: 6";

		}
}
