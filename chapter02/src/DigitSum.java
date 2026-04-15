void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入一个三位数：");
    int n = input.nextInt();
    System.out.print("各位数字之和为：");
    int d1 = n % 10;                        // 个位数
    int d2 = (n/10) % 10;                  // 十位数
    int d3 = n / 100;                       // 百位数
    System.out.print(d1 + d2 + d3);
}