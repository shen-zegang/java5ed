void main() {
    Consumer<String> con =s -> IO.println(s);

    con.accept("hello,world");

}
