import java.util.List;
import java.util.ArrayList;;

public class maxElmentStream {
    public static List<Integer> streamMax(int[] nums){
        List<Integer> list = new ArrayList<>();
        int maxNumber = nums[0];
        for(int num : nums){
            if(maxNumber<num){
                maxNumber = num;
            }
            list.add(maxNumber);
        }
        return list;
    }
    public static void main(String[] args){
        //int[] nums = {1, 5, 2, 9, 3, 6, 8};
        int[] nums = {10, 2, 5, 1, 0, 11, 6};
        System.out.println(streamMax(nums));
    }
}
