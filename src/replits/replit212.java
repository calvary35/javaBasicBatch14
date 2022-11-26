package replits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

 */
public class replit212 {

    static String path(String path) throws FileNotFoundException {
        return path;
    }

    public static void main(String[] args) {
        String path="SDETBatch14Java/Data/Test2.xlsx";

        try {
            path(path);
            FileInputStream fileInputStream=new FileInputStream(path(path));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } {


            }
        }
    }




