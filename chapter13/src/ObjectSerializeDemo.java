import com.boda.xy.Customer;

void main() {
    Customer customer = new Customer(
                      101, "刘明", "北京市海淀区");
    LocalDate today = LocalDate.now();
    // 序列化
    try (
        OutputStream output =  new FileOutputStream("customer.dat");
        ObjectOutputStream oos = new ObjectOutputStream(output)) {
        oos.writeObject(customer);   // 写入一个客户对象
        oos.writeObject(today);       // 写入一个日期对象
    } catch (IOException e) {
        e.printStackTrace();
    }
    // 反序列化
    try (
        InputStream input = new FileInputStream("customer.dat");
        ObjectInputStream ois = new ObjectInputStream(input)) {
        while (true) {
            try {
                customer = (Customer) ois.readObject();
                IO.println("客户号:" + customer.id);
                IO.println("姓名:" + customer.name);
                IO.println("地址:" + customer.address);
                today = (LocalDate) ois.readObject();
                IO.println("日期:" + today);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (ClassNotFoundException | IOException e) {
        e.printStackTrace();
    }
}
