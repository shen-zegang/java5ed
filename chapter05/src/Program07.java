public static int[] arrayMerge(int[] a, int[] b) {
    int size = a.length + b.length;
    int[] result = new int[size];
    for (int i = 0; i < a.length; i++) {
        result[i] = a[i];
    }
    for (int i = a.length; i < size; i++) {
        result[i] = b[i - a.length];
    }
    Arrays.sort(result);
    return result;
}

void main() {
    int a[] = {16, 13, 15, 18};
    int b[] = {29, 36, 100, 9};
    int r[] = arrayMerge(a, b);
    for (int n : r) {
        System.out.print(n + "  ");
    }
}

