void main() {
	var outputFile = new File("output.dat");
	try (var out = new FileOutputStream(outputFile);
    ) {
		for (var i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 90) + 10;
			out.write(x);
		}
		out.flush(); // 刷新输出流
		IO.println("已向文件写入10个两位数！");
	} catch (IOException e) {
		IO.println(e.toString());
	}
}
