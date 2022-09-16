package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ani {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Eclipse\\MavenProject\\mave\\mvn.xlsx");
		FileInputStream inputstream = new FileInputStream(f);
		
Workbook w=new XSSFWorkbook(inputstream);
Sheet sheet = w.getSheet("Sheet1");
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
for (int i = 0; i <physicalNumberOfRows; i++) {
	Row row = sheet.getRow(i);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	for (int j = 0; j <physicalNumberOfCells; j++) {
		Cell cell = row.getCell(j);
		System.out.println(cell);
	}

Sheet createSheet = w.createSheet("ANITHA");
Row createRow = createSheet.createRow(0);
Cell createCell = createRow.createCell(0);
	createCell.setCellValue("chennai");
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	System.out.println("done");
				}
			}	}
