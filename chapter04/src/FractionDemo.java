import com.boda.xy.Fraction;

void main() {
    Fraction a = new Fraction (1, 3);
    Fraction b = new Fraction (1, 2);
    IO.println("a + b="+a.add(b));
    IO.println("a - b="+a.subtract(b));
    IO.println("a * b="+a.multiply(b));
    IO.println("a / b="+a.divide(b));
}
