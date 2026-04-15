import com.boda.xy.IntStack;
import java.util.Random;

void main() {
	var stack = new IntStack();
	var rand = new Random();
    // 向栈中存入11个随机生成的整数
	for (int i = 0; i <= 10; i++) {
		var n = Integer.valueOf(rand.nextInt(100));
		IO.print(n + " ");
		stack.push(n);
	}
	IO.println();
	IO.println("栈大小为： " + stack.getSize());
// 弹出栈中的所有元素
	while (!stack.isEmpty()) {
		IO.print(stack.pop() + " ");
	}
//	IO.print(stack.pop() + " ");
}
