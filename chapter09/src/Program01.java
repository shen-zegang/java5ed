public interface Swimmable {
    void swim();
}
public interface Flyable {
    void fly();
}
public class Duck implements Swimmable, Flyable {
    @Override
    public void swim(){
        IO.println("I can swim.");
    }
    @Override
    public void fly(){
        IO.println("I can fly.");
    }
}
void main() {
    Duck d = new Duck();
    d.swim();
    d.fly();
    Swimmable s = d;   // 自动类型转换
    s.swim();          //
}