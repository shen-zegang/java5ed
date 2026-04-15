void main() {
    String[] ss = {"中国", "英国","法国","美国","俄罗斯"};
    for(var i = 0;i<ss.length;i++){
        IO.print(ss[i]+" ");
    }
    IO.println();
    Arrays.sort(ss);      // 对数组ss排序
    for(var s : ss){
        IO.print(s + " ");
    }

}