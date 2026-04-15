public class Rectangle{
    double height;
    double width;
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(1.0,1.0);
    }
    public void setHeight (double height){
        this.height = height;
    }
    public double getHeight (){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getPerimeter(){
        return 2*(height + width);
    }
    public double getArea(){
        return height * width;
    }
}
void main() {
    Rectangle rect = new Rectangle();
    rect.setHeight(20);
    rect.setWidth(10);
    IO.println("该矩形的长为：" + rect.getHeight());
    IO.println("该矩形的宽为：" + rect.getWidth());
    IO.println("该矩形的周长为：" + rect.getPerimeter());
    IO.println("该矩形的面积为：" + rect.getArea());
}