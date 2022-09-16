package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
                
public class Apple {
	public static WebDriver driver;

	public static void chromelaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);

	}

	public static WebElement element(String type, String locators) {
		WebElement ele = null;
		if (type.equalsIgnoreCase("id")) {
			ele = driver.findElement(By.id(locators));
		} else if (type.equalsIgnoreCase("name")) {

			ele = driver.findElement(By.name(locators));
		} else if (type.equalsIgnoreCase("xpath")) {
			ele = driver.findElement(By.xpath(locators));
		} else if (type.equalsIgnoreCase("LinkText")) {
			ele = driver.findElement(By.linkText(locators));
		} else {
			System.out.println("type not matched");
		}
		return ele;

	}

	public static void SelectMethod(WebElement ele, String type, int index, String value) {
		Select select = new Select(ele);
		if (type.equalsIgnoreCase("index")) {
			select.selectByIndex(index);
		} else if (type.equalsIgnoreCase("value")) {
			select.selectByValue(value);
		} else if (type.equalsIgnoreCase("value")) {
			select.selectByVisibleText(value);
		} else {
			System.out.println("type not matched");
		}

	}

	public static Sheet getsheet(String path, String sheetName) throws IOException {

		File file = new File(path);
		FileInputStream inputstreem = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(inputstreem);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet;

	}

	public static String exelreed(Sheet sheet, int row, int cell) throws IOException {
		String value = "";

		Row row2 = sheet.getRow(row);
		Cell cell1 = row2.getCell(cell);

		CellType celltype = cell1.getCellType();

		switch (celltype) {
		case STRING:

			value = cell1.getStringCellValue();

			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell1)) {

				Date dateCellValue = cell1.getDateCellValue();

				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

				value = format.format(dateCellValue);
			} else {
				double numericCellValue = cell1.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}

		default:
			break;
		}

		return value;

	}

}
