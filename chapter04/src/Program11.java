public static boolean isPrime(int n) {
    for (int divisor = 2; divisor * divisor <= n; divisor++) {
        if (n % divisor == 0)
            return false;
    }
    return true;
}

public static boolean isPalindrome(int n) {
    String s = String.valueOf(n);
    int low = 0;
    int heigh = s.length() - 1;
    while (low < heigh) {
        if (s.charAt(low) != s.charAt(heigh)) {
            return false; // 不是回文
        }
        low++;
        heigh--;
    }
    return true;
}

void main() {
    int count = 0;
    int n = 2;
    do {
        if (isPrime(n) && isPalindrome(n)) {
            count++;
            if (count % 10 == 0) {
                System.out.printf("%5s%n", n);
            } else {
                System.out.printf("%5s", n);
            }
        }
        n++;
    } while (count < 20);
}

