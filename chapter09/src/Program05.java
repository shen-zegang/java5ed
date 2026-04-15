public class Outer {
    protected Inner ic;
    public Outer() {
        ic = new Inner ();
    }
    public void displayStrings() {
        IO.println(ic.getString() + ".");
        IO.println(ic.getAnotherString() + ".");
    }
    // 内部类定义
    protected class Inner {
        public String getString() {
            return "Inner: getString invoked";
        }
        public String getAnotherString() {
            return "Inner: getAnotherString invoked";
        }
    }
}

void main() {
    Outer mc = new Outer();
    mc.displayStrings();
}