public class Reverse {

    static void reverseArray(int[] arr){
        
        int low = 0;
        int high = arr.length-1;
        
        while(low<high){
            
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,34,58,6};
        reverseArray(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
