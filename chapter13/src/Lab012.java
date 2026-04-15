void main(String args[]) throws IOException {
    int[] number = new int[100];    // 存放读出的整数
    try (
            FileOutputStream fos = new FileOutputStream("sort.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            var input = new FileInputStream("out.dat");
            var dataInStream = new DataInputStream(
                    new BufferedInputStream(input));
    ) {
        for (int i = 0; i < 100; i++) {
            number[i] = dataInStream.readInt();
        }

        Arrays.sort(number);      // 对number数组排序
        for (int n : number) {
            dos.writeInt(n);     // 写入文件
            IO.println(n);
        }
    }
}

