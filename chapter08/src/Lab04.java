void main() {
    BigInteger result;
    BigInteger a = new BigInteger("9876543210123456789");
    BigInteger b = new BigInteger("9876543210123456789");
    result = a.multiply(b);
    IO.println(result);

    BigDecimal m = BigDecimal.valueOf(2.0);
    BigDecimal n = BigDecimal.valueOf(0.9);
    IO.println(m.subtract(n));
}

