void main() {
    Set<String> uniques = new HashSet<>();
    Set<String> dups = new HashSet<>();
    String message = "i came i saw i left";
    String[] words = message.split(" ");
    for (String a : words)
        if (!uniques.add(a))
            dups.add(a);
    IO.println("不同单词的个数：" + uniques.size());
    // 去掉重复的单词
    uniques.removeAll(dups);
    IO.println("不重复的单词：" + uniques);
    IO.println("重复的单词：" + dups);
}