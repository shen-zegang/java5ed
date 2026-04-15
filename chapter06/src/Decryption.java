// 凯撒解密函数
public static String caesarDecrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();

    for (char c : text.toCharArray()) {
        if (Character.isUpperCase(c)) {
            result.append((char) ('A' + (c - 'A' - shift + 26) % 26));
        } else if (Character.isLowerCase(c)) {
            result.append((char) ('a' + (c - 'a' - shift + 26) % 26));
        } else {
            result.append(c); // 非字母保持不变
        }
    }

    return result.toString();
}

void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("请输入需解密的字符串: ");
    String input = sc.nextLine();
    IO.println("加密的字符串是: " + input);

    String decrypt = caesarDecrypt(input, 5);
    IO.println("解密后的字符串是: " + decrypt);

}
