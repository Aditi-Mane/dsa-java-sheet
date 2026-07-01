package Arrays;

class FindLargest{
    static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int[] arr = {23, 45, 66, 12};
        int ans = findLargest(arr);
        System.out.print(ans);
    }
}