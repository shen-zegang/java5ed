public static int[] locateLargest(double[][] a) {
    int[] index = new int[2];
    double max = a[0][0];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] > max) {
                max = a[i][j];
                index[0] = i;
                index[1] = j;
            }
        }
    }
    return index;
}

void main() {
    int row = 0, col = 0;
    Scanner input = new Scanner(System.in);
    IO.println("请输入行和列值：");
    row = input.nextInt();
    col = input.nextInt();
    double[][] value = new double[row][col];
    IO.println("请输入每行元素值：");
    for (int i = 0; i < value.length; i++) {
        for (int j = 0; j < value[0].length; j++) {
            value[i][j] = input.nextDouble();
        }
    }
    int[] index = new int[2];
    index = locateLargest(value);
    IO.println("最大元素的位置是(" + index[0] + "," + index[1] + ")。");
}

