import com.boda.xy.Mammal;
import com.boda.xy.Student;

void main() {
    Student s = new Student();
    s.eat();    // 默认方法可被子接口和子类继承
    s.speak();  // 编译错误，说明静态方法不被继承
    Mammal.speak();  // 正确，说明只能用定义它的类型调用
    s.work();
}

