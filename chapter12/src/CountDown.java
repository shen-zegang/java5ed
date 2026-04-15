void main() {
    int time = 10;
    var queue = new LinkedList<Integer>();
    for(var i = time; i > 0; i --){
        queue.add(i);      // 将10到1存储到队列中
    }
    while(!queue.isEmpty()){
        IO.print(queue.remove() + "   ");     // 从队列中删除一个元素
        try{
            Thread.sleep(1000);   // 当前线程睡眠1秒钟
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    IO.print("点  火！");
}