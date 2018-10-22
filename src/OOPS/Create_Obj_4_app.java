package OOPS;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Java program to illustrate Serializing an Object.
public class Create_Obj_4_app implements  Serializable {

        private String name;

        Create_Obj_4_app(String name)
        {
            this.name = name;
        }

        public static void main(String[] args)
        {
            try
            {
                Create_Obj_4_app d = new Create_Obj_4_app("Serializing an Object.");
                FileOutputStream f = new FileOutputStream("file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(f);
                oos.writeObject(d);
                oos.close();
                f.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
