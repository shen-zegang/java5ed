void main() throws Exception {
    String fileName = "article.txt";
    int sum = 0;
    try (
            FileReader inFile = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(inFile);
    ) {
        String aLine = reader.readLine();
        while (aLine != null) {
            String[] words = aLine.split("[ ,.]");
            sum = sum + words.length;
            aLine = reader.readLine();
        }
    } catch (IOException e) {
        IO.println(e.toString());
    }
    IO.println("单词数量为：" + sum);
}

