public static String toBinary(int value) {
    String s = "";
    while (value != 0) {
        int r = value % 2;  // 反复除以2取余数
        s = r + s;
        value = value / 2;
    }
    return s;
}
void main() {
    int n = 97;
    IO.println(toBinary(n));
}

