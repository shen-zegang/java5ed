void main() {
		Stream<String> stream1 = Stream.of("Beijing", "Shanghai");
		Stream<String> stream2 = Stream.of("Sydney", "London", "Paris");
		Stream.concat(stream1, stream2).sorted().forEach(IO::println);
}
