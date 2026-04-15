void main(String[] args) {
    Path path = Paths.get(args[0]);
    try (
            DirectoryStream<Path> children = Files.newDirectoryStream(path)
    ) {
        for (Path child : children) {
            IO.println(child.toString());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
