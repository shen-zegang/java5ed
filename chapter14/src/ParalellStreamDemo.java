// 计算第n个斐波那契数方法
public  long fibonacci(long n) {
     if (n == 1 || n == 2) {
       return 1;
     }
     return fibonacci(n - 1) + fibonacci(n - 2);
}
   
void main() {
      List<Integer> numbers = List.of(10, 20, 30, 40, 41, 45);
      Instant start = Instant.now();    // 记录开始时间
      numbers.parallelStream().map((input) -> fibonacci(input))
         .forEach(System.out::println);
      Instant end = Instant.now();       // 记录结束时间
      System.out.printf("使用并行流用时: %d毫秒\n",
           Duration.between(start, end).toMillis());
      
      start = Instant.now();
      numbers.stream().map((input) -> fibonacci(input))
         .forEach(System.out::println);
      end = Instant.now();
      System.out.printf("使用顺序流用时: %d毫秒\n",
        Duration.between(start, end).toMillis());

}

