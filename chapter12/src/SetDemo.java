void main() {
    var words = new HashSet<String>();
    words.add("one");
    words.add("two");
    words.add("three");
    words.add("four");
    words.add("one");

    for(var w : words){
        System.out.print(w + "  ");     // 输出：four one  two  three
    }
}