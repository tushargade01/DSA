public class InsertAtIndex {
    
    // static int insertAtIndex(int arr[], int size, int val, int index){
    //     if(size>=arr.length || size<index || index<0){
    //         return size;
    //     }
    //     for(int i = size-1; i >= index; i--){
    //         arr[i+1] = arr[i];
    //     }
    //     arr[index] = val;
    //     return size+1;
    // }

    static int insertAtIndex(int arr[], int size, int val, int pos){
        if(size>=arr.length || size<pos-1 || pos-1<0){
            return size;
        }
        for(int i = size-1; i >= pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = val;
        return size+1;
    }
    public static void main(String[] args){
        int arr[] = new int[10];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 7;
        arr[4] = 5;

        insertAtIndex(arr, 5, 90, 2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
