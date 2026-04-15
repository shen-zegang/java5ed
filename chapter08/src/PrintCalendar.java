void main() {
    var scanner = new Scanner(System.in);
    IO.print("请输入年份和月份（例如：2025 10）:");
    int year = scanner.nextInt();
    int month = scanner.nextInt();
    var firstDay = LocalDate.of(year, month, 1);       // 创建该月的第1天
    int lengthOfMonth = firstDay.lengthOfMonth();      // 获取该月的天数

    System.out.printf("%10d年%10d月%n", year, month);
    System.out.printf("%4s%3s%4s%3s%3s%3s%4s%n",  "一", "二", "三", "四", "五", "六","日");
    // 获取该月第一天是星期几（1=Monday，7=Sunday）
    int dayOfWeekValue = firstDay.getDayOfWeek().getValue();   // 1 ~ 7
    int start = dayOfWeekValue;   //  1=Monday, ..., 6=Saturday,7=Sunday
    for (int i = 1; i < start; i++) {                      // 打印前导空格
        System.out.printf("%4s", " ");
    }
    for (int day = 1; day <= lengthOfMonth; day++) {    // 打印每一天
        System.out.printf("%4d", day);
        if ((start + day - 1) % 7 == 0) {   // 如果当前是周六（即列数为 6），则换行
            IO.println();
        }
    }
    IO.println(); // 结尾换行
    scanner.close();
}


