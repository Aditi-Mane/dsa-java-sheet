package Arrays;

public class KadanesAlgorithm {
    static int solve(int[] arr){
        int currSum=0,maxSum=Integer.MIN_VALUE;
        for(int num: arr){
            currSum = currSum + num;
            maxSum = Math.max(currSum, maxSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = solve(arr);
        System.out.println(ans);
    }
}
