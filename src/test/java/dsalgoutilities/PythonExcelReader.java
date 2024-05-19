package dsalgoutilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PythonExcelReader {

	public String[] fileReader() throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dsalgoexceldata\\ExcelData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		String value = sheet.getRow(0).getCell(0).toString();
		String value1= sheet.getRow(1).getCell(0).toString();
		String value2 = sheet.getRow(2).getCell(0).toString();
		String value3 = sheet.getRow(3).getCell(0).toString();
		
//		int row_count = sheet.getLastRowNum();
//		int col_count= sheet.getRow(0).getLastCellNum();
		
//		for (int i=0;i<=row_count;i++)
//		{
//			String value = sheet.getRow(i).getCell(0).toString();
//			
//			System.out.println(value);
//			
//		}
		//return value ;
		workbook.close();
		
		return new String[]{value,value1,value2,value3};
		
	}

}


