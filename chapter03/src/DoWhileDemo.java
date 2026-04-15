void main() {
	double sum = 0,avg = 0;
	int n = 0;
	double number;
	Scanner input = new Scanner(System.in);
	do{
		IO.print("请输入一个数（输0结束）:");
		number = input.nextDouble();
		if(number != 0){
		   sum = sum + number;
		   n = n + 1;
		}
	}while(number!=0);
	avg = sum / n;
	IO.println("sum = "+ sum);
	IO.println("avg = "+ avg);
}
