void main() {
		// 声明一个路径和一个文件对象
		Path path = Paths.get("D:\\study\\demo"), file = Paths.get("D:\\study\\demo\\report.txt");
		try {
			if (!Files.exists(path))
				path = Files.createDirectory(path); // 创建路径
			if (!Files.exists(file))
				file = Files.createFile(file); // 创建文件
		} catch (FileAlreadyExistsException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		IO.println(Files.exists(file));
		IO.println(Files.isReadable(file));
		try {
			Files.delete(path); // 删除路径
		} catch (NoSuchFileException x) {
			IO.println("No such file " + path);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("The directory is not empty");
		} catch (IOException x) {
			// 文件许可问题在此捕获
			System.err.println(x);
		}

}
