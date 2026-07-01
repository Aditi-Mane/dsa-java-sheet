package Arrays;

public class SecondLargest {
    static int secondLargest(int[] arr){
        int largest = arr[0], secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
