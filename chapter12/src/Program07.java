void main() {
    int elem[]= new int[20];
    HashSet<Integer> hs=new HashSet<>();
    TreeSet<Integer> ts=new TreeSet<>();

    for(int i = 0;i < 20;i++){
        elem[i]=(int)(Math.random()*90+10);
        hs.add(elem[i]);
        ts.add(elem[i]);
    }
    for(Integer n : hs) {
        IO.print(n + "  ");
    }
    IO.println();
    Iterator<Integer> it = ts.iterator();
    while(it.hasNext()){
        Integer n = (Integer)it.next();
        IO.print(n + "  ");
    }
}
