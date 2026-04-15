void main(String[] args) {
    for (int i = 0; i < args.length - 1; i++)
        for (int j = i + 1; j < args.length; j++)
            if (args[i].compareTo(args[j]) > 0) {
                String t = new String();
                t = args[j];
                args[j] = args[i];
                args[i] = t;
            }
    for (int i = 0; i < args.length; i++)
        IO.println(args[i]);
}
