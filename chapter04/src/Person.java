public class Person{
    public String name;
    public int age;
    public Person(){
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        IO.println("我叫 " + name + ",今年 " + age + "岁");
    }
}
