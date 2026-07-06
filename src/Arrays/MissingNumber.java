package Arrays;

public class MissingNumber {
    static int findNum(int[] arr){
        int arraySum = 0, n = arr.length + 1;
        int sum = n*(n+1)/2;
        for(int num: arr) {
            arraySum = arraySum + num;
        }
        return sum-arraySum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        int ans = findNum(arr);
        System.out.println(ans);
    }
}
