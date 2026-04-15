void runAlgorithm(){
    long sum = 0;
    for (int n = 1; n < 1000000; n++){
        sum = sum + n;
    }
}

void main() {
    Instant start = Instant.now();      // 算法开始执行时刻
    runAlgorithm();                       // 执行算法代码
    Instant end = Instant.now();        // 算法执行结束时刻
    Duration timeElapsed = Duration.between(start, end);
    long millis = timeElapsed.toMillis();   // 得到算法执行的毫秒数
    IO.println(millis );
    var date = LocalDate.now();
    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    var text = date.format(formatter);
    System.out.printf("%s%n", text);     // 输出：2021-07-27

}