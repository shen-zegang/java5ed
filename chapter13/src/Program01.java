void main(String args[]) {
    if (args.length < 2) {
        IO.println("Usage:Program01 sourcefile destfile.");
        return;
    }
    File rsc = new File(args[0]);
    File dst = new File(args[1]);
    if (!rsc.exists()) {
        IO.println("Source File does not exists.");
        return;
    }
    if (dst.exists()) {
        IO.println("Destinamtion File exists.");
        return;
    }
    if (rsc.renameTo(dst))
        IO.println("Filename has been changed.");
    else
        IO.println("Filename can not be changed.");
}

