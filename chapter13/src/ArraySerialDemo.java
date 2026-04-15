void main() throws Exception {

    int[] numbers = {1, 2, 3, 4, 5};
    String[] cities = {"北京", "上海", "广州"};
    // 序列化
    try (
            FileOutputStream output = new FileOutputStream("array.dat", true);
            ObjectOutputStream oos = new ObjectOutputStream(output);
    ) {
        oos.writeObject(numbers);    // 将numbers数组写入文件
        oos.writeObject(cities);     // 将cities数组写入文件
    } catch (IOException e) {
        e.printStackTrace();
    }
    // 反序列化
    try (
            FileInputStream input = new FileInputStream("array.dat");
            ObjectInputStream ois = new ObjectInputStream(input);
    ) {
        // 读取数组对象
        int[] newNumbers = (int[]) ois.readObject();
        String[] newStrings = (String[]) ois.readObject();
        for (int n : newNumbers)
            IO.print(n + "  ");
        IO.println();

        for (String s : newStrings)
            IO.print(s + "  ");
    }
}
