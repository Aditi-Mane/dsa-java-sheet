package Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    static int[] check(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
    }
}
