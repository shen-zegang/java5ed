void main() {
    Scanner input = new Scanner(System.in);
    IO.print("请输入百分制成绩：");
    double score = input.nextDouble();
    String grade = "";
    if (score > 100 || score < 0) {
        IO.println("输入的成绩不正确。");
        System.exit(0);      // 结束程序运行
    } else {
        int g = (int) score / 10;
        switch (g) {
            default:
                grade = "不及格";
                break;
            case 10:
            case 9:
                grade = "优秀";
                break;
            case 8:
                grade = "良好";
                break;
            case 7:
                grade = "中等";
                break;
            case 6:
                grade = "及格";
                break;
        }
    }
    IO.println("你的成绩为：" + grade);
}

