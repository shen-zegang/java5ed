void main() {
    int count = 0;
    for (int n = 100; n <= 1000; n++) {
        if (n % 5 == 0 && n % 6 == 0) {
            count++;
            if (count % 10 == 0) {
                count = 0;
                IO.println(n);
            } else {
                IO.print(n + "  ");
            }
        }
    }
}
