package DataDrivenApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IdentifyEntireColValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\rsadhula\\Desktop\\Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// Create Object for XSSFWorkbook class
		// Get Access to sheet
		int Sheetcount = workbook.getNumberOfSheets();
		System.out.println(Sheetcount);
		for (int i = 0; i < Sheetcount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Raju"))
				;
			XSSFSheet sheet = workbook.getSheetAt(0);

			// System.out.println(sheet.getSheetName());

			// Identify Columns

			Iterator<Row> rows = sheet.iterator();// Sheet is collections of
													// rows
			// scanning entire first row
			Row firstrow = rows.next();

			Iterator<Cell> ce = firstrow.cellIterator();// Row is a collections
														// of cells
			int k = 0;
			int coloumn = 0;
			while (ce.hasNext()) {

				// Taking entire cell into value
				Cell value = ce.next();

				if (value.getStringCellValue().equalsIgnoreCase("Data3")) {

					// desired col value

					coloumn = k;// (Desired value after looping)

				}
				k++;

			}

			System.out.println(coloumn);

			while (rows.hasNext()) {

				Row r = rows.next();

				if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("CreateAccount")) {

					//// after you grab purchase testcase row = pull all the
					//// data of that row and feed into test

					Iterator<Cell> cv = r.cellIterator();
					while (cv.hasNext()) {
						System.out.println(cv.next().getStringCellValue());
					}
					
				}

			}

		}

	}

}
