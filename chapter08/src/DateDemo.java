void main() {
		  var today = LocalDate.now();
		  IO.println("今天的日期是："+ today);
		  IO.println("年："+ today.getYear());
		  IO.println("月："+ today.getMonthValue());
		  IO.println("日："+ today.getDayOfMonth());
		  IO.println("星期："+ today.getDayOfWeek());

var birthday = LocalDate.of(2010, Month.OCTOBER, 20);
IO.println("我的出生日期是："+ birthday);		
IO.println(birthday.getYear() + "年"  
+ (birthday.isLeapYear()?"是闰年":"不是闰年"));

}
