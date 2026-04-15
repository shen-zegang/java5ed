package com.boda.xy;
public class Vehicle {
    private double speed;
    public void start(){
	  System.out.println("The Vehicle is started.");
    }
    public void speedUp(double speed){
	   this.speed = speed;
	   System.out.println("The Vehicle is speed up to "+speed+"kilo/h.");
    }
    public void stop(){
	   this.speed = 0;
	   System.out.println("The Vehicle is stoped.");
    }
}

