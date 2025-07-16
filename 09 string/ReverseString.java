import java.util.*;

class ReverseString {

    static void reverse(char str[], int low, int high) {
        while (low <= high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }

    static void reverseWords(char str[], int n) {
        int start = 0;

        while (start < n) {
            // Skip any leading spaces
            while (start < n && str[start] == ' ') {
                start++;
            }

            // Find the end of the current word
            int end = start;
            while (end < n && str[end] != ' ') {
                end++;
            }

            // Reverse the current word
            reverse(str, start, end - 1);

            // Move to the next word
            start = end;
        }

        // Reverse the entire string to reverse the order of words
        reverse(str, 0, n - 1);
    }

    public static void main(String args[]) {
        String s = "Welcome to   Gfg";
        int n = s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str, n);
        System.out.println(str);
    }
}
