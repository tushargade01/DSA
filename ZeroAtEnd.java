public class ZeroAtEnd {

    static void zeroAtEnd(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
    }

    static void zeroAtEndMethod(int arr[]){
        int count=0;

        for(int num : arr) {
            if(num != 0) {
                arr[count++] = num;
            }
        }
        while(count<arr.length) {
            arr[count++] = 0;
        }
    }
    public static void main(String[] args){
        int arr[] = {3,0,8,4,1,0,6,1};
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        zeroAtEndMethod(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
