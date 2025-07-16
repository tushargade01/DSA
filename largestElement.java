public class largestElement {
    
    static int largest(int[] arr){
        int large = Integer.MIN_VALUE;

        for(int element : arr){
            if(element>large){
                large = element;
            }
        }
        return large;
    }

    public static void main(String[] args){
        int[] arr = {1,5,3,73,12,99,44};
        System.out.println(largest(arr));
    }
}
