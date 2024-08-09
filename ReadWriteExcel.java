package selenium_Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.eval.UnaryMinusEval;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.Table.Cell;

import bsh.classpath.BshClassPath.AmbiguousName;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException {
		// TODO Auto-generated method stub

		//		File file = new File("C:\\Users\\karthikmo\\Documents\\Johnty's Tutorial\\ReadWriteExcel.xlsx");
		//
		//		FileInputStream stream = new FileInputStream(file);
		//
		//		Workbook ws = new XSSFWorkbook(stream);
		//
		//		Sheet sheet=ws.getSheet("Selenium");
		//
		//		Row rw= sheet.getRow(0);
		//		org.apache.poi.ss.usermodel.Cell cell = rw.getCell(1);
		//
		//		String  Username =  cell.toString();
		//		System.out.println(Username);
		//		Row  rw2 = sheet.getRow(1);
		//
		//		org.apache.poi.ss.usermodel.Cell cell2 =   rw2.getCell(1);
		//
		//		String pwd =  cell2.toString();
		//		System.out.println(pwd);

		//	int totalRows =	sheet.getPhysicalNumberOfRows();
		//		
		//	 Row  row = sheet.getRow(0);
		//	
		// int totalCells = row.getPhysicalNumberOfCells();
		//	 System.out.println(row.toString());
		//	System.out.println(totalCells.toString);

		//	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		//		
		//		Row row = sheet.getRow(i);
		//		
		//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		//			
		//		org.apache.poi.ss.usermodel.Cell cell =  row.getCell(j);
		//			
		//		System.out.println(cell.toString());
		//		
		//		}
		//	}
		File file2 = new File("C:\\Users\\karthikmo\\Documents\\Johnty's Tutorial\\ReadWriteExcel2.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet sheet1 =	 wb.createSheet("creation");

		Row row = sheet1.createRow(0);
		Row row1 =sheet1.createRow(1);

		org.apache.poi.ss.usermodel.Cell  cell1 =  row.createCell(0);
		org.apache.poi.ss.usermodel.Cell cells =   row1.createCell(0);

		cell1.setCellValue("Admin");
		cells.setCellValue("admin123");


		FileOutputStream sh = new FileOutputStream(file2);

		wb.write(sh);

		Workbook readWb = new XSSFWorkbook(file2);

		Sheet sheet2 =	readWb.getSheet("creation");

		Row row4 =  sheet2.getRow(0);
		org.apache.poi.ss.usermodel.Cell uncell =  row4.getCell(0);

		String orhrmUName = uncell.toString();

		Row row2 = sheet2.getRow(1);
		org.apache.poi.ss.usermodel.Cell pwdcell =  row2.getCell(0);

		String string = pwdcell.toString();

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		WebElement user = Driver.findElement(By.xpath("//input[@placeholder='Username']"));

		WebElement	Passw = Driver.findElement(By.xpath("//input[@type=\"password\"]"));


		//user.click();
		user.sendKeys(orhrmUName);

//		Passw.sendKeys(orhrmpwd);

		Driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();







	}
}
