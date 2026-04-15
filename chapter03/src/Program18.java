void main(String args[]) {
    for (int n = 1; n <= 1000; n++) {
        int sum = 1;
        for (int k = 2; k < n; k++) {
            if (n % k == 0)
                sum = sum + k;
        }
        if (sum == n)
            IO.println(n);
        else
            continue;
    }
}

