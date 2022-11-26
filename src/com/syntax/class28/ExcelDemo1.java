package com.syntax.class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {

        //we need to know the path of the file
        String path = "Data/Book1.xlsx";

        //navigate to this path
        FileInputStream fileInputStream = new FileInputStream(path);

        // the class that can handle the xlsx files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);

        //Getting to the sheet inside the excel file where data is stored
        Sheet sheet= excelFile.getSheet("Sheet1");

        //Getting the row that contains the data rows are indexed based, so they will start from zero
        Row row0 = sheet.getRow(0);
        //Get the cell that contains the data cells are also index based
        System.out.println(row0.getCell(0));

        //Get the data from row 1

        Row row1 = sheet.getRow(1);
        System.out.println(row1.getCell(0));


    }
}
