package com.syntax.class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        Right-click on your file and click "copy path reference"then click from Content Root
         */
        var path = "Data/Config.properties"; //location of the file

        FileInputStream fileInputStream = new FileInputStream(path); //it helps us navigate to the file

        Properties properties = new Properties(); // special software that helps us read data from that file

        properties.load(fileInputStream); //loads all the data from the file inside(Memory)

        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); // closes the file




    }
}
