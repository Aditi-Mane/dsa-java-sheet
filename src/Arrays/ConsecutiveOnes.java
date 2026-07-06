package Arrays;

public class ConsecutiveOnes {
    static int solve(int[] arr){
        int currLength=0, maxLength=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                currLength++;
                maxLength = Math.max(currLength, maxLength);
            } else {
                currLength = 0;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,1,0,0,1,1,0,1,1,1};
        int ans = solve(arr);
        System.out.println(ans);
    }
}
