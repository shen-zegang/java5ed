import com.boda.xy.Customer;

void main() {
    var customer = new Customer("张明月","北京市海淀区");
    var customer2 = new Customer("李大海","上海市科技路20号");
    IO.println("姓名：" + customer.name());
    IO.println("地址：" + customer.address());
    IO.println(customer.toString());
    IO.println(customer.equals(customer2));
    IO.println(customer.hashCode());
    IO.println(customer2.hashCode());
}
