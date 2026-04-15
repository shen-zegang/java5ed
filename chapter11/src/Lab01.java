import com.boda.xy.Product;
void main() {
    Product p = new Product(101, "笔记本电脑", "联想", 4500);
    Product p2 = new Product(102, "智能手机", "华为", 3200);
    IO.println(p.hashCode());
    IO.println(p2.hashCode());
    IO.println(p.equals(p2));
    IO.println(p);
}
