package com.boda.xy;

public class ArraySearch {
	public static int linearSearch(int[] array, int key) {
		for (var i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] array, int key){
	    int low = 0;
	    int high = array.length-1;
	    while (high >= low){
	       int mid = (low+high)/2;
	       if(key < array[mid])
	          high = mid -1;
	       else if(key == array[mid])
	          return mid;
	       else
	         low = mid +1;
	    }
	    return -low-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
