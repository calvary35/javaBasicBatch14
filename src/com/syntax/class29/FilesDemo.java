package com.syntax.class29;

import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path= "Data/Config.properties";
        var properites = ConfigReader.read(path);

        System.out.println(properites.getProperty("browser"));

        String excelPath = "Data/Book1.xlsx";
        var excelData = ExcelReader.read(excelPath);
        System.out.println(excelData);

    }
}
