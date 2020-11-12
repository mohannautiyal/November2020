package com.home.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtil {

	public static void main(String[] args) throws IOException {
		readExcel("ExcelData.xlsx","CountryData");
	}

	public static void readExcel(String excelpath, String sheetName) throws IOException {
        List<LinkedHashMap<String, String>> excelData = new ArrayList();
		FileInputStream fi = new FileInputStream(excelpath);
		XSSFWorkbook Wbook = new XSSFWorkbook(fi);
		XSSFSheet wsheet = Wbook.getSheet(sheetName);

		int nrows = wsheet.getPhysicalNumberOfRows();

		for (int r = 0; r < nrows; r++) {
			int ncols = wsheet.getRow(r).getLastCellNum();
			LinkedHashMap<String, String> rowData= new LinkedHashMap<String, String>();
			for (int c = 0; c < ncols; c++) {
                XSSFCell wcell=    wsheet.getRow(r).getCell(c); 
                String celltype = wcell.getCellType().toString();
               
                if(celltype.equals("STRING"))
                	System.out.print(wcell.getStringCellValue()+"  ");
                else if(celltype.equals("NUMERIC"))
                	System.out.print(wcell.getNumericCellValue()+"  ");
                
			}
			System.out.println();
		}
		Wbook.close();
	}

}
