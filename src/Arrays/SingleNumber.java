package Arrays;

public class SingleNumber {
    static int findNum(int[] arr){
        int xor = 0;
        for(int num: arr){
            xor = xor^num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        int ans = findNum(arr);
        System.out.println(ans);
    }
}

