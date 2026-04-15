
    private int x = 200;
    public class Inner{
        int y = 300;
        public int calculate(){
            return x + y;
        }
    }
    public void makeInner(){
        Inner ic = new Inner();  // 创建内部类对象
        IO.println(ic.calculate());

}

void main() {
//    var outer = new Outer ();
    var inner = new Inner ();
    this.makeInner();
    IO.println(inner.calculate());    // 输出：500
}