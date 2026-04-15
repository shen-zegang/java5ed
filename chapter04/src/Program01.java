public class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        IO.println("姓名：" + name);
        IO.println("年龄：" + age);
    }
}

void main() {
    Person p = new Person();
    p.setName("张大海");
    p.setAge(20);
    p.speak();
    IO.println(p.getName());
    IO.println(p.getAge());
}