package UtlityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	static Sheet mySheet;
	
// public static void getScreenshot(WebDriver driver,int TCID) throws IOException
// {
//	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 File dest=new File("D:\\Screenshot\\TC"+TCID+"KiteScreenshot.png");
//	 FileHandler.copy(src,dest);
//	 Reporter.log("Screenshot is taken for TC"+TCID,true);
// }
 
 public static  String readDataFromExcel(String sheetNo,int rowIndex,int columnIndex ) throws EncryptedDocumentException, IOException
 {
     FileInputStream myFile= new FileInputStream("D:\\Excel\\Book1.xlsx");
     mySheet = WorkbookFactory.create(myFile).getSheet(sheetNo);
     String value = mySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	 return value;
 }
 
}
