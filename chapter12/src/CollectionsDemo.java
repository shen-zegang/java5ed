void main() {
    Integer [] num = {30, -20, 99, 50, 0, 8};
    List<Integer> list = Arrays.asList(num);
    IO.println(list);        // 按插入顺序输出

    Collections.reverse(list);
    IO.println(list);      // 按排序后顺序输出

 //   int n = Collections.binarySearch(list, 20);
//    IO.println(n);
//    Collections.shuffle(list,new Random());
//   IO.println(list);      // 打乱顺序后再输出
//    Integer max,min;
//    max = Collections.max(list);
//    min = Collections.min(list);
//    IO.println(max);
//    IO.println(min);
}