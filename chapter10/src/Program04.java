void main() {
    try {
        throw new Exception("demo exception");
    } catch (Exception e) {
        IO.println(e.getMessage());
    } finally {
        IO.println("Program finished.");
    }
}

