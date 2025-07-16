public class deleteElement {
    static int delete(int[] arr,int x){
        int i;
        
        for(i=0; i<arr.length;i++){
            if(arr[i]==x){
                break;
            }
        }
        
        for(int j=i;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        
        arr[arr.length-1] = 0;
        
        return i;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(delete(arr, 4));

        for(int elemet : arr){
            System.out.println(elemet);
        }
    }
}