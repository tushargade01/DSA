import java.util.*;
public class htFindDuplicates {
    static List findDuplicates(int[] arr){
        HashMap ht = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();    
        if(arr.length==0){
            return list;
        }else{
            for(int i=0;i<arr.length;i++){
                if(ht.get(arr[i])!=null){
                    ht.put(arr[i], true);
                }else{
                    if(!list.contains(arr[i])){
                        list.add(arr[i]);
                    }
                }
            }
            
            return list;
        }
    }
    public static void main(String[] args){
        //int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        //int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2};
        //int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicates(nums));
    }
}
