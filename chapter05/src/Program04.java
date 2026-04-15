void main() {
    int[] intArray = new int[]{1, 2, 3, 4, 5, 60, 70, 80, 90, 100};
    for (int i : intArray) {
        IO.print("  " + i);
    }
    System.out.println();
    for (int i = 0; i < intArray.length / 2; i++) {
        int temp = intArray[i];
        intArray[i] = intArray[intArray.length - 1 - i];
        intArray[intArray.length - 1 - i] = temp;
    }
    for (int i : intArray) {
        IO.print("  " + i);
    }
}

