void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("请输入出生月份：");
    int month = scanner.nextInt();

    System.out.print("请输入出生日期：");
    int day = scanner.nextInt();

    String xz = "";

    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        xz = "白羊座";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        xz = "金牛座";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
        xz = "双子座";
    } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
        xz = "巨蟹座";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        xz = "狮子座";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        xz = "处女座";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
        xz = "天秤座";
    } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
        xz = "天蝎座";
    } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
        xz = "射手座";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        xz = "摩羯座";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        xz = "水瓶座";
    } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
        xz = "双鱼座";
    } else {
        xz = "输入的日期无效！";
    }
    IO.println("你的星座是：" + xz);
    scanner.close();
}

