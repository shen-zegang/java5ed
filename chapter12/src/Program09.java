void main() {
    int[] ia = {1,5,3,7,6,9,8};
    PriorityQueue<Integer> pq =  new PriorityQueue<>();
    for(int x : ia)
        pq.offer(x); //将数组ia中的元素插入到优先队列中
    while(!pq.isEmpty()){
        System.out.print(pq.poll()+"  ");
    }
}