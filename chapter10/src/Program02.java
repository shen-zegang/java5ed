void main() {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    do {
        try {
            IO.print("请输入两个整数：");
            int a = input.nextInt();
            int b = input.nextInt();
            IO.println("a + b = " + (a + b));
            continueInput = false;
        } catch (InputMismatchException e) {
            IO.println("输入数据错误！请重新输入！");
            input.nextLine(); //丢弃当前行
        }
    } while (continueInput);
}

