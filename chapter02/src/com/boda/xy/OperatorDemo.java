package com.boda.xy;
public class OperatorDemo {
	public static String toBinary(int i){
		if(i<0){
			return Integer.toBinaryString(i);
		}else{
			String s = Integer.toBinaryString(i);
			int n = s.length();
			while(n<32){
				s="0"+s;
				n = n + 1;
			}
			return s;
		}
		
	}
	
	public static void main(String[] args) {
		int a = 42;       // 00000111     
        int b = 13;       
				      
         
        System.out.println("a="+toBinary(a));
        System.out.println("b="+toBinary(b));
        System.out.println("c="+toBinary(a&b));
        System.out.println(a&b);
        
        int x = 5;
        int y = 6;
        boolean z = ((x * 5) == (y +  18));
        System.out.println(z);
        
         
         

	}
}
