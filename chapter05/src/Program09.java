void main() {
    int n[] = new int[100];
    for (int j = 0; j < n.length; j++) {
        n[j] = j;
    }

    for (int i = 2; i < n.length; i++) {
        for (int j = 0; j < 100; j++)
            if (n[j] % i == 0) {
                if (j == i)
                    continue;
                else
                    n[j] = 0;
            }
    }
    for (int i = 2; i < n.length; i++) {
        if (n[i] != 0)
            IO.print("  " + n[i]);
    }
}
