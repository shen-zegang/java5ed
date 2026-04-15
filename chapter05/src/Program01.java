void main() {
    double[] a = {75, 53, 32, 12, 46, 199, 17, 54};
    double sum, max, min, avg;
    max = a[0];
    min = a[0];
    sum = a[0];
    for (int i = 1; i < a.length; i++) {
        sum = sum + a[i];
        if (a[i] >= max)
            max = a[i];
        if (a[i] <= min)
            min = a[i];
    }
    avg = ((double) sum) / a.length;
    IO.println("max=" + max);
    IO.println("min=" + min);
    IO.println("sum=" + sum);
    IO.println("avg=" + avg);
}
