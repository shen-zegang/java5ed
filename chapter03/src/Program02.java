void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IO.print("请输入年份：");
    int year = sc.nextInt();
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        IO.println(year + " 年是闰年。");
    } else {
        IO.println(year + " 年不是闰年。");
    }
}
