void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("请输入半径值：");
    try {
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("area = %.2f%n", area);
    } catch (InputMismatchException e) {
        IO.println(e);
        IO.println("数字格式不正确!");
    }
}

