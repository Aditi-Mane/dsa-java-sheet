package Arrays;

import java.util.Arrays;

public class LeftRotateByK {
    static void rotate(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int[] check(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        rotate(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int k = 24;
        int[] ans = check(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
