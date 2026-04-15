void main() {
    double a, b, c, discrim;
    double root1, root2;
    Scanner input = new Scanner(System.in);
    IO.println("请输入a,b,c的值：");
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    discrim = b * b - 4 * a * c;
    if (discrim < 0) {
        IO.println("方程无实根");
    } else {
        root1 = (-b + Math.sqrt(discrim)) / (2 * a);
        root2 = (-b - Math.sqrt(discrim)) / (2 * a);
        IO.println("第一个根是：" + root1);
        IO.println("第二个根是：" + root2);
    }
}

