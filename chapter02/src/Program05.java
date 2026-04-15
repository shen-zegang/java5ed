void main() {
	Scanner sc = new Scanner(System.in);
	IO.print("请输入今日外汇牌价：");
	double price = sc.nextDouble();
	double dollar = 10000 / price;
    IO.println("10000元兑换" + dollar + "美元");
}
