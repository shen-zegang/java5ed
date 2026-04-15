void main() {
    Scanner scanner = new Scanner(System.in);
    int n;

    // 输入奇数
    do {
        System.out.print("请输入魔方矩阵的大小（1-99）: ");
        n = scanner.nextInt();
    } while (n < 1 || n > 99 || n % 2 == 0);

    int[][] magic = new int[n][n];

    // 暹罗法构造魔方阵
    int num = 1;
    int row = 0;
    int col = n / 2;

    while (num <= n * n) {
        magic[row][col] = num;

        // 保存当前位置
        int nextRow = (row - 1 + n) % n;
        int nextCol = (col + 1) % n;

        // 如果下一个位置已被占用，则下移一行
        if (magic[nextRow][nextCol] != 0) {
            row = (row + 1) % n;
        } else {
            row = nextRow;
            col = nextCol;
        }

        num++;
    }

    // 输出魔方阵
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%4d", magic[i][j]);
        }
        System.out.println();
    }
}