package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    static int[] check(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
    }
}
