class MyException extends Exception {
    public MyException() {
    }
    public MyException(String message) {
        super(message);
    }

    public void output() {
        System.out.println(getMessage());
    }
}
void main() {
    try {
        throw new MyException("My Exception.");
    } catch (MyException e) {
        e.output();
        System.out.println(e.getMessage());
    }
}

