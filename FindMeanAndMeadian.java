import java.util.Arrays;

public class FindMeanAndMeadian {
    public static int[] findMeanMeadian(int arr[]){

        int sum=0;
        int n = arr.length;
        for(int num : arr){
            sum += num;
        }
        // System.out.println(sum);
        // System.out.println(n);
        int mean  = sum/n;

        //meadian
        Arrays.sort(arr);
        int median;
        if(n % 2 == 1){
            median = arr[n/2];
        }else{
            median = (arr[n/2] + arr[n/2-1])/2;
        }

        return new int[] {mean,median};

    }
    public static void main(String[] args){
                    //{1,2,3,4,5,19} 
        int[] arr1 = {1, 2, 19, 5, 4, 3};
        //findMeanMeadian(arr1);
        System.out.println(Arrays.toString(findMeanMeadian(arr1)));
    }
}
