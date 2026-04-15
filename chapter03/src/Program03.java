void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("请输入4个整数：");

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    int max1, min1;
    int max2, min2;
    // 第一组比较（a, b）
    if (a > b) {
        max1 = a;
        min1 = b;
    } else {
        max1 = b;
        min1 = a;
    }
    // 第二组比较（c, d）
    if (c > d) {
        max2 = c;
        min2 = d;
    } else {
        max2 = d;
        min2 = c;
    }
    int max, min;
    // 比较两组最大值
    if (max1 > max2) {
        max = max1;
    } else {
        max = max2;
    }
    // 比较两组最小值
    if (min1 < min2) {
        min = min1;
    } else {
        min = min2;
    }
    IO.println("最大值是: " + max);
    IO.println("最小值是: " + min);
    scanner.close();
}

