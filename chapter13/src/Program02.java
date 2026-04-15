void main(String args[]) {
    if (args.length == 0) {
        IO.println("Usage:java Program02 filename.");
        System.exit(0);
    }
    File f = new File(args[0]);
    if (f.delete())
        IO.println("File " + args[0] + " has been deleted.");
    else
        IO.println("Can not delete file " + args[0]);
}
