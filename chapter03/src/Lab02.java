void main() {
    Scanner input = new Scanner(System.in);
    double score = 0;
    String grade = "";
    IO.print("请输入你的成绩：");
    score = input.nextDouble();
    if (score < 0 || score > 100) {
        IO.println("你输入的成绩不合法！");
    } else if (score < 60) {
        grade = "不及格";
    } else if (score < 70) {
        grade = "及格";
    } else if (score < 80) {
        grade = "中等";
    } else if (score < 90) {
        grade = "良好";
    } else {
        grade = "优秀";
    }
    IO.println("你的成绩是：" + grade);
}