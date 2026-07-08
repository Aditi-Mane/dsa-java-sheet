package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] solve(int[] arr, int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(hash.containsKey(complement)){
                return new int[]{i, hash.get(complement)};
            }
            hash.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ans = solve(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
