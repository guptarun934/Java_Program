package Arrays.Array;

public class Tesgt7 {
    public static void main (String[] args) {
        int arr[] = {1,2,3,4};
        int arrClone[] =arr.clone();

        System.out.println(arr == arrClone);

        for (int i=0;i<arrClone.length;i++){
            System.out.print(arrClone[i] + " ");
        }
    }
}
