public static double min(double... array) {
    if (array.length == 0)
        return 0;
    double min = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < min)
            min = array[i];
    }
    return min;
}

void main(String[] args) {
    //double []a = new double[0];
    double[] a = {75, 53, 32, 12, 46, 199, 17, 54};
    double min = min(a);
    System.out.println("min=" + min);
}
