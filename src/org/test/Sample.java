package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	public static void main(String[] args)
	 {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarna\\eclipse-workspace\\swarna\\selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
	 
		WebElement txtUserName = d.findElement(By.id("email"));
		txtUserName.sendKeys("ammu");
		
		WebElement txtPass = d.findElement(By.id("pass"));
		txtPass.sendKeys("12345");
		
		WebElement btnLogin = d.findElement(By.id("u_0_b"));
		btnLogin.click();
		
		d.quit();
	
	 }
}
