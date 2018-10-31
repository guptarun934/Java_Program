package Arrays.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverseArray {

    public static void main (String[] args) {
        String strArr[] ={"CAT","RAT","MAT","FAT"};
        System.out.println("Array Before Reverse : "+ Arrays.toString(strArr));
        List<String> list = Arrays.asList(strArr);
        Collections.reverse(list);
        String reverse[] = list.toArray(strArr);
        System.out.println("Array After reverse :"+Arrays.toString(reverse));
    }
}
