package com.boda.xy;

public class FinalDemo {
    public static final int SIZE = 50;
    public void methodA(final int i){
    	//i = i + 1;
    }
    
    public int methodB(final int i){
    	final int j = i + 1;
    	//j = 100;
    	return j;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
