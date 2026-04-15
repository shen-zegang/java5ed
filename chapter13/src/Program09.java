void main(String[] args) {
    Path path = Paths.get("D:\\study\\speech.txt");
    Charset charset = Charset.forName("UTF-8");
    List<String> linesRead = null;
    try {
        if (Files.notExists(path)) {
            throw new NoSuchFileException("File does not exists.");
        }
        linesRead = Files.readAllLines(path, charset);
    } catch (IOException e) {
        e.printStackTrace();
    }
    if (linesRead != null) {
        for (String line : linesRead) {
            System.out.println(line);
        }
    }
}

