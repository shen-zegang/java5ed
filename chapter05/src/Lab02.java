void main() {
    int[] source = {25, 12, 7, 90, 78};
    int[] target = new int[source.length];
    //（1）用for循环一个一个元素复制。
    for (int i = 0; i < source.length; i++) {
        target[i] = source[i];
    }
    // （2）使用System类的arraycopy()方法复制。
    System.arraycopy(source, 0, target, 0, source.length);
    // （3）用Arrays类的copyOf()或copyOfRange()方法。
    //target = Arrays.copyOf(source,source.length);
    target = Arrays.copyOfRange(source, 0, source.length);
    for (int n : target
    ) {
        IO.println(n);
    }
}
