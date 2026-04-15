void main(String[] args) {
      Predicate<String> five = input ->input.length() > 5;

      String hello = "hello";
      IO.println(five.negate().test(hello));
}

