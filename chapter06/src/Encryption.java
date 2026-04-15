// 凯撒加密函数
public static String caesarEncrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();
    for (char c : text.toCharArray()) {
        if (Character.isUpperCase(c)) {
            // 大写字母加密
            char enc = (char) ('A' + (c - 'A' + shift) % 26);
            result.append(enc);
        } else if (Character.isLowerCase(c)) {
            // 小写字母加密
            char enc = (char) ('a' + (c - 'a' + shift) % 26);
            result.append(enc);
        } else {
            // 非字母原样输出
            result.append(c);
        }
    }
    return result.toString();
}
void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("请输入一个字符串: ");
    String input = sc.nextLine();
    IO.println("原字符串是: " + input);

    String encrypted = caesarEncrypt(input, 5);
    IO.println("加密后的字符串是: " + encrypted);
}


