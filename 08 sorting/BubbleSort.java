
public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 
    public static void main(String args[]){
        int[] arr={5,3,1,2,6};
        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }    
}
