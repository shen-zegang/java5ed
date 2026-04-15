package com.boda.xy;
public class SequenceTest {
	public static double average(IntSequence seq, int n) {
		double sum = 0.0;
		int m = n;
		while (seq.hasNext() && m > 0) {
			sum = sum + seq.next();
			m = m - 1;
		}
		return sum / n;
	}

	public static void main(String[] args) {
		RandomIntSequence rs = new RandomIntSequence();
		double value = average(rs, 10);
		IO.println(value);
	}
}
