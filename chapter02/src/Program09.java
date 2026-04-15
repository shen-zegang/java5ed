void main() {
	Scanner sc = new Scanner(System.in);
    IO.print("请输入年利率(5)：");
	double annualRate = sc.nextDouble();
	double monthlyRate = annualRate / 1200;  // 计算月利率
    IO.print("请输入贷款总额：");
	double loanAmount = sc.nextDouble();
    IO.print("请输入年数：");
	double numberOfYear = sc.nextDouble();
	    
	double monthlyPayment = loanAmount*monthlyRate / (1 - 1/Math.pow(1 + monthlyRate,numberOfYear * 12));
	double totalPayment = monthlyPayment*12*numberOfYear;
	System.out.printf("月支付额：%.2f%n",monthlyPayment);
	System.out.printf("总支付额：%.2f%n",totalPayment);
}
