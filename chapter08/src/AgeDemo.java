void main() {
    var today = LocalDate.now();
    var birthday = LocalDate.of(2002, Month.JANUARY, 1);
    Period p = Period.between(birthday, today);
    long p2 = ChronoUnit.DAYS.between(birthday, today);
    IO.println("你出生 " + p.getYears() + " 年, "
            + p.getMonths() + " 个月, " + p.getDays()
            + " 天。 (共 " + p2 + " 天)");

}