void main() {
    Scanner input = new Scanner(System.in);
    IO.print("请输入出生年份:");
    int year = input.nextInt();
    String animal = "";
    switch (year % 12) {
        case 4 -> animal = "鼠";
        case 5 -> animal = "牛";
        case 6 -> animal = "虎";
        case 7 -> animal = "兔";
        case 8 -> animal = "龙";
        case 9 -> animal = "蛇";
        case 10 -> animal = "马";
        case 11 -> animal = "羊";
        case 0 -> animal = "猴";
        case 1 -> animal = "鸡";
        case 2 -> animal = "狗";
        case 3 -> animal = "猪";
    }
    IO.println("你的属相是：" + animal);
}
