package UtilityPackageMMT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityclassMMT 
{
public static String getDataFromExcel(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream MyFile=new FileInputStream("D:\\Excel\\Book1.xlsx");
	String value = WorkbookFactory.create(MyFile).getSheet("Sheet5").getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	return value;
}
}
