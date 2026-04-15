public enum Season {
    SPRING, SUMMER, AUTOMN, WINTER;
}
void main() {
    Season[] seasons = Season.values();
    for (Season s : seasons) {
        IO.print(s);
        IO.println("  " + s.ordinal());
    }
    Season ss = Season.SPRING;
    switch (ss) {
        case SPRING -> IO.println("春天, 有百花。");
        case SUMMER -> IO.println("夏天, 有凉风。");
        case AUTOMN -> IO.println("秋天, 有月。");
        case WINTER -> IO.println("冬天, 有雪。");
    }
}

