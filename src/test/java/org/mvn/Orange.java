package org.mvn;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Orange extends Apple {
	static PomProject p;
	static Sheet getsheet;

	@AfterClass
	public static void tearDown() {
		// driver.quit();
	}

	@BeforeClass
	public static void launch() throws IOException {

		chromelaunch("https://adactinhotelapp.com/");
		p = new PomProject();

	}

	@Test
	public void tc1() throws IOException {
		getsheet = getsheet("D:\\Eclipse\\MavenProject\\exceldata\\something.xlsx", " my details");
		p.getSearch().sendKeys(exelreed(getsheet, 0, 0));
		p.getAs().sendKeys(exelreed(getsheet, 0, 1));
		p.getLoc().click();

	}

	@Test
	public void tc2() throws IOException {
		SelectMethod(p.getPlace(), "value", 0, "Sydney");
		SelectMethod(p.getHotel(), "value", 0, "Hotel Sunshine");
		SelectMethod(p.getRoom(), "value", 0, "4");
		SelectMethod(p.getAdultroom(), " value", 0, "3 - Three");
		p.getClickbtn().click();

	}

	@Test
	public void tc3() throws IOException {
		p.getRadiobtn().click();
		p.getCntinue().click();
	}

	@Test
	public void tc4() {
		p.getFname().sendKeys("vicky");
		p.getLname().sendKeys("vignesh");
		p.getAddress().sendKeys("chennai");
		p.getCnmber().sendKeys("1234567890098765");
	}

	@Test
	public void tc5() {
		SelectMethod(p.getCctype(), "value", 0, "AMEX");
		SelectMethod(p.getMonth(), "value", 0, "5");
		SelectMethod(p.getYear(), "value", 0, "2014");
		p.getCcvv().sendKeys("987654321");
		p.getFinish().click();

	}

	@Before
	public void startime() {
		Date date = new Date();
		System.out.println("start time" + date);

	}

	@After
	public void endtime() throws InterruptedException {
		Date date = new Date();
		System.out.println("end time" + date);
		// driver.navigate().refresh();
		Thread.sleep(3000);
	}

}
