public class CheckSortedRotated {
    public static boolean isRotatedAndSorted(int arr[]){
        
        int count=0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        return count == 1;
    }
    public static void main(String[] args){
        int [] arr = {4,5,1,6,2,3};
        System.out.println(isRotatedAndSorted(arr));
    }
}
