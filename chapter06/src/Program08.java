public static void main(String[] args) {
    int max, min, a, b, c;
    a = Integer.parseInt(args[0]); // 将字符串转换为整数
    b = Integer.parseInt(args[1]);
    c = Integer.parseInt(args[2]);

    max = Math.max(Math.max(a, b), c); // 求a,b,c的最大值
    min = Math.min(Math.min(a, b), c);
    IO.println("max = " + max);
    IO.println("min = " + min);
}

