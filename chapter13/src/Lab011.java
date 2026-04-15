void main(String args[]) throws IOException {
    try (
            FileOutputStream fos = new FileOutputStream("out.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
    ) {
        for (var i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 1001) + 1000;
            IO.println(num);
            dos.writeInt(num);
        }
    }
    IO.println("写入数据完成！");
}


