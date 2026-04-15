void main() {
    int p[] = new int[13];
    for (int j = 0; j < p.length; j++) {
        p[j] = j;
    }
    int n = 0;
    int k = 0;
    while (true) {
        for (int i = 1; i < p.length; i++) {
            if (p[i] != 0) {
                n = n + 1;
                if (n % 5 == 0) {
                    p[i] = 0;
                    IO.println("p[" + i + "] is deleted.");
                    k = k + 1;
                }
            }
        }
        if (k == 11) break;
    }
    for (int i = 0; i < p.length; i++)
        if (p[i] != 0)
            IO.println("The last one is:" + p[i]);
}

