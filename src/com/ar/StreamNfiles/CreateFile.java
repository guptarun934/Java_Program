//Creating a text file using FileOutPutStream
package com.ar.StreamNfiles;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main (String[] args)throws IOException {

        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("myFile.txt");

        System.out.println("Enter text (@ at the end): ");
        char ch;
        while ((ch =(char)dis.read()) != '@')
            fout.write(ch);
        fout.close();
    }
}
