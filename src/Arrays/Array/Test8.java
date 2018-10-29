package Arrays.Array;

public class Test8 {

    public static void main (String[] args) {

        int arr[][] = {{1,2,3},{4,5}};
        int arrClone[][] =arr.clone();

        System.out.println(arr == arrClone);
        System.out.println(arr[0]==arrClone[0]);
        System.out.println(arr[1]==arrClone[1]);
        
    }
}
