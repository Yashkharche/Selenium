package com.cdac.acts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void inputValidation() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");

		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Yashkharche");

		WebElement lastname = driver.findElement(By.id("surname"));
		lastname.sendKeys("Kharcheeeeee");

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("23");

		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");

		WebElement notes = driver.findElement(By.id("notes"));
		notes.sendKeys("Hii I am Yash Kharche from India");

		
		driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]")).click();

		String validationReport = driver.findElement(By.xpath("/html/body/div/ul[1]")).getText();
	
		
		if(validationReport.contains("Valid Input")) {
			System.out.println("passed");
			System.out.println(validationReport);
		}else {
			Assert.assertFalse(true);
			System.out.println(validationReport);
		}
		

		driver.quit();
	}
}