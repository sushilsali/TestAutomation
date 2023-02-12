package testCaseAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File excel = new File("D:\\ExcelDate.xlsx");
		
		FileInputStream inputstream;
		try {
			inputstream = new FileInputStream(excel);
		
		//	XSSFWorkbook wb1=new XSSFWorkbook(inputstream);
			
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		
		XSSFSheet sheet1=wb.getSheet("Car");
		
		int rowcount;
		rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			int cellcount=sheet1.getRow(i).getLastCellNum();
			
			System.out.println("Row number:"+i);
			
			for(int j=0;j<cellcount;j++)
			{
				System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue()+",");
			}
			System.out.println();
		}
		
		XSSFRow row1 = sheet1.getRow(1);
		
		XSSFCell cell1 = row1.getCell(0);
		
		String value=cell1.getStringCellValue();
		
		//System.out.println(value);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
