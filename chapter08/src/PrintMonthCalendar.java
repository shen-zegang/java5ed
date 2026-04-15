void main() {
	Scanner input = new Scanner(System.in);
	IO.print("输入一个年份和月份(如2015 2):");
	int year = input.nextInt();
	int month = input.nextInt();
	// 得到本月第一天日期
	LocalDate dates = LocalDate.of(year, month, 1);
	String monthName = dates.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
	// 返回当前月的天数
	int daysOfMonth = dates.lengthOfMonth();
    IO.println(year + "年        " + monthName);
    IO.println("-----------------------------");
    System.out.printf("%3s%4s%3s%4s%3s%4s%3s%n", "一", "二", "三", "四", "五", "六", "日");
	// 返回1月1日是周几，返回1是周一，返回7是周日
	int dayOfWeek = dates.getDayOfWeek().getValue();
	// 输出前导空格，如果是周一（dayOfWeek值为1）不输出空格
	for (int i = 2; i <= dayOfWeek; i++)
		System.out.printf("%4s", " ");
	// 输出该月的日期
	for (int i = 1; i <= daysOfMonth; i++) {
		System.out.printf("%4d", i);
		if ((dayOfWeek + i - 1) % 7 == 0)
            IO.println();
	}
}
