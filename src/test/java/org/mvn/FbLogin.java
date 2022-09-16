package org.mvn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FbLogin extends Apple {
	@AfterClass
	private void afterclass() {
		System.out.println("AfterClass");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("end time" );
	}

	@AfterTest
	private void aftertest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	private void aftersuite() {
		System.out.println("AfterSuite");
	}

	@BeforeSuite
	private void beforesuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeClass
	private void beforeclass() {
		chromelaunch("https://www.facebook.com/login/");
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("start time" );
	}

	@BeforeTest
	private void beforetest() {
		System.out.println("BeforeTest");
	}

	@Test
	private void testcase1() {
		element("id", "email").sendKeys("vicky");
		element("id", "pass").sendKeys("7777");
	}

	@Test
	private void testcase2() {
		element("id", "loginbutton").click();
	}

}
