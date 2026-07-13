package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //brute force: hashmap
    static int find(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    //optimal: Moore's algorithm
    static int findOptimal(int[] arr){
        int count=0, candidate=0;
        for(int i=0;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate){
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for(int num: arr){
            if(num == candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            return candidate;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,3,1,2,3,3,3};
        int ans = find(arr);
        int ans2 = findOptimal(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
