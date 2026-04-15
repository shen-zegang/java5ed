package com.boda.xy;

public class VideoPlayer extends Player{
	public double duration;
	
	 public VideoPlayer() {
		   System.out.println("创建视频播放器");
	 }
	 
	public void encodeVideo() {
		
	}
	
	public  void play() {
		System.out.println("播放视频");
	}
	public  void stop() {
		System.out.println("停止视频");
	}	
}
