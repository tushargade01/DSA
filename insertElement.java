public class insertElement {
    public static int insert(int[] arr,int filled,int cap, int val,int pos){
        
        if(filled == cap){
            return filled;
        }

        for(int i=filled-1;i>=pos-1;i--){
            arr[i+1] = arr[i];
        }

        arr[pos-1] = val;
        
        return filled+1;
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        System.out.println(insert(arr, 4, 5, 3, 3));
        System.out.println();
        for(int num : arr){
            System.out.println(num);
        }

    }
}
