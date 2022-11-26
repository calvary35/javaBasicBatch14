package com.syntax.class30;

import utils.ExcelReader;

public class ThrowVsThrows {
    public static void main(String[] args)  {

        method2();

    }

    public static void method1()  {
        System.out.println(ExcelReader.read("Data/Book1.xlsx"));
    }

    public static void method2()  {
        method1();
    }
}

