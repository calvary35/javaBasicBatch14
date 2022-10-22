package com.syntax.class23;

public class HWTask1 {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to
     be installed etc
     */
    public static void main(String[] args) {

        File[] filed = {new JavaFile(), new MicrosoftWord(), new PdfFile()};
        for (File files : filed ) {
            files.open();
        }
    }
}

abstract class File {
    abstract void open();

    void edit() {
        System.out.println("Editing or reworking our data for our class files");
    }

    void close() {
        System.out.println("To close our class files");
    }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text");
    }

    void edit() {

    }

    @Override
    void close() {

    }
}

class MicrosoftWord extends File {
    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word to" +
                " be installed");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("We need Adobe or a PDF reader installed to open a PDF file");
    }
}


