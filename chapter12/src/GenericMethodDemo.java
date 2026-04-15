import com.boda.xy.Pair;
import com.boda.xy.MathUtils;

void main(){
    Integer[] numbers = {1, 3, 5, 7};
    MathUtils.swap(numbers, 0, 3);
    for(Integer n:numbers){
        IO.print(n + " ");   // 输出：7 3 5 1
    }
    IO.println();
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(1, "apple");
    //调用泛型方法
    boolean same = MathUtils.compare(p1, p2);
    IO.println(same);     // 输出：false
}