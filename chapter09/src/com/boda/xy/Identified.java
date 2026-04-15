package com.boda.xy;

public interface Identified { 
	   public default int getID(){ 
	   return Math.abs(hashCode());
	}
	}

