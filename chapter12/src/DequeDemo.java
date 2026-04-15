void main() {
    int[] elements = {1,2,3,0,7,8,9};
    var queue =  new ArrayDeque<Integer>();
    queue.addFirst(5);     //   5

    for(var i = 0; i < 3;i++){
        queue.addFirst(elements[i]);  // 3  2  1  5
    }
    for(var i = 4; i < 7;i++){
        queue.offerLast(elements[i]);  // 3  2  1  5  7  8  9
    }
    for(Integer v: queue){
        IO.print(v +"  ");   // 访问queue中每个元素
    }
    IO.println("\n队列大小 = "+queue.size());

}