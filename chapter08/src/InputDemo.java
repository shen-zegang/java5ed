void main(){
    var sb = new StringBuilder();
    try {
        char c = (char) System.in.read();
        while (c != '\r' && c != '\n') {
            sb.append(c);
            c = (char) System.in.read();
        }
    } catch (IOException e) {
    }
    String input = sb.toString();
    IO.println(input);
}
