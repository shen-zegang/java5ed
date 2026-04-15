public long fib(int n) {
	if (n == 1 || n == 2) {
		return 1;
	} else {
		return fib(n - 1) + fib(n - 2);
	}
}

void main() {
    for (int i = 1; i <= 20; i++) {
	    IO.println("fib(" + i + ")=" + fib(i));
    }
		System.out.println("fib(19)/fib(20)=" + fib(19) * 1.0 / fib(20));
}

