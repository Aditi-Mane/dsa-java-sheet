package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    static int[] union(int[] arr1, int[] arr2){
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            } else if(arr1[i]>arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            } else if(arr1[i]==arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        int[] union = new int[list.size()];
        for(int k=0;k<union.length;k++){
            union[k] = list.get(k);
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9,10};

        int[] union = union(arr1, arr2);
        System.out.println(Arrays.toString(union));
    }
}
