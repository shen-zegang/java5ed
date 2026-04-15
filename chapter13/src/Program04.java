void main() throws IOException {
    // 生成10个整数，并写到out.dat文件中
    try (FileOutputStream fos = new FileOutputStream("out.dat");
         BufferedOutputStream bos = new BufferedOutputStream(fos);
         DataOutputStream dos = new DataOutputStream(bos);) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 1001) + 1000;
            IO.println(num);
            dos.writeInt(num);
        }
    }
    // 从out.dat文件中读出10个整数并排序
    try (FileInputStream fis = new FileInputStream("out.dat");
         BufferedInputStream bis = new BufferedInputStream(fis);
         DataInputStream dis = new DataInputStream(bis);) {
        int data[] = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i] = dis.readInt();
            IO.println(data[i]);
        }
    }
}
