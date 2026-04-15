void main() {
	int magic = (int)(Math.random()*101)+100;
	Scanner input = new Scanner(System.in);
	IO.print("请输入你猜的数：");
	int guess = input.nextInt();
	while(guess!=magic){
		if(guess > magic){
			IO.println("错误！太大，请重猜");
		}else{
			IO.println("错误！太小，请重猜");
		}
		guess = input.nextInt();
	}
    IO.println("恭喜你，答对了！\n该数是"+magic);
}
