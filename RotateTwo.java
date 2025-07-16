//rotate array by 2 to left 
public class RotateTwo {
    
    static void rotateTwo(int arr[],int rotate){
        int temp[] = new int[rotate];
        for(int i=0;i<rotate;i++){
            temp[i] = arr[i];
        }

        for(int j = rotate; j<arr.length;j++){
            arr[j-rotate] = arr[j];
        }

        for(int i=0;i<rotate;i++){
            arr[arr.length-rotate+i] = temp[i];
        }

    }
    public static void main(String[] args){
        int arr[] = {5,6,0,1,2,3,4};
        rotateTwo(arr, 3);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
