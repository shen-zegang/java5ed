void main() {
    double r = 0;
    Scanner input = new Scanner(System.in);
    IO.print("请输入圆的半径：");
    r = input.nextDouble();
    System.out.printf("圆的面积是%.2f\n", Math.PI * r * r);
    String s = String.format("圆的面积是%.2f", Math.PI * r * r);
    IO.println(s);
}

