public static int[] sumArray(int[] a, int[] b) {
    int size = Math.max(a.length, b.length);
    a = Arrays.copyOf(a, size);
    b = Arrays.copyOf(b, size);
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
        result[i] = a[i] + b[i];
    }
    return result;
}

void main() {
    int[] a = {1, 2, 4};
    int[] b = {2, 4, 6, 8};
    int[] c = sumArray(a, b);
    for (int n : c) {
        IO.print(n + "  ");  //={3,6,10,8}
    }
}
