public int gcd(int m, int n) {
    if (n == 0) {
        return m;
    }
    return gcd(n, m % n);
}

void main(String[] args){
    Scanner input = new Scanner(System.in);
    IO.print("请输入第1个整数:");
    int m = input.nextInt();
    IO.print("请输入第2个整数:");
    int n = input.nextInt();
    // 求m和n的最大公约数
    IO.println(m +" 与 "+ n +" 的最大公约数是"+gcd(m,n));
}
