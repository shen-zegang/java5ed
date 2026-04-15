public static boolean equals(int[] list1, int[] list2) {
    for (int i = 0; i < list1.length; i++) {
        if (list1[i] != list2[i])
            return false;
    }
    return true;
}

public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {1, 2, 3, 4, 5};
    IO.println(equals(a, b));    // true
}

