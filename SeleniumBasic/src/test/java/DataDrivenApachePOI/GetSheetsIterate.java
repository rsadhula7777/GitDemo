package DataDrivenApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSheetsIterate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Create Object for XSSFWorkbook class
		//Get Access to sheet
		//Get Access to all rows of sheet
		//Access to specific rows from all rows
		//Get Access to all cells of Row
		//Access the data from excel into Arrays
		
		
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\rsadhula\\Desktop\\Book1.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	//Create Object for XSSFWorkbook class
			//Get Access to sheet
	int Sheetcount = workbook.getNumberOfSheets();
	System.out.println(Sheetcount);
	for(int i=0;i<Sheetcount;i++){
		if(workbook.getSheetName(i).equalsIgnoreCase("Raju"));
		XSSFSheet sheet=workbook.getSheetAt(2);
		
		System.out.println(sheet.getSheetName());
		
		
		
	
	

}
}
}
	
