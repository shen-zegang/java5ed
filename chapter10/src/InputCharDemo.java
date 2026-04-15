import java.io.*;

void main() {
		System.out.print("请输入一个字符：");
		try {
			char c = (char) System.in.read();
			System.out.println("c = " + c);
		} catch (IOException e) {
			System.out.println(e);
		}
}
