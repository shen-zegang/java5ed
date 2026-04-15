void main() {
    Scanner input = new Scanner(System.in);
    int index;
    Random r = new Random();
    int[] numbers = new int[100];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = r.nextInt(100);
        IO.println(numbers[i]);
    }
    IO.print("请输入一个下标值：");
    try {
        index = input.nextInt();
        IO.println(numbers[index]);
    } catch (IndexOutOfBoundsException oe) {
        IO.println("下标越界");
    }
}
