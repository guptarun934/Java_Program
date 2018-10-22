package OOPS;

// Java program to illustrate creation of Object using new Instance
public class Create_Object_2_App {

        String name = "creation of Object using new Instance ";

        public static void main(String[] args) {
            try {
                Class cls = Class.forName("Create_Object_2_App");

                Create_Object_2_App obj = (Create_Object_2_App) cls.newInstance();

                System.out.println(obj.name);
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (InstantiationException e)
            {
                e.printStackTrace();
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }

}
