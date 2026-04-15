import com.boda.xy.IntSequence;
import com.boda.xy.RandomIntSequence;

public static double average(IntSequence seq, int n) {
    double sum = 0.0;
    int m = n;
    while (seq.hasNext() && m > 0) {
        sum = sum + seq.next();
        m = m - 1;
    }
    return sum / n;
}

void main() {
    RandomIntSequence rs = new RandomIntSequence();
    double value = average(rs, 10);
    IO.println(value);
}