import com.boda.xy.Circle;
import com.boda.xy.Rectangle;
import com.boda.xy.Shape;

public  double sumArea(Shape[] shapes){
var sumArea = 0.0;
for(var shape : shapes){
            IO.println(shape.getArea());    // 输出实际类型的面积
sumArea = sumArea + shape.getArea(); 
            } 
            return sumArea;
}

void main(){
var d = 0.0;
var shapes = new Shape[5];
for(var i=0; i < shapes.length;i++){
            d = Math.random();
            if(d > 0.5){
                shapes[i] = new Circle(1);
}else{
                shapes[i] = new Rectangle(1,2);
}
}
var sumArea = sumArea(shapes);
System.out.printf("形状的总面积=%.2f", sumArea);

}
