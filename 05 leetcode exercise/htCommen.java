import java.util.HashMap;
public class htCommen {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap myHashMap = new HashMap();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }    
public static void main(String[] args){
        int[] array1 = {1,2,3};
        int[] array2 = {3,4,5};
        System.out.println(itemInCommon(array1, array2));
    }
}
