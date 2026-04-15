void main() {
    // 978-7-302-32651-9
    String isbn;
    int[] digit = new int[13];
    Scanner input = new Scanner(System.in);
    IO.print("请输入13位书号：");
    isbn = input.nextLine();
    // 将每位数码存入digit数组中
    for (int i = 0; i < digit.length; i++) {
        digit[i] = isbn.charAt(i) - 48; // 字符转成整数
    }
    // 计算加权和s
    int s = digit[0] * 1 + digit[1] * 3 + digit[2] * 1 + digit[3] * 3 + digit[4] * 1 + digit[5] * 3 + digit[6] * 1
            + digit[7] * 3 + digit[8] * 1 + digit[9] * 3 + digit[10] * 1 + digit[11] * 3;
    int m = s % 10;
    int n = 10 - m; // 如果10－m的值为10则校验码取0
    if (n == 10)
        n = 0;
    if (n == digit[12]) {
        IO.println("您输入的ISBN:" + isbn + "是合法的。");
    } else {
        IO.println("您输入的ISBN:" + isbn + "是不合法的。");
    }
}

