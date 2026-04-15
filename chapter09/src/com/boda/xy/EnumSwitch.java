package com.boda.xy;
import java.time.DayOfWeek;
public class EnumSwitch{
    public static void describe (DayOfWeek day) {
      switch (day) {
	     case MONDAY: 
           IO.println("Mondays are bad.");
		      break;
	     case FRIDAY: 
            IO.println("Fridays are better.");
		      break;
         case SATURDAY:
	     case SUNDAY: 
            IO.println("Weekends are best.");
		       break;
	     default:
            IO.println("Midweek days are so-so.");
		    break;
       }
      }
	
     public static void main(String[] args) {
    	 DayOfWeek firstDay = DayOfWeek.MONDAY;
         describe (firstDay);
         DayOfWeek thirdDay = DayOfWeek.WEDNESDAY;
         describe (thirdDay);
         DayOfWeek seventhDay = DayOfWeek.SUNDAY;
         describe(seventhDay); 
    }
}

