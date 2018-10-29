package Arrays.Array;

class Student{
    public  int roll;
    public  String name;

    Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
}
public class Test1 {
    public static void main (String[] args) {
        Student arr[];

        arr = new  Student[5];

        arr[0]= new Student(1,"A");
        arr[1]= new Student(2,"AR");
        arr[2]= new Student(3,"ARU");
        arr[3]= new Student(4,"ARUN");
        arr[4]= new Student(5,"ARUNG");

        for (int i=0;i<arr.length;i++)
            System.out.println("Elements at index"+i+":"+arr[i].roll+" "+arr[i].name);
    }
}
