//Reading textfile using FileInputStream
package com.ar.StreamNfiles;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main (String[] args)throws IOException {
        FileInputStream fin = new FileInputStream("myFile.txt");
        System.out.println("File Contents: ");

        int ch;
        while ((ch = fin.read()) != -1)
            System.out.print((char) ch);

        fin.close();
    }

}
