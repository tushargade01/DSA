public class RotateOne {

    //rotate array by one to left
    static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

    }
    public static void main(String[] args){
        int arr[] = {6,1,2,3,4,5};
        System.out.print("Before Rotate: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        System.out.println();

        rotateArray(arr);

        System.out.print("After Rotate: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
