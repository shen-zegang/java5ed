void main() {
		Path parent = Paths.get(".");
		try {
			Stream<Path> list = Files.walk(parent);
			list.filter((Path p) -> p.toString().endsWith(".java")).forEach(System.out::println);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

}
