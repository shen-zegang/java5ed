void main() {
    double[] numbers = {79, 84.5, 63, 90, 98};
    double sum, max, min, avg;
    max = numbers[0];
    min = numbers[0];
    sum = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        sum = sum + numbers[i];
        if (numbers[i] >= max)
            max = numbers[i];
        if (numbers[i] <= min)
            min = numbers[i];
    }
    avg = ((double) sum) / numbers.length;
    IO.println("max=" + max);
    IO.println("min=" + min);
    IO.println("sum=" + sum);
    IO.println("avg=" + avg);
}

