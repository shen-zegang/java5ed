class Outer {
    class Inner {
        public void show() {
            System.out.println("Inner Class");
        }
    }

    public Inner makeInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.makeInner();
        inner.show();
    }
}