package com.boda.xy;

public class Bus extends Vehicle {
    private int passenger;
    public void gotOn(int n){
	   passenger = passenger+n;
	   System.out.println("The person on bus is:"+passenger);
    }
    public void gotOff(int n){
	   passenger = passenger-n;
	   System.out.println("The person on bus is:"+passenger);
    }
    
    public static void main(String []args){
 	   Bus bus = new Bus();
 	   bus.start();
 	   bus.speedUp(60);
 	   bus.stop();
 	   bus.gotOn(10);
 	   bus.gotOff(5);
     }   
}
