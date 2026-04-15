void main() {
	Scanner input = new Scanner(System.in);
	int number1 = 10 + (int) (Math.random() * 90);
	int number2 = 10 + (int) (Math.random() * 90);
	int operator = (int) (Math.random() * 2);
	int result, answer;
	if (operator == 0) {
		result = number1 + number2;
		IO.print(number1 + "+" + number2 + "=");
	} else {
		if (number1 < number2) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}
		result = number1 - number2;
		IO.print(number1 + "-" + number2 + "=");
	}
	answer = input.nextInt();
	if (answer == result) {
		IO.print("恭喜你，回答正确！");
	} else {
		IO.print("对不起，回答错误！");
	}
}
