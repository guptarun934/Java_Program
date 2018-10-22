package OOPS;

// Java program to illustrate creation of Object using clone() method
public class Create_Obj_3_app implements Cloneable {

  @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    String name = "creation of Object using clone() method ";

    public static void main(String[] args)
    {
        Create_Obj_3_app obj1 = new Create_Obj_3_app();
        try
        {
            Create_Obj_3_app obj2 = (Create_Obj_3_app) obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}