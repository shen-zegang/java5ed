import  java.time.DayOfWeek;

public void describe(DayOfWeek day) {
    switch (day) {
        case MONDAY -> IO.println("Mondays are bad.");
        case FRIDAY -> IO.println("Fridays are better.");
        case SATURDAY, SUNDAY -> IO.println("Weekends are best.");
        default -> IO.println("Midweek days are so-so.");
    }
}

void main() {
    DayOfWeek firstDay = DayOfWeek.MONDAY;
    describe(firstDay);
    DayOfWeek thirdDay = DayOfWeek.WEDNESDAY;
    describe(thirdDay);
    DayOfWeek seventhDay = DayOfWeek.SUNDAY;
    describe(seventhDay);

}

