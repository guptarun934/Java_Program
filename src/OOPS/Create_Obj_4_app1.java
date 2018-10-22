/*
package OOPS;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;

// Java program to illustrate creation of Object using Deserialization.
public class Create_Obj_4_app1 {

        public static void main(String[] args)
        {
            try
            {
                Create_Obj_4_app1 d;

                FileInputStream f = new FileInputStream("file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(f);
                d = (Create_Obj_4_app1)oos.readObject();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(d.name);
        }
    }
*/

