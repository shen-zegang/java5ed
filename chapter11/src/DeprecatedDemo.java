
class DeprecatedDemo {
    @Deprecated
    public void badMethod(){
        IO.println("该方法已被弃用");
    }
}

void main(){
    DeprecatedDemo dd = new DeprecatedDemo();
    dd.badMethod();
    Date d = new Date(2017,10,30);
    IO.println(d.getMonth());
}