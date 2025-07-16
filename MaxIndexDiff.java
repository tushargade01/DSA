// arr = [34, 8, 10, 3, 2, 80, 30, 33, 1]

// We look for pairs (i, j) such that:

// arr[i] < arr[j]

// and maximize j - i


public class MaxIndexDiff {
    static int maxIndexDiff(int arr[]) {
        
        int leftMin[] = new int[arr.length];
        int  rightMax[] = new int[arr.length];

        leftMin[0] = arr[0];
        for(int i=1; i<arr.length;i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }

        rightMax[arr.length-1] = arr[arr.length-1];

        for(int j=arr.length-2; j>=0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j+1]);
        }
        
        int i=0, j=0, maxDiff = 0;
        
        while( i<arr.length && j< arr.length) {
            if(leftMin[i] < rightMax[j]) {
                maxDiff = Math.max(maxDiff, j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxDiff;
    }
    public static void main(String args[]){
        int [] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr));   
    }
}
