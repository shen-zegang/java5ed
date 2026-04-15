void main() {
    Scanner input = new Scanner(System.in);
    int n;
    IO.print("请输入矩阵的大小:");
    n = input.nextInt();
    int[][] num = new int[n][n];
    int[][] result = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            num[i][j] = (i * n) + (j + 1);
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%5d", num[i][j]);
        }
        IO.print("\n");
    }
    IO.print("\n");

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            result[j][n - 1 - i] = num[i][j];
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%5d", result[i][j]);
        }
        IO.println();
    }
}

