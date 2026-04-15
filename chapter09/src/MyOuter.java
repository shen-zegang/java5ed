import com.boda.xy.Outer;
void main() {
    //var outer = new Outer();
    var inner = new Outer().new Inner();
    IO.println(inner.calculate());  // 输出：500
}