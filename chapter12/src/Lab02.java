void main() {
    ArrayList<String> names = new ArrayList<>();
    names.add("张");
    names.add("王");
    names.add("李");
    names.add("赵");
    // （1）通过索引循环访问。
    for (int i = 0; i < names.size(); i++) {
        String name = names.get(i);
        name = name.toUpperCase();
        names.set(i, name);
    }
    IO.println(names);
    //（2）使用迭代器。
    Iterator<String> it = names.iterator();
    ArrayList<String> names2 = new ArrayList<>();
    while (it.hasNext()) {
        String name = (String) it.next();
        name = name.toUpperCase();
        it.remove();
        names2.add(name);
    }
    names.addAll(names2);
    IO.println(names);
}
