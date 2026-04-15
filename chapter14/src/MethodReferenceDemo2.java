void main() {
    String[] names = {"one", "ONE", "two", "TWO"};
    //Arrays.sort(names, (x,y) -> x.compareToIgnoreCase(y));

    Arrays.sort(names, String::compareToIgnoreCase);

    for (String n : names) {
        System.out.println(n);
    }
}
