public static int gcd(int x, int y) {
    if (x > y)
        return gcd(x - y, y);
    if (x < y)
        return gcd(x, y - x);
    return x;
}
// 求最小公倍数（Least Common Multiple）
// 最小公倍数等于两数之积除以最大公约数
public static int lcm(int x, int y) {
    int gcd = gcd(x, y); // 求最大公约数
    return x * y / gcd;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IO.print("请输入正整数x：");
    int a = sc.nextInt();
    IO.print("请输入正整数y：");
    int b = sc.nextInt();
    IO.println("最大公约数=" + gcd(a, b));
    IO.println("最小公倍数=" + lcm(a, b));
}
