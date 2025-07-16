import java.util.*;
public class InsertionSort {
    static void insertionSort(int[] arr){
        int size=arr.length;
        for(int step=1;step<size;step++){
            int key = arr[step];
            int prev = step-1;
            while(prev>-1 && key<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = key;
        }
    }
    public static void main(String args[]){
        int[] arr = {4,6,1,2,8,3};
        //System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
