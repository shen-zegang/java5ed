void main() {
    String s = "no pains,no gains";
    String[] words = s.split("[, ]");
    for (int i = 0; i < words.length; i++)
        IO.println(words[i]);
}

