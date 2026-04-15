import com.boda.xy.Box;
import com.boda.xy.Consumer;
import com.boda.xy.Producer;

void main() {
	  Box box = new Box();
	  Producer p = new Producer(box);   // 将box对象传递给生产者
	  Consumer c = new Consumer(box);   // 将box对象传递给消费者
	  p.start();
	  c.start();
}
