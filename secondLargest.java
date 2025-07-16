public class secondLargest {
    
    static int secondlargestElement(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }else if(num>second && num != first){
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args){
        int[] arr = {11,45,23,14,67};
        System.out.println(secondlargestElement(arr));
    }
}
