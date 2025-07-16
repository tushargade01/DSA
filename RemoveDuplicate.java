//remove duplicate from sorted array
public class RemoveDuplicate {

    static int removeDuplicate(int arr[]){
        int res = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;

        /* 
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        */

    }

    public static void main(String[] args){
        int arr[] = {1,2,3,3,5,5};

        System.out.println(removeDuplicate(arr));

    }
}
