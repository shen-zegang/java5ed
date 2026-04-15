void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Input a number:");
    int n = sc.nextInt();
    do {
        for (int k = 2; k <= n; k++) {
            if (n % k == 0) {
                IO.println(k);
                n = n / k;
                break;
            }
        }
    } while (n != 1);
}

