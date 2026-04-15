void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("请输入第1个整数：");
    int max = sc.nextInt();
    int min = max;
    for (int i = 2; i <= 10; i++) {
        IO.print("请输入第" + i + "个整数：");
        int num = sc.nextInt();
        if (num > max) max = num;
        if (num < min) min = num;
    }
    IO.println("max= " + max);
    IO.println("min= " + min);
}

