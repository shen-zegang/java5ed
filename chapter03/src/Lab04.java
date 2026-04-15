void main() {
    int sum = 0, count = 0;
    int n = 1;
    do {
        if (n % 7 == 0 || n / 100 == 7 || n % 10 == 7 || n / 10 % 10 == 7) {
            sum = sum + n;
            count = count + 1;
            IO.println(n);
        }
        n++;
    } while (n <= 1000);
    IO.println("和=" + sum);
    IO.println("个数=" + count);
}