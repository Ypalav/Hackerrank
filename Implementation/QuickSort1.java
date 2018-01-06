import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort1 {

    static int[] quickSort(int[] arr) {
        // Complete this function
        int pivot = arr[0];
        int returnArr[] = new int[arr.length];
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(pivot == arr[i])
                equal.add(arr[i]);
            else if(pivot < arr[i])
                right.add(arr[i]);
            else
                left.add(arr[i]);
        }
        
        int j=0;
        for(int l=0;l<left.size();l++)
            returnArr[j++]=left.get(l);
        for(int l=0;l<equal.size();l++)
            returnArr[j++]=equal.get(l);
        for(int l=0;l<right.size();l++)
            returnArr[j++]=right.get(l);
        
        return returnArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
