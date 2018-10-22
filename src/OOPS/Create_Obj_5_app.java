package OOPS;

import java.lang.reflect.Constructor;

// Java program to illustrate creation of Object using newInstance() method of Constructor class
public class Create_Obj_5_app {

        private String name;

        Create_Obj_5_app()
        {

        }
        public void setName(String name)
        {
            this.name = name;
        }
        public static void main(String[] args)
        {
            try
            {
                Constructor<Create_Obj_5_app> constructor = Create_Obj_5_app.class.getDeclaredConstructor();
                Create_Obj_5_app r = constructor.newInstance();
                r.setName("creation of Object using newInstance() method of Constructor class ");
                System.out.println(r.name);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
