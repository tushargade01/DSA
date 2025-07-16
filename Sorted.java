public class Sorted {
    
    static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1,2,34,5,6};

        boolean result = isSorted(arr);
        
        if(result){
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
