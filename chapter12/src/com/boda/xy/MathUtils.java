package com.boda.xy;

public class MathUtils {
    public static <T> void swap(T[] array,int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public  static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
