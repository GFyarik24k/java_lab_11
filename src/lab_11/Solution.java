package lab_11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public <K, V> HashMap<K,V> newHashMap(List<?extends K> listK, List<?extends V> listV){
        if (listK.size() != listV.size())
            throw new IllegalArgumentException("Количество ключей и значений разные");
        HashMap<K,V> A = new HashMap<K,V>();
        for (int i =0;i<listK.size();i++)
            A.put(listK.get(i),listV.get(i));
        return A;
    }
    public <T> HashSet<T> newHashSet(T... mass){
        HashSet<T> A = new HashSet<T>();
        for (T t : mass)
            A.add(t);
        return A;
    }
    public <T> ArrayList<T> newArrayList(T... mass){
        ArrayList<T> A = new ArrayList<T>();
        for (T t : mass)
            A.add(t);
        return A;
    }
}
