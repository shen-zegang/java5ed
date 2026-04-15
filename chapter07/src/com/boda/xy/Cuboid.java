package com.boda.xy;

public class Cuboid extends Rectangle{
	private double height;
	public Cuboid(double length,double width, double height){
		super(length,width);
		this.height = height;
	}
	public Cuboid(){
		this(0,0,0);
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public double volume(){
		return super.getArea() * height;
	}
   @Override
   public double getArea(){          
      return 2* (length * width + length * height + height * width);
   }
	
	public static void main(String[]args){
		Cuboid cb = new Cuboid();
		cb.setLength(10);
		cb.setWidth(5);
		cb.setHeight(2);
		System.out.println("area="+cb.getArea());
		System.out.println("volume="+cb.volume());
	}	
}

