public static String sort(String s) {
    char[] ch = s.toCharArray();
    for (int i = 0; i < ch.length - 1; i++) {
        for (int j = i + 1; j < ch.length; j++) {
            if (ch[i] > ch[j]) {
                char t = ch[j];
                ch[j] = ch[i];
                ch[i] = t;
            }
        }
    }
    String str = new String(ch);
    return str;
}
void main() {
    String s = "morning";
    IO.println(sort(s));
}

