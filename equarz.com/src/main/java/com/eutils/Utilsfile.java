package com.eutils;

import com.ebase.Testbase;
import com.epageobjects.Homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class Utilsfile extends Testbase {
   private static final String filepath="./src/main/java/com/etestdata/sigup.xlsx";

	public  static String[][] readdata(String sheetname) throws Throwable {

		File file = new File("./src/main/java/com/etestdata/sigup.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet(sheetname);

		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < columns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		return data;
	}

	public static Homepage  dropdown(WebElement value, String text)
	{		
		Select sel = new Select(value);
	    sel.selectByValue(text);
	    return new Homepage();
	}
	public static void takescreenshotatendoftest() throws IOException {
		File scrfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrfile, new File(currentDir + "/Screenshot/" + System.currentTimeMillis()+  ".png" ));
		
	}

	}

	
	
	
	

