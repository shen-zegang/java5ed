import com.boda.xy.Direction;

void main() {
    // 声明一个枚举类型变量，并用一个枚举赋值
    var west = Direction.WEST;
    var east = Direction.EAST;
    IO.println(east.compareTo(west));   // -2


    // 输出每个枚举对象及序号
    for (Direction d : Direction.values()) {
        IO.println(d.name() + ",序号" + d.ordinal());
    }
}
