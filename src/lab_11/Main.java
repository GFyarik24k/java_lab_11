package lab_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Solution operation = new Solution();
        HashSet<String> hash;
        hash = operation.newHashSet("aa", "bb", "cc","dd");
        System.out.print(hash+"\n");
        ArrayList<Integer> arr;
        arr = operation.newArrayList(1,2,3,4);
        ArrayList<String>  arr1;
        arr1 = operation.newArrayList("a", "b", "c", "d");
        System.out.print(arr+"\n");
        HashMap<Integer, String> hashMap = operation.newHashMap(arr, arr1);
        System.out.print(hashMap+"\n");
    }
}