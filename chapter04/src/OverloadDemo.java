public void display (int a){
        IO.println("a = "+a);
}
    public void display (double d){
        IO.println("d = "+d);
    }
    public void display(){
        IO.println("无参数方法");
    }
    public void display(int a,int b){
        IO.println("a = "+a+",b = "+b);
    }
void main(){

        display();
        display(10);
        display(50,60);
        display(100.0);

}

