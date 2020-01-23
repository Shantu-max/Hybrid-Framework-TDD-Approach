package Generic_Methods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static String getvaluefromExcel(String sheetname,int rownumber,int cellnum) throws IOException 
	{
	  FileInputStream out=new FileInputStream("./Excel/emids.xlsx");
	  XSSFWorkbook book=new XSSFWorkbook(out);
	  XSSFSheet  sheet=book.getSheet(sheetname);
	  XSSFRow row = sheet.getRow(rownumber);
	  XSSFCell cell = row.getCell(cellnum);
	 return cell.toString();
	 
	 }

}
