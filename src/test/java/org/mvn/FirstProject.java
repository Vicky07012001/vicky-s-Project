package org.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProject {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.instagram.com/accounts/login/");
		driver.findElement(By.name( "username")).sendKeys(  "vicky");
		driver.findElement(By.name( "password")).sendKeys( "12345");
	//	driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		
		
		
		
		
		
	}

}
