package Arrays;

public class SortedArrayCheck {
    static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 89};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
