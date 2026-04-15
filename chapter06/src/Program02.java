void main() {
    String s1, s2;
    Scanner input = new Scanner(System.in);
    IO.print("请输入第一个字符串：");
    s1 = input.nextLine();
    IO.print("请输入第二个字符串：");
    s2 = input.nextLine();
    IO.println("字符串" + s2
            + (s1.indexOf(s2) > 0 ? "是" : "不是") + "字符串"
            + s1 + "的子串。");
}

