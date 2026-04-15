void main() {
    Set<Integer> ts = new TreeSet<>(new Comparator<Integer>(){
        public int compare(Integer o1,Integer o2){
            return o2.compareTo(o1);
        }
    });
    Integer[] s = new Integer[]{87,23,-15,99,50};

    for (var i = 0; i < s.length; i++){
        ts.add(s[i]);
    }
    IO.println(ts);
}

