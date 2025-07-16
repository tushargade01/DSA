import java.util.ArrayList;

public class MaxAndSecond {
    public static ArrayList<Integer> largestAndSecond(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }else if(num<first && num>second){
                second = num;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(second); 

        return result;
    }
    public static void main(String[] args){
        int arr[] = {4,7,5,2,1,9,32};

        System.out.println(largestAndSecond(arr)); 
    }
}
