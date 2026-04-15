void main() {
    double pi;
    double sum;
    int n = 10000;
    int sign = 1;
    for (n = 10000; n <= 100000; n += 10000) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sign = (i % 2 == 0) ? -1 : 1;
            sum = sum + sign * (1.0 / (2 * i - 1));
        }
        pi = 4 * sum;
        IO.println("n = " + n);
        IO.println("PI = " + pi);
    }
}

