void main() {
    int n = 1;
    double sum = 0;
    while (n < 99) {
        sum = sum + (double) n / (n + 2);  // 将一个操作数转换成double
        n = n + 2;
    }
    IO.println("sum = " + sum);
}
