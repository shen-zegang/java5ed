void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("请输入年份和月份（例如：2025 9）:");
    int year = scanner.nextInt();
    int month = scanner.nextInt();
    // 创建该月的第1天
    LocalDate firstDay = LocalDate.of(year, month, 1);
    // 获取该月的天数
    int lengthOfMonth = firstDay.lengthOfMonth();
    // 获取该月第一天是星期几（1=Monday，7=Sunday）
    int dayOfWeekValue = firstDay.getDayOfWeek().getValue(); // 1 ~ 7
    // 在 Java 中星期日是 7，而我们希望它在第一列，所以需要调整
    int start = dayOfWeekValue % 7; // 0=Sunday, 1=Monday, ..., 6=Saturday
    System.out.printf("%10d年%10d月%n", year, month);
    System.out.printf("%4s%3s%4s%3s%4s%3s%4s%n",
            "日", "一", "二", "三", "四", "五", "六");

    //IOprintln("  日  一  二  三  四  五  六");
    // 打印前导空格
    for (int i = 0; i < start; i++) {
        System.out.printf("%4s", " ");
    }
    // 打印每一天
    for (int day = 1; day <= lengthOfMonth; day++) {
         System.out.printf("%4d", day);
         // 如果当前是周六（即列数为 6），则换行
         if ((start + day) % 7 == 0) {
              IO.println();
         }
    }
    IO.println(); // 结尾换行
    scanner.close();
}