public class StringSorting implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return second.compareTo(first);
    }
}

void main() {
    String[] ss = { "this", "is", "a", "test", "string" };
    Arrays.sort(ss, new StringSorting()); // 对数组ss降序排序
    for (String s : ss)
        IO.println(s + " ");
}
