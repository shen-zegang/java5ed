void main(String[] args) throws IOException {
    FileReader fr = new FileReader("proverb.txt");
    BufferedReader reader = new BufferedReader(fr);
    Set<String> uniques = new HashSet<>();
    Set<String> dups = new HashSet<>();
    String[] words = null;
    String line = null;
    while ((line = reader.readLine()) != null) {
        words = line.split("[ ,.]");
        for (String s : words) {
            if (!uniques.add(s))
                dups.add(s);
        }
    }
    // 去掉重复的单词
    uniques.removeAll(dups);
    System.out.println("不重复的单词：" + uniques);
    System.out.println("重复的单词：" + dups);
    reader.close();
    fr.close();
}

