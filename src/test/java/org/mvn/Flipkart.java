package org.mvn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Flipkart extends Apple {
	static PomProject l;

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@BeforeClass
	public void browselaunch() {
		chromelaunch("https://www.flipkart.com/");
		PomProject l = new PomProject();

	}
	@Test
	public void testcase1() {

		
		
	}
	
	
	
	
	
	
	

}
