void main() {
    String[] lines = { "no pains,no gains.", "well begun is half done.",
            "where there is a will,there is a way." };

    String words[];
    Map<String, Integer> wordMap = new HashMap<>();
    for (int i = 0; i < lines.length; i++) {
        words = lines[i].split("[ ,.]");
        for (String s : words) {
            Integer n = wordMap.get(s);
            if (n == null) {
                wordMap.put(s, 1);
            } else {
                wordMap.put(s, n + 1);
            }
        }
    }
    IO.println("共有" +wordMap.size()+  "个不同的单词。" );
    IO.println(wordMap);

    // 用TreeMap存放单词及数量
    Map<String, Integer> wordMap2 = new TreeMap<>(wordMap);
    IO.println(wordMap2);

}