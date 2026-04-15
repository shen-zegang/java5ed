import com.boda.xy.Product;

public static void main(String[] args) throws CloneNotSupportedException {
    Product p = new Product(108, "笔记本电脑", "Lenovo", 4500);
    Product p2 = new Product(108, "笔记本电脑", "Lenovo", 4500);
    IO.println(p);
    IO.println(p.equals(p2));
    IO.println(p.hashCode());
    //p2 = (Product) p.clone();
    IO.println(p2);
    IO.println(p2.hashCode());
    IO.println(p == p2);
}



