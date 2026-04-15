public static int countLetters(String s) {
    int n = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
            n = n + 1;
    }
    return n;
}

public static void main(String[] args) {
    String s = "Beijing2022";
    IO.println(countLetters(s));
}

