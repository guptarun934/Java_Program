package Arrays.Array;

public class ReverseArray {

    public static void reverseArray(int arr[], int start, int end){
        int temp;
        if(start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr , start+1,end-1);
    }

    public static  void printArray(int arr[] , int size){
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+ " ");
        System.out.println(" ");
    }

    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5};
        printArray(arr,5);
        reverseArray(arr,0,4);
        System.out.println("Reverse array :");
        printArray(arr,5);
    }
}
