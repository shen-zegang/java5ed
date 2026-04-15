
void main() {
    String[] names = {"Shanghai", "Guangzhou", "Beijing", "London"};

    Arrays.sort(names, (a, b) ->  b.compareTo(a) );

    for (String n : names) {
        System.out.println(n);
    }
}

