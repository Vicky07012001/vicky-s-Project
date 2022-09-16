package org.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajith {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		
		
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("(//*[text()='Select Product Type'])[1]")).click();
		List<WebElement> lis = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(lis.size());
		//*[@id="onetrust-accept-btn-handler"]
		for (WebElement webElement : lis) {
			if (webElement.getText().equalsIgnoreCase("Cards")) {
				webElement.click();
				break;
				
			}
		}
		
		
		
		
		
		
	}

}
