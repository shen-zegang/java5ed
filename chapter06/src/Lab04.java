void main(String[] args) {
    IO.println("The command line has " + args.length + " arguments");
    for (int i = 0; i < args.length; i++) {
        IO.println("argument number " + i + ":" + args[i]);
    }
}
