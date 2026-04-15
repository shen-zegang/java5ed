void main() {
	int count = 0;
	int number = 2;
	boolean isPrime;
	//IO.println("前50个素数如下：");
	while(count < 50) {
		isPrime = true;
		for(int divisor = 2; divisor * divisor <= number; divisor++) {
			if(number%divisor==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			count ++;
			if(count%10==0)
				System.out.printf("%5d%n",number);
			else
				System.out.printf("%5d",number);
		}
		number ++;
	}
}
