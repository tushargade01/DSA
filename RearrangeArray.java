//rearrange array without extra space O(1)
//output : [3, 4, 2, 0, 1]

public class RearrangeArray {
    
    public static void arrange(long[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            arr[i] += (arr[(int) arr[i]] % n) * n;
        }
        for(int i=0;i<n;i++) {
            arr[i] = arr[i]/n;
        }
    }
    public static void main(String[] args) {
        long [] arr = {4, 0, 2, 1, 3};
        arrange(arr);
        for (long l : arr) {
            System.out.print(l+" ");
        }
    }
}

// arr[i] = arr[i] + (arr[(int) arr[i]] % n ) * n; 
// arr[i] = arr[i] / n;