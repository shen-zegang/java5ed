void main() {
    Scanner input = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int number1, number2;
    while (count < 10) {
        int operator = (int) (Math.random() * 2);
        number1 = 10 + (int) (Math.random() * 90);
        number2 = 10 + (int) (Math.random() * 90);
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
            IO.println("恭喜你，回答正确！");
            sum = sum + 20;
        } else {
            IO.println("对不起，回答错误！");
        }
        count++;
    }
    IO.print("你的总成绩是：" + sum);
}