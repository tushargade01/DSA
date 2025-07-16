//insert elment at end
public class InsertAtEnd {

    public static int insertAtEnd(int arr[], int size, int val){
        if(size>=arr.length)
            return size; // array is full
        arr[size] = val;
        return size+1; 
    }
    public static void main(String[] args){
        int arr[] = new int[10];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;

        int newSize = insertAtEnd(arr, 5, 90);
        System.out.print("new size:"+newSize+"\n");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
