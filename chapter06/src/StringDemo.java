void main() {
    char []chars1 = {'A','B','C'};
    char []chars2 = {'中','国','π','α','M','N'};
    var s1 = new String(chars1);
    var s2 = new String(chars2, 0, 4);
    IO.println("s1 = " + s1);    // 输出：s1 = ABC
    IO.println("s2 = " + s2);    // 输出：s2 = 中国πα

}