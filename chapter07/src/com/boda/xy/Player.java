package com.boda.xy;

public abstract class Player {
   private String fileName = "";
   public Player() {
	   System.out.println("创建播放器");
   }
   public abstract void play();
   public abstract void stop();
}
