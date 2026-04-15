public static int gcd(int m, int n) {
    if (m % n == 0) {
        return n;
    } else {
        return gcd(n, m % n);
    }
}

void main() {
    int m, n;
    Scanner input = new Scanner(System.in);
    IO.print("请输入整数m:");
    m = input.nextInt();
    IO.print("请输入整数n:");
    n = input.nextInt();
    int gcd = gcd(m, n);
    IO.println(m + "和" + n + "的最大公约数是" + gcd);
}
