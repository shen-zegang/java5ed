package com.boda.xy;
public class NineTable {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++){
			for(int j = 1; j <=i; j++){
				IO.print(i +"*"+j + "="+i*j + "  ");
			}
			IO.println();
		}
	}
}
