void main() {
    Set<String> ts = new TreeSet<>();
    String[] s = new String[]{"one","two","three","four"};

    for (var i = 0; i < s.length; i++){
        ts.add(s[i]);
    }
    IO.println(ts);
}