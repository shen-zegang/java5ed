void main() {
    var input = new Scanner(System.in);
    var filename = "";
    IO.print("请输入文本文件名: ");
    filename = input.nextLine();
    var file = new File(filename);
    if (!file.exists()) {
        IO.println("您输入的文件不存在！ ");
        System.exit(0);
    }
    try (
            var fis = new BufferedReader(new FileReader(file));
    ) {
        var charNums = 0;
        var wordsNums = 0;
        var lineNums = 0;
        var aLine = fis.readLine();
        while (aLine != null) {
            charNums = charNums + aLine.length();
            var words = aLine.split("[ ,;.!]");   // 5个符号
            wordsNums = wordsNums + words.length;
            lineNums = lineNums + 1;
            aLine = fis.readLine();
        }
        IO.println("文件 = " + filename);
        IO.println("共有行数 = " + lineNums + "行");
        IO.println("单词数 = " + wordsNums + "个");
        IO.println("总共字符数 = " + charNums + "个");
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}
