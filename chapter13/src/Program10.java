void main(String args[]) throws IOException {
    int i = 0;
    IO.print("Enter a character:");
    i = System.in.read();
    if (i < 65 || i > 90 && i < 97 || i > 122)
        IO.println("Error:");
    if (i >= 65 && i <= 90)
        i = 155 - i;
    if (i >= 97 && i <= 122)
        i = 219 - i;
    IO.println("Result:" + (char) i);
}

