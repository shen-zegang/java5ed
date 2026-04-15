package com.boda.xy;
class Parent{
  public double calculate(double x,double y){
     return x * y;
  }
}

class Child extends Parent{
    @Override
    public double calculate(double x, double y){
	    return x * x + y * y;
   }
}

