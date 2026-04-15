package com.boda.xy;

public record Customer(String name,String address) {   
	public Customer(String name) {
	   this(name,"科技路19号");
   }
    public static String info = "软件工程专业";
   
    public static void show() {
	   System.out.println("专业："+info);
   }
    public void showName() {
	   System.out.println("姓名："+name);
   }

//   @Override
//    public String toString(){
//        return name + " " + address;
//   }
}
