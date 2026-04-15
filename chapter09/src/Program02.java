public interface IntSequence {
    public abstract boolean hasNext();
    public abstract int next();
}

public class RandomIntSequence implements IntSequence {
    private int n;
    public boolean hasNext() {
        n = 10 + (int) (Math.random() * 90);
        return true;
    }
    public int next() {
        return n;
    }
}

void main() {
    RandomIntSequence rs = new RandomIntSequence();
    IO.println(rs.hasNext());
    IO.println(rs.next());
}