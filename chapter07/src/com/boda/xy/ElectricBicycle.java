class Vehicle{  // 定义Vehicle车辆类
    public Vehicle(){
        IO.println("创建Vehicle对象");
    }
}
// Bicycle类扩展了Vehicle类
class Bicycle extends Vehicle{
    private String brand;
    public Bicycle(){
        this("捷安特牌");
        IO.println("创建Bicycle对象");
    }
    public Bicycle (String brand){
        this.brand = brand;
    }
}
// ElectricBicycle类扩展了Bicycle类
public class ElectricBicycle extends Bicycle{
    String factory;
    public ElectricBicycle(){
        IO.println("创建ElectricBicycle对象");
    }

}
void main(){
    ElectricBicycle myBicycle = new ElectricBicycle();
}

