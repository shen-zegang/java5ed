void main(){
    StringBuilder ss=new StringBuilder("Hello");
    IO.println(ss.length());
    IO.println(ss.capacity());
    ss.append("Java");
    IO.println(ss);
    IO.println(ss.insert(5,","));
    IO.println(ss.replace(6,10,"World!"));
    IO.println(ss.reverse());
}

