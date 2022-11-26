package com.syntax.class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {
        var excelData = ExcelReader.read("Data/Book1.xlsx");
        System.out.println(excelData);



    }
}
