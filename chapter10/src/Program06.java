class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public void output() {
        IO.println(getMessage());
    }
}

void main() {
    try {
        throw new MyException("My Exception.");
    } catch (MyException e) {
        e.output();
        IO.println(e.getMessage());
    }
}

