public double average(double ... values){
    var sum = 0.0;
    for(var value:values){
        sum = sum + value;   // 求数组元素之和
    }
    double average = sum / values.length;
    return average;
}

void main() {
    IO.println(average(60,70,86));     // 输出：72.0
}