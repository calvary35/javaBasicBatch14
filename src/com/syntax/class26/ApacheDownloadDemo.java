package com.syntax.class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ApacheDownloadDemo {
    public static void main(String[] args) throws IOException {
        String variable = "C:\\Users\\ksbro\\OneDrive\\Documents\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(variable);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
