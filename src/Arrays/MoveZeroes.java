package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    static int[] check(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1, 1};
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
    }
}
