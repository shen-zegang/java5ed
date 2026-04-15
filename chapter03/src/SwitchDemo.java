void main() {
    Scanner input = new Scanner(System.in);
    IO.print("输入一个季节（1,2,3,4）：");
    int season = input.nextInt();
    switch (season) {
        case 1 -> IO.println("春雨惊春清谷天");
        case 2 -> IO.println("夏满忙夏暑相连");
        case 3 -> IO.println("秋处露秋寒霜降");
        case 4 -> IO.println("冬雪雪冬小大寒");
        default ->  IO.println("季节输入非法.");
    }
}

