void main() {
    LocalDate day = LocalDate.of(2000, 1, 1);
    LocalDate lastday = LocalDate.of(2099, 12, 31);
    int count = 0;

    while (day.isBefore(lastday)) {
        if (day.getDayOfMonth() == 13 && day.getDayOfWeek() == DayOfWeek.FRIDAY) {
            count++;
            IO.println(day + "  " + day.getDayOfWeek());
        }
        day = day.plusDays(1);
    }
    IO.println("13日星期五 共有 " + count + " 天");
}

