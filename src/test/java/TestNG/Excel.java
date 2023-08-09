package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Excel {
	

	public static void main(String[] args) throws IOException {
      
		 String excelFilePath= "C:\\Users\\1002985\\eclipse-workspace\\Testing_Purpose\\login_detils.xlsx";
		 FileInputStream inputstream= new FileInputStream(excelFilePath);
		 XSSFWorkbook workbook= new XSSFWorkbook(inputstream);
		 XSSFSheet sheet= workbook.getSheet("Minal");
		 //Using For loop
		 
		 int rows=sheet.getLastRowNum();
		 int column=sheet.getRow(1).getLastCellNum();
		 
		 for(int r=0;r<=rows;r++)
		 {
		 XSSFRow row=sheet.getRow(r);
	
	 for(int c=0;c<=column;c++)
	 {
		XSSFCell cell= row.getCell(c);
		if (cell != null) {
			switch(cell.getCellType())
		
		{
		case STRING: System.out.println(cell.getStringCellValue()); break;
		case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
		case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
		default:
			break;
		}
		
		System.out.println("");	
		
	 }
	 
		 }
	 }
}
}

	

