import com.boda.xy.Product;

void main() {
   Product p = new Product(101,"笔记本电脑","华为",4500);
   Product p2 = new Product(101,"笔记本电脑","华为",4500);
   IO.println(p.equals(p2));
   IO.println(p.hashCode());
   IO.println(p2.hashCode());
   IO.println(p.toString());
}