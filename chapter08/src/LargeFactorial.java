public BigInteger factorial(long n) {
	BigInteger result = BigInteger.ONE; // BigInteger.ONE常量，表示1
	for (long i = 1; i <= n; i++) {
		result = result.multiply(new BigInteger(i + ""));
	}
	return result;
}

void main() {
	IO.println("50! is \n" + factorial(50));
}
