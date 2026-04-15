void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("请输入一个月份（1~12）：");
    int month = sc.nextInt();
    String season = "";
    if (month < 1 || month > 12) {
        IO.println("输入的月份不合法！");
        System.exit(0);
    } else if (month >= 2 && month <= 4) {
        season = "春季";
    } else if (month >= 5 && month <= 7) {
        season = "夏季";
    } else if (month >= 8 && month <= 10) {
        season = "秋季";
    } else if (month == 1 || month == 11 || month == 12) {
        season = "冬季";
    }
    IO.println("季节= " + season);
}


