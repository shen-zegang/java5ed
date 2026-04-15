public static void methodA() throws IOException {
    IO.println("In method A");
}
public static void methodB() {
    methodA();
    IO.println("In method B");
}
void main() {
    methodB();
}

