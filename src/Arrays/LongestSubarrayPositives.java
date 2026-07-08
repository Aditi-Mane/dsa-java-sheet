package Arrays;

public class LongestSubarrayPositives {
    static int solve(int[] arr, int k){
        int left = 0, maxLength = 0, sum = 0;
        for(int right=0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>k){ //loop until sum<=k, to avoid incorrect window
                sum = sum - arr[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        int ans = solve(arr, k);
        System.out.println(ans);
    }
}
