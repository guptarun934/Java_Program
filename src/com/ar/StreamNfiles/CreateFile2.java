//Creating a text file using FileWriter
package com.ar.StreamNfiles;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile2 {
    public static void main (String[] args)throws IOException {
        String str = "This is a book on Java." + "\n I am a Learner of Java.";
        FileWriter fw = new FileWriter("text");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        fw.close();
    }
}
