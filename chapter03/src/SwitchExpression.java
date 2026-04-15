void main() {
    DayOfWeek day = DayOfWeek.SATURDAY;
    int numLetters = switch(day){
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY                   -> 7;
        case THURSDAY, SATURDAY      -> 8;
        case WEDNESDAY                -> 9;
    };
    IO.println(numLetters);        // 输出：8

}