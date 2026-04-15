import com.boda.xy.GenStack;

void main() {
    var stack = new GenStack<Integer>();
    var rand = new Random();
    // 向栈中存入5个随机生成的整数
    for (int i = 65; i < 70; i++) {
        var n = Integer.valueOf(rand.nextInt(100));
        IO.print(n + "  " );
        stack.push(n);
    }
    IO.println();
    IO.println("栈大小为： " + stack.size());
    // 弹出栈中的所有元素
    while (!stack.empty()) {
        IO.print(stack.pop() + "  ");
    }
}