void main() {
    String[] s = {"China", "England","France","America","Russia",};
    var ts = new TreeSet<String> ();
    for(var i = 0; i < s.length; i ++){
        ts.add(s[i]);
    }
    IO.println(ts);    // 按自然顺序输出

    ts = new TreeSet< String >(
            new Comparator<String>(){
                @Override
                public int compare(String a,String b){
                    return b.compareTo(a);
                }
            });

    for(var i = 0; i < s.length; i ++){
        ts.add(s[i]);
    }
    IO.println(ts);

}