//Reading data from text file - version 2
package com.ar.StreamNfiles;

import java.io.*;

public class ReadFiles {
    public static void main (String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter File name:: ");
        String fname = br.readLine();

        FileInputStream fin = null;

        try{
            fin = new FileInputStream(fname);
        }
        catch (FileNotFoundException fe){
            System.out.println("file not found");
            return;
        }
        BufferedInputStream bin = new BufferedInputStream(fin);
        System.out.println("File Contents : ");

        int ch;
        while ((ch = bin.read()) != -1)
            System.out.print((char)ch);
        bin.close();
    }
}
