void main() {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 47);
    Arrays.fill(a2, 47);
    IO.println(a1.equals(a2));          // 输出 false
    IO.println(Arrays.equals(a1, a2));  // 输出true
    a2[3] = 11;
    IO.println(Arrays.equals(a1, a2));  // 输出 false
    String[] s1 = new String[5];
    Arrays.fill(s1, "Hi");
    String[] s2 = {"Hi", "Hi", "Hi", "Hi", "Hi"};
    IO.println(Arrays.equals(s1, s2));   // 输出 true
}
