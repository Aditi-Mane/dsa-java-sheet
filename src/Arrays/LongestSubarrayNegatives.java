package Arrays;

//prefix sum + hashmap approach
import java.util.HashMap;

public class LongestSubarrayNegatives {
    static int solve(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>(); //to store sum at each index
        int sum=0,maxLength=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum == k){
                maxLength = i+1;
            }
            //check whether sum-k at any previous index has occurred earlier
            //if it has occurred, it indicates that k is sum of array in between (prefix sum & current index)
            if(map.containsKey(sum-k)){
                maxLength = Math.max(maxLength, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        int k = 0;
        int ans = solve(arr, k);
        System.out.println(ans);
    }
}

