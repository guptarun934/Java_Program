package Arrays.Array;

public class Test6 {
    public static void main (String[] args) {
        int arr[] = new int[3];
        byte b[] = new byte[3];
        short s[] = new short[3];

        String str[] = new String[3];

        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());
        System.out.println(b.getClass());
        System.out.println(s.getClass());
        System.out.println(str.getClass());
    }
}
