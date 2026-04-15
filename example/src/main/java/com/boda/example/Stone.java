package com.boda.example;
import javafx.scene.paint.Color;
public class Stone{  
  private int x;  
  private int y; 
  private Color color;
   
  public Stone(int x,int y,Color color){  
      this.x=x;  
      this.y=y;  
      this.color=color;  
  }    
  public int getX(){
      return x;  
  }  
  public int getY(){  
     return y;  
  }  
  public Color getColor(){
      return color;  
  }  
}  
