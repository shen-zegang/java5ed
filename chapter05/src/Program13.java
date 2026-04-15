public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + "  ");
        }
        System.out.println();
    }
    System.out.println();
}

void main() {
    int[][] a = {{1, 3, 5}, {-3, 6, 0}, {13, -5, 7}, {-2, 19, 25}};
    int[][] b = {{0, -1, -2}, {7, -1, 6}, {-6, 13, 2}, {12, -8, -13}};
    int[][] sum = new int[4][3];
    int[][] minus = new int[4][3];
    int[][] transpose = new int[a[0].length][a.length];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            sum[i][j] = a[i][j] + b[i][j];
            minus[i][j] = a[i][j] - b[i][j];
        }
    }
    //求a的转置
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[0].length; j++) {
            transpose[i][j] = a[j][i];
        }
    }
    printArray(sum);
    printArray(minus);
    printArray(transpose);
}

