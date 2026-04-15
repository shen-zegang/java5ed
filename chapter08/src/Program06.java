void main() {
    IO.print("请输入出生日期（yyyy-MM-dd）：");
    Scanner input = new Scanner(System.in);
    String birthString = input.next();
    LocalDate birthday = LocalDate.parse(birthString);
    LocalDate today = LocalDate.now();
    long days = ChronoUnit.DAYS.between(birthday, today);
    if (days < 0) {
        IO.println("还没出生呢");
    } else {
        IO.println("你出生天数：" + days);
    }
}
