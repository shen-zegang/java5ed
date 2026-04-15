void main(){
    int[] a = {1,2,3,4};
    int[] b ={8,7,6,5,4,3,2,1};
    int[] c = {10,20};
    try{
        System.arraycopy(a, 0, b, 0, a.length);
        // 下面语句发生异常，目标数组c容纳不下原数组a的元素
        System.arraycopy(a, 0, c, 0, a.length);
     }catch(ArrayIndexOutOfBoundsException e){
        IO.println(e);
     }
     for(int elem: b){
        IO.print(elem+"  ");
     }
     IO.println();
     for(int elem: c){
       IO.print(elem+"  ");
     }
    IO.println("\n");
}
