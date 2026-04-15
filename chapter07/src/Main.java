import com.boda.utils.MathUtils;

void main() {

    for (int i = 2; i <= 1000; i++) {
        if(MathUtils.isPalindrome(i)&&MathUtils.isPrime(i))
        IO.println("i = " + i);
    }
}
