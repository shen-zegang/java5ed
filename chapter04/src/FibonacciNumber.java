
    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    void main() {
        for (int i = 1; i <= 20; i++) {
            IO.println("fibonacci(" + i + ")=" + fibonacci(i));
        }
        IO.println("fibonacci(19)/fibonacci(20)=" + fibonacci(19) * 1.0 / fibonacci(20));
    }